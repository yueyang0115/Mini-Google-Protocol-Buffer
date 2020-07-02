package hwk1.testing.prims;
import java.util.*;
import org.json.*;

public class Prims{

private int x;
private boolean isAwesome;
private byte ateBits;
private float boat;
private double trouble;
private char isntPronouncedLikeCare;
private long waysAway;
private short stackOfPancakes;

public Prims (){
}

public int getX(){
return x;
}
public void setX(int x){
this.x=x;
}

public boolean getIsAwesome(){
return isAwesome;
}
public void setIsAwesome(boolean isAwesome){
this.isAwesome=isAwesome;
}

public byte getAteBits(){
return ateBits;
}
public void setAteBits(byte ateBits){
this.ateBits=ateBits;
}

public float getBoat(){
return boat;
}
public void setBoat(float boat){
this.boat=boat;
}

public double getTrouble(){
return trouble;
}
public void setTrouble(double trouble){
this.trouble=trouble;
}

public char getIsntPronouncedLikeCare(){
return isntPronouncedLikeCare;
}
public void setIsntPronouncedLikeCare(char isntPronouncedLikeCare){
this.isntPronouncedLikeCare=isntPronouncedLikeCare;
}

public long getWaysAway(){
return waysAway;
}
public void setWaysAway(long waysAway){
this.waysAway=waysAway;
}

public short getStackOfPancakes(){
return stackOfPancakes;
}
public void setStackOfPancakes(short stackOfPancakes){
this.stackOfPancakes=stackOfPancakes;
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
ans.put("type","Prims");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONObject js_0 = new JSONObject();
js_0.put("x",this.x);
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("isAwesome",this.isAwesome);
myarray.put(js_1);
JSONObject js_2 = new JSONObject();
js_2.put("ateBits",this.ateBits);
myarray.put(js_2);
JSONObject js_3 = new JSONObject();
js_3.put("boat",this.boat);
myarray.put(js_3);
JSONObject js_4 = new JSONObject();
js_4.put("trouble",this.trouble);
myarray.put(js_4);
JSONObject js_5 = new JSONObject();
js_5.put("isntPronouncedLikeCare",this.isntPronouncedLikeCare);
myarray.put(js_5);
JSONObject js_6 = new JSONObject();
js_6.put("waysAway",this.waysAway);
myarray.put(js_6);
JSONObject js_7 = new JSONObject();
js_7.put("stackOfPancakes",this.stackOfPancakes);
myarray.put(js_7);
}
return ans;
}

}
