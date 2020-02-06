package edu.duke.ece651.classbuilder;
import java.util.*;
import org.json.*;

public class Deserializer{

public static Grade readGrade(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Grade_helper(js,objmap);
}

public static Grade Grade_helper(JSONObject js, HashMap<Integer, Object> objmap){
Grade ans = new Grade();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Grade)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = js.optJSONArray("values");
JSONObject val_obj_0 = val_arr.getJSONObject(0);
ans.setPeople(People_helper((JSONObject)val_obj_0.opt("people"),objmap));
JSONObject val_obj_1 = val_arr.getJSONObject(1);
ans.setStudent(val_obj_1.getString("student"));
JSONObject val_obj_2 = val_arr.getJSONObject(2);
ans.setGrade(val_obj_2.getDouble("grade"));
return ans;
}
}


public static People readPeople(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return People_helper(js,objmap);
}

public static People People_helper(JSONObject js, HashMap<Integer, Object> objmap){
People ans = new People();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (People)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = js.optJSONArray("values");
JSONObject val_obj_0 = val_arr.getJSONObject(0);
ans.setAge(val_obj_0.getInt("age"));
JSONObject val_obj_1 = val_arr.getJSONObject(1);
ans.setGrade(Grade_helper((JSONObject)val_obj_1.opt("grade"),objmap));
return ans;
}
}


}
