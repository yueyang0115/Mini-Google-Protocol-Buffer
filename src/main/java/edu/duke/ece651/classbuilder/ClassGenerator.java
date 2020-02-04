package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public class ClassGenerator {
  private String classname;
  // private LinkedHashMap<String, String> fieldmap;
  // private LinkedHashMap<String, JSONObject> fieldmap;
  private ArrayList<OneField> fieldlist;
  private StringBuilder classcontent;

  // public ClassGenerator(String name, LinkedHashMap<String, String> map) {

  public ClassGenerator(String myname, ArrayList<OneField> mylist) {
    this.classname = myname;
    this.fieldlist = mylist;
    this.classcontent = new StringBuilder();
    GenerateClass();
  }

  private void GenerateClass() {
    StringBuilder fieldcontent = new StringBuilder();
    StringBuilder constructorcontent = new StringBuilder();
    StringBuilder methodcontent = new StringBuilder();
    classcontent.append("import java.util.*;\n")
        .append("import org.json.*;\n\n")
        .append("public class ")
        .append(this.classname)
        .append("{\n");
    constructorcontent.append("public ").append(this.classname);
    // for (HashMap.Entry<String, String> entry : fieldmap.entrySet()) {
    for (int i = 0; i < fieldlist.size(); i++) {
      // FieldGenerator myfield = new FieldGenerator(entry.getKey(), entry.getValue());
      FieldGenerator myfield = new FieldGenerator(fieldlist.get(i));
      fieldcontent.append(myfield.GetField()).append("\n");
      constructorcontent.append(myfield.GetConstructor()).append("\n");
      methodcontent.append(myfield.GetMethod()).append("\n");
    }
    classcontent.append(fieldcontent);
    classcontent.append(constructorcontent);
    classcontent.append(methodcontent);
    classcontent.append("}\n");
  }

  public String GetClass() {
    return classcontent.toString();
  }
}
