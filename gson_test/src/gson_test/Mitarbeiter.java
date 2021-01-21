package gson_test;

public class Mitarbeiter extends Person {
	private String abteilung;

	public Mitarbeiter(int id, String name, double height, double weight, String abteilung) {
		super(id, name, height, weight);
		this.abteilung = abteilung;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}
	
	@Override
	public String toString() {
		return super.toString() + " abteilung:" + abteilung;
	}
	
}
