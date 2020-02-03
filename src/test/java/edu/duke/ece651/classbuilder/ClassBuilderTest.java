package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class ClassBuilderTest {
  @Test
  public void test_ClassBuilderStream() { /*
     InputStream r = getClass().getResourceAsStream("/simple.json"); /// name-reference.json
     ClassBuilder mybuilder = new ClassBuilder(r);
     // assertEquals("", mybuilder.getPack());
     // System.out.println(mybuilder);
     // System.out.println(mybuilder.getClassmap());
     // assertEquals("int", mybuilder.getClassmap().get("Test").get("x"));
     // System.out.println(mybuilder.getSourceCode("Test"));
     // System.out.println(mybuilder.getClassNames());
     mybuilder.createAllClasses("/home/yy/ece651-dev-setup/yy258-json-651/src/test/resources/1/");*/
  }

  @Test
  public void test_ClassBuilderString() {
    /* ClassBuilder mybuilder = new ClassBuilder(
        "{'classes':[{'name':'Course','fields':[{'name':'numStudents','type':'int'},{'name':'instructor','type':'Faculty'}]}]}");
    assertEquals("", mybuilder.getPack());
    System.out.println(mybuilder);
    System.out.println(mybuilder.getClassmap());
    assertEquals("int", mybuilder.getClassmap().get("Course").get("numStudents"));
    System.out.println(mybuilder.getSourceCode("Course"));
    System.out.println(mybuilder.getClassNames());
    mybuilder.createAllClasses("/home/yy/ece651-dev-setup/yy258-json-651/src/test/resources/2");*/
  }
}
