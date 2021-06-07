
public class Address {
	String city;
	String state;

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String c) {
		city = c;
	}

	public String getState() {
		return state;
	}

	public void setState(String s) {
		state = s;
	}

	public String toString() {
		return   state + "," + city;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Address)) {
			return false;
		}
		Address other = (Address) o;
		return city.equals(other.city) && state.equals(other.state);
	}
}
