package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class ClassBuilderTest {
  @Test
  public void test_ParseInputStream() {
    InputStream r = getClass().getResourceAsStream("/simple.json");
    ClassBuilder mybuilder = new ClassBuilder(r);
    assertEquals("", mybuilder.getPack());
    System.out.println(mybuilder);
    System.out.println(mybuilder.getClassmap());
    assertEquals("int", mybuilder.getClassmap().get("Test").get("x"));
  }

  @Test
  public void test_ParseString() {
    ClassBuilder mybuilder = new ClassBuilder(
        "{'classes':[{'name':'Course','fields':[{'name':'numStudents','type':'int'},{'name':'instructor','type':'Faculty'}]}]}");
    assertEquals("", mybuilder.getPack());
    System.out.println(mybuilder);
    System.out.println(mybuilder.getClassmap());
    assertEquals("int", mybuilder.getClassmap().get("Course").get("numStudents"));
  }
}