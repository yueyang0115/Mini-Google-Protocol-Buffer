package edu.duke.ece651.classbuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class WappermapTest {
  @Test
  public void test_Wappermap() {
    WapperMap mywapper = new WapperMap();
    System.out.println(mywapper.getWapper("char"));
    System.out.println(mywapper.getWapper("Faculty"));
    System.out.println(mywapper.getWapper("int"));
  }
}
