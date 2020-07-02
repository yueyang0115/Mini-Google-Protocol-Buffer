package hwk1.testing.nameref;
import java.util.*;
import org.json.*;

public class Course{

private Faculty instructor;
private int numStudents;

public Course (){
}

public Faculty getInstructor(){
return instructor;
}
public void setInstructor(Faculty instructor){
this.instructor=instructor;
}

public int getNumStudents(){
return numStudents;
}
public void setNumStudents(int numStudents){
this.numStudents=numStudents;
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
ans.put("type","Course");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONObject js_0 = new JSONObject();
js_0.put("instructor",instructor.Helper(objectmap));
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("numStudents",this.numStudents);
myarray.put(js_1);
}
return ans;
}

}
