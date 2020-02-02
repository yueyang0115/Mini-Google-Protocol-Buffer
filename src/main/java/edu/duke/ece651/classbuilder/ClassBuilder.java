package edu.duke.ece651.classbuilder;

import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ClassBuilder {
  private JSONObject _json_object;
  private String _pack;
  private LinkedHashMap<String, LinkedHashMap<String, String>> _classmap;
  private LinkedHashMap<String, String> _codemap;

  public ClassBuilder(String input_string) {
    this._json_object = new JSONObject(input_string);
    init();
  }

  public ClassBuilder(InputStream input_stream) {
    JSONTokener jsontokener = new JSONTokener(input_stream);
    this._json_object = new JSONObject(jsontokener);
    init();
  }

  private void init() {
    this._pack = "";
    this._classmap = new LinkedHashMap<String, LinkedHashMap<String, String>>();
    this._codemap = new LinkedHashMap<String, String>();
    ParseJson();
    GenerateCode();
  }

  private void ParseJson() {
    Parser myparser = new Parser(this._json_object);
    this._classmap = myparser.getClassmap();
    this._pack = myparser.getPack();
  }

  private void GenerateCode() {
    Generator mygenerator = new Generator(this._classmap);
    this._codemap = mygenerator.getCodemap();
  }

  public Collection<String> getClassNames() {
    return this._classmap.keySet();
  }

  public String getSourceCode(String className) {
    return this._codemap.get(className);
  }

  public void createAllClasses(String basePath) {}

  public String getPack() {
    return this._pack;
  }

  public LinkedHashMap<String, LinkedHashMap<String, String>> getClassmap() {
    return this._classmap;
  }

  public LinkedHashMap<String, String> getCodemap() {
    return this._codemap;
  }
}
