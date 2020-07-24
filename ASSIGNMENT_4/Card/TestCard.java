 package assignment_31;

public class TestCard {

	public static void main(String[] args) {
		TravelCard tc=new TravelCard();
		tc.setCardNo(4537839);
		tc.rechargeCard(100000);
		tc.swipeCard(300);
		tc.rewardPoint(300);  
		System.out.println("Reward points:"+tc.getRewardPoint());
		System.out.println("Your available balance:"+tc.availableBalance);
		System.out.println(tc.cardDetails());
	}

}
