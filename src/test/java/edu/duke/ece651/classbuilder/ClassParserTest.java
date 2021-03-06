package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONArray;
import org.junit.jupiter.api.Test;

public class ClassParserTest {
  @Test
  public void test_ClassParser() {
    JSONArray classarray_1 = new JSONArray(
        "[{'name':'Course','fields':[{'name':'numStudents','type':{'e':'int'}},{'name':'instructor','type':'Faculty'}]}]");
    ClassParser myclass_1 = new ClassParser(classarray_1);
    // assertEquals("Faculty", myclass_1.getClassmap().get("Course").get("instructor"));
    System.out.println(myclass_1.getClassmap());
    JSONArray classarray_2 = new JSONArray("[{'name':'Course'}]");
    ClassParser myclass_2 = new ClassParser(classarray_2);
    System.out.println(myclass_2.getClassmap());
  }
}
