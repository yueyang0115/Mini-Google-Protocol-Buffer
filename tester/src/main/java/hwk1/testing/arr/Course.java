package hwk1.testing.arr;
import java.util.*;
import org.json.*;

public class Course{

private Faculty instructor;
private int numStudents;
private ArrayList<Grade> grades;

public Course (){
this.grades = new ArrayList<Grade>();
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

public int numGrades(){
return grades.size();
}
public void addGrades(Grade n){
grades.add(n);
}
public Grade getGrades(int index){
return grades.get(index);
}
public void setGrades(int index, Grade n){
grades.set(index,n);
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
JSONArray fieldarray = new JSONArray();
for(int i=0;i<grades.size();i++){
fieldarray.put(grades.get(i).Helper(objectmap));
}
JSONObject js_2 = new JSONObject();
js_2.put("grades",fieldarray);
myarray.put(js_2);
}
return ans;
}

}
