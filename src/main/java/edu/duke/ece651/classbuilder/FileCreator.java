package edu.duke.ece651.classbuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileCreator {
  private String filepath;
  private String filecontent;

  public FileCreator(String mypath, String mycontent) {
    this.filepath = mypath;
    this.filecontent = mycontent;
  }
  public void CreateFile() {
    try {
      // FileWriter mywriter = new FileWriter(filepath);
      PrintWriter myprintwriter = new PrintWriter(filepath);
      myprintwriter.print(this.filecontent);
      myprintwriter.close();
    } catch (Exception e) {
      System.out.println("filepath cannot found");
      System.out.println(e);
    }
  }
}
