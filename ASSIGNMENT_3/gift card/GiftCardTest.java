package assignment_3;

public class GiftCardTest {
	
	public static void main(String[] args) {
		GiftCard gct=new GiftCard(100,0.0,true);
		gct.rechargeCard(3000);
		System.out.println(gct.getBalance());
		gct.swipeCard(400.0);
		gct.swipeCard(500.0);
		System.out.println(gct.getBalance());
		GiftCard gctn=new GiftCard();
		gctn.setActive(true);
		gctn.rechargeCard(3000);
		System.out.println(gctn.getBalance());
		gctn.swipeCard(500);
		System.out.println(gctn.getBalance());
		gctn.swipeCard(2600);
		
		

	}

}
