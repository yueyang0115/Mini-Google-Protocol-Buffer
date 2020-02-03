package edu.duke.ece651.classbuilder;

import org.json.JSONArray;
import org.json.JSONObject;

public class FieldGenerator {
  private OneField field;
  private String name;
  private String Name;
  private String type;
  private int dimension;
  private StringBuilder fieldcontent;
  private StringBuilder methodcontent;

  // public FieldGenerator(String myname, String mytype) {
  // public FieldGenerator(String myname, JSONObject mytype) {
  public FieldGenerator(OneField myfield) {
    // this.name = myname;
    // this.jsontype = mytype;
    // System.out.println(this.jsontype);
    // this.type = "";
    this.field = myfield;
    this.name = myfield.getName();
    this.Name = new Capitalizer(this.name).ToCapitalize();
    this.type = myfield.getType();
    this.dimension = myfield.getDimension();
    this.fieldcontent = new StringBuilder();
    this.methodcontent = new StringBuilder();
    GenerateField();
    GenerateMethod();
  }

  private void GenerateField() { // private int x;
    fieldcontent.append("private ").append(this.type).append(" ").append(this.name).append(";\n");
  }

  private void GenerateMethod() {
    // public int getX(){  return x; }
    methodcontent.append("public ").append(this.type).append(" ").append("get").append(this.Name);
    methodcontent.append("(){\nreturn ").append(this.name).append(";\n}\n");

    // public void setX(int x){ this.x = x;}
    methodcontent.append("public void set")
        .append(this.Name)
        .append("(")
        .append(this.type)
        .append(" ")
        .append(this.name);
    methodcontent.append("){\n")
        .append("this.")
        .append(this.name)
        .append("=")
        .append(this.name)
        .append(";\n}\n");
  }

  public String GetField() {
    return fieldcontent.toString();
  }

  public String GetMethod() {
    return methodcontent.toString();
  }
}
