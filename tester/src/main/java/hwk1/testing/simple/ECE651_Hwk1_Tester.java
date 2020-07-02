package hwk1.testing.simple;

import java.lang.reflect.*;
import java.util.*;
import org.json.*;
import edu.duke.ece651.hwk1tester.*;

public class ECE651_Hwk1_Tester implements Hwk1Tester {
  private Class<?> class_Test;
  private Field field_x_of_class_Test;
  private Method method_getfor_field_x_of_class_Test;
  private Method method_setfor_field_x_of_class_Test;
  private Class<?> class__Deserializer;
  private Method deser_method_for_Test;
  private Method tojson_method_for_Test;
  public ECE651_Hwk1_Tester() throws Exception{
    class_Test = Class.forName("hwk1.testing.simple.Test");
    class__Deserializer = Class.forName("hwk1.testing.simple.Deserializer");
    field_x_of_class_Test = class_Test.getDeclaredField("x");
    method_getfor_field_x_of_class_Test = class_Test.getDeclaredMethod("getX");
    method_setfor_field_x_of_class_Test = class_Test.getDeclaredMethod("setX", Integer.TYPE);
    tojson_method_for_Test = class_Test.getDeclaredMethod("toJSON");
    deser_method_for_Test = class__Deserializer.getDeclaredMethod("readTest", JSONObject.class);
  }
  public void checkTypes() throws Exception {
if(!field_x_of_class_Test.getType().equals(Integer.TYPE)) {
  throw new IllegalStateException("Field x does not have the right type");
}
if(field_x_of_class_Test.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field x to be private, but was "+Modifier.toString(field_x_of_class_Test.getModifiers()));
}
if(!method_getfor_field_x_of_class_Test.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_x_of_class_Test+" to have return type "+Integer.TYPE+" but was actually " +method_getfor_field_x_of_class_Test.getReturnType());
}
if(method_getfor_field_x_of_class_Test.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_x_of_class_Test+" to be public , but was "+Modifier.toString(method_getfor_field_x_of_class_Test.getModifiers()));
}
if(!method_setfor_field_x_of_class_Test.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_x_of_class_Test+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_x_of_class_Test.getReturnType());
}
if(method_setfor_field_x_of_class_Test.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_x_of_class_Test+" to be public , but was "+Modifier.toString(method_setfor_field_x_of_class_Test.getModifiers()));
}
  }
  public void test_Test_0() throws Exception {
    System.out.println("Starting test case: 0 for class Test");
    RunAll.logln("Starting test case: 0 for Test");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_1 = class_Test.getDeclaredConstructor().newInstance();
  method_setfor_field_x_of_class_Test.invoke(v_1,-723955400);
  if(!method_getfor_field_x_of_class_Test.invoke(v_1).equals(-723955400)) {
    throw new UnsupportedOperationException("get/set for field x did not work correctly");
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
  Object v_2 = class_Test.getDeclaredConstructor().newInstance();
  method_setfor_field_x_of_class_Test.invoke(v_2,431529176);
  if(!method_getfor_field_x_of_class_Test.invoke(v_2).equals(431529176)) {
    throw new UnsupportedOperationException("get/set for field x did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Test.invoke(v_2);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Test.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_2);
    RunAll.logln("Finished test case: 1 for Test");
  }
  public void test_Test_2() throws Exception {
    System.out.println("Starting test case: 2 for class Test");
    RunAll.logln("Starting test case: 2 for Test");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_3 = class_Test.getDeclaredConstructor().newInstance();
  method_setfor_field_x_of_class_Test.invoke(v_3,1260042744);
  if(!method_getfor_field_x_of_class_Test.invoke(v_3).equals(1260042744)) {
    throw new UnsupportedOperationException("get/set for field x did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Test.invoke(v_3);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Test.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_3);
    RunAll.logln("Finished test case: 2 for Test");
  }
  public void runAllTests() throws Exception{
      test_Test_0();
      test_Test_1();
      test_Test_2();
  }
}
