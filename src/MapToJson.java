import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MapToJson {
	public static void main(String[] args) {
		Map<String, String> colours = new HashMap<>();
		colours.put("BLACK", "#000000");
		colours.put("RED", "#FF0000");
		colours.put("GREEN", "#008000");
		colours.put("BLUE", "#0000FF");
		colours.put("YELLOW", "#FFFF00");
		colours.put("WHITE", "#FFFFFF");

		Gson gson = new Gson();
		String json = gson.toJson(colours);
		System.out.println("json = " + json);

		//
		// Convert JSON string back to Map.
		//
		Type type = new TypeToken<Map<String, String>>() {
		}.getType();
		Map<String, String> map = gson.fromJson(json, type);
		for (String key : map.keySet()) {
			System.out.println("map.get = " + map.get(key));
		}
	}
}