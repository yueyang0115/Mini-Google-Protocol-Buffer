package hwk1.testing.arr;
import java.util.*;
import org.json.*;

public class Grade{

private Course course;
private String student;
private double grade;

public Grade (){
}

public Course getCourse(){
return course;
}
public void setCourse(Course course){
this.course=course;
}

public String getStudent(){
return student;
}
public void setStudent(String student){
this.student=student;
}

public double getGrade(){
return grade;
}
public void setGrade(double grade){
this.grade=grade;
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
ans.put("type","Grade");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONObject js_0 = new JSONObject();
js_0.put("course",course.Helper(objectmap));
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("student",this.student);
myarray.put(js_1);
JSONObject js_2 = new JSONObject();
js_2.put("grade",this.grade);
myarray.put(js_2);
}
return ans;
}

}
