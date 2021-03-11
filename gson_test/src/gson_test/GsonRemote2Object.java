package gson_test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;

/**
 * Taken from: https://zetcode.com/java/gson/
 * @author albert
 *
 */
public class GsonRemote2Object {
	public static void main(String[] args) throws MalformedURLException, IOException {
		String webPage = "http://time.jsontest.com";

		try (InputStream is = new URL(webPage).openStream();
				Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {

			Gson gson = new Gson();
			TimeData td = gson.fromJson(reader, TimeData.class);

			System.out.println(td);
		}
	}
}
