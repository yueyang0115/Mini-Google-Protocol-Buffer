package edu.duke.ece651.classbuilder;

import java.util.HashMap;
import org.json.JSONObject;

public class ClassParser {
  private JSONObject json_object;

  private HashMap<String, HashMap<String, String>> classmap;
  private HashMap<String, String> fieldmap;

  public ClassParser(JSONObject myobject) {
    this.json_object = myobject;
  }
}
