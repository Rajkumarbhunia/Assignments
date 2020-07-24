package assignment_31;
interface Rewardable
{
	void rewardPoint(int amount);
}

public class TravelCard extends PrepaidCard implements Rewardable {
	int rewardPoint;

	@Override

	public void rewardPoint(int amount) {
	 this.rewardPoint=this.rewardPoint+(5*((amount*60)/100));
	}
	
	@Override
	public boolean swipeCard(int amount) {
		if(availableBalance>=amount && amount<=this.swipeLimit)
		{
			this.availableBalance=this.availableBalance-((amount*60)+(amount*(5/100)));
			System.out.println("Card swiped successsfully..");
			System.out.println("$"+amount+"deducted from available balance");
			return true;
		}
		else
			System.out.println("Not Successfull exceeding swipe limit!!!!!..");
		return false;
	}

	
	public int getRewardPoint() {
		return rewardPoint;
	}


	public String cardDetails()
	{
		return("Card No:"+cardNo+"\nAvailable Balance:"+availableBalance);
	}
}