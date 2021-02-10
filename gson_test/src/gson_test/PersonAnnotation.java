package gson_test;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class PersonAnnotation {
	@SerializedName(value = "theID")
	private int id;
	private String name;
	private double height;
	private double weight;

	public PersonAnnotation(int id, String name, double height, double weight) {
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "[ id: " + String.valueOf(id) + ", name: " + name + ", height: " + String.valueOf(height) + ", weight: "
				+ String.valueOf(weight) + " ]";
	}
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		PersonAnnotation p = new PersonAnnotation(1, "Hubert", 1,2);
		String pJson = gson.toJson(p);
		System.out.println(pJson);
		
		PersonAnnotation p2 = gson.fromJson(pJson, PersonAnnotation.class);
		System.out.println(p2);
	}
}