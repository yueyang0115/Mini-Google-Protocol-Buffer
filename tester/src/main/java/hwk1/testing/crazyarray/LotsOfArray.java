package hwk1.testing.crazyarray;
import java.util.*;
import org.json.*;

public class LotsOfArray{

private ArrayList<Integer> x;
private ArrayList<Collection<Boolean>> isAwesome;
private ArrayList<Collection<Collection<Byte>>> ateBits;
private ArrayList<Collection<Collection<Collection<Float>>>> boat;
private ArrayList<Double> trouble;
private ArrayList<Collection<Character>> isntPronouncedLikeCare;
private ArrayList<Long> waysAway;
private ArrayList<Collection<Short>> stackOfPancakes;

public LotsOfArray (){
this.x = new ArrayList<Integer>();
this.isAwesome = new ArrayList<Collection<Boolean>>();
this.ateBits = new ArrayList<Collection<Collection<Byte>>>();
this.boat = new ArrayList<Collection<Collection<Collection<Float>>>>();
this.trouble = new ArrayList<Double>();
this.isntPronouncedLikeCare = new ArrayList<Collection<Character>>();
this.waysAway = new ArrayList<Long>();
this.stackOfPancakes = new ArrayList<Collection<Short>>();
}

public int numX(){
return x.size();
}
public void addX(int n){
x.add(n);
}
public int getX(int index){
return x.get(index);
}
public void setX(int index, int n){
x.set(index,n);
}

public int numIsAwesome(){
return isAwesome.size();
}
public void addIsAwesome(Collection<Boolean> n){
isAwesome.add(n);
}
public Collection<Boolean> getIsAwesome(int index){
return isAwesome.get(index);
}
public void setIsAwesome(int index, Collection<Boolean> n){
isAwesome.set(index,n);
}

public int numAteBits(){
return ateBits.size();
}
public void addAteBits(Collection<Collection<Byte>> n){
ateBits.add(n);
}
public Collection<Collection<Byte>> getAteBits(int index){
return ateBits.get(index);
}
public void setAteBits(int index, Collection<Collection<Byte>> n){
ateBits.set(index,n);
}

public int numBoat(){
return boat.size();
}
public void addBoat(Collection<Collection<Collection<Float>>> n){
boat.add(n);
}
public Collection<Collection<Collection<Float>>> getBoat(int index){
return boat.get(index);
}
public void setBoat(int index, Collection<Collection<Collection<Float>>> n){
boat.set(index,n);
}

public int numTrouble(){
return trouble.size();
}
public void addTrouble(double n){
trouble.add(n);
}
public double getTrouble(int index){
return trouble.get(index);
}
public void setTrouble(int index, double n){
trouble.set(index,n);
}

public int numIsntPronouncedLikeCare(){
return isntPronouncedLikeCare.size();
}
public void addIsntPronouncedLikeCare(Collection<Character> n){
isntPronouncedLikeCare.add(n);
}
public Collection<Character> getIsntPronouncedLikeCare(int index){
return isntPronouncedLikeCare.get(index);
}
public void setIsntPronouncedLikeCare(int index, Collection<Character> n){
isntPronouncedLikeCare.set(index,n);
}

public int numWaysAway(){
return waysAway.size();
}
public void addWaysAway(long n){
waysAway.add(n);
}
public long getWaysAway(int index){
return waysAway.get(index);
}
public void setWaysAway(int index, long n){
waysAway.set(index,n);
}

public int numStackOfPancakes(){
return stackOfPancakes.size();
}
public void addStackOfPancakes(Collection<Short> n){
stackOfPancakes.add(n);
}
public Collection<Short> getStackOfPancakes(int index){
return stackOfPancakes.get(index);
}
public void setStackOfPancakes(int index, Collection<Short> n){
stackOfPancakes.set(index,n);
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
ans.put("type","LotsOfArray");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_0 = new JSONObject();
js_0.put("x",this.x);
fieldarray.put(js_0);
ans.put("values",fieldarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_1 = new JSONObject();
js_1.put("isAwesome",this.isAwesome);
fieldarray.put(js_1);
ans.put("values",fieldarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_2 = new JSONObject();
js_2.put("ateBits",this.ateBits);
fieldarray.put(js_2);
ans.put("values",fieldarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_3 = new JSONObject();
js_3.put("boat",this.boat);
fieldarray.put(js_3);
ans.put("values",fieldarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_4 = new JSONObject();
js_4.put("trouble",this.trouble);
fieldarray.put(js_4);
ans.put("values",fieldarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_5 = new JSONObject();
js_5.put("isntPronouncedLikeCare",this.isntPronouncedLikeCare);
fieldarray.put(js_5);
ans.put("values",fieldarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_6 = new JSONObject();
js_6.put("waysAway",this.waysAway);
fieldarray.put(js_6);
ans.put("values",fieldarray);
JSONArray fieldarray = new JSONArray();
JSONObject js_7 = new JSONObject();
js_7.put("stackOfPancakes",this.stackOfPancakes);
fieldarray.put(js_7);
ans.put("values",fieldarray);
}
return ans;
}

}
