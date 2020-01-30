package edu.duke.ece651.classbuilder;

public class FieldBuilder {
  private String name;
  private String type;
  private String Name;
  private StringBuilder field;
  private StringBuilder method;

  public FieldBuilder(String myname, String mytype) {
    this.name = myname;
    this.type = mytype;
    this.Name = "";
    this.field = new StringBuilder();
    this.method = new StringBuilder();
    Captalize();
    GenerateField();
    GenerateMethod();
  }

  private void Captalize() {
    this.Name = this.name.substring(0, 1).toUpperCase() + this.name.substring(1);
  }
  private void GenerateField() { // private int x;
    field.append("private ").append(this.type).append(" ").append(this.name).append(";\n");
  }

  private void GenerateMethod() {
    // public int getX(){  return x; }
    method.append("public ").append(this.type).append(" ").append("get").append(this.Name);
    method.append("(){\nreturn ").append(this.name).append(";\n}\n");

    // public void setX(int x){ this.x = x;}
    method.append("public void set")
        .append(this.Name)
        .append("(")
        .append(this.type)
        .append(" ")
        .append(this.name);
    method.append("){\n").append("this.").append(this.name).append("=").append(this.name).append(
        ";\n}\n");
  }

  public String GetField() {
    return field.toString();
  }

  public String GetMethod() {
    return method.toString();
  }
}
