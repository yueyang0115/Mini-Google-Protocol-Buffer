package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class ClassParser {
  private JSONArray classarray;
  private LinkedHashMap<String, ArrayList<OneField>> classmap;

  public ClassParser(JSONArray myarray) {
    this.classarray = myarray;
    this.classmap = new LinkedHashMap<String, ArrayList<OneField>>();
    ParseClass();
  }

  private void ParseClass() {
    for (int i = 0; i < classarray.length(); i++) {
      JSONObject oneclass = classarray.getJSONObject(i);

      String classname = oneclass.optString("name");
      JSONArray fieldarray = oneclass.optJSONArray("fields");
      if (fieldarray != null) {
        FieldParser myfield = new FieldParser(fieldarray);
        this.classmap.put(classname, myfield.getFieldlist());
      } else {
        this.classmap.put(classname, null);
      }
    }
  }

  public LinkedHashMap<String, ArrayList<OneField>> getClassmap() {
    return this.classmap;
  }
}
