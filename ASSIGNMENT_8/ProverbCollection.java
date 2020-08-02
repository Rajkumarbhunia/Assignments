package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProverbCollection {
	public static void storeProverb(String proVerb) throws IOException {
		File file = new File("E:\\dxc\\Badminton\\TopProverbs.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
		//BufferedWriter writer = new BufferedWriter(new FileWriter("TopProverbs.txt",true));
		writer.write(proVerb);
		writer.newLine();
		writer.flush();
		writer.close();
	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Proverb or write STOP to Exit");
		while (true) {
			String proverb = sc.nextLine();
			if (proverb.equals("STOP")) {
				break;

			} else {

				storeProverb(proverb);

			}

		}

		sc.close();
	}

}
