package edu.duke.ece651.classbuilder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class FieldParser {
  private JSONArray fieldarray;
  private ArrayList<OneField> fieldlist;

  public FieldParser(JSONArray myarray) {
    this.fieldarray = myarray;
    this.fieldlist = new ArrayList<>();
    ParseField();
  }

  private void ParseField() {
    for (int i = 0; i < fieldarray.length(); i++) {
      JSONObject onefield = fieldarray.optJSONObject(i);
      System.out.println(onefield);

      OneField myfield = new OneField();
      String myname = onefield.optString("name");
      myfield.setName(myname);

      String mytype = "";
      int mydimension = 0;
      JSONObject js = onefield.optJSONObject("type"); // jsonobject(e:int) or string(int)
      if (js == null) { // jump in here when type is not object e.g. (int)
        mytype = onefield.optString("type");
        System.out.println("mytype is");
        System.out.println(mytype);
      } else { // jump in here when type is object (e:int) js = e:int
        mydimension += 1;
        JSONObject lastparse = js;
        JSONObject parse = lastparse.optJSONObject("e"); // e:int
        System.out.println(parse);
        while (parse != null) {
          mydimension += 1;
          lastparse = parse;
          parse = lastparse.optJSONObject("e"); // int ->null
        }
        mytype = lastparse.optString("e");
        System.out.println("mytype is");
        System.out.println(mytype);
      }
      myfield.setType(mytype);
      System.out.println(myfield.getType());
      myfield.setDimension(mydimension);
      System.out.println(myfield.getDimension());
      this.fieldlist.add(myfield);
    }
  }

  public ArrayList<OneField> getFieldlist() {
    return this.fieldlist;
  }
}
