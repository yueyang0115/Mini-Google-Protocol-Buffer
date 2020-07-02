package hwk1.testing.zoo;
import java.util.*;
import org.json.*;

public class Food{

private String foodName;
private boolean isMeat;

public Food (){
}

public String getFoodName(){
return foodName;
}
public void setFoodName(String foodName){
this.foodName=foodName;
}

public boolean getIsMeat(){
return isMeat;
}
public void setIsMeat(boolean isMeat){
this.isMeat=isMeat;
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
ans.put("type","Food");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONObject js_0 = new JSONObject();
js_0.put("foodName",this.foodName);
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("isMeat",this.isMeat);
myarray.put(js_1);
}
return ans;
}

}
