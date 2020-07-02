package hwk1.testing.mdarr;

import java.lang.reflect.*;
import java.util.*;
import org.json.*;
import edu.duke.ece651.hwk1tester.*;

public class ECE651_Hwk1_Tester implements Hwk1Tester {
  private Class<?> class_Matrix3d;
  private Field field_data_of_class_Matrix3d;
  private Method method_getfor_field_data_of_class_Matrix3d;
  private Method method_setfor_field_data_of_class_Matrix3d;
  private Method method_addfor_field_data_of_class_Matrix3d;
  private Method method_numfor_field_data_of_class_Matrix3d;
  private Class<?> class__Deserializer;
  private Method deser_method_for_Matrix3d;
  private Method tojson_method_for_Matrix3d;
  public ECE651_Hwk1_Tester() throws Exception{
    class_Matrix3d = Class.forName("hwk1.testing.mdarr.Matrix3d");
    class__Deserializer = Class.forName("hwk1.testing.mdarr.Deserializer");
    field_data_of_class_Matrix3d = class_Matrix3d.getDeclaredField("data");
    method_getfor_field_data_of_class_Matrix3d = class_Matrix3d.getDeclaredMethod("getData", Integer.TYPE);
    method_setfor_field_data_of_class_Matrix3d = class_Matrix3d.getDeclaredMethod("setData", Integer.TYPE,Collection.class);
    method_numfor_field_data_of_class_Matrix3d = class_Matrix3d.getDeclaredMethod("numData");
    method_addfor_field_data_of_class_Matrix3d = class_Matrix3d.getDeclaredMethod("addData", Collection.class);
    tojson_method_for_Matrix3d = class_Matrix3d.getDeclaredMethod("toJSON");
    deser_method_for_Matrix3d = class__Deserializer.getDeclaredMethod("readMatrix3d", JSONObject.class);
  }
  public void checkTypes() throws Exception {
if(field_data_of_class_Matrix3d.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field data to be private, but was "+Modifier.toString(field_data_of_class_Matrix3d.getModifiers()));
}
if(!method_addfor_field_data_of_class_Matrix3d.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_data_of_class_Matrix3d+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_data_of_class_Matrix3d.getReturnType());
}
if(method_addfor_field_data_of_class_Matrix3d.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_data_of_class_Matrix3d+" to be public , but was "+Modifier.toString(method_addfor_field_data_of_class_Matrix3d.getModifiers()));
}
if(!method_numfor_field_data_of_class_Matrix3d.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_data_of_class_Matrix3d+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_data_of_class_Matrix3d.getReturnType());
}
if(method_numfor_field_data_of_class_Matrix3d.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_data_of_class_Matrix3d+" to be public , but was "+Modifier.toString(method_numfor_field_data_of_class_Matrix3d.getModifiers()));
}
if(!method_getfor_field_data_of_class_Matrix3d.getReturnType().equals(Collection.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_data_of_class_Matrix3d+" to have return type "+Collection.class+" but was actually " +method_getfor_field_data_of_class_Matrix3d.getReturnType());
}
if(method_getfor_field_data_of_class_Matrix3d.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_data_of_class_Matrix3d+" to be public , but was "+Modifier.toString(method_getfor_field_data_of_class_Matrix3d.getModifiers()));
}
if(!method_setfor_field_data_of_class_Matrix3d.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_data_of_class_Matrix3d+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_data_of_class_Matrix3d.getReturnType());
}
if(method_setfor_field_data_of_class_Matrix3d.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_data_of_class_Matrix3d+" to be public , but was "+Modifier.toString(method_setfor_field_data_of_class_Matrix3d.getModifiers()));
}
  }
  public void test_Matrix3d_0() throws Exception {
    System.out.println("Starting test case: 0 for class Matrix3d");
    RunAll.logln("Starting test case: 0 for Matrix3d");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_1 = class_Matrix3d.getDeclaredConstructor().newInstance();
ArrayList<Object> v_2 =  new ArrayList<Object>();
ArrayList<Object> v_3 =  new ArrayList<Object>();
int v_6 = 0;
for (Object v_5: v_3) {
method_addfor_field_data_of_class_Matrix3d.invoke(v_1, v_5);
if ( !method_getfor_field_data_of_class_Matrix3d.invoke(v_1, v_6).equals(v_5)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_6++;
int v_4 = (Integer)method_numfor_field_data_of_class_Matrix3d.invoke(v_1);
if (v_4 != v_6) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Matrix3d.invoke(v_1);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Matrix3d.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_1);
    RunAll.logln("Finished test case: 0 for Matrix3d");
  }
  public void test_Matrix3d_1() throws Exception {
    System.out.println("Starting test case: 1 for class Matrix3d");
    RunAll.logln("Starting test case: 1 for Matrix3d");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_7 = class_Matrix3d.getDeclaredConstructor().newInstance();
ArrayList<Object> v_8 =  new ArrayList<Object>();
ArrayList<Object> v_9 =  new ArrayList<Object>();
ArrayList<Object> v_10 =  new ArrayList<Object>();
v_10.add(1749940626);
v_9.add(v_10);
v_8.add(v_9);
ArrayList<Object> v_11 =  new ArrayList<Object>();
ArrayList<Object> v_12 =  new ArrayList<Object>();
v_12.add(1429008869);
v_11.add(v_12);
v_8.add(v_11);
ArrayList<Object> v_13 =  new ArrayList<Object>();
ArrayList<Object> v_14 =  new ArrayList<Object>();
ArrayList<Object> v_15 =  new ArrayList<Object>();
v_15.add(26273138);
v_15.add(655996946);
v_14.add(v_15);
ArrayList<Object> v_16 =  new ArrayList<Object>();
v_16.add(685382526);
v_16.add(-258276172);
v_14.add(v_16);
v_13.add(v_14);
ArrayList<Object> v_17 =  new ArrayList<Object>();
ArrayList<Object> v_18 =  new ArrayList<Object>();
v_18.add(-382464772);
v_18.add(-270230103);
v_17.add(v_18);
ArrayList<Object> v_19 =  new ArrayList<Object>();
v_19.add(1705850753);
v_17.add(v_19);
v_13.add(v_17);
int v_22 = 0;
for (Object v_21: v_13) {
method_addfor_field_data_of_class_Matrix3d.invoke(v_7, v_21);
if ( !method_getfor_field_data_of_class_Matrix3d.invoke(v_7, v_22).equals(v_21)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_22++;
int v_20 = (Integer)method_numfor_field_data_of_class_Matrix3d.invoke(v_7);
if (v_20 != v_22) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Matrix3d.invoke(v_7);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Matrix3d.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_7);
    RunAll.logln("Finished test case: 1 for Matrix3d");
  }
  public void test_Matrix3d_2() throws Exception {
    System.out.println("Starting test case: 2 for class Matrix3d");
    RunAll.logln("Starting test case: 2 for Matrix3d");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_23 = class_Matrix3d.getDeclaredConstructor().newInstance();
ArrayList<Object> v_24 =  new ArrayList<Object>();
ArrayList<Object> v_25 =  new ArrayList<Object>();
ArrayList<Object> v_26 =  new ArrayList<Object>();
v_26.add(17850135);
v_26.add(2133836778);
v_26.add(-624140595);
v_26.add(-60658084);
v_25.add(v_26);
ArrayList<Object> v_27 =  new ArrayList<Object>();
v_27.add(-613647601);
v_27.add(-330177159);
v_25.add(v_27);
v_24.add(v_25);
ArrayList<Object> v_28 =  new ArrayList<Object>();
ArrayList<Object> v_29 =  new ArrayList<Object>();
v_29.add(979930868);
v_29.add(-2061794068);
v_29.add(321237028);
v_29.add(-685846464);
v_28.add(v_29);
ArrayList<Object> v_30 =  new ArrayList<Object>();
v_30.add(1062336798);
v_30.add(-216538235);
v_30.add(-1916604834);
v_28.add(v_30);
ArrayList<Object> v_31 =  new ArrayList<Object>();
v_31.add(476235295);
v_31.add(-1324330098);
v_28.add(v_31);
ArrayList<Object> v_32 =  new ArrayList<Object>();
v_32.add(-636982783);
v_32.add(1621432429);
v_32.add(243727125);
v_28.add(v_32);
v_24.add(v_28);
ArrayList<Object> v_33 =  new ArrayList<Object>();
ArrayList<Object> v_34 =  new ArrayList<Object>();
v_34.add(-218376571);
v_34.add(1513498359);
v_33.add(v_34);
ArrayList<Object> v_35 =  new ArrayList<Object>();
v_35.add(-27115682);
v_35.add(-1399932996);
v_33.add(v_35);
ArrayList<Object> v_36 =  new ArrayList<Object>();
v_36.add(1436086648);
v_36.add(2044337994);
v_36.add(-872582066);
v_33.add(v_36);
ArrayList<Object> v_37 =  new ArrayList<Object>();
v_37.add(736877176);
v_37.add(-1794126491);
v_37.add(705520311);
v_33.add(v_37);
v_24.add(v_33);
ArrayList<Object> v_38 =  new ArrayList<Object>();
ArrayList<Object> v_39 =  new ArrayList<Object>();
ArrayList<Object> v_40 =  new ArrayList<Object>();
v_40.add(1023612481);
v_40.add(657928268);
v_39.add(v_40);
ArrayList<Object> v_41 =  new ArrayList<Object>();
v_41.add(-154952624);
v_41.add(-1596009762);
v_39.add(v_41);
ArrayList<Object> v_42 =  new ArrayList<Object>();
v_42.add(-1346071364);
v_42.add(-1646511499);
v_42.add(114027063);
v_42.add(-1679781497);
v_39.add(v_42);
v_38.add(v_39);
ArrayList<Object> v_43 =  new ArrayList<Object>();
ArrayList<Object> v_44 =  new ArrayList<Object>();
v_44.add(-1165994492);
v_44.add(-689943156);
v_43.add(v_44);
ArrayList<Object> v_45 =  new ArrayList<Object>();
v_45.add(-1335754668);
v_45.add(-1974787171);
v_45.add(-869055907);
v_45.add(45662226);
v_43.add(v_45);
ArrayList<Object> v_46 =  new ArrayList<Object>();
v_46.add(-748321583);
v_46.add(462029077);
v_46.add(450872253);
v_46.add(140719389);
v_43.add(v_46);
v_38.add(v_43);
ArrayList<Object> v_47 =  new ArrayList<Object>();
ArrayList<Object> v_48 =  new ArrayList<Object>();
v_48.add(-1084917023);
v_48.add(1146012871);
v_48.add(-824227519);
v_47.add(v_48);
ArrayList<Object> v_49 =  new ArrayList<Object>();
v_49.add(151444542);
v_49.add(976105017);
v_49.add(550025047);
v_49.add(613602210);
v_47.add(v_49);
ArrayList<Object> v_50 =  new ArrayList<Object>();
v_50.add(217442262);
v_50.add(1433220387);
v_50.add(562323144);
v_47.add(v_50);
ArrayList<Object> v_51 =  new ArrayList<Object>();
v_51.add(248789492);
v_51.add(1547613930);
v_51.add(1977017216);
v_47.add(v_51);
v_38.add(v_47);
ArrayList<Object> v_52 =  new ArrayList<Object>();
ArrayList<Object> v_53 =  new ArrayList<Object>();
v_53.add(1651714204);
v_53.add(1087117573);
v_53.add(-898699825);
v_53.add(-904767490);
v_52.add(v_53);
ArrayList<Object> v_54 =  new ArrayList<Object>();
v_54.add(-979572010);
v_54.add(-1791990962);
v_54.add(1483023341);
v_54.add(-343062367);
v_52.add(v_54);
v_38.add(v_52);
int v_57 = 0;
for (Object v_56: v_38) {
method_addfor_field_data_of_class_Matrix3d.invoke(v_23, v_56);
if ( !method_getfor_field_data_of_class_Matrix3d.invoke(v_23, v_57).equals(v_56)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_57++;
int v_55 = (Integer)method_numfor_field_data_of_class_Matrix3d.invoke(v_23);
if (v_55 != v_57) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Matrix3d.invoke(v_23);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Matrix3d.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_23);
    RunAll.logln("Finished test case: 2 for Matrix3d");
  }
  public void runAllTests() throws Exception{
      test_Matrix3d_0();
      test_Matrix3d_1();
      test_Matrix3d_2();
  }
}
