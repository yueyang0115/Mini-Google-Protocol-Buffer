package hwk1.testing.nameref;
import java.util.*;
import org.json.*;

public class Faculty{

private String name;
private ArrayList<Course> courses;

public Faculty (){
this.courses = new ArrayList<Course>();
}

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}

public int numCourses(){
return courses.size();
}
public void addCourses(Course n){
courses.add(n);
}
public Course getCourses(int index){
return courses.get(index);
}
public void setCourses(int index, Course n){
courses.set(index,n);
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
ans.put("type","Faculty");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONObject js_0 = new JSONObject();
js_0.put("name",this.name);
myarray.put(js_0);
JSONArray fieldarray = new JSONArray();
for(int i=0;i<courses.size();i++){
fieldarray.put(courses.get(i).Helper(objectmap));
}
JSONObject js_1 = new JSONObject();
js_1.put("courses",fieldarray);
myarray.put(js_1);
}
return ans;
}

}
