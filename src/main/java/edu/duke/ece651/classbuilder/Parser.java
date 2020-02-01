package edu.duke.ece651.classbuilder;

import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class Parser {
  private JSONObject json_object;
  private String pack;
  private LinkedHashMap<String, LinkedHashMap<String, String>> classmap;

  public Parser(JSONObject myobject) {
    this.json_object = myobject;
    this.pack = json_object.optString("package");
    this.classmap = new LinkedHashMap<String, LinkedHashMap<String, String>>();
    generateClassMap();
    ;
  }

  private void generateClassMap() {
    // System.out.println("generate classarray\n");
    JSONArray classarray = json_object.optJSONArray("classes");
    ClassParser myparser = new ClassParser(classarray);
    this.classmap = myparser.getClassmap();
  }

  public String getPack() {
    return this.pack;
  }

  public LinkedHashMap<String, LinkedHashMap<String, String>> getClassmap() {
    return this.classmap;
  }
}
