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
  }

  private void GenerateAllClass() {
    for (HashMap.Entry<String, ArrayList<OneField>> entry : classmap.entrySet()) {
      ClassGenerator mygenerator = new ClassGenerator(entry.getKey(), entry.getValue());
      StringBuilder content = new StringBuilder();
      if (this.pack != "") {
        content.append("package " + this.pack + ";\n");
      }
      content.append(mygenerator.GetClass());
      this.codemap.put(entry.getKey(), content.toString());
    }
  }

  public LinkedHashMap<String, String> getCodemap() {
    return this.codemap;
  }
}
