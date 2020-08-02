package assignment_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class States {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\New folder\\New folder\\states.txt");
		BufferedReader objReader = new BufferedReader(new FileReader(file));
		Set<String>stateslist=new HashSet<String>();
		  String strCurrentLine;
		  int starstWithK=0;
		while ((strCurrentLine = objReader.readLine()) != null) {

			    System.out.println(strCurrentLine);
			    stateslist.add(strCurrentLine);			 
			   }
		System.out.println("Number of states:"+stateslist.size());
		stateslist.remove("Delhi");
		Iterator itr=stateslist.iterator();
		while(itr.hasNext()) {
			String currentString=(String) itr.next();
		    if((currentString.charAt(0)=='k')||(currentString.charAt(0)=='K'))
		    {
		    	starstWithK++;
		    }
		}
		System.out.println("No of states starts with k: "+starstWithK);
		System.out.println("After removing Delhi the states are="+stateslist);
		BufferedReader objReader1 = new BufferedReader(new FileReader(file));
		SortedSet<String>statesList = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		  String strcurrentLine;
		while ((strcurrentLine = objReader1.readLine()) != null) {
			    statesList.add(strcurrentLine);			 
			   }
		 System.out.println("States list sorted: " +statesList);

	}

}
