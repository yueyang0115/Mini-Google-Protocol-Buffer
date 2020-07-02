package hwk1.testing.zoo;
import java.util.*;
import org.json.*;

public class Deserializer{

public static Keeper readKeeper(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Keeper_helper(js,objmap);
}

public static Keeper Keeper_helper(JSONObject js, HashMap<Integer, Object> objmap){
Keeper ans = new Keeper();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Keeper)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setFirstName(val_obj_0.getString("firstName"));
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
ans.setLastName(val_obj_1.getString("lastName"));
JSONObject val_obj_2 = new JSONObject();
val_obj_2= val_arr.getJSONObject(2);
ans.setSalary(val_obj_2.getDouble("salary"));
JSONObject val_obj_3 = new JSONObject();
val_obj_3= val_arr.getJSONObject(3);
JSONArray list_arr_3 = new JSONArray();
list_arr_3=val_obj_3.getJSONArray("myPens");
for(int i=0;i<list_arr_3.length();i++){
ans.addMyPens(AnimalPen_helper(list_arr_3.getJSONObject(i),objmap));
}
return ans;
}
}


public static AnimalPen readAnimalPen(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return AnimalPen_helper(js,objmap);
}

public static AnimalPen AnimalPen_helper(JSONObject js, HashMap<Integer, Object> objmap){
AnimalPen ans = new AnimalPen();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (AnimalPen)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setXloc(val_obj_0.getFloat("xloc"));
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
ans.setYloc(val_obj_1.getFloat("yloc"));
JSONObject val_obj_2 = new JSONObject();
val_obj_2= val_arr.getJSONObject(2);
ans.setWidth(val_obj_2.getFloat("width"));
JSONObject val_obj_3 = new JSONObject();
val_obj_3= val_arr.getJSONObject(3);
ans.setLength(val_obj_3.getFloat("length"));
JSONObject val_obj_4 = new JSONObject();
val_obj_4= val_arr.getJSONObject(4);
ans.setHeight(val_obj_4.getFloat("height"));
JSONObject val_obj_5 = new JSONObject();
val_obj_5= val_arr.getJSONObject(5);
JSONArray list_arr_5 = new JSONArray();
list_arr_5=val_obj_5.getJSONArray("animals");
for(int i=0;i<list_arr_5.length();i++){
ans.addAnimals(Animal_helper(list_arr_5.getJSONObject(i),objmap));
}
JSONObject val_obj_6 = new JSONObject();
val_obj_6= val_arr.getJSONObject(6);
ans.setSignText(val_obj_6.getString("signText"));
return ans;
}
}


public static Animal readAnimal(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Animal_helper(js,objmap);
}

public static Animal Animal_helper(JSONObject js, HashMap<Integer, Object> objmap){
Animal ans = new Animal();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Animal)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setMyName(val_obj_0.getString("myName"));
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
ans.setSpecies(val_obj_1.getString("species"));
JSONObject val_obj_2 = new JSONObject();
val_obj_2= val_arr.getJSONObject(2);
ans.setAge(val_obj_2.getInt("age"));
JSONObject val_obj_3 = new JSONObject();
val_obj_3= val_arr.getJSONObject(3);
JSONArray list_arr_3 = new JSONArray();
list_arr_3=val_obj_3.getJSONArray("foodsByPreference");
for(int i=0;i<list_arr_3.length();i++){
ans.addFoodsByPreference(Food_helper(list_arr_3.getJSONObject(i),objmap));
}
return ans;
}
}


public static Food readFood(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Food_helper(js,objmap);
}

public static Food Food_helper(JSONObject js, HashMap<Integer, Object> objmap){
Food ans = new Food();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Food)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setFoodName(val_obj_0.getString("foodName"));
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
ans.setIsMeat(val_obj_1.getBoolean("isMeat"));
return ans;
}
}


}
