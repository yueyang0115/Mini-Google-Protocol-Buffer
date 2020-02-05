import java.util.*;
import org.json.*;

public class Matrix3d{
private ArrayList<Collection<Collection<Integer>>> data;
public null (){
this.data = new ArrayList<>();
}

public int numDatas(){
return data.length;
}
public void addDatas(Collection<Collection<Integer>> n){
data.add(n);
}
public Collection<Collection<Integer>> getDatas(int index){
return data.get(index);
}
public void setDatas(int index, Collection<Collection<Integer>> n){
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
objectmap.put(this,objectmap.size()+1);
ans.put("id",objectmap.size());
ans.put("type",Matrix3d);
JSONArray myarray = new JSONArray();
JSONObject js_0 = new JSONObject();
js_0.put("data",this.data);
myarray.put(js_0);
ans.put("values",myarray);
}
return ans;
}

}
