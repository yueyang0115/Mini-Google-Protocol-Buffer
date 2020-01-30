package edu.duke.ece651.classbuilder;

import edu.duke.ece651.classbuilder.FieldBuilder;
import java.util.HashMap;

public class ClassGenerator {
  private String classname;
  private HashMap<String, String> fieldmap;
  private StringBuilder classcontent;

  public ClassGenerator(String name, HashMap<String, String> map) {
    this.classname = name;
    this.fieldmap = map;
    this.classcontent = new StringBuilder();
    GenerateClass();
  }

  private void GenerateClass() {
    classcontent.append("public class ").append(this.classname).append("{\n");
    for (HashMap.Entry<String, String> entry : fieldmap.entrySet()) {
      FieldBuilder myfield = new FieldBuilder(entry.getKey(), entry.getValue());
      classcontent.append(myfield.GetField());
      classcontent.append(myfield.GetMethod());
    }
    classcontent.append("}\n");
  }

  public String GetClass() {
    return classcontent.toString();
  }
}
