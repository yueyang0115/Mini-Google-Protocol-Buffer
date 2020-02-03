package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONArray;
import org.junit.jupiter.api.Test;

public class FieldParserTest {
  @Test
  public void test_FirldParser() {
    JSONArray fieldarray = new JSONArray(
        "[{'name':'numStudents','type':{'e':{'e':'int'}}},{'name':'instructor','type':'Faculty'}]");
    FieldParser field = new FieldParser(fieldarray);
    // assertEquals("int", field.getFieldmap().get("numStudents"));
    // assertEquals("Faculty", field.getFieldmap().get("instructor"));

    System.out.println(field.getFieldlist());
  }
}
