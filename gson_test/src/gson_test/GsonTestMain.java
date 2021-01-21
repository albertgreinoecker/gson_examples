package gson_test;

import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Hier befinden sich alle Beispiele zum Einlesen bzw. Hinausschreiben von JSON
 */
public class GsonTestMain {

	public static void main(String[] args) throws FileNotFoundException {
		Gson gson = new Gson();
		
		String jsonPerson = Utils.readTextFile("person.json");
		Person p = gson.fromJson(jsonPerson, Person.class);
		System.out.println(p.getHeight());
		
		
		String json_array = Utils.readTextFile("person_array.json");
		Person[] persons = gson.fromJson(json_array, Person[].class);
		for(Person person : persons)
		    System.out.println(person.toString());
		
		/////////////////////////////////////////
		System.out.println();
		p.setName("Hubert");
		System.out.println("Object 2 JSON:");
		String pStr = gson.toJson(p);
		System.out.println(pStr);
		
		String pArrStr = gson.toJson(persons);
		System.out.println(pArrStr);
		
		//Wie verhaelt sich gson bei Vererbung?

		String jsonMitarbeiter = Utils.readTextFile("mitarbeiter.json");
		Person p2 = gson.fromJson(jsonMitarbeiter, Person.class);
		
		System.out.println();
		System.out.println("Zu viele Attribute im JSON sind kein Problem, werden ignoriert: ");
		System.out.println(p2);
		
		
		String jsonPerson2 = Utils.readTextFile("person.json");
		Mitarbeiter ma = gson.fromJson(jsonPerson2, Mitarbeiter.class);
		
		System.out.println();
		System.out.println("Zu wenige Attribute im JSON werden null gesetzt: ");
		System.out.println(ma);
		
		//Was, wenn man keine Klasse hat, in die man konvertieren kann?
		JsonElement element = gson.fromJson (jsonMitarbeiter, JsonElement.class);
		JsonObject o = element.getAsJsonObject();
		String name = o.get("name").getAsString();
		System.out.println("Name:" + name);
		
		//Wie geht man mit Arrays um?
		
		String jsonWithArray = Utils.readTextFile("with_array_and_nested.json");
		JsonElement element2 = gson.fromJson (jsonWithArray, JsonElement.class);
		JsonObject o2 = element2.getAsJsonObject();
		JsonArray pets = o2.get("pets").getAsJsonArray();
		System.out.println();
		System.out.println("Die einzelnen Tiere:");
		for (int i = 0; i< pets.size();i++)
		{
			String pet = pets.get(i).getAsString();
			System.out.println(pet);
		}
		
		//Funktioniert das  Einlesen in ein Objekt auch für Arrays und eingebettete Objekte?
		String jsonComplex = Utils.readTextFile("with_array_and_nested.json");
		Verschachtelt v = gson.fromJson(jsonComplex, Verschachtelt.class);
		System.out.println("Komplexes Objekt eingelesen:");
		System.out.println(v);
		System.out.println("Das erste Tier:" + v.getPets()[0]);
		System.out.println("Die aktuelle Adresse:" + v.getAddress().getCurrent());
	}

}
