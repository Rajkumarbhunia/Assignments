/*1. Create a method depositAmount in Account Class. 
- Deposit should be successful only if account is active. 
- Balance should be increased in the method on successful deposit */

package assignment_3;

public class Account {
	boolean isActive = false;
	double balance;

	public boolean depositAmount(int amount) {
		if (isActive == true) {
			System.out.println("Deposit successful");
			this.balance = balance + amount;
			return true;
		}

		else
			System.out.println("Deposit Unsuccessful Account is not active");
		return false;
	}

	public boolean isActAcc() {
		return isActive;
	}

	public void setActAcc(boolean actAcc) {
		this.isActive = actAcc;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		Account acc = new Account();
		acc.depositAmount(5000);
		System.out.println(acc.getBalance());
		acc.isActive = true;
		acc.depositAmount(1000);
		System.out.println(acc.getBalance());

	}

}
