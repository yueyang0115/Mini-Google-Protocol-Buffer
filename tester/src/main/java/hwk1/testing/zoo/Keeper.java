package hwk1.testing.zoo;
import java.util.*;
import org.json.*;

public class Keeper{

private String firstName;
private String lastName;
private double salary;
private ArrayList<AnimalPen> myPens;

public Keeper (){
this.myPens = new ArrayList<AnimalPen>();
}

public String getFirstName(){
return firstName;
}
public void setFirstName(String firstName){
this.firstName=firstName;
}

public String getLastName(){
return lastName;
}
public void setLastName(String lastName){
this.lastName=lastName;
}

public double getSalary(){
return salary;
}
public void setSalary(double salary){
this.salary=salary;
}

public int numMyPens(){
return myPens.size();
}
public void addMyPens(AnimalPen n){
myPens.add(n);
}
public AnimalPen getMyPens(int index){
return myPens.get(index);
}
public void setMyPens(int index, AnimalPen n){
myPens.set(index,n);
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
ans.put("type","Keeper");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONObject js_0 = new JSONObject();
js_0.put("firstName",this.firstName);
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("lastName",this.lastName);
myarray.put(js_1);
JSONObject js_2 = new JSONObject();
js_2.put("salary",this.salary);
myarray.put(js_2);
JSONArray fieldarray = new JSONArray();
for(int i=0;i<myPens.size();i++){
fieldarray.put(myPens.get(i).Helper(objectmap));
}
JSONObject js_3 = new JSONObject();
js_3.put("myPens",fieldarray);
myarray.put(js_3);
}
return ans;
}

}
