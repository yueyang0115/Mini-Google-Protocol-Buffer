package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public class Generator {
  // private LinkedHashMap<String, LinkedHashMap<String, String>> classmap;

  private LinkedHashMap<String, ArrayList<OneField>> classmap;
  private LinkedHashMap<String, String> codemap;

  // public Generator(LinkedHashMap<String, LinkedHashMap<String, String>> mymap) {
  public Generator(LinkedHashMap<String, ArrayList<OneField>> mymap) {
    this.classmap = mymap;
    this.codemap = new LinkedHashMap<String, String>();
    GenerateAllClass();
  }

  private void GenerateAllClass() {
    // for (HashMap.Entry<String, LinkedHashMap<String, String>> entry : classmap.entrySet()) {
    for (HashMap.Entry<String, ArrayList<OneField>> entry : classmap.entrySet()) {
      ClassGenerator mygenerator = new ClassGenerator(entry.getKey(), entry.getValue());
      this.codemap.put(entry.getKey(), mygenerator.GetClass());
    }
  }

  public LinkedHashMap<String, String> getCodemap() {
    return this.codemap;
  }
}
