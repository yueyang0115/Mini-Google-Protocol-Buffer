package hwk1.testing.crazyarray;
import java.util.*;
import org.json.*;

public class Deserializer{

public static LotsOfArray readLotsOfArray(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return LotsOfArray_helper(js,objmap);
}

public static LotsOfArray LotsOfArray_helper(JSONObject js, HashMap<Integer, Object> objmap){
LotsOfArray ans = new LotsOfArray();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (LotsOfArray)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
for(int i =0;i<val_obj_0.getJSONArray("x").length();i++){
ans.addX(val_obj_0.getJSONArray("x").getInt(i));
}
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
for(int i =0;i<val_obj_1.getJSONArray("isAwesome").length();i++){
ans.addIsAwesome(val_obj_1.getJSONArray("isAwesome").getInt(i));
}
JSONObject val_obj_2 = new JSONObject();
val_obj_2= val_arr.getJSONObject(2);
for(int i =0;i<val_obj_2.getJSONArray("ateBits").length();i++){
ans.addAteBits(val_obj_2.getJSONArray("ateBits").getInt(i));
}
JSONObject val_obj_3 = new JSONObject();
val_obj_3= val_arr.getJSONObject(3);
for(int i =0;i<val_obj_3.getJSONArray("boat").length();i++){
ans.addBoat(val_obj_3.getJSONArray("boat").getInt(i));
}
JSONObject val_obj_4 = new JSONObject();
val_obj_4= val_arr.getJSONObject(4);
for(int i =0;i<val_obj_4.getJSONArray("trouble").length();i++){
ans.addTrouble(val_obj_4.getJSONArray("trouble").getInt(i));
}
JSONObject val_obj_5 = new JSONObject();
val_obj_5= val_arr.getJSONObject(5);
for(int i =0;i<val_obj_5.getJSONArray("isntPronouncedLikeCare").length();i++){
ans.addIsntPronouncedLikeCare(val_obj_5.getJSONArray("isntPronouncedLikeCare").getInt(i));
}
JSONObject val_obj_6 = new JSONObject();
val_obj_6= val_arr.getJSONObject(6);
for(int i =0;i<val_obj_6.getJSONArray("waysAway").length();i++){
ans.addWaysAway(val_obj_6.getJSONArray("waysAway").getInt(i));
}
JSONObject val_obj_7 = new JSONObject();
val_obj_7= val_arr.getJSONObject(7);
for(int i =0;i<val_obj_7.getJSONArray("stackOfPancakes").length();i++){
ans.addStackOfPancakes(val_obj_7.getJSONArray("stackOfPancakes").getInt(i));
}
return ans;
}
}


}
