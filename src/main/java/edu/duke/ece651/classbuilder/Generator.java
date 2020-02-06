package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public class Generator {
  private LinkedHashMap<String, ArrayList<OneField>> classmap;
  private String pack;
  private LinkedHashMap<String, String> codemap;

  public Generator(LinkedHashMap<String, ArrayList<OneField>> mymap, String mypack) {
    this.classmap = mymap;
    this.pack = mypack;
    this.codemap = new LinkedHashMap<String, String>();
    GenerateAllClass();
    GenerateDeserializer();
  }

  private void GenerateAllClass() {
    for (HashMap.Entry<String, ArrayList<OneField>> entry : classmap.entrySet()) {
      ClassGenerator mygenerator = new ClassGenerator(entry.getKey(), entry.getValue());
      StringBuilder class_code = new StringBuilder();
      if (this.pack != "") {
        class_code.append("package " + this.pack + ";\n");
      }
      class_code.append(mygenerator.getClassCode());
      this.codemap.put(entry.getKey(), class_code.toString());
    }
  }

  private void GenerateDeserializer() {
    StringBuilder dese_code = new StringBuilder();
    if (this.pack != "") {
      dese_code.append("package " + this.pack + ";\n");
    }
    dese_code.append("import java.util.*;\n")
        .append("import org.json.*;\n\n")
        .append("public class Deserializer{\n\n");

    for (HashMap.Entry<String, ArrayList<OneField>> entry : classmap.entrySet()) {
      Deserialization mydeserilizer = new Deserialization(entry.getKey(), entry.getValue());
      dese_code.append(mydeserilizer.getCode()).append("\n");
    }

    dese_code.append("}\n");
    this.codemap.put("Deserializer", dese_code.toString());
  }

  public LinkedHashMap<String, String> getCodemap() {
    return this.codemap;
  }
}
