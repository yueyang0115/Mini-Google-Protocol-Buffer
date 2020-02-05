package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public class ClassGenerator {
  private String classname;
  private ArrayList<OneField> fieldlist;
  private StringBuilder classcontent;

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
        .append("{\n\n");
    constructorcontent.append("public " + classname + " (){\n"); // public Course(){

    for (int i = 0; i < fieldlist.size(); i++) {
      FieldGenerator myfield = new FieldGenerator(fieldlist.get(i));
      fieldcontent.append(myfield.GetField());
      constructorcontent.append(myfield.GetConstructor());
      methodcontent.append(myfield.GetMethod()).append("\n");
    }

    classcontent.append(fieldcontent + "\n");
    constructorcontent.append("}\n\n"); //}
    classcontent.append(constructorcontent);
    classcontent.append(methodcontent);
    JsonGenerator jsgenerator = new JsonGenerator(this.classname, this.fieldlist);
    classcontent.append(jsgenerator.getToJSON());
    classcontent.append("}\n");
  }

  public String GetClass() {
    return classcontent.toString();
  }
}
