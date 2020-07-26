package assignment_4;

public class TestCustomer {

	public static void main(String[] args) {
		Address address=new Address("1st Main HSR Layout","Bangalore");
		Address address1=new Address("Ist Main Electronics city","Bangalore");
		Customer cust1=new Customer();
		cust1.setCustomerName("Ravi");
		cust1.setResidentialAddress(address);
		cust1.setOfficialAddress(address1);
		System.out.println(cust1.getCustomerDetails());
		Customer cust2=new Customer("John",address,address1);
		System.out.println(cust2.getCustomerDetails());
		
	}

}
