package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class ClassBuilderTest {
  @Test
  public void test_Parse() {
    // InputStream r = getClass().getResourceAsStream(
    // "/home/yy/ece651-dev-setup/yy258-json-651/src/test/resources/simple.json");
    ClassBuilder mybuilder = new ClassBuilder(
        "{'classes':[{'name':'Course','field':[{'name':'numStudents','type':'int'},{'name':'instructor','type':'Faculty'}]}]}");
    assertEquals("", mybuilder.getPack());
    assertEquals("Faculty", mybuilder.getClassmap().get("Course").get("instructor"));
    System.out.println(mybuilder.getClassmap());
  }
}
