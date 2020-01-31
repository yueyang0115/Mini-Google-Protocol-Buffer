package edu.duke.ece651.classbuilder;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class FieldParser {
  private JSONArray fieldarray;
  private HashMap<String, String> fieldmap;

  public FieldParser(JSONArray myarray) {
    this.fieldarray = myarray;
    this.fieldmap = new HashMap<String, String>();
    ParseField();
  }

  private void ParseField() {
    for (int i = 0; i < fieldarray.length(); i++) {
      JSONObject onefield = fieldarray.getJSONObject(i);
      String name = onefield.getString("name");
      String type = onefield.getString("type");
      this.fieldmap.put(name, type);
    }
  }

  public HashMap<String, String> getFieldmap() {
    return this.fieldmap;
  }
}
