package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class ClassBuilderTest {
  @Test
  public void test_ClassBuilderStream() {
    InputStream r = getClass().getResourceAsStream("/nameRef.json"); /// name-reference.json
    ClassBuilder mybuilder = new ClassBuilder(r);
    // assertEquals("", mybuilder.getPack());
    // System.out.println(mybuilder);
    // System.out.println(mybuilder.getClassmap());
    // assertEquals("int", mybuilder.getClassmap().get("Test").get("x"));
    // System.out.println(mybuilder.getSourceCode("Test"));
    System.out.println(mybuilder.getClassNames());
    mybuilder.createAllClasses(
        "/home/yy/ece651-dev-setup/testcases/ece651-hwk1-tester/src/main/java");
    // mybuilder.createAllClasses("src/test/resources/1");
  }

  @Test
  public void test_ClassBuilderString() {
    ClassBuilder mybuilder = new ClassBuilder(
        "{'classes':[{'name':'Course','fields':[{'name':'numStudents','type':'int'},{'name':'instructor','type':'Faculty'}]}]}");
    assertEquals("", mybuilder.getPack());
    // System.out.println(mybuilder);
    // System.out.println(mybuilder.getClassmap());
    // assertEquals("int", mybuilder.getClassmap().get("Course").get("numStudents"));
    System.out.println(mybuilder.getSourceCode("Course"));
    System.out.println(mybuilder.getClassNames());
    mybuilder.createAllClasses("src/test/resources/2/");
  }

  @Test
  public void test_empty() {
    InputStream r = getClass().getResourceAsStream("/empty.json"); /// name-reference.json
    ClassBuilder mybuilder = new ClassBuilder(r);
    System.out.println(mybuilder.getClassNames());
    mybuilder.createAllClasses(
        "/home/yy/ece651-dev-setup/testcases/ece651-hwk1-tester/src/main/java");
  }

  @Test
  public void test_simple() {
    InputStream r = getClass().getResourceAsStream("/simple.json"); /// name-reference.json
    ClassBuilder mybuilder = new ClassBuilder(r);
    System.out.println(mybuilder.getClassNames());
    mybuilder.createAllClasses(
        "/home/yy/ece651-dev-setup/testcases/ece651-hwk1-tester/src/main/java");
  }

  @Test
  public void test_nameRef() {
    InputStream r = getClass().getResourceAsStream("/nameRef.json"); /// name-reference.json
    ClassBuilder mybuilder = new ClassBuilder(r);
    System.out.println(mybuilder.getClassNames());
    mybuilder.createAllClasses(
        "/home/yy/ece651-dev-setup/testcases/ece651-hwk1-tester/src/main/java");
  }

  @Test
  public void test_arr() {
    InputStream r = getClass().getResourceAsStream("/arr.json"); /// name-reference.json
    ClassBuilder mybuilder = new ClassBuilder(r);
    System.out.println(mybuilder.getClassNames());
    mybuilder.createAllClasses(
        "/home/yy/ece651-dev-setup/testcases/ece651-hwk1-tester/src/main/java");
  }

  @Test
  public void test_primitive() {
    InputStream r = getClass().getResourceAsStream("/prims.json"); /// name-reference.json
    ClassBuilder mybuilder = new ClassBuilder(r);
    System.out.println(mybuilder.getClassNames());
    mybuilder.createAllClasses(
        "/home/yy/ece651-dev-setup/testcases/ece651-hwk1-tester/src/main/java");
  }

  @Test
  public void test_prims() {
    InputStream r = getClass().getResourceAsStream("/prims.json"); /// name-reference.json
    ClassBuilder mybuilder = new ClassBuilder(r);
    System.out.println(mybuilder.getClassNames());
    mybuilder.createAllClasses("src/test/resources/2/");
  }

  /*@Test
  public void test_ToJson1() {
    ClassBuilder mybuilder = new ClassBuilder(
        "{'classes':[{'name':'Grade','fields':[{'name':'people','type':'People'},{'name':'student','type':'String'},{'name':'grade','type':'double'}]},{'name':'People','fields':[{'name':'age','type':'int'},{'name':'grade','type':'Grade'}]}],'package':'edu.duke.ece651.classbuilder'}");
    mybuilder.createAllClasses("src/main/java");

    Grade g = new Grade();
    People p = new People();

    p.setAge(12);
    p.setGrade(g);

    g.setStudent("stu2");
    g.setGrade(100.0);
    g.setPeople(p);

    JSONObject output = new JSONObject();
    output = g.toJSON();
    System.out.println(output.toString());

    Grade new_g = Deserializer.readGrade(output);
    System.out.println("new_g.student=");
    System.out.println(new_g.getStudent());
    System.out.println("new_g.grade=");
    System.out.println(new_g.getGrade());
    System.out.println("new_g.people=");
    System.out.println(new_g.getPeople().toString());
    }*/
}
