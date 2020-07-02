package hwk1.testing.arr;
import java.util.*;
import org.json.*;

public class Faculty{

private String name;
private ArrayList<Course> taught;

public Faculty (){
this.taught = new ArrayList<Course>();
}

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}

public int numTaught(){
return taught.size();
}
public void addTaught(Course n){
taught.add(n);
}
public Course getTaught(int index){
return taught.get(index);
}
public void setTaught(int index, Course n){
taught.set(index,n);
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
for(int i=0;i<taught.size();i++){
fieldarray.put(taught.get(i).Helper(objectmap));
}
JSONObject js_1 = new JSONObject();
js_1.put("taught",fieldarray);
myarray.put(js_1);
}
return ans;
}

}
