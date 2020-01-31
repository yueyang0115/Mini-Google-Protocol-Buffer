package edu.duke.ece651.classbuilder;

public class Capitalizer {
  private String name;
  public Capitalizer(String myname) {
    this.name = myname;
  }
  public String ToCapitalize() {
    return this.name.substring(0, 1).toUpperCase() + this.name.substring(1);
  }

}
