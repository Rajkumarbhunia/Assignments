package assignment_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestPatientlist {
	public static void main(String[] args) {
		Patient patient1=new Patient(1,"Dipak",35);
		Patient patient2=new Patient(2,"Ravi",58);
		Patient patient3=new Patient(3,"Tina",36);
		ArrayList<Patient> patientlist=new ArrayList<Patient>();
		patientlist.add(patient1);
		patientlist.add(patient2);
		patientlist.add(patient3);
		System.out.println("Patient name sorted: ");
		Collections.sort(patientlist,Patient.PtNameCompare);
		for(Patient ptr:patientlist)
		{
			System.out.println(ptr);
		}
		Collections.sort(patientlist,Patient.PtAgeCompare);
		Iterator<Patient> itr=patientlist.iterator();
		System.out.println("age sorted: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set<Patient> patientslist=new TreeSet<Patient>();
		patientslist.add(patient1);
		patientslist.add(patient2);
		patientslist.add(patient3);
		System.out.println("Treeset:");
		Iterator<Patient> itr1 =patientslist.iterator();
		while(itr1.hasNext()){
		    System.out.println(itr1.next());
		    
		}
		System.out.println(" Patient age is"+TestPatientlist.getPatientAge(patientslist, "Tina"));
		
	}
		public static int getPatientAge(Set<Patient> patientslist,String name) {
			 Iterator<Patient> iterator =patientslist.iterator();
		        while(iterator.hasNext()) {
		            if(iterator.next().getName().equals(name))               
		                return iterator.next().getAge();
	}
				return 0;

}
}
