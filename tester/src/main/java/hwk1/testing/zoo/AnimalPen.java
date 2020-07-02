package hwk1.testing.zoo;
import java.util.*;
import org.json.*;

public class AnimalPen{

private float xloc;
private float yloc;
private float width;
private float length;
private float height;
private ArrayList<Animal> animals;
private String signText;

public AnimalPen (){
this.animals = new ArrayList<Animal>();
}

public float getXloc(){
return xloc;
}
public void setXloc(float xloc){
this.xloc=xloc;
}

public float getYloc(){
return yloc;
}
public void setYloc(float yloc){
this.yloc=yloc;
}

public float getWidth(){
return width;
}
public void setWidth(float width){
this.width=width;
}

public float getLength(){
return length;
}
public void setLength(float length){
this.length=length;
}

public float getHeight(){
return height;
}
public void setHeight(float height){
this.height=height;
}

public int numAnimals(){
return animals.size();
}
public void addAnimals(Animal n){
animals.add(n);
}
public Animal getAnimals(int index){
return animals.get(index);
}
public void setAnimals(int index, Animal n){
animals.set(index,n);
}

public String getSignText(){
return signText;
}
public void setSignText(String signText){
this.signText=signText;
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
ans.put("type","AnimalPen");
JSONArray myarray = new JSONArray();
ans.put("values",myarray);
JSONObject js_0 = new JSONObject();
js_0.put("xloc",this.xloc);
myarray.put(js_0);
JSONObject js_1 = new JSONObject();
js_1.put("yloc",this.yloc);
myarray.put(js_1);
JSONObject js_2 = new JSONObject();
js_2.put("width",this.width);
myarray.put(js_2);
JSONObject js_3 = new JSONObject();
js_3.put("length",this.length);
myarray.put(js_3);
JSONObject js_4 = new JSONObject();
js_4.put("height",this.height);
myarray.put(js_4);
JSONArray fieldarray = new JSONArray();
for(int i=0;i<animals.size();i++){
fieldarray.put(animals.get(i).Helper(objectmap));
}
JSONObject js_5 = new JSONObject();
js_5.put("animals",fieldarray);
myarray.put(js_5);
JSONObject js_6 = new JSONObject();
js_6.put("signText",this.signText);
myarray.put(js_6);
}
return ans;
}

}
