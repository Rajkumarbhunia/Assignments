package assignment_4;

public class Customer {

	String customerName;
	Address residentialAddress;
	Address officialAddress;
	Customer(){}
	public Customer(String customerName,Address residentialAddress,Address officialAddress){
		this.customerName=customerName;
		this.residentialAddress=residentialAddress;
		this.officialAddress=officialAddress;
	}
	public String getCustomerDetails()
	{
		return("Customer : "+customerName+"\nResidential Address: "+residentialAddress+"\nOfficial Address: "+officialAddress);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public Address getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
}