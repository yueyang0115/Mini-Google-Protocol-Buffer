package hwk1.testing.empty;
import java.util.*;
import org.json.*;

public class Empty{


public Empty (){
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
ans.put("type","Empty");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
}
return ans;
}

}
