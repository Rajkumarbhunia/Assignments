package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProverbReader {
	public static String reverseWord(String proverb)throws Exception
	{
		StringBuilder sb=new StringBuilder(proverb);
		sb.reverse();
		return sb.toString();	
	}
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\dxc\\Badminton\\TopProverbs.txt");
		File file1 = new File("E:\\dxc\\Badminton\\ReverseProverbs.txt");
		file1.createNewFile();
		BufferedReader objReader = new BufferedReader(new FileReader(file));
		BufferedWriter writer = new BufferedWriter(new FileWriter(file1,true));
		 String strCurrentLine;
	while ((strCurrentLine = objReader.readLine()) != null) {
				String reverse=reverseWord(strCurrentLine);
				System.out.println(reverse);
				writer.write(reverse);
				writer.newLine();
			    System.out.println(reverse);
			   }
		objReader.close();
		writer.close();

	}

}
