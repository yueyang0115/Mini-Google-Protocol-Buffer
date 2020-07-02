package hwk1.testing.simplearray;
import java.util.*;
import org.json.*;

public class Test{

private ArrayList<Integer> arr;

public Test (){
this.arr = new ArrayList<Integer>();
}

public int numArr(){
return arr.size();
}
public void addArr(int n){
arr.add(n);
}
public int getArr(int index){
return arr.get(index);
}
public void setArr(int index, int n){
arr.set(index,n);
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
ans.put("type","Test");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_0 = new JSONObject();
js_0.put("arr",this.arr);
fieldarray.put(js_0);
ans.put("values",fieldarray);
}
return ans;
}

}
