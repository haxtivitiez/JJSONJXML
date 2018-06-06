package xyz.un4ckn0wl3z.simplex.jsonz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonExample {

	public static void main(String[] args) {

		// simple JSON

		JSONObject obj = new JSONObject();
		obj.put("name", "Anuwat");
		obj.put("age", "23");
		obj.put("salary", new Double(9999999));

		System.out.println(obj);

		// JSON Encode using Map

		Map jsonMap = new HashMap();
		jsonMap.put("name", "Anuwat");
		jsonMap.put("age", "23");
		jsonMap.put("salary", new Double(9999999));

		String jsonTxt = JSONValue.toJSONString(jsonMap);
		System.out.println(jsonTxt);

		// JSON Array Encode

		JSONArray jsonArr = new JSONArray();
		jsonArr.add("ANUXZ");
		jsonArr.add(new Integer(23));
		jsonArr.add(new Double(99999));

		System.out.println(jsonArr);

		// JSON Array Encode using List

		List jsonArrLst = new ArrayList();

		jsonArrLst.add("NYZW");
		jsonArrLst.add(new Integer(27));
		jsonArrLst.add(new Double(600000));
		String jsonTextScnd = JSONValue.toJSONString(jsonArrLst);
		System.out.print(jsonTextScnd);
		
		
		
		// JSON DECODE
		Object afterWorld = JSONValue.parse(jsonTxt);
		JSONObject currentWorld = (JSONObject) afterWorld;
		
		String name = (String) currentWorld.get("name");  
	    double salary = (Double) currentWorld.get("salary");  
	    int age = Integer.parseInt((String) currentWorld.get("age")) ;
		
		System.out.println("\n"+name+" "+salary+" "+age);  

	}

}
