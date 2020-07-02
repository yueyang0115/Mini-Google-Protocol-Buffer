package hwk1.testing.arr;
import java.util.*;
import org.json.*;

public class Office{

private Faculty occupant;
private int number;
private String building;

public Office (){
}

public Faculty getOccupant(){
return occupant;
}
public void setOccupant(Faculty occupant){
this.occupant=occupant;
}

public int getNumber(){
return number;
}
public void setNumber(int number){
this.number=number;
}

public String getBuilding(){
return building;
}
public void setBuilding(String building){
this.building=building;
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
ans.put("type","Office");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONObject js_0 = new JSONObject();
js_0.put("occupant",occupant.Helper(objectmap));
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("number",this.number);
myarray.put(js_1);
JSONObject js_2 = new JSONObject();
js_2.put("building",this.building);
myarray.put(js_2);
}
return ans;
}

}
