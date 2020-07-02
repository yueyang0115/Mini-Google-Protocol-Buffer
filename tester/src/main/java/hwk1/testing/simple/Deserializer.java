package hwk1.testing.simple;
import java.util.*;
import org.json.*;

public class Deserializer{

public static Test readTest(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Test_helper(js,objmap);
}

public static Test Test_helper(JSONObject js, HashMap<Integer, Object> objmap){
Test ans = new Test();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Test)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setX(val_obj_0.getInt("x"));
return ans;
}
}


}
