package edu.duke.ece651.classbuilder;

import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class ClassParser {
  private JSONArray classarray;
  // private JSONObject json_object;
  private LinkedHashMap<String, LinkedHashMap<String, String>> classmap;
  // private LinkedHashMap<String, String> fieldmap;

  public ClassParser(JSONArray myarray) {
    this.classarray = myarray;
    this.classmap = new LinkedHashMap<String, LinkedHashMap<String, String>>();
    ParseClass();
  }

  private void ParseClass() {
    for (int i = 0; i < classarray.length(); i++) {
      JSONObject oneclass = classarray.getJSONObject(i);

      String classname = oneclass.optString("name");
      JSONArray fieldarray = oneclass.optJSONArray("field");
      if (fieldarray != null) {
        FieldParser myfield = new FieldParser(fieldarray);
        this.classmap.put(classname, myfield.getFieldmap());
      } else {
        this.classmap.put(classname, null);
      }
    }
  }

  public LinkedHashMap<String, LinkedHashMap<String, String>> getClassmap() {
    return this.classmap;
  }
}
