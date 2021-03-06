package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class Parser {
  private JSONObject json_object;
  private String pack;
  private LinkedHashMap<String, ArrayList<OneField>> classmap;

  public Parser(JSONObject myobject) {
    this.json_object = myobject;
    this.pack = json_object.optString("package");
    this.classmap = new LinkedHashMap<String, ArrayList<OneField>>();
    generateClassMap();
  }

  private void generateClassMap() {
    JSONArray classarray = json_object.optJSONArray("classes");
    ClassParser myparser = new ClassParser(classarray);
    this.classmap = myparser.getClassmap();
  }

  public String getPack() {
    return this.pack;
  }

  public LinkedHashMap<String, ArrayList<OneField>> getClassmap() {
    return this.classmap;
  }
}
