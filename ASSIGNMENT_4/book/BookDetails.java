package assignment_4;
import java.util.Scanner;
public class BookDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book bk=new Book();
		
		System.out.println("Enter Author's name");
		bk.setAuthor(sc.nextLine());
		
		System.out.println("Enter book title");
		bk.setTitle(sc.nextLine());
		
		System.out.println("Enter book number");
		bk.setBookNo(sc.nextInt());
		
		System.out.println("Enter book Price");
		bk.setPrice(sc.nextFloat());
		
		System.out.println("Book author :"+bk.getAuthor()+"\nBook title: "+bk.getTitle()+"\nBook number: "+bk.getBookNo()+"\nBook price: "+bk.getPrice());
		sc.close();
	
		
	}

}
