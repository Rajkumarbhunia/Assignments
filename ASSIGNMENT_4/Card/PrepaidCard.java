package assignment_31;
public abstract class PrepaidCard {
	int cardNo;
	double availableBalance=0;
	double swipeLimit=400;
	public abstract boolean swipeCard(int amount);

public String toString()
{
	return("Card No:"+cardNo+"\nAvailable Balance:"+availableBalance);
}

public void rechargeCard(int amount)
{
	this.availableBalance+=amount;
	System.out.println("Recharged successfully:"+amount);
}

public PrepaidCard()
{
	
}
public int getCardNo() {
	return cardNo;
}

public void setCardNo(int cardNo) {
	this.cardNo = cardNo;
}

public double getAvailableBalance() {
	return availableBalance;
}

public void setAvailableBalance(double availableBalance) {
	this.availableBalance = availableBalance;
}
}