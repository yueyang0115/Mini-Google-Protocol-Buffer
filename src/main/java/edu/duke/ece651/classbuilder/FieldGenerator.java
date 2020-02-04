package edu.duke.ece651.classbuilder;

import org.json.JSONArray;
import org.json.JSONObject;

public class FieldGenerator {
  private OneField field;
  private String name;
  private String Name;
  private String type;
  private String definetype;
  private String returntype;
  private int dimension;
  private StringBuilder fieldcontent;
  private StringBuilder constructorcontent;
  private StringBuilder methodcontent;
  private WapperMap wappermap;

  public FieldGenerator(OneField myfield) {
    this.field = myfield;
    this.name = myfield.getName();
    this.Name = new Capitalizer(this.name).ToCapitalize();
    this.dimension = myfield.getDimension();
    this.type = myfield.getType();
    this.fieldcontent = new StringBuilder();
    this.constructorcontent = new StringBuilder();
    this.methodcontent = new StringBuilder();
    this.wappermap = new WapperMap();
    ModifyType();
    GenerateField();
    GenerateConstructor();
    GenerateMethod();
  }

  private void ModifyType() {
    StringBuilder DefineType = new StringBuilder();
    StringBuilder ReturnType = new StringBuilder();
    if (dimension != 0) {
      DefineType.append("ArrayList<");
      for (int i = dimension; i != 1; i--) {
        DefineType.append("Collection<");
        ReturnType.append("Collection<");
      }
      System.out.println("this.type =");
      System.out.println(this.type);
      System.out.println("wapper.getwapper(this.type) = ");
      System.out.println(wappermap.getWapper(this.type));
      DefineType.append(wappermap.getWapper(this.type));
      ReturnType.append(wappermap.getWapper(this.type));
      for (int i = dimension; i != 1; i--) {
        DefineType.append(">");
        ReturnType.append(">");
      }
      DefineType.append(">");
      this.definetype = DefineType.toString();
      this.returntype = ReturnType.toString();
      if (dimension == 1) {
        this.returntype = this.type;
      }
    } else {
      this.definetype = this.type;
      this.returntype = this.type;
    }
  }

  private void GenerateField() { // private int x;
    fieldcontent.append("private ")
        .append(this.definetype)
        .append(" ")
        .append(this.name)
        .append(";\n");
  }

  private void GenerateConstructor() {
    if (wappermap.getWapper(this.type) == "None") {
    }
    if (dimension != 0) {
      // public Course(){this.course = new ArrayList<>()}
      constructorcontent.append("(){\n").append("this.").append(this.name).append(
          " = new ArrayList<>();\n}\n");
    }
  }

  private void GenerateMethod() {
    if (dimension == 0) {
      NonarrayMethod();
    } else {
      ArrayMethod();
    }
  }

  private void NonarrayMethod() {
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

  private void ArrayMethod() {
    // public int numCourses(){  return course.length;}
    methodcontent.append("public int num")
        .append(this.Name)
        .append("s(){\nreturn ")
        .append(this.name)
        .append(".length;\n}\n");

    // public void addCourses(Collection<Integer> n){ course.add(n);}
    methodcontent.append("public void add")
        .append(this.Name)
        .append("s(")
        .append(this.returntype)
        .append(" n){\n")
        .append(this.name)
        .append(".add(n);\n}\n");

    // Collection<Integer> getCourses(int index){return course.get(index);}
    methodcontent.append("public ")
        .append(this.returntype)
        .append(" get")
        .append(this.Name)
        .append("s(int index){\nreturn ")
        .append(this.name)
        .append(".get(index);\n}\n");

    // void setCourses(int index, Collection<Integer> n){ course.set(index,n);}
    methodcontent.append("public void set")
        .append(this.Name)
        .append("s(int index, ")
        .append(this.returntype)
        .append(" n){\n")
        .append(this.name)
        .append(".set(index,n);\n}\n");
  }

  public String GetField() {
    return fieldcontent.toString();
  }

  public String GetConstructor() {
    return constructorcontent.toString();
  }

  public String GetMethod() {
    return methodcontent.toString();
  }
}
