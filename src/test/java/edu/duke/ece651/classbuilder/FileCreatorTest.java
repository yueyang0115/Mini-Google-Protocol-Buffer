package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FileCreatorTest {
  @Test
  public void test_FileCreator_exception() {
    String path = "src/test/resource/result.java";
    FileCreator mycreator = new FileCreator(path, "this is result");
    mycreator.CreateFile();
  }
}
