package hwk1.testing.empty;
import java.util.*;
import org.json.*;

public class Deserializer{

public static Empty readEmpty(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Empty_helper(js,objmap);
}

public static Empty Empty_helper(JSONObject js, HashMap<Integer, Object> objmap){
Empty ans = new Empty();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Empty)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
return ans;
}
}


}
