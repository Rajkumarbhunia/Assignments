
/*2. Create a class AccountTest1 with a main method. 
- Create a object of Account using parameterized Constructor.
- Deposit some amount 
- Withdraw some amount
- Display the Account Details */

package assignment_3;

public class AccountTest1 {

	String name;
	double balance;
	String accType;
	int accno;

	public AccountTest1(String name, double balance, String accType, int accno) {
		this.name = name;
		this.balance = balance;
		this.accType = accType;
		this.accno = accno;
	}

	public void diposit(double amount) {
		this.balance = balance + amount;
	}

	public boolean withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance = this.balance - amount;
			return true;
		}
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAcDetails() {
		return ("Name:" + name + "\nAccount Number:" + accno + " \nAccount Type:" + accType + "\nBalance:" + balance);
	}

	public static void main(String[] args) {

		AccountTest1 acct = new AccountTest1("Rajkumar", 1000, "SB", 123443);
		acct.diposit(5000);
		System.out.println(acct.getBalance());
		acct.withdraw(2000);
		System.out.println(acct.getBalance());
		System.out.println(acct.getAcDetails());

	}

}
