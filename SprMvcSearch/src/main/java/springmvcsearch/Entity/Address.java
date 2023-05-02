package springmvcsearch.Entity;

public class Address {
	private String city;
	private String state;
	
	// the default constructor will initialize our fields so we don't need to create the constructor.
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	

}
