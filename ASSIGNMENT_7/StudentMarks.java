package assignment_6;

import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers:");
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}
		int sum = 0;
		int i=0;
		int max=al.get(0);
		Iterator<Integer> it = al.iterator();
		System.out.print("Marks :");
		while (it.hasNext()) {
			int now = it.next();
			System.out.print(i+1+"-"+now+" ");
			i++;
			if (max < now)
				max = now;
			sum = sum + now;
		}
		//System.out.println("\n");
		System.out.println("\nHighest marks:" + max);
		float avg = (float) sum / (float) n;
		System.out.println("Average Marks by students:" + avg);
		System.out.println("Third student marks is " + al.get(2));
		Collections.sort(al);
		System.out.print("Sorted :");
		for (int p = 0; p < n; p++) {
			System.out.print(p + 1 + "-" + al.get(p) + " ");
		}
		sc.close();
	}

}
