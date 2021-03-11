package gson_test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class GsonRemote {

	public static void main(String[] args) throws IOException {
		
        String webPage = "http://time.jsontest.com";

        try (InputStream is = new URL(webPage).openStream();
                Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {

            Gson gson = new Gson();
            JsonElement td = gson.fromJson(reader,  JsonElement.class);
            JsonObject o2 = td.getAsJsonObject();
            String date = o2.get("date").getAsString();
            System.out.println(date);
            System.out.println(td);
        } catch (Exception e)
        {
        	e.printStackTrace();
        }
	}

}
