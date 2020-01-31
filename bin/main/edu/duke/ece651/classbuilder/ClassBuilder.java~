package edu.duke.ece651.classbuilder;

import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ClassBuilder {
  private JSONObject _json_object;

  public ClassBuilder(String input_string) {
    this._json_object = new JSONObject(input_string);
  }

  public ClassBuilder(InputStream input_stream) {
    JSONTokener jsontokener = new JSONTokener(input_stream);
    this._json_object = new JSONObject(jsontokener);
  }
}
