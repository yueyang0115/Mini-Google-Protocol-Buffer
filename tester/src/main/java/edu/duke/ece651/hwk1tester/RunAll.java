package edu.duke.ece651.hwk1tester;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class RunAll {
  private static final String TEST_DIR = "src/main/java/hwk1/testing";
  private static java.io.PrintWriter logFile;
  public static void logln(Object ln) {
    logFile.println(ln);
  }
  public static void log(Object ln) {
    logFile.print(ln);
  }
  public static void logStackTrace(Throwable t){
    t.printStackTrace(logFile);
  }
  private static void runTestAndReport(File testDir) {
    String name = testDir.getName();
    System.out.println("---> Starting test for " + name);
    Hwk1Tester t = null;
    try {
      Class<?> c = Class.forName("hwk1.testing." + name + ".ECE651_Hwk1_Tester");
      t = (Hwk1Tester) c.getDeclaredConstructor().newInstance();
    } catch (InvocationTargetException ite) {
      logln("[" + name + "]***FAILED**");
      logStackTrace(ite.getCause());
      System.err.println("[" + name + "]: Failed to initialize with exception:\n");
      System.err.println("[" + name + "]: " + ite.getCause());
      System.err.println("[" + name + "]: Do you have the right fields and methods?\n");
      ite.printStackTrace();
      ite.getCause().printStackTrace();
      return;
    } catch (Exception e) {
      logln("[" + name + "]***FAILED**");
      logStackTrace(e);
      System.err.println("[" + name + "]: Failed in test class initialization with:\n");
      System.err.println("[" + name + "]:" + e);
      e.printStackTrace();
      System.err.println("[" + name + "]: Do you have the right fields and methods?\n");
      return;
    }
    try {
      t.checkTypes();
    } catch (Exception e) {
      logln("[" + name + "]***FAILED**");
      logStackTrace(e);
      System.err.println("[" + name + "]: Failed checking the types of fields and method with\n");
      e.printStackTrace();
      return;
    }
    try {
      t.runAllTests();
      // no exceptions = passed
      System.out.println("[" + name + "]: PASSED\n");
      logln("[" + name + "]***PASSED**");
    } catch (InvocationTargetException ite) {
      logln("[" + name + "]***FAILED**");
      logStackTrace(ite.getCause());
      System.err.println("[" + name + "]: Failed running tests with an exception in your code\n");
      System.err.println("[" + name + "]:" + ite.getCause());
      ite.printStackTrace();
      ite.getCause().printStackTrace();
    } catch (Exception e) {
      logln("[" + name + "]***FAILED**");
      logStackTrace(e);
      System.err.println("[" + name + "]: Failed running tests with\n");
      System.err.println("[" + name + "]:" + e);
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws IOException {
    try (PrintWriter logFile0 = new PrintWriter("hwk1testlog.txt")) {
      logFile = logFile0;
      ArrayList<File> testDirs = new ArrayList<File>();
      File base = new File(TEST_DIR);
      if (!base.exists()) {
        System.err.println("You don't seem to have anything to test in" + TEST_DIR);
        System.exit(1);
      }
      if (!base.isDirectory()) {
        System.err.println(TEST_DIR + " is not a directory!");
        System.exit(1);
      }
      File[] children = base.listFiles();
      for (File f : children) {
        if (!f.isDirectory()) {
          System.err.println(f + " is not a directory: skipping\n");
          continue;
        }
        File deserInF = new File(f, "Deserializer.java");
        if (!deserInF.exists()) {
          System.err.println(f + " does not contain Deserializer.java: assuming you did not generate code for it");
        } else {
          System.out.println("Adding " + f + " to test set");
          testDirs.add(f);
        }
      }

      for (File dir : testDirs) {
        runTestAndReport(dir);
      }
    }
  }
}
