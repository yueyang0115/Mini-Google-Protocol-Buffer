package hwk1.testing.zoo;
import java.util.*;
import org.json.*;

public class Animal{

private String myName;
private String species;
private int age;
private ArrayList<Collection<Food>> foodsByPreference;

public Animal (){
this.foodsByPreference = new ArrayList<Collection<Food>>();
}

public String getMyName(){
return myName;
}
public void setMyName(String myName){
this.myName=myName;
}

public String getSpecies(){
return species;
}
public void setSpecies(String species){
this.species=species;
}

public int getAge(){
return age;
}
public void setAge(int age){
this.age=age;
}

public int numFoodsByPreference(){
return foodsByPreference.size();
}
public void addFoodsByPreference(Collection<Food> n){
foodsByPreference.add(n);
}
public Collection<Food> getFoodsByPreference(int index){
return foodsByPreference.get(index);
}
public void setFoodsByPreference(int index, Collection<Food> n){
foodsByPreference.set(index,n);
}

public JSONObject toJSON() throws JSONException{
HashMap<Object,Integer> objectmap = new HashMap<Object,Integer>();
return Helper(objectmap);
}

public JSONObject Helper(HashMap<Object,Integer> objectmap){
JSONObject ans = new JSONObject();
if(objectmap.containsKey(this)){
ans.put("ref",objectmap.get(this));
}
else{
ans.put("id",objectmap.size()+1);
objectmap.put(this,objectmap.size()+1);
ans.put("type","Animal");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONObject js_0 = new JSONObject();
js_0.put("myName",this.myName);
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("species",this.species);
myarray.put(js_1);
JSONObject js_2 = new JSONObject();
js_2.put("age",this.age);
myarray.put(js_2);
JSONArray fieldarray = new JSONArray();
for(int i=0;i<foodsByPreference.size();i++){
fieldarray.put(foodsByPreference.get(i).Helper(objectmap));
}
JSONObject js_3 = new JSONObject();
js_3.put("foodsByPreference",fieldarray);
myarray.put(js_3);
}
return ans;
}

}
