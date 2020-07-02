package hwk1.testing.prims;

import java.lang.reflect.*;
import java.util.*;
import org.json.*;
import edu.duke.ece651.hwk1tester.*;

public class ECE651_Hwk1_Tester implements Hwk1Tester {
  private Class<?> class_Prims;
  private Field field_x_of_class_Prims;
  private Method method_getfor_field_x_of_class_Prims;
  private Method method_setfor_field_x_of_class_Prims;
  private Field field_isAwesome_of_class_Prims;
  private Method method_getfor_field_isAwesome_of_class_Prims;
  private Method method_setfor_field_isAwesome_of_class_Prims;
  private Field field_ateBits_of_class_Prims;
  private Method method_getfor_field_ateBits_of_class_Prims;
  private Method method_setfor_field_ateBits_of_class_Prims;
  private Field field_boat_of_class_Prims;
  private Method method_getfor_field_boat_of_class_Prims;
  private Method method_setfor_field_boat_of_class_Prims;
  private Field field_trouble_of_class_Prims;
  private Method method_getfor_field_trouble_of_class_Prims;
  private Method method_setfor_field_trouble_of_class_Prims;
  private Field field_isntPronouncedLikeCare_of_class_Prims;
  private Method method_getfor_field_isntPronouncedLikeCare_of_class_Prims;
  private Method method_setfor_field_isntPronouncedLikeCare_of_class_Prims;
  private Field field_waysAway_of_class_Prims;
  private Method method_getfor_field_waysAway_of_class_Prims;
  private Method method_setfor_field_waysAway_of_class_Prims;
  private Field field_stackOfPancakes_of_class_Prims;
  private Method method_getfor_field_stackOfPancakes_of_class_Prims;
  private Method method_setfor_field_stackOfPancakes_of_class_Prims;
  private Class<?> class__Deserializer;
  private Method deser_method_for_Prims;
  private Method tojson_method_for_Prims;
  public ECE651_Hwk1_Tester() throws Exception{
    class_Prims = Class.forName("hwk1.testing.prims.Prims");
    class__Deserializer = Class.forName("hwk1.testing.prims.Deserializer");
    field_x_of_class_Prims = class_Prims.getDeclaredField("x");
    method_getfor_field_x_of_class_Prims = class_Prims.getDeclaredMethod("getX");
    method_setfor_field_x_of_class_Prims = class_Prims.getDeclaredMethod("setX", Integer.TYPE);
    field_isAwesome_of_class_Prims = class_Prims.getDeclaredField("isAwesome");
    method_getfor_field_isAwesome_of_class_Prims = class_Prims.getDeclaredMethod("getIsAwesome");
    method_setfor_field_isAwesome_of_class_Prims = class_Prims.getDeclaredMethod("setIsAwesome", Boolean.TYPE);
    field_ateBits_of_class_Prims = class_Prims.getDeclaredField("ateBits");
    method_getfor_field_ateBits_of_class_Prims = class_Prims.getDeclaredMethod("getAteBits");
    method_setfor_field_ateBits_of_class_Prims = class_Prims.getDeclaredMethod("setAteBits", Byte.TYPE);
    field_boat_of_class_Prims = class_Prims.getDeclaredField("boat");
    method_getfor_field_boat_of_class_Prims = class_Prims.getDeclaredMethod("getBoat");
    method_setfor_field_boat_of_class_Prims = class_Prims.getDeclaredMethod("setBoat", Float.TYPE);
    field_trouble_of_class_Prims = class_Prims.getDeclaredField("trouble");
    method_getfor_field_trouble_of_class_Prims = class_Prims.getDeclaredMethod("getTrouble");
    method_setfor_field_trouble_of_class_Prims = class_Prims.getDeclaredMethod("setTrouble", Double.TYPE);
    field_isntPronouncedLikeCare_of_class_Prims = class_Prims.getDeclaredField("isntPronouncedLikeCare");
    method_getfor_field_isntPronouncedLikeCare_of_class_Prims = class_Prims.getDeclaredMethod("getIsntPronouncedLikeCare");
    method_setfor_field_isntPronouncedLikeCare_of_class_Prims = class_Prims.getDeclaredMethod("setIsntPronouncedLikeCare", Character.TYPE);
    field_waysAway_of_class_Prims = class_Prims.getDeclaredField("waysAway");
    method_getfor_field_waysAway_of_class_Prims = class_Prims.getDeclaredMethod("getWaysAway");
    method_setfor_field_waysAway_of_class_Prims = class_Prims.getDeclaredMethod("setWaysAway", Long.TYPE);
    field_stackOfPancakes_of_class_Prims = class_Prims.getDeclaredField("stackOfPancakes");
    method_getfor_field_stackOfPancakes_of_class_Prims = class_Prims.getDeclaredMethod("getStackOfPancakes");
    method_setfor_field_stackOfPancakes_of_class_Prims = class_Prims.getDeclaredMethod("setStackOfPancakes", Short.TYPE);
    tojson_method_for_Prims = class_Prims.getDeclaredMethod("toJSON");
    deser_method_for_Prims = class__Deserializer.getDeclaredMethod("readPrims", JSONObject.class);
  }
  public void checkTypes() throws Exception {
if(!field_x_of_class_Prims.getType().equals(Integer.TYPE)) {
  throw new IllegalStateException("Field x does not have the right type");
}
if(field_x_of_class_Prims.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field x to be private, but was "+Modifier.toString(field_x_of_class_Prims.getModifiers()));
}
if(!method_getfor_field_x_of_class_Prims.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_x_of_class_Prims+" to have return type "+Integer.TYPE+" but was actually " +method_getfor_field_x_of_class_Prims.getReturnType());
}
if(method_getfor_field_x_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_x_of_class_Prims+" to be public , but was "+Modifier.toString(method_getfor_field_x_of_class_Prims.getModifiers()));
}
if(!method_setfor_field_x_of_class_Prims.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_x_of_class_Prims+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_x_of_class_Prims.getReturnType());
}
if(method_setfor_field_x_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_x_of_class_Prims+" to be public , but was "+Modifier.toString(method_setfor_field_x_of_class_Prims.getModifiers()));
}
if(!field_isAwesome_of_class_Prims.getType().equals(Boolean.TYPE)) {
  throw new IllegalStateException("Field isAwesome does not have the right type");
}
if(field_isAwesome_of_class_Prims.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field isAwesome to be private, but was "+Modifier.toString(field_isAwesome_of_class_Prims.getModifiers()));
}
if(!method_getfor_field_isAwesome_of_class_Prims.getReturnType().equals(Boolean.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_isAwesome_of_class_Prims+" to have return type "+Boolean.TYPE+" but was actually " +method_getfor_field_isAwesome_of_class_Prims.getReturnType());
}
if(method_getfor_field_isAwesome_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_isAwesome_of_class_Prims+" to be public , but was "+Modifier.toString(method_getfor_field_isAwesome_of_class_Prims.getModifiers()));
}
if(!method_setfor_field_isAwesome_of_class_Prims.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_isAwesome_of_class_Prims+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_isAwesome_of_class_Prims.getReturnType());
}
if(method_setfor_field_isAwesome_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_isAwesome_of_class_Prims+" to be public , but was "+Modifier.toString(method_setfor_field_isAwesome_of_class_Prims.getModifiers()));
}
if(!field_ateBits_of_class_Prims.getType().equals(Byte.TYPE)) {
  throw new IllegalStateException("Field ateBits does not have the right type");
}
if(field_ateBits_of_class_Prims.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field ateBits to be private, but was "+Modifier.toString(field_ateBits_of_class_Prims.getModifiers()));
}
if(!method_getfor_field_ateBits_of_class_Prims.getReturnType().equals(Byte.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_ateBits_of_class_Prims+" to have return type "+Byte.TYPE+" but was actually " +method_getfor_field_ateBits_of_class_Prims.getReturnType());
}
if(method_getfor_field_ateBits_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_ateBits_of_class_Prims+" to be public , but was "+Modifier.toString(method_getfor_field_ateBits_of_class_Prims.getModifiers()));
}
if(!method_setfor_field_ateBits_of_class_Prims.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_ateBits_of_class_Prims+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_ateBits_of_class_Prims.getReturnType());
}
if(method_setfor_field_ateBits_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_ateBits_of_class_Prims+" to be public , but was "+Modifier.toString(method_setfor_field_ateBits_of_class_Prims.getModifiers()));
}
if(!field_boat_of_class_Prims.getType().equals(Float.TYPE)) {
  throw new IllegalStateException("Field boat does not have the right type");
}
if(field_boat_of_class_Prims.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field boat to be private, but was "+Modifier.toString(field_boat_of_class_Prims.getModifiers()));
}
if(!method_getfor_field_boat_of_class_Prims.getReturnType().equals(Float.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_boat_of_class_Prims+" to have return type "+Float.TYPE+" but was actually " +method_getfor_field_boat_of_class_Prims.getReturnType());
}
if(method_getfor_field_boat_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_boat_of_class_Prims+" to be public , but was "+Modifier.toString(method_getfor_field_boat_of_class_Prims.getModifiers()));
}
if(!method_setfor_field_boat_of_class_Prims.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_boat_of_class_Prims+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_boat_of_class_Prims.getReturnType());
}
if(method_setfor_field_boat_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_boat_of_class_Prims+" to be public , but was "+Modifier.toString(method_setfor_field_boat_of_class_Prims.getModifiers()));
}
if(!field_trouble_of_class_Prims.getType().equals(Double.TYPE)) {
  throw new IllegalStateException("Field trouble does not have the right type");
}
if(field_trouble_of_class_Prims.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field trouble to be private, but was "+Modifier.toString(field_trouble_of_class_Prims.getModifiers()));
}
if(!method_getfor_field_trouble_of_class_Prims.getReturnType().equals(Double.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_trouble_of_class_Prims+" to have return type "+Double.TYPE+" but was actually " +method_getfor_field_trouble_of_class_Prims.getReturnType());
}
if(method_getfor_field_trouble_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_trouble_of_class_Prims+" to be public , but was "+Modifier.toString(method_getfor_field_trouble_of_class_Prims.getModifiers()));
}
if(!method_setfor_field_trouble_of_class_Prims.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_trouble_of_class_Prims+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_trouble_of_class_Prims.getReturnType());
}
if(method_setfor_field_trouble_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_trouble_of_class_Prims+" to be public , but was "+Modifier.toString(method_setfor_field_trouble_of_class_Prims.getModifiers()));
}
if(!field_isntPronouncedLikeCare_of_class_Prims.getType().equals(Character.TYPE)) {
  throw new IllegalStateException("Field isntPronouncedLikeCare does not have the right type");
}
if(field_isntPronouncedLikeCare_of_class_Prims.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field isntPronouncedLikeCare to be private, but was "+Modifier.toString(field_isntPronouncedLikeCare_of_class_Prims.getModifiers()));
}
if(!method_getfor_field_isntPronouncedLikeCare_of_class_Prims.getReturnType().equals(Character.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_isntPronouncedLikeCare_of_class_Prims+" to have return type "+Character.TYPE+" but was actually " +method_getfor_field_isntPronouncedLikeCare_of_class_Prims.getReturnType());
}
if(method_getfor_field_isntPronouncedLikeCare_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_isntPronouncedLikeCare_of_class_Prims+" to be public , but was "+Modifier.toString(method_getfor_field_isntPronouncedLikeCare_of_class_Prims.getModifiers()));
}
if(!method_setfor_field_isntPronouncedLikeCare_of_class_Prims.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_isntPronouncedLikeCare_of_class_Prims+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_isntPronouncedLikeCare_of_class_Prims.getReturnType());
}
if(method_setfor_field_isntPronouncedLikeCare_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_isntPronouncedLikeCare_of_class_Prims+" to be public , but was "+Modifier.toString(method_setfor_field_isntPronouncedLikeCare_of_class_Prims.getModifiers()));
}
if(!field_waysAway_of_class_Prims.getType().equals(Long.TYPE)) {
  throw new IllegalStateException("Field waysAway does not have the right type");
}
if(field_waysAway_of_class_Prims.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field waysAway to be private, but was "+Modifier.toString(field_waysAway_of_class_Prims.getModifiers()));
}
if(!method_getfor_field_waysAway_of_class_Prims.getReturnType().equals(Long.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_waysAway_of_class_Prims+" to have return type "+Long.TYPE+" but was actually " +method_getfor_field_waysAway_of_class_Prims.getReturnType());
}
if(method_getfor_field_waysAway_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_waysAway_of_class_Prims+" to be public , but was "+Modifier.toString(method_getfor_field_waysAway_of_class_Prims.getModifiers()));
}
if(!method_setfor_field_waysAway_of_class_Prims.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_waysAway_of_class_Prims+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_waysAway_of_class_Prims.getReturnType());
}
if(method_setfor_field_waysAway_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_waysAway_of_class_Prims+" to be public , but was "+Modifier.toString(method_setfor_field_waysAway_of_class_Prims.getModifiers()));
}
if(!field_stackOfPancakes_of_class_Prims.getType().equals(Short.TYPE)) {
  throw new IllegalStateException("Field stackOfPancakes does not have the right type");
}
if(field_stackOfPancakes_of_class_Prims.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field stackOfPancakes to be private, but was "+Modifier.toString(field_stackOfPancakes_of_class_Prims.getModifiers()));
}
if(!method_getfor_field_stackOfPancakes_of_class_Prims.getReturnType().equals(Short.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_stackOfPancakes_of_class_Prims+" to have return type "+Short.TYPE+" but was actually " +method_getfor_field_stackOfPancakes_of_class_Prims.getReturnType());
}
if(method_getfor_field_stackOfPancakes_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_stackOfPancakes_of_class_Prims+" to be public , but was "+Modifier.toString(method_getfor_field_stackOfPancakes_of_class_Prims.getModifiers()));
}
if(!method_setfor_field_stackOfPancakes_of_class_Prims.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_stackOfPancakes_of_class_Prims+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_stackOfPancakes_of_class_Prims.getReturnType());
}
if(method_setfor_field_stackOfPancakes_of_class_Prims.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_stackOfPancakes_of_class_Prims+" to be public , but was "+Modifier.toString(method_setfor_field_stackOfPancakes_of_class_Prims.getModifiers()));
}
  }
  public void test_Prims_0() throws Exception {
    System.out.println("Starting test case: 0 for class Prims");
    RunAll.logln("Starting test case: 0 for Prims");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_1 = class_Prims.getDeclaredConstructor().newInstance();
  method_setfor_field_x_of_class_Prims.invoke(v_1,-723955400);
  if(!method_getfor_field_x_of_class_Prims.invoke(v_1).equals(-723955400)) {
    throw new UnsupportedOperationException("get/set for field x did not work correctly");
  }
  method_setfor_field_isAwesome_of_class_Prims.invoke(v_1,true);
  if(!method_getfor_field_isAwesome_of_class_Prims.invoke(v_1).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isAwesome did not work correctly");
  }
  method_setfor_field_ateBits_of_class_Prims.invoke(v_1,(byte)39);
  if(!method_getfor_field_ateBits_of_class_Prims.invoke(v_1).equals((byte)39)) {
    throw new UnsupportedOperationException("get/set for field ateBits did not work correctly");
  }
  method_setfor_field_boat_of_class_Prims.invoke(v_1,0.1170066f);
  if(!method_getfor_field_boat_of_class_Prims.invoke(v_1).equals(0.1170066f)) {
    throw new UnsupportedOperationException("get/set for field boat did not work correctly");
  }
  method_setfor_field_trouble_of_class_Prims.invoke(v_1,(double)0.3332183994766498);
  if(!method_getfor_field_trouble_of_class_Prims.invoke(v_1).equals((double)0.3332183994766498)) {
    throw new UnsupportedOperationException("get/set for field trouble did not work correctly");
  }
  method_setfor_field_isntPronouncedLikeCare_of_class_Prims.invoke(v_1,'c');
  if(!method_getfor_field_isntPronouncedLikeCare_of_class_Prims.invoke(v_1).equals('c')) {
    throw new UnsupportedOperationException("get/set for field isntPronouncedLikeCare did not work correctly");
  }
  method_setfor_field_waysAway_of_class_Prims.invoke(v_1,-2228689144322150137L);
  if(!method_getfor_field_waysAway_of_class_Prims.invoke(v_1).equals(-2228689144322150137L)) {
    throw new UnsupportedOperationException("get/set for field waysAway did not work correctly");
  }
  method_setfor_field_stackOfPancakes_of_class_Prims.invoke(v_1,(short)5766);
  if(!method_getfor_field_stackOfPancakes_of_class_Prims.invoke(v_1).equals((short)5766)) {
    throw new UnsupportedOperationException("get/set for field stackOfPancakes did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Prims.invoke(v_1);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Prims.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_1);
    RunAll.logln("Finished test case: 0 for Prims");
  }
  public void test_Prims_1() throws Exception {
    System.out.println("Starting test case: 1 for class Prims");
    RunAll.logln("Starting test case: 1 for Prims");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_2 = class_Prims.getDeclaredConstructor().newInstance();
  method_setfor_field_x_of_class_Prims.invoke(v_2,431529176);
  if(!method_getfor_field_x_of_class_Prims.invoke(v_2).equals(431529176)) {
    throw new UnsupportedOperationException("get/set for field x did not work correctly");
  }
  method_setfor_field_isAwesome_of_class_Prims.invoke(v_2,false);
  if(!method_getfor_field_isAwesome_of_class_Prims.invoke(v_2).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isAwesome did not work correctly");
  }
  method_setfor_field_ateBits_of_class_Prims.invoke(v_2,(byte)4);
  if(!method_getfor_field_ateBits_of_class_Prims.invoke(v_2).equals((byte)4)) {
    throw new UnsupportedOperationException("get/set for field ateBits did not work correctly");
  }
  method_setfor_field_boat_of_class_Prims.invoke(v_2,0.6588672f);
  if(!method_getfor_field_boat_of_class_Prims.invoke(v_2).equals(0.6588672f)) {
    throw new UnsupportedOperationException("get/set for field boat did not work correctly");
  }
  method_setfor_field_trouble_of_class_Prims.invoke(v_2,(double)0.006117182265761301);
  if(!method_getfor_field_trouble_of_class_Prims.invoke(v_2).equals((double)0.006117182265761301)) {
    throw new UnsupportedOperationException("get/set for field trouble did not work correctly");
  }
  method_setfor_field_isntPronouncedLikeCare_of_class_Prims.invoke(v_2,'f');
  if(!method_getfor_field_isntPronouncedLikeCare_of_class_Prims.invoke(v_2).equals('f')) {
    throw new UnsupportedOperationException("get/set for field isntPronouncedLikeCare did not work correctly");
  }
  method_setfor_field_waysAway_of_class_Prims.invoke(v_2,-974081879987450628L);
  if(!method_getfor_field_waysAway_of_class_Prims.invoke(v_2).equals(-974081879987450628L)) {
    throw new UnsupportedOperationException("get/set for field waysAway did not work correctly");
  }
  method_setfor_field_stackOfPancakes_of_class_Prims.invoke(v_2,(short)15960);
  if(!method_getfor_field_stackOfPancakes_of_class_Prims.invoke(v_2).equals((short)15960)) {
    throw new UnsupportedOperationException("get/set for field stackOfPancakes did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Prims.invoke(v_2);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Prims.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_2);
    RunAll.logln("Finished test case: 1 for Prims");
  }
  public void test_Prims_2() throws Exception {
    System.out.println("Starting test case: 2 for class Prims");
    RunAll.logln("Starting test case: 2 for Prims");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_3 = class_Prims.getDeclaredConstructor().newInstance();
  method_setfor_field_x_of_class_Prims.invoke(v_3,1260042744);
  if(!method_getfor_field_x_of_class_Prims.invoke(v_3).equals(1260042744)) {
    throw new UnsupportedOperationException("get/set for field x did not work correctly");
  }
  method_setfor_field_isAwesome_of_class_Prims.invoke(v_3,false);
  if(!method_getfor_field_isAwesome_of_class_Prims.invoke(v_3).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isAwesome did not work correctly");
  }
  method_setfor_field_ateBits_of_class_Prims.invoke(v_3,(byte)109);
  if(!method_getfor_field_ateBits_of_class_Prims.invoke(v_3).equals((byte)109)) {
    throw new UnsupportedOperationException("get/set for field ateBits did not work correctly");
  }
  method_setfor_field_boat_of_class_Prims.invoke(v_3,0.03328532f);
  if(!method_getfor_field_boat_of_class_Prims.invoke(v_3).equals(0.03328532f)) {
    throw new UnsupportedOperationException("get/set for field boat did not work correctly");
  }
  method_setfor_field_trouble_of_class_Prims.invoke(v_3,(double)0.9874208338984266);
  if(!method_getfor_field_trouble_of_class_Prims.invoke(v_3).equals((double)0.9874208338984266)) {
    throw new UnsupportedOperationException("get/set for field trouble did not work correctly");
  }
  method_setfor_field_isntPronouncedLikeCare_of_class_Prims.invoke(v_3,'a');
  if(!method_getfor_field_isntPronouncedLikeCare_of_class_Prims.invoke(v_3).equals('a')) {
    throw new UnsupportedOperationException("get/set for field isntPronouncedLikeCare did not work correctly");
  }
  method_setfor_field_waysAway_of_class_Prims.invoke(v_3,-4737903668696581858L);
  if(!method_getfor_field_waysAway_of_class_Prims.invoke(v_3).equals(-4737903668696581858L)) {
    throw new UnsupportedOperationException("get/set for field waysAway did not work correctly");
  }
  method_setfor_field_stackOfPancakes_of_class_Prims.invoke(v_3,(short)18145);
  if(!method_getfor_field_stackOfPancakes_of_class_Prims.invoke(v_3).equals((short)18145)) {
    throw new UnsupportedOperationException("get/set for field stackOfPancakes did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Prims.invoke(v_3);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Prims.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_3);
    RunAll.logln("Finished test case: 2 for Prims");
  }
  public void runAllTests() throws Exception{
      test_Prims_0();
      test_Prims_1();
      test_Prims_2();
  }
}
