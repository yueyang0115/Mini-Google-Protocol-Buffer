import java.util.*;
import org.json.*;

public class Deserializer{

public static Course readCourse(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Course_helper(js,objmap);
}

public static Course Course_helper(JSONObject js, HashMap<Integer, Object> objmap){
Course ans = new Course();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Course)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = js.optJSONArray("values");
JSONObject val_obj_0 = val_arr.getJSONObject(0);
ans.setNumStudents(val_obj_0.getInt("numStudents"));
JSONObject val_obj_1 = val_arr.getJSONObject(1);
ans.setInstructor(Instructor_helper((JSONObject)val_obj_1.opt("instructor"),objmap));
return ans;
}
}


}
