package edu.duke.ece651.classbuilder;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Creator {
  private String basepath;
  private String pack;
  private LinkedHashMap<String, String> codemap;

  public Creator(String mybasepath, String mypack, LinkedHashMap<String, String> mycodemap) {
    this.basepath = mybasepath;
    this.pack = mypack;
    this.codemap = mycodemap;
  }

  public void CreateAllFile() {
    for (HashMap.Entry<String, String> entry : codemap.entrySet()) {
      String filepath = ModifyPath(entry.getKey());
      System.out.println(filepath);
      FileCreator myfilecreator = new FileCreator(filepath, entry.getValue());
      myfilecreator.CreateFile();
    }
  }

  private String ModifyPath(String classname) {
    String filepath = this.basepath;
    String modified_pack = pack.replace(".", "/");
    // String last = filepath.substring(filepath.length() - 1);
    // char lastChar = filepath.charAt(filepath.length() - 1);
    filepath += "/" + modified_pack + "/" + classname + ".java";
    System.out.println(filepath);
    // System.out.print(Character.toString(lastchar));
    /*if (last != "/") {
      System.out.println("last!=slash");
      filepath += "/" + classname + ".java";
    } else {
      System.out.println("last == slash");
      filepath += classname + ".java";
    }
    */
    return filepath;
  }
}
