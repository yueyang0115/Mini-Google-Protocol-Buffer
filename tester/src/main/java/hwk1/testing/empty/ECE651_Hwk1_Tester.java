package hwk1.testing.empty;

import java.lang.reflect.*;
import java.util.*;
import org.json.*;
import edu.duke.ece651.hwk1tester.*;

public class ECE651_Hwk1_Tester implements Hwk1Tester {
  private Class<?> class_Empty;
  private Class<?> class__Deserializer;
  private Method deser_method_for_Empty;
  private Method tojson_method_for_Empty;
  public ECE651_Hwk1_Tester() throws Exception{
    class_Empty = Class.forName("hwk1.testing.empty.Empty");
    class__Deserializer = Class.forName("hwk1.testing.empty.Deserializer");
    tojson_method_for_Empty = class_Empty.getDeclaredMethod("toJSON");
    deser_method_for_Empty = class__Deserializer.getDeclaredMethod("readEmpty", JSONObject.class);
  }
  public void checkTypes() throws Exception {
  }
  public void test_Empty_0() throws Exception {
    System.out.println("Starting test case: 0 for class Empty");
    RunAll.logln("Starting test case: 0 for Empty");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_1 = class_Empty.getDeclaredConstructor().newInstance();
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Empty.invoke(v_1);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Empty.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_1);
    RunAll.logln("Finished test case: 0 for Empty");
  }
  public void test_Empty_1() throws Exception {
    System.out.println("Starting test case: 1 for class Empty");
    RunAll.logln("Starting test case: 1 for Empty");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_2 = class_Empty.getDeclaredConstructor().newInstance();
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Empty.invoke(v_2);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Empty.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_2);
    RunAll.logln("Finished test case: 1 for Empty");
  }
  public void test_Empty_2() throws Exception {
    System.out.println("Starting test case: 2 for class Empty");
    RunAll.logln("Starting test case: 2 for Empty");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_3 = class_Empty.getDeclaredConstructor().newInstance();
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Empty.invoke(v_3);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Empty.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_3);
    RunAll.logln("Finished test case: 2 for Empty");
  }
  public void runAllTests() throws Exception{
      test_Empty_0();
      test_Empty_1();
      test_Empty_2();
  }
}
