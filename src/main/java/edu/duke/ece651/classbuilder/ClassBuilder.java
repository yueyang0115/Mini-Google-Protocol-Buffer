package edu.duke.ece651.classbuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ClassBuilder {
  private JSONObject _json_object;
  private String _pack;
  private LinkedHashMap<String, LinkedHashMap<String, String>> _classmap;

  public ClassBuilder(String input_string) {
    this._json_object = new JSONObject(input_string);
    init();
  }

  public ClassBuilder(InputStream input_stream) {
    JSONTokener jsontokener = new JSONTokener(input_stream);
    this._json_object = new JSONObject(jsontokener);
    // this._json_object = new JSONObject(input_stream);
    init();
  }

  private void init() {
    this._pack = "";
    this._classmap = new LinkedHashMap<String, LinkedHashMap<String, String>>();
    // System.out.println("begin parse pbject\n");
    Parser myparser = new Parser(_json_object);
    this._classmap = myparser.getClassmap();
    this._pack = myparser.getPack();
  }

  public String getPack() {
    return this._pack;
  }

  public LinkedHashMap<String, LinkedHashMap<String, String>> getClassmap() {
    return this._classmap;
  }

  public void GenerateClass() {
    // Generator mygenerator = new Generator(this._classmap);
  }
}
