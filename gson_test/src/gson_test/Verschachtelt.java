package gson_test;

import java.util.Arrays;

public class Verschachtelt {
	private String name;
	private int mobile;
	private boolean active;
	private String[] pets;
	private Address address;

	public Verschachtelt(String name, int mobile, boolean active, String[] pets, Address address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.active = active;
		this.pets = pets;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String[] getPets() {
		return pets;
	}

	public void setPets(String[] pets) {
		this.pets = pets;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Verschachtelt [name=" + name + ", mobile=" + mobile + ", active=" + active + ", pets="
				+ Arrays.toString(pets) + ", adress=" + address + "]";
	}

}
