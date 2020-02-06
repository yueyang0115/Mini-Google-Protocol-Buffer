import java.util.*;
import org.json.*;

public class Course{

private int numStudents;
private Faculty instructor;

public Course (){
}

public int getNumStudents(){
return numStudents;
}
public void setNumStudents(int numStudents){
this.numStudents=numStudents;
}

public Faculty getInstructor(){
return instructor;
}
public void setInstructor(Faculty instructor){
this.instructor=instructor;
}

public JSONObject toJSON() throws JSONException{
System.out.println("going into tojson");
HashMap<Object,Integer> objectmap = new HashMap<Object,Integer>();
return Helper(objectmap);
}

public JSONObject Helper(HashMap<Object,Integer> objectmap){
JSONObject ans = new JSONObject();
System.out.println("object map size:" + objectmap.size());
if(objectmap.containsKey(this)){
ans.put("ref",objectmap.get(this));
}
else{
objectmap.put(this,objectmap.size()+1);
ans.put("id",objectmap.size());
ans.put("type","Course");
JSONArray myarray = new JSONArray();
JSONObject js_0 = new JSONObject();
js_0.put("numStudents",this.numStudents);
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("instructor",instructor.Helper(objectmap));
myarray.put(js_1);
ans.put("values",myarray);
}
return ans;
}

}
