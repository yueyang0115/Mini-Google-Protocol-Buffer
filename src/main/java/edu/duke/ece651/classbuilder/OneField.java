package edu.duke.ece651.classbuilder;

public class OneField {
  private String name;
  private String type;
  private int dimension;

  public OneField() {
    this.name = "";
    this.type = "";
    this.dimension = 0;
  }
  public void setName(String myname) {
    this.name = myname;
  }
  public void setType(String mytype) {
    this.type = mytype;
  }
  public void setDimension(int mydimension) {
    this.dimension = mydimension;
  }

  public String getName() {
    return this.name;
  }
  public String getType() {
    return this.type;
  }
  public int getDimension() {
    return this.dimension;
  }
}
