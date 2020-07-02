package hwk1.testing.nameref;

import java.lang.reflect.*;
import java.util.*;
import org.json.*;
import edu.duke.ece651.hwk1tester.*;

public class ECE651_Hwk1_Tester implements Hwk1Tester {
  private Class<?> class_Office;
  private Field field_occupant_of_class_Office;
  private Method method_getfor_field_occupant_of_class_Office;
  private Method method_setfor_field_occupant_of_class_Office;
  private Field field_number_of_class_Office;
  private Method method_getfor_field_number_of_class_Office;
  private Method method_setfor_field_number_of_class_Office;
  private Field field_building_of_class_Office;
  private Method method_getfor_field_building_of_class_Office;
  private Method method_setfor_field_building_of_class_Office;
  private Class<?> class_Faculty;
  private Field field_name_of_class_Faculty;
  private Method method_getfor_field_name_of_class_Faculty;
  private Method method_setfor_field_name_of_class_Faculty;
  private Field field_courses_of_class_Faculty;
  private Method method_getfor_field_courses_of_class_Faculty;
  private Method method_setfor_field_courses_of_class_Faculty;
  private Method method_addfor_field_courses_of_class_Faculty;
  private Method method_numfor_field_courses_of_class_Faculty;
  private Class<?> class_Grade;
  private Field field_course_of_class_Grade;
  private Method method_getfor_field_course_of_class_Grade;
  private Method method_setfor_field_course_of_class_Grade;
  private Field field_student_of_class_Grade;
  private Method method_getfor_field_student_of_class_Grade;
  private Method method_setfor_field_student_of_class_Grade;
  private Field field_grade_of_class_Grade;
  private Method method_getfor_field_grade_of_class_Grade;
  private Method method_setfor_field_grade_of_class_Grade;
  private Class<?> class_Course;
  private Field field_instructor_of_class_Course;
  private Method method_getfor_field_instructor_of_class_Course;
  private Method method_setfor_field_instructor_of_class_Course;
  private Field field_numStudents_of_class_Course;
  private Method method_getfor_field_numStudents_of_class_Course;
  private Method method_setfor_field_numStudents_of_class_Course;
  private Class<?> class__Deserializer;
  private Method deser_method_for_Office;
  private Method tojson_method_for_Office;
  private Method deser_method_for_Faculty;
  private Method tojson_method_for_Faculty;
  private Method deser_method_for_Grade;
  private Method tojson_method_for_Grade;
  private Method deser_method_for_Course;
  private Method tojson_method_for_Course;
  public ECE651_Hwk1_Tester() throws Exception{
    class_Office = Class.forName("hwk1.testing.nameref.Office");
    class_Faculty = Class.forName("hwk1.testing.nameref.Faculty");
    class_Grade = Class.forName("hwk1.testing.nameref.Grade");
    class_Course = Class.forName("hwk1.testing.nameref.Course");
    class__Deserializer = Class.forName("hwk1.testing.nameref.Deserializer");
    field_occupant_of_class_Office = class_Office.getDeclaredField("occupant");
    method_getfor_field_occupant_of_class_Office = class_Office.getDeclaredMethod("getOccupant");
    method_setfor_field_occupant_of_class_Office = class_Office.getDeclaredMethod("setOccupant", class_Faculty);
    field_number_of_class_Office = class_Office.getDeclaredField("number");
    method_getfor_field_number_of_class_Office = class_Office.getDeclaredMethod("getNumber");
    method_setfor_field_number_of_class_Office = class_Office.getDeclaredMethod("setNumber", Integer.TYPE);
    field_building_of_class_Office = class_Office.getDeclaredField("building");
    method_getfor_field_building_of_class_Office = class_Office.getDeclaredMethod("getBuilding");
    method_setfor_field_building_of_class_Office = class_Office.getDeclaredMethod("setBuilding", String.class);
    tojson_method_for_Office = class_Office.getDeclaredMethod("toJSON");
    deser_method_for_Office = class__Deserializer.getDeclaredMethod("readOffice", JSONObject.class);
    field_name_of_class_Faculty = class_Faculty.getDeclaredField("name");
    method_getfor_field_name_of_class_Faculty = class_Faculty.getDeclaredMethod("getName");
    method_setfor_field_name_of_class_Faculty = class_Faculty.getDeclaredMethod("setName", String.class);
    field_courses_of_class_Faculty = class_Faculty.getDeclaredField("courses");
    method_getfor_field_courses_of_class_Faculty = class_Faculty.getDeclaredMethod("getCourses", Integer.TYPE);
    method_setfor_field_courses_of_class_Faculty = class_Faculty.getDeclaredMethod("setCourses", Integer.TYPE,class_Course);
    method_numfor_field_courses_of_class_Faculty = class_Faculty.getDeclaredMethod("numCourses");
    method_addfor_field_courses_of_class_Faculty = class_Faculty.getDeclaredMethod("addCourses", class_Course);
    tojson_method_for_Faculty = class_Faculty.getDeclaredMethod("toJSON");
    deser_method_for_Faculty = class__Deserializer.getDeclaredMethod("readFaculty", JSONObject.class);
    field_course_of_class_Grade = class_Grade.getDeclaredField("course");
    method_getfor_field_course_of_class_Grade = class_Grade.getDeclaredMethod("getCourse");
    method_setfor_field_course_of_class_Grade = class_Grade.getDeclaredMethod("setCourse", class_Course);
    field_student_of_class_Grade = class_Grade.getDeclaredField("student");
    method_getfor_field_student_of_class_Grade = class_Grade.getDeclaredMethod("getStudent");
    method_setfor_field_student_of_class_Grade = class_Grade.getDeclaredMethod("setStudent", String.class);
    field_grade_of_class_Grade = class_Grade.getDeclaredField("grade");
    method_getfor_field_grade_of_class_Grade = class_Grade.getDeclaredMethod("getGrade");
    method_setfor_field_grade_of_class_Grade = class_Grade.getDeclaredMethod("setGrade", Double.TYPE);
    tojson_method_for_Grade = class_Grade.getDeclaredMethod("toJSON");
    deser_method_for_Grade = class__Deserializer.getDeclaredMethod("readGrade", JSONObject.class);
    field_instructor_of_class_Course = class_Course.getDeclaredField("instructor");
    method_getfor_field_instructor_of_class_Course = class_Course.getDeclaredMethod("getInstructor");
    method_setfor_field_instructor_of_class_Course = class_Course.getDeclaredMethod("setInstructor", class_Faculty);
    field_numStudents_of_class_Course = class_Course.getDeclaredField("numStudents");
    method_getfor_field_numStudents_of_class_Course = class_Course.getDeclaredMethod("getNumStudents");
    method_setfor_field_numStudents_of_class_Course = class_Course.getDeclaredMethod("setNumStudents", Integer.TYPE);
    tojson_method_for_Course = class_Course.getDeclaredMethod("toJSON");
    deser_method_for_Course = class__Deserializer.getDeclaredMethod("readCourse", JSONObject.class);
  }
  public void checkTypes() throws Exception {
if(!field_occupant_of_class_Office.getType().equals(class_Faculty)) {
  throw new IllegalStateException("Field occupant does not have the right type");
}
if(field_occupant_of_class_Office.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field occupant to be private, but was "+Modifier.toString(field_occupant_of_class_Office.getModifiers()));
}
if(!method_getfor_field_occupant_of_class_Office.getReturnType().equals(class_Faculty)) {
throw new IllegalStateException("Expected method "+method_getfor_field_occupant_of_class_Office+" to have return type "+class_Faculty+" but was actually " +method_getfor_field_occupant_of_class_Office.getReturnType());
}
if(method_getfor_field_occupant_of_class_Office.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_occupant_of_class_Office+" to be public , but was "+Modifier.toString(method_getfor_field_occupant_of_class_Office.getModifiers()));
}
if(!method_setfor_field_occupant_of_class_Office.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_occupant_of_class_Office+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_occupant_of_class_Office.getReturnType());
}
if(method_setfor_field_occupant_of_class_Office.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_occupant_of_class_Office+" to be public , but was "+Modifier.toString(method_setfor_field_occupant_of_class_Office.getModifiers()));
}
if(!field_number_of_class_Office.getType().equals(Integer.TYPE)) {
  throw new IllegalStateException("Field number does not have the right type");
}
if(field_number_of_class_Office.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field number to be private, but was "+Modifier.toString(field_number_of_class_Office.getModifiers()));
}
if(!method_getfor_field_number_of_class_Office.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_number_of_class_Office+" to have return type "+Integer.TYPE+" but was actually " +method_getfor_field_number_of_class_Office.getReturnType());
}
if(method_getfor_field_number_of_class_Office.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_number_of_class_Office+" to be public , but was "+Modifier.toString(method_getfor_field_number_of_class_Office.getModifiers()));
}
if(!method_setfor_field_number_of_class_Office.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_number_of_class_Office+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_number_of_class_Office.getReturnType());
}
if(method_setfor_field_number_of_class_Office.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_number_of_class_Office+" to be public , but was "+Modifier.toString(method_setfor_field_number_of_class_Office.getModifiers()));
}
if(!field_building_of_class_Office.getType().equals(String.class)) {
  throw new IllegalStateException("Field building does not have the right type");
}
if(field_building_of_class_Office.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field building to be private, but was "+Modifier.toString(field_building_of_class_Office.getModifiers()));
}
if(!method_getfor_field_building_of_class_Office.getReturnType().equals(String.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_building_of_class_Office+" to have return type "+String.class+" but was actually " +method_getfor_field_building_of_class_Office.getReturnType());
}
if(method_getfor_field_building_of_class_Office.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_building_of_class_Office+" to be public , but was "+Modifier.toString(method_getfor_field_building_of_class_Office.getModifiers()));
}
if(!method_setfor_field_building_of_class_Office.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_building_of_class_Office+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_building_of_class_Office.getReturnType());
}
if(method_setfor_field_building_of_class_Office.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_building_of_class_Office+" to be public , but was "+Modifier.toString(method_setfor_field_building_of_class_Office.getModifiers()));
}
if(!field_name_of_class_Faculty.getType().equals(String.class)) {
  throw new IllegalStateException("Field name does not have the right type");
}
if(field_name_of_class_Faculty.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field name to be private, but was "+Modifier.toString(field_name_of_class_Faculty.getModifiers()));
}
if(!method_getfor_field_name_of_class_Faculty.getReturnType().equals(String.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_name_of_class_Faculty+" to have return type "+String.class+" but was actually " +method_getfor_field_name_of_class_Faculty.getReturnType());
}
if(method_getfor_field_name_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_name_of_class_Faculty+" to be public , but was "+Modifier.toString(method_getfor_field_name_of_class_Faculty.getModifiers()));
}
if(!method_setfor_field_name_of_class_Faculty.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_name_of_class_Faculty+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_name_of_class_Faculty.getReturnType());
}
if(method_setfor_field_name_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_name_of_class_Faculty+" to be public , but was "+Modifier.toString(method_setfor_field_name_of_class_Faculty.getModifiers()));
}
if(field_courses_of_class_Faculty.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field courses to be private, but was "+Modifier.toString(field_courses_of_class_Faculty.getModifiers()));
}
if(!method_addfor_field_courses_of_class_Faculty.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_courses_of_class_Faculty+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_courses_of_class_Faculty.getReturnType());
}
if(method_addfor_field_courses_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_courses_of_class_Faculty+" to be public , but was "+Modifier.toString(method_addfor_field_courses_of_class_Faculty.getModifiers()));
}
if(!method_numfor_field_courses_of_class_Faculty.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_courses_of_class_Faculty+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_courses_of_class_Faculty.getReturnType());
}
if(method_numfor_field_courses_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_courses_of_class_Faculty+" to be public , but was "+Modifier.toString(method_numfor_field_courses_of_class_Faculty.getModifiers()));
}
if(!method_getfor_field_courses_of_class_Faculty.getReturnType().equals(class_Course)) {
throw new IllegalStateException("Expected method "+method_getfor_field_courses_of_class_Faculty+" to have return type "+class_Course+" but was actually " +method_getfor_field_courses_of_class_Faculty.getReturnType());
}
if(method_getfor_field_courses_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_courses_of_class_Faculty+" to be public , but was "+Modifier.toString(method_getfor_field_courses_of_class_Faculty.getModifiers()));
}
if(!method_setfor_field_courses_of_class_Faculty.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_courses_of_class_Faculty+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_courses_of_class_Faculty.getReturnType());
}
if(method_setfor_field_courses_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_courses_of_class_Faculty+" to be public , but was "+Modifier.toString(method_setfor_field_courses_of_class_Faculty.getModifiers()));
}
if(!field_course_of_class_Grade.getType().equals(class_Course)) {
  throw new IllegalStateException("Field course does not have the right type");
}
if(field_course_of_class_Grade.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field course to be private, but was "+Modifier.toString(field_course_of_class_Grade.getModifiers()));
}
if(!method_getfor_field_course_of_class_Grade.getReturnType().equals(class_Course)) {
throw new IllegalStateException("Expected method "+method_getfor_field_course_of_class_Grade+" to have return type "+class_Course+" but was actually " +method_getfor_field_course_of_class_Grade.getReturnType());
}
if(method_getfor_field_course_of_class_Grade.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_course_of_class_Grade+" to be public , but was "+Modifier.toString(method_getfor_field_course_of_class_Grade.getModifiers()));
}
if(!method_setfor_field_course_of_class_Grade.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_course_of_class_Grade+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_course_of_class_Grade.getReturnType());
}
if(method_setfor_field_course_of_class_Grade.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_course_of_class_Grade+" to be public , but was "+Modifier.toString(method_setfor_field_course_of_class_Grade.getModifiers()));
}
if(!field_student_of_class_Grade.getType().equals(String.class)) {
  throw new IllegalStateException("Field student does not have the right type");
}
if(field_student_of_class_Grade.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field student to be private, but was "+Modifier.toString(field_student_of_class_Grade.getModifiers()));
}
if(!method_getfor_field_student_of_class_Grade.getReturnType().equals(String.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_student_of_class_Grade+" to have return type "+String.class+" but was actually " +method_getfor_field_student_of_class_Grade.getReturnType());
}
if(method_getfor_field_student_of_class_Grade.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_student_of_class_Grade+" to be public , but was "+Modifier.toString(method_getfor_field_student_of_class_Grade.getModifiers()));
}
if(!method_setfor_field_student_of_class_Grade.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_student_of_class_Grade+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_student_of_class_Grade.getReturnType());
}
if(method_setfor_field_student_of_class_Grade.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_student_of_class_Grade+" to be public , but was "+Modifier.toString(method_setfor_field_student_of_class_Grade.getModifiers()));
}
if(!field_grade_of_class_Grade.getType().equals(Double.TYPE)) {
  throw new IllegalStateException("Field grade does not have the right type");
}
if(field_grade_of_class_Grade.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field grade to be private, but was "+Modifier.toString(field_grade_of_class_Grade.getModifiers()));
}
if(!method_getfor_field_grade_of_class_Grade.getReturnType().equals(Double.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_grade_of_class_Grade+" to have return type "+Double.TYPE+" but was actually " +method_getfor_field_grade_of_class_Grade.getReturnType());
}
if(method_getfor_field_grade_of_class_Grade.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_grade_of_class_Grade+" to be public , but was "+Modifier.toString(method_getfor_field_grade_of_class_Grade.getModifiers()));
}
if(!method_setfor_field_grade_of_class_Grade.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_grade_of_class_Grade+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_grade_of_class_Grade.getReturnType());
}
if(method_setfor_field_grade_of_class_Grade.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_grade_of_class_Grade+" to be public , but was "+Modifier.toString(method_setfor_field_grade_of_class_Grade.getModifiers()));
}
if(!field_instructor_of_class_Course.getType().equals(class_Faculty)) {
  throw new IllegalStateException("Field instructor does not have the right type");
}
if(field_instructor_of_class_Course.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field instructor to be private, but was "+Modifier.toString(field_instructor_of_class_Course.getModifiers()));
}
if(!method_getfor_field_instructor_of_class_Course.getReturnType().equals(class_Faculty)) {
throw new IllegalStateException("Expected method "+method_getfor_field_instructor_of_class_Course+" to have return type "+class_Faculty+" but was actually " +method_getfor_field_instructor_of_class_Course.getReturnType());
}
if(method_getfor_field_instructor_of_class_Course.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_instructor_of_class_Course+" to be public , but was "+Modifier.toString(method_getfor_field_instructor_of_class_Course.getModifiers()));
}
if(!method_setfor_field_instructor_of_class_Course.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_instructor_of_class_Course+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_instructor_of_class_Course.getReturnType());
}
if(method_setfor_field_instructor_of_class_Course.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_instructor_of_class_Course+" to be public , but was "+Modifier.toString(method_setfor_field_instructor_of_class_Course.getModifiers()));
}
if(!field_numStudents_of_class_Course.getType().equals(Integer.TYPE)) {
  throw new IllegalStateException("Field numStudents does not have the right type");
}
if(field_numStudents_of_class_Course.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field numStudents to be private, but was "+Modifier.toString(field_numStudents_of_class_Course.getModifiers()));
}
if(!method_getfor_field_numStudents_of_class_Course.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_numStudents_of_class_Course+" to have return type "+Integer.TYPE+" but was actually " +method_getfor_field_numStudents_of_class_Course.getReturnType());
}
if(method_getfor_field_numStudents_of_class_Course.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_numStudents_of_class_Course+" to be public , but was "+Modifier.toString(method_getfor_field_numStudents_of_class_Course.getModifiers()));
}
if(!method_setfor_field_numStudents_of_class_Course.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_numStudents_of_class_Course+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_numStudents_of_class_Course.getReturnType());
}
if(method_setfor_field_numStudents_of_class_Course.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_numStudents_of_class_Course+" to be public , but was "+Modifier.toString(method_setfor_field_numStudents_of_class_Course.getModifiers()));
}
  }
  public void test_Office_0() throws Exception {
    System.out.println("Starting test case: 0 for class Office");
    RunAll.logln("Starting test case: 0 for Office");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_1 = class_Office.getDeclaredConstructor().newInstance();
  Object v_2 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_2,"WFL#2;W.OOZ=OZTPHF");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_2).equals("WFL#2;W.OOZ=OZTPHF")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_3 =  new ArrayList<Object>();
ArrayList<Object> v_4 =  new ArrayList<Object>();
int v_7 = 0;
for (Object v_6: v_4) {
method_addfor_field_courses_of_class_Faculty.invoke(v_2, v_6);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_2, v_7).equals(v_6)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_7++;
int v_5 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_2);
if (v_5 != v_7) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_occupant_of_class_Office.invoke(v_1,v_2);
  if(!method_getfor_field_occupant_of_class_Office.invoke(v_1).equals(v_2)) {
    throw new UnsupportedOperationException("get/set for field occupant did not work correctly");
  }
  method_setfor_field_number_of_class_Office.invoke(v_1,-960731419);
  if(!method_getfor_field_number_of_class_Office.invoke(v_1).equals(-960731419)) {
    throw new UnsupportedOperationException("get/set for field number did not work correctly");
  }
  method_setfor_field_building_of_class_Office.invoke(v_1,"/LEK0>YII-#LBA7");
  if(!method_getfor_field_building_of_class_Office.invoke(v_1).equals("/LEK0>YII-#LBA7")) {
    throw new UnsupportedOperationException("get/set for field building did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Office.invoke(v_1);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Office.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_1);
    RunAll.logln("Finished test case: 0 for Office");
  }
  public void test_Faculty_0() throws Exception {
    System.out.println("Starting test case: 0 for class Faculty");
    RunAll.logln("Starting test case: 0 for Faculty");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_8 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_8,"WFL#2;W.OOZ=OZTPHF");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_8).equals("WFL#2;W.OOZ=OZTPHF")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_9 =  new ArrayList<Object>();
ArrayList<Object> v_10 =  new ArrayList<Object>();
int v_13 = 0;
for (Object v_12: v_10) {
method_addfor_field_courses_of_class_Faculty.invoke(v_8, v_12);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_8, v_13).equals(v_12)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_13++;
int v_11 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_8);
if (v_11 != v_13) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Faculty.invoke(v_8);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Faculty.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_8);
    RunAll.logln("Finished test case: 0 for Faculty");
  }
  public void test_Grade_0() throws Exception {
    System.out.println("Starting test case: 0 for class Grade");
    RunAll.logln("Starting test case: 0 for Grade");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_14 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_15 = class_Course.getDeclaredConstructor().newInstance();
  Object v_16 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_16,"WFL#2;W.OOZ=OZTPHF");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_16).equals("WFL#2;W.OOZ=OZTPHF")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_17 =  new ArrayList<Object>();
ArrayList<Object> v_18 =  new ArrayList<Object>();
int v_21 = 0;
for (Object v_20: v_18) {
method_addfor_field_courses_of_class_Faculty.invoke(v_16, v_20);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_16, v_21).equals(v_20)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_21++;
int v_19 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_16);
if (v_19 != v_21) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_15,v_16);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_15).equals(v_16)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_15,-960731419);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_15).equals(-960731419)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
  method_setfor_field_course_of_class_Grade.invoke(v_14,v_15);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_14).equals(v_15)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_14,"/LEK0>YII-#LBA7");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_14).equals("/LEK0>YII-#LBA7")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_14,(double)0.859356551354648);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_14).equals((double)0.859356551354648)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Grade.invoke(v_14);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Grade.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_14);
    RunAll.logln("Finished test case: 0 for Grade");
  }
  public void test_Course_0() throws Exception {
    System.out.println("Starting test case: 0 for class Course");
    RunAll.logln("Starting test case: 0 for Course");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_22 = class_Course.getDeclaredConstructor().newInstance();
  Object v_23 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_23,"WFL#2;W.OOZ=OZTPHF");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_23).equals("WFL#2;W.OOZ=OZTPHF")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_24 =  new ArrayList<Object>();
ArrayList<Object> v_25 =  new ArrayList<Object>();
int v_28 = 0;
for (Object v_27: v_25) {
method_addfor_field_courses_of_class_Faculty.invoke(v_23, v_27);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_23, v_28).equals(v_27)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_28++;
int v_26 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_23);
if (v_26 != v_28) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_22,v_23);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_22).equals(v_23)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_22,-960731419);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_22).equals(-960731419)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Course.invoke(v_22);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Course.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_22);
    RunAll.logln("Finished test case: 0 for Course");
  }
  public void test_Office_1() throws Exception {
    System.out.println("Starting test case: 1 for class Office");
    RunAll.logln("Starting test case: 1 for Office");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_29 = class_Office.getDeclaredConstructor().newInstance();
  Object v_30 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_30,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_30).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_31 =  new ArrayList<Object>();
  Object v_32 = class_Course.getDeclaredConstructor().newInstance();
  Object v_33 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_33,"W(W8W23");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_33).equals("W(W8W23")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_34 =  new ArrayList<Object>();
  Object v_35 = class_Course.getDeclaredConstructor().newInstance();
  Object v_36 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_36,"4#FOZ-EB#&48S%");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_36).equals("4#FOZ-EB#&48S%")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_37 =  new ArrayList<Object>();
v_37.add(v_32);
ArrayList<Object> v_38 =  new ArrayList<Object>();
  Object v_39 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_39,v_33);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_39).equals(v_33)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_39,484561621);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_39).equals(484561621)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_38.add(v_39);
v_38.add(v_39);
int v_42 = 0;
for (Object v_41: v_38) {
method_addfor_field_courses_of_class_Faculty.invoke(v_36, v_41);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_36, v_42).equals(v_41)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_42++;
int v_40 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_36);
if (v_40 != v_42) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_35,v_36);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_35).equals(v_36)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_35,514704749);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_35).equals(514704749)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_34.add(v_35);
  Object v_43 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_43,v_36);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_43).equals(v_36)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_43,-162286093);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_43).equals(-162286093)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_34.add(v_43);
ArrayList<Object> v_44 =  new ArrayList<Object>();
v_44.add(v_32);
int v_47 = 0;
for (Object v_46: v_44) {
method_addfor_field_courses_of_class_Faculty.invoke(v_33, v_46);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_33, v_47).equals(v_46)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_47++;
int v_45 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_33);
if (v_45 != v_47) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_32,v_33);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_32).equals(v_33)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_32,1990072188);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_32).equals(1990072188)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_31.add(v_32);
ArrayList<Object> v_48 =  new ArrayList<Object>();
  Object v_49 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_49,v_33);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_49).equals(v_33)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_49,-2129721489);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_49).equals(-2129721489)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_48.add(v_49);
v_48.add(v_35);
int v_52 = 0;
for (Object v_51: v_48) {
method_addfor_field_courses_of_class_Faculty.invoke(v_30, v_51);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_30, v_52).equals(v_51)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_52++;
int v_50 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_30);
if (v_50 != v_52) {
throw new IllegalStateException("array size was not correct!");
}
}
  Object v_53 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_53,"R#;&K'CG");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_53).equals("R#;&K'CG")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_54 =  new ArrayList<Object>();
v_54.add(v_49);
ArrayList<Object> v_55 =  new ArrayList<Object>();
v_55.add(v_49);
int v_58 = 0;
for (Object v_57: v_55) {
method_addfor_field_courses_of_class_Faculty.invoke(v_53, v_57);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_53, v_58).equals(v_57)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_58++;
int v_56 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_53);
if (v_56 != v_58) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_occupant_of_class_Office.invoke(v_29,v_53);
  if(!method_getfor_field_occupant_of_class_Office.invoke(v_29).equals(v_53)) {
    throw new UnsupportedOperationException("get/set for field occupant did not work correctly");
  }
  method_setfor_field_number_of_class_Office.invoke(v_29,748918191);
  if(!method_getfor_field_number_of_class_Office.invoke(v_29).equals(748918191)) {
    throw new UnsupportedOperationException("get/set for field number did not work correctly");
  }
  method_setfor_field_building_of_class_Office.invoke(v_29,"XV1&UCZDW9.#==HZ'");
  if(!method_getfor_field_building_of_class_Office.invoke(v_29).equals("XV1&UCZDW9.#==HZ'")) {
    throw new UnsupportedOperationException("get/set for field building did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Office.invoke(v_29);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Office.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_29);
    RunAll.logln("Finished test case: 1 for Office");
  }
  public void test_Faculty_1() throws Exception {
    System.out.println("Starting test case: 1 for class Faculty");
    RunAll.logln("Starting test case: 1 for Faculty");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_59 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_59,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_59).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_60 =  new ArrayList<Object>();
  Object v_61 = class_Course.getDeclaredConstructor().newInstance();
  Object v_62 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_62,"W(W8W23");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_62).equals("W(W8W23")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_63 =  new ArrayList<Object>();
  Object v_64 = class_Course.getDeclaredConstructor().newInstance();
  Object v_65 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_65,"4#FOZ-EB#&48S%");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_65).equals("4#FOZ-EB#&48S%")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_66 =  new ArrayList<Object>();
v_66.add(v_61);
ArrayList<Object> v_67 =  new ArrayList<Object>();
  Object v_68 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_68,v_62);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_68).equals(v_62)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_68,484561621);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_68).equals(484561621)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_67.add(v_68);
v_67.add(v_68);
int v_71 = 0;
for (Object v_70: v_67) {
method_addfor_field_courses_of_class_Faculty.invoke(v_65, v_70);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_65, v_71).equals(v_70)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_71++;
int v_69 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_65);
if (v_69 != v_71) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_64,v_65);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_64).equals(v_65)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_64,514704749);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_64).equals(514704749)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_63.add(v_64);
  Object v_72 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_72,v_65);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_72).equals(v_65)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_72,-162286093);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_72).equals(-162286093)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_63.add(v_72);
ArrayList<Object> v_73 =  new ArrayList<Object>();
v_73.add(v_61);
int v_76 = 0;
for (Object v_75: v_73) {
method_addfor_field_courses_of_class_Faculty.invoke(v_62, v_75);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_62, v_76).equals(v_75)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_76++;
int v_74 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_62);
if (v_74 != v_76) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_61,v_62);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_61).equals(v_62)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_61,1990072188);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_61).equals(1990072188)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_60.add(v_61);
ArrayList<Object> v_77 =  new ArrayList<Object>();
  Object v_78 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_78,v_62);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_78).equals(v_62)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_78,-2129721489);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_78).equals(-2129721489)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_77.add(v_78);
v_77.add(v_64);
int v_81 = 0;
for (Object v_80: v_77) {
method_addfor_field_courses_of_class_Faculty.invoke(v_59, v_80);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_59, v_81).equals(v_80)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_81++;
int v_79 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_59);
if (v_79 != v_81) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Faculty.invoke(v_59);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Faculty.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_59);
    RunAll.logln("Finished test case: 1 for Faculty");
  }
  public void test_Grade_1() throws Exception {
    System.out.println("Starting test case: 1 for class Grade");
    RunAll.logln("Starting test case: 1 for Grade");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_82 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_83 = class_Course.getDeclaredConstructor().newInstance();
  Object v_84 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_84,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_84).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_85 =  new ArrayList<Object>();
  Object v_86 = class_Course.getDeclaredConstructor().newInstance();
  Object v_87 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_87,"+RIVY7WU4#FO");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_87).equals("+RIVY7WU4#FO")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_88 =  new ArrayList<Object>();
v_88.add(v_86);
v_88.add(v_83);
ArrayList<Object> v_89 =  new ArrayList<Object>();
v_89.add(v_83);
int v_92 = 0;
for (Object v_91: v_89) {
method_addfor_field_courses_of_class_Faculty.invoke(v_87, v_91);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_87, v_92).equals(v_91)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_92++;
int v_90 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_87);
if (v_90 != v_92) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_86,v_87);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_86).equals(v_87)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_86,934594003);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_86).equals(934594003)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_85.add(v_86);
ArrayList<Object> v_93 =  new ArrayList<Object>();
  Object v_94 = class_Course.getDeclaredConstructor().newInstance();
  Object v_95 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_95,"ZQ;W2RNJ'Z<");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_95).equals("ZQ;W2RNJ'Z<")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_96 =  new ArrayList<Object>();
v_96.add(v_86);
v_96.add(v_94);
ArrayList<Object> v_97 =  new ArrayList<Object>();
v_97.add(v_86);
int v_100 = 0;
for (Object v_99: v_97) {
method_addfor_field_courses_of_class_Faculty.invoke(v_95, v_99);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_95, v_100).equals(v_99)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_100++;
int v_98 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_95);
if (v_98 != v_100) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_94,v_95);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_94).equals(v_95)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_94,1841614017);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_94).equals(1841614017)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_93.add(v_94);
int v_103 = 0;
for (Object v_102: v_93) {
method_addfor_field_courses_of_class_Faculty.invoke(v_84, v_102);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_84, v_103).equals(v_102)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_103++;
int v_101 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_84);
if (v_101 != v_103) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_83,v_84);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_83).equals(v_84)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_83,-1949531143);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_83).equals(-1949531143)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
  method_setfor_field_course_of_class_Grade.invoke(v_82,v_94);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_82).equals(v_94)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_82,"BQ:BW2-%Z<(>8+");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_82).equals("BQ:BW2-%Z<(>8+")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_82,(double)0.008760417318731673);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_82).equals((double)0.008760417318731673)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Grade.invoke(v_82);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Grade.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_82);
    RunAll.logln("Finished test case: 1 for Grade");
  }
  public void test_Course_1() throws Exception {
    System.out.println("Starting test case: 1 for class Course");
    RunAll.logln("Starting test case: 1 for Course");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_104 = class_Course.getDeclaredConstructor().newInstance();
  Object v_105 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_105,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_105).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_106 =  new ArrayList<Object>();
  Object v_107 = class_Course.getDeclaredConstructor().newInstance();
  Object v_108 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_108,"+RIVY7WU4#FO");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_108).equals("+RIVY7WU4#FO")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_109 =  new ArrayList<Object>();
v_109.add(v_107);
v_109.add(v_104);
ArrayList<Object> v_110 =  new ArrayList<Object>();
v_110.add(v_104);
int v_113 = 0;
for (Object v_112: v_110) {
method_addfor_field_courses_of_class_Faculty.invoke(v_108, v_112);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_108, v_113).equals(v_112)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_113++;
int v_111 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_108);
if (v_111 != v_113) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_107,v_108);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_107).equals(v_108)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_107,934594003);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_107).equals(934594003)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_106.add(v_107);
ArrayList<Object> v_114 =  new ArrayList<Object>();
  Object v_115 = class_Course.getDeclaredConstructor().newInstance();
  Object v_116 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_116,"ZQ;W2RNJ'Z<");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_116).equals("ZQ;W2RNJ'Z<")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_117 =  new ArrayList<Object>();
v_117.add(v_107);
v_117.add(v_115);
ArrayList<Object> v_118 =  new ArrayList<Object>();
v_118.add(v_107);
int v_121 = 0;
for (Object v_120: v_118) {
method_addfor_field_courses_of_class_Faculty.invoke(v_116, v_120);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_116, v_121).equals(v_120)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_121++;
int v_119 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_116);
if (v_119 != v_121) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_115,v_116);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_115).equals(v_116)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_115,1841614017);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_115).equals(1841614017)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_114.add(v_115);
int v_124 = 0;
for (Object v_123: v_114) {
method_addfor_field_courses_of_class_Faculty.invoke(v_105, v_123);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_105, v_124).equals(v_123)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_124++;
int v_122 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_105);
if (v_122 != v_124) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_104,v_105);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_104).equals(v_105)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_104,-1949531143);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_104).equals(-1949531143)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Course.invoke(v_104);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Course.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_104);
    RunAll.logln("Finished test case: 1 for Course");
  }
  public void test_Office_2() throws Exception {
    System.out.println("Starting test case: 2 for class Office");
    RunAll.logln("Starting test case: 2 for Office");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_125 = class_Office.getDeclaredConstructor().newInstance();
  Object v_126 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_126,"MIM+NZ-*1R:=");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_126).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_127 =  new ArrayList<Object>();
  Object v_128 = class_Course.getDeclaredConstructor().newInstance();
  Object v_129 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_129,"+A2K*ZYMN.01-");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_129).equals("+A2K*ZYMN.01-")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_130 =  new ArrayList<Object>();
  Object v_131 = class_Course.getDeclaredConstructor().newInstance();
  Object v_132 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_132,"7SM@");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_132).equals("7SM@")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_133 =  new ArrayList<Object>();
v_133.add(v_131);
v_133.add(v_131);
v_133.add(v_131);
ArrayList<Object> v_134 =  new ArrayList<Object>();
  Object v_135 = class_Course.getDeclaredConstructor().newInstance();
  Object v_136 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_136,"#S@,6C2DO7UD");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_136).equals("#S@,6C2DO7UD")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_137 =  new ArrayList<Object>();
v_137.add(v_135);
v_137.add(v_128);
v_137.add(v_128);
ArrayList<Object> v_138 =  new ArrayList<Object>();
  Object v_139 = class_Course.getDeclaredConstructor().newInstance();
  Object v_140 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_140,"(:&3>BX)I");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_140).equals("(:&3>BX)I")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_141 =  new ArrayList<Object>();
v_141.add(v_135);
v_141.add(v_131);
v_141.add(v_135);
v_141.add(v_131);
ArrayList<Object> v_142 =  new ArrayList<Object>();
v_142.add(v_135);
  Object v_143 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_143,v_136);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_143).equals(v_136)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_143,1158832829);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_143).equals(1158832829)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_142.add(v_143);
int v_146 = 0;
for (Object v_145: v_142) {
method_addfor_field_courses_of_class_Faculty.invoke(v_140, v_145);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_140, v_146).equals(v_145)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_146++;
int v_144 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_140);
if (v_144 != v_146) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_139,v_140);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_139).equals(v_140)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_139,-669788998);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_139).equals(-669788998)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_138.add(v_139);
v_138.add(v_135);
int v_149 = 0;
for (Object v_148: v_138) {
method_addfor_field_courses_of_class_Faculty.invoke(v_136, v_148);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_136, v_149).equals(v_148)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_149++;
int v_147 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_136);
if (v_147 != v_149) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_135,v_129);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_135).equals(v_129)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_135,1701988914);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_135).equals(1701988914)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_134.add(v_135);
v_134.add(v_131);
int v_152 = 0;
for (Object v_151: v_134) {
method_addfor_field_courses_of_class_Faculty.invoke(v_132, v_151);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_132, v_152).equals(v_151)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_152++;
int v_150 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_132);
if (v_150 != v_152) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_131,v_129);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_131).equals(v_129)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_131,-228597461);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_131).equals(-228597461)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_130.add(v_131);
v_130.add(v_131);
v_130.add(v_131);
  Object v_153 = class_Course.getDeclaredConstructor().newInstance();
  Object v_154 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_154,"+V<6$)HJ,>&82");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_154).equals("+V<6$)HJ,>&82")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_155 =  new ArrayList<Object>();
v_155.add(v_153);
v_155.add(v_131);
v_155.add(v_128);
ArrayList<Object> v_156 =  new ArrayList<Object>();
v_156.add(v_131);
v_156.add(v_153);
int v_159 = 0;
for (Object v_158: v_156) {
method_addfor_field_courses_of_class_Faculty.invoke(v_154, v_158);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_154, v_159).equals(v_158)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_159++;
int v_157 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_154);
if (v_157 != v_159) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_153,v_132);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_153).equals(v_132)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_153,-73922051);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_153).equals(-73922051)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_130.add(v_153);
ArrayList<Object> v_160 =  new ArrayList<Object>();
  Object v_161 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_161,v_140);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_161).equals(v_140)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_161,91047516);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_161).equals(91047516)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_160.add(v_161);
v_160.add(v_128);
  Object v_162 = class_Course.getDeclaredConstructor().newInstance();
  Object v_163 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_163,"QE54>CKN>$HNG");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_163).equals("QE54>CKN>$HNG")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_164 =  new ArrayList<Object>();
  Object v_165 = class_Course.getDeclaredConstructor().newInstance();
  Object v_166 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_166,"2/TQOEWF*QYI#G0KWNH8");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_166).equals("2/TQOEWF*QYI#G0KWNH8")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_167 =  new ArrayList<Object>();
v_167.add(v_153);
v_167.add(v_139);
  Object v_168 = class_Course.getDeclaredConstructor().newInstance();
  Object v_169 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_169,"6Q9?L");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_169).equals("6Q9?L")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_170 =  new ArrayList<Object>();
v_170.add(v_162);
v_170.add(v_161);
ArrayList<Object> v_171 =  new ArrayList<Object>();
v_171.add(v_168);
v_171.add(v_161);
v_171.add(v_168);
v_171.add(v_161);
int v_174 = 0;
for (Object v_173: v_171) {
method_addfor_field_courses_of_class_Faculty.invoke(v_169, v_173);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_169, v_174).equals(v_173)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_174++;
int v_172 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_169);
if (v_172 != v_174) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_168,v_169);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_168).equals(v_169)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_168,658262949);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_168).equals(658262949)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_167.add(v_168);
ArrayList<Object> v_175 =  new ArrayList<Object>();
v_175.add(v_139);
v_175.add(v_131);
v_175.add(v_161);
int v_178 = 0;
for (Object v_177: v_175) {
method_addfor_field_courses_of_class_Faculty.invoke(v_166, v_177);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_166, v_178).equals(v_177)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_178++;
int v_176 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_166);
if (v_176 != v_178) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_165,v_166);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_165).equals(v_166)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_165,57267139);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_165).equals(57267139)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_164.add(v_165);
v_164.add(v_139);
ArrayList<Object> v_179 =  new ArrayList<Object>();
v_179.add(v_143);
v_179.add(v_143);
int v_182 = 0;
for (Object v_181: v_179) {
method_addfor_field_courses_of_class_Faculty.invoke(v_163, v_181);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_163, v_182).equals(v_181)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_182++;
int v_180 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_163);
if (v_180 != v_182) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_162,v_163);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_162).equals(v_163)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_162,1796767173);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_162).equals(1796767173)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_160.add(v_162);
int v_185 = 0;
for (Object v_184: v_160) {
method_addfor_field_courses_of_class_Faculty.invoke(v_129, v_184);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_129, v_185).equals(v_184)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_185++;
int v_183 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_129);
if (v_183 != v_185) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_128,v_129);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_128).equals(v_129)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_128,-209367589);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_128).equals(-209367589)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_127.add(v_128);
v_127.add(v_161);
v_127.add(v_165);
ArrayList<Object> v_186 =  new ArrayList<Object>();
v_186.add(v_128);
  Object v_187 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_187,v_166);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_187).equals(v_166)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_187,-1667733390);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_187).equals(-1667733390)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_186.add(v_187);
v_186.add(v_165);
v_186.add(v_162);
int v_190 = 0;
for (Object v_189: v_186) {
method_addfor_field_courses_of_class_Faculty.invoke(v_126, v_189);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_126, v_190).equals(v_189)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_190++;
int v_188 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_126);
if (v_188 != v_190) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_occupant_of_class_Office.invoke(v_125,v_129);
  if(!method_getfor_field_occupant_of_class_Office.invoke(v_125).equals(v_129)) {
    throw new UnsupportedOperationException("get/set for field occupant did not work correctly");
  }
  method_setfor_field_number_of_class_Office.invoke(v_125,-1185287467);
  if(!method_getfor_field_number_of_class_Office.invoke(v_125).equals(-1185287467)) {
    throw new UnsupportedOperationException("get/set for field number did not work correctly");
  }
  method_setfor_field_building_of_class_Office.invoke(v_125,"W257>RSRBG(>'=P?Q?1X");
  if(!method_getfor_field_building_of_class_Office.invoke(v_125).equals("W257>RSRBG(>'=P?Q?1X")) {
    throw new UnsupportedOperationException("get/set for field building did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Office.invoke(v_125);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Office.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_125);
    RunAll.logln("Finished test case: 2 for Office");
  }
  public void test_Faculty_2() throws Exception {
    System.out.println("Starting test case: 2 for class Faculty");
    RunAll.logln("Starting test case: 2 for Faculty");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_191 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_191,"MIM+NZ-*1R:=");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_191).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_192 =  new ArrayList<Object>();
  Object v_193 = class_Course.getDeclaredConstructor().newInstance();
  Object v_194 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_194,"+A2K*ZYMN.01-");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_194).equals("+A2K*ZYMN.01-")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_195 =  new ArrayList<Object>();
  Object v_196 = class_Course.getDeclaredConstructor().newInstance();
  Object v_197 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_197,"7SM@");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_197).equals("7SM@")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_198 =  new ArrayList<Object>();
v_198.add(v_196);
v_198.add(v_196);
v_198.add(v_196);
ArrayList<Object> v_199 =  new ArrayList<Object>();
  Object v_200 = class_Course.getDeclaredConstructor().newInstance();
  Object v_201 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_201,"#S@,6C2DO7UD");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_201).equals("#S@,6C2DO7UD")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_202 =  new ArrayList<Object>();
v_202.add(v_200);
v_202.add(v_193);
v_202.add(v_193);
ArrayList<Object> v_203 =  new ArrayList<Object>();
  Object v_204 = class_Course.getDeclaredConstructor().newInstance();
  Object v_205 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_205,"(:&3>BX)I");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_205).equals("(:&3>BX)I")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_206 =  new ArrayList<Object>();
v_206.add(v_200);
v_206.add(v_196);
v_206.add(v_200);
v_206.add(v_196);
ArrayList<Object> v_207 =  new ArrayList<Object>();
v_207.add(v_200);
  Object v_208 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_208,v_201);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_208).equals(v_201)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_208,1158832829);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_208).equals(1158832829)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_207.add(v_208);
int v_211 = 0;
for (Object v_210: v_207) {
method_addfor_field_courses_of_class_Faculty.invoke(v_205, v_210);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_205, v_211).equals(v_210)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_211++;
int v_209 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_205);
if (v_209 != v_211) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_204,v_205);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_204).equals(v_205)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_204,-669788998);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_204).equals(-669788998)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_203.add(v_204);
v_203.add(v_200);
int v_214 = 0;
for (Object v_213: v_203) {
method_addfor_field_courses_of_class_Faculty.invoke(v_201, v_213);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_201, v_214).equals(v_213)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_214++;
int v_212 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_201);
if (v_212 != v_214) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_200,v_194);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_200).equals(v_194)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_200,1701988914);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_200).equals(1701988914)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_199.add(v_200);
v_199.add(v_196);
int v_217 = 0;
for (Object v_216: v_199) {
method_addfor_field_courses_of_class_Faculty.invoke(v_197, v_216);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_197, v_217).equals(v_216)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_217++;
int v_215 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_197);
if (v_215 != v_217) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_196,v_194);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_196).equals(v_194)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_196,-228597461);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_196).equals(-228597461)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_195.add(v_196);
v_195.add(v_196);
v_195.add(v_196);
  Object v_218 = class_Course.getDeclaredConstructor().newInstance();
  Object v_219 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_219,"+V<6$)HJ,>&82");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_219).equals("+V<6$)HJ,>&82")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_220 =  new ArrayList<Object>();
v_220.add(v_218);
v_220.add(v_196);
v_220.add(v_193);
ArrayList<Object> v_221 =  new ArrayList<Object>();
v_221.add(v_196);
v_221.add(v_218);
int v_224 = 0;
for (Object v_223: v_221) {
method_addfor_field_courses_of_class_Faculty.invoke(v_219, v_223);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_219, v_224).equals(v_223)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_224++;
int v_222 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_219);
if (v_222 != v_224) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_218,v_197);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_218).equals(v_197)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_218,-73922051);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_218).equals(-73922051)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_195.add(v_218);
ArrayList<Object> v_225 =  new ArrayList<Object>();
  Object v_226 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_226,v_205);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_226).equals(v_205)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_226,91047516);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_226).equals(91047516)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_225.add(v_226);
v_225.add(v_193);
  Object v_227 = class_Course.getDeclaredConstructor().newInstance();
  Object v_228 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_228,"QE54>CKN>$HNG");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_228).equals("QE54>CKN>$HNG")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_229 =  new ArrayList<Object>();
  Object v_230 = class_Course.getDeclaredConstructor().newInstance();
  Object v_231 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_231,"2/TQOEWF*QYI#G0KWNH8");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_231).equals("2/TQOEWF*QYI#G0KWNH8")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_232 =  new ArrayList<Object>();
v_232.add(v_218);
v_232.add(v_204);
  Object v_233 = class_Course.getDeclaredConstructor().newInstance();
  Object v_234 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_234,"6Q9?L");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_234).equals("6Q9?L")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_235 =  new ArrayList<Object>();
v_235.add(v_227);
v_235.add(v_226);
ArrayList<Object> v_236 =  new ArrayList<Object>();
v_236.add(v_233);
v_236.add(v_226);
v_236.add(v_233);
v_236.add(v_226);
int v_239 = 0;
for (Object v_238: v_236) {
method_addfor_field_courses_of_class_Faculty.invoke(v_234, v_238);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_234, v_239).equals(v_238)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_239++;
int v_237 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_234);
if (v_237 != v_239) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_233,v_234);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_233).equals(v_234)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_233,658262949);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_233).equals(658262949)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_232.add(v_233);
ArrayList<Object> v_240 =  new ArrayList<Object>();
v_240.add(v_204);
v_240.add(v_196);
v_240.add(v_226);
int v_243 = 0;
for (Object v_242: v_240) {
method_addfor_field_courses_of_class_Faculty.invoke(v_231, v_242);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_231, v_243).equals(v_242)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_243++;
int v_241 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_231);
if (v_241 != v_243) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_230,v_231);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_230).equals(v_231)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_230,57267139);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_230).equals(57267139)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_229.add(v_230);
v_229.add(v_204);
ArrayList<Object> v_244 =  new ArrayList<Object>();
v_244.add(v_208);
v_244.add(v_208);
int v_247 = 0;
for (Object v_246: v_244) {
method_addfor_field_courses_of_class_Faculty.invoke(v_228, v_246);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_228, v_247).equals(v_246)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_247++;
int v_245 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_228);
if (v_245 != v_247) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_227,v_228);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_227).equals(v_228)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_227,1796767173);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_227).equals(1796767173)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_225.add(v_227);
int v_250 = 0;
for (Object v_249: v_225) {
method_addfor_field_courses_of_class_Faculty.invoke(v_194, v_249);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_194, v_250).equals(v_249)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_250++;
int v_248 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_194);
if (v_248 != v_250) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_193,v_194);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_193).equals(v_194)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_193,-209367589);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_193).equals(-209367589)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_192.add(v_193);
v_192.add(v_226);
v_192.add(v_230);
ArrayList<Object> v_251 =  new ArrayList<Object>();
v_251.add(v_193);
  Object v_252 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_252,v_231);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_252).equals(v_231)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_252,-1667733390);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_252).equals(-1667733390)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_251.add(v_252);
v_251.add(v_230);
v_251.add(v_227);
int v_255 = 0;
for (Object v_254: v_251) {
method_addfor_field_courses_of_class_Faculty.invoke(v_191, v_254);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_191, v_255).equals(v_254)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_255++;
int v_253 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_191);
if (v_253 != v_255) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Faculty.invoke(v_191);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Faculty.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_191);
    RunAll.logln("Finished test case: 2 for Faculty");
  }
  public void test_Grade_2() throws Exception {
    System.out.println("Starting test case: 2 for class Grade");
    RunAll.logln("Starting test case: 2 for Grade");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_256 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_257 = class_Course.getDeclaredConstructor().newInstance();
  Object v_258 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_258,"MIM+NZ-*1R:=");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_258).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_259 =  new ArrayList<Object>();
v_259.add(v_257);
  Object v_260 = class_Course.getDeclaredConstructor().newInstance();
  Object v_261 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_261,"K*ZYMN.");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_261).equals("K*ZYMN.")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_262 =  new ArrayList<Object>();
v_262.add(v_257);
  Object v_263 = class_Course.getDeclaredConstructor().newInstance();
  Object v_264 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_264,")6R+N#8:7V,NN");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_264).equals(")6R+N#8:7V,NN")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_265 =  new ArrayList<Object>();
v_265.add(v_263);
v_265.add(v_263);
v_265.add(v_260);
ArrayList<Object> v_266 =  new ArrayList<Object>();
  Object v_267 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_267,v_258);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_267).equals(v_258)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_267,1087117573);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_267).equals(1087117573)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_266.add(v_267);
v_266.add(v_260);
int v_270 = 0;
for (Object v_269: v_266) {
method_addfor_field_courses_of_class_Faculty.invoke(v_264, v_269);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_264, v_270).equals(v_269)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_270++;
int v_268 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_264);
if (v_268 != v_270) {
throw new IllegalStateException("array size was not correct!");
}
}
  Object v_271 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_271,"#S@,6C2DO7UD");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_271).equals("#S@,6C2DO7UD")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_272 =  new ArrayList<Object>();
  Object v_273 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_273,v_264);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_273).equals(v_264)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_273,-1903962169);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_273).equals(-1903962169)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_272.add(v_273);
v_272.add(v_267);
  Object v_274 = class_Course.getDeclaredConstructor().newInstance();
  Object v_275 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_275,"D@$(:&3>BX)I@)F;");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_275).equals("D@$(:&3>BX)I@)F;")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_276 =  new ArrayList<Object>();
  Object v_277 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_277,v_261);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_277).equals(v_261)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_277,-1115412842);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_277).equals(-1115412842)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_276.add(v_277);
  Object v_278 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_278,v_275);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_278).equals(v_275)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_278,-669788998);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_278).equals(-669788998)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_276.add(v_278);
  Object v_279 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_279,v_275);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_279).equals(v_275)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_279,158168208);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_279).equals(158168208)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_276.add(v_279);
ArrayList<Object> v_280 =  new ArrayList<Object>();
v_280.add(v_263);
v_280.add(v_274);
  Object v_281 = class_Course.getDeclaredConstructor().newInstance();
  Object v_282 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_282,"HJ,>&82W-F;H:Y9XY'?");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_282).equals("HJ,>&82W-F;H:Y9XY'?")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_283 =  new ArrayList<Object>();
v_283.add(v_277);
v_283.add(v_257);
ArrayList<Object> v_284 =  new ArrayList<Object>();
v_284.add(v_277);
v_284.add(v_263);
int v_287 = 0;
for (Object v_286: v_284) {
method_addfor_field_courses_of_class_Faculty.invoke(v_282, v_286);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_282, v_287).equals(v_286)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_287++;
int v_285 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_282);
if (v_285 != v_287) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_281,v_282);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_281).equals(v_282)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_281,-97476661);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_281).equals(-97476661)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_280.add(v_281);
int v_290 = 0;
for (Object v_289: v_280) {
method_addfor_field_courses_of_class_Faculty.invoke(v_275, v_289);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_275, v_290).equals(v_289)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_290++;
int v_288 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_275);
if (v_288 != v_290) {
throw new IllegalStateException("array size was not correct!");
}
}
  Object v_291 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_291,"'RQE54>CK");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_291).equals("'RQE54>CK")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_292 =  new ArrayList<Object>();
v_292.add(v_278);
v_292.add(v_274);
v_292.add(v_260);
ArrayList<Object> v_293 =  new ArrayList<Object>();
v_293.add(v_279);
v_293.add(v_257);
int v_296 = 0;
for (Object v_295: v_293) {
method_addfor_field_courses_of_class_Faculty.invoke(v_291, v_295);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_291, v_296).equals(v_295)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_296++;
int v_294 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_291);
if (v_294 != v_296) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_274,v_291);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_274).equals(v_291)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_274,939571202);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_274).equals(939571202)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_272.add(v_274);
ArrayList<Object> v_297 =  new ArrayList<Object>();
v_297.add(v_281);
v_297.add(v_281);
v_297.add(v_277);
v_297.add(v_281);
int v_300 = 0;
for (Object v_299: v_297) {
method_addfor_field_courses_of_class_Faculty.invoke(v_271, v_299);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_271, v_300).equals(v_299)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_300++;
int v_298 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_271);
if (v_298 != v_300) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_263,v_271);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_263).equals(v_271)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_263,-1251029200);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_263).equals(-1251029200)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_262.add(v_263);
v_262.add(v_277);
ArrayList<Object> v_301 =  new ArrayList<Object>();
v_301.add(v_273);
  Object v_302 = class_Course.getDeclaredConstructor().newInstance();
  Object v_303 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_303,"QYI#G0KWN");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_303).equals("QYI#G0KWN")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_304 =  new ArrayList<Object>();
v_304.add(v_277);
v_304.add(v_277);
ArrayList<Object> v_305 =  new ArrayList<Object>();
v_305.add(v_260);
  Object v_306 = class_Course.getDeclaredConstructor().newInstance();
  Object v_307 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_307,"6Q9?L");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_307).equals("6Q9?L")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_308 =  new ArrayList<Object>();
v_308.add(v_306);
v_308.add(v_263);
ArrayList<Object> v_309 =  new ArrayList<Object>();
v_309.add(v_281);
v_309.add(v_279);
v_309.add(v_306);
v_309.add(v_277);
int v_312 = 0;
for (Object v_311: v_309) {
method_addfor_field_courses_of_class_Faculty.invoke(v_307, v_311);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_307, v_312).equals(v_311)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_312++;
int v_310 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_307);
if (v_310 != v_312) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_306,v_307);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_306).equals(v_307)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_306,658262949);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_306).equals(658262949)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_305.add(v_306);
int v_315 = 0;
for (Object v_314: v_305) {
method_addfor_field_courses_of_class_Faculty.invoke(v_303, v_314);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_303, v_315).equals(v_314)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_315++;
int v_313 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_303);
if (v_313 != v_315) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_302,v_303);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_302).equals(v_303)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_302,2127653239);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_302).equals(2127653239)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_301.add(v_302);
v_301.add(v_260);
v_301.add(v_273);
int v_318 = 0;
for (Object v_317: v_301) {
method_addfor_field_courses_of_class_Faculty.invoke(v_261, v_317);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_261, v_318).equals(v_317)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_318++;
int v_316 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_261);
if (v_316 != v_318) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_260,v_261);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_260).equals(v_261)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_260,1196743831);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_260).equals(1196743831)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_259.add(v_260);
v_259.add(v_267);
ArrayList<Object> v_319 =  new ArrayList<Object>();
v_319.add(v_277);
v_319.add(v_257);
v_319.add(v_263);
int v_322 = 0;
for (Object v_321: v_319) {
method_addfor_field_courses_of_class_Faculty.invoke(v_258, v_321);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_258, v_322).equals(v_321)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_322++;
int v_320 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_258);
if (v_320 != v_322) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_257,v_261);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_257).equals(v_261)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_257,1068525565);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_257).equals(1068525565)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
  method_setfor_field_course_of_class_Grade.invoke(v_256,v_279);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_256).equals(v_279)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_256,"KO)8OSLP8QNW257>RSRB");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_256).equals("KO)8OSLP8QNW257>RSRB")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_256,(double)0.07412655879801155);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_256).equals((double)0.07412655879801155)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Grade.invoke(v_256);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Grade.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_256);
    RunAll.logln("Finished test case: 2 for Grade");
  }
  public void test_Course_2() throws Exception {
    System.out.println("Starting test case: 2 for class Course");
    RunAll.logln("Starting test case: 2 for Course");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_323 = class_Course.getDeclaredConstructor().newInstance();
  Object v_324 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_324,"MIM+NZ-*1R:=");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_324).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_325 =  new ArrayList<Object>();
v_325.add(v_323);
  Object v_326 = class_Course.getDeclaredConstructor().newInstance();
  Object v_327 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_327,"K*ZYMN.");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_327).equals("K*ZYMN.")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_328 =  new ArrayList<Object>();
v_328.add(v_323);
  Object v_329 = class_Course.getDeclaredConstructor().newInstance();
  Object v_330 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_330,")6R+N#8:7V,NN");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_330).equals(")6R+N#8:7V,NN")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_331 =  new ArrayList<Object>();
v_331.add(v_329);
v_331.add(v_329);
v_331.add(v_326);
ArrayList<Object> v_332 =  new ArrayList<Object>();
  Object v_333 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_333,v_324);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_333).equals(v_324)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_333,1087117573);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_333).equals(1087117573)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_332.add(v_333);
v_332.add(v_326);
int v_336 = 0;
for (Object v_335: v_332) {
method_addfor_field_courses_of_class_Faculty.invoke(v_330, v_335);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_330, v_336).equals(v_335)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_336++;
int v_334 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_330);
if (v_334 != v_336) {
throw new IllegalStateException("array size was not correct!");
}
}
  Object v_337 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_337,"#S@,6C2DO7UD");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_337).equals("#S@,6C2DO7UD")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_338 =  new ArrayList<Object>();
  Object v_339 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_339,v_330);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_339).equals(v_330)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_339,-1903962169);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_339).equals(-1903962169)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_338.add(v_339);
v_338.add(v_333);
  Object v_340 = class_Course.getDeclaredConstructor().newInstance();
  Object v_341 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_341,"D@$(:&3>BX)I@)F;");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_341).equals("D@$(:&3>BX)I@)F;")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_342 =  new ArrayList<Object>();
  Object v_343 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_343,v_327);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_343).equals(v_327)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_343,-1115412842);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_343).equals(-1115412842)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_342.add(v_343);
  Object v_344 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_344,v_341);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_344).equals(v_341)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_344,-669788998);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_344).equals(-669788998)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_342.add(v_344);
  Object v_345 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_345,v_341);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_345).equals(v_341)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_345,158168208);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_345).equals(158168208)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_342.add(v_345);
ArrayList<Object> v_346 =  new ArrayList<Object>();
v_346.add(v_329);
v_346.add(v_340);
  Object v_347 = class_Course.getDeclaredConstructor().newInstance();
  Object v_348 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_348,"HJ,>&82W-F;H:Y9XY'?");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_348).equals("HJ,>&82W-F;H:Y9XY'?")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_349 =  new ArrayList<Object>();
v_349.add(v_343);
v_349.add(v_323);
ArrayList<Object> v_350 =  new ArrayList<Object>();
v_350.add(v_343);
v_350.add(v_329);
int v_353 = 0;
for (Object v_352: v_350) {
method_addfor_field_courses_of_class_Faculty.invoke(v_348, v_352);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_348, v_353).equals(v_352)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_353++;
int v_351 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_348);
if (v_351 != v_353) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_347,v_348);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_347).equals(v_348)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_347,-97476661);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_347).equals(-97476661)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_346.add(v_347);
int v_356 = 0;
for (Object v_355: v_346) {
method_addfor_field_courses_of_class_Faculty.invoke(v_341, v_355);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_341, v_356).equals(v_355)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_356++;
int v_354 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_341);
if (v_354 != v_356) {
throw new IllegalStateException("array size was not correct!");
}
}
  Object v_357 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_357,"'RQE54>CK");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_357).equals("'RQE54>CK")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_358 =  new ArrayList<Object>();
v_358.add(v_344);
v_358.add(v_340);
v_358.add(v_326);
ArrayList<Object> v_359 =  new ArrayList<Object>();
v_359.add(v_345);
v_359.add(v_323);
int v_362 = 0;
for (Object v_361: v_359) {
method_addfor_field_courses_of_class_Faculty.invoke(v_357, v_361);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_357, v_362).equals(v_361)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_362++;
int v_360 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_357);
if (v_360 != v_362) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_340,v_357);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_340).equals(v_357)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_340,939571202);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_340).equals(939571202)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_338.add(v_340);
ArrayList<Object> v_363 =  new ArrayList<Object>();
v_363.add(v_347);
v_363.add(v_347);
v_363.add(v_343);
v_363.add(v_347);
int v_366 = 0;
for (Object v_365: v_363) {
method_addfor_field_courses_of_class_Faculty.invoke(v_337, v_365);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_337, v_366).equals(v_365)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_366++;
int v_364 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_337);
if (v_364 != v_366) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_329,v_337);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_329).equals(v_337)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_329,-1251029200);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_329).equals(-1251029200)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_328.add(v_329);
v_328.add(v_343);
ArrayList<Object> v_367 =  new ArrayList<Object>();
v_367.add(v_339);
  Object v_368 = class_Course.getDeclaredConstructor().newInstance();
  Object v_369 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_369,"QYI#G0KWN");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_369).equals("QYI#G0KWN")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_370 =  new ArrayList<Object>();
v_370.add(v_343);
v_370.add(v_343);
ArrayList<Object> v_371 =  new ArrayList<Object>();
v_371.add(v_326);
  Object v_372 = class_Course.getDeclaredConstructor().newInstance();
  Object v_373 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_373,"6Q9?L");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_373).equals("6Q9?L")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_374 =  new ArrayList<Object>();
v_374.add(v_372);
v_374.add(v_329);
ArrayList<Object> v_375 =  new ArrayList<Object>();
v_375.add(v_347);
v_375.add(v_345);
v_375.add(v_372);
v_375.add(v_343);
int v_378 = 0;
for (Object v_377: v_375) {
method_addfor_field_courses_of_class_Faculty.invoke(v_373, v_377);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_373, v_378).equals(v_377)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_378++;
int v_376 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_373);
if (v_376 != v_378) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_372,v_373);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_372).equals(v_373)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_372,658262949);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_372).equals(658262949)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_371.add(v_372);
int v_381 = 0;
for (Object v_380: v_371) {
method_addfor_field_courses_of_class_Faculty.invoke(v_369, v_380);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_369, v_381).equals(v_380)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_381++;
int v_379 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_369);
if (v_379 != v_381) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_368,v_369);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_368).equals(v_369)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_368,2127653239);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_368).equals(2127653239)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_367.add(v_368);
v_367.add(v_326);
v_367.add(v_339);
int v_384 = 0;
for (Object v_383: v_367) {
method_addfor_field_courses_of_class_Faculty.invoke(v_327, v_383);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_327, v_384).equals(v_383)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_384++;
int v_382 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_327);
if (v_382 != v_384) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_326,v_327);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_326).equals(v_327)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_326,1196743831);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_326).equals(1196743831)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
v_325.add(v_326);
v_325.add(v_333);
ArrayList<Object> v_385 =  new ArrayList<Object>();
v_385.add(v_343);
v_385.add(v_323);
v_385.add(v_329);
int v_388 = 0;
for (Object v_387: v_385) {
method_addfor_field_courses_of_class_Faculty.invoke(v_324, v_387);
if ( !method_getfor_field_courses_of_class_Faculty.invoke(v_324, v_388).equals(v_387)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_388++;
int v_386 = (Integer)method_numfor_field_courses_of_class_Faculty.invoke(v_324);
if (v_386 != v_388) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_323,v_327);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_323).equals(v_327)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_323,1068525565);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_323).equals(1068525565)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Course.invoke(v_323);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Course.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_323);
    RunAll.logln("Finished test case: 2 for Course");
  }
  public void runAllTests() throws Exception{
      test_Office_0();
      test_Faculty_0();
      test_Grade_0();
      test_Course_0();
      test_Office_1();
      test_Faculty_1();
      test_Grade_1();
      test_Course_1();
      test_Office_2();
      test_Faculty_2();
      test_Grade_2();
      test_Course_2();
  }
}
