package assignment_3;

public class GiftCard {
	private long cardNo;
	private double balance;
	private boolean active;
	
	public GiftCard(long cardNo,double balance,boolean active)
	{
		this.cardNo=cardNo;
		this.balance=balance;
		this.active=active;
	}
	public GiftCard() {}
	{
		this.balance=0.0;
	}
	
	public void rechargeCard(int amount)
	{
		if(this.active==true)
		{
			System.out.println("Successfully recharged.....");
		  this.balance=this.balance+amount;
		}
	}
	public void swipeCard(double amount) {
		if (this.active==true)
				{
		if (this.balance >= amount) 
		{
			this.balance = this.balance - amount;
		}
		else 
		{
		
			System.out.println(" Unsuccessful balance is lower than your swipe amount");
		}
	}
		else
		{
		System.out.println(" Card is inactive");
		
	}
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public double getBalance() {
		return balance;
	}

	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
