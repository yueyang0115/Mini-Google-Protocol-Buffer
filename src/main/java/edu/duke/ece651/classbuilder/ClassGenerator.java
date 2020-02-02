package edu.duke.ece651.classbuilder;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ClassGenerator {
  private String classname;
  private LinkedHashMap<String, String> fieldmap;
  private StringBuilder classcontent;

  public ClassGenerator(String name, LinkedHashMap<String, String> map) {
    this.classname = name;
    this.fieldmap = map;
    this.classcontent = new StringBuilder();
    GenerateClass();
  }

  private void GenerateClass() {
    StringBuilder fieldcontent = new StringBuilder();
    StringBuilder methodcontent = new StringBuilder();
    classcontent.append("public class ").append(this.classname).append("{\n");
    for (HashMap.Entry<String, String> entry : fieldmap.entrySet()) {
      FieldGenerator myfield = new FieldGenerator(entry.getKey(), entry.getValue());
      fieldcontent.append(myfield.GetField());
      methodcontent.append(myfield.GetMethod());
    }
    classcontent.append(fieldcontent);
    classcontent.append(methodcontent);
    classcontent.append("}\n");
  }

  public String GetClass() {
    return classcontent.toString();
  }
}
