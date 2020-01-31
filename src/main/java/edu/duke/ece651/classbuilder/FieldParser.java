package edu.duke.ece651.classbuilder;

import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class FieldParser {
  private JSONArray fieldarray;
  private LinkedHashMap<String, String> fieldmap;

  public FieldParser(JSONArray myarray) {
    this.fieldarray = myarray;
    this.fieldmap = new LinkedHashMap<String, String>();
    ParseField();
  }

  private void ParseField() {
    for (int i = 0; i < fieldarray.length(); i++) {
      JSONObject onefield = fieldarray.optJSONObject(i);

      String name = onefield.optString("name");
      String type = onefield.optString("type");
      this.fieldmap.put(name, type);
    }
  }

  public LinkedHashMap<String, String> getFieldmap() {
    return this.fieldmap;
  }
}
