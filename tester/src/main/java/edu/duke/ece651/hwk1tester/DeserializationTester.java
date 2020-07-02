package edu.duke.ece651.hwk1tester;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class DeserializationTester {
  private static final HashSet<Class> builtInClasses = new HashSet<Class>();
  static {
    builtInClasses.add(String.class);
    builtInClasses.add(Byte.class);
    builtInClasses.add(Character.class);
    builtInClasses.add(Integer.class);
    builtInClasses.add(Long.class);
    builtInClasses.add(Short.class);
    builtInClasses.add(Float.class);
    builtInClasses.add(Double.class);
    builtInClasses.add(Boolean.class);
    builtInClasses.add(Void.class);
  }
  private static class OMap {
    HashMap<Object, Object> forward;
    HashMap<Object, Object> reverse;

    OMap() {
      forward = new HashMap<Object, Object>();
      reverse = new HashMap<Object, Object>();
    }

    boolean map(Object from, Object to) {
      Object to_from_map = forward.get(from);
      Object from_from_map = reverse.get(to);
      // already have this mapping
      if (to_from_map == to && from_from_map == from) {
        return true;
      }
      if (to_from_map != null || from_from_map != null) {
        // one of these isn't null-->something has been mapped before.
        // but not to each other.
        throw new IllegalStateException(
            "Deserialization was not correct: object reference mismatch " + from + " / " + to);
      }
      forward.put(from, to);
      reverse.put(to, from);
      return false;
    }

    public String toString(){
      String sep="";
      StringBuilder ans = new StringBuilder("{");
      for (Object o : forward.keySet()){
        ans.append(sep);
        sep=", ";
        ans.append(o);
        ans.append("<->");
        ans.append(forward.get(o));
      }
      ans.append("}");
      return ans.toString();
    }
  }

  public static void sameStructure(Object o1, Object o2) {
    sameStructure(o1, o2, new OMap());
  }
  private static void checkVals(Class<?> ty, Object v1, Object v2, OMap m){
    RunAll.logln("Checking for same values for: ");
    RunAll.logln("  " + v1 + "("+v1.getClass().getName()+")");
    RunAll.logln("  " + v2 + "("+v1.getClass().getName()+")");
    RunAll.logln("  with object map: " + m);
    if (ty.isPrimitive() || builtInClasses.contains(ty)) {
      RunAll.logln("   -> built in type (primitive or string): " + ty.getName());
      if (v1.equals(v2)){
        return;
      }
      RunAll.logln("*** Values mismatch ***");
      RunAll.logln("  original: " + v1);
      RunAll.logln("  deserlzd: " + v2);
      throw new IllegalStateException("Value mismatch: " + v1 + " / " + v2);
    }
    if(ty.isArray()){
      RunAll.logln("  -> arrays ");
      int len1 = Array.getLength(v1);
      int len2 = Array.getLength(v2);
      if (len1 != len2) {
        RunAll.logln("*** Lengths mismatch ***");
        RunAll.logln("  original: " + len1);
        RunAll.logln("  deserlzd: " + len2);
        throw new IllegalStateException("Length mismatch on arrays: " + v1 + " / " + v2);
      }
      for (int i = 0; i < len1; i++) {
        checkVals(ty.getComponentType(), Array.get(v1,i), Array.get(v2,i), m);
      }
      return;
    }
    if (v1 instanceof Collection<?>) {
      RunAll.logln("  -> arrays, implemented with some Collection ");
      if (!(v2 instanceof Collection<?>)) {
        RunAll.logln("  ** deserialized value is not a Collection (?!?) ");
        throw new IllegalStateException("Value type mismatch "+ v1 + " is a collection, but " + v2 + " is not");
      }
      Collection<?> c1 = (Collection<?>) v1;
      Collection<?> c2 = (Collection<?>) v2;
      ArrayList<Object> al1 = new ArrayList<Object>(c1);
      ArrayList<Object> al2 = new ArrayList<Object>(c2);
      if (al1.size() != al2.size()) {
        RunAll.logln("*** Lengths mismatch ***");
        RunAll.logln("  original: " + al1.size());
        RunAll.logln("  deserlzd: " + al2.size());
        throw new IllegalStateException("Length mismatch on array type: " + v1 + " / " + v2);
      }
      for (int i = 0; i < al1.size(); i++) {
        checkVals(al1.get(i).getClass(), al1.get(i), al2.get(i), m);
      }
      return;
    }
    RunAll.logln("  -> objects.  Check recursively ");
    sameStructure(v1, v2, m);
  }
  private static void sameStructure(Object o1, Object o2, OMap m) {
    RunAll.logln("Checking for same structure for: ");
    RunAll.logln("  " + o1 + " ("+o1.getClass().getName()+")");
    RunAll.logln("  " + o2 + " ("+o2.getClass().getName()+")");
    RunAll.logln("  with object map: " + m);
    if (!o1.getClass().equals(o2.getClass())){
      RunAll.logln("***Class mismatch!***");
      throw new IllegalStateException("Classes mismatch on " + o1 + "(" + o1.getClass().getName() + ") and " + o2 + "("
          + o2.getClass().getName() + ")");
    }
    if (m.map(o1, o2)) {
      // already saw these were the same
      RunAll.logln(" -> already identified as same object");
      return ;
    }
    for(Field f: o1.getClass().getDeclaredFields()){
      RunAll.logln(" -> Examine field " + f.getName());
      f.setAccessible(true);
      Class<?> ftype = f.getType();
      Object v1 = null;
      Object v2 = null;
      try{
        v1 = f.get(o1);
        v2 = f.get(o2);
      }
      catch(Exception e) {
        RunAll.logln("****I Can't read the fields of this object!");
        RunAll.logStackTrace(e);
        throw new RuntimeException("Cannot read values from field " +f +" of " + o1 + " / " + o2);
      }
      checkVals(ftype, v1, v2, m);
    }
  }
}
