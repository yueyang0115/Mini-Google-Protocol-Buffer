package edu.duke.ece651.classbuilder;

import java.util.HashMap;

public class WapperMap {
  private HashMap<String, String> wappermap;
  public WapperMap() {
    wappermap = new HashMap<String, String>();
    wappermap.put("boolean", "Boolean");
    wappermap.put("byte", "Byte");
    wappermap.put("char", "Character");
    wappermap.put("short", "Short");
    wappermap.put("int", "Integer");
    wappermap.put("long", "Long");
    wappermap.put("float", "Float");
    wappermap.put("double", "Double");
    wappermap.put("String", "String");
  }

  public String getWapper(String type) {
    if (wappermap.containsKey(type)) {
      return wappermap.get(type);
    } else {
      System.out.println("type not found in wapper map");
      return "None";
    }
  }
}
