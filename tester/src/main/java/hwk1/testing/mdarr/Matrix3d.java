package hwk1.testing.mdarr;
import java.util.*;
import org.json.*;

public class Matrix3d{

private ArrayList<Collection<Collection<Integer>>> data;

public Matrix3d (){
this.data = new ArrayList<Collection<Collection<Integer>>>();
}

public int numData(){
return data.size();
}
public void addData(Collection<Collection<Integer>> n){
data.add(n);
}
public Collection<Collection<Integer>> getData(int index){
return data.get(index);
}
public void setData(int index, Collection<Collection<Integer>> n){
data.set(index,n);
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
ans.put("type","Matrix3d");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_0 = new JSONObject();
js_0.put("data",this.data);
fieldarray.put(js_0);
ans.put("values",fieldarray);
}
return ans;
}

}
