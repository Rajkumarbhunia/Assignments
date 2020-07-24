package assignment_4;

public class TestCustomer {

	public static void main(String[] args) {
		Address address=new Address("1st Main HSR Layout","Bangalore");
		Customer cust1=new Customer();
		cust1.setCustomerName("Ravi");
		cust1.setResidentialAddress(address);
		System.out.println(cust1.getCustomerDetails());
		
	}

}
