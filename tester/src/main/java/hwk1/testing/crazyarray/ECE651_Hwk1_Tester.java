package hwk1.testing.crazyarray;

import java.lang.reflect.*;
import java.util.*;
import org.json.*;
import edu.duke.ece651.hwk1tester.*;

public class ECE651_Hwk1_Tester implements Hwk1Tester {
  private Class<?> class_LotsOfArray;
  private Field field_x_of_class_LotsOfArray;
  private Method method_getfor_field_x_of_class_LotsOfArray;
  private Method method_setfor_field_x_of_class_LotsOfArray;
  private Method method_addfor_field_x_of_class_LotsOfArray;
  private Method method_numfor_field_x_of_class_LotsOfArray;
  private Field field_isAwesome_of_class_LotsOfArray;
  private Method method_getfor_field_isAwesome_of_class_LotsOfArray;
  private Method method_setfor_field_isAwesome_of_class_LotsOfArray;
  private Method method_addfor_field_isAwesome_of_class_LotsOfArray;
  private Method method_numfor_field_isAwesome_of_class_LotsOfArray;
  private Field field_ateBits_of_class_LotsOfArray;
  private Method method_getfor_field_ateBits_of_class_LotsOfArray;
  private Method method_setfor_field_ateBits_of_class_LotsOfArray;
  private Method method_addfor_field_ateBits_of_class_LotsOfArray;
  private Method method_numfor_field_ateBits_of_class_LotsOfArray;
  private Field field_boat_of_class_LotsOfArray;
  private Method method_getfor_field_boat_of_class_LotsOfArray;
  private Method method_setfor_field_boat_of_class_LotsOfArray;
  private Method method_addfor_field_boat_of_class_LotsOfArray;
  private Method method_numfor_field_boat_of_class_LotsOfArray;
  private Field field_trouble_of_class_LotsOfArray;
  private Method method_getfor_field_trouble_of_class_LotsOfArray;
  private Method method_setfor_field_trouble_of_class_LotsOfArray;
  private Method method_addfor_field_trouble_of_class_LotsOfArray;
  private Method method_numfor_field_trouble_of_class_LotsOfArray;
  private Field field_isntPronouncedLikeCare_of_class_LotsOfArray;
  private Method method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray;
  private Method method_setfor_field_isntPronouncedLikeCare_of_class_LotsOfArray;
  private Method method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray;
  private Method method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray;
  private Field field_waysAway_of_class_LotsOfArray;
  private Method method_getfor_field_waysAway_of_class_LotsOfArray;
  private Method method_setfor_field_waysAway_of_class_LotsOfArray;
  private Method method_addfor_field_waysAway_of_class_LotsOfArray;
  private Method method_numfor_field_waysAway_of_class_LotsOfArray;
  private Field field_stackOfPancakes_of_class_LotsOfArray;
  private Method method_getfor_field_stackOfPancakes_of_class_LotsOfArray;
  private Method method_setfor_field_stackOfPancakes_of_class_LotsOfArray;
  private Method method_addfor_field_stackOfPancakes_of_class_LotsOfArray;
  private Method method_numfor_field_stackOfPancakes_of_class_LotsOfArray;
  private Class<?> class__Deserializer;
  private Method deser_method_for_LotsOfArray;
  private Method tojson_method_for_LotsOfArray;
  public ECE651_Hwk1_Tester() throws Exception{
    class_LotsOfArray = Class.forName("hwk1.testing.crazyarray.LotsOfArray");
    class__Deserializer = Class.forName("hwk1.testing.crazyarray.Deserializer");
    field_x_of_class_LotsOfArray = class_LotsOfArray.getDeclaredField("x");
    method_getfor_field_x_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("getX", Integer.TYPE);
    method_setfor_field_x_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("setX", Integer.TYPE,Integer.TYPE);
    method_numfor_field_x_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("numX");
    method_addfor_field_x_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("addX", Integer.TYPE);
    field_isAwesome_of_class_LotsOfArray = class_LotsOfArray.getDeclaredField("isAwesome");
    method_getfor_field_isAwesome_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("getIsAwesome", Integer.TYPE);
    method_setfor_field_isAwesome_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("setIsAwesome", Integer.TYPE,Collection.class);
    method_numfor_field_isAwesome_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("numIsAwesome");
    method_addfor_field_isAwesome_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("addIsAwesome", Collection.class);
    field_ateBits_of_class_LotsOfArray = class_LotsOfArray.getDeclaredField("ateBits");
    method_getfor_field_ateBits_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("getAteBits", Integer.TYPE);
    method_setfor_field_ateBits_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("setAteBits", Integer.TYPE,Collection.class);
    method_numfor_field_ateBits_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("numAteBits");
    method_addfor_field_ateBits_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("addAteBits", Collection.class);
    field_boat_of_class_LotsOfArray = class_LotsOfArray.getDeclaredField("boat");
    method_getfor_field_boat_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("getBoat", Integer.TYPE);
    method_setfor_field_boat_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("setBoat", Integer.TYPE,Collection.class);
    method_numfor_field_boat_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("numBoat");
    method_addfor_field_boat_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("addBoat", Collection.class);
    field_trouble_of_class_LotsOfArray = class_LotsOfArray.getDeclaredField("trouble");
    method_getfor_field_trouble_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("getTrouble", Integer.TYPE);
    method_setfor_field_trouble_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("setTrouble", Integer.TYPE,Double.TYPE);
    method_numfor_field_trouble_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("numTrouble");
    method_addfor_field_trouble_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("addTrouble", Double.TYPE);
    field_isntPronouncedLikeCare_of_class_LotsOfArray = class_LotsOfArray.getDeclaredField("isntPronouncedLikeCare");
    method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("getIsntPronouncedLikeCare", Integer.TYPE);
    method_setfor_field_isntPronouncedLikeCare_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("setIsntPronouncedLikeCare", Integer.TYPE,Collection.class);
    method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("numIsntPronouncedLikeCare");
    method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("addIsntPronouncedLikeCare", Collection.class);
    field_waysAway_of_class_LotsOfArray = class_LotsOfArray.getDeclaredField("waysAway");
    method_getfor_field_waysAway_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("getWaysAway", Integer.TYPE);
    method_setfor_field_waysAway_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("setWaysAway", Integer.TYPE,Long.TYPE);
    method_numfor_field_waysAway_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("numWaysAway");
    method_addfor_field_waysAway_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("addWaysAway", Long.TYPE);
    field_stackOfPancakes_of_class_LotsOfArray = class_LotsOfArray.getDeclaredField("stackOfPancakes");
    method_getfor_field_stackOfPancakes_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("getStackOfPancakes", Integer.TYPE);
    method_setfor_field_stackOfPancakes_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("setStackOfPancakes", Integer.TYPE,Collection.class);
    method_numfor_field_stackOfPancakes_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("numStackOfPancakes");
    method_addfor_field_stackOfPancakes_of_class_LotsOfArray = class_LotsOfArray.getDeclaredMethod("addStackOfPancakes", Collection.class);
    tojson_method_for_LotsOfArray = class_LotsOfArray.getDeclaredMethod("toJSON");
    deser_method_for_LotsOfArray = class__Deserializer.getDeclaredMethod("readLotsOfArray", JSONObject.class);
  }
  public void checkTypes() throws Exception {
if(field_x_of_class_LotsOfArray.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field x to be private, but was "+Modifier.toString(field_x_of_class_LotsOfArray.getModifiers()));
}
if(!method_addfor_field_x_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_x_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_x_of_class_LotsOfArray.getReturnType());
}
if(method_addfor_field_x_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_x_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_addfor_field_x_of_class_LotsOfArray.getModifiers()));
}
if(!method_numfor_field_x_of_class_LotsOfArray.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_x_of_class_LotsOfArray+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_x_of_class_LotsOfArray.getReturnType());
}
if(method_numfor_field_x_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_x_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_numfor_field_x_of_class_LotsOfArray.getModifiers()));
}
if(!method_getfor_field_x_of_class_LotsOfArray.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_x_of_class_LotsOfArray+" to have return type "+Integer.TYPE+" but was actually " +method_getfor_field_x_of_class_LotsOfArray.getReturnType());
}
if(method_getfor_field_x_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_x_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_getfor_field_x_of_class_LotsOfArray.getModifiers()));
}
if(!method_setfor_field_x_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_x_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_x_of_class_LotsOfArray.getReturnType());
}
if(method_setfor_field_x_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_x_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_setfor_field_x_of_class_LotsOfArray.getModifiers()));
}
if(field_isAwesome_of_class_LotsOfArray.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field isAwesome to be private, but was "+Modifier.toString(field_isAwesome_of_class_LotsOfArray.getModifiers()));
}
if(!method_addfor_field_isAwesome_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_isAwesome_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_isAwesome_of_class_LotsOfArray.getReturnType());
}
if(method_addfor_field_isAwesome_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_isAwesome_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_addfor_field_isAwesome_of_class_LotsOfArray.getModifiers()));
}
if(!method_numfor_field_isAwesome_of_class_LotsOfArray.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_isAwesome_of_class_LotsOfArray+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_isAwesome_of_class_LotsOfArray.getReturnType());
}
if(method_numfor_field_isAwesome_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_isAwesome_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_numfor_field_isAwesome_of_class_LotsOfArray.getModifiers()));
}
if(!method_getfor_field_isAwesome_of_class_LotsOfArray.getReturnType().equals(Collection.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_isAwesome_of_class_LotsOfArray+" to have return type "+Collection.class+" but was actually " +method_getfor_field_isAwesome_of_class_LotsOfArray.getReturnType());
}
if(method_getfor_field_isAwesome_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_isAwesome_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_getfor_field_isAwesome_of_class_LotsOfArray.getModifiers()));
}
if(!method_setfor_field_isAwesome_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_isAwesome_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_isAwesome_of_class_LotsOfArray.getReturnType());
}
if(method_setfor_field_isAwesome_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_isAwesome_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_setfor_field_isAwesome_of_class_LotsOfArray.getModifiers()));
}
if(field_ateBits_of_class_LotsOfArray.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field ateBits to be private, but was "+Modifier.toString(field_ateBits_of_class_LotsOfArray.getModifiers()));
}
if(!method_addfor_field_ateBits_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_ateBits_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_ateBits_of_class_LotsOfArray.getReturnType());
}
if(method_addfor_field_ateBits_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_ateBits_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_addfor_field_ateBits_of_class_LotsOfArray.getModifiers()));
}
if(!method_numfor_field_ateBits_of_class_LotsOfArray.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_ateBits_of_class_LotsOfArray+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_ateBits_of_class_LotsOfArray.getReturnType());
}
if(method_numfor_field_ateBits_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_ateBits_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_numfor_field_ateBits_of_class_LotsOfArray.getModifiers()));
}
if(!method_getfor_field_ateBits_of_class_LotsOfArray.getReturnType().equals(Collection.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_ateBits_of_class_LotsOfArray+" to have return type "+Collection.class+" but was actually " +method_getfor_field_ateBits_of_class_LotsOfArray.getReturnType());
}
if(method_getfor_field_ateBits_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_ateBits_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_getfor_field_ateBits_of_class_LotsOfArray.getModifiers()));
}
if(!method_setfor_field_ateBits_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_ateBits_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_ateBits_of_class_LotsOfArray.getReturnType());
}
if(method_setfor_field_ateBits_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_ateBits_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_setfor_field_ateBits_of_class_LotsOfArray.getModifiers()));
}
if(field_boat_of_class_LotsOfArray.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field boat to be private, but was "+Modifier.toString(field_boat_of_class_LotsOfArray.getModifiers()));
}
if(!method_addfor_field_boat_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_boat_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_boat_of_class_LotsOfArray.getReturnType());
}
if(method_addfor_field_boat_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_boat_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_addfor_field_boat_of_class_LotsOfArray.getModifiers()));
}
if(!method_numfor_field_boat_of_class_LotsOfArray.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_boat_of_class_LotsOfArray+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_boat_of_class_LotsOfArray.getReturnType());
}
if(method_numfor_field_boat_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_boat_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_numfor_field_boat_of_class_LotsOfArray.getModifiers()));
}
if(!method_getfor_field_boat_of_class_LotsOfArray.getReturnType().equals(Collection.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_boat_of_class_LotsOfArray+" to have return type "+Collection.class+" but was actually " +method_getfor_field_boat_of_class_LotsOfArray.getReturnType());
}
if(method_getfor_field_boat_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_boat_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_getfor_field_boat_of_class_LotsOfArray.getModifiers()));
}
if(!method_setfor_field_boat_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_boat_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_boat_of_class_LotsOfArray.getReturnType());
}
if(method_setfor_field_boat_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_boat_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_setfor_field_boat_of_class_LotsOfArray.getModifiers()));
}
if(field_trouble_of_class_LotsOfArray.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field trouble to be private, but was "+Modifier.toString(field_trouble_of_class_LotsOfArray.getModifiers()));
}
if(!method_addfor_field_trouble_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_trouble_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_trouble_of_class_LotsOfArray.getReturnType());
}
if(method_addfor_field_trouble_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_trouble_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_addfor_field_trouble_of_class_LotsOfArray.getModifiers()));
}
if(!method_numfor_field_trouble_of_class_LotsOfArray.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_trouble_of_class_LotsOfArray+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_trouble_of_class_LotsOfArray.getReturnType());
}
if(method_numfor_field_trouble_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_trouble_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_numfor_field_trouble_of_class_LotsOfArray.getModifiers()));
}
if(!method_getfor_field_trouble_of_class_LotsOfArray.getReturnType().equals(Double.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_trouble_of_class_LotsOfArray+" to have return type "+Double.TYPE+" but was actually " +method_getfor_field_trouble_of_class_LotsOfArray.getReturnType());
}
if(method_getfor_field_trouble_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_trouble_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_getfor_field_trouble_of_class_LotsOfArray.getModifiers()));
}
if(!method_setfor_field_trouble_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_trouble_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_trouble_of_class_LotsOfArray.getReturnType());
}
if(method_setfor_field_trouble_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_trouble_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_setfor_field_trouble_of_class_LotsOfArray.getModifiers()));
}
if(field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field isntPronouncedLikeCare to be private, but was "+Modifier.toString(field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers()));
}
if(!method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getReturnType());
}
if(method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers()));
}
if(!method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getReturnType());
}
if(method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers()));
}
if(!method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getReturnType().equals(Collection.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray+" to have return type "+Collection.class+" but was actually " +method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getReturnType());
}
if(method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers()));
}
if(!method_setfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_isntPronouncedLikeCare_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getReturnType());
}
if(method_setfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_isntPronouncedLikeCare_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_setfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.getModifiers()));
}
if(field_waysAway_of_class_LotsOfArray.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field waysAway to be private, but was "+Modifier.toString(field_waysAway_of_class_LotsOfArray.getModifiers()));
}
if(!method_addfor_field_waysAway_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_waysAway_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_waysAway_of_class_LotsOfArray.getReturnType());
}
if(method_addfor_field_waysAway_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_waysAway_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_addfor_field_waysAway_of_class_LotsOfArray.getModifiers()));
}
if(!method_numfor_field_waysAway_of_class_LotsOfArray.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_waysAway_of_class_LotsOfArray+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_waysAway_of_class_LotsOfArray.getReturnType());
}
if(method_numfor_field_waysAway_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_waysAway_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_numfor_field_waysAway_of_class_LotsOfArray.getModifiers()));
}
if(!method_getfor_field_waysAway_of_class_LotsOfArray.getReturnType().equals(Long.TYPE)) {
throw new IllegalStateException("Expected method "+method_getfor_field_waysAway_of_class_LotsOfArray+" to have return type "+Long.TYPE+" but was actually " +method_getfor_field_waysAway_of_class_LotsOfArray.getReturnType());
}
if(method_getfor_field_waysAway_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_waysAway_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_getfor_field_waysAway_of_class_LotsOfArray.getModifiers()));
}
if(!method_setfor_field_waysAway_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_waysAway_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_waysAway_of_class_LotsOfArray.getReturnType());
}
if(method_setfor_field_waysAway_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_waysAway_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_setfor_field_waysAway_of_class_LotsOfArray.getModifiers()));
}
if(field_stackOfPancakes_of_class_LotsOfArray.getModifiers() != Modifier.PRIVATE) {
  throw new IllegalStateException("Expected Field stackOfPancakes to be private, but was "+Modifier.toString(field_stackOfPancakes_of_class_LotsOfArray.getModifiers()));
}
if(!method_addfor_field_stackOfPancakes_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_addfor_field_stackOfPancakes_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_addfor_field_stackOfPancakes_of_class_LotsOfArray.getReturnType());
}
if(method_addfor_field_stackOfPancakes_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_addfor_field_stackOfPancakes_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_addfor_field_stackOfPancakes_of_class_LotsOfArray.getModifiers()));
}
if(!method_numfor_field_stackOfPancakes_of_class_LotsOfArray.getReturnType().equals(Integer.TYPE)) {
throw new IllegalStateException("Expected method "+method_numfor_field_stackOfPancakes_of_class_LotsOfArray+" to have return type "+Integer.TYPE+" but was actually " +method_numfor_field_stackOfPancakes_of_class_LotsOfArray.getReturnType());
}
if(method_numfor_field_stackOfPancakes_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_numfor_field_stackOfPancakes_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_numfor_field_stackOfPancakes_of_class_LotsOfArray.getModifiers()));
}
if(!method_getfor_field_stackOfPancakes_of_class_LotsOfArray.getReturnType().equals(Collection.class)) {
throw new IllegalStateException("Expected method "+method_getfor_field_stackOfPancakes_of_class_LotsOfArray+" to have return type "+Collection.class+" but was actually " +method_getfor_field_stackOfPancakes_of_class_LotsOfArray.getReturnType());
}
if(method_getfor_field_stackOfPancakes_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_getfor_field_stackOfPancakes_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_getfor_field_stackOfPancakes_of_class_LotsOfArray.getModifiers()));
}
if(!method_setfor_field_stackOfPancakes_of_class_LotsOfArray.getReturnType().equals(Void.TYPE)) {
throw new IllegalStateException("Expected method "+method_setfor_field_stackOfPancakes_of_class_LotsOfArray+" to have return type "+Void.TYPE+" but was actually " +method_setfor_field_stackOfPancakes_of_class_LotsOfArray.getReturnType());
}
if(method_setfor_field_stackOfPancakes_of_class_LotsOfArray.getModifiers() != Modifier.PUBLIC) {
  throw new IllegalStateException("Expected Method "+method_setfor_field_stackOfPancakes_of_class_LotsOfArray+" to be public , but was "+Modifier.toString(method_setfor_field_stackOfPancakes_of_class_LotsOfArray.getModifiers()));
}
  }
  public void test_LotsOfArray_0() throws Exception {
    System.out.println("Starting test case: 0 for class LotsOfArray");
    RunAll.logln("Starting test case: 0 for LotsOfArray");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_1 = class_LotsOfArray.getDeclaredConstructor().newInstance();
ArrayList<Object> v_2 =  new ArrayList<Object>();
ArrayList<Object> v_3 =  new ArrayList<Object>();
int v_6 = 0;
for (Object v_5: v_3) {
method_addfor_field_x_of_class_LotsOfArray.invoke(v_1, v_5);
if ( !method_getfor_field_x_of_class_LotsOfArray.invoke(v_1, v_6).equals(v_5)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_6++;
int v_4 = (Integer)method_numfor_field_x_of_class_LotsOfArray.invoke(v_1);
if (v_4 != v_6) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_7 =  new ArrayList<Object>();
ArrayList<Object> v_8 =  new ArrayList<Object>();
int v_11 = 0;
for (Object v_10: v_8) {
method_addfor_field_isAwesome_of_class_LotsOfArray.invoke(v_1, v_10);
if ( !method_getfor_field_isAwesome_of_class_LotsOfArray.invoke(v_1, v_11).equals(v_10)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_11++;
int v_9 = (Integer)method_numfor_field_isAwesome_of_class_LotsOfArray.invoke(v_1);
if (v_9 != v_11) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_12 =  new ArrayList<Object>();
ArrayList<Object> v_13 =  new ArrayList<Object>();
int v_16 = 0;
for (Object v_15: v_13) {
method_addfor_field_ateBits_of_class_LotsOfArray.invoke(v_1, v_15);
if ( !method_getfor_field_ateBits_of_class_LotsOfArray.invoke(v_1, v_16).equals(v_15)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_16++;
int v_14 = (Integer)method_numfor_field_ateBits_of_class_LotsOfArray.invoke(v_1);
if (v_14 != v_16) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_17 =  new ArrayList<Object>();
ArrayList<Object> v_18 =  new ArrayList<Object>();
int v_21 = 0;
for (Object v_20: v_18) {
method_addfor_field_boat_of_class_LotsOfArray.invoke(v_1, v_20);
if ( !method_getfor_field_boat_of_class_LotsOfArray.invoke(v_1, v_21).equals(v_20)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_21++;
int v_19 = (Integer)method_numfor_field_boat_of_class_LotsOfArray.invoke(v_1);
if (v_19 != v_21) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_22 =  new ArrayList<Object>();
ArrayList<Object> v_23 =  new ArrayList<Object>();
int v_26 = 0;
for (Object v_25: v_23) {
method_addfor_field_trouble_of_class_LotsOfArray.invoke(v_1, v_25);
if ( !method_getfor_field_trouble_of_class_LotsOfArray.invoke(v_1, v_26).equals(v_25)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_26++;
int v_24 = (Integer)method_numfor_field_trouble_of_class_LotsOfArray.invoke(v_1);
if (v_24 != v_26) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_27 =  new ArrayList<Object>();
ArrayList<Object> v_28 =  new ArrayList<Object>();
int v_31 = 0;
for (Object v_30: v_28) {
method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.invoke(v_1, v_30);
if ( !method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.invoke(v_1, v_31).equals(v_30)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_31++;
int v_29 = (Integer)method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.invoke(v_1);
if (v_29 != v_31) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_32 =  new ArrayList<Object>();
ArrayList<Object> v_33 =  new ArrayList<Object>();
int v_36 = 0;
for (Object v_35: v_33) {
method_addfor_field_waysAway_of_class_LotsOfArray.invoke(v_1, v_35);
if ( !method_getfor_field_waysAway_of_class_LotsOfArray.invoke(v_1, v_36).equals(v_35)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_36++;
int v_34 = (Integer)method_numfor_field_waysAway_of_class_LotsOfArray.invoke(v_1);
if (v_34 != v_36) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_37 =  new ArrayList<Object>();
ArrayList<Object> v_38 =  new ArrayList<Object>();
int v_41 = 0;
for (Object v_40: v_38) {
method_addfor_field_stackOfPancakes_of_class_LotsOfArray.invoke(v_1, v_40);
if ( !method_getfor_field_stackOfPancakes_of_class_LotsOfArray.invoke(v_1, v_41).equals(v_40)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_41++;
int v_39 = (Integer)method_numfor_field_stackOfPancakes_of_class_LotsOfArray.invoke(v_1);
if (v_39 != v_41) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_LotsOfArray.invoke(v_1);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_LotsOfArray.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_1);
    RunAll.logln("Finished test case: 0 for LotsOfArray");
  }
  public void test_LotsOfArray_1() throws Exception {
    System.out.println("Starting test case: 1 for class LotsOfArray");
    RunAll.logln("Starting test case: 1 for LotsOfArray");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_42 = class_LotsOfArray.getDeclaredConstructor().newInstance();
ArrayList<Object> v_43 =  new ArrayList<Object>();
v_43.add(431529176);
v_43.add(1761283695);
ArrayList<Object> v_44 =  new ArrayList<Object>();
v_44.add(892128508);
int v_47 = 0;
for (Object v_46: v_44) {
method_addfor_field_x_of_class_LotsOfArray.invoke(v_42, v_46);
if ( !method_getfor_field_x_of_class_LotsOfArray.invoke(v_42, v_47).equals(v_46)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_47++;
int v_45 = (Integer)method_numfor_field_x_of_class_LotsOfArray.invoke(v_42);
if (v_45 != v_47) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_48 =  new ArrayList<Object>();
ArrayList<Object> v_49 =  new ArrayList<Object>();
v_49.add(true);
v_48.add(v_49);
ArrayList<Object> v_50 =  new ArrayList<Object>();
ArrayList<Object> v_51 =  new ArrayList<Object>();
v_51.add(false);
v_51.add(false);
v_50.add(v_51);
ArrayList<Object> v_52 =  new ArrayList<Object>();
v_52.add(false);
v_52.add(true);
v_50.add(v_52);
int v_55 = 0;
for (Object v_54: v_50) {
method_addfor_field_isAwesome_of_class_LotsOfArray.invoke(v_42, v_54);
if ( !method_getfor_field_isAwesome_of_class_LotsOfArray.invoke(v_42, v_55).equals(v_54)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_55++;
int v_53 = (Integer)method_numfor_field_isAwesome_of_class_LotsOfArray.invoke(v_42);
if (v_53 != v_55) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_56 =  new ArrayList<Object>();
ArrayList<Object> v_57 =  new ArrayList<Object>();
ArrayList<Object> v_58 =  new ArrayList<Object>();
v_58.add((byte)119);
v_58.add((byte)62);
v_57.add(v_58);
ArrayList<Object> v_59 =  new ArrayList<Object>();
v_59.add((byte)116);
v_57.add(v_59);
v_56.add(v_57);
ArrayList<Object> v_60 =  new ArrayList<Object>();
ArrayList<Object> v_61 =  new ArrayList<Object>();
v_61.add((byte)37);
v_60.add(v_61);
v_56.add(v_60);
ArrayList<Object> v_62 =  new ArrayList<Object>();
ArrayList<Object> v_63 =  new ArrayList<Object>();
ArrayList<Object> v_64 =  new ArrayList<Object>();
v_64.add((byte)14);
v_64.add((byte)69);
v_63.add(v_64);
ArrayList<Object> v_65 =  new ArrayList<Object>();
v_65.add((byte)74);
v_65.add((byte)84);
v_63.add(v_65);
v_62.add(v_63);
int v_68 = 0;
for (Object v_67: v_62) {
method_addfor_field_ateBits_of_class_LotsOfArray.invoke(v_42, v_67);
if ( !method_getfor_field_ateBits_of_class_LotsOfArray.invoke(v_42, v_68).equals(v_67)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_68++;
int v_66 = (Integer)method_numfor_field_ateBits_of_class_LotsOfArray.invoke(v_42);
if (v_66 != v_68) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_69 =  new ArrayList<Object>();
ArrayList<Object> v_70 =  new ArrayList<Object>();
ArrayList<Object> v_71 =  new ArrayList<Object>();
ArrayList<Object> v_72 =  new ArrayList<Object>();
v_72.add(0.62397254f);
v_71.add(v_72);
ArrayList<Object> v_73 =  new ArrayList<Object>();
v_73.add(0.8792629f);
v_71.add(v_73);
v_70.add(v_71);
v_69.add(v_70);
ArrayList<Object> v_74 =  new ArrayList<Object>();
ArrayList<Object> v_75 =  new ArrayList<Object>();
ArrayList<Object> v_76 =  new ArrayList<Object>();
ArrayList<Object> v_77 =  new ArrayList<Object>();
v_77.add(0.0050251484f);
v_76.add(v_77);
ArrayList<Object> v_78 =  new ArrayList<Object>();
v_78.add(0.5231351f);
v_78.add(0.02341801f);
v_76.add(v_78);
v_75.add(v_76);
v_74.add(v_75);
ArrayList<Object> v_79 =  new ArrayList<Object>();
ArrayList<Object> v_80 =  new ArrayList<Object>();
ArrayList<Object> v_81 =  new ArrayList<Object>();
v_81.add(0.2750299f);
v_80.add(v_81);
ArrayList<Object> v_82 =  new ArrayList<Object>();
v_82.add(0.075387776f);
v_80.add(v_82);
v_79.add(v_80);
ArrayList<Object> v_83 =  new ArrayList<Object>();
ArrayList<Object> v_84 =  new ArrayList<Object>();
v_84.add(0.5771002f);
v_84.add(0.9549307f);
v_83.add(v_84);
ArrayList<Object> v_85 =  new ArrayList<Object>();
v_85.add(0.27406907f);
v_83.add(v_85);
v_79.add(v_83);
v_74.add(v_79);
int v_88 = 0;
for (Object v_87: v_74) {
method_addfor_field_boat_of_class_LotsOfArray.invoke(v_42, v_87);
if ( !method_getfor_field_boat_of_class_LotsOfArray.invoke(v_42, v_88).equals(v_87)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_88++;
int v_86 = (Integer)method_numfor_field_boat_of_class_LotsOfArray.invoke(v_42);
if (v_86 != v_88) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_89 =  new ArrayList<Object>();
v_89.add((double)0.19020220912556496);
v_89.add((double)0.0012985767526091374);
ArrayList<Object> v_90 =  new ArrayList<Object>();
v_90.add((double)0.16104332337170224);
v_90.add((double)0.17805484663717475);
int v_93 = 0;
for (Object v_92: v_90) {
method_addfor_field_trouble_of_class_LotsOfArray.invoke(v_42, v_92);
if ( !method_getfor_field_trouble_of_class_LotsOfArray.invoke(v_42, v_93).equals(v_92)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_93++;
int v_91 = (Integer)method_numfor_field_trouble_of_class_LotsOfArray.invoke(v_42);
if (v_91 != v_93) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_94 =  new ArrayList<Object>();
ArrayList<Object> v_95 =  new ArrayList<Object>();
v_95.add('j');
v_94.add(v_95);
ArrayList<Object> v_96 =  new ArrayList<Object>();
v_96.add('m');
v_94.add(v_96);
ArrayList<Object> v_97 =  new ArrayList<Object>();
ArrayList<Object> v_98 =  new ArrayList<Object>();
v_98.add('h');
v_97.add(v_98);
int v_101 = 0;
for (Object v_100: v_97) {
method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.invoke(v_42, v_100);
if ( !method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.invoke(v_42, v_101).equals(v_100)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_101++;
int v_99 = (Integer)method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.invoke(v_42);
if (v_99 != v_101) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_102 =  new ArrayList<Object>();
v_102.add(7499354754298413200L);
ArrayList<Object> v_103 =  new ArrayList<Object>();
v_103.add(4300965142756182089L);
v_103.add(-2030825140507191061L);
int v_106 = 0;
for (Object v_105: v_103) {
method_addfor_field_waysAway_of_class_LotsOfArray.invoke(v_42, v_105);
if ( !method_getfor_field_waysAway_of_class_LotsOfArray.invoke(v_42, v_106).equals(v_105)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_106++;
int v_104 = (Integer)method_numfor_field_waysAway_of_class_LotsOfArray.invoke(v_42);
if (v_104 != v_106) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_107 =  new ArrayList<Object>();
ArrayList<Object> v_108 =  new ArrayList<Object>();
v_108.add((short)19411);
v_107.add(v_108);
ArrayList<Object> v_109 =  new ArrayList<Object>();
ArrayList<Object> v_110 =  new ArrayList<Object>();
v_110.add((short)7497);
v_110.add((short)3926);
v_109.add(v_110);
int v_113 = 0;
for (Object v_112: v_109) {
method_addfor_field_stackOfPancakes_of_class_LotsOfArray.invoke(v_42, v_112);
if ( !method_getfor_field_stackOfPancakes_of_class_LotsOfArray.invoke(v_42, v_113).equals(v_112)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_113++;
int v_111 = (Integer)method_numfor_field_stackOfPancakes_of_class_LotsOfArray.invoke(v_42);
if (v_111 != v_113) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_LotsOfArray.invoke(v_42);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_LotsOfArray.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_42);
    RunAll.logln("Finished test case: 1 for LotsOfArray");
  }
  public void test_LotsOfArray_2() throws Exception {
    System.out.println("Starting test case: 2 for class LotsOfArray");
    RunAll.logln("Starting test case: 2 for LotsOfArray");
    //setup a random state of this object
    //as we do this, we check that the methods that go with it are right
  Object v_114 = class_LotsOfArray.getDeclaredConstructor().newInstance();
ArrayList<Object> v_115 =  new ArrayList<Object>();
v_115.add(1260042744);
v_115.add(-423279216);
v_115.add(17850135);
ArrayList<Object> v_116 =  new ArrayList<Object>();
v_116.add(-624140595);
v_116.add(-60658084);
int v_119 = 0;
for (Object v_118: v_116) {
method_addfor_field_x_of_class_LotsOfArray.invoke(v_114, v_118);
if ( !method_getfor_field_x_of_class_LotsOfArray.invoke(v_114, v_119).equals(v_118)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_119++;
int v_117 = (Integer)method_numfor_field_x_of_class_LotsOfArray.invoke(v_114);
if (v_117 != v_119) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_120 =  new ArrayList<Object>();
ArrayList<Object> v_121 =  new ArrayList<Object>();
v_121.add(true);
v_121.add(true);
v_121.add(false);
v_120.add(v_121);
ArrayList<Object> v_122 =  new ArrayList<Object>();
v_122.add(true);
v_122.add(false);
v_122.add(true);
v_120.add(v_122);
ArrayList<Object> v_123 =  new ArrayList<Object>();
ArrayList<Object> v_124 =  new ArrayList<Object>();
v_124.add(true);
v_124.add(true);
v_123.add(v_124);
ArrayList<Object> v_125 =  new ArrayList<Object>();
v_125.add(false);
v_125.add(true);
v_123.add(v_125);
ArrayList<Object> v_126 =  new ArrayList<Object>();
v_126.add(true);
v_126.add(false);
v_126.add(false);
v_123.add(v_126);
int v_129 = 0;
for (Object v_128: v_123) {
method_addfor_field_isAwesome_of_class_LotsOfArray.invoke(v_114, v_128);
if ( !method_getfor_field_isAwesome_of_class_LotsOfArray.invoke(v_114, v_129).equals(v_128)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_129++;
int v_127 = (Integer)method_numfor_field_isAwesome_of_class_LotsOfArray.invoke(v_114);
if (v_127 != v_129) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_130 =  new ArrayList<Object>();
ArrayList<Object> v_131 =  new ArrayList<Object>();
ArrayList<Object> v_132 =  new ArrayList<Object>();
v_132.add((byte)45);
v_132.add((byte)66);
v_132.add((byte)127);
v_131.add(v_132);
ArrayList<Object> v_133 =  new ArrayList<Object>();
v_133.add((byte)71);
v_133.add((byte)42);
v_133.add((byte)60);
v_133.add((byte)101);
v_131.add(v_133);
v_130.add(v_131);
ArrayList<Object> v_134 =  new ArrayList<Object>();
ArrayList<Object> v_135 =  new ArrayList<Object>();
v_135.add((byte)74);
v_135.add((byte)21);
v_135.add((byte)108);
v_135.add((byte)75);
v_134.add(v_135);
ArrayList<Object> v_136 =  new ArrayList<Object>();
v_136.add((byte)30);
v_136.add((byte)19);
v_134.add(v_136);
ArrayList<Object> v_137 =  new ArrayList<Object>();
v_137.add((byte)123);
v_137.add((byte)80);
v_134.add(v_137);
v_130.add(v_134);
ArrayList<Object> v_138 =  new ArrayList<Object>();
ArrayList<Object> v_139 =  new ArrayList<Object>();
v_139.add((byte)78);
v_139.add((byte)3);
v_139.add((byte)77);
v_138.add(v_139);
ArrayList<Object> v_140 =  new ArrayList<Object>();
v_140.add((byte)31);
v_140.add((byte)93);
v_140.add((byte)107);
v_138.add(v_140);
ArrayList<Object> v_141 =  new ArrayList<Object>();
v_141.add((byte)88);
v_141.add((byte)69);
v_141.add((byte)102);
v_141.add((byte)1);
v_138.add(v_141);
ArrayList<Object> v_142 =  new ArrayList<Object>();
v_142.add((byte)105);
v_142.add((byte)13);
v_142.add((byte)13);
v_142.add((byte)4);
v_138.add(v_142);
v_130.add(v_138);
ArrayList<Object> v_143 =  new ArrayList<Object>();
ArrayList<Object> v_144 =  new ArrayList<Object>();
v_144.add((byte)95);
v_144.add((byte)34);
v_144.add((byte)103);
v_143.add(v_144);
ArrayList<Object> v_145 =  new ArrayList<Object>();
v_145.add((byte)4);
v_145.add((byte)29);
v_145.add((byte)16);
v_145.add((byte)18);
v_143.add(v_145);
ArrayList<Object> v_146 =  new ArrayList<Object>();
v_146.add((byte)6);
v_146.add((byte)42);
v_146.add((byte)16);
v_143.add(v_146);
ArrayList<Object> v_147 =  new ArrayList<Object>();
v_147.add((byte)7);
v_147.add((byte)46);
v_147.add((byte)58);
v_143.add(v_147);
v_130.add(v_143);
ArrayList<Object> v_148 =  new ArrayList<Object>();
ArrayList<Object> v_149 =  new ArrayList<Object>();
ArrayList<Object> v_150 =  new ArrayList<Object>();
v_150.add((byte)32);
v_150.add((byte)101);
v_150.add((byte)101);
v_150.add((byte)33);
v_149.add(v_150);
ArrayList<Object> v_151 =  new ArrayList<Object>();
v_151.add((byte)74);
v_151.add((byte)44);
v_149.add(v_151);
ArrayList<Object> v_152 =  new ArrayList<Object>();
v_152.add((byte)92);
v_152.add((byte)69);
v_152.add((byte)113);
v_149.add(v_152);
ArrayList<Object> v_153 =  new ArrayList<Object>();
v_153.add((byte)54);
v_153.add((byte)54);
v_149.add(v_153);
v_148.add(v_149);
ArrayList<Object> v_154 =  new ArrayList<Object>();
ArrayList<Object> v_155 =  new ArrayList<Object>();
v_155.add((byte)20);
v_155.add((byte)96);
v_154.add(v_155);
ArrayList<Object> v_156 =  new ArrayList<Object>();
v_156.add((byte)59);
v_156.add((byte)72);
v_156.add((byte)102);
v_156.add((byte)12);
v_154.add(v_156);
v_148.add(v_154);
int v_159 = 0;
for (Object v_158: v_148) {
method_addfor_field_ateBits_of_class_LotsOfArray.invoke(v_114, v_158);
if ( !method_getfor_field_ateBits_of_class_LotsOfArray.invoke(v_114, v_159).equals(v_158)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_159++;
int v_157 = (Integer)method_numfor_field_ateBits_of_class_LotsOfArray.invoke(v_114);
if (v_157 != v_159) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_160 =  new ArrayList<Object>();
ArrayList<Object> v_161 =  new ArrayList<Object>();
ArrayList<Object> v_162 =  new ArrayList<Object>();
ArrayList<Object> v_163 =  new ArrayList<Object>();
v_163.add(0.90485644f);
v_163.add(0.52797216f);
v_163.add(0.19789451f);
v_162.add(v_163);
ArrayList<Object> v_164 =  new ArrayList<Object>();
v_164.add(0.29818952f);
v_164.add(0.5566992f);
v_164.add(0.6207804f);
v_164.add(0.59741765f);
v_162.add(v_164);
v_161.add(v_162);
ArrayList<Object> v_165 =  new ArrayList<Object>();
ArrayList<Object> v_166 =  new ArrayList<Object>();
v_166.add(0.93948525f);
v_166.add(0.90529484f);
v_166.add(0.24371326f);
v_166.add(0.040966332f);
v_165.add(v_166);
ArrayList<Object> v_167 =  new ArrayList<Object>();
v_167.add(0.46057737f);
v_167.add(0.8121491f);
v_167.add(0.39456773f);
v_165.add(v_167);
ArrayList<Object> v_168 =  new ArrayList<Object>();
v_168.add(0.80019724f);
v_168.add(0.666738f);
v_168.add(0.32942843f);
v_168.add(0.64299893f);
v_165.add(v_168);
ArrayList<Object> v_169 =  new ArrayList<Object>();
v_169.add(0.40621805f);
v_169.add(0.7325264f);
v_169.add(0.47810203f);
v_165.add(v_169);
v_161.add(v_165);
v_160.add(v_161);
ArrayList<Object> v_170 =  new ArrayList<Object>();
ArrayList<Object> v_171 =  new ArrayList<Object>();
ArrayList<Object> v_172 =  new ArrayList<Object>();
v_172.add(0.98910135f);
v_172.add(9.6577406E-4f);
v_172.add(0.62666875f);
v_171.add(v_172);
ArrayList<Object> v_173 =  new ArrayList<Object>();
v_173.add(0.5876616f);
v_173.add(0.36011422f);
v_171.add(v_173);
ArrayList<Object> v_174 =  new ArrayList<Object>();
v_174.add(0.62969637f);
v_174.add(0.9771284f);
v_174.add(0.17798495f);
v_174.add(0.042274594f);
v_171.add(v_174);
v_170.add(v_171);
ArrayList<Object> v_175 =  new ArrayList<Object>();
ArrayList<Object> v_176 =  new ArrayList<Object>();
v_176.add(0.9099537f);
v_176.add(0.91872346f);
v_176.add(0.2824617f);
v_175.add(v_176);
ArrayList<Object> v_177 =  new ArrayList<Object>();
v_177.add(0.7402977f);
v_177.add(0.7453295f);
v_177.add(0.26981175f);
v_177.add(0.97535807f);
v_175.add(v_177);
ArrayList<Object> v_178 =  new ArrayList<Object>();
v_178.add(0.84405255f);
v_178.add(0.8134702f);
v_178.add(0.92320067f);
v_178.add(0.5319486f);
v_175.add(v_178);
ArrayList<Object> v_179 =  new ArrayList<Object>();
v_179.add(0.036826372f);
v_179.add(0.9411623f);
v_175.add(v_179);
v_170.add(v_175);
ArrayList<Object> v_180 =  new ArrayList<Object>();
ArrayList<Object> v_181 =  new ArrayList<Object>();
v_181.add(0.17367613f);
v_181.add(0.013090372f);
v_181.add(0.10848087f);
v_181.add(0.91858596f);
v_180.add(v_181);
ArrayList<Object> v_182 =  new ArrayList<Object>();
v_182.add(0.5080134f);
v_182.add(0.38888383f);
v_180.add(v_182);
ArrayList<Object> v_183 =  new ArrayList<Object>();
v_183.add(0.8659198f);
v_183.add(0.10752028f);
v_183.add(0.5264171f);
v_180.add(v_183);
v_170.add(v_180);
v_160.add(v_170);
ArrayList<Object> v_184 =  new ArrayList<Object>();
ArrayList<Object> v_185 =  new ArrayList<Object>();
ArrayList<Object> v_186 =  new ArrayList<Object>();
ArrayList<Object> v_187 =  new ArrayList<Object>();
v_187.add(0.39308655f);
v_187.add(0.30753303f);
v_187.add(0.5713401f);
v_186.add(v_187);
ArrayList<Object> v_188 =  new ArrayList<Object>();
v_188.add(0.9561646f);
v_188.add(0.4139706f);
v_188.add(0.03981161f);
v_188.add(0.7392114f);
v_186.add(v_188);
ArrayList<Object> v_189 =  new ArrayList<Object>();
v_189.add(0.8729075f);
v_189.add(0.9507473f);
v_189.add(0.9039417f);
v_189.add(0.3379268f);
v_186.add(v_189);
v_185.add(v_186);
ArrayList<Object> v_190 =  new ArrayList<Object>();
ArrayList<Object> v_191 =  new ArrayList<Object>();
v_191.add(0.3273179f);
v_191.add(0.74357384f);
v_191.add(0.9058518f);
v_190.add(v_191);
ArrayList<Object> v_192 =  new ArrayList<Object>();
v_192.add(0.6518717f);
v_192.add(0.18407685f);
v_192.add(0.06897944f);
v_190.add(v_192);
ArrayList<Object> v_193 =  new ArrayList<Object>();
v_193.add(0.21674591f);
v_193.add(0.6301871f);
v_190.add(v_193);
v_185.add(v_190);
ArrayList<Object> v_194 =  new ArrayList<Object>();
ArrayList<Object> v_195 =  new ArrayList<Object>();
v_195.add(0.9827886f);
v_195.add(0.06442803f);
v_195.add(0.9595806f);
v_194.add(v_195);
ArrayList<Object> v_196 =  new ArrayList<Object>();
v_196.add(0.5520927f);
v_196.add(0.20015019f);
v_194.add(v_196);
ArrayList<Object> v_197 =  new ArrayList<Object>();
v_197.add(0.48867577f);
v_197.add(0.59104544f);
v_194.add(v_197);
ArrayList<Object> v_198 =  new ArrayList<Object>();
v_198.add(0.9773044f);
v_198.add(0.98453027f);
v_198.add(0.5618139f);
v_198.add(0.518738f);
v_194.add(v_198);
v_185.add(v_194);
v_184.add(v_185);
ArrayList<Object> v_199 =  new ArrayList<Object>();
ArrayList<Object> v_200 =  new ArrayList<Object>();
ArrayList<Object> v_201 =  new ArrayList<Object>();
v_201.add(0.9267961f);
v_201.add(0.5315165f);
v_201.add(0.987331f);
v_200.add(v_201);
ArrayList<Object> v_202 =  new ArrayList<Object>();
v_202.add(0.84811f);
v_202.add(0.22288465f);
v_202.add(0.60579306f);
v_200.add(v_202);
ArrayList<Object> v_203 =  new ArrayList<Object>();
v_203.add(0.2536745f);
v_203.add(0.5672321f);
v_203.add(0.9037395f);
v_203.add(0.39768028f);
v_200.add(v_203);
v_199.add(v_200);
ArrayList<Object> v_204 =  new ArrayList<Object>();
ArrayList<Object> v_205 =  new ArrayList<Object>();
v_205.add(0.540593f);
v_205.add(0.80612576f);
v_205.add(0.8452226f);
v_205.add(0.42635167f);
v_204.add(v_205);
ArrayList<Object> v_206 =  new ArrayList<Object>();
v_206.add(0.34393525f);
v_206.add(0.48788327f);
v_206.add(0.6677905f);
v_204.add(v_206);
ArrayList<Object> v_207 =  new ArrayList<Object>();
v_207.add(0.39161068f);
v_207.add(0.4754954f);
v_204.add(v_207);
ArrayList<Object> v_208 =  new ArrayList<Object>();
v_208.add(0.46959686f);
v_208.add(0.8226669f);
v_208.add(0.15213025f);
v_208.add(0.17441076f);
v_204.add(v_208);
v_199.add(v_204);
ArrayList<Object> v_209 =  new ArrayList<Object>();
ArrayList<Object> v_210 =  new ArrayList<Object>();
v_210.add(0.71030635f);
v_210.add(0.20640838f);
v_210.add(0.21876097f);
v_210.add(0.3233794f);
v_209.add(v_210);
ArrayList<Object> v_211 =  new ArrayList<Object>();
v_211.add(0.21617371f);
v_211.add(0.14799428f);
v_209.add(v_211);
v_199.add(v_209);
ArrayList<Object> v_212 =  new ArrayList<Object>();
ArrayList<Object> v_213 =  new ArrayList<Object>();
v_213.add(0.70872205f);
v_213.add(0.5280529f);
v_213.add(0.31239015f);
v_213.add(0.14424413f);
v_212.add(v_213);
ArrayList<Object> v_214 =  new ArrayList<Object>();
v_214.add(0.31661046f);
v_214.add(0.40881127f);
v_214.add(0.77893955f);
v_212.add(v_214);
v_199.add(v_212);
v_184.add(v_199);
ArrayList<Object> v_215 =  new ArrayList<Object>();
ArrayList<Object> v_216 =  new ArrayList<Object>();
ArrayList<Object> v_217 =  new ArrayList<Object>();
v_217.add(0.8176128f);
v_217.add(0.50261575f);
v_216.add(v_217);
ArrayList<Object> v_218 =  new ArrayList<Object>();
v_218.add(0.5247845f);
v_218.add(0.964629f);
v_216.add(v_218);
ArrayList<Object> v_219 =  new ArrayList<Object>();
v_219.add(0.41442043f);
v_219.add(0.5610249f);
v_219.add(0.6596988f);
v_216.add(v_219);
v_215.add(v_216);
ArrayList<Object> v_220 =  new ArrayList<Object>();
ArrayList<Object> v_221 =  new ArrayList<Object>();
v_221.add(0.24920523f);
v_221.add(0.3507731f);
v_220.add(v_221);
ArrayList<Object> v_222 =  new ArrayList<Object>();
v_222.add(0.07416135f);
v_222.add(0.4363473f);
v_222.add(0.736662f);
v_222.add(0.12226373f);
v_220.add(v_222);
ArrayList<Object> v_223 =  new ArrayList<Object>();
v_223.add(0.5161939f);
v_223.add(0.58533573f);
v_220.add(v_223);
v_215.add(v_220);
v_184.add(v_215);
int v_226 = 0;
for (Object v_225: v_184) {
method_addfor_field_boat_of_class_LotsOfArray.invoke(v_114, v_225);
if ( !method_getfor_field_boat_of_class_LotsOfArray.invoke(v_114, v_226).equals(v_225)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_226++;
int v_224 = (Integer)method_numfor_field_boat_of_class_LotsOfArray.invoke(v_114);
if (v_224 != v_226) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_227 =  new ArrayList<Object>();
v_227.add((double)0.5485174080804055);
v_227.add((double)0.7706895421853207);
v_227.add((double)0.6359156929127353);
ArrayList<Object> v_228 =  new ArrayList<Object>();
v_228.add((double)0.0796264303890879);
v_228.add((double)0.6249427159472043);
int v_231 = 0;
for (Object v_230: v_228) {
method_addfor_field_trouble_of_class_LotsOfArray.invoke(v_114, v_230);
if ( !method_getfor_field_trouble_of_class_LotsOfArray.invoke(v_114, v_231).equals(v_230)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_231++;
int v_229 = (Integer)method_numfor_field_trouble_of_class_LotsOfArray.invoke(v_114);
if (v_229 != v_231) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_232 =  new ArrayList<Object>();
ArrayList<Object> v_233 =  new ArrayList<Object>();
v_233.add('b');
v_233.add('u');
v_233.add('q');
v_233.add('j');
v_232.add(v_233);
ArrayList<Object> v_234 =  new ArrayList<Object>();
v_234.add('e');
v_234.add('h');
v_232.add(v_234);
ArrayList<Object> v_235 =  new ArrayList<Object>();
v_235.add('h');
v_235.add('y');
v_232.add(v_235);
ArrayList<Object> v_236 =  new ArrayList<Object>();
v_236.add('u');
v_236.add('c');
v_236.add('s');
v_232.add(v_236);
ArrayList<Object> v_237 =  new ArrayList<Object>();
ArrayList<Object> v_238 =  new ArrayList<Object>();
v_238.add('y');
v_238.add('c');
v_237.add(v_238);
ArrayList<Object> v_239 =  new ArrayList<Object>();
v_239.add('p');
v_239.add('t');
v_239.add('y');
v_237.add(v_239);
ArrayList<Object> v_240 =  new ArrayList<Object>();
v_240.add('x');
v_240.add('s');
v_240.add('r');
v_240.add('s');
v_237.add(v_240);
int v_243 = 0;
for (Object v_242: v_237) {
method_addfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.invoke(v_114, v_242);
if ( !method_getfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.invoke(v_114, v_243).equals(v_242)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_243++;
int v_241 = (Integer)method_numfor_field_isntPronouncedLikeCare_of_class_LotsOfArray.invoke(v_114);
if (v_241 != v_243) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_244 =  new ArrayList<Object>();
v_244.add(2827217836381035028L);
v_244.add(9138201079337718859L);
ArrayList<Object> v_245 =  new ArrayList<Object>();
v_245.add(333629563507168195L);
v_245.add(5139975617490106474L);
int v_248 = 0;
for (Object v_247: v_245) {
method_addfor_field_waysAway_of_class_LotsOfArray.invoke(v_114, v_247);
if ( !method_getfor_field_waysAway_of_class_LotsOfArray.invoke(v_114, v_248).equals(v_247)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_248++;
int v_246 = (Integer)method_numfor_field_waysAway_of_class_LotsOfArray.invoke(v_114);
if (v_246 != v_248) {
throw new IllegalStateException("array size was not correct!");
}
}
ArrayList<Object> v_249 =  new ArrayList<Object>();
ArrayList<Object> v_250 =  new ArrayList<Object>();
v_250.add((short)18871);
v_250.add((short)13708);
v_250.add((short)14878);
v_249.add(v_250);
ArrayList<Object> v_251 =  new ArrayList<Object>();
v_251.add((short)8152);
v_251.add((short)16344);
v_251.add((short)22550);
v_249.add(v_251);
ArrayList<Object> v_252 =  new ArrayList<Object>();
v_252.add((short)27177);
v_252.add((short)26203);
v_249.add(v_252);
ArrayList<Object> v_253 =  new ArrayList<Object>();
ArrayList<Object> v_254 =  new ArrayList<Object>();
v_254.add((short)20044);
v_254.add((short)8743);
v_254.add((short)29288);
v_254.add((short)32262);
v_253.add(v_254);
ArrayList<Object> v_255 =  new ArrayList<Object>();
v_255.add((short)23724);
v_255.add((short)908);
v_255.add((short)21211);
v_255.add((short)10615);
v_253.add(v_255);
int v_258 = 0;
for (Object v_257: v_253) {
method_addfor_field_stackOfPancakes_of_class_LotsOfArray.invoke(v_114, v_257);
if ( !method_getfor_field_stackOfPancakes_of_class_LotsOfArray.invoke(v_114, v_258).equals(v_257)){
throw new IllegalStateException("get did not reutrn the element I just put in !");
}
v_258++;
int v_256 = (Integer)method_numfor_field_stackOfPancakes_of_class_LotsOfArray.invoke(v_114);
if (v_256 != v_258) {
throw new IllegalStateException("array size was not correct!");
}
}
    System.out.println("   Basic behavior is ok.  Now checking serialization/deserialization");    JSONObject jsobj = (JSONObject) tojson_method_for_LotsOfArray.invoke(v_114);
    if(!SerializationTester.isSerFormatValid(jsobj)) {
        throw new IllegalStateException("Serialized format was not valid");
    }
    System.out.println("   JSON format appears valid.  Checking serialization/deserialization idempotency");
   Object resultOfDeserialization = deser_method_for_LotsOfArray.invoke(null, jsobj);
   DeserializationTester.sameStructure(resultOfDeserialization, v_114);
    RunAll.logln("Finished test case: 2 for LotsOfArray");
  }
  public void runAllTests() throws Exception{
      test_LotsOfArray_0();
      test_LotsOfArray_1();
      test_LotsOfArray_2();
  }
}
