package edu.duke.ece651.hwk1tester;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SerializationTester {
  //we can't just use .similar since we might use different id schemes.
  public static boolean isSerFormatValid(JSONObject s) {
    return isSerFormatValid(s, new HashSet<String>());
  }

  private static boolean isSerFormatValid(JSONObject s, HashSet<String> used) {
    RunAll.logln("->Checking validity of ");
    RunAll.logln(s);
    RunAll.log("ids that have already been defined are:{");
    String sep = "";
    for (String id : used) {
      RunAll.log(sep);
      RunAll.log(id);
      sep = ", ";
    }
    RunAll.logln("}");

    
    // first, are these "refs"?
    String theirRef = s.optString("ref", null);
    if (theirRef != null) {
      //this is a ref
      if (used.contains(theirRef)) {
        return true;
      }
      System.err.println("ref to " + theirRef + " happened without that id being defined");
      return false;
    } else {
      String theirid = s.optString("id", null);
      if (theirid == null) {
        System.out.println(s + " does not have an id");
        return false;
      }
      used.add(theirid);
      String theirty = s.optString("type", null);
      if (theirty == null) {
        System.out.println(s + " does not have a type");
        return false;
      }
      try {
        JSONArray order = s.getJSONArray("order");
        RunAll.logln("order field found: checking values accordingly");
        return checkFieldsOrdered(s, order, used);
      } catch (JSONException jse) {
        RunAll.logln("order field NOT found: checking values accordingly");
        //no order field -> used an array
        return checkFieldsNotOrdered(s, used);
      }
    }
  }
  private static boolean checkFieldsOrdered(JSONObject s, JSONArray order, HashSet<String> used) {
    JSONObject values = null;
    try {
      values  = s.getJSONObject("values");
    }
    catch (JSONException jse) {
      System.err.println("You do not have a proper values field in " + s);
      return false;
    }
    for(int i =0; i < order.length(); i++){
      String x = order.getString(i);
      Object thisVal = null;
      RunAll.logln(" -> examining value for field " + x);
      try {
        thisVal = values.get(x);
      }
      catch(JSONException jse) {
        System.out.println("Order said to find a field " + x + " but " + values + " did not have it");
        return false;
      }
      if (!checkValue(thisVal,used)){
        return false;
      }
    }
    return true;
  }
  private static boolean checkFieldsNotOrdered(JSONObject s, HashSet<String> used) {
    JSONArray values = null;
    try {
      values = s.getJSONArray("values");
    }
    catch(JSONException jse) {
      System.err.println("You do not have a proper values field in " + s);
      return false;
    }
    for(int i = 0; i < values.length(); i++){
      JSONObject o = values.getJSONObject(i);
      JSONArray keyArr = o.names();
      if (keyArr.length() != 1) {
        System.err.println("Expected each value of " + s + " to have one key/value pair");
        return false;
      }
      RunAll.logln(" -> examining value for field " + keyArr.getString(0));
      if(!checkValue(o.get(keyArr.getString(0)),used)){
        return false;
      }
    }
    return true;
  }
  private static boolean checkValue(Object v,HashSet<String> used){
    if (v instanceof JSONObject){
      return isSerFormatValid((JSONObject) v, used);
    }
    if (v instanceof JSONArray) {
      JSONArray arr = (JSONArray) v;
      for (int i = 0; i < arr.length(); i++){
        if (!checkValue(arr.get(i), used)){
          return false;
        }
      }
    }
    return true;
  }
}
