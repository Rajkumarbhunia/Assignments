package assignment_4;

public class Address {
	public String toString()
	{
		return(addressLine +" ,"+city);
	}
	String addressLine;
	String city;
	Address(String addressLine,String city)
	{
		this.addressLine=addressLine;
		this.city=city;
	}
	public String grtAddressDetails()
	{
		return(addressLine +" ,"+city);
	}
	public String getAddressLine() {
		return addressLine;
	} 
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
