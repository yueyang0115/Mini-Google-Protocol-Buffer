package hwk1.testing.arr;

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
  private Field field_taught_of_class_Faculty;
  private Method method_getfor_field_taught_of_class_Faculty;
  private Method method_setfor_field_taught_of_class_Faculty;
  private Method method_addfor_field_taught_of_class_Faculty;
  private Method method_numfor_field_taught_of_class_Faculty;
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
  private Field field_grades_of_class_Course;
  private Method method_getfor_field_grades_of_class_Course;
  private Method method_setfor_field_grades_of_class_Course;
  private Method method_addfor_field_grades_of_class_Course;
  private Method method_numfor_field_grades_of_class_Course;
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
    class_Office = Class.forName("hwk1.testing.arr.Office");
    class_Faculty = Class.forName("hwk1.testing.arr.Faculty");
    class_Grade = Class.forName("hwk1.testing.arr.Grade");
    class_Course = Class.forName("hwk1.testing.arr.Course");
    class__Deserializer = Class.forName("hwk1.testing.arr.Deserializer");
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
    field_taught_of_class_Faculty = class_Faculty.getDeclaredField("taught");
    method_getfor_field_taught_of_class_Faculty = class_Faculty.getDeclaredMethod("getTaught", Integer.TYPE);
    method_setfor_field_taught_of_class_Faculty = class_Faculty.getDeclaredMethod("setTaught", Integer.TYPE,class_Course);
    method_numfor_field_taught_of_class_Faculty = class_Faculty.getDeclaredMethod("numTaught");
    method_addfor_field_taught_of_class_Faculty = class_Faculty.getDeclaredMethod("addTaught", class_Course);
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
    field_grades_of_class_Course = class_Course.getDeclaredField("grades");
    method_getfor_field_grades_of_class_Course = class_Course.getDeclaredMethod("getGrades", Integer.TYPE);
    method_setfor_field_grades_of_class_Course = class_Course.getDeclaredMethod("setGrades", Integer.TYPE,class_Grade);
    method_numfor_field_grades_of_class_Course = class_Course.getDeclaredMethod("numGrades");
    method_addfor_field_grades_of_class_Course = class_Course.getDeclaredMethod("addGrades", class_Grade);
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
if(field_taught_of_class_Faculty.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field taught to be private, but was "+Modifier.toString(field_taught_of_class_Faculty.getModifiers()));
}
if(!method_addfor_field_taught_of_class_Faculty.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_taught_of_class_Faculty+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_taught_of_class_Faculty.getReturnType());
}
if(method_addfor_field_taught_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_taught_of_class_Faculty+" to be public , but was "+Modifier.toString(method_addfor_field_taught_of_class_Faculty.getModifiers()));
}
if(!method_numfor_field_taught_of_class_Faculty.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_taught_of_class_Faculty+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_taught_of_class_Faculty.getReturnType());
}
if(method_numfor_field_taught_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_taught_of_class_Faculty+" to be public , but was "+Modifier.toString(method_numfor_field_taught_of_class_Faculty.getModifiers()));
}
if(!method_getfor_field_taught_of_class_Faculty.getReturnType().equals(class_Course)) {
throw new IllegalStateException("Expected method "+method_getfor_field_taught_of_class_Faculty+" to have return type "+class_Course+" but was actually " +method_getfor_field_taught_of_class_Faculty.getReturnType());
}
if(method_getfor_field_taught_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_taught_of_class_Faculty+" to be public , but was "+Modifier.toString(method_getfor_field_taught_of_class_Faculty.getModifiers()));
}
if(!method_setfor_field_taught_of_class_Faculty.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_taught_of_class_Faculty+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_taught_of_class_Faculty.getReturnType());
}
if(method_setfor_field_taught_of_class_Faculty.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_taught_of_class_Faculty+" to be public , but was "+Modifier.toString(method_setfor_field_taught_of_class_Faculty.getModifiers()));
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
if(field_grades_of_class_Course.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field grades to be private, but was "+Modifier.toString(field_grades_of_class_Course.getModifiers()));
}
if(!method_addfor_field_grades_of_class_Course.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_grades_of_class_Course+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_grades_of_class_Course.getReturnType());
}
if(method_addfor_field_grades_of_class_Course.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_grades_of_class_Course+" to be public , but was "+Modifier.toString(method_addfor_field_grades_of_class_Course.getModifiers()));
}
if(!method_numfor_field_grades_of_class_Course.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_grades_of_class_Course+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_grades_of_class_Course.getReturnType());
}
if(method_numfor_field_grades_of_class_Course.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_grades_of_class_Course+" to be public , but was "+Modifier.toString(method_numfor_field_grades_of_class_Course.getModifiers()));
}
if(!method_getfor_field_grades_of_class_Course.getReturnType().equals(class_Grade)) {
throw new IllegalStateException("Expected method "+method_getfor_field_grades_of_class_Course+" to have return type "+class_Grade+" but was actually " +method_getfor_field_grades_of_class_Course.getReturnType());
}
if(method_getfor_field_grades_of_class_Course.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_grades_of_class_Course+" to be public , but was "+Modifier.toString(method_getfor_field_grades_of_class_Course.getModifiers()));
}
if(!method_setfor_field_grades_of_class_Course.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_grades_of_class_Course+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_grades_of_class_Course.getReturnType());
}
if(method_setfor_field_grades_of_class_Course.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_grades_of_class_Course+" to be public , but was "+Modifier.toString(method_setfor_field_grades_of_class_Course.getModifiers()));
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
method_addfor_field_taught_of_class_Faculty.invoke(v_2, v_6);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_2, v_7).equals(v_6)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_7++;
int v_5 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_2);
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
method_addfor_field_taught_of_class_Faculty.invoke(v_8, v_12);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_8, v_13).equals(v_12)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_13++;
int v_11 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_8);
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
method_addfor_field_taught_of_class_Faculty.invoke(v_16, v_20);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_16, v_21).equals(v_20)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_21++;
int v_19 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_16);
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
ArrayList<Object> v_22 =  new ArrayList<Object>();
ArrayList<Object> v_23 =  new ArrayList<Object>();
int v_26 = 0;
for (Object v_25: v_23) {
method_addfor_field_grades_of_class_Course.invoke(v_15, v_25);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_15, v_26).equals(v_25)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_26++;
int v_24 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_15);
if (v_24 != v_26) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_14,v_15);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_14).equals(v_15)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_14,"J;;<:VF/LEK0>");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_14).equals("J;;<:VF/LEK0>")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_14,(double)0.2742470652533411);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_14).equals((double)0.2742470652533411)) {
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
  Object v_27 = class_Course.getDeclaredConstructor().newInstance();
  Object v_28 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_28,"WFL#2;W.OOZ=OZTPHF");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_28).equals("WFL#2;W.OOZ=OZTPHF")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_29 =  new ArrayList<Object>();
ArrayList<Object> v_30 =  new ArrayList<Object>();
int v_33 = 0;
for (Object v_32: v_30) {
method_addfor_field_taught_of_class_Faculty.invoke(v_28, v_32);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_28, v_33).equals(v_32)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_33++;
int v_31 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_28);
if (v_31 != v_33) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_27,v_28);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_27).equals(v_28)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_27,-960731419);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_27).equals(-960731419)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_34 =  new ArrayList<Object>();
ArrayList<Object> v_35 =  new ArrayList<Object>();
int v_38 = 0;
for (Object v_37: v_35) {
method_addfor_field_grades_of_class_Course.invoke(v_27, v_37);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_27, v_38).equals(v_37)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_38++;
int v_36 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_27);
if (v_36 != v_38) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Course.invoke(v_27);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Course.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_27);
    RunAll.logln("Finished test case: 0 for Course");
  }
  public void test_Office_1() throws Exception {
    System.out.println("Starting test case: 1 for class Office");
    RunAll.logln("Starting test case: 1 for Office");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_39 = class_Office.getDeclaredConstructor().newInstance();
  Object v_40 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_40,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_40).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_41 =  new ArrayList<Object>();
  Object v_42 = class_Course.getDeclaredConstructor().newInstance();
  Object v_43 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_43,"W(W8W23");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_43).equals("W(W8W23")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_44 =  new ArrayList<Object>();
  Object v_45 = class_Course.getDeclaredConstructor().newInstance();
  Object v_46 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_46,"4#FOZ-EB#&48S%");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_46).equals("4#FOZ-EB#&48S%")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_47 =  new ArrayList<Object>();
v_47.add(v_42);
ArrayList<Object> v_48 =  new ArrayList<Object>();
  Object v_49 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_49,v_43);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_49).equals(v_43)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_49,484561621);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_49).equals(484561621)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_50 =  new ArrayList<Object>();
  Object v_51 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_51,v_42);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_51).equals(v_42)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_51,"Z<,A,D%L36%/?K");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_51).equals("Z<,A,D%L36%/?K")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_51,(double)0.20949273346356434);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_51).equals((double)0.20949273346356434)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_50.add(v_51);
v_50.add(v_51);
ArrayList<Object> v_52 =  new ArrayList<Object>();
  Object v_53 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_54 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_54,v_40);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_54).equals(v_40)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_54,-2066794714);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_54).equals(-2066794714)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_55 =  new ArrayList<Object>();
v_55.add(v_53);
v_55.add(v_53);
ArrayList<Object> v_56 =  new ArrayList<Object>();
v_56.add(v_51);
int v_59 = 0;
for (Object v_58: v_56) {
method_addfor_field_grades_of_class_Course.invoke(v_54, v_58);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_54, v_59).equals(v_58)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_59++;
int v_57 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_54);
if (v_57 != v_59) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_53,v_49);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_53).equals(v_49)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_53,"XV1&UCZDW9.#==HZ'");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_53).equals("XV1&UCZDW9.#==HZ'")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_53,(double)0.12367122850292422);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_53).equals((double)0.12367122850292422)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_52.add(v_53);
int v_62 = 0;
for (Object v_61: v_52) {
method_addfor_field_grades_of_class_Course.invoke(v_49, v_61);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_49, v_62).equals(v_61)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_62++;
int v_60 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_49);
if (v_60 != v_62) {
throw new IllegalStateException("array size was not correct!");
}
}
v_48.add(v_49);
v_48.add(v_54);
int v_65 = 0;
for (Object v_64: v_48) {
method_addfor_field_taught_of_class_Faculty.invoke(v_46, v_64);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_46, v_65).equals(v_64)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_65++;
int v_63 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_46);
if (v_63 != v_65) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_45,v_46);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_45).equals(v_46)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_45,2069583057);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_45).equals(2069583057)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_66 =  new ArrayList<Object>();
v_66.add(v_51);
ArrayList<Object> v_67 =  new ArrayList<Object>();
v_67.add(v_53);
int v_70 = 0;
for (Object v_69: v_67) {
method_addfor_field_grades_of_class_Course.invoke(v_45, v_69);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_45, v_70).equals(v_69)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_70++;
int v_68 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_45);
if (v_68 != v_70) {
throw new IllegalStateException("array size was not correct!");
}
}
v_44.add(v_45);
v_44.add(v_42);
ArrayList<Object> v_71 =  new ArrayList<Object>();
v_71.add(v_54);
int v_74 = 0;
for (Object v_73: v_71) {
method_addfor_field_taught_of_class_Faculty.invoke(v_43, v_73);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_43, v_74).equals(v_73)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_74++;
int v_72 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_43);
if (v_72 != v_74) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_42,v_46);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_42).equals(v_46)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_42,313644362);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_42).equals(313644362)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_75 =  new ArrayList<Object>();
  Object v_76 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_76,v_45);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_76).equals(v_45)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_76,">NYC=<,7'Q1G");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_76).equals(">NYC=<,7'Q1G")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_76,(double)0.4577001830735099);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_76).equals((double)0.4577001830735099)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_75.add(v_76);
ArrayList<Object> v_77 =  new ArrayList<Object>();
v_77.add(v_53);
  Object v_78 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_79 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_79,v_46);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_79).equals(v_46)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_79,1122391573);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_79).equals(1122391573)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_80 =  new ArrayList<Object>();
  Object v_81 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_81,v_54);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_81).equals(v_54)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_81,"8P9IU&R5T%BZEG.0EXZKT");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_81).equals("8P9IU&R5T%BZEG.0EXZKT")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_81,(double)0.9291026104275344);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_81).equals((double)0.9291026104275344)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_80.add(v_81);
ArrayList<Object> v_82 =  new ArrayList<Object>();
  Object v_83 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_84 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_84,v_40);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_84).equals(v_40)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_84,-968068014);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_84).equals(-968068014)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_85 =  new ArrayList<Object>();
v_85.add(v_78);
v_85.add(v_83);
ArrayList<Object> v_86 =  new ArrayList<Object>();
v_86.add(v_53);
v_86.add(v_76);
int v_89 = 0;
for (Object v_88: v_86) {
method_addfor_field_grades_of_class_Course.invoke(v_84, v_88);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_84, v_89).equals(v_88)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_89++;
int v_87 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_84);
if (v_87 != v_89) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_83,v_45);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_83).equals(v_45)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_83,"5.)/MMJJ>,4Z<)J");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_83).equals("5.)/MMJJ>,4Z<)J")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_83,(double)0.3226691910455337);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_83).equals((double)0.3226691910455337)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_82.add(v_83);
v_82.add(v_78);
int v_92 = 0;
for (Object v_91: v_82) {
method_addfor_field_grades_of_class_Course.invoke(v_79, v_91);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_79, v_92).equals(v_91)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_92++;
int v_90 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_79);
if (v_90 != v_92) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_78,v_49);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_78).equals(v_49)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_78,"L3(X$29U'<4D@?3");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_78).equals("L3(X$29U'<4D@?3")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_78,(double)0.376426323060411);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_78).equals((double)0.376426323060411)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_77.add(v_78);
int v_95 = 0;
for (Object v_94: v_77) {
method_addfor_field_grades_of_class_Course.invoke(v_42, v_94);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_42, v_95).equals(v_94)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_95++;
int v_93 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_42);
if (v_93 != v_95) {
throw new IllegalStateException("array size was not correct!");
}
}
v_41.add(v_42);
ArrayList<Object> v_96 =  new ArrayList<Object>();
v_96.add(v_42);
int v_99 = 0;
for (Object v_98: v_96) {
method_addfor_field_taught_of_class_Faculty.invoke(v_40, v_98);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_40, v_99).equals(v_98)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_99++;
int v_97 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_40);
if (v_97 != v_99) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_occupant_of_class_Office.invoke(v_39,v_43);
  if(!method_getfor_field_occupant_of_class_Office.invoke(v_39).equals(v_43)) {
    throw new UnsupportedOperationException("get/set for field occupant did not work correctly");
  }
  method_setfor_field_number_of_class_Office.invoke(v_39,193291713);
  if(!method_getfor_field_number_of_class_Office.invoke(v_39).equals(193291713)) {
    throw new UnsupportedOperationException("get/set for field number did not work correctly");
  }
  method_setfor_field_building_of_class_Office.invoke(v_39,"=@E.S70HP?LT/7");
  if(!method_getfor_field_building_of_class_Office.invoke(v_39).equals("=@E.S70HP?LT/7")) {
    throw new UnsupportedOperationException("get/set for field building did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Office.invoke(v_39);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Office.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_39);
    RunAll.logln("Finished test case: 1 for Office");
  }
  public void test_Faculty_1() throws Exception {
    System.out.println("Starting test case: 1 for class Faculty");
    RunAll.logln("Starting test case: 1 for Faculty");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_100 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_100,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_100).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_101 =  new ArrayList<Object>();
  Object v_102 = class_Course.getDeclaredConstructor().newInstance();
  Object v_103 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_103,"W(W8W23");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_103).equals("W(W8W23")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_104 =  new ArrayList<Object>();
  Object v_105 = class_Course.getDeclaredConstructor().newInstance();
  Object v_106 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_106,"4#FOZ-EB#&48S%");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_106).equals("4#FOZ-EB#&48S%")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_107 =  new ArrayList<Object>();
v_107.add(v_102);
ArrayList<Object> v_108 =  new ArrayList<Object>();
  Object v_109 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_109,v_103);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_109).equals(v_103)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_109,484561621);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_109).equals(484561621)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_110 =  new ArrayList<Object>();
  Object v_111 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_111,v_102);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_111).equals(v_102)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_111,"Z<,A,D%L36%/?K");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_111).equals("Z<,A,D%L36%/?K")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_111,(double)0.20949273346356434);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_111).equals((double)0.20949273346356434)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_110.add(v_111);
v_110.add(v_111);
ArrayList<Object> v_112 =  new ArrayList<Object>();
  Object v_113 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_114 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_114,v_100);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_114).equals(v_100)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_114,-2066794714);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_114).equals(-2066794714)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_115 =  new ArrayList<Object>();
v_115.add(v_113);
v_115.add(v_113);
ArrayList<Object> v_116 =  new ArrayList<Object>();
v_116.add(v_111);
int v_119 = 0;
for (Object v_118: v_116) {
method_addfor_field_grades_of_class_Course.invoke(v_114, v_118);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_114, v_119).equals(v_118)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_119++;
int v_117 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_114);
if (v_117 != v_119) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_113,v_109);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_113).equals(v_109)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_113,"XV1&UCZDW9.#==HZ'");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_113).equals("XV1&UCZDW9.#==HZ'")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_113,(double)0.12367122850292422);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_113).equals((double)0.12367122850292422)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_112.add(v_113);
int v_122 = 0;
for (Object v_121: v_112) {
method_addfor_field_grades_of_class_Course.invoke(v_109, v_121);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_109, v_122).equals(v_121)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_122++;
int v_120 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_109);
if (v_120 != v_122) {
throw new IllegalStateException("array size was not correct!");
}
}
v_108.add(v_109);
v_108.add(v_114);
int v_125 = 0;
for (Object v_124: v_108) {
method_addfor_field_taught_of_class_Faculty.invoke(v_106, v_124);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_106, v_125).equals(v_124)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_125++;
int v_123 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_106);
if (v_123 != v_125) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_105,v_106);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_105).equals(v_106)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_105,2069583057);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_105).equals(2069583057)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_126 =  new ArrayList<Object>();
v_126.add(v_111);
ArrayList<Object> v_127 =  new ArrayList<Object>();
v_127.add(v_113);
int v_130 = 0;
for (Object v_129: v_127) {
method_addfor_field_grades_of_class_Course.invoke(v_105, v_129);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_105, v_130).equals(v_129)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_130++;
int v_128 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_105);
if (v_128 != v_130) {
throw new IllegalStateException("array size was not correct!");
}
}
v_104.add(v_105);
v_104.add(v_102);
ArrayList<Object> v_131 =  new ArrayList<Object>();
v_131.add(v_114);
int v_134 = 0;
for (Object v_133: v_131) {
method_addfor_field_taught_of_class_Faculty.invoke(v_103, v_133);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_103, v_134).equals(v_133)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_134++;
int v_132 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_103);
if (v_132 != v_134) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_102,v_106);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_102).equals(v_106)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_102,313644362);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_102).equals(313644362)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_135 =  new ArrayList<Object>();
  Object v_136 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_136,v_105);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_136).equals(v_105)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_136,">NYC=<,7'Q1G");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_136).equals(">NYC=<,7'Q1G")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_136,(double)0.4577001830735099);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_136).equals((double)0.4577001830735099)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_135.add(v_136);
ArrayList<Object> v_137 =  new ArrayList<Object>();
v_137.add(v_113);
  Object v_138 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_139 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_139,v_106);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_139).equals(v_106)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_139,1122391573);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_139).equals(1122391573)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_140 =  new ArrayList<Object>();
  Object v_141 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_141,v_114);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_141).equals(v_114)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_141,"8P9IU&R5T%BZEG.0EXZKT");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_141).equals("8P9IU&R5T%BZEG.0EXZKT")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_141,(double)0.9291026104275344);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_141).equals((double)0.9291026104275344)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_140.add(v_141);
ArrayList<Object> v_142 =  new ArrayList<Object>();
  Object v_143 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_144 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_144,v_100);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_144).equals(v_100)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_144,-968068014);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_144).equals(-968068014)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_145 =  new ArrayList<Object>();
v_145.add(v_138);
v_145.add(v_143);
ArrayList<Object> v_146 =  new ArrayList<Object>();
v_146.add(v_113);
v_146.add(v_136);
int v_149 = 0;
for (Object v_148: v_146) {
method_addfor_field_grades_of_class_Course.invoke(v_144, v_148);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_144, v_149).equals(v_148)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_149++;
int v_147 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_144);
if (v_147 != v_149) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_143,v_105);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_143).equals(v_105)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_143,"5.)/MMJJ>,4Z<)J");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_143).equals("5.)/MMJJ>,4Z<)J")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_143,(double)0.3226691910455337);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_143).equals((double)0.3226691910455337)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_142.add(v_143);
v_142.add(v_138);
int v_152 = 0;
for (Object v_151: v_142) {
method_addfor_field_grades_of_class_Course.invoke(v_139, v_151);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_139, v_152).equals(v_151)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_152++;
int v_150 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_139);
if (v_150 != v_152) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_138,v_109);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_138).equals(v_109)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_138,"L3(X$29U'<4D@?3");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_138).equals("L3(X$29U'<4D@?3")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_138,(double)0.376426323060411);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_138).equals((double)0.376426323060411)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_137.add(v_138);
int v_155 = 0;
for (Object v_154: v_137) {
method_addfor_field_grades_of_class_Course.invoke(v_102, v_154);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_102, v_155).equals(v_154)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_155++;
int v_153 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_102);
if (v_153 != v_155) {
throw new IllegalStateException("array size was not correct!");
}
}
v_101.add(v_102);
ArrayList<Object> v_156 =  new ArrayList<Object>();
v_156.add(v_102);
int v_159 = 0;
for (Object v_158: v_156) {
method_addfor_field_taught_of_class_Faculty.invoke(v_100, v_158);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_100, v_159).equals(v_158)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_159++;
int v_157 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_100);
if (v_157 != v_159) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Faculty.invoke(v_100);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Faculty.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_100);
    RunAll.logln("Finished test case: 1 for Faculty");
  }
  public void test_Grade_1() throws Exception {
    System.out.println("Starting test case: 1 for class Grade");
    RunAll.logln("Starting test case: 1 for Grade");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_160 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_161 = class_Course.getDeclaredConstructor().newInstance();
  Object v_162 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_162,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_162).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_163 =  new ArrayList<Object>();
  Object v_164 = class_Course.getDeclaredConstructor().newInstance();
  Object v_165 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_165,"+RIVY7WU4#FO");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_165).equals("+RIVY7WU4#FO")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_166 =  new ArrayList<Object>();
v_166.add(v_164);
v_166.add(v_161);
ArrayList<Object> v_167 =  new ArrayList<Object>();
v_167.add(v_161);
int v_170 = 0;
for (Object v_169: v_167) {
method_addfor_field_taught_of_class_Faculty.invoke(v_165, v_169);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_165, v_170).equals(v_169)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_170++;
int v_168 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_165);
if (v_168 != v_170) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_164,v_165);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_164).equals(v_165)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_164,934594003);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_164).equals(934594003)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_171 =  new ArrayList<Object>();
v_171.add(v_160);
ArrayList<Object> v_172 =  new ArrayList<Object>();
v_172.add(v_160);
  Object v_173 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_174 = class_Course.getDeclaredConstructor().newInstance();
  Object v_175 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_175,"ZQ;W2RNJ'Z<");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_175).equals("ZQ;W2RNJ'Z<")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_176 =  new ArrayList<Object>();
v_176.add(v_164);
v_176.add(v_174);
ArrayList<Object> v_177 =  new ArrayList<Object>();
v_177.add(v_164);
int v_180 = 0;
for (Object v_179: v_177) {
method_addfor_field_taught_of_class_Faculty.invoke(v_175, v_179);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_175, v_180).equals(v_179)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_180++;
int v_178 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_175);
if (v_178 != v_180) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_174,v_162);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_174).equals(v_162)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_174,587682406);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_174).equals(587682406)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_181 =  new ArrayList<Object>();
v_181.add(v_173);
ArrayList<Object> v_182 =  new ArrayList<Object>();
v_182.add(v_173);
v_182.add(v_160);
int v_185 = 0;
for (Object v_184: v_182) {
method_addfor_field_grades_of_class_Course.invoke(v_174, v_184);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_174, v_185).equals(v_184)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_185++;
int v_183 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_174);
if (v_183 != v_185) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_173,v_174);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_173).equals(v_174)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_173,";&K'CG:MBQ:");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_173).equals(";&K'CG:MBQ:")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_173,(double)0.6995915768012877);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_173).equals((double)0.6995915768012877)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_172.add(v_173);
int v_188 = 0;
for (Object v_187: v_172) {
method_addfor_field_grades_of_class_Course.invoke(v_164, v_187);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_164, v_188).equals(v_187)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_188++;
int v_186 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_164);
if (v_186 != v_188) {
throw new IllegalStateException("array size was not correct!");
}
}
v_163.add(v_164);
ArrayList<Object> v_189 =  new ArrayList<Object>();
  Object v_190 = class_Course.getDeclaredConstructor().newInstance();
  Object v_191 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_191,"XV1&UCZDW9.#==HZ'");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_191).equals("XV1&UCZDW9.#==HZ'")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_192 =  new ArrayList<Object>();
v_192.add(v_161);
v_192.add(v_161);
ArrayList<Object> v_193 =  new ArrayList<Object>();
v_193.add(v_190);
v_193.add(v_174);
int v_196 = 0;
for (Object v_195: v_193) {
method_addfor_field_taught_of_class_Faculty.invoke(v_191, v_195);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_191, v_196).equals(v_195)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_196++;
int v_194 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_191);
if (v_194 != v_196) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_190,v_191);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_190).equals(v_191)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_190,1142045419);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_190).equals(1142045419)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_197 =  new ArrayList<Object>();
v_197.add(v_160);
ArrayList<Object> v_198 =  new ArrayList<Object>();
  Object v_199 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_199,v_190);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_199).equals(v_190)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_199,"&?,QL92GFOE>NYC");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_199).equals("&?,QL92GFOE>NYC")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_199,(double)0.2712933251747158);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_199).equals((double)0.2712933251747158)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_198.add(v_199);
v_198.add(v_199);
int v_202 = 0;
for (Object v_201: v_198) {
method_addfor_field_grades_of_class_Course.invoke(v_190, v_201);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_190, v_202).equals(v_201)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_202++;
int v_200 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_190);
if (v_200 != v_202) {
throw new IllegalStateException("array size was not correct!");
}
}
v_189.add(v_190);
v_189.add(v_190);
int v_205 = 0;
for (Object v_204: v_189) {
method_addfor_field_taught_of_class_Faculty.invoke(v_162, v_204);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_162, v_205).equals(v_204)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_205++;
int v_203 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_162);
if (v_203 != v_205) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_161,v_162);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_161).equals(v_162)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_161,187701662);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_161).equals(187701662)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_206 =  new ArrayList<Object>();
v_206.add(v_173);
ArrayList<Object> v_207 =  new ArrayList<Object>();
  Object v_208 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_208,v_164);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_208).equals(v_164)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_208,"%CKTQ.8P9");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_208).equals("%CKTQ.8P9")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_208,(double)0.3154227864574829);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_208).equals((double)0.3154227864574829)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_207.add(v_208);
int v_211 = 0;
for (Object v_210: v_207) {
method_addfor_field_grades_of_class_Course.invoke(v_161, v_210);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_161, v_211).equals(v_210)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_211++;
int v_209 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_161);
if (v_209 != v_211) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_160,v_190);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_160).equals(v_190)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_160,"HX#9T3W//N3@Z$1UZW");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_160).equals("HX#9T3W//N3@Z$1UZW")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_160,(double)0.04217868395172397);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_160).equals((double)0.04217868395172397)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Grade.invoke(v_160);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Grade.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_160);
    RunAll.logln("Finished test case: 1 for Grade");
  }
  public void test_Course_1() throws Exception {
    System.out.println("Starting test case: 1 for class Course");
    RunAll.logln("Starting test case: 1 for Course");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_212 = class_Course.getDeclaredConstructor().newInstance();
  Object v_213 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_213,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_213).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_214 =  new ArrayList<Object>();
  Object v_215 = class_Course.getDeclaredConstructor().newInstance();
  Object v_216 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_216,"+RIVY7WU4#FO");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_216).equals("+RIVY7WU4#FO")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_217 =  new ArrayList<Object>();
v_217.add(v_215);
v_217.add(v_212);
ArrayList<Object> v_218 =  new ArrayList<Object>();
v_218.add(v_212);
int v_221 = 0;
for (Object v_220: v_218) {
method_addfor_field_taught_of_class_Faculty.invoke(v_216, v_220);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_216, v_221).equals(v_220)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_221++;
int v_219 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_216);
if (v_219 != v_221) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_215,v_216);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_215).equals(v_216)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_215,934594003);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_215).equals(934594003)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_222 =  new ArrayList<Object>();
  Object v_223 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_224 = class_Course.getDeclaredConstructor().newInstance();
  Object v_225 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_225,"ZQ;W2RNJ'Z<");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_225).equals("ZQ;W2RNJ'Z<")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_226 =  new ArrayList<Object>();
v_226.add(v_215);
v_226.add(v_224);
ArrayList<Object> v_227 =  new ArrayList<Object>();
v_227.add(v_215);
int v_230 = 0;
for (Object v_229: v_227) {
method_addfor_field_taught_of_class_Faculty.invoke(v_225, v_229);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_225, v_230).equals(v_229)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_230++;
int v_228 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_225);
if (v_228 != v_230) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_224,v_225);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_224).equals(v_225)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_224,1841614017);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_224).equals(1841614017)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_231 =  new ArrayList<Object>();
v_231.add(v_223);
ArrayList<Object> v_232 =  new ArrayList<Object>();
  Object v_233 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_234 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_234,v_213);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_234).equals(v_213)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_234,741521057);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_234).equals(741521057)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_235 =  new ArrayList<Object>();
  Object v_236 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_236,v_212);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_236).equals(v_212)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_236,"-%Z<(>8+V(L");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_236).equals("-%Z<(>8+V(L")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_236,(double)0.37287330937352725);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_236).equals((double)0.37287330937352725)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_235.add(v_236);
ArrayList<Object> v_237 =  new ArrayList<Object>();
  Object v_238 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_238,v_234);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_238).equals(v_234)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_238,"AA&+():6GQ4PK(.(UG");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_238).equals("AA&+():6GQ4PK(.(UG")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_238,(double)0.3533391893503619);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_238).equals((double)0.3533391893503619)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_237.add(v_238);
v_237.add(v_236);
int v_241 = 0;
for (Object v_240: v_237) {
method_addfor_field_grades_of_class_Course.invoke(v_234, v_240);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_234, v_241).equals(v_240)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_241++;
int v_239 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_234);
if (v_239 != v_241) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_233,v_234);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_233).equals(v_234)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_233,"JW-61#M.>##5HJ");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_233).equals("JW-61#M.>##5HJ")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_233,(double)0.061901802278626294);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_233).equals((double)0.061901802278626294)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_232.add(v_233);
v_232.add(v_238);
int v_244 = 0;
for (Object v_243: v_232) {
method_addfor_field_grades_of_class_Course.invoke(v_224, v_243);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_224, v_244).equals(v_243)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_244++;
int v_242 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_224);
if (v_242 != v_244) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_223,v_224);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_223).equals(v_224)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_223,"IU&R5T%BZEG.0EX");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_223).equals("IU&R5T%BZEG.0EX")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_223,(double)0.577427144994879);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_223).equals((double)0.577427144994879)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_222.add(v_223);
ArrayList<Object> v_245 =  new ArrayList<Object>();
v_245.add(v_238);
v_245.add(v_233);
int v_248 = 0;
for (Object v_247: v_245) {
method_addfor_field_grades_of_class_Course.invoke(v_215, v_247);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_215, v_248).equals(v_247)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_248++;
int v_246 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_215);
if (v_246 != v_248) {
throw new IllegalStateException("array size was not correct!");
}
}
v_214.add(v_215);
ArrayList<Object> v_249 =  new ArrayList<Object>();
v_249.add(v_234);
v_249.add(v_212);
int v_252 = 0;
for (Object v_251: v_249) {
method_addfor_field_taught_of_class_Faculty.invoke(v_213, v_251);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_213, v_252).equals(v_251)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_252++;
int v_250 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_213);
if (v_250 != v_252) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_212,v_213);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_212).equals(v_213)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_212,-1948308979);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_212).equals(-1948308979)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_253 =  new ArrayList<Object>();
v_253.add(v_238);
  Object v_254 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_254,v_215);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_254).equals(v_215)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_254,"O82/P");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_254).equals("O82/P")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_254,(double)0.7975630575736324);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_254).equals((double)0.7975630575736324)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_253.add(v_254);
ArrayList<Object> v_255 =  new ArrayList<Object>();
  Object v_256 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_256,v_215);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_256).equals(v_215)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_256,"ITAU7UR2F16:6");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_256).equals("ITAU7UR2F16:6")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_256,(double)0.7803252822027569);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_256).equals((double)0.7803252822027569)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_255.add(v_256);
v_255.add(v_254);
int v_259 = 0;
for (Object v_258: v_255) {
method_addfor_field_grades_of_class_Course.invoke(v_212, v_258);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_212, v_259).equals(v_258)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_259++;
int v_257 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_212);
if (v_257 != v_259) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Course.invoke(v_212);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Course.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_212);
    RunAll.logln("Finished test case: 1 for Course");
  }
  public void test_Office_2() throws Exception {
    System.out.println("Starting test case: 2 for class Office");
    RunAll.logln("Starting test case: 2 for Office");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_260 = class_Office.getDeclaredConstructor().newInstance();
  Object v_261 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_261,"MIM+NZ-*1R:=");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_261).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_262 =  new ArrayList<Object>();
  Object v_263 = class_Course.getDeclaredConstructor().newInstance();
  Object v_264 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_264,"+A2K*ZYMN.01-");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_264).equals("+A2K*ZYMN.01-")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_265 =  new ArrayList<Object>();
  Object v_266 = class_Course.getDeclaredConstructor().newInstance();
  Object v_267 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_267,"7SM@");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_267).equals("7SM@")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_268 =  new ArrayList<Object>();
v_268.add(v_266);
v_268.add(v_266);
v_268.add(v_266);
ArrayList<Object> v_269 =  new ArrayList<Object>();
  Object v_270 = class_Course.getDeclaredConstructor().newInstance();
  Object v_271 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_271,"#S@,6C2DO7UD");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_271).equals("#S@,6C2DO7UD")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_272 =  new ArrayList<Object>();
v_272.add(v_270);
v_272.add(v_263);
v_272.add(v_263);
ArrayList<Object> v_273 =  new ArrayList<Object>();
  Object v_274 = class_Course.getDeclaredConstructor().newInstance();
  Object v_275 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_275,"(:&3>BX)I");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_275).equals("(:&3>BX)I")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_276 =  new ArrayList<Object>();
v_276.add(v_270);
v_276.add(v_266);
v_276.add(v_270);
v_276.add(v_266);
ArrayList<Object> v_277 =  new ArrayList<Object>();
v_277.add(v_270);
  Object v_278 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_278,v_271);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_278).equals(v_271)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_278,1158832829);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_278).equals(1158832829)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_279 =  new ArrayList<Object>();
  Object v_280 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_280,v_263);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_280).equals(v_263)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_280,"=6J:X-");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_280).equals("=6J:X-")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_280,(double)0.03981162219064538);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_280).equals((double)0.03981162219064538)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_279.add(v_280);
  Object v_281 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_282 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_282,v_275);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_282).equals(v_275)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_282,404193831);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_282).equals(404193831)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_283 =  new ArrayList<Object>();
  Object v_284 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_285 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_285,v_271);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_285).equals(v_271)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_285,296264465);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_285).equals(296264465)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_286 =  new ArrayList<Object>();
  Object v_287 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_288 = class_Course.getDeclaredConstructor().newInstance();
  Object v_289 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_289,">V+0.T)?O>3&1");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_289).equals(">V+0.T)?O>3&1")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_290 =  new ArrayList<Object>();
v_290.add(v_263);
v_290.add(v_274);
ArrayList<Object> v_291 =  new ArrayList<Object>();
  Object v_292 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_292,v_275);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_292).equals(v_275)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_292,-664763703);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_292).equals(-664763703)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_293 =  new ArrayList<Object>();
v_293.add(v_281);
  Object v_294 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_294,v_263);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_294).equals(v_263)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_294,"R#M)3*Y>)7#0@Y");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_294).equals("R#M)3*Y>)7#0@Y")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_294,(double)0.5610249289825382);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_294).equals((double)0.5610249289825382)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_293.add(v_294);
v_293.add(v_294);
v_293.add(v_284);
ArrayList<Object> v_295 =  new ArrayList<Object>();
v_295.add(v_287);
v_295.add(v_280);
int v_298 = 0;
for (Object v_297: v_295) {
method_addfor_field_grades_of_class_Course.invoke(v_292, v_297);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_292, v_298).equals(v_297)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_298++;
int v_296 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_292);
if (v_296 != v_298) {
throw new IllegalStateException("array size was not correct!");
}
}
v_291.add(v_292);
v_291.add(v_270);
v_291.add(v_266);
int v_301 = 0;
for (Object v_300: v_291) {
method_addfor_field_taught_of_class_Faculty.invoke(v_289, v_300);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_289, v_301).equals(v_300)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_301++;
int v_299 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_289);
if (v_299 != v_301) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_288,v_289);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_288).equals(v_289)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_288,525118796);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_288).equals(525118796)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_302 =  new ArrayList<Object>();
v_302.add(v_281);
  Object v_303 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_304 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_304,v_264);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_304).equals(v_264)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_304,-1405584085);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_304).equals(-1405584085)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_305 =  new ArrayList<Object>();
  Object v_306 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_306,v_266);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_306).equals(v_266)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_306,"+=6Q9?L:J%U,U");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_306).equals("+=6Q9?L:J%U,U")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_306,(double)0.0019467793891397855);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_306).equals((double)0.0019467793891397855)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_305.add(v_306);
v_305.add(v_281);
v_305.add(v_306);
ArrayList<Object> v_307 =  new ArrayList<Object>();
v_307.add(v_287);
v_307.add(v_287);
v_307.add(v_306);
int v_310 = 0;
for (Object v_309: v_307) {
method_addfor_field_grades_of_class_Course.invoke(v_304, v_309);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_304, v_310).equals(v_309)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_310++;
int v_308 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_304);
if (v_308 != v_310) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_303,v_274);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_303).equals(v_274)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_303,"ZD1>?Z=KO");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_303).equals("ZD1>?Z=KO")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_303,(double)0.19276211512766028);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_303).equals((double)0.19276211512766028)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_302.add(v_303);
ArrayList<Object> v_311 =  new ArrayList<Object>();
v_311.add(v_280);
  Object v_312 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_313 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_313,v_271);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_313).equals(v_271)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_313,1171158952);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_313).equals(1171158952)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_314 =  new ArrayList<Object>();
v_314.add(v_303);
v_314.add(v_284);
ArrayList<Object> v_315 =  new ArrayList<Object>();
v_315.add(v_281);
  Object v_316 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_317 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_317,v_264);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_317).equals(v_264)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_317,1370953562);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_317).equals(1370953562)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_318 =  new ArrayList<Object>();
  Object v_319 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_319,v_263);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_319).equals(v_263)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_319,"?55V3%RPDMY3-%$AE7&");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_319).equals("?55V3%RPDMY3-%$AE7&")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_319,(double)0.6353780931142169);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_319).equals((double)0.6353780931142169)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_318.add(v_319);
v_318.add(v_284);
ArrayList<Object> v_320 =  new ArrayList<Object>();
v_320.add(v_312);
v_320.add(v_284);
v_320.add(v_287);
int v_323 = 0;
for (Object v_322: v_320) {
method_addfor_field_grades_of_class_Course.invoke(v_317, v_322);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_317, v_323).equals(v_322)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_323++;
int v_321 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_317);
if (v_321 != v_323) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_316,v_274);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_316).equals(v_274)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_316,";;2FU-QGLX%>");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_316).equals(";;2FU-QGLX%>")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_316,(double)0.7787495656426328);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_316).equals((double)0.7787495656426328)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_315.add(v_316);
v_315.add(v_294);
int v_326 = 0;
for (Object v_325: v_315) {
method_addfor_field_grades_of_class_Course.invoke(v_313, v_325);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_313, v_326).equals(v_325)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_326++;
int v_324 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_313);
if (v_324 != v_326) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_312,v_313);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_312).equals(v_313)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_312,"1#.004L3J>KXX7)PDZ");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_312).equals("1#.004L3J>KXX7)PDZ")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_312,(double)0.10996491175436907);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_312).equals((double)0.10996491175436907)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_311.add(v_312);
v_311.add(v_294);
int v_329 = 0;
for (Object v_328: v_311) {
method_addfor_field_grades_of_class_Course.invoke(v_288, v_328);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_288, v_329).equals(v_328)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_329++;
int v_327 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_288);
if (v_327 != v_329) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_287,v_288);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_287).equals(v_288)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_287,"+1O+LZ85$Z3)8A&");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_287).equals("+1O+LZ85$Z3)8A&")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_287,(double)0.828574639042742);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_287).equals((double)0.828574639042742)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_286.add(v_287);
v_286.add(v_306);
ArrayList<Object> v_330 =  new ArrayList<Object>();
  Object v_331 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_331,v_263);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_331).equals(v_263)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_331,"F2;PC)5O%B");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_331).equals("F2;PC)5O%B")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_331,(double)0.9594619025589539);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_331).equals((double)0.9594619025589539)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_330.add(v_331);
v_330.add(v_316);
int v_334 = 0;
for (Object v_333: v_330) {
method_addfor_field_grades_of_class_Course.invoke(v_285, v_333);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_285, v_334).equals(v_333)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_334++;
int v_332 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_285);
if (v_332 != v_334) {
throw new IllegalStateException("array size was not correct!");
}
}
  Object v_335 = class_Course.getDeclaredConstructor().newInstance();
  Object v_336 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_336,"A)1OI&>73SOF");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_336).equals("A)1OI&>73SOF")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_337 =  new ArrayList<Object>();
v_337.add(v_304);
v_337.add(v_335);
v_337.add(v_335);
v_337.add(v_278);
ArrayList<Object> v_338 =  new ArrayList<Object>();
v_338.add(v_285);
v_338.add(v_313);
v_338.add(v_266);
v_338.add(v_292);
int v_341 = 0;
for (Object v_340: v_338) {
method_addfor_field_taught_of_class_Faculty.invoke(v_336, v_340);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_336, v_341).equals(v_340)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_341++;
int v_339 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_336);
if (v_339 != v_341) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_335,v_264);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_335).equals(v_264)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_335,-472211233);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_335).equals(-472211233)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_342 =  new ArrayList<Object>();
v_342.add(v_306);
v_342.add(v_312);
v_342.add(v_281);
v_342.add(v_280);
ArrayList<Object> v_343 =  new ArrayList<Object>();
v_343.add(v_294);
  Object v_344 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_344,v_263);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_344).equals(v_263)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_344,"X:.68");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_344).equals("X:.68")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_344,(double)0.8802902987141683);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_344).equals((double)0.8802902987141683)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_343.add(v_344);
v_343.add(v_312);
v_343.add(v_344);
int v_347 = 0;
for (Object v_346: v_343) {
method_addfor_field_grades_of_class_Course.invoke(v_335, v_346);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_335, v_347).equals(v_346)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_347++;
int v_345 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_335);
if (v_345 != v_347) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_284,v_335);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_284).equals(v_335)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_284,"6M?E2JH%>CPW5+>");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_284).equals("6M?E2JH%>CPW5+>")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_284,(double)0.8150889677584953);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_284).equals((double)0.8150889677584953)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_283.add(v_284);
v_283.add(v_312);
v_283.add(v_344);
ArrayList<Object> v_348 =  new ArrayList<Object>();
v_348.add(v_312);
v_348.add(v_331);
int v_351 = 0;
for (Object v_350: v_348) {
method_addfor_field_grades_of_class_Course.invoke(v_282, v_350);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_282, v_351).equals(v_350)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_351++;
int v_349 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_282);
if (v_349 != v_351) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_281,v_282);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_281).equals(v_282)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_281,"..4<4UW");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_281).equals("..4<4UW")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_281,(double)0.34347486390225235);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_281).equals((double)0.34347486390225235)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_279.add(v_281);
v_279.add(v_287);
v_279.add(v_284);
ArrayList<Object> v_352 =  new ArrayList<Object>();
v_352.add(v_316);
v_352.add(v_306);
int v_355 = 0;
for (Object v_354: v_352) {
method_addfor_field_grades_of_class_Course.invoke(v_278, v_354);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_278, v_355).equals(v_354)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_355++;
int v_353 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_278);
if (v_353 != v_355) {
throw new IllegalStateException("array size was not correct!");
}
}
v_277.add(v_278);
int v_358 = 0;
for (Object v_357: v_277) {
method_addfor_field_taught_of_class_Faculty.invoke(v_275, v_357);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_275, v_358).equals(v_357)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_358++;
int v_356 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_275);
if (v_356 != v_358) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_274,v_267);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_274).equals(v_267)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_274,-1642437759);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_274).equals(-1642437759)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_359 =  new ArrayList<Object>();
  Object v_360 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_360,v_278);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_360).equals(v_278)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_360,">4N8RK+7C6=G");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_360).equals(">4N8RK+7C6=G")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_360,(double)0.3709533526504264);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_360).equals((double)0.3709533526504264)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_359.add(v_360);
v_359.add(v_344);
ArrayList<Object> v_361 =  new ArrayList<Object>();
  Object v_362 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_362,v_317);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_362).equals(v_317)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_362,"KT-");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_362).equals("KT-")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_362,(double)0.26210011541420475);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_362).equals((double)0.26210011541420475)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_361.add(v_362);
v_361.add(v_281);
int v_365 = 0;
for (Object v_364: v_361) {
method_addfor_field_grades_of_class_Course.invoke(v_274, v_364);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_274, v_365).equals(v_364)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_365++;
int v_363 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_274);
if (v_363 != v_365) {
throw new IllegalStateException("array size was not correct!");
}
}
v_273.add(v_274);
v_273.add(v_274);
int v_368 = 0;
for (Object v_367: v_273) {
method_addfor_field_taught_of_class_Faculty.invoke(v_271, v_367);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_271, v_368).equals(v_367)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_368++;
int v_366 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_271);
if (v_366 != v_368) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_270,v_267);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_270).equals(v_267)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_270,-2031929791);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_270).equals(-2031929791)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_369 =  new ArrayList<Object>();
v_369.add(v_306);
v_369.add(v_303);
v_369.add(v_284);
ArrayList<Object> v_370 =  new ArrayList<Object>();
v_370.add(v_344);
v_370.add(v_280);
  Object v_371 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_371,v_282);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_371).equals(v_282)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_371,"=.;-K7M9O2L4#K''");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_371).equals("=.;-K7M9O2L4#K''")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_371,(double)0.3542539173723468);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_371).equals((double)0.3542539173723468)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_370.add(v_371);
int v_374 = 0;
for (Object v_373: v_370) {
method_addfor_field_grades_of_class_Course.invoke(v_270, v_373);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_270, v_374).equals(v_373)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_374++;
int v_372 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_270);
if (v_372 != v_374) {
throw new IllegalStateException("array size was not correct!");
}
}
v_269.add(v_270);
v_269.add(v_278);
int v_377 = 0;
for (Object v_376: v_269) {
method_addfor_field_taught_of_class_Faculty.invoke(v_267, v_376);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_267, v_377).equals(v_376)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_377++;
int v_375 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_267);
if (v_375 != v_377) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_266,v_271);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_266).equals(v_271)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_266,-207173010);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_266).equals(-207173010)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_378 =  new ArrayList<Object>();
v_378.add(v_294);
v_378.add(v_316);
v_378.add(v_316);
v_378.add(v_287);
ArrayList<Object> v_379 =  new ArrayList<Object>();
v_379.add(v_316);
v_379.add(v_287);
v_379.add(v_344);
int v_382 = 0;
for (Object v_381: v_379) {
method_addfor_field_grades_of_class_Course.invoke(v_266, v_381);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_266, v_382).equals(v_381)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_382++;
int v_380 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_266);
if (v_380 != v_382) {
throw new IllegalStateException("array size was not correct!");
}
}
v_265.add(v_266);
v_265.add(v_335);
v_265.add(v_270);
v_265.add(v_285);
ArrayList<Object> v_383 =  new ArrayList<Object>();
v_383.add(v_274);
  Object v_384 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_384,v_336);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_384).equals(v_336)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_384,-71374940);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_384).equals(-71374940)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_385 =  new ArrayList<Object>();
  Object v_386 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_386,v_313);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_386).equals(v_313)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_386,"6N29PXQZQHX$9NV&3?");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_386).equals("6N29PXQZQHX$9NV&3?")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_386,(double)0.41164113261789403);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_386).equals((double)0.41164113261789403)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_385.add(v_386);
v_385.add(v_306);
v_385.add(v_294);
v_385.add(v_319);
ArrayList<Object> v_387 =  new ArrayList<Object>();
v_387.add(v_316);
v_387.add(v_344);
v_387.add(v_284);
int v_390 = 0;
for (Object v_389: v_387) {
method_addfor_field_grades_of_class_Course.invoke(v_384, v_389);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_384, v_390).equals(v_389)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_390++;
int v_388 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_384);
if (v_388 != v_390) {
throw new IllegalStateException("array size was not correct!");
}
}
v_383.add(v_384);
v_383.add(v_282);
v_383.add(v_263);
int v_393 = 0;
for (Object v_392: v_383) {
method_addfor_field_taught_of_class_Faculty.invoke(v_264, v_392);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_264, v_393).equals(v_392)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_393++;
int v_391 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_264);
if (v_391 != v_393) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_263,v_264);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_263).equals(v_264)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_263,341107274);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_263).equals(341107274)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_394 =  new ArrayList<Object>();
v_394.add(v_360);
v_394.add(v_303);
v_394.add(v_316);
v_394.add(v_360);
ArrayList<Object> v_395 =  new ArrayList<Object>();
v_395.add(v_281);
v_395.add(v_371);
int v_398 = 0;
for (Object v_397: v_395) {
method_addfor_field_grades_of_class_Course.invoke(v_263, v_397);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_263, v_398).equals(v_397)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_398++;
int v_396 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_263);
if (v_396 != v_398) {
throw new IllegalStateException("array size was not correct!");
}
}
v_262.add(v_263);
v_262.add(v_292);
v_262.add(v_313);
ArrayList<Object> v_399 =  new ArrayList<Object>();
v_399.add(v_282);
v_399.add(v_282);
v_399.add(v_266);
v_399.add(v_278);
int v_402 = 0;
for (Object v_401: v_399) {
method_addfor_field_taught_of_class_Faculty.invoke(v_261, v_401);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_261, v_402).equals(v_401)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_402++;
int v_400 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_261);
if (v_400 != v_402) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_occupant_of_class_Office.invoke(v_260,v_261);
  if(!method_getfor_field_occupant_of_class_Office.invoke(v_260).equals(v_261)) {
    throw new UnsupportedOperationException("get/set for field occupant did not work correctly");
  }
  method_setfor_field_number_of_class_Office.invoke(v_260,-471138891);
  if(!method_getfor_field_number_of_class_Office.invoke(v_260).equals(-471138891)) {
    throw new UnsupportedOperationException("get/set for field number did not work correctly");
  }
  method_setfor_field_building_of_class_Office.invoke(v_260,"(O0(RKO#920H=.G");
  if(!method_getfor_field_building_of_class_Office.invoke(v_260).equals("(O0(RKO#920H=.G")) {
    throw new UnsupportedOperationException("get/set for field building did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Office.invoke(v_260);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Office.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_260);
    RunAll.logln("Finished test case: 2 for Office");
  }
  public void test_Faculty_2() throws Exception {
    System.out.println("Starting test case: 2 for class Faculty");
    RunAll.logln("Starting test case: 2 for Faculty");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_403 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_403,"MIM+NZ-*1R:=");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_403).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_404 =  new ArrayList<Object>();
  Object v_405 = class_Course.getDeclaredConstructor().newInstance();
  Object v_406 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_406,"+A2K*ZYMN.01-");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_406).equals("+A2K*ZYMN.01-")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_407 =  new ArrayList<Object>();
  Object v_408 = class_Course.getDeclaredConstructor().newInstance();
  Object v_409 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_409,"7SM@");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_409).equals("7SM@")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_410 =  new ArrayList<Object>();
v_410.add(v_408);
v_410.add(v_408);
v_410.add(v_408);
ArrayList<Object> v_411 =  new ArrayList<Object>();
  Object v_412 = class_Course.getDeclaredConstructor().newInstance();
  Object v_413 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_413,"#S@,6C2DO7UD");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_413).equals("#S@,6C2DO7UD")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_414 =  new ArrayList<Object>();
v_414.add(v_412);
v_414.add(v_405);
v_414.add(v_405);
ArrayList<Object> v_415 =  new ArrayList<Object>();
  Object v_416 = class_Course.getDeclaredConstructor().newInstance();
  Object v_417 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_417,"(:&3>BX)I");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_417).equals("(:&3>BX)I")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_418 =  new ArrayList<Object>();
v_418.add(v_412);
v_418.add(v_408);
v_418.add(v_412);
v_418.add(v_408);
ArrayList<Object> v_419 =  new ArrayList<Object>();
v_419.add(v_412);
  Object v_420 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_420,v_413);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_420).equals(v_413)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_420,1158832829);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_420).equals(1158832829)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_421 =  new ArrayList<Object>();
  Object v_422 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_422,v_405);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_422).equals(v_405)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_422,"=6J:X-");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_422).equals("=6J:X-")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_422,(double)0.03981162219064538);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_422).equals((double)0.03981162219064538)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_421.add(v_422);
  Object v_423 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_424 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_424,v_417);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_424).equals(v_417)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_424,404193831);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_424).equals(404193831)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_425 =  new ArrayList<Object>();
  Object v_426 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_427 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_427,v_413);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_427).equals(v_413)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_427,296264465);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_427).equals(296264465)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_428 =  new ArrayList<Object>();
  Object v_429 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_430 = class_Course.getDeclaredConstructor().newInstance();
  Object v_431 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_431,">V+0.T)?O>3&1");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_431).equals(">V+0.T)?O>3&1")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_432 =  new ArrayList<Object>();
v_432.add(v_405);
v_432.add(v_416);
ArrayList<Object> v_433 =  new ArrayList<Object>();
  Object v_434 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_434,v_417);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_434).equals(v_417)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_434,-664763703);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_434).equals(-664763703)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_435 =  new ArrayList<Object>();
v_435.add(v_423);
  Object v_436 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_436,v_405);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_436).equals(v_405)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_436,"R#M)3*Y>)7#0@Y");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_436).equals("R#M)3*Y>)7#0@Y")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_436,(double)0.5610249289825382);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_436).equals((double)0.5610249289825382)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_435.add(v_436);
v_435.add(v_436);
v_435.add(v_426);
ArrayList<Object> v_437 =  new ArrayList<Object>();
v_437.add(v_429);
v_437.add(v_422);
int v_440 = 0;
for (Object v_439: v_437) {
method_addfor_field_grades_of_class_Course.invoke(v_434, v_439);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_434, v_440).equals(v_439)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_440++;
int v_438 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_434);
if (v_438 != v_440) {
throw new IllegalStateException("array size was not correct!");
}
}
v_433.add(v_434);
v_433.add(v_412);
v_433.add(v_408);
int v_443 = 0;
for (Object v_442: v_433) {
method_addfor_field_taught_of_class_Faculty.invoke(v_431, v_442);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_431, v_443).equals(v_442)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_443++;
int v_441 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_431);
if (v_441 != v_443) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_430,v_431);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_430).equals(v_431)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_430,525118796);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_430).equals(525118796)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_444 =  new ArrayList<Object>();
v_444.add(v_423);
  Object v_445 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_446 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_446,v_406);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_446).equals(v_406)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_446,-1405584085);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_446).equals(-1405584085)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_447 =  new ArrayList<Object>();
  Object v_448 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_448,v_408);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_448).equals(v_408)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_448,"+=6Q9?L:J%U,U");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_448).equals("+=6Q9?L:J%U,U")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_448,(double)0.0019467793891397855);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_448).equals((double)0.0019467793891397855)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_447.add(v_448);
v_447.add(v_423);
v_447.add(v_448);
ArrayList<Object> v_449 =  new ArrayList<Object>();
v_449.add(v_429);
v_449.add(v_429);
v_449.add(v_448);
int v_452 = 0;
for (Object v_451: v_449) {
method_addfor_field_grades_of_class_Course.invoke(v_446, v_451);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_446, v_452).equals(v_451)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_452++;
int v_450 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_446);
if (v_450 != v_452) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_445,v_416);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_445).equals(v_416)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_445,"ZD1>?Z=KO");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_445).equals("ZD1>?Z=KO")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_445,(double)0.19276211512766028);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_445).equals((double)0.19276211512766028)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_444.add(v_445);
ArrayList<Object> v_453 =  new ArrayList<Object>();
v_453.add(v_422);
  Object v_454 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_455 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_455,v_413);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_455).equals(v_413)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_455,1171158952);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_455).equals(1171158952)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_456 =  new ArrayList<Object>();
v_456.add(v_445);
v_456.add(v_426);
ArrayList<Object> v_457 =  new ArrayList<Object>();
v_457.add(v_423);
  Object v_458 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_459 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_459,v_406);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_459).equals(v_406)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_459,1370953562);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_459).equals(1370953562)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_460 =  new ArrayList<Object>();
  Object v_461 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_461,v_405);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_461).equals(v_405)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_461,"?55V3%RPDMY3-%$AE7&");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_461).equals("?55V3%RPDMY3-%$AE7&")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_461,(double)0.6353780931142169);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_461).equals((double)0.6353780931142169)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_460.add(v_461);
v_460.add(v_426);
ArrayList<Object> v_462 =  new ArrayList<Object>();
v_462.add(v_454);
v_462.add(v_426);
v_462.add(v_429);
int v_465 = 0;
for (Object v_464: v_462) {
method_addfor_field_grades_of_class_Course.invoke(v_459, v_464);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_459, v_465).equals(v_464)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_465++;
int v_463 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_459);
if (v_463 != v_465) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_458,v_416);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_458).equals(v_416)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_458,";;2FU-QGLX%>");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_458).equals(";;2FU-QGLX%>")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_458,(double)0.7787495656426328);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_458).equals((double)0.7787495656426328)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_457.add(v_458);
v_457.add(v_436);
int v_468 = 0;
for (Object v_467: v_457) {
method_addfor_field_grades_of_class_Course.invoke(v_455, v_467);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_455, v_468).equals(v_467)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_468++;
int v_466 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_455);
if (v_466 != v_468) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_454,v_455);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_454).equals(v_455)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_454,"1#.004L3J>KXX7)PDZ");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_454).equals("1#.004L3J>KXX7)PDZ")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_454,(double)0.10996491175436907);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_454).equals((double)0.10996491175436907)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_453.add(v_454);
v_453.add(v_436);
int v_471 = 0;
for (Object v_470: v_453) {
method_addfor_field_grades_of_class_Course.invoke(v_430, v_470);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_430, v_471).equals(v_470)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_471++;
int v_469 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_430);
if (v_469 != v_471) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_429,v_430);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_429).equals(v_430)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_429,"+1O+LZ85$Z3)8A&");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_429).equals("+1O+LZ85$Z3)8A&")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_429,(double)0.828574639042742);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_429).equals((double)0.828574639042742)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_428.add(v_429);
v_428.add(v_448);
ArrayList<Object> v_472 =  new ArrayList<Object>();
  Object v_473 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_473,v_405);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_473).equals(v_405)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_473,"F2;PC)5O%B");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_473).equals("F2;PC)5O%B")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_473,(double)0.9594619025589539);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_473).equals((double)0.9594619025589539)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_472.add(v_473);
v_472.add(v_458);
int v_476 = 0;
for (Object v_475: v_472) {
method_addfor_field_grades_of_class_Course.invoke(v_427, v_475);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_427, v_476).equals(v_475)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_476++;
int v_474 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_427);
if (v_474 != v_476) {
throw new IllegalStateException("array size was not correct!");
}
}
  Object v_477 = class_Course.getDeclaredConstructor().newInstance();
  Object v_478 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_478,"A)1OI&>73SOF");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_478).equals("A)1OI&>73SOF")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_479 =  new ArrayList<Object>();
v_479.add(v_446);
v_479.add(v_477);
v_479.add(v_477);
v_479.add(v_420);
ArrayList<Object> v_480 =  new ArrayList<Object>();
v_480.add(v_427);
v_480.add(v_455);
v_480.add(v_408);
v_480.add(v_434);
int v_483 = 0;
for (Object v_482: v_480) {
method_addfor_field_taught_of_class_Faculty.invoke(v_478, v_482);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_478, v_483).equals(v_482)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_483++;
int v_481 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_478);
if (v_481 != v_483) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_477,v_406);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_477).equals(v_406)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_477,-472211233);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_477).equals(-472211233)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_484 =  new ArrayList<Object>();
v_484.add(v_448);
v_484.add(v_454);
v_484.add(v_423);
v_484.add(v_422);
ArrayList<Object> v_485 =  new ArrayList<Object>();
v_485.add(v_436);
  Object v_486 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_486,v_405);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_486).equals(v_405)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_486,"X:.68");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_486).equals("X:.68")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_486,(double)0.8802902987141683);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_486).equals((double)0.8802902987141683)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_485.add(v_486);
v_485.add(v_454);
v_485.add(v_486);
int v_489 = 0;
for (Object v_488: v_485) {
method_addfor_field_grades_of_class_Course.invoke(v_477, v_488);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_477, v_489).equals(v_488)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_489++;
int v_487 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_477);
if (v_487 != v_489) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_426,v_477);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_426).equals(v_477)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_426,"6M?E2JH%>CPW5+>");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_426).equals("6M?E2JH%>CPW5+>")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_426,(double)0.8150889677584953);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_426).equals((double)0.8150889677584953)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_425.add(v_426);
v_425.add(v_454);
v_425.add(v_486);
ArrayList<Object> v_490 =  new ArrayList<Object>();
v_490.add(v_454);
v_490.add(v_473);
int v_493 = 0;
for (Object v_492: v_490) {
method_addfor_field_grades_of_class_Course.invoke(v_424, v_492);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_424, v_493).equals(v_492)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_493++;
int v_491 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_424);
if (v_491 != v_493) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_423,v_424);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_423).equals(v_424)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_423,"..4<4UW");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_423).equals("..4<4UW")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_423,(double)0.34347486390225235);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_423).equals((double)0.34347486390225235)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_421.add(v_423);
v_421.add(v_429);
v_421.add(v_426);
ArrayList<Object> v_494 =  new ArrayList<Object>();
v_494.add(v_458);
v_494.add(v_448);
int v_497 = 0;
for (Object v_496: v_494) {
method_addfor_field_grades_of_class_Course.invoke(v_420, v_496);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_420, v_497).equals(v_496)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_497++;
int v_495 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_420);
if (v_495 != v_497) {
throw new IllegalStateException("array size was not correct!");
}
}
v_419.add(v_420);
int v_500 = 0;
for (Object v_499: v_419) {
method_addfor_field_taught_of_class_Faculty.invoke(v_417, v_499);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_417, v_500).equals(v_499)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_500++;
int v_498 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_417);
if (v_498 != v_500) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_416,v_409);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_416).equals(v_409)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_416,-1642437759);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_416).equals(-1642437759)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_501 =  new ArrayList<Object>();
  Object v_502 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_502,v_420);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_502).equals(v_420)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_502,">4N8RK+7C6=G");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_502).equals(">4N8RK+7C6=G")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_502,(double)0.3709533526504264);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_502).equals((double)0.3709533526504264)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_501.add(v_502);
v_501.add(v_486);
ArrayList<Object> v_503 =  new ArrayList<Object>();
  Object v_504 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_504,v_459);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_504).equals(v_459)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_504,"KT-");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_504).equals("KT-")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_504,(double)0.26210011541420475);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_504).equals((double)0.26210011541420475)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_503.add(v_504);
v_503.add(v_423);
int v_507 = 0;
for (Object v_506: v_503) {
method_addfor_field_grades_of_class_Course.invoke(v_416, v_506);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_416, v_507).equals(v_506)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_507++;
int v_505 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_416);
if (v_505 != v_507) {
throw new IllegalStateException("array size was not correct!");
}
}
v_415.add(v_416);
v_415.add(v_416);
int v_510 = 0;
for (Object v_509: v_415) {
method_addfor_field_taught_of_class_Faculty.invoke(v_413, v_509);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_413, v_510).equals(v_509)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_510++;
int v_508 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_413);
if (v_508 != v_510) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_412,v_409);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_412).equals(v_409)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_412,-2031929791);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_412).equals(-2031929791)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_511 =  new ArrayList<Object>();
v_511.add(v_448);
v_511.add(v_445);
v_511.add(v_426);
ArrayList<Object> v_512 =  new ArrayList<Object>();
v_512.add(v_486);
v_512.add(v_422);
  Object v_513 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_513,v_424);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_513).equals(v_424)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_513,"=.;-K7M9O2L4#K''");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_513).equals("=.;-K7M9O2L4#K''")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_513,(double)0.3542539173723468);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_513).equals((double)0.3542539173723468)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_512.add(v_513);
int v_516 = 0;
for (Object v_515: v_512) {
method_addfor_field_grades_of_class_Course.invoke(v_412, v_515);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_412, v_516).equals(v_515)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_516++;
int v_514 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_412);
if (v_514 != v_516) {
throw new IllegalStateException("array size was not correct!");
}
}
v_411.add(v_412);
v_411.add(v_420);
int v_519 = 0;
for (Object v_518: v_411) {
method_addfor_field_taught_of_class_Faculty.invoke(v_409, v_518);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_409, v_519).equals(v_518)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_519++;
int v_517 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_409);
if (v_517 != v_519) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_408,v_413);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_408).equals(v_413)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_408,-207173010);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_408).equals(-207173010)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_520 =  new ArrayList<Object>();
v_520.add(v_436);
v_520.add(v_458);
v_520.add(v_458);
v_520.add(v_429);
ArrayList<Object> v_521 =  new ArrayList<Object>();
v_521.add(v_458);
v_521.add(v_429);
v_521.add(v_486);
int v_524 = 0;
for (Object v_523: v_521) {
method_addfor_field_grades_of_class_Course.invoke(v_408, v_523);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_408, v_524).equals(v_523)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_524++;
int v_522 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_408);
if (v_522 != v_524) {
throw new IllegalStateException("array size was not correct!");
}
}
v_407.add(v_408);
v_407.add(v_477);
v_407.add(v_412);
v_407.add(v_427);
ArrayList<Object> v_525 =  new ArrayList<Object>();
v_525.add(v_416);
  Object v_526 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_526,v_478);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_526).equals(v_478)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_526,-71374940);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_526).equals(-71374940)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_527 =  new ArrayList<Object>();
  Object v_528 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_528,v_455);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_528).equals(v_455)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_528,"6N29PXQZQHX$9NV&3?");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_528).equals("6N29PXQZQHX$9NV&3?")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_528,(double)0.41164113261789403);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_528).equals((double)0.41164113261789403)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_527.add(v_528);
v_527.add(v_448);
v_527.add(v_436);
v_527.add(v_461);
ArrayList<Object> v_529 =  new ArrayList<Object>();
v_529.add(v_458);
v_529.add(v_486);
v_529.add(v_426);
int v_532 = 0;
for (Object v_531: v_529) {
method_addfor_field_grades_of_class_Course.invoke(v_526, v_531);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_526, v_532).equals(v_531)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_532++;
int v_530 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_526);
if (v_530 != v_532) {
throw new IllegalStateException("array size was not correct!");
}
}
v_525.add(v_526);
v_525.add(v_424);
v_525.add(v_405);
int v_535 = 0;
for (Object v_534: v_525) {
method_addfor_field_taught_of_class_Faculty.invoke(v_406, v_534);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_406, v_535).equals(v_534)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_535++;
int v_533 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_406);
if (v_533 != v_535) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_405,v_406);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_405).equals(v_406)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_405,341107274);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_405).equals(341107274)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_536 =  new ArrayList<Object>();
v_536.add(v_502);
v_536.add(v_445);
v_536.add(v_458);
v_536.add(v_502);
ArrayList<Object> v_537 =  new ArrayList<Object>();
v_537.add(v_423);
v_537.add(v_513);
int v_540 = 0;
for (Object v_539: v_537) {
method_addfor_field_grades_of_class_Course.invoke(v_405, v_539);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_405, v_540).equals(v_539)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_540++;
int v_538 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_405);
if (v_538 != v_540) {
throw new IllegalStateException("array size was not correct!");
}
}
v_404.add(v_405);
v_404.add(v_434);
v_404.add(v_455);
ArrayList<Object> v_541 =  new ArrayList<Object>();
v_541.add(v_424);
v_541.add(v_424);
v_541.add(v_408);
v_541.add(v_420);
int v_544 = 0;
for (Object v_543: v_541) {
method_addfor_field_taught_of_class_Faculty.invoke(v_403, v_543);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_403, v_544).equals(v_543)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_544++;
int v_542 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_403);
if (v_542 != v_544) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Faculty.invoke(v_403);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Faculty.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_403);
    RunAll.logln("Finished test case: 2 for Faculty");
  }
  public void test_Grade_2() throws Exception {
    System.out.println("Starting test case: 2 for class Grade");
    RunAll.logln("Starting test case: 2 for Grade");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_545 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_546 = class_Course.getDeclaredConstructor().newInstance();
  Object v_547 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_547,"MIM+NZ-*1R:=");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_547).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_548 =  new ArrayList<Object>();
v_548.add(v_546);
  Object v_549 = class_Course.getDeclaredConstructor().newInstance();
  Object v_550 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_550,"K*ZYMN.");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_550).equals("K*ZYMN.")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_551 =  new ArrayList<Object>();
v_551.add(v_546);
  Object v_552 = class_Course.getDeclaredConstructor().newInstance();
  Object v_553 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_553,")6R+N#8:7V,NN");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_553).equals(")6R+N#8:7V,NN")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_554 =  new ArrayList<Object>();
v_554.add(v_552);
v_554.add(v_552);
v_554.add(v_549);
ArrayList<Object> v_555 =  new ArrayList<Object>();
  Object v_556 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_556,v_547);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_556).equals(v_547)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_556,1087117573);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_556).equals(1087117573)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_557 =  new ArrayList<Object>();
v_557.add(v_545);
  Object v_558 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_558,v_549);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_558).equals(v_549)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_558,"6C2DO7UDS$V/X&");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_558).equals("6C2DO7UDS$V/X&")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_558,(double)0.8722168726974281);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_558).equals((double)0.8722168726974281)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_557.add(v_558);
  Object v_559 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_559,v_556);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_559).equals(v_556)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_559,"@$(:&3>BX)I@)");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_559).equals("@$(:&3>BX)I@)")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_559,(double)0.3709525452547332);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_559).equals((double)0.3709525452547332)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_557.add(v_559);
ArrayList<Object> v_560 =  new ArrayList<Object>();
  Object v_561 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_562 = class_Course.getDeclaredConstructor().newInstance();
  Object v_563 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_563,"@UG(><<E%XP");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_563).equals("@UG(><<E%XP")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_564 =  new ArrayList<Object>();
v_564.add(v_552);
v_564.add(v_549);
  Object v_565 = class_Course.getDeclaredConstructor().newInstance();
  Object v_566 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_566,"HJ,>&82W-F;H:Y9XY'?");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_566).equals("HJ,>&82W-F;H:Y9XY'?")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_567 =  new ArrayList<Object>();
v_567.add(v_562);
v_567.add(v_549);
ArrayList<Object> v_568 =  new ArrayList<Object>();
v_568.add(v_556);
v_568.add(v_562);
int v_571 = 0;
for (Object v_570: v_568) {
method_addfor_field_taught_of_class_Faculty.invoke(v_566, v_570);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_566, v_571).equals(v_570)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_571++;
int v_569 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_566);
if (v_569 != v_571) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_565,v_566);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_565).equals(v_566)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_565,-97476661);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_565).equals(-97476661)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_572 =  new ArrayList<Object>();
  Object v_573 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_573,v_552);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_573).equals(v_552)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_573,"QE54>CKN>$HNG");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_573).equals("QE54>CKN>$HNG")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_573,(double)0.2187609720733673);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_573).equals((double)0.2187609720733673)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_572.add(v_573);
v_572.add(v_545);
ArrayList<Object> v_574 =  new ArrayList<Object>();
v_574.add(v_545);
v_574.add(v_561);
int v_577 = 0;
for (Object v_576: v_574) {
method_addfor_field_grades_of_class_Course.invoke(v_565, v_576);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_565, v_577).equals(v_576)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_577++;
int v_575 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_565);
if (v_575 != v_577) {
throw new IllegalStateException("array size was not correct!");
}
}
v_564.add(v_565);
v_564.add(v_549);
ArrayList<Object> v_578 =  new ArrayList<Object>();
v_578.add(v_562);
v_578.add(v_552);
int v_581 = 0;
for (Object v_580: v_578) {
method_addfor_field_taught_of_class_Faculty.invoke(v_563, v_580);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_563, v_581).equals(v_580)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_581++;
int v_579 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_563);
if (v_579 != v_581) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_562,v_563);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_562).equals(v_563)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_562,322642628);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_562).equals(322642628)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_582 =  new ArrayList<Object>();
v_582.add(v_559);
v_582.add(v_545);
ArrayList<Object> v_583 =  new ArrayList<Object>();
  Object v_584 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_585 = class_Course.getDeclaredConstructor().newInstance();
  Object v_586 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_586,"YI#G0");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_586).equals("YI#G0")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_587 =  new ArrayList<Object>();
v_587.add(v_565);
v_587.add(v_585);
v_587.add(v_585);
ArrayList<Object> v_588 =  new ArrayList<Object>();
v_588.add(v_562);
v_588.add(v_585);
v_588.add(v_546);
int v_591 = 0;
for (Object v_590: v_588) {
method_addfor_field_taught_of_class_Faculty.invoke(v_586, v_590);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_586, v_591).equals(v_590)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_591++;
int v_589 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_586);
if (v_589 != v_591) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_585,v_586);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_585).equals(v_586)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_585,1236034770);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_585).equals(1236034770)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_592 =  new ArrayList<Object>();
v_592.add(v_584);
v_592.add(v_559);
v_592.add(v_558);
  Object v_593 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_593,v_585);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_593).equals(v_585)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_593,"UU+");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_593).equals("UU+")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_593,(double)0.011241696258484923);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_593).equals((double)0.011241696258484923)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_592.add(v_593);
ArrayList<Object> v_594 =  new ArrayList<Object>();
v_594.add(v_558);
v_594.add(v_545);
int v_597 = 0;
for (Object v_596: v_594) {
method_addfor_field_grades_of_class_Course.invoke(v_585, v_596);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_585, v_597).equals(v_596)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_597++;
int v_595 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_585);
if (v_595 != v_597) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_584,v_585);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_584).equals(v_585)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_584,"%<PQG)O>*");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_584).equals("%<PQG)O>*")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_584,(double)0.6117005536975852);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_584).equals((double)0.6117005536975852)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_583.add(v_584);
v_583.add(v_573);
int v_600 = 0;
for (Object v_599: v_583) {
method_addfor_field_grades_of_class_Course.invoke(v_562, v_599);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_562, v_600).equals(v_599)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_600++;
int v_598 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_562);
if (v_598 != v_600) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_561,v_562);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_561).equals(v_562)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_561,">'=P?Q?1XA8'H$O");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_561).equals(">'=P?Q?1XA8'H$O")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_561,(double)0.2658559418965676);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_561).equals((double)0.2658559418965676)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_560.add(v_561);
  Object v_601 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_601,v_562);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_601).equals(v_562)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_601,"3%RPDMY3-%$");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_601).equals("3%RPDMY3-%$")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_601,(double)0.9200788051470905);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_601).equals((double)0.9200788051470905)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_560.add(v_601);
v_560.add(v_559);
v_560.add(v_561);
int v_604 = 0;
for (Object v_603: v_560) {
method_addfor_field_grades_of_class_Course.invoke(v_556, v_603);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_556, v_604).equals(v_603)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_604++;
int v_602 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_556);
if (v_602 != v_604) {
throw new IllegalStateException("array size was not correct!");
}
}
v_555.add(v_556);
v_555.add(v_549);
int v_607 = 0;
for (Object v_606: v_555) {
method_addfor_field_taught_of_class_Faculty.invoke(v_553, v_606);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_553, v_607).equals(v_606)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_607++;
int v_605 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_553);
if (v_605 != v_607) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_552,v_547);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_552).equals(v_547)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_552,-11324858);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_552).equals(-11324858)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_608 =  new ArrayList<Object>();
v_608.add(v_559);
v_608.add(v_561);
v_608.add(v_584);
ArrayList<Object> v_609 =  new ArrayList<Object>();
  Object v_610 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_611 = class_Course.getDeclaredConstructor().newInstance();
  Object v_612 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_612,"-QGLX%>T4D0W@:");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_612).equals("-QGLX%>T4D0W@:")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_613 =  new ArrayList<Object>();
  Object v_614 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_614,v_547);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_614).equals(v_547)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_614,-353696627);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_614).equals(-353696627)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_615 =  new ArrayList<Object>();
  Object v_616 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_617 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_617,v_547);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_617).equals(v_547)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_617,-514849875);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_617).equals(-514849875)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_618 =  new ArrayList<Object>();
v_618.add(v_601);
v_618.add(v_616);
v_618.add(v_616);
ArrayList<Object> v_619 =  new ArrayList<Object>();
v_619.add(v_610);
v_619.add(v_561);
v_619.add(v_584);
int v_622 = 0;
for (Object v_621: v_619) {
method_addfor_field_grades_of_class_Course.invoke(v_617, v_621);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_617, v_622).equals(v_621)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_622++;
int v_620 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_617);
if (v_620 != v_622) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_616,v_617);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_616).equals(v_617)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_616,"#N6F,QV");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_616).equals("#N6F,QV")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_616,(double)0.8496754076362547);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_616).equals((double)0.8496754076362547)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_615.add(v_616);
v_615.add(v_573);
v_615.add(v_573);
ArrayList<Object> v_623 =  new ArrayList<Object>();
v_623.add(v_601);
v_623.add(v_584);
int v_626 = 0;
for (Object v_625: v_623) {
method_addfor_field_grades_of_class_Course.invoke(v_614, v_625);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_614, v_626).equals(v_625)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_626++;
int v_624 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_614);
if (v_624 != v_626) {
throw new IllegalStateException("array size was not correct!");
}
}
v_613.add(v_614);
v_613.add(v_565);
v_613.add(v_585);
v_613.add(v_611);
ArrayList<Object> v_627 =  new ArrayList<Object>();
v_627.add(v_614);
v_627.add(v_552);
int v_630 = 0;
for (Object v_629: v_627) {
method_addfor_field_taught_of_class_Faculty.invoke(v_612, v_629);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_612, v_630).equals(v_629)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_630++;
int v_628 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_612);
if (v_628 != v_630) {
throw new IllegalStateException("array size was not correct!");
}
}
  Object v_631 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_631,"=3A9B;1,J$");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_631).equals("=3A9B;1,J$")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_632 =  new ArrayList<Object>();
  Object v_633 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_633,v_553);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_633).equals(v_553)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_633,-681218981);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_633).equals(-681218981)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_634 =  new ArrayList<Object>();
v_634.add(v_584);
v_634.add(v_610);
ArrayList<Object> v_635 =  new ArrayList<Object>();
v_635.add(v_545);
v_635.add(v_545);
v_635.add(v_545);
int v_638 = 0;
for (Object v_637: v_635) {
method_addfor_field_grades_of_class_Course.invoke(v_633, v_637);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_633, v_638).equals(v_637)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_638++;
int v_636 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_633);
if (v_636 != v_638) {
throw new IllegalStateException("array size was not correct!");
}
}
v_632.add(v_633);
  Object v_639 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_639,v_612);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_639).equals(v_612)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_639,1356354590);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_639).equals(1356354590)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_640 =  new ArrayList<Object>();
v_640.add(v_601);
v_640.add(v_573);
v_640.add(v_558);
v_640.add(v_545);
ArrayList<Object> v_641 =  new ArrayList<Object>();
v_641.add(v_593);
v_641.add(v_610);
int v_644 = 0;
for (Object v_643: v_641) {
method_addfor_field_grades_of_class_Course.invoke(v_639, v_643);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_639, v_644).equals(v_643)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_644++;
int v_642 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_639);
if (v_642 != v_644) {
throw new IllegalStateException("array size was not correct!");
}
}
v_632.add(v_639);
v_632.add(v_552);
ArrayList<Object> v_645 =  new ArrayList<Object>();
v_645.add(v_617);
v_645.add(v_556);
v_645.add(v_546);
v_645.add(v_611);
int v_648 = 0;
for (Object v_647: v_645) {
method_addfor_field_taught_of_class_Faculty.invoke(v_631, v_647);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_631, v_648).equals(v_647)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_648++;
int v_646 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_631);
if (v_646 != v_648) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_611,v_631);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_611).equals(v_631)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_611,-1515721597);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_611).equals(-1515721597)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_649 =  new ArrayList<Object>();
v_649.add(v_601);
v_649.add(v_616);
ArrayList<Object> v_650 =  new ArrayList<Object>();
v_650.add(v_616);
  Object v_651 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_651,v_565);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_651).equals(v_565)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_651,"PA)1OI&>73SOF25,");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_651).equals("PA)1OI&>73SOF25,")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_651,(double)0.29646985336031073);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_651).equals((double)0.29646985336031073)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_650.add(v_651);
int v_654 = 0;
for (Object v_653: v_650) {
method_addfor_field_grades_of_class_Course.invoke(v_611, v_653);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_611, v_654).equals(v_653)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_654++;
int v_652 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_611);
if (v_652 != v_654) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_610,v_611);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_610).equals(v_611)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_610,"(DQ5?1;)");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_610).equals("(DQ5?1;)")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_610,(double)0.19447230332037024);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_610).equals((double)0.19447230332037024)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_609.add(v_610);
v_609.add(v_593);
v_609.add(v_545);
int v_657 = 0;
for (Object v_656: v_609) {
method_addfor_field_grades_of_class_Course.invoke(v_552, v_656);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_552, v_657).equals(v_656)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_657++;
int v_655 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_552);
if (v_655 != v_657) {
throw new IllegalStateException("array size was not correct!");
}
}
v_551.add(v_552);
  Object v_658 = class_Course.getDeclaredConstructor().newInstance();
  Object v_659 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_659,"QL=DNY");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_659).equals("QL=DNY")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_660 =  new ArrayList<Object>();
v_660.add(v_552);
v_660.add(v_614);
ArrayList<Object> v_661 =  new ArrayList<Object>();
v_661.add(v_562);
  Object v_662 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_662,v_612);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_662).equals(v_612)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_662,-1719065330);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_662).equals(-1719065330)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_663 =  new ArrayList<Object>();
v_663.add(v_610);
  Object v_664 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_664,v_658);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_664).equals(v_658)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_664,"$AE&Q*QKBHU:3Y&0");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_664).equals("$AE&Q*QKBHU:3Y&0")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_664,(double)0.08212516290976357);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_664).equals((double)0.08212516290976357)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_663.add(v_664);
ArrayList<Object> v_665 =  new ArrayList<Object>();
v_665.add(v_664);
v_665.add(v_561);
v_665.add(v_610);
v_665.add(v_651);
int v_668 = 0;
for (Object v_667: v_665) {
method_addfor_field_grades_of_class_Course.invoke(v_662, v_667);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_662, v_668).equals(v_667)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_668++;
int v_666 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_662);
if (v_666 != v_668) {
throw new IllegalStateException("array size was not correct!");
}
}
v_661.add(v_662);
v_661.add(v_562);
int v_671 = 0;
for (Object v_670: v_661) {
method_addfor_field_taught_of_class_Faculty.invoke(v_659, v_670);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_659, v_671).equals(v_670)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_671++;
int v_669 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_659);
if (v_669 != v_671) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_658,v_659);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_658).equals(v_659)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_658,1475213268);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_658).equals(1475213268)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_672 =  new ArrayList<Object>();
v_672.add(v_561);
v_672.add(v_559);
ArrayList<Object> v_673 =  new ArrayList<Object>();
v_673.add(v_610);
v_673.add(v_593);
int v_676 = 0;
for (Object v_675: v_673) {
method_addfor_field_grades_of_class_Course.invoke(v_658, v_675);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_658, v_676).equals(v_675)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_676++;
int v_674 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_658);
if (v_674 != v_676) {
throw new IllegalStateException("array size was not correct!");
}
}
v_551.add(v_658);
ArrayList<Object> v_677 =  new ArrayList<Object>();
v_677.add(v_552);
v_677.add(v_617);
  Object v_678 = class_Course.getDeclaredConstructor().newInstance();
  Object v_679 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_679,"M?ZW..");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_679).equals("M?ZW..")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_680 =  new ArrayList<Object>();
v_680.add(v_565);
v_680.add(v_546);
v_680.add(v_639);
ArrayList<Object> v_681 =  new ArrayList<Object>();
v_681.add(v_678);
v_681.add(v_546);
  Object v_682 = class_Course.getDeclaredConstructor().newInstance();
  Object v_683 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_683,";KH*9*60VDY'UB");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_683).equals(";KH*9*60VDY'UB")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_684 =  new ArrayList<Object>();
v_684.add(v_562);
v_684.add(v_658);
ArrayList<Object> v_685 =  new ArrayList<Object>();
v_685.add(v_585);
v_685.add(v_633);
int v_688 = 0;
for (Object v_687: v_685) {
method_addfor_field_taught_of_class_Faculty.invoke(v_683, v_687);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_683, v_688).equals(v_687)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_688++;
int v_686 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_683);
if (v_686 != v_688) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_682,v_683);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_682).equals(v_683)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_682,-1108993771);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_682).equals(-1108993771)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_689 =  new ArrayList<Object>();
v_689.add(v_559);
v_689.add(v_559);
ArrayList<Object> v_690 =  new ArrayList<Object>();
v_690.add(v_610);
v_690.add(v_593);
v_690.add(v_593);
v_690.add(v_610);
int v_693 = 0;
for (Object v_692: v_690) {
method_addfor_field_grades_of_class_Course.invoke(v_682, v_692);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_682, v_693).equals(v_692)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_693++;
int v_691 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_682);
if (v_691 != v_693) {
throw new IllegalStateException("array size was not correct!");
}
}
v_681.add(v_682);
  Object v_694 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_694,v_563);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_694).equals(v_563)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_694,695427094);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_694).equals(695427094)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_695 =  new ArrayList<Object>();
v_695.add(v_545);
v_695.add(v_584);
v_695.add(v_545);
ArrayList<Object> v_696 =  new ArrayList<Object>();
v_696.add(v_573);
v_696.add(v_593);
int v_699 = 0;
for (Object v_698: v_696) {
method_addfor_field_grades_of_class_Course.invoke(v_694, v_698);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_694, v_699).equals(v_698)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_699++;
int v_697 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_694);
if (v_697 != v_699) {
throw new IllegalStateException("array size was not correct!");
}
}
v_681.add(v_694);
int v_702 = 0;
for (Object v_701: v_681) {
method_addfor_field_taught_of_class_Faculty.invoke(v_679, v_701);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_679, v_702).equals(v_701)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_702++;
int v_700 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_679);
if (v_700 != v_702) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_678,v_679);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_678).equals(v_679)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_678,-1984550984);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_678).equals(-1984550984)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_703 =  new ArrayList<Object>();
v_703.add(v_593);
v_703.add(v_573);
v_703.add(v_593);
ArrayList<Object> v_704 =  new ArrayList<Object>();
v_704.add(v_664);
  Object v_705 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_706 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_706,v_612);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_706).equals(v_612)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_706,-139133672);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_706).equals(-139133672)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_707 =  new ArrayList<Object>();
v_707.add(v_705);
v_707.add(v_593);
ArrayList<Object> v_708 =  new ArrayList<Object>();
v_708.add(v_601);
v_708.add(v_545);
v_708.add(v_559);
int v_711 = 0;
for (Object v_710: v_708) {
method_addfor_field_grades_of_class_Course.invoke(v_706, v_710);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_706, v_711).equals(v_710)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_711++;
int v_709 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_706);
if (v_709 != v_711) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_705,v_546);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_705).equals(v_546)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_705,"S,4-.?AWWRHNO*%");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_705).equals("S,4-.?AWWRHNO*%")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_705,(double)0.44344378527864836);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_705).equals((double)0.44344378527864836)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_704.add(v_705);
v_704.add(v_573);
int v_714 = 0;
for (Object v_713: v_704) {
method_addfor_field_grades_of_class_Course.invoke(v_678, v_713);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_678, v_714).equals(v_713)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_714++;
int v_712 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_678);
if (v_712 != v_714) {
throw new IllegalStateException("array size was not correct!");
}
}
v_677.add(v_678);
  Object v_715 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_715,v_563);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_715).equals(v_563)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_715,349154146);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_715).equals(349154146)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_716 =  new ArrayList<Object>();
v_716.add(v_584);
v_716.add(v_664);
ArrayList<Object> v_717 =  new ArrayList<Object>();
  Object v_718 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_718,v_633);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_718).equals(v_633)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_718,"ZQHX$9NV&3?IM1UYQR");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_718).equals("ZQHX$9NV&3?IM1UYQR")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_718,(double)0.21995452844493435);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_718).equals((double)0.21995452844493435)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_717.add(v_718);
v_717.add(v_584);
v_717.add(v_545);
v_717.add(v_601);
int v_721 = 0;
for (Object v_720: v_717) {
method_addfor_field_grades_of_class_Course.invoke(v_715, v_720);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_715, v_721).equals(v_720)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_721++;
int v_719 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_715);
if (v_719 != v_721) {
throw new IllegalStateException("array size was not correct!");
}
}
v_677.add(v_715);
int v_724 = 0;
for (Object v_723: v_677) {
method_addfor_field_taught_of_class_Faculty.invoke(v_550, v_723);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_550, v_724).equals(v_723)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_724++;
int v_722 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_550);
if (v_722 != v_724) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_549,v_631);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_549).equals(v_631)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_549,-1456136944);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_549).equals(-1456136944)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_725 =  new ArrayList<Object>();
v_725.add(v_545);
v_725.add(v_610);
v_725.add(v_610);
v_725.add(v_593);
ArrayList<Object> v_726 =  new ArrayList<Object>();
v_726.add(v_610);
v_726.add(v_651);
  Object v_727 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_727,v_614);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_727).equals(v_614)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_727,"J1I.%JHG(O0(RKO");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_727).equals("J1I.%JHG(O0(RKO")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_727,(double)0.952682544352807);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_727).equals((double)0.952682544352807)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_726.add(v_727);
v_726.add(v_718);
int v_730 = 0;
for (Object v_729: v_726) {
method_addfor_field_grades_of_class_Course.invoke(v_549, v_729);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_549, v_730).equals(v_729)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_730++;
int v_728 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_549);
if (v_728 != v_730) {
throw new IllegalStateException("array size was not correct!");
}
}
v_548.add(v_549);
  Object v_731 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_731,v_659);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_731).equals(v_659)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_731,-1761745082);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_731).equals(-1761745082)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_732 =  new ArrayList<Object>();
  Object v_733 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_734 = class_Course.getDeclaredConstructor().newInstance();
  Object v_735 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_735,"YYC$ON<");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_735).equals("YYC$ON<")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_736 =  new ArrayList<Object>();
v_736.add(v_682);
v_736.add(v_682);
v_736.add(v_678);
ArrayList<Object> v_737 =  new ArrayList<Object>();
  Object v_738 = class_Course.getDeclaredConstructor().newInstance();
  Object v_739 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_739,"F.XO9$QNH:NH:D,A.");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_739).equals("F.XO9$QNH:NH:D,A.")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_740 =  new ArrayList<Object>();
v_740.add(v_585);
v_740.add(v_662);
ArrayList<Object> v_741 =  new ArrayList<Object>();
v_741.add(v_662);
v_741.add(v_706);
int v_744 = 0;
for (Object v_743: v_741) {
method_addfor_field_taught_of_class_Faculty.invoke(v_739, v_743);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_739, v_744).equals(v_743)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_744++;
int v_742 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_739);
if (v_742 != v_744) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_738,v_586);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_738).equals(v_586)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_738,529846035);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_738).equals(529846035)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_745 =  new ArrayList<Object>();
v_745.add(v_561);
v_745.add(v_601);
v_745.add(v_705);
ArrayList<Object> v_746 =  new ArrayList<Object>();
v_746.add(v_616);
v_746.add(v_610);
int v_749 = 0;
for (Object v_748: v_746) {
method_addfor_field_grades_of_class_Course.invoke(v_738, v_748);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_738, v_749).equals(v_748)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_749++;
int v_747 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_738);
if (v_747 != v_749) {
throw new IllegalStateException("array size was not correct!");
}
}
v_737.add(v_738);
v_737.add(v_731);
v_737.add(v_617);
int v_752 = 0;
for (Object v_751: v_737) {
method_addfor_field_taught_of_class_Faculty.invoke(v_735, v_751);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_735, v_752).equals(v_751)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_752++;
int v_750 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_735);
if (v_750 != v_752) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_734,v_659);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_734).equals(v_659)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_734,1745293794);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_734).equals(1745293794)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_753 =  new ArrayList<Object>();
v_753.add(v_718);
v_753.add(v_610);
ArrayList<Object> v_754 =  new ArrayList<Object>();
v_754.add(v_718);
v_754.add(v_593);
v_754.add(v_664);
v_754.add(v_573);
int v_757 = 0;
for (Object v_756: v_754) {
method_addfor_field_grades_of_class_Course.invoke(v_734, v_756);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_734, v_757).equals(v_756)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_757++;
int v_755 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_734);
if (v_755 != v_757) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_733,v_734);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_733).equals(v_734)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_733,"##,BT38=9Y61SB");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_733).equals("##,BT38=9Y61SB")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_733,(double)0.25303836039223493);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_733).equals((double)0.25303836039223493)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_732.add(v_733);
v_732.add(v_718);
v_732.add(v_616);
ArrayList<Object> v_758 =  new ArrayList<Object>();
v_758.add(v_545);
  Object v_759 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_760 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_760,v_563);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_760).equals(v_563)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_760,-1669402419);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_760).equals(-1669402419)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_761 =  new ArrayList<Object>();
v_761.add(v_664);
v_761.add(v_545);
ArrayList<Object> v_762 =  new ArrayList<Object>();
v_762.add(v_545);
v_762.add(v_561);
v_762.add(v_558);
v_762.add(v_559);
int v_765 = 0;
for (Object v_764: v_762) {
method_addfor_field_grades_of_class_Course.invoke(v_760, v_764);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_760, v_765).equals(v_764)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_765++;
int v_763 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_760);
if (v_763 != v_765) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_759,v_760);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_759).equals(v_760)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_759,"C(V-W5YG62*F8#>XPGF");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_759).equals("C(V-W5YG62*F8#>XPGF")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_759,(double)0.9006260754567196);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_759).equals((double)0.9006260754567196)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_758.add(v_759);
v_758.add(v_573);
int v_768 = 0;
for (Object v_767: v_758) {
method_addfor_field_grades_of_class_Course.invoke(v_731, v_767);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_731, v_768).equals(v_767)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_768++;
int v_766 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_731);
if (v_766 != v_768) {
throw new IllegalStateException("array size was not correct!");
}
}
v_548.add(v_731);
ArrayList<Object> v_769 =  new ArrayList<Object>();
v_769.add(v_546);
v_769.add(v_546);
int v_772 = 0;
for (Object v_771: v_769) {
method_addfor_field_taught_of_class_Faculty.invoke(v_547, v_771);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_547, v_772).equals(v_771)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_772++;
int v_770 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_547);
if (v_770 != v_772) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_546,v_563);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_546).equals(v_563)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_546,1686668341);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_546).equals(1686668341)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_773 =  new ArrayList<Object>();
v_773.add(v_559);
  Object v_774 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_775 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_775,v_553);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_775).equals(v_553)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_775,-723823034);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_775).equals(-723823034)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_776 =  new ArrayList<Object>();
v_776.add(v_558);
v_776.add(v_616);
v_776.add(v_733);
v_776.add(v_559);
ArrayList<Object> v_777 =  new ArrayList<Object>();
v_777.add(v_616);
v_777.add(v_561);
v_777.add(v_610);
v_777.add(v_601);
int v_780 = 0;
for (Object v_779: v_777) {
method_addfor_field_grades_of_class_Course.invoke(v_775, v_779);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_775, v_780).equals(v_779)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_780++;
int v_778 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_775);
if (v_778 != v_780) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_774,v_585);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_774).equals(v_585)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_774,"M5M>II#%A5/Z$GWJR*DX");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_774).equals("M5M>II#%A5/Z$GWJR*DX")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_774,(double)0.6325770893239459);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_774).equals((double)0.6325770893239459)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_773.add(v_774);
ArrayList<Object> v_781 =  new ArrayList<Object>();
v_781.add(v_561);
v_781.add(v_651);
v_781.add(v_718);
v_781.add(v_601);
int v_784 = 0;
for (Object v_783: v_781) {
method_addfor_field_grades_of_class_Course.invoke(v_546, v_783);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_546, v_784).equals(v_783)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_784++;
int v_782 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_546);
if (v_782 != v_784) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_545,v_562);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_545).equals(v_562)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_545,"ZV1)R%?YC*(");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_545).equals("ZV1)R%?YC*(")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_545,(double)0.1823358859571944);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_545).equals((double)0.1823358859571944)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Grade.invoke(v_545);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Grade.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_545);
    RunAll.logln("Finished test case: 2 for Grade");
  }
  public void test_Course_2() throws Exception {
    System.out.println("Starting test case: 2 for class Course");
    RunAll.logln("Starting test case: 2 for Course");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_785 = class_Course.getDeclaredConstructor().newInstance();
  Object v_786 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_786,"MIM+NZ-*1R:=");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_786).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_787 =  new ArrayList<Object>();
v_787.add(v_785);
  Object v_788 = class_Course.getDeclaredConstructor().newInstance();
  Object v_789 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_789,"K*ZYMN.");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_789).equals("K*ZYMN.")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_790 =  new ArrayList<Object>();
v_790.add(v_785);
  Object v_791 = class_Course.getDeclaredConstructor().newInstance();
  Object v_792 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_792,")6R+N#8:7V,NN");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_792).equals(")6R+N#8:7V,NN")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_793 =  new ArrayList<Object>();
v_793.add(v_791);
v_793.add(v_791);
v_793.add(v_788);
ArrayList<Object> v_794 =  new ArrayList<Object>();
  Object v_795 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_795,v_786);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_795).equals(v_786)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_795,1087117573);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_795).equals(1087117573)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_796 =  new ArrayList<Object>();
  Object v_797 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_798 = class_Course.getDeclaredConstructor().newInstance();
  Object v_799 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_799,",6C2D");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_799).equals(",6C2D")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_800 =  new ArrayList<Object>();
  Object v_801 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_801,v_789);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_801).equals(v_789)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_801,-2027344061);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_801).equals(-2027344061)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_802 =  new ArrayList<Object>();
  Object v_803 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_803,v_798);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_803).equals(v_798)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_803,"<4S/AD@$(:");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_803).equals("<4S/AD@$(:")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_803,(double)0.9496440080949906);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_803).equals((double)0.9496440080949906)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_802.add(v_803);
v_802.add(v_803);
  Object v_804 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_805 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_805,v_789);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_805).equals(v_789)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_805,1593229023);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_805).equals(1593229023)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_806 =  new ArrayList<Object>();
  Object v_807 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_808 = class_Course.getDeclaredConstructor().newInstance();
  Object v_809 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_809,"@UG(><<E%XP");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_809).equals("@UG(><<E%XP")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_810 =  new ArrayList<Object>();
v_810.add(v_791);
  Object v_811 = class_Course.getDeclaredConstructor().newInstance();
  Object v_812 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_812,"Y9XY'?>)G15Q5XF>");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_812).equals("Y9XY'?>)G15Q5XF>")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_813 =  new ArrayList<Object>();
v_813.add(v_791);
v_813.add(v_801);
v_813.add(v_808);
v_813.add(v_808);
ArrayList<Object> v_814 =  new ArrayList<Object>();
v_814.add(v_785);
v_814.add(v_785);
v_814.add(v_795);
int v_817 = 0;
for (Object v_816: v_814) {
method_addfor_field_taught_of_class_Faculty.invoke(v_812, v_816);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_812, v_817).equals(v_816)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_817++;
int v_815 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_812);
if (v_815 != v_817) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_811,v_789);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_811).equals(v_789)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_811,-1891924164);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_811).equals(-1891924164)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_818 =  new ArrayList<Object>();
v_818.add(v_804);
v_818.add(v_807);
ArrayList<Object> v_819 =  new ArrayList<Object>();
  Object v_820 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_820,v_785);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_820).equals(v_785)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_820,"$HNGG.D?8<1P'");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_820).equals("$HNGG.D?8<1P'")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_820,(double)0.312390165690246);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_820).equals((double)0.312390165690246)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_819.add(v_820);
v_819.add(v_797);
  Object v_821 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_821,v_791);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_821).equals(v_791)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_821,"WF*QYI#G0KWN");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_821).equals("WF*QYI#G0KWN")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_821,(double)0.6359156929127353);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_821).equals((double)0.6359156929127353)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_819.add(v_821);
int v_824 = 0;
for (Object v_823: v_819) {
method_addfor_field_grades_of_class_Course.invoke(v_811, v_823);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_811, v_824).equals(v_823)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_824++;
int v_822 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_811);
if (v_822 != v_824) {
throw new IllegalStateException("array size was not correct!");
}
}
v_810.add(v_811);
v_810.add(v_795);
  Object v_825 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_825,v_809);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_825).equals(v_809)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_825,1471131082);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_825).equals(1471131082)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_826 =  new ArrayList<Object>();
  Object v_827 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_827,v_805);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_827).equals(v_805)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_827,"UU+");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_827).equals("UU+")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_827,(double)0.011241696258484923);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_827).equals((double)0.011241696258484923)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_826.add(v_827);
v_826.add(v_797);
v_826.add(v_803);
v_826.add(v_797);
ArrayList<Object> v_828 =  new ArrayList<Object>();
v_828.add(v_797);
v_828.add(v_821);
v_828.add(v_797);
int v_831 = 0;
for (Object v_830: v_828) {
method_addfor_field_grades_of_class_Course.invoke(v_825, v_830);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_825, v_831).equals(v_830)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_831++;
int v_829 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_825);
if (v_829 != v_831) {
throw new IllegalStateException("array size was not correct!");
}
}
v_810.add(v_825);
ArrayList<Object> v_832 =  new ArrayList<Object>();
v_832.add(v_825);
v_832.add(v_805);
int v_835 = 0;
for (Object v_834: v_832) {
method_addfor_field_taught_of_class_Faculty.invoke(v_809, v_834);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_809, v_835).equals(v_834)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_835++;
int v_833 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_809);
if (v_833 != v_835) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_808,v_786);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_808).equals(v_786)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_808,-1742480876);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_808).equals(-1742480876)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_836 =  new ArrayList<Object>();
v_836.add(v_803);
v_836.add(v_807);
ArrayList<Object> v_837 =  new ArrayList<Object>();
v_837.add(v_827);
v_837.add(v_807);
int v_840 = 0;
for (Object v_839: v_837) {
method_addfor_field_grades_of_class_Course.invoke(v_808, v_839);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_808, v_840).equals(v_839)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_840++;
int v_838 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_808);
if (v_838 != v_840) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_807,v_825);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_807).equals(v_825)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_807,"*?ZD1>?Z=KO)8O");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_807).equals("*?ZD1>?Z=KO)8O")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_807,(double)0.15417473855712616);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_807).equals((double)0.15417473855712616)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_806.add(v_807);
v_806.add(v_797);
ArrayList<Object> v_841 =  new ArrayList<Object>();
v_841.add(v_821);
v_841.add(v_804);
  Object v_842 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_842,v_795);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_842).equals(v_795)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_842,"A8'H$OAV0%A");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_842).equals("A8'H$OAV0%A")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_842,(double)0.2771996997371078);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_842).equals((double)0.2771996997371078)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_841.add(v_842);
v_841.add(v_827);
int v_845 = 0;
for (Object v_844: v_841) {
method_addfor_field_grades_of_class_Course.invoke(v_805, v_844);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_805, v_845).equals(v_844)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_845++;
int v_843 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_805);
if (v_843 != v_845) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_804,v_805);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_804).equals(v_805)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_804,"$AE7&9H-XE>ZU*PO");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_804).equals("$AE7&9H-XE>ZU*PO")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_804,(double)0.11354124220090711);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_804).equals((double)0.11354124220090711)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_802.add(v_804);
ArrayList<Object> v_846 =  new ArrayList<Object>();
v_846.add(v_804);
v_846.add(v_803);
v_846.add(v_803);
v_846.add(v_820);
int v_849 = 0;
for (Object v_848: v_846) {
method_addfor_field_grades_of_class_Course.invoke(v_801, v_848);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_801, v_849).equals(v_848)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_849++;
int v_847 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_801);
if (v_847 != v_849) {
throw new IllegalStateException("array size was not correct!");
}
}
v_800.add(v_801);
v_800.add(v_785);
ArrayList<Object> v_850 =  new ArrayList<Object>();
v_850.add(v_808);
v_850.add(v_795);
  Object v_851 = class_Course.getDeclaredConstructor().newInstance();
  Object v_852 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_852,"T4D0W@:#MKD0I5");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_852).equals("T4D0W@:#MKD0I5")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_853 =  new ArrayList<Object>();
v_853.add(v_825);
v_853.add(v_851);
v_853.add(v_798);
ArrayList<Object> v_854 =  new ArrayList<Object>();
v_854.add(v_785);
v_854.add(v_808);
int v_857 = 0;
for (Object v_856: v_854) {
method_addfor_field_taught_of_class_Faculty.invoke(v_852, v_856);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_852, v_857).equals(v_856)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_857++;
int v_855 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_852);
if (v_855 != v_857) {
throw new IllegalStateException("array size was not correct!");
}
}
  Object v_858 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_858,"Z2NUG#N");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_858).equals("Z2NUG#N")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_859 =  new ArrayList<Object>();
v_859.add(v_798);
v_859.add(v_795);
v_859.add(v_791);
  Object v_860 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_860,v_792);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_860).equals(v_792)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_860,1611497418);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_860).equals(1611497418)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_861 =  new ArrayList<Object>();
v_861.add(v_820);
v_861.add(v_842);
  Object v_862 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_862,v_860);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_862).equals(v_860)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_862,"85$Z3)8A&O.=3A9");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_862).equals("85$Z3)8A&O.=3A9")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_862,(double)0.6462823599502466);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_862).equals((double)0.6462823599502466)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_861.add(v_862);
ArrayList<Object> v_863 =  new ArrayList<Object>();
v_863.add(v_807);
  Object v_864 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_864,v_788);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_864).equals(v_788)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_864,"O%BH&M80LO*");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_864).equals("O%BH&M80LO*")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_864,(double)0.20820174028299898);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_864).equals((double)0.20820174028299898)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_863.add(v_864);
v_863.add(v_842);
int v_867 = 0;
for (Object v_866: v_863) {
method_addfor_field_grades_of_class_Course.invoke(v_860, v_866);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_860, v_867).equals(v_866)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_867++;
int v_865 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_860);
if (v_865 != v_867) {
throw new IllegalStateException("array size was not correct!");
}
}
v_859.add(v_860);
ArrayList<Object> v_868 =  new ArrayList<Object>();
v_868.add(v_805);
v_868.add(v_798);
  Object v_869 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_869,v_786);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_869).equals(v_786)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_869,1623472676);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_869).equals(1623472676)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_870 =  new ArrayList<Object>();
  Object v_871 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_871,v_808);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_871).equals(v_808)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_871,",ID9IKFC@LB");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_871).equals(",ID9IKFC@LB")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_871,(double)0.6295188496372633);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_871).equals((double)0.6295188496372633)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_870.add(v_871);
v_870.add(v_797);
  Object v_872 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_872,v_795);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_872).equals(v_795)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_872,"SFOO>2>,/4");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_872).equals("SFOO>2>,/4")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_872,(double)0.61063502115337);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_872).equals((double)0.61063502115337)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_870.add(v_872);
v_870.add(v_842);
ArrayList<Object> v_873 =  new ArrayList<Object>();
  Object v_874 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_874,v_801);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_874).equals(v_801)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_874,"JAU6M?E2JH%>CPW5+");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_874).equals("JAU6M?E2JH%>CPW5+")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_874,(double)0.04740082942081936);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_874).equals((double)0.04740082942081936)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_873.add(v_874);
v_873.add(v_820);
int v_877 = 0;
for (Object v_876: v_873) {
method_addfor_field_grades_of_class_Course.invoke(v_869, v_876);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_869, v_877).equals(v_876)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_877++;
int v_875 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_869);
if (v_875 != v_877) {
throw new IllegalStateException("array size was not correct!");
}
}
v_868.add(v_869);
v_868.add(v_791);
int v_880 = 0;
for (Object v_879: v_868) {
method_addfor_field_taught_of_class_Faculty.invoke(v_858, v_879);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_858, v_880).equals(v_879)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_880++;
int v_878 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_858);
if (v_878 != v_880) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_851,v_858);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_851).equals(v_858)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_851,-1771562806);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_851).equals(-1771562806)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_881 =  new ArrayList<Object>();
v_881.add(v_842);
v_881.add(v_872);
ArrayList<Object> v_882 =  new ArrayList<Object>();
v_882.add(v_874);
v_882.add(v_872);
  Object v_883 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_883,v_801);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_883).equals(v_801)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_883,"..4<4UW");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_883).equals("..4<4UW")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_883,(double)0.34347486390225235);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_883).equals((double)0.34347486390225235)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_882.add(v_883);
int v_886 = 0;
for (Object v_885: v_882) {
method_addfor_field_grades_of_class_Course.invoke(v_851, v_885);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_851, v_886).equals(v_885)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_886++;
int v_884 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_851);
if (v_884 != v_886) {
throw new IllegalStateException("array size was not correct!");
}
}
v_850.add(v_851);
v_850.add(v_791);
int v_889 = 0;
for (Object v_888: v_850) {
method_addfor_field_taught_of_class_Faculty.invoke(v_799, v_888);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_799, v_889).equals(v_888)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_889++;
int v_887 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_799);
if (v_887 != v_889) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_798,v_852);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_798).equals(v_852)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_798,-52434299);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_798).equals(-52434299)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_890 =  new ArrayList<Object>();
v_890.add(v_874);
v_890.add(v_804);
ArrayList<Object> v_891 =  new ArrayList<Object>();
  Object v_892 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_892,v_798);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_892).equals(v_798)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_892,"M?ZW..");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_892).equals("M?ZW..")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_892,(double)0.9701049473254846);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_892).equals((double)0.9701049473254846)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_891.add(v_892);
v_891.add(v_804);
int v_895 = 0;
for (Object v_894: v_891) {
method_addfor_field_grades_of_class_Course.invoke(v_798, v_894);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_798, v_895).equals(v_894)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_895++;
int v_893 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_798);
if (v_893 != v_895) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_797,v_798);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_797).equals(v_798)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_797,";KH*9*60VDY'UB");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_797).equals(";KH*9*60VDY'UB")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_797,(double)0.46536138775278746);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_797).equals((double)0.46536138775278746)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_796.add(v_797);
  Object v_896 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_897 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_897,v_792);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_897).equals(v_792)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_897,-1072395408);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_897).equals(-1072395408)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_898 =  new ArrayList<Object>();
v_898.add(v_862);
v_898.add(v_804);
ArrayList<Object> v_899 =  new ArrayList<Object>();
v_899.add(v_804);
v_899.add(v_862);
int v_902 = 0;
for (Object v_901: v_899) {
method_addfor_field_grades_of_class_Course.invoke(v_897, v_901);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_897, v_902).equals(v_901)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_902++;
int v_900 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_897);
if (v_900 != v_902) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_896,v_811);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_896).equals(v_811)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_896,".=.;-K7M9");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_896).equals(".=.;-K7M9")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_896,(double)0.34547013835445817);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_896).equals((double)0.34547013835445817)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_796.add(v_896);
v_796.add(v_862);
ArrayList<Object> v_903 =  new ArrayList<Object>();
v_903.add(v_874);
v_903.add(v_797);
int v_906 = 0;
for (Object v_905: v_903) {
method_addfor_field_grades_of_class_Course.invoke(v_795, v_905);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_795, v_906).equals(v_905)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_906++;
int v_904 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_795);
if (v_904 != v_906) {
throw new IllegalStateException("array size was not correct!");
}
}
v_794.add(v_795);
v_794.add(v_801);
int v_909 = 0;
for (Object v_908: v_794) {
method_addfor_field_taught_of_class_Faculty.invoke(v_792, v_908);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_792, v_909).equals(v_908)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_909++;
int v_907 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_792);
if (v_907 != v_909) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_791,v_812);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_791).equals(v_812)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_791,-161456137);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_791).equals(-161456137)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_910 =  new ArrayList<Object>();
v_910.add(v_807);
v_910.add(v_892);
v_910.add(v_821);
ArrayList<Object> v_911 =  new ArrayList<Object>();
  Object v_912 = class_Grade.getDeclaredConstructor().newInstance();
  Object v_913 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_913,v_792);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_913).equals(v_792)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_913,-1245354653);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_913).equals(-1245354653)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_914 =  new ArrayList<Object>();
v_914.add(v_896);
v_914.add(v_820);
v_914.add(v_883);
v_914.add(v_821);
ArrayList<Object> v_915 =  new ArrayList<Object>();
v_915.add(v_842);
v_915.add(v_807);
v_915.add(v_864);
v_915.add(v_896);
int v_918 = 0;
for (Object v_917: v_915) {
method_addfor_field_grades_of_class_Course.invoke(v_913, v_917);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_913, v_918).equals(v_917)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_918++;
int v_916 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_913);
if (v_916 != v_918) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_course_of_class_Grade.invoke(v_912,v_805);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_912).equals(v_805)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_912,"S-U<RKVQL");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_912).equals("S-U<RKVQL")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_912,(double)0.3114088373451901);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_912).equals((double)0.3114088373451901)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_911.add(v_912);
v_911.add(v_912);
v_911.add(v_912);
v_911.add(v_872);
int v_921 = 0;
for (Object v_920: v_911) {
method_addfor_field_grades_of_class_Course.invoke(v_791, v_920);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_791, v_921).equals(v_920)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_921++;
int v_919 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_791);
if (v_919 != v_921) {
throw new IllegalStateException("array size was not correct!");
}
}
v_790.add(v_791);
v_790.add(v_860);
ArrayList<Object> v_922 =  new ArrayList<Object>();
  Object v_923 = class_Course.getDeclaredConstructor().newInstance();
  Object v_924 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_924,"05JY(HUCZA=K:1");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_924).equals("05JY(HUCZA=K:1")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_925 =  new ArrayList<Object>();
  Object v_926 = class_Course.getDeclaredConstructor().newInstance();
  Object v_927 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_927,"I.%JHG(O0(RKO#9");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_927).equals("I.%JHG(O0(RKO#9")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_928 =  new ArrayList<Object>();
v_928.add(v_801);
v_928.add(v_825);
v_928.add(v_897);
ArrayList<Object> v_929 =  new ArrayList<Object>();
v_929.add(v_795);
v_929.add(v_926);
v_929.add(v_825);
v_929.add(v_798);
int v_932 = 0;
for (Object v_931: v_929) {
method_addfor_field_taught_of_class_Faculty.invoke(v_927, v_931);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_927, v_932).equals(v_931)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_932++;
int v_930 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_927);
if (v_930 != v_932) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_926,v_927);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_926).equals(v_927)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_926,-805905440);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_926).equals(-805905440)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_933 =  new ArrayList<Object>();
v_933.add(v_803);
v_933.add(v_883);
v_933.add(v_912);
v_933.add(v_807);
ArrayList<Object> v_934 =  new ArrayList<Object>();
v_934.add(v_820);
  Object v_935 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_935,v_869);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_935).equals(v_869)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_935,"F.XO9$QNH:NH:D,A.");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_935).equals("F.XO9$QNH:NH:D,A.")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_935,(double)0.3259611086016555);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_935).equals((double)0.3259611086016555)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_934.add(v_935);
int v_938 = 0;
for (Object v_937: v_934) {
method_addfor_field_grades_of_class_Course.invoke(v_926, v_937);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_926, v_938).equals(v_937)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_938++;
int v_936 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_926);
if (v_936 != v_938) {
throw new IllegalStateException("array size was not correct!");
}
}
v_925.add(v_926);
v_925.add(v_811);
  Object v_939 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_939,v_852);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_939).equals(v_852)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_939,-824421968);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_939).equals(-824421968)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_940 =  new ArrayList<Object>();
v_940.add(v_883);
v_940.add(v_804);
ArrayList<Object> v_941 =  new ArrayList<Object>();
v_941.add(v_872);
v_941.add(v_892);
int v_944 = 0;
for (Object v_943: v_941) {
method_addfor_field_grades_of_class_Course.invoke(v_939, v_943);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_939, v_944).equals(v_943)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_944++;
int v_942 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_939);
if (v_942 != v_944) {
throw new IllegalStateException("array size was not correct!");
}
}
v_925.add(v_939);
ArrayList<Object> v_945 =  new ArrayList<Object>();
v_945.add(v_788);
v_945.add(v_897);
v_945.add(v_923);
int v_948 = 0;
for (Object v_947: v_945) {
method_addfor_field_taught_of_class_Faculty.invoke(v_924, v_947);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_924, v_948).equals(v_947)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_948++;
int v_946 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_924);
if (v_946 != v_948) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_923,v_924);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_923).equals(v_924)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_923,897935383);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_923).equals(897935383)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_949 =  new ArrayList<Object>();
  Object v_950 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_950,v_788);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_950).equals(v_788)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_950,"YM68H2?1##,BT3");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_950).equals("YM68H2?1##,BT3")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_950,(double)0.8693180061853388);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_950).equals((double)0.8693180061853388)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_949.add(v_950);
  Object v_951 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_951,v_798);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_951).equals(v_798)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_951,"BBS0,0ZU:O<V)2-/");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_951).equals("BBS0,0ZU:O<V)2-/")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_951,(double)0.9280800777276876);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_951).equals((double)0.9280800777276876)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_949.add(v_951);
v_949.add(v_896);
ArrayList<Object> v_952 =  new ArrayList<Object>();
v_952.add(v_935);
v_952.add(v_872);
v_952.add(v_821);
v_952.add(v_912);
int v_955 = 0;
for (Object v_954: v_952) {
method_addfor_field_grades_of_class_Course.invoke(v_923, v_954);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_923, v_955).equals(v_954)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_955++;
int v_953 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_923);
if (v_953 != v_955) {
throw new IllegalStateException("array size was not correct!");
}
}
v_922.add(v_923);
v_922.add(v_801);
  Object v_956 = class_Course.getDeclaredConstructor().newInstance();
  Object v_957 = class_Faculty.getDeclaredConstructor().newInstance();
  method_setfor_field_name_of_class_Faculty.invoke(v_957,"BXO10&PLM358");
  if(!method_getfor_field_name_of_class_Faculty.invoke(v_957).equals("BXO10&PLM358")) {
    throw new UnsupportedOperationException("get/set for field name did not work correctly");
  }
ArrayList<Object> v_958 =  new ArrayList<Object>();
v_958.add(v_811);
  Object v_959 = class_Course.getDeclaredConstructor().newInstance();
  method_setfor_field_instructor_of_class_Course.invoke(v_959,v_812);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_959).equals(v_812)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_959,1614740482);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_959).equals(1614740482)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_960 =  new ArrayList<Object>();
v_960.add(v_803);
  Object v_961 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_961,v_939);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_961).equals(v_939)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_961,">8U4CA5M");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_961).equals(">8U4CA5M")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_961,(double)0.8015392009005339);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_961).equals((double)0.8015392009005339)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_960.add(v_961);
  Object v_962 = class_Grade.getDeclaredConstructor().newInstance();
  method_setfor_field_course_of_class_Grade.invoke(v_962,v_913);
  if(!method_getfor_field_course_of_class_Grade.invoke(v_962).equals(v_913)) {
    throw new UnsupportedOperationException("get/set for field course did not work correctly");
  }
  method_setfor_field_student_of_class_Grade.invoke(v_962,"?BEDR72&KHJK");
  if(!method_getfor_field_student_of_class_Grade.invoke(v_962).equals("?BEDR72&KHJK")) {
    throw new UnsupportedOperationException("get/set for field student did not work correctly");
  }
  method_setfor_field_grade_of_class_Grade.invoke(v_962,(double)0.4456014938366316);
  if(!method_getfor_field_grade_of_class_Grade.invoke(v_962).equals((double)0.4456014938366316)) {
    throw new UnsupportedOperationException("get/set for field grade did not work correctly");
  }
v_960.add(v_962);
v_960.add(v_896);
ArrayList<Object> v_963 =  new ArrayList<Object>();
v_963.add(v_803);
v_963.add(v_864);
int v_966 = 0;
for (Object v_965: v_963) {
method_addfor_field_grades_of_class_Course.invoke(v_959, v_965);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_959, v_966).equals(v_965)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_966++;
int v_964 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_959);
if (v_964 != v_966) {
throw new IllegalStateException("array size was not correct!");
}
}
v_958.add(v_959);
v_958.add(v_805);
v_958.add(v_869);
ArrayList<Object> v_967 =  new ArrayList<Object>();
v_967.add(v_808);
v_967.add(v_897);
v_967.add(v_788);
int v_970 = 0;
for (Object v_969: v_967) {
method_addfor_field_taught_of_class_Faculty.invoke(v_957, v_969);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_957, v_970).equals(v_969)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_970++;
int v_968 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_957);
if (v_968 != v_970) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_956,v_858);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_956).equals(v_858)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_956,2114858351);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_956).equals(2114858351)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_971 =  new ArrayList<Object>();
v_971.add(v_820);
v_971.add(v_827);
v_971.add(v_912);
ArrayList<Object> v_972 =  new ArrayList<Object>();
v_972.add(v_883);
v_972.add(v_935);
int v_975 = 0;
for (Object v_974: v_972) {
method_addfor_field_grades_of_class_Course.invoke(v_956, v_974);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_956, v_975).equals(v_974)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_975++;
int v_973 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_956);
if (v_973 != v_975) {
throw new IllegalStateException("array size was not correct!");
}
}
v_922.add(v_956);
int v_978 = 0;
for (Object v_977: v_922) {
method_addfor_field_taught_of_class_Faculty.invoke(v_789, v_977);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_789, v_978).equals(v_977)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_978++;
int v_976 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_789);
if (v_976 != v_978) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_788,v_789);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_788).equals(v_789)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_788,743118990);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_788).equals(743118990)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_979 =  new ArrayList<Object>();
v_979.add(v_961);
v_979.add(v_842);
ArrayList<Object> v_980 =  new ArrayList<Object>();
v_980.add(v_864);
v_980.add(v_864);
int v_983 = 0;
for (Object v_982: v_980) {
method_addfor_field_grades_of_class_Course.invoke(v_788, v_982);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_788, v_983).equals(v_982)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_983++;
int v_981 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_788);
if (v_981 != v_983) {
throw new IllegalStateException("array size was not correct!");
}
}
v_787.add(v_788);
v_787.add(v_791);
ArrayList<Object> v_984 =  new ArrayList<Object>();
v_984.add(v_869);
v_984.add(v_939);
v_984.add(v_956);
v_984.add(v_913);
int v_987 = 0;
for (Object v_986: v_984) {
method_addfor_field_taught_of_class_Faculty.invoke(v_786, v_986);
if ( !method_getfor_field_taught_of_class_Faculty.invoke(v_786, v_987).equals(v_986)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_987++;
int v_985 = (Integer)method_numfor_field_taught_of_class_Faculty.invoke(v_786);
if (v_985 != v_987) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_instructor_of_class_Course.invoke(v_785,v_809);
  if(!method_getfor_field_instructor_of_class_Course.invoke(v_785).equals(v_809)) {
    throw new UnsupportedOperationException("get/set for field instructor did not work correctly");
  }
  method_setfor_field_numStudents_of_class_Course.invoke(v_785,-2050085471);
  if(!method_getfor_field_numStudents_of_class_Course.invoke(v_785).equals(-2050085471)) {
    throw new UnsupportedOperationException("get/set for field numStudents did not work correctly");
  }
ArrayList<Object> v_988 =  new ArrayList<Object>();
v_988.add(v_892);
v_988.add(v_842);
v_988.add(v_803);
v_988.add(v_797);
ArrayList<Object> v_989 =  new ArrayList<Object>();
v_989.add(v_961);
v_989.add(v_874);
int v_992 = 0;
for (Object v_991: v_989) {
method_addfor_field_grades_of_class_Course.invoke(v_785, v_991);
if ( !method_getfor_field_grades_of_class_Course.invoke(v_785, v_992).equals(v_991)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_992++;
int v_990 = (Integer)method_numfor_field_grades_of_class_Course.invoke(v_785);
if (v_990 != v_992) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Course.invoke(v_785);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Course.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_785);
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
