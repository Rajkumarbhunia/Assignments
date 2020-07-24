package assignment_4;

public class Customer {

	String customerName;
	Address residentialAddress;
	
	Customer(){}
	
	public Customer(String customerName,Address residentialAddress){
		this.customerName=customerName;
		this.residentialAddress=residentialAddress;
	}
	public String getCustomerDetails()
	{
		return("Customer :"+customerName+"\nResidential Address:"+residentialAddress);
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
}