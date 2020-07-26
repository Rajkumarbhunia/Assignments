package assignment_31;
import java.util.Random;
import java.util.Scanner;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine obj[] = new Medicine[5];

		Random randomGenerator = new Random();
		int no = randomGenerator.nextInt(4);
		if (no == 0) {
			obj[0] = new Tablet();
			obj[0].setPrice(200);
			obj[0].setExpiryDate("12/09/22");
			System.out.println(obj[0].getDetails());
			obj[0].displayLabel();
		}
		if (no == 1) {
			obj[1] = new Syrup();
			obj[1].setPrice(300);
			obj[1].setExpiryDate("12/09/2020");
			System.out.println(obj[1].getDetails());
			obj[1].displayLabel();
		} else {
			obj[2] = new Ointment();
			obj[2].setPrice(400);
			obj[2].setExpiryDate("1/09/21");
			System.out.println(obj[2].getDetails());
			obj[2].displayLabel();
		}

	}

}
