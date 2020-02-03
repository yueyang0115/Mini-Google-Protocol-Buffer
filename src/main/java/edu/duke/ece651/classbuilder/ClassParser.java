package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class ClassParser {
  private JSONArray classarray;
  // private JSONObject json_object;
  // private LinkedHashMap<String, LinkedHashMap<String, String>> classmap;
  private LinkedHashMap<String, ArrayList<OneField>> classmap;
  // private LinkedHashMap<String, String> fieldmap;

  public ClassParser(JSONArray myarray) {
    this.classarray = myarray;
    this.classmap = new LinkedHashMap<String, ArrayList<OneField>>();
    // this.classmap = new LinkedHashMap<String, LinkedHashMap<String, String>>();
    ParseClass();
  }

  private void ParseClass() {
    // System.out.println("begin parse class\n");
    for (int i = 0; i < classarray.length(); i++) {
      JSONObject oneclass = classarray.getJSONObject(i);

      String classname = oneclass.optString("name");
      JSONArray fieldarray = oneclass.optJSONArray("fields");
      if (fieldarray != null) {
        // System.out.println("fieldarray!=null\n");
        FieldParser myfield = new FieldParser(fieldarray);
        this.classmap.put(classname, myfield.getFieldlist());
      } else {
        // System.out.println("fieldarray==null\n");
        this.classmap.put(classname, null);
      }
    }
  }

  // public LinkedHashMap<String, LinkedHashMap<String, String>> getClassmap() {
  public LinkedHashMap<String, ArrayList<OneField>> getClassmap() {
    return this.classmap;
  }
}
