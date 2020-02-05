package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FieldGeneratorTest {
  @Test
  public void test_fieldgenerator_nonearray() {
    OneField myfield = new OneField();
    myfield.setDimension(0);
    myfield.setName("abc");
    myfield.setType("char");
    FieldGenerator field = new FieldGenerator(myfield, "Test");
    // String method ="public char getAbc(){\nreturn abc;\n}\npublic void setAbc(char
    // abc){\nthis.abc=abc;\n}\n";

    // assertEquals("private char abc;\n", field.GetField());
    // assertEquals(method, field.GetMethod());
    System.out.println(field.GetField());
    System.out.println(field.GetConstructor());
    System.out.println(field.GetMethod());
  }

  @Test
  public void test_fieldgenerator_array_1d() {
    OneField myfield = new OneField();
    myfield.setDimension(1);
    myfield.setName("course");
    myfield.setType("int");
    FieldGenerator field = new FieldGenerator(myfield, "Test");
    System.out.println(field.GetField());
    System.out.println(field.GetConstructor());
    System.out.println(field.GetMethod());
  }

  @Test
  public void test_fieldgenerator_array_2d() {
    OneField myfield = new OneField();
    myfield.setDimension(2);
    myfield.setName("course");
    myfield.setType("int");
    FieldGenerator field = new FieldGenerator(myfield, "Test");
    System.out.println(field.GetField());
    System.out.println(field.GetConstructor());
    System.out.println(field.GetMethod());
  }
}
