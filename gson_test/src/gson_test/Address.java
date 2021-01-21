package gson_test;

public class Address {
	private String permanent;
	private String current;
	public Address(String permanent, String current) {
		super();
		this.permanent = permanent;
		this.current = current;
	}
	public String getPermanent() {
		return permanent;
	}
	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}
	public String getCurrent() {
		return current;
	}
	public void setCurrent(String current) {
		this.current = current;
	}
	
	@Override
	public String toString() {
		return "Address [permanent=" + permanent + ", current=" + current + "]";
	}
}
