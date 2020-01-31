package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParser {
  private JSONObject json_object;
  private ArrayList<HashMap<String, HashMap<String, String>>> classlist;
  public JsonParser(JSONObject myobject) {
    this.json_object = myobject;
    this.classlist = null;
  }

  /*
  private void ParseJson() {
    JSONArray classarray = json_object.getJSONArray("classes");
    for (int i = 0; i < classarray.length(); i++) {
      JSONObject oneclass = classarray.getJSONObject(i);
      HashMap<String, HashMap<String, String>> classmap = ClassParser(oneclass).getclassmap();
      classlist.add(classmap);
    }
  }
  */
}
