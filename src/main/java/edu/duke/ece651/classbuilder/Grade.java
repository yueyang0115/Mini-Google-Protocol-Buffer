package edu.duke.ece651.classbuilder;
import java.util.*;
import org.json.*;

public class Grade{

private People people;
private String student;
private double grade;

public Grade (){
}

public People getPeople(){
return people;
}
public void setPeople(People people){
this.people=people;
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
ans.put("type","Grade");
JSONArray myarray = new JSONArray();
JSONObject js_0 = new JSONObject();
js_0.put("people",people.Helper(objectmap));
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("student",this.student);
myarray.put(js_1);
JSONObject js_2 = new JSONObject();
js_2.put("grade",this.grade);
myarray.put(js_2);
ans.put("values",myarray);
}
return ans;
}

}
