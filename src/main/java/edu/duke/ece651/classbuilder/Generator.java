package edu.duke.ece651.classbuilder;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Generator {
  private LinkedHashMap<String, LinkedHashMap<String, String>> classmap;
  private LinkedHashMap<String, String> codemap;

  private Generator(LinkedHashMap<String, LinkedHashMap<String, String>> mymap) {
    this.classmap = mymap;
    this.codemap = new LinkedHashMap<String, String>();
    GenerateAllClass();
  }

  private void GenerateAllClass() {
    for (HashMap.Entry<String, LinkedHashMap<String, String>> entry : classmap.entrySet()) {
      ClassGenerator mygenerator = new ClassGenerator(entry.getKey(), entry.getValue());
      codemap.put(entry.getKey(), mygenerator.GetClass());
    }
  }

  public LinkedHashMap<String, String> GetAllCode() {
    return this.codemap;
  }
}
