package hwk1.testing.arr;
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
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setInstructor(Faculty_helper((JSONObject)val_obj_0.opt("instructor"),objmap));
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
ans.setNumStudents(val_obj_1.getInt("numStudents"));
JSONObject val_obj_2 = new JSONObject();
val_obj_2= val_arr.getJSONObject(2);
JSONArray list_arr_2 = new JSONArray();
list_arr_2=val_obj_2.getJSONArray("grades");
for(int i=0;i<list_arr_2.length();i++){
ans.addGrades(Grade_helper(list_arr_2.getJSONObject(i),objmap));
}
return ans;
}
}


public static Office readOffice(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Office_helper(js,objmap);
}

public static Office Office_helper(JSONObject js, HashMap<Integer, Object> objmap){
Office ans = new Office();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Office)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setOccupant(Faculty_helper((JSONObject)val_obj_0.opt("occupant"),objmap));
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
ans.setNumber(val_obj_1.getInt("number"));
JSONObject val_obj_2 = new JSONObject();
val_obj_2= val_arr.getJSONObject(2);
ans.setBuilding(val_obj_2.getString("building"));
return ans;
}
}


public static Faculty readFaculty(JSONObject js) throws JSONException{
HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();
return Faculty_helper(js,objmap);
}

public static Faculty Faculty_helper(JSONObject js, HashMap<Integer, Object> objmap){
Faculty ans = new Faculty();
int id = js.optInt("id");
if(id==0){
id=js.optInt("ref");
}
if(objmap.containsKey(id)){
return (Faculty)objmap.get(id);
}
else{
objmap.put(id,ans);
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setName(val_obj_0.getString("name"));
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
JSONArray list_arr_1 = new JSONArray();
list_arr_1=val_obj_1.getJSONArray("taught");
for(int i=0;i<list_arr_1.length();i++){
ans.addTaught(Course_helper(list_arr_1.getJSONObject(i),objmap));
}
return ans;
}
}


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
JSONArray val_arr = new JSONArray();
val_arr=js.optJSONArray("values");
JSONObject val_obj_0 = new JSONObject();
val_obj_0= val_arr.getJSONObject(0);
ans.setCourse(Course_helper((JSONObject)val_obj_0.opt("course"),objmap));
JSONObject val_obj_1 = new JSONObject();
val_obj_1= val_arr.getJSONObject(1);
ans.setStudent(val_obj_1.getString("student"));
JSONObject val_obj_2 = new JSONObject();
val_obj_2= val_arr.getJSONObject(2);
ans.setGrade(val_obj_2.getDouble("grade"));
return ans;
}
}


}
