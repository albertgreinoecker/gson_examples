package gson_test;

import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ReadGoogleMaps {

	public static void main(String[] args) throws FileNotFoundException {
		Gson gson = new Gson();
		String jsonWithArray = Utils.readTextFile("maps.json");
		JsonElement element2 = gson.fromJson(jsonWithArray, JsonElement.class);
		JsonObject o2 = element2.getAsJsonObject();
		JsonArray marker = o2.get("markers").getAsJsonArray();
		System.out.println(marker);
		for (int i = 0; i < marker.size(); i++)
		{
			JsonObject mark = marker.get(i).getAsJsonObject();
			String name = mark.get("name").toString();
			System.out.println(name);
		}
	}

}
