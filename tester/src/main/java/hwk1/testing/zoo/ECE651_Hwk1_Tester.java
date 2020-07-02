package hwk1.testing.zoo;

import java.lang.reflect.*;
import java.util.*;
import org.json.*;
import edu.duke.ece651.hwk1tester.*;

public class ECE651_Hwk1_Tester implements Hwk1Tester {
  private Class<?> class_AnimalPen;
  private Field field_xloc_of_class_AnimalPen;
  private Method method_getfor_field_xloc_of_class_AnimalPen;
  private Method method_setfor_field_xloc_of_class_AnimalPen;
  private Field field_yloc_of_class_AnimalPen;
  private Method method_getfor_field_yloc_of_class_AnimalPen;
  private Method method_setfor_field_yloc_of_class_AnimalPen;
  private Field field_width_of_class_AnimalPen;
  private Method method_getfor_field_width_of_class_AnimalPen;
  private Method method_setfor_field_width_of_class_AnimalPen;
  private Field field_length_of_class_AnimalPen;
  private Method method_getfor_field_length_of_class_AnimalPen;
  private Method method_setfor_field_length_of_class_AnimalPen;
  private Field field_height_of_class_AnimalPen;
  private Method method_getfor_field_height_of_class_AnimalPen;
  private Method method_setfor_field_height_of_class_AnimalPen;
  private Field field_animals_of_class_AnimalPen;
  private Method method_getfor_field_animals_of_class_AnimalPen;
  private Method method_setfor_field_animals_of_class_AnimalPen;
  private Method method_addfor_field_animals_of_class_AnimalPen;
  private Method method_numfor_field_animals_of_class_AnimalPen;
  private Field field_signText_of_class_AnimalPen;
  private Method method_getfor_field_signText_of_class_AnimalPen;
  private Method method_setfor_field_signText_of_class_AnimalPen;
  private Class<?> class_Animal;
  private Field field_myName_of_class_Animal;
  private Method method_getfor_field_myName_of_class_Animal;
  private Method method_setfor_field_myName_of_class_Animal;
  private Field field_species_of_class_Animal;
  private Method method_getfor_field_species_of_class_Animal;
  private Method method_setfor_field_species_of_class_Animal;
  private Field field_age_of_class_Animal;
  private Method method_getfor_field_age_of_class_Animal;
  private Method method_setfor_field_age_of_class_Animal;
  private Field field_foodsByPreference_of_class_Animal;
  private Method method_getfor_field_foodsByPreference_of_class_Animal;
  private Method method_setfor_field_foodsByPreference_of_class_Animal;
  private Method method_addfor_field_foodsByPreference_of_class_Animal;
  private Method method_numfor_field_foodsByPreference_of_class_Animal;
  private Class<?> class_Keeper;
  private Field field_firstName_of_class_Keeper;
  private Method method_getfor_field_firstName_of_class_Keeper;
  private Method method_setfor_field_firstName_of_class_Keeper;
  private Field field_lastName_of_class_Keeper;
  private Method method_getfor_field_lastName_of_class_Keeper;
  private Method method_setfor_field_lastName_of_class_Keeper;
  private Field field_salary_of_class_Keeper;
  private Method method_getfor_field_salary_of_class_Keeper;
  private Method method_setfor_field_salary_of_class_Keeper;
  private Field field_myPens_of_class_Keeper;
  private Method method_getfor_field_myPens_of_class_Keeper;
  private Method method_setfor_field_myPens_of_class_Keeper;
  private Method method_addfor_field_myPens_of_class_Keeper;
  private Method method_numfor_field_myPens_of_class_Keeper;
  private Class<?> class_Food;
  private Field field_foodName_of_class_Food;
  private Method method_getfor_field_foodName_of_class_Food;
  private Method method_setfor_field_foodName_of_class_Food;
  private Field field_isMeat_of_class_Food;
  private Method method_getfor_field_isMeat_of_class_Food;
  private Method method_setfor_field_isMeat_of_class_Food;
  private Class<?> class__Deserializer;
  private Method deser_method_for_AnimalPen;
  private Method tojson_method_for_AnimalPen;
  private Method deser_method_for_Animal;
  private Method tojson_method_for_Animal;
  private Method deser_method_for_Keeper;
  private Method tojson_method_for_Keeper;
  private Method deser_method_for_Food;
  private Method tojson_method_for_Food;
  public ECE651_Hwk1_Tester() throws Exception{
    class_AnimalPen = Class.forName("hwk1.testing.zoo.AnimalPen");
    class_Animal = Class.forName("hwk1.testing.zoo.Animal");
    class_Keeper = Class.forName("hwk1.testing.zoo.Keeper");
    class_Food = Class.forName("hwk1.testing.zoo.Food");
    class__Deserializer = Class.forName("hwk1.testing.zoo.Deserializer");
    field_xloc_of_class_AnimalPen = class_AnimalPen.getDeclaredField("xloc");
    method_getfor_field_xloc_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("getXloc");
    method_setfor_field_xloc_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("setXloc", Float.TYPE);
    field_yloc_of_class_AnimalPen = class_AnimalPen.getDeclaredField("yloc");
    method_getfor_field_yloc_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("getYloc");
    method_setfor_field_yloc_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("setYloc", Float.TYPE);
    field_width_of_class_AnimalPen = class_AnimalPen.getDeclaredField("width");
    method_getfor_field_width_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("getWidth");
    method_setfor_field_width_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("setWidth", Float.TYPE);
    field_length_of_class_AnimalPen = class_AnimalPen.getDeclaredField("length");
    method_getfor_field_length_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("getLength");
    method_setfor_field_length_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("setLength", Float.TYPE);
    field_height_of_class_AnimalPen = class_AnimalPen.getDeclaredField("height");
    method_getfor_field_height_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("getHeight");
    method_setfor_field_height_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("setHeight", Float.TYPE);
    field_animals_of_class_AnimalPen = class_AnimalPen.getDeclaredField("animals");
    method_getfor_field_animals_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("getAnimals", Integer.TYPE);
    method_setfor_field_animals_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("setAnimals", Integer.TYPE,class_Animal);
    method_numfor_field_animals_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("numAnimals");
    method_addfor_field_animals_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("addAnimals", class_Animal);
    field_signText_of_class_AnimalPen = class_AnimalPen.getDeclaredField("signText");
    method_getfor_field_signText_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("getSignText");
    method_setfor_field_signText_of_class_AnimalPen = class_AnimalPen.getDeclaredMethod("setSignText", String.class);
    tojson_method_for_AnimalPen = class_AnimalPen.getDeclaredMethod("toJSON");
    deser_method_for_AnimalPen = class__Deserializer.getDeclaredMethod("readAnimalPen", JSONObject.class);
    field_myName_of_class_Animal = class_Animal.getDeclaredField("myName");
    method_getfor_field_myName_of_class_Animal = class_Animal.getDeclaredMethod("getMyName");
    method_setfor_field_myName_of_class_Animal = class_Animal.getDeclaredMethod("setMyName", String.class);
    field_species_of_class_Animal = class_Animal.getDeclaredField("species");
    method_getfor_field_species_of_class_Animal = class_Animal.getDeclaredMethod("getSpecies");
    method_setfor_field_species_of_class_Animal = class_Animal.getDeclaredMethod("setSpecies", String.class);
    field_age_of_class_Animal = class_Animal.getDeclaredField("age");
    method_getfor_field_age_of_class_Animal = class_Animal.getDeclaredMethod("getAge");
    method_setfor_field_age_of_class_Animal = class_Animal.getDeclaredMethod("setAge", Integer.TYPE);
    field_foodsByPreference_of_class_Animal = class_Animal.getDeclaredField("foodsByPreference");
    method_getfor_field_foodsByPreference_of_class_Animal = class_Animal.getDeclaredMethod("getFoodsByPreference", Integer.TYPE);
    method_setfor_field_foodsByPreference_of_class_Animal = class_Animal.getDeclaredMethod("setFoodsByPreference", Integer.TYPE,Collection.class);
    method_numfor_field_foodsByPreference_of_class_Animal = class_Animal.getDeclaredMethod("numFoodsByPreference");
    method_addfor_field_foodsByPreference_of_class_Animal = class_Animal.getDeclaredMethod("addFoodsByPreference", Collection.class);
    tojson_method_for_Animal = class_Animal.getDeclaredMethod("toJSON");
    deser_method_for_Animal = class__Deserializer.getDeclaredMethod("readAnimal", JSONObject.class);
    field_firstName_of_class_Keeper = class_Keeper.getDeclaredField("firstName");
    method_getfor_field_firstName_of_class_Keeper = class_Keeper.getDeclaredMethod("getFirstName");
    method_setfor_field_firstName_of_class_Keeper = class_Keeper.getDeclaredMethod("setFirstName", String.class);
    field_lastName_of_class_Keeper = class_Keeper.getDeclaredField("lastName");
    method_getfor_field_lastName_of_class_Keeper = class_Keeper.getDeclaredMethod("getLastName");
    method_setfor_field_lastName_of_class_Keeper = class_Keeper.getDeclaredMethod("setLastName", String.class);
    field_salary_of_class_Keeper = class_Keeper.getDeclaredField("salary");
    method_getfor_field_salary_of_class_Keeper = class_Keeper.getDeclaredMethod("getSalary");
    method_setfor_field_salary_of_class_Keeper = class_Keeper.getDeclaredMethod("setSalary", Double.TYPE);
    field_myPens_of_class_Keeper = class_Keeper.getDeclaredField("myPens");
    method_getfor_field_myPens_of_class_Keeper = class_Keeper.getDeclaredMethod("getMyPens", Integer.TYPE);
    method_setfor_field_myPens_of_class_Keeper = class_Keeper.getDeclaredMethod("setMyPens", Integer.TYPE,class_AnimalPen);
    method_numfor_field_myPens_of_class_Keeper = class_Keeper.getDeclaredMethod("numMyPens");
    method_addfor_field_myPens_of_class_Keeper = class_Keeper.getDeclaredMethod("addMyPens", class_AnimalPen);
    tojson_method_for_Keeper = class_Keeper.getDeclaredMethod("toJSON");
    deser_method_for_Keeper = class__Deserializer.getDeclaredMethod("readKeeper", JSONObject.class);
    field_foodName_of_class_Food = class_Food.getDeclaredField("foodName");
    method_getfor_field_foodName_of_class_Food = class_Food.getDeclaredMethod("getFoodName");
    method_setfor_field_foodName_of_class_Food = class_Food.getDeclaredMethod("setFoodName", String.class);
    field_isMeat_of_class_Food = class_Food.getDeclaredField("isMeat");
    method_getfor_field_isMeat_of_class_Food = class_Food.getDeclaredMethod("getIsMeat");
    method_setfor_field_isMeat_of_class_Food = class_Food.getDeclaredMethod("setIsMeat", Boolean.TYPE);
    tojson_method_for_Food = class_Food.getDeclaredMethod("toJSON");
    deser_method_for_Food = class__Deserializer.getDeclaredMethod("readFood", JSONObject.class);
  }
  public void checkTypes() throws Exception {
if(!field_xloc_of_class_AnimalPen.getType().equals(Float.TYPE)) {
  throw new IllegalStateException("Field xloc does not have the right type");
}
if(field_xloc_of_class_AnimalPen.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field xloc to be private, but was "+Modifier.toString(field_xloc_of_class_AnimalPen.getModifiers()));
}
if(!method_getfor_field_xloc_of_class_AnimalPen.getReturnType().equals(Float.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_xloc_of_class_AnimalPen+" to have return type "+Float.TYPE+" but was actually " +method_getfor_field_xloc_of_class_AnimalPen.getReturnType());
}
if(method_getfor_field_xloc_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_xloc_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_getfor_field_xloc_of_class_AnimalPen.getModifiers()));
}
if(!method_setfor_field_xloc_of_class_AnimalPen.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_xloc_of_class_AnimalPen+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_xloc_of_class_AnimalPen.getReturnType());
}
if(method_setfor_field_xloc_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_xloc_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_setfor_field_xloc_of_class_AnimalPen.getModifiers()));
}
if(!field_yloc_of_class_AnimalPen.getType().equals(Float.TYPE)) {
  throw new IllegalStateException("Field yloc does not have the right type");
}
if(field_yloc_of_class_AnimalPen.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field yloc to be private, but was "+Modifier.toString(field_yloc_of_class_AnimalPen.getModifiers()));
}
if(!method_getfor_field_yloc_of_class_AnimalPen.getReturnType().equals(Float.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_yloc_of_class_AnimalPen+" to have return type "+Float.TYPE+" but was actually " +method_getfor_field_yloc_of_class_AnimalPen.getReturnType());
}
if(method_getfor_field_yloc_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_yloc_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_getfor_field_yloc_of_class_AnimalPen.getModifiers()));
}
if(!method_setfor_field_yloc_of_class_AnimalPen.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_yloc_of_class_AnimalPen+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_yloc_of_class_AnimalPen.getReturnType());
}
if(method_setfor_field_yloc_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_yloc_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_setfor_field_yloc_of_class_AnimalPen.getModifiers()));
}
if(!field_width_of_class_AnimalPen.getType().equals(Float.TYPE)) {
  throw new IllegalStateException("Field width does not have the right type");
}
if(field_width_of_class_AnimalPen.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field width to be private, but was "+Modifier.toString(field_width_of_class_AnimalPen.getModifiers()));
}
if(!method_getfor_field_width_of_class_AnimalPen.getReturnType().equals(Float.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_width_of_class_AnimalPen+" to have return type "+Float.TYPE+" but was actually " +method_getfor_field_width_of_class_AnimalPen.getReturnType());
}
if(method_getfor_field_width_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_width_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_getfor_field_width_of_class_AnimalPen.getModifiers()));
}
if(!method_setfor_field_width_of_class_AnimalPen.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_width_of_class_AnimalPen+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_width_of_class_AnimalPen.getReturnType());
}
if(method_setfor_field_width_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_width_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_setfor_field_width_of_class_AnimalPen.getModifiers()));
}
if(!field_length_of_class_AnimalPen.getType().equals(Float.TYPE)) {
  throw new IllegalStateException("Field length does not have the right type");
}
if(field_length_of_class_AnimalPen.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field length to be private, but was "+Modifier.toString(field_length_of_class_AnimalPen.getModifiers()));
}
if(!method_getfor_field_length_of_class_AnimalPen.getReturnType().equals(Float.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_length_of_class_AnimalPen+" to have return type "+Float.TYPE+" but was actually " +method_getfor_field_length_of_class_AnimalPen.getReturnType());
}
if(method_getfor_field_length_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_length_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_getfor_field_length_of_class_AnimalPen.getModifiers()));
}
if(!method_setfor_field_length_of_class_AnimalPen.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_length_of_class_AnimalPen+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_length_of_class_AnimalPen.getReturnType());
}
if(method_setfor_field_length_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_length_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_setfor_field_length_of_class_AnimalPen.getModifiers()));
}
if(!field_height_of_class_AnimalPen.getType().equals(Float.TYPE)) {
  throw new IllegalStateException("Field height does not have the right type");
}
if(field_height_of_class_AnimalPen.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field height to be private, but was "+Modifier.toString(field_height_of_class_AnimalPen.getModifiers()));
}
if(!method_getfor_field_height_of_class_AnimalPen.getReturnType().equals(Float.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_height_of_class_AnimalPen+" to have return type "+Float.TYPE+" but was actually " +method_getfor_field_height_of_class_AnimalPen.getReturnType());
}
if(method_getfor_field_height_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_height_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_getfor_field_height_of_class_AnimalPen.getModifiers()));
}
if(!method_setfor_field_height_of_class_AnimalPen.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_height_of_class_AnimalPen+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_height_of_class_AnimalPen.getReturnType());
}
if(method_setfor_field_height_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_height_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_setfor_field_height_of_class_AnimalPen.getModifiers()));
}
if(field_animals_of_class_AnimalPen.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field animals to be private, but was "+Modifier.toString(field_animals_of_class_AnimalPen.getModifiers()));
}
if(!method_addfor_field_animals_of_class_AnimalPen.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_animals_of_class_AnimalPen+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_animals_of_class_AnimalPen.getReturnType());
}
if(method_addfor_field_animals_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_animals_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_addfor_field_animals_of_class_AnimalPen.getModifiers()));
}
if(!method_numfor_field_animals_of_class_AnimalPen.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_animals_of_class_AnimalPen+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_animals_of_class_AnimalPen.getReturnType());
}
if(method_numfor_field_animals_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_animals_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_numfor_field_animals_of_class_AnimalPen.getModifiers()));
}
if(!method_getfor_field_animals_of_class_AnimalPen.getReturnType().equals(class_Animal)) {
throw new IllegalStateException("Expected method "+method_getfor_field_animals_of_class_AnimalPen+" to have return type "+class_Animal+" but was actually " +method_getfor_field_animals_of_class_AnimalPen.getReturnType());
}
if(method_getfor_field_animals_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_animals_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_getfor_field_animals_of_class_AnimalPen.getModifiers()));
}
if(!method_setfor_field_animals_of_class_AnimalPen.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_animals_of_class_AnimalPen+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_animals_of_class_AnimalPen.getReturnType());
}
if(method_setfor_field_animals_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_animals_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_setfor_field_animals_of_class_AnimalPen.getModifiers()));
}
if(!field_signText_of_class_AnimalPen.getType().equals(String.class)) {
  throw new IllegalStateException("Field signText does not have the right type");
}
if(field_signText_of_class_AnimalPen.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field signText to be private, but was "+Modifier.toString(field_signText_of_class_AnimalPen.getModifiers()));
}
if(!method_getfor_field_signText_of_class_AnimalPen.getReturnType().equals(String.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_signText_of_class_AnimalPen+" to have return type "+String.class+" but was actually " +method_getfor_field_signText_of_class_AnimalPen.getReturnType());
}
if(method_getfor_field_signText_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_signText_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_getfor_field_signText_of_class_AnimalPen.getModifiers()));
}
if(!method_setfor_field_signText_of_class_AnimalPen.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_signText_of_class_AnimalPen+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_signText_of_class_AnimalPen.getReturnType());
}
if(method_setfor_field_signText_of_class_AnimalPen.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_signText_of_class_AnimalPen+" to be public , but was "+Modifier.toString(method_setfor_field_signText_of_class_AnimalPen.getModifiers()));
}
if(!field_myName_of_class_Animal.getType().equals(String.class)) {
  throw new IllegalStateException("Field myName does not have the right type");
}
if(field_myName_of_class_Animal.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field myName to be private, but was "+Modifier.toString(field_myName_of_class_Animal.getModifiers()));
}
if(!method_getfor_field_myName_of_class_Animal.getReturnType().equals(String.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_myName_of_class_Animal+" to have return type "+String.class+" but was actually " +method_getfor_field_myName_of_class_Animal.getReturnType());
}
if(method_getfor_field_myName_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_myName_of_class_Animal+" to be public , but was "+Modifier.toString(method_getfor_field_myName_of_class_Animal.getModifiers()));
}
if(!method_setfor_field_myName_of_class_Animal.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_myName_of_class_Animal+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_myName_of_class_Animal.getReturnType());
}
if(method_setfor_field_myName_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_myName_of_class_Animal+" to be public , but was "+Modifier.toString(method_setfor_field_myName_of_class_Animal.getModifiers()));
}
if(!field_species_of_class_Animal.getType().equals(String.class)) {
  throw new IllegalStateException("Field species does not have the right type");
}
if(field_species_of_class_Animal.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field species to be private, but was "+Modifier.toString(field_species_of_class_Animal.getModifiers()));
}
if(!method_getfor_field_species_of_class_Animal.getReturnType().equals(String.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_species_of_class_Animal+" to have return type "+String.class+" but was actually " +method_getfor_field_species_of_class_Animal.getReturnType());
}
if(method_getfor_field_species_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_species_of_class_Animal+" to be public , but was "+Modifier.toString(method_getfor_field_species_of_class_Animal.getModifiers()));
}
if(!method_setfor_field_species_of_class_Animal.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_species_of_class_Animal+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_species_of_class_Animal.getReturnType());
}
if(method_setfor_field_species_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_species_of_class_Animal+" to be public , but was "+Modifier.toString(method_setfor_field_species_of_class_Animal.getModifiers()));
}
if(!field_age_of_class_Animal.getType().equals(Integer.TYPE)) {
  throw new IllegalStateException("Field age does not have the right type");
}
if(field_age_of_class_Animal.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field age to be private, but was "+Modifier.toString(field_age_of_class_Animal.getModifiers()));
}
if(!method_getfor_field_age_of_class_Animal.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_age_of_class_Animal+" to have return type "+Integer.TYPE+" but was actually " +method_getfor_field_age_of_class_Animal.getReturnType());
}
if(method_getfor_field_age_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_age_of_class_Animal+" to be public , but was "+Modifier.toString(method_getfor_field_age_of_class_Animal.getModifiers()));
}
if(!method_setfor_field_age_of_class_Animal.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_age_of_class_Animal+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_age_of_class_Animal.getReturnType());
}
if(method_setfor_field_age_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_age_of_class_Animal+" to be public , but was "+Modifier.toString(method_setfor_field_age_of_class_Animal.getModifiers()));
}
if(field_foodsByPreference_of_class_Animal.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field foodsByPreference to be private, but was "+Modifier.toString(field_foodsByPreference_of_class_Animal.getModifiers()));
}
if(!method_addfor_field_foodsByPreference_of_class_Animal.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_foodsByPreference_of_class_Animal+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_foodsByPreference_of_class_Animal.getReturnType());
}
if(method_addfor_field_foodsByPreference_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_foodsByPreference_of_class_Animal+" to be public , but was "+Modifier.toString(method_addfor_field_foodsByPreference_of_class_Animal.getModifiers()));
}
if(!method_numfor_field_foodsByPreference_of_class_Animal.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_foodsByPreference_of_class_Animal+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_foodsByPreference_of_class_Animal.getReturnType());
}
if(method_numfor_field_foodsByPreference_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_foodsByPreference_of_class_Animal+" to be public , but was "+Modifier.toString(method_numfor_field_foodsByPreference_of_class_Animal.getModifiers()));
}
if(!method_getfor_field_foodsByPreference_of_class_Animal.getReturnType().equals(Collection.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_foodsByPreference_of_class_Animal+" to have return type "+Collection.class+" but was actually " +method_getfor_field_foodsByPreference_of_class_Animal.getReturnType());
}
if(method_getfor_field_foodsByPreference_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_foodsByPreference_of_class_Animal+" to be public , but was "+Modifier.toString(method_getfor_field_foodsByPreference_of_class_Animal.getModifiers()));
}
if(!method_setfor_field_foodsByPreference_of_class_Animal.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_foodsByPreference_of_class_Animal+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_foodsByPreference_of_class_Animal.getReturnType());
}
if(method_setfor_field_foodsByPreference_of_class_Animal.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_foodsByPreference_of_class_Animal+" to be public , but was "+Modifier.toString(method_setfor_field_foodsByPreference_of_class_Animal.getModifiers()));
}
if(!field_firstName_of_class_Keeper.getType().equals(String.class)) {
  throw new IllegalStateException("Field firstName does not have the right type");
}
if(field_firstName_of_class_Keeper.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field firstName to be private, but was "+Modifier.toString(field_firstName_of_class_Keeper.getModifiers()));
}
if(!method_getfor_field_firstName_of_class_Keeper.getReturnType().equals(String.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_firstName_of_class_Keeper+" to have return type "+String.class+" but was actually " +method_getfor_field_firstName_of_class_Keeper.getReturnType());
}
if(method_getfor_field_firstName_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_firstName_of_class_Keeper+" to be public , but was "+Modifier.toString(method_getfor_field_firstName_of_class_Keeper.getModifiers()));
}
if(!method_setfor_field_firstName_of_class_Keeper.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_firstName_of_class_Keeper+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_firstName_of_class_Keeper.getReturnType());
}
if(method_setfor_field_firstName_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_firstName_of_class_Keeper+" to be public , but was "+Modifier.toString(method_setfor_field_firstName_of_class_Keeper.getModifiers()));
}
if(!field_lastName_of_class_Keeper.getType().equals(String.class)) {
  throw new IllegalStateException("Field lastName does not have the right type");
}
if(field_lastName_of_class_Keeper.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field lastName to be private, but was "+Modifier.toString(field_lastName_of_class_Keeper.getModifiers()));
}
if(!method_getfor_field_lastName_of_class_Keeper.getReturnType().equals(String.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_lastName_of_class_Keeper+" to have return type "+String.class+" but was actually " +method_getfor_field_lastName_of_class_Keeper.getReturnType());
}
if(method_getfor_field_lastName_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_lastName_of_class_Keeper+" to be public , but was "+Modifier.toString(method_getfor_field_lastName_of_class_Keeper.getModifiers()));
}
if(!method_setfor_field_lastName_of_class_Keeper.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_lastName_of_class_Keeper+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_lastName_of_class_Keeper.getReturnType());
}
if(method_setfor_field_lastName_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_lastName_of_class_Keeper+" to be public , but was "+Modifier.toString(method_setfor_field_lastName_of_class_Keeper.getModifiers()));
}
if(!field_salary_of_class_Keeper.getType().equals(Double.TYPE)) {
  throw new IllegalStateException("Field salary does not have the right type");
}
if(field_salary_of_class_Keeper.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field salary to be private, but was "+Modifier.toString(field_salary_of_class_Keeper.getModifiers()));
}
if(!method_getfor_field_salary_of_class_Keeper.getReturnType().equals(Double.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_salary_of_class_Keeper+" to have return type "+Double.TYPE+" but was actually " +method_getfor_field_salary_of_class_Keeper.getReturnType());
}
if(method_getfor_field_salary_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_salary_of_class_Keeper+" to be public , but was "+Modifier.toString(method_getfor_field_salary_of_class_Keeper.getModifiers()));
}
if(!method_setfor_field_salary_of_class_Keeper.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_salary_of_class_Keeper+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_salary_of_class_Keeper.getReturnType());
}
if(method_setfor_field_salary_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_salary_of_class_Keeper+" to be public , but was "+Modifier.toString(method_setfor_field_salary_of_class_Keeper.getModifiers()));
}
if(field_myPens_of_class_Keeper.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field myPens to be private, but was "+Modifier.toString(field_myPens_of_class_Keeper.getModifiers()));
}
if(!method_addfor_field_myPens_of_class_Keeper.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_myPens_of_class_Keeper+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_myPens_of_class_Keeper.getReturnType());
}
if(method_addfor_field_myPens_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_myPens_of_class_Keeper+" to be public , but was "+Modifier.toString(method_addfor_field_myPens_of_class_Keeper.getModifiers()));
}
if(!method_numfor_field_myPens_of_class_Keeper.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_myPens_of_class_Keeper+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_myPens_of_class_Keeper.getReturnType());
}
if(method_numfor_field_myPens_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_myPens_of_class_Keeper+" to be public , but was "+Modifier.toString(method_numfor_field_myPens_of_class_Keeper.getModifiers()));
}
if(!method_getfor_field_myPens_of_class_Keeper.getReturnType().equals(class_AnimalPen)) {
throw new IllegalStateException("Expected method "+method_getfor_field_myPens_of_class_Keeper+" to have return type "+class_AnimalPen+" but was actually " +method_getfor_field_myPens_of_class_Keeper.getReturnType());
}
if(method_getfor_field_myPens_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_myPens_of_class_Keeper+" to be public , but was "+Modifier.toString(method_getfor_field_myPens_of_class_Keeper.getModifiers()));
}
if(!method_setfor_field_myPens_of_class_Keeper.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_myPens_of_class_Keeper+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_myPens_of_class_Keeper.getReturnType());
}
if(method_setfor_field_myPens_of_class_Keeper.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_myPens_of_class_Keeper+" to be public , but was "+Modifier.toString(method_setfor_field_myPens_of_class_Keeper.getModifiers()));
}
if(!field_foodName_of_class_Food.getType().equals(String.class)) {
  throw new IllegalStateException("Field foodName does not have the right type");
}
if(field_foodName_of_class_Food.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field foodName to be private, but was "+Modifier.toString(field_foodName_of_class_Food.getModifiers()));
}
if(!method_getfor_field_foodName_of_class_Food.getReturnType().equals(String.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_foodName_of_class_Food+" to have return type "+String.class+" but was actually " +method_getfor_field_foodName_of_class_Food.getReturnType());
}
if(method_getfor_field_foodName_of_class_Food.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_foodName_of_class_Food+" to be public , but was "+Modifier.toString(method_getfor_field_foodName_of_class_Food.getModifiers()));
}
if(!method_setfor_field_foodName_of_class_Food.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_foodName_of_class_Food+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_foodName_of_class_Food.getReturnType());
}
if(method_setfor_field_foodName_of_class_Food.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_foodName_of_class_Food+" to be public , but was "+Modifier.toString(method_setfor_field_foodName_of_class_Food.getModifiers()));
}
if(!field_isMeat_of_class_Food.getType().equals(Boolean.TYPE)) {
  throw new IllegalStateException("Field isMeat does not have the right type");
}
if(field_isMeat_of_class_Food.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field isMeat to be private, but was "+Modifier.toString(field_isMeat_of_class_Food.getModifiers()));
}
if(!method_getfor_field_isMeat_of_class_Food.getReturnType().equals(Boolean.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_isMeat_of_class_Food+" to have return type "+Boolean.TYPE+" but was actually " +method_getfor_field_isMeat_of_class_Food.getReturnType());
}
if(method_getfor_field_isMeat_of_class_Food.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_isMeat_of_class_Food+" to be public , but was "+Modifier.toString(method_getfor_field_isMeat_of_class_Food.getModifiers()));
}
if(!method_setfor_field_isMeat_of_class_Food.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_isMeat_of_class_Food+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_isMeat_of_class_Food.getReturnType());
}
if(method_setfor_field_isMeat_of_class_Food.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_isMeat_of_class_Food+" to be public , but was "+Modifier.toString(method_setfor_field_isMeat_of_class_Food.getModifiers()));
}
  }
  public void test_AnimalPen_0() throws Exception {
    System.out.println("Starting test case: 0 for class AnimalPen");
    RunAll.logln("Starting test case: 0 for AnimalPen");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_1 = class_AnimalPen.getDeclaredConstructor().newInstance();
  method_setfor_field_xloc_of_class_AnimalPen.invoke(v_1,0.831441f);
  if(!method_getfor_field_xloc_of_class_AnimalPen.invoke(v_1).equals(0.831441f)) {
    throw new UnsupportedOperationException("get/set for field xloc did not work correctly");
  }
  method_setfor_field_yloc_of_class_AnimalPen.invoke(v_1,0.6063452f);
  if(!method_getfor_field_yloc_of_class_AnimalPen.invoke(v_1).equals(0.6063452f)) {
    throw new UnsupportedOperationException("get/set for field yloc did not work correctly");
  }
  method_setfor_field_width_of_class_AnimalPen.invoke(v_1,0.30905056f);
  if(!method_getfor_field_width_of_class_AnimalPen.invoke(v_1).equals(0.30905056f)) {
    throw new UnsupportedOperationException("get/set for field width did not work correctly");
  }
  method_setfor_field_length_of_class_AnimalPen.invoke(v_1,0.1170066f);
  if(!method_getfor_field_length_of_class_AnimalPen.invoke(v_1).equals(0.1170066f)) {
    throw new UnsupportedOperationException("get/set for field length did not work correctly");
  }
  method_setfor_field_height_of_class_AnimalPen.invoke(v_1,0.7815346f);
  if(!method_getfor_field_height_of_class_AnimalPen.invoke(v_1).equals(0.7815346f)) {
    throw new UnsupportedOperationException("get/set for field height did not work correctly");
  }
ArrayList<Object> v_2 =  new ArrayList<Object>();
ArrayList<Object> v_3 =  new ArrayList<Object>();
int v_6 = 0;
for (Object v_5: v_3) {
method_addfor_field_animals_of_class_AnimalPen.invoke(v_1, v_5);
if ( !method_getfor_field_animals_of_class_AnimalPen.invoke(v_1, v_6).equals(v_5)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_6++;
int v_4 = (Integer)method_numfor_field_animals_of_class_AnimalPen.invoke(v_1);
if (v_4 != v_6) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_signText_of_class_AnimalPen.invoke(v_1,"HF5IP8-N#R&M)N=");
  if(!method_getfor_field_signText_of_class_AnimalPen.invoke(v_1).equals("HF5IP8-N#R&M)N=")) {
    throw new UnsupportedOperationException("get/set for field signText did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_AnimalPen.invoke(v_1);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_AnimalPen.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_1);
    RunAll.logln("Finished test case: 0 for AnimalPen");
  }
  public void test_Animal_0() throws Exception {
    System.out.println("Starting test case: 0 for class Animal");
    RunAll.logln("Starting test case: 0 for Animal");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_7 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_7,"WFL#2;W.OOZ=OZTPHF");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_7).equals("WFL#2;W.OOZ=OZTPHF")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_7,"S1*0SYJ;;<:V");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_7).equals("S1*0SYJ;;<:V")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_7,1318001577);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_7).equals(1318001577)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_8 =  new ArrayList<Object>();
ArrayList<Object> v_9 =  new ArrayList<Object>();
int v_12 = 0;
for (Object v_11: v_9) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_7, v_11);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_7, v_12).equals(v_11)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_12++;
int v_10 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_7);
if (v_10 != v_12) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Animal.invoke(v_7);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Animal.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_7);
    RunAll.logln("Finished test case: 0 for Animal");
  }
  public void test_Keeper_0() throws Exception {
    System.out.println("Starting test case: 0 for class Keeper");
    RunAll.logln("Starting test case: 0 for Keeper");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_13 = class_Keeper.getDeclaredConstructor().newInstance();
  method_setfor_field_firstName_of_class_Keeper.invoke(v_13,"WFL#2;W.OOZ=OZTPHF");
  if(!method_getfor_field_firstName_of_class_Keeper.invoke(v_13).equals("WFL#2;W.OOZ=OZTPHF")) {
    throw new UnsupportedOperationException("get/set for field firstName did not work correctly");
  }
  method_setfor_field_lastName_of_class_Keeper.invoke(v_13,"S1*0SYJ;;<:V");
  if(!method_getfor_field_lastName_of_class_Keeper.invoke(v_13).equals("S1*0SYJ;;<:V")) {
    throw new UnsupportedOperationException("get/set for field lastName did not work correctly");
  }
  method_setfor_field_salary_of_class_Keeper.invoke(v_13,(double)0.7223571191888487);
  if(!method_getfor_field_salary_of_class_Keeper.invoke(v_13).equals((double)0.7223571191888487)) {
    throw new UnsupportedOperationException("get/set for field salary did not work correctly");
  }
ArrayList<Object> v_14 =  new ArrayList<Object>();
ArrayList<Object> v_15 =  new ArrayList<Object>();
int v_18 = 0;
for (Object v_17: v_15) {
method_addfor_field_myPens_of_class_Keeper.invoke(v_13, v_17);
if ( !method_getfor_field_myPens_of_class_Keeper.invoke(v_13, v_18).equals(v_17)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_18++;
int v_16 = (Integer)method_numfor_field_myPens_of_class_Keeper.invoke(v_13);
if (v_16 != v_18) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Keeper.invoke(v_13);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Keeper.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_13);
    RunAll.logln("Finished test case: 0 for Keeper");
  }
  public void test_Food_0() throws Exception {
    System.out.println("Starting test case: 0 for class Food");
    RunAll.logln("Starting test case: 0 for Food");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_19 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_19,"WFL#2;W.OOZ=OZTPHF");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_19).equals("WFL#2;W.OOZ=OZTPHF")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_19,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_19).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Food.invoke(v_19);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Food.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_19);
    RunAll.logln("Finished test case: 0 for Food");
  }
  public void test_AnimalPen_1() throws Exception {
    System.out.println("Starting test case: 1 for class AnimalPen");
    RunAll.logln("Starting test case: 1 for AnimalPen");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_20 = class_AnimalPen.getDeclaredConstructor().newInstance();
  method_setfor_field_xloc_of_class_AnimalPen.invoke(v_20,0.100473166f);
  if(!method_getfor_field_xloc_of_class_AnimalPen.invoke(v_20).equals(0.100473166f)) {
    throw new UnsupportedOperationException("get/set for field xloc did not work correctly");
  }
  method_setfor_field_yloc_of_class_AnimalPen.invoke(v_20,0.40743977f);
  if(!method_getfor_field_yloc_of_class_AnimalPen.invoke(v_20).equals(0.40743977f)) {
    throw new UnsupportedOperationException("get/set for field yloc did not work correctly");
  }
  method_setfor_field_width_of_class_AnimalPen.invoke(v_20,0.036235332f);
  if(!method_getfor_field_width_of_class_AnimalPen.invoke(v_20).equals(0.036235332f)) {
    throw new UnsupportedOperationException("get/set for field width did not work correctly");
  }
  method_setfor_field_length_of_class_AnimalPen.invoke(v_20,0.6588672f);
  if(!method_getfor_field_length_of_class_AnimalPen.invoke(v_20).equals(0.6588672f)) {
    throw new UnsupportedOperationException("get/set for field length did not work correctly");
  }
  method_setfor_field_height_of_class_AnimalPen.invoke(v_20,0.7107396f);
  if(!method_getfor_field_height_of_class_AnimalPen.invoke(v_20).equals(0.7107396f)) {
    throw new UnsupportedOperationException("get/set for field height did not work correctly");
  }
ArrayList<Object> v_21 =  new ArrayList<Object>();
  Object v_22 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_22,"37Q&5:ET(A()3I.");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_22).equals("37Q&5:ET(A()3I.")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_22,"0#'+RIVY7");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_22).equals("0#'+RIVY7")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_22,2088469028);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_22).equals(2088469028)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_23 =  new ArrayList<Object>();
ArrayList<Object> v_24 =  new ArrayList<Object>();
  Object v_25 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_25,"0N:B%LQ)/XDX4/=U");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_25).equals("0N:B%LQ)/XDX4/=U")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_25,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_25).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_24.add(v_25);
v_23.add(v_24);
ArrayList<Object> v_26 =  new ArrayList<Object>();
ArrayList<Object> v_27 =  new ArrayList<Object>();
v_27.add(v_25);
v_26.add(v_27);
ArrayList<Object> v_28 =  new ArrayList<Object>();
v_28.add(v_25);
v_26.add(v_28);
int v_31 = 0;
for (Object v_30: v_26) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_22, v_30);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_22, v_31).equals(v_30)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_31++;
int v_29 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_22);
if (v_29 != v_31) {
throw new IllegalStateException("array size was not correct!");
}
}
v_21.add(v_22);
ArrayList<Object> v_32 =  new ArrayList<Object>();
v_32.add(v_22);
  Object v_33 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_33,"R#;&K'CG");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_33).equals("R#;&K'CG")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_33,"LOHXV1&UC");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_33).equals("LOHXV1&UC")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_33,-1188109742);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_33).equals(-1188109742)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_34 =  new ArrayList<Object>();
ArrayList<Object> v_35 =  new ArrayList<Object>();
v_35.add(v_25);
  Object v_36 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_36,"4PK(.(UGJ&UI&");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_36).equals("4PK(.(UGJ&UI&")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_36,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_36).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_35.add(v_36);
v_34.add(v_35);
ArrayList<Object> v_37 =  new ArrayList<Object>();
ArrayList<Object> v_38 =  new ArrayList<Object>();
v_38.add(v_36);
v_38.add(v_25);
v_37.add(v_38);
int v_41 = 0;
for (Object v_40: v_37) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_33, v_40);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_33, v_41).equals(v_40)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_41++;
int v_39 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_33);
if (v_39 != v_41) {
throw new IllegalStateException("array size was not correct!");
}
}
v_32.add(v_33);
int v_44 = 0;
for (Object v_43: v_32) {
method_addfor_field_animals_of_class_AnimalPen.invoke(v_20, v_43);
if ( !method_getfor_field_animals_of_class_AnimalPen.invoke(v_20, v_44).equals(v_43)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_44++;
int v_42 = (Integer)method_numfor_field_animals_of_class_AnimalPen.invoke(v_20);
if (v_42 != v_44) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_signText_of_class_AnimalPen.invoke(v_20,"'Q1GJW-61#M.>");
  if(!method_getfor_field_signText_of_class_AnimalPen.invoke(v_20).equals("'Q1GJW-61#M.>")) {
    throw new UnsupportedOperationException("get/set for field signText did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_AnimalPen.invoke(v_20);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_AnimalPen.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_20);
    RunAll.logln("Finished test case: 1 for AnimalPen");
  }
  public void test_Animal_1() throws Exception {
    System.out.println("Starting test case: 1 for class Animal");
    RunAll.logln("Starting test case: 1 for Animal");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_45 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_45,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_45).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_45,"OKW");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_45).equals("OKW")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_45,609982904);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_45).equals(609982904)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_46 =  new ArrayList<Object>();
ArrayList<Object> v_47 =  new ArrayList<Object>();
  Object v_48 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_48,"+RIVY7WU4#FO");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_48).equals("+RIVY7WU4#FO")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_48,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_48).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_47.add(v_48);
v_46.add(v_47);
ArrayList<Object> v_49 =  new ArrayList<Object>();
ArrayList<Object> v_50 =  new ArrayList<Object>();
v_50.add(v_48);
v_49.add(v_50);
int v_53 = 0;
for (Object v_52: v_49) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_45, v_52);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_45, v_53).equals(v_52)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_53++;
int v_51 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_45);
if (v_51 != v_53) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Animal.invoke(v_45);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Animal.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_45);
    RunAll.logln("Finished test case: 1 for Animal");
  }
  public void test_Keeper_1() throws Exception {
    System.out.println("Starting test case: 1 for class Keeper");
    RunAll.logln("Starting test case: 1 for Keeper");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_54 = class_Keeper.getDeclaredConstructor().newInstance();
  method_setfor_field_firstName_of_class_Keeper.invoke(v_54,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_firstName_of_class_Keeper.invoke(v_54).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field firstName did not work correctly");
  }
  method_setfor_field_lastName_of_class_Keeper.invoke(v_54,"OKW");
  if(!method_getfor_field_lastName_of_class_Keeper.invoke(v_54).equals("OKW")) {
    throw new UnsupportedOperationException("get/set for field lastName did not work correctly");
  }
  method_setfor_field_salary_of_class_Keeper.invoke(v_54,(double)0.2750299495716141);
  if(!method_getfor_field_salary_of_class_Keeper.invoke(v_54).equals((double)0.2750299495716141)) {
    throw new UnsupportedOperationException("get/set for field salary did not work correctly");
  }
ArrayList<Object> v_55 =  new ArrayList<Object>();
  Object v_56 = class_AnimalPen.getDeclaredConstructor().newInstance();
  method_setfor_field_xloc_of_class_AnimalPen.invoke(v_56,0.61059153f);
  if(!method_getfor_field_xloc_of_class_AnimalPen.invoke(v_56).equals(0.61059153f)) {
    throw new UnsupportedOperationException("get/set for field xloc did not work correctly");
  }
  method_setfor_field_yloc_of_class_AnimalPen.invoke(v_56,0.9549307f);
  if(!method_getfor_field_yloc_of_class_AnimalPen.invoke(v_56).equals(0.9549307f)) {
    throw new UnsupportedOperationException("get/set for field yloc did not work correctly");
  }
  method_setfor_field_width_of_class_AnimalPen.invoke(v_56,0.27406907f);
  if(!method_getfor_field_width_of_class_AnimalPen.invoke(v_56).equals(0.27406907f)) {
    throw new UnsupportedOperationException("get/set for field width did not work correctly");
  }
  method_setfor_field_length_of_class_AnimalPen.invoke(v_56,0.19020218f);
  if(!method_getfor_field_length_of_class_AnimalPen.invoke(v_56).equals(0.19020218f)) {
    throw new UnsupportedOperationException("get/set for field length did not work correctly");
  }
  method_setfor_field_height_of_class_AnimalPen.invoke(v_56,0.0012985468f);
  if(!method_getfor_field_height_of_class_AnimalPen.invoke(v_56).equals(0.0012985468f)) {
    throw new UnsupportedOperationException("get/set for field height did not work correctly");
  }
ArrayList<Object> v_57 =  new ArrayList<Object>();
  Object v_58 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_58,"0N:B%LQ)/XDX4/=U");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_58).equals("0N:B%LQ)/XDX4/=U")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_58,",D%L36%/?K8V5NKB9$R#");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_58).equals(",D%L36%/?K8V5NKB9$R#")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_58,-2066794714);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_58).equals(-2066794714)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_59 =  new ArrayList<Object>();
ArrayList<Object> v_60 =  new ArrayList<Object>();
  Object v_61 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_61,"LOHXV1&UC");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_61).equals("LOHXV1&UC")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_61,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_61).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_60.add(v_61);
v_60.add(v_61);
v_59.add(v_60);
ArrayList<Object> v_62 =  new ArrayList<Object>();
v_62.add(v_61);
  Object v_63 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_63,"4PK(.(UGJ&UI&");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_63).equals("4PK(.(UGJ&UI&")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_63,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_63).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_62.add(v_63);
v_59.add(v_62);
ArrayList<Object> v_64 =  new ArrayList<Object>();
ArrayList<Object> v_65 =  new ArrayList<Object>();
v_65.add(v_63);
v_65.add(v_61);
v_64.add(v_65);
int v_68 = 0;
for (Object v_67: v_64) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_58, v_67);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_58, v_68).equals(v_67)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_68++;
int v_66 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_58);
if (v_66 != v_68) {
throw new IllegalStateException("array size was not correct!");
}
}
v_57.add(v_58);
ArrayList<Object> v_69 =  new ArrayList<Object>();
v_69.add(v_58);
int v_72 = 0;
for (Object v_71: v_69) {
method_addfor_field_animals_of_class_AnimalPen.invoke(v_56, v_71);
if ( !method_getfor_field_animals_of_class_AnimalPen.invoke(v_56, v_72).equals(v_71)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_72++;
int v_70 = (Integer)method_numfor_field_animals_of_class_AnimalPen.invoke(v_56);
if (v_70 != v_72) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_signText_of_class_AnimalPen.invoke(v_56,"-61#M.>");
  if(!method_getfor_field_signText_of_class_AnimalPen.invoke(v_56).equals("-61#M.>")) {
    throw new UnsupportedOperationException("get/set for field signText did not work correctly");
  }
v_55.add(v_56);
ArrayList<Object> v_73 =  new ArrayList<Object>();
  Object v_74 = class_AnimalPen.getDeclaredConstructor().newInstance();
  method_setfor_field_xloc_of_class_AnimalPen.invoke(v_74,0.42770004f);
  if(!method_getfor_field_xloc_of_class_AnimalPen.invoke(v_74).equals(0.42770004f)) {
    throw new UnsupportedOperationException("get/set for field xloc did not work correctly");
  }
  method_setfor_field_yloc_of_class_AnimalPen.invoke(v_74,0.9991834f);
  if(!method_getfor_field_yloc_of_class_AnimalPen.invoke(v_74).equals(0.9991834f)) {
    throw new UnsupportedOperationException("get/set for field yloc did not work correctly");
  }
  method_setfor_field_width_of_class_AnimalPen.invoke(v_74,0.06190175f);
  if(!method_getfor_field_width_of_class_AnimalPen.invoke(v_74).equals(0.06190175f)) {
    throw new UnsupportedOperationException("get/set for field width did not work correctly");
  }
  method_setfor_field_length_of_class_AnimalPen.invoke(v_74,0.5863206f);
  if(!method_getfor_field_length_of_class_AnimalPen.invoke(v_74).equals(0.5863206f)) {
    throw new UnsupportedOperationException("get/set for field length did not work correctly");
  }
  method_setfor_field_height_of_class_AnimalPen.invoke(v_74,0.56729305f);
  if(!method_getfor_field_height_of_class_AnimalPen.invoke(v_74).equals(0.56729305f)) {
    throw new UnsupportedOperationException("get/set for field height did not work correctly");
  }
ArrayList<Object> v_75 =  new ArrayList<Object>();
  Object v_76 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_76,"&R5T%BZEG.0EXZKT=");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_76).equals("&R5T%BZEG.0EXZKT=")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_76,"N3@Z$1UZWB<H-O82");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_76).equals("N3@Z$1UZWB<H-O82")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_76,-1233720037);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_76).equals(-1233720037)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_77 =  new ArrayList<Object>();
ArrayList<Object> v_78 =  new ArrayList<Object>();
v_78.add(v_63);
v_77.add(v_78);
ArrayList<Object> v_79 =  new ArrayList<Object>();
ArrayList<Object> v_80 =  new ArrayList<Object>();
  Object v_81 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_81,"O7MT0Z)ITAU7UR2");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_81).equals("O7MT0Z)ITAU7UR2")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_81,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_81).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_80.add(v_81);
  Object v_82 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_82,".G7J2*LHSH1ZATWN#R");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_82).equals(".G7J2*LHSH1ZATWN#R")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_82,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_82).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_80.add(v_82);
v_79.add(v_80);
ArrayList<Object> v_83 =  new ArrayList<Object>();
  Object v_84 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_84,"WH@:");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_84).equals("WH@:")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_84,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_84).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_83.add(v_84);
v_79.add(v_83);
int v_87 = 0;
for (Object v_86: v_79) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_76, v_86);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_76, v_87).equals(v_86)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_87++;
int v_85 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_76);
if (v_85 != v_87) {
throw new IllegalStateException("array size was not correct!");
}
}
v_75.add(v_76);
v_75.add(v_58);
ArrayList<Object> v_88 =  new ArrayList<Object>();
  Object v_89 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_89,"'#V8VQKT,,9C:C+3:");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_89).equals("'#V8VQKT,,9C:C+3:")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_89,"EJ>#");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_89).equals("EJ>#")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_89,-791260744);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_89).equals(-791260744)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_90 =  new ArrayList<Object>();
ArrayList<Object> v_91 =  new ArrayList<Object>();
v_91.add(v_61);
v_90.add(v_91);
ArrayList<Object> v_92 =  new ArrayList<Object>();
ArrayList<Object> v_93 =  new ArrayList<Object>();
v_93.add(v_63);
v_92.add(v_93);
int v_96 = 0;
for (Object v_95: v_92) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_89, v_95);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_89, v_96).equals(v_95)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_96++;
int v_94 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_89);
if (v_94 != v_96) {
throw new IllegalStateException("array size was not correct!");
}
}
v_88.add(v_89);
  Object v_97 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_97,"&G9.'AO.NX/");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_97).equals("&G9.'AO.NX/")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_97,"-4DB7M=:D?874X");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_97).equals("-4DB7M=:D?874X")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_97,-1561968417);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_97).equals(-1561968417)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_98 =  new ArrayList<Object>();
ArrayList<Object> v_99 =  new ArrayList<Object>();
v_99.add(v_84);
v_99.add(v_63);
v_98.add(v_99);
ArrayList<Object> v_100 =  new ArrayList<Object>();
v_100.add(v_82);
v_98.add(v_100);
ArrayList<Object> v_101 =  new ArrayList<Object>();
ArrayList<Object> v_102 =  new ArrayList<Object>();
v_102.add(v_63);
v_102.add(v_81);
v_101.add(v_102);
ArrayList<Object> v_103 =  new ArrayList<Object>();
  Object v_104 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_104,"#F=86%YR2TZCU>LLIWSA");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_104).equals("#F=86%YR2TZCU>LLIWSA")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_104,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_104).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_103.add(v_104);
v_103.add(v_61);
v_101.add(v_103);
int v_107 = 0;
for (Object v_106: v_101) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_97, v_106);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_97, v_107).equals(v_106)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_107++;
int v_105 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_97);
if (v_105 != v_107) {
throw new IllegalStateException("array size was not correct!");
}
}
v_88.add(v_97);
int v_110 = 0;
for (Object v_109: v_88) {
method_addfor_field_animals_of_class_AnimalPen.invoke(v_74, v_109);
if ( !method_getfor_field_animals_of_class_AnimalPen.invoke(v_74, v_110).equals(v_109)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_110++;
int v_108 = (Integer)method_numfor_field_animals_of_class_AnimalPen.invoke(v_74);
if (v_108 != v_110) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_signText_of_class_AnimalPen.invoke(v_74,"BY'Q&HHCE");
  if(!method_getfor_field_signText_of_class_AnimalPen.invoke(v_74).equals("BY'Q&HHCE")) {
    throw new UnsupportedOperationException("get/set for field signText did not work correctly");
  }
v_73.add(v_74);
v_73.add(v_56);
int v_113 = 0;
for (Object v_112: v_73) {
method_addfor_field_myPens_of_class_Keeper.invoke(v_54, v_112);
if ( !method_getfor_field_myPens_of_class_Keeper.invoke(v_54, v_113).equals(v_112)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_113++;
int v_111 = (Integer)method_numfor_field_myPens_of_class_Keeper.invoke(v_54);
if (v_111 != v_113) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Keeper.invoke(v_54);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Keeper.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_54);
    RunAll.logln("Finished test case: 1 for Keeper");
  }
  public void test_Food_1() throws Exception {
    System.out.println("Starting test case: 1 for class Food");
    RunAll.logln("Starting test case: 1 for Food");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_114 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_114,"#1?(37Q&5:ET(A()3I.&");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_114).equals("#1?(37Q&5:ET(A()3I.&")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_114,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_114).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Food.invoke(v_114);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Food.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_114);
    RunAll.logln("Finished test case: 1 for Food");
  }
  public void test_AnimalPen_2() throws Exception {
    System.out.println("Starting test case: 2 for class AnimalPen");
    RunAll.logln("Starting test case: 2 for AnimalPen");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_115 = class_AnimalPen.getDeclaredConstructor().newInstance();
  method_setfor_field_xloc_of_class_AnimalPen.invoke(v_115,0.2933765f);
  if(!method_getfor_field_xloc_of_class_AnimalPen.invoke(v_115).equals(0.2933765f)) {
    throw new UnsupportedOperationException("get/set for field xloc did not work correctly");
  }
  method_setfor_field_yloc_of_class_AnimalPen.invoke(v_115,0.004156053f);
  if(!method_getfor_field_yloc_of_class_AnimalPen.invoke(v_115).equals(0.004156053f)) {
    throw new UnsupportedOperationException("get/set for field yloc did not work correctly");
  }
  method_setfor_field_width_of_class_AnimalPen.invoke(v_115,0.8546809f);
  if(!method_getfor_field_width_of_class_AnimalPen.invoke(v_115).equals(0.8546809f)) {
    throw new UnsupportedOperationException("get/set for field width did not work correctly");
  }
  method_setfor_field_length_of_class_AnimalPen.invoke(v_115,0.03328532f);
  if(!method_getfor_field_length_of_class_AnimalPen.invoke(v_115).equals(0.03328532f)) {
    throw new UnsupportedOperationException("get/set for field length did not work correctly");
  }
  method_setfor_field_height_of_class_AnimalPen.invoke(v_115,0.9231246f);
  if(!method_getfor_field_height_of_class_AnimalPen.invoke(v_115).equals(0.9231246f)) {
    throw new UnsupportedOperationException("get/set for field height did not work correctly");
  }
ArrayList<Object> v_116 =  new ArrayList<Object>();
  Object v_117 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_117,"-ZA1/PZZ?M>1>Q+A2");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_117).equals("-ZA1/PZZ?M>1>Q+A2")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_117,"#8:7V,NND7S");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_117).equals("#8:7V,NND7S")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_117,1547613930);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_117).equals(1547613930)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_118 =  new ArrayList<Object>();
ArrayList<Object> v_119 =  new ArrayList<Object>();
  Object v_120 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_120,"XR5L1#S@,6");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_120).equals("XR5L1#S@,6")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_120,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_120).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_119.add(v_120);
  Object v_121 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_121,"X&-/NXRV<HZH");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_121).equals("X&-/NXRV<HZH")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_121,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_121).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_119.add(v_121);
v_118.add(v_119);
ArrayList<Object> v_122 =  new ArrayList<Object>();
  Object v_123 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_123,";*++NH&PIQ4");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_123).equals(";*++NH&PIQ4")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_123,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_123).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_122.add(v_123);
v_122.add(v_123);
v_122.add(v_123);
v_122.add(v_123);
v_118.add(v_122);
ArrayList<Object> v_124 =  new ArrayList<Object>();
v_124.add(v_120);
v_124.add(v_123);
v_118.add(v_124);
ArrayList<Object> v_125 =  new ArrayList<Object>();
ArrayList<Object> v_126 =  new ArrayList<Object>();
v_126.add(v_121);
v_126.add(v_121);
v_125.add(v_126);
ArrayList<Object> v_127 =  new ArrayList<Object>();
v_127.add(v_120);
v_127.add(v_121);
v_127.add(v_121);
v_125.add(v_127);
ArrayList<Object> v_128 =  new ArrayList<Object>();
  Object v_129 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_129,"$)HJ,>&82W-F;H:Y9XY");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_129).equals("$)HJ,>&82W-F;H:Y9XY")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_129,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_129).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_128.add(v_129);
v_128.add(v_129);
v_128.add(v_120);
v_125.add(v_128);
ArrayList<Object> v_130 =  new ArrayList<Object>();
v_130.add(v_120);
v_130.add(v_120);
v_125.add(v_130);
int v_133 = 0;
for (Object v_132: v_125) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_117, v_132);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_117, v_133).equals(v_132)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_133++;
int v_131 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_117);
if (v_131 != v_133) {
throw new IllegalStateException("array size was not correct!");
}
}
v_116.add(v_117);
  Object v_134 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_134,"O>3&1P/J2J>$0''");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_134).equals("O>3&1P/J2J>$0''")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_134,"'KMR#M)3*Y>)7");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_134).equals("'KMR#M)3*Y>)7")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_134,-1196719222);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_134).equals(-1196719222)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_135 =  new ArrayList<Object>();
ArrayList<Object> v_136 =  new ArrayList<Object>();
  Object v_137 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_137,"YI#G0");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_137).equals("YI#G0")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_137,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_137).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_136.add(v_137);
v_136.add(v_121);
v_136.add(v_123);
v_136.add(v_120);
v_135.add(v_136);
ArrayList<Object> v_138 =  new ArrayList<Object>();
  Object v_139 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_139,".O#0V>OUU+=6Q9?L");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_139).equals(".O#0V>OUU+=6Q9?L")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_139,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_139).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_138.add(v_139);
v_138.add(v_121);
v_138.add(v_121);
v_135.add(v_138);
ArrayList<Object> v_140 =  new ArrayList<Object>();
ArrayList<Object> v_141 =  new ArrayList<Object>();
v_141.add(v_120);
v_141.add(v_120);
v_140.add(v_141);
ArrayList<Object> v_142 =  new ArrayList<Object>();
v_142.add(v_121);
v_142.add(v_137);
v_140.add(v_142);
int v_145 = 0;
for (Object v_144: v_140) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_134, v_144);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_134, v_145).equals(v_144)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_145++;
int v_143 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_134);
if (v_143 != v_145) {
throw new IllegalStateException("array size was not correct!");
}
}
v_116.add(v_134);
v_116.add(v_134);
v_116.add(v_117);
ArrayList<Object> v_146 =  new ArrayList<Object>();
v_146.add(v_117);
v_146.add(v_117);
int v_149 = 0;
for (Object v_148: v_146) {
method_addfor_field_animals_of_class_AnimalPen.invoke(v_115, v_148);
if ( !method_getfor_field_animals_of_class_AnimalPen.invoke(v_115, v_149).equals(v_148)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_149++;
int v_147 = (Integer)method_numfor_field_animals_of_class_AnimalPen.invoke(v_115);
if (v_147 != v_149) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_signText_of_class_AnimalPen.invoke(v_115,">?Z=KO)8OSLP8QNW2");
  if(!method_getfor_field_signText_of_class_AnimalPen.invoke(v_115).equals(">?Z=KO)8OSLP8QNW2")) {
    throw new UnsupportedOperationException("get/set for field signText did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_AnimalPen.invoke(v_115);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_AnimalPen.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_115);
    RunAll.logln("Finished test case: 2 for AnimalPen");
  }
  public void test_Animal_2() throws Exception {
    System.out.println("Starting test case: 2 for class Animal");
    RunAll.logln("Starting test case: 2 for Animal");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_150 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_150,"MIM+NZ-*1R:=");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_150).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_150,">Q+A2K");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_150).equals(">Q+A2K")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_150,999119518);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_150).equals(999119518)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_151 =  new ArrayList<Object>();
ArrayList<Object> v_152 =  new ArrayList<Object>();
  Object v_153 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_153,"+N#8:7V,NND7SM@;");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_153).equals("+N#8:7V,NND7SM@;")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_153,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_153).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_152.add(v_153);
  Object v_154 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_154,"S@,6");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_154).equals("S@,6")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_154,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_154).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_152.add(v_154);
v_152.add(v_153);
v_151.add(v_152);
ArrayList<Object> v_155 =  new ArrayList<Object>();
v_155.add(v_153);
v_155.add(v_154);
v_151.add(v_155);
ArrayList<Object> v_156 =  new ArrayList<Object>();
  Object v_157 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_157,"BX<4S/AD");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_157).equals("BX<4S/AD")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_157,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_157).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_156.add(v_157);
v_156.add(v_153);
v_156.add(v_154);
v_151.add(v_156);
ArrayList<Object> v_158 =  new ArrayList<Object>();
ArrayList<Object> v_159 =  new ArrayList<Object>();
v_159.add(v_154);
  Object v_160 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_160,"H&PIQ48A+QD+GH@UG(><<");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_160).equals("H&PIQ48A+QD+GH@UG(><<")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_160,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_160).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_159.add(v_160);
  Object v_161 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_161,"$)HJ,>&82W-F;H:Y9XY");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_161).equals("$)HJ,>&82W-F;H:Y9XY")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_161,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_161).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_159.add(v_161);
v_158.add(v_159);
ArrayList<Object> v_162 =  new ArrayList<Object>();
  Object v_163 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_163,"?O>3&1P/J2J>$0''RQE5");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_163).equals("?O>3&1P/J2J>$0''RQE5")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_163,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_163).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_162.add(v_163);
v_162.add(v_160);
v_158.add(v_162);
ArrayList<Object> v_164 =  new ArrayList<Object>();
v_164.add(v_160);
  Object v_165 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_165,"<1P'KMR#M)3*Y>");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_165).equals("<1P'KMR#M)3*Y>")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_165,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_165).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_164.add(v_165);
v_164.add(v_160);
v_164.add(v_153);
v_158.add(v_164);
int v_168 = 0;
for (Object v_167: v_158) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_150, v_167);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_150, v_168).equals(v_167)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_168++;
int v_166 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_150);
if (v_166 != v_168) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Animal.invoke(v_150);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Animal.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_150);
    RunAll.logln("Finished test case: 2 for Animal");
  }
  public void test_Keeper_2() throws Exception {
    System.out.println("Starting test case: 2 for class Keeper");
    RunAll.logln("Starting test case: 2 for Keeper");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_169 = class_Keeper.getDeclaredConstructor().newInstance();
  method_setfor_field_firstName_of_class_Keeper.invoke(v_169,"MIM+NZ-*1R:=");
  if(!method_getfor_field_firstName_of_class_Keeper.invoke(v_169).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field firstName did not work correctly");
  }
  method_setfor_field_lastName_of_class_Keeper.invoke(v_169,">Q+A2K");
  if(!method_getfor_field_lastName_of_class_Keeper.invoke(v_169).equals(">Q+A2K")) {
    throw new UnsupportedOperationException("get/set for field lastName did not work correctly");
  }
  method_setfor_field_salary_of_class_Keeper.invoke(v_169,(double)0.686593333134676);
  if(!method_getfor_field_salary_of_class_Keeper.invoke(v_169).equals((double)0.686593333134676)) {
    throw new UnsupportedOperationException("get/set for field salary did not work correctly");
  }
ArrayList<Object> v_170 =  new ArrayList<Object>();
  Object v_171 = class_AnimalPen.getDeclaredConstructor().newInstance();
  method_setfor_field_xloc_of_class_AnimalPen.invoke(v_171,0.7328393f);
  if(!method_getfor_field_xloc_of_class_AnimalPen.invoke(v_171).equals(0.7328393f)) {
    throw new UnsupportedOperationException("get/set for field xloc did not work correctly");
  }
  method_setfor_field_yloc_of_class_AnimalPen.invoke(v_171,0.72852075f);
  if(!method_getfor_field_yloc_of_class_AnimalPen.invoke(v_171).equals(0.72852075f)) {
    throw new UnsupportedOperationException("get/set for field yloc did not work correctly");
  }
  method_setfor_field_width_of_class_AnimalPen.invoke(v_171,0.009830773f);
  if(!method_getfor_field_width_of_class_AnimalPen.invoke(v_171).equals(0.009830773f)) {
    throw new UnsupportedOperationException("get/set for field width did not work correctly");
  }
  method_setfor_field_length_of_class_AnimalPen.invoke(v_171,0.540209f);
  if(!method_getfor_field_length_of_class_AnimalPen.invoke(v_171).equals(0.540209f)) {
    throw new UnsupportedOperationException("get/set for field length did not work correctly");
  }
  method_setfor_field_height_of_class_AnimalPen.invoke(v_171,0.010631561f);
  if(!method_getfor_field_height_of_class_AnimalPen.invoke(v_171).equals(0.010631561f)) {
    throw new UnsupportedOperationException("get/set for field height did not work correctly");
  }
ArrayList<Object> v_172 =  new ArrayList<Object>();
  Object v_173 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_173,"M@;$V1UJ");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_173).equals("M@;$V1UJ")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_173,"C2DO7UDS$V/X&-/");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_173).equals("C2DO7UDS$V/X&-/")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_173,2097477418);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_173).equals(2097477418)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_174 =  new ArrayList<Object>();
ArrayList<Object> v_175 =  new ArrayList<Object>();
  Object v_176 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_176,"<4S/AD@$(:");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_176).equals("<4S/AD@$(:")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_176,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_176).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_175.add(v_176);
v_175.add(v_176);
v_175.add(v_176);
v_174.add(v_175);
ArrayList<Object> v_177 =  new ArrayList<Object>();
  Object v_178 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_178,"+QD+GH@UG(><<E%XP;%");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_178).equals("+QD+GH@UG(><<E%XP;%")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_178,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_178).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_177.add(v_178);
  Object v_179 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_179,",>&82W-F;H:Y9");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_179).equals(",>&82W-F;H:Y9")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_179,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_179).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_177.add(v_179);
v_174.add(v_177);
ArrayList<Object> v_180 =  new ArrayList<Object>();
v_180.add(v_176);
v_180.add(v_179);
v_180.add(v_176);
v_174.add(v_180);
ArrayList<Object> v_181 =  new ArrayList<Object>();
ArrayList<Object> v_182 =  new ArrayList<Object>();
  Object v_183 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_183,">3&1P/J2J>$0''");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_183).equals(">3&1P/J2J>$0''")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_183,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_183).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_182.add(v_183);
  Object v_184 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_184,"MR#M");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_184).equals("MR#M")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_184,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_184).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_182.add(v_184);
v_181.add(v_182);
ArrayList<Object> v_185 =  new ArrayList<Object>();
  Object v_186 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_186,"QYI#G0KWN");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_186).equals("QYI#G0KWN")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_186,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_186).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_185.add(v_186);
v_185.add(v_186);
  Object v_187 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_187,".O#0V>OUU+=6Q9?L");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_187).equals(".O#0V>OUU+=6Q9?L")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_187,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_187).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_185.add(v_187);
v_181.add(v_185);
int v_190 = 0;
for (Object v_189: v_181) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_173, v_189);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_173, v_190).equals(v_189)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_190++;
int v_188 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_173);
if (v_188 != v_190) {
throw new IllegalStateException("array size was not correct!");
}
}
v_172.add(v_173);
v_172.add(v_173);
  Object v_191 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_191,"CS?%<PQG)O>*?Z");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_191).equals("CS?%<PQG)O>*?Z")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_191,">RSRBG(>'=P?Q?");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_191).equals(">RSRBG(>'=P?Q?")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_191,-2128524197);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_191).equals(-2128524197)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_192 =  new ArrayList<Object>();
ArrayList<Object> v_193 =  new ArrayList<Object>();
  Object v_194 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_194,"YFDY<?5");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_194).equals("YFDY<?5")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_194,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_194).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_193.add(v_194);
  Object v_195 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_195,">ZU*P");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_195).equals(">ZU*P")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_195,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_195).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_193.add(v_195);
  Object v_196 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_196,"U-QGLX%>T4D0W@:#");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_196).equals("U-QGLX%>T4D0W@:#")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_196,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_196).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_193.add(v_196);
v_192.add(v_193);
ArrayList<Object> v_197 =  new ArrayList<Object>();
v_197.add(v_186);
v_197.add(v_179);
v_192.add(v_197);
ArrayList<Object> v_198 =  new ArrayList<Object>();
v_198.add(v_178);
  Object v_199 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_199,"#.004L3J>KXX7)P");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_199).equals("#.004L3J>KXX7)P")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_199,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_199).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_198.add(v_199);
v_198.add(v_196);
v_192.add(v_198);
ArrayList<Object> v_200 =  new ArrayList<Object>();
ArrayList<Object> v_201 =  new ArrayList<Object>();
v_201.add(v_179);
v_201.add(v_187);
v_200.add(v_201);
ArrayList<Object> v_202 =  new ArrayList<Object>();
v_202.add(v_186);
v_202.add(v_184);
v_200.add(v_202);
ArrayList<Object> v_203 =  new ArrayList<Object>();
v_203.add(v_179);
  Object v_204 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_204,"5*2K%TT*+");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_204).equals("5*2K%TT*+")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_204,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_204).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_203.add(v_204);
v_203.add(v_195);
  Object v_205 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_205,"A9B;1,J$&R@W*");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_205).equals("A9B;1,J$&R@W*")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_205,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_205).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_203.add(v_205);
v_200.add(v_203);
int v_208 = 0;
for (Object v_207: v_200) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_191, v_207);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_191, v_208).equals(v_207)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_208++;
int v_206 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_191);
if (v_206 != v_208) {
throw new IllegalStateException("array size was not correct!");
}
}
v_172.add(v_191);
v_172.add(v_191);
ArrayList<Object> v_209 =  new ArrayList<Object>();
  Object v_210 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_210,"C)5O%");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_210).equals("C)5O%")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_210,"8IJ6)C=%A9M*9");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_210).equals("8IJ6)C=%A9M*9")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_210,-1836965612);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_210).equals(-1836965612)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_211 =  new ArrayList<Object>();
ArrayList<Object> v_212 =  new ArrayList<Object>();
v_212.add(v_205);
v_212.add(v_179);
v_212.add(v_195);
v_212.add(v_176);
v_211.add(v_212);
ArrayList<Object> v_213 =  new ArrayList<Object>();
v_213.add(v_183);
  Object v_214 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_214,"B;$UGWM7>K");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_214).equals("B;$UGWM7>K")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_214,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_214).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_213.add(v_214);
v_213.add(v_176);
v_211.add(v_213);
ArrayList<Object> v_215 =  new ArrayList<Object>();
ArrayList<Object> v_216 =  new ArrayList<Object>();
v_216.add(v_187);
v_216.add(v_199);
v_216.add(v_196);
v_216.add(v_183);
v_215.add(v_216);
ArrayList<Object> v_217 =  new ArrayList<Object>();
v_217.add(v_199);
v_217.add(v_187);
v_215.add(v_217);
ArrayList<Object> v_218 =  new ArrayList<Object>();
v_218.add(v_178);
v_218.add(v_183);
v_218.add(v_186);
v_215.add(v_218);
ArrayList<Object> v_219 =  new ArrayList<Object>();
v_219.add(v_184);
v_219.add(v_195);
v_219.add(v_187);
v_215.add(v_219);
int v_222 = 0;
for (Object v_221: v_215) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_210, v_221);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_210, v_222).equals(v_221)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_222++;
int v_220 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_210);
if (v_220 != v_222) {
throw new IllegalStateException("array size was not correct!");
}
}
v_209.add(v_210);
  Object v_223 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_223,"QL=DNY");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_223).equals("QL=DNY")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_223,"08INM");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_223).equals("08INM")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_223,-1060165763);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_223).equals(-1060165763)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_224 =  new ArrayList<Object>();
ArrayList<Object> v_225 =  new ArrayList<Object>();
v_225.add(v_187);
v_225.add(v_178);
v_225.add(v_187);
v_224.add(v_225);
ArrayList<Object> v_226 =  new ArrayList<Object>();
v_226.add(v_194);
  Object v_227 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_227,"&3>UEWR;FL:MWR");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_227).equals("&3>UEWR;FL:MWR")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_227,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_227).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_226.add(v_227);
  Object v_228 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_228,"4N8RK+7C6=G");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_228).equals("4N8RK+7C6=G")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_228,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_228).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_226.add(v_228);
  Object v_229 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_229,"Q:/KT-733-+EEU#6:U>M");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_229).equals("Q:/KT-733-+EEU#6:U>M")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_229,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_229).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_226.add(v_229);
v_224.add(v_226);
ArrayList<Object> v_230 =  new ArrayList<Object>();
v_230.add(v_178);
v_230.add(v_227);
  Object v_231 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_231,"9O2L4#K''%4GF&T#");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_231).equals("9O2L4#K''%4GF&T#")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_231,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_231).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_230.add(v_231);
v_230.add(v_184);
v_224.add(v_230);
ArrayList<Object> v_232 =  new ArrayList<Object>();
v_232.add(v_178);
v_232.add(v_205);
v_232.add(v_178);
v_232.add(v_178);
v_224.add(v_232);
ArrayList<Object> v_233 =  new ArrayList<Object>();
ArrayList<Object> v_234 =  new ArrayList<Object>();
v_234.add(v_205);
v_234.add(v_179);
v_234.add(v_229);
v_234.add(v_205);
v_233.add(v_234);
ArrayList<Object> v_235 =  new ArrayList<Object>();
v_235.add(v_214);
v_235.add(v_183);
v_233.add(v_235);
ArrayList<Object> v_236 =  new ArrayList<Object>();
v_236.add(v_194);
  Object v_237 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_237,"S-U<RKVQL");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_237).equals("S-U<RKVQL")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_237,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_237).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_236.add(v_237);
v_233.add(v_236);
ArrayList<Object> v_238 =  new ArrayList<Object>();
v_238.add(v_195);
v_238.add(v_183);
v_238.add(v_184);
v_238.add(v_184);
v_233.add(v_238);
int v_241 = 0;
for (Object v_240: v_233) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_223, v_240);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_223, v_241).equals(v_240)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_241++;
int v_239 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_223);
if (v_239 != v_241) {
throw new IllegalStateException("array size was not correct!");
}
}
v_209.add(v_223);
  Object v_242 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_242,"UYQR&705JY(HU");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_242).equals("UYQR&705JY(HU")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_242,"J1I.%JHG(O0(RKO");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_242).equals("J1I.%JHG(O0(RKO")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_242,2007133788);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_242).equals(2007133788)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_243 =  new ArrayList<Object>();
ArrayList<Object> v_244 =  new ArrayList<Object>();
v_244.add(v_229);
  Object v_245 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_245,"$ON<5MD");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_245).equals("$ON<5MD")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_245,true);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_245).equals(true)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_244.add(v_245);
v_243.add(v_244);
ArrayList<Object> v_246 =  new ArrayList<Object>();
v_246.add(v_194);
v_246.add(v_186);
v_246.add(v_205);
v_243.add(v_246);
ArrayList<Object> v_247 =  new ArrayList<Object>();
v_247.add(v_205);
v_247.add(v_183);
v_247.add(v_227);
v_243.add(v_247);
ArrayList<Object> v_248 =  new ArrayList<Object>();
ArrayList<Object> v_249 =  new ArrayList<Object>();
v_249.add(v_245);
v_249.add(v_178);
v_249.add(v_204);
v_248.add(v_249);
ArrayList<Object> v_250 =  new ArrayList<Object>();
v_250.add(v_187);
v_250.add(v_231);
v_250.add(v_205);
v_248.add(v_250);
ArrayList<Object> v_251 =  new ArrayList<Object>();
v_251.add(v_186);
v_251.add(v_228);
v_251.add(v_228);
v_248.add(v_251);
int v_254 = 0;
for (Object v_253: v_248) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_242, v_253);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_242, v_254).equals(v_253)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_254++;
int v_252 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_242);
if (v_252 != v_254) {
throw new IllegalStateException("array size was not correct!");
}
}
v_209.add(v_242);
v_209.add(v_210);
int v_257 = 0;
for (Object v_256: v_209) {
method_addfor_field_animals_of_class_AnimalPen.invoke(v_171, v_256);
if ( !method_getfor_field_animals_of_class_AnimalPen.invoke(v_171, v_257).equals(v_256)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_257++;
int v_255 = (Integer)method_numfor_field_animals_of_class_AnimalPen.invoke(v_171);
if (v_255 != v_257) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_signText_of_class_AnimalPen.invoke(v_171,"2DE,F-&");
  if(!method_getfor_field_signText_of_class_AnimalPen.invoke(v_171).equals("2DE,F-&")) {
    throw new UnsupportedOperationException("get/set for field signText did not work correctly");
  }
v_170.add(v_171);
v_170.add(v_171);
  Object v_258 = class_AnimalPen.getDeclaredConstructor().newInstance();
  method_setfor_field_xloc_of_class_AnimalPen.invoke(v_258,0.40635782f);
  if(!method_getfor_field_xloc_of_class_AnimalPen.invoke(v_258).equals(0.40635782f)) {
    throw new UnsupportedOperationException("get/set for field xloc did not work correctly");
  }
  method_setfor_field_yloc_of_class_AnimalPen.invoke(v_258,0.39088362f);
  if(!method_getfor_field_yloc_of_class_AnimalPen.invoke(v_258).equals(0.39088362f)) {
    throw new UnsupportedOperationException("get/set for field yloc did not work correctly");
  }
  method_setfor_field_width_of_class_AnimalPen.invoke(v_258,0.6485746f);
  if(!method_getfor_field_width_of_class_AnimalPen.invoke(v_258).equals(0.6485746f)) {
    throw new UnsupportedOperationException("get/set for field width did not work correctly");
  }
  method_setfor_field_length_of_class_AnimalPen.invoke(v_258,0.14108187f);
  if(!method_getfor_field_length_of_class_AnimalPen.invoke(v_258).equals(0.14108187f)) {
    throw new UnsupportedOperationException("get/set for field length did not work correctly");
  }
  method_setfor_field_height_of_class_AnimalPen.invoke(v_258,0.16390485f);
  if(!method_getfor_field_height_of_class_AnimalPen.invoke(v_258).equals(0.16390485f)) {
    throw new UnsupportedOperationException("get/set for field height did not work correctly");
  }
ArrayList<Object> v_259 =  new ArrayList<Object>();
v_259.add(v_223);
v_259.add(v_210);
v_259.add(v_223);
ArrayList<Object> v_260 =  new ArrayList<Object>();
v_260.add(v_223);
v_260.add(v_191);
int v_263 = 0;
for (Object v_262: v_260) {
method_addfor_field_animals_of_class_AnimalPen.invoke(v_258, v_262);
if ( !method_getfor_field_animals_of_class_AnimalPen.invoke(v_258, v_263).equals(v_262)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_263++;
int v_261 = (Integer)method_numfor_field_animals_of_class_AnimalPen.invoke(v_258);
if (v_261 != v_263) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_signText_of_class_AnimalPen.invoke(v_258,"38=9Y61SBC$3E");
  if(!method_getfor_field_signText_of_class_AnimalPen.invoke(v_258).equals("38=9Y61SBC$3E")) {
    throw new UnsupportedOperationException("get/set for field signText did not work correctly");
  }
v_170.add(v_258);
ArrayList<Object> v_264 =  new ArrayList<Object>();
v_264.add(v_258);
  Object v_265 = class_AnimalPen.getDeclaredConstructor().newInstance();
  method_setfor_field_xloc_of_class_AnimalPen.invoke(v_265,0.32942802f);
  if(!method_getfor_field_xloc_of_class_AnimalPen.invoke(v_265).equals(0.32942802f)) {
    throw new UnsupportedOperationException("get/set for field xloc did not work correctly");
  }
  method_setfor_field_yloc_of_class_AnimalPen.invoke(v_265,0.12193251f);
  if(!method_getfor_field_yloc_of_class_AnimalPen.invoke(v_265).equals(0.12193251f)) {
    throw new UnsupportedOperationException("get/set for field yloc did not work correctly");
  }
  method_setfor_field_width_of_class_AnimalPen.invoke(v_265,0.6480278f);
  if(!method_getfor_field_width_of_class_AnimalPen.invoke(v_265).equals(0.6480278f)) {
    throw new UnsupportedOperationException("get/set for field width did not work correctly");
  }
  method_setfor_field_length_of_class_AnimalPen.invoke(v_265,0.6113119f);
  if(!method_getfor_field_length_of_class_AnimalPen.invoke(v_265).equals(0.6113119f)) {
    throw new UnsupportedOperationException("get/set for field length did not work correctly");
  }
  method_setfor_field_height_of_class_AnimalPen.invoke(v_265,0.18258727f);
  if(!method_getfor_field_height_of_class_AnimalPen.invoke(v_265).equals(0.18258727f)) {
    throw new UnsupportedOperationException("get/set for field height did not work correctly");
  }
ArrayList<Object> v_266 =  new ArrayList<Object>();
  Object v_267 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_267,"JFM2NHC(V-W");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_267).equals("JFM2NHC(V-W")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_267,"XPGFPHBXO10&");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_267).equals("XPGFPHBXO10&")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_267,793178147);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_267).equals(793178147)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_268 =  new ArrayList<Object>();
ArrayList<Object> v_269 =  new ArrayList<Object>();
v_269.add(v_184);
v_269.add(v_178);
v_268.add(v_269);
ArrayList<Object> v_270 =  new ArrayList<Object>();
  Object v_271 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_271,"%E;8)(");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_271).equals("%E;8)(")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_271,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_271).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_270.add(v_271);
v_270.add(v_214);
v_270.add(v_178);
v_270.add(v_195);
v_268.add(v_270);
ArrayList<Object> v_272 =  new ArrayList<Object>();
ArrayList<Object> v_273 =  new ArrayList<Object>();
v_273.add(v_196);
v_273.add(v_176);
  Object v_274 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_274,"XQW'O?BE");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_274).equals("XQW'O?BE")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_274,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_274).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_273.add(v_274);
v_272.add(v_273);
ArrayList<Object> v_275 =  new ArrayList<Object>();
v_275.add(v_228);
v_275.add(v_204);
v_272.add(v_275);
int v_278 = 0;
for (Object v_277: v_272) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_267, v_277);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_267, v_278).equals(v_277)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_278++;
int v_276 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_267);
if (v_276 != v_278) {
throw new IllegalStateException("array size was not correct!");
}
}
v_266.add(v_267);
v_266.add(v_242);
v_266.add(v_191);
ArrayList<Object> v_279 =  new ArrayList<Object>();
v_279.add(v_191);
v_279.add(v_191);
v_279.add(v_242);
int v_282 = 0;
for (Object v_281: v_279) {
method_addfor_field_animals_of_class_AnimalPen.invoke(v_265, v_281);
if ( !method_getfor_field_animals_of_class_AnimalPen.invoke(v_265, v_282).equals(v_281)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_282++;
int v_280 = (Integer)method_numfor_field_animals_of_class_AnimalPen.invoke(v_265);
if (v_280 != v_282) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_signText_of_class_AnimalPen.invoke(v_265,"V1)R%?YC*(TT7ZO?");
  if(!method_getfor_field_signText_of_class_AnimalPen.invoke(v_265).equals("V1)R%?YC*(TT7ZO?")) {
    throw new UnsupportedOperationException("get/set for field signText did not work correctly");
  }
v_264.add(v_265);
  Object v_283 = class_AnimalPen.getDeclaredConstructor().newInstance();
  method_setfor_field_xloc_of_class_AnimalPen.invoke(v_283,0.8175928f);
  if(!method_getfor_field_xloc_of_class_AnimalPen.invoke(v_283).equals(0.8175928f)) {
    throw new UnsupportedOperationException("get/set for field xloc did not work correctly");
  }
  method_setfor_field_yloc_of_class_AnimalPen.invoke(v_283,0.73307127f);
  if(!method_getfor_field_yloc_of_class_AnimalPen.invoke(v_283).equals(0.73307127f)) {
    throw new UnsupportedOperationException("get/set for field yloc did not work correctly");
  }
  method_setfor_field_width_of_class_AnimalPen.invoke(v_283,0.90225255f);
  if(!method_getfor_field_width_of_class_AnimalPen.invoke(v_283).equals(0.90225255f)) {
    throw new UnsupportedOperationException("get/set for field width did not work correctly");
  }
  method_setfor_field_length_of_class_AnimalPen.invoke(v_283,0.9050769f);
  if(!method_getfor_field_length_of_class_AnimalPen.invoke(v_283).equals(0.9050769f)) {
    throw new UnsupportedOperationException("get/set for field length did not work correctly");
  }
  method_setfor_field_height_of_class_AnimalPen.invoke(v_283,0.13182181f);
  if(!method_getfor_field_height_of_class_AnimalPen.invoke(v_283).equals(0.13182181f)) {
    throw new UnsupportedOperationException("get/set for field height did not work correctly");
  }
ArrayList<Object> v_284 =  new ArrayList<Object>();
v_284.add(v_242);
  Object v_285 = class_Animal.getDeclaredConstructor().newInstance();
  method_setfor_field_myName_of_class_Animal.invoke(v_285,")N=TU,ILOFO#D");
  if(!method_getfor_field_myName_of_class_Animal.invoke(v_285).equals(")N=TU,ILOFO#D")) {
    throw new UnsupportedOperationException("get/set for field myName did not work correctly");
  }
  method_setfor_field_species_of_class_Animal.invoke(v_285,"&7YF'%:N*/@D1288-7UW");
  if(!method_getfor_field_species_of_class_Animal.invoke(v_285).equals("&7YF'%:N*/@D1288-7UW")) {
    throw new UnsupportedOperationException("get/set for field species did not work correctly");
  }
  method_setfor_field_age_of_class_Animal.invoke(v_285,617784945);
  if(!method_getfor_field_age_of_class_Animal.invoke(v_285).equals(617784945)) {
    throw new UnsupportedOperationException("get/set for field age did not work correctly");
  }
ArrayList<Object> v_286 =  new ArrayList<Object>();
ArrayList<Object> v_287 =  new ArrayList<Object>();
v_287.add(v_205);
v_287.add(v_231);
  Object v_288 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_288,"03VU6OT%5JZZ");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_288).equals("03VU6OT%5JZZ")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_288,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_288).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_287.add(v_288);
v_286.add(v_287);
ArrayList<Object> v_289 =  new ArrayList<Object>();
v_289.add(v_184);
v_289.add(v_271);
  Object v_290 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_290,":#7HZ%N");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_290).equals(":#7HZ%N")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_290,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_290).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_289.add(v_290);
  Object v_291 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_291,"09-@:O:ET3J");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_291).equals("09-@:O:ET3J")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_291,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_291).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
v_289.add(v_291);
v_286.add(v_289);
ArrayList<Object> v_292 =  new ArrayList<Object>();
ArrayList<Object> v_293 =  new ArrayList<Object>();
v_293.add(v_290);
v_293.add(v_183);
v_293.add(v_288);
v_292.add(v_293);
ArrayList<Object> v_294 =  new ArrayList<Object>();
v_294.add(v_187);
v_294.add(v_187);
v_294.add(v_274);
v_292.add(v_294);
int v_297 = 0;
for (Object v_296: v_292) {
method_addfor_field_foodsByPreference_of_class_Animal.invoke(v_285, v_296);
if ( !method_getfor_field_foodsByPreference_of_class_Animal.invoke(v_285, v_297).equals(v_296)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_297++;
int v_295 = (Integer)method_numfor_field_foodsByPreference_of_class_Animal.invoke(v_285);
if (v_295 != v_297) {
throw new IllegalStateException("array size was not correct!");
}
}
v_284.add(v_285);
v_284.add(v_267);
ArrayList<Object> v_298 =  new ArrayList<Object>();
v_298.add(v_285);
v_298.add(v_267);
v_298.add(v_191);
v_298.add(v_173);
int v_301 = 0;
for (Object v_300: v_298) {
method_addfor_field_animals_of_class_AnimalPen.invoke(v_283, v_300);
if ( !method_getfor_field_animals_of_class_AnimalPen.invoke(v_283, v_301).equals(v_300)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_301++;
int v_299 = (Integer)method_numfor_field_animals_of_class_AnimalPen.invoke(v_283);
if (v_299 != v_301) {
throw new IllegalStateException("array size was not correct!");
}
}
  method_setfor_field_signText_of_class_AnimalPen.invoke(v_283,"$&/UO>>LD&Y?;#");
  if(!method_getfor_field_signText_of_class_AnimalPen.invoke(v_283).equals("$&/UO>>LD&Y?;#")) {
    throw new UnsupportedOperationException("get/set for field signText did not work correctly");
  }
v_264.add(v_283);
int v_304 = 0;
for (Object v_303: v_264) {
method_addfor_field_myPens_of_class_Keeper.invoke(v_169, v_303);
if ( !method_getfor_field_myPens_of_class_Keeper.invoke(v_169, v_304).equals(v_303)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_304++;
int v_302 = (Integer)method_numfor_field_myPens_of_class_Keeper.invoke(v_169);
if (v_302 != v_304) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Keeper.invoke(v_169);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Keeper.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_169);
    RunAll.logln("Finished test case: 2 for Keeper");
  }
  public void test_Food_2() throws Exception {
    System.out.println("Starting test case: 2 for class Food");
    RunAll.logln("Starting test case: 2 for Food");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_305 = class_Food.getDeclaredConstructor().newInstance();
  method_setfor_field_foodName_of_class_Food.invoke(v_305,"MIM+NZ-*1R:=");
  if(!method_getfor_field_foodName_of_class_Food.invoke(v_305).equals("MIM+NZ-*1R:=")) {
    throw new UnsupportedOperationException("get/set for field foodName did not work correctly");
  }
  method_setfor_field_isMeat_of_class_Food.invoke(v_305,false);
  if(!method_getfor_field_isMeat_of_class_Food.invoke(v_305).equals(false)) {
    throw new UnsupportedOperationException("get/set for field isMeat did not work correctly");
  }
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_Food.invoke(v_305);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_Food.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_305);
    RunAll.logln("Finished test case: 2 for Food");
  }
  public void runAllTests() throws Exception{
      test_AnimalPen_0();
      test_Animal_0();
      test_Keeper_0();
      test_Food_0();
      test_AnimalPen_1();
      test_Animal_1();
      test_Keeper_1();
      test_Food_1();
      test_AnimalPen_2();
      test_Animal_2();
      test_Keeper_2();
      test_Food_2();
  }
}
