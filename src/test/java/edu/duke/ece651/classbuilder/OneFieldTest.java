package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OneFieldTest {
  @Test
  public void test_onefield() {
    OneField myfield = new OneField();
    myfield.setName("x");
    myfield.setType("int");
    myfield.setDimension(0);
    System.out.println(myfield.getName());
    System.out.println(myfield.getType());
    System.out.println(myfield.getDimension());
  }
}
