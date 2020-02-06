import java.util.*;
import org.json.*;

public class Deserializer{

public static Matrix3d readMatrix3d(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Matrix3d_helper(js,objmap);
}

public static Matrix3d Matrix3d_helper(JSONObject js, HashMap<Integer, Object> objmap){
Matrix3d ans = new Matrix3d();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Matrix3d)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = js.optJSONArray("values");
JSONObject val_obj_0 = val_arr.getJSONObject(0);
ans.setData((int)val_obj_0.opt("data"));
return ans;
}
}


}
