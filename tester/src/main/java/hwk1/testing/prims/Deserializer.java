package hwk1.testing.prims;
import java.util.*;
import org.json.*;

public class Deserializer{

public static Prims readPrims(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Prims_helper(js,objmap);
}

public static Prims Prims_helper(JSONObject js, HashMap<Integer, Object> objmap){
Prims ans = new Prims();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Prims)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setX(val_obj_0.getInt("x"));
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
ans.setIsAwesome(val_obj_1.getBoolean("isAwesome"));
JSONObject val_obj_2 = new JSONObject();
val_obj_2= val_arr.getJSONObject(2);
ans.setAteBits((byte)val_obj_2.getInt("ateBits"));
JSONObject val_obj_3 = new JSONObject();
val_obj_3= val_arr.getJSONObject(3);
ans.setBoat(val_obj_3.getFloat("boat"));
JSONObject val_obj_4 = new JSONObject();
val_obj_4= val_arr.getJSONObject(4);
ans.setTrouble(val_obj_4.getDouble("trouble"));
JSONObject val_obj_5 = new JSONObject();
val_obj_5= val_arr.getJSONObject(5);
ans.setIsntPronouncedLikeCare((char)val_obj_5.getInt("isntPronouncedLikeCare"));
JSONObject val_obj_6 = new JSONObject();
val_obj_6= val_arr.getJSONObject(6);
ans.setWaysAway(val_obj_6.getLong("waysAway"));
JSONObject val_obj_7 = new JSONObject();
val_obj_7= val_arr.getJSONObject(7);
ans.setStackOfPancakes((short)val_obj_7.getInt("stackOfPancakes"));
return ans;
}
}


}
