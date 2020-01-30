package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FieldBuilderTest {
  @Test
  public void test_fieldgenerator() {
    FieldBuilder field = new FieldBuilder("abc", "char");
    String method =
        "public char getAbc(){\nreturn abc;\n}\npublic void setAbc(char abc){\nthis.abc=abc;\n}\n";
    assertEquals("private char abc;\n", field.GetField());
    assertEquals(method, field.GetMethod());
  }
}
