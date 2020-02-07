package edu.duke.ece651.classbuilder;

import java.util.ArrayList;

public class Deserialization {
  private String classname;
  private ArrayList<OneField> fieldlist;
  private StringBuilder content;

  public Deserialization(String myname, ArrayList<OneField> mylist) {
    this.classname = myname;
    this.fieldlist = mylist;
    this.content = new StringBuilder();
    Deserialize();
  }

  private void Deserialize() {
    content
        .append("public static " + this.classname + " read" + this.classname
            + "(JSONObject js) throws JSONException{\n")
        .append("HashMap<Integer,Object> objmap = new HashMap<Integer,Object>();\n")
        .append("return " + this.classname + "_helper(js,objmap);\n")
        .append("}\n\n")
        .append("public static " + this.classname + " " + this.classname
            + "_helper(JSONObject js, HashMap<Integer, Object> objmap){\n")
        .append(this.classname + " ans = new " + this.classname + "();\n")
        .append("int id = js.optInt(\"id\");\n")
        .append("if(id==0){\n")
        .append("id=js.optInt(\"ref\");\n")
        .append("}\n")
        .append("if(objmap.containsKey(id)){\n")
        .append("return (" + this.classname + ")objmap.get(id);\n")
        .append("}\n")
        .append("else{\n")
        .append("objmap.put(id,ans);\n")
        .append("JSONArray val_arr = new JSONArray();\n")
        .append("val_arr=js.optJSONArray(\"values\");\n");
    WapperMap wraper = new WapperMap();
    for (int i = 0; i < fieldlist.size(); i++) {
      String fieldname = fieldlist.get(i).getName();
      String fieldName = new Capitalizer(fieldname).ToCapitalize();
      String fieldtype = fieldlist.get(i).getType();
      int dimension = fieldlist.get(i).getDimension();

      if (dimension == 0) {
        content.append("JSONObject val_obj_" + i + " = new JSONObject();\n")
            .append("val_obj_" + i + "= val_arr.getJSONObject(" + i + ");\n");
        if (!wraper.getWapper(fieldtype).equals("None")) {
          if (fieldtype.equals("byte") || fieldtype.equals("char")) {
            content.append("ans.set" + fieldName + "((" + fieldtype + ")val_obj_" + i + ".getInt(\""
                + fieldname + "\"));\n");
          } else if (fieldtype.equals("short")) {
            content.append("ans.set" + fieldName + "((" + fieldtype + ")val_obj_" + i + ".getInt(\""
                + fieldname + "\"));\n");
          } else {
            String fieldType = new Capitalizer(fieldtype).ToCapitalize();
            content.append("ans.set" + fieldName + "(val_obj_" + i + ".get" + fieldType + "(\""
                + fieldname + "\"));\n");
          }
        } else {
          content.append("ans.set" + fieldName + "(" + fieldtype + "_helper((JSONObject)val_obj_"
              + i + ".opt(\"" + fieldname + "\"),objmap));\n");
        }
      } else { // array

        content.append("JSONObject val_obj_" + i + " = new JSONObject();\n")
            .append("val_obj_" + i + "= val_arr.getJSONObject(" + i
                + ");\n"); // this object is json array {field:value}
        content.append("JSONArray list_arr_" + i + " = new JSONArray();\n");
        content.append(
            "list_arr_" + i + "=val_obj_" + i + ".getJSONArray(\"" + fieldname + "\");\n");
        content.append("for(int i=0;i<list_arr_" + i + ".length();i++){\n");
        content.append("ans.add" + fieldName + "(" + fieldtype + "_helper("
            + "list_arr_" + i + ".getJSONObject(i),objmap));\n");
        content.append("}\n");
      }
    }
    content.append("return ans;\n").append("}\n}\n\n");
  }

  public String getCode() {
    return content.toString();
  }
}
