package hwk1.testing.simple;
import java.util.*;
import org.json.*;

public class Test{

private int x;

public Test (){
}

public int getX(){
return x;
}
public void setX(int x){
this.x=x;
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
JSONObject js_0 = new JSONObject();
js_0.put("x",this.x);
myarray.put(js_0);
}
return ans;
}

}
