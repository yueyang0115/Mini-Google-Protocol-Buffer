package hwk1.testing.simplearray;

import java.lang.reflect.*;
import java.util.*;
import org.json.*;
import edu.duke.ece651.hwk1tester.*;

public class ECE651_Hwk1_Tester implements Hwk1Tester {
  private Class<?> class_Test;
  private Field field_arr_of_class_Test;
  private Method method_getfor_field_arr_of_class_Test;
  private Method method_setfor_field_arr_of_class_Test;
  private Method method_addfor_field_arr_of_class_Test;
  private Method method_numfor_field_arr_of_class_Test;
  private Class<?> class__Deserializer;
  private Method deser_method_for_Test;
  private Method tojson_method_for_Test;
  public ECE651_Hwk1_Tester() throws Exception{
    class_Test = Class.forName("hwk1.testing.simplearray.Test");
    class__Deserializer = Class.forName("hwk1.testing.simplearray.Deserializer");
    field_arr_of_class_Test = class_Test.getDeclaredField("arr");
    method_getfor_field_arr_of_class_Test = class_Test.getDeclaredMethod("getArr", Integer.TYPE);
    method_setfor_field_arr_of_class_Test = class_Test.getDeclaredMethod("setArr", Integer.TYPE,Integer.TYPE);
    method_numfor_field_arr_of_class_Test = class_Test.getDeclaredMethod("numArr");
    method_addfor_field_arr_of_class_Test = class_Test.getDeclaredMethod("addArr", Integer.TYPE);
    tojson_method_for_Test = class_Test.getDeclaredMethod("toJSON");
    deser_method_for_Test = class__Deserializer.getDeclaredMethod("readTest", JSONObject.class);
  }
  public void checkTypes() throws Exception {
if(field_arr_of_class_Test.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field arr to be private, but was "+Modifier.toString(field_arr_of_class_Test.getModifiers()));
}
if(!method_addfor_field_arr_of_class_Test.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_arr_of_class_Test+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_arr_of_class_Test.getReturnType());
}
if(method_addfor_field_arr_of_class_Test.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_arr_of_class_Test+" to be public , but was "+Modifier.toString(method_addfor_field_arr_of_class_Test.getModifiers()));
}
if(!method_numfor_field_arr_of_class_Test.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_arr_of_class_Test+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_arr_of_class_Test.getReturnType());
}
if(method_numfor_field_arr_of_class_Test.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_arr_of_class_Test+" to be public , but was "+Modifier.toString(method_numfor_field_arr_of_class_Test.getModifiers()));
}
if(!method_getfor_field_arr_of_class_Test.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_arr_of_class_Test+" to have return type "+Integer.TYPE+" but was actually " +method_getfor_field_arr_of_class_Test.getReturnType());
}
if(method_getfor_field_arr_of_class_Test.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_arr_of_class_Test+" to be public , but was "+Modifier.toString(method_getfor_field_arr_of_class_Test.getModifiers()));
}
if(!method_setfor_field_arr_of_class_Test.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_arr_of_class_Test+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_arr_of_class_Test.getReturnType());
}
if(method_setfor_field_arr_of_class_Test.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_arr_of_class_Test+" to be public , but was "+Modifier.toString(method_setfor_field_arr_of_class_Test.getModifiers()));
}
  }
  public void test_Test_0() throws Exception {
    System.out.println("Starting test case: 0 for class Test");
    RunAll.logln("Starting test case: 0 for Test");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_1 = class_Test.getDeclaredConstructor().newInstance();
ArrayList<Object> v_2 =  new ArrayList<Object>();
ArrayList<Object> v_3 =  new ArrayList<Object>();
int v_6 = 0;
for (Object v_5: v_3) {
method_addfor_field_arr_of_class_Test.invoke(v_1, v_5);
if ( !method_getfor_field_arr_of_class_Test.invoke(v_1, v_6).equals(v_5)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_6++;
int v_4 = (Integer)method_numfor_field_arr_of_class_Test.invoke(v_1);
if (v_4 != v_6) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Test.invoke(v_1);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Test.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_1);
    RunAll.logln("Finished test case: 0 for Test");
  }
  public void test_Test_1() throws Exception {
    System.out.println("Starting test case: 1 for class Test");
    RunAll.logln("Starting test case: 1 for Test");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_7 = class_Test.getDeclaredConstructor().newInstance();
ArrayList<Object> v_8 =  new ArrayList<Object>();
v_8.add(431529176);
v_8.add(1761283695);
ArrayList<Object> v_9 =  new ArrayList<Object>();
v_9.add(892128508);
int v_12 = 0;
for (Object v_11: v_9) {
method_addfor_field_arr_of_class_Test.invoke(v_7, v_11);
if ( !method_getfor_field_arr_of_class_Test.invoke(v_7, v_12).equals(v_11)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_12++;
int v_10 = (Integer)method_numfor_field_arr_of_class_Test.invoke(v_7);
if (v_10 != v_12) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Test.invoke(v_7);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Test.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_7);
    RunAll.logln("Finished test case: 1 for Test");
  }
  public void test_Test_2() throws Exception {
    System.out.println("Starting test case: 2 for class Test");
    RunAll.logln("Starting test case: 2 for Test");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_13 = class_Test.getDeclaredConstructor().newInstance();
ArrayList<Object> v_14 =  new ArrayList<Object>();
v_14.add(1260042744);
v_14.add(-423279216);
v_14.add(17850135);
ArrayList<Object> v_15 =  new ArrayList<Object>();
v_15.add(-624140595);
v_15.add(-60658084);
int v_18 = 0;
for (Object v_17: v_15) {
method_addfor_field_arr_of_class_Test.invoke(v_13, v_17);
if ( !method_getfor_field_arr_of_class_Test.invoke(v_13, v_18).equals(v_17)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_18++;
int v_16 = (Integer)method_numfor_field_arr_of_class_Test.invoke(v_13);
if (v_16 != v_18) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Test.invoke(v_13);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Test.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_13);
    RunAll.logln("Finished test case: 2 for Test");
  }
  public void runAllTests() throws Exception{
      test_Test_0();
      test_Test_1();
      test_Test_2();
  }
}
