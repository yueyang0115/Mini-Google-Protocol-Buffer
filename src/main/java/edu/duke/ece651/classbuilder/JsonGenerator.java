package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public class JsonGenerator {
  private String classname;
  private ArrayList<OneField> fieldlist;
  private StringBuilder content;

  public JsonGenerator(String name, ArrayList<OneField> mylist) {
    this.fieldlist = mylist;
    this.classname = name;
    this.content = new StringBuilder();
    GenerateToJson();
  }

  private void GenerateToJson() {
    content.append("public JSONObject toJSON() throws JSONException{\n")
        .append("HashMap<Object,Integer> objectmap = new HashMap<Object,Integer>();\n")
        .append("return Helper(objectmap);\n")
        .append("}\n\n")
        .append("public JSONObject Helper(HashMap<Object,Integer> objectmap){\n")
        .append("JSONObject ans = new JSONObject();\n")
        .append("if(objectmap.containsKey(this)){\n")
        .append("ans.put(\"ref\",objectmap.get(this));\n")
        .append("}\n")
        .append("else{\n")
        .append("objectmap.put(this,objectmap.size()+1);\n")
        .append("ans.put(\"id\",objectmap.size());\n")
        .append("ans.put(\"type\"," + this.classname + ");\n")
        .append("JSONArray myarray = new JSONArray();\n");

    WapperMap mywapper = new WapperMap();
    for (int i = 0; i < fieldlist.size(); i++) {
      String name = fieldlist.get(i).getName();
      String type = fieldlist.get(i).getType();
      content.append("JSONObject js_" + i + " = new JSONObject();\n")
          .append("js_" + i + ".put(\"" + name + "\",");
      if (mywapper.getWapper(type) != "None") {
        content.append("this." + name + ");\n");
      } else {
        content.append(name + ".Helper(objectmap));\n");
      }

      content.append("myarray.put(js_" + i + ");\n");
    }
    content.append("ans.put(\"values\",myarray);\n")
        .append("}\n")
        .append("return ans;\n")
        .append("}\n\n");
  }

  public String getToJSON() {
    return content.toString();
  }
}
