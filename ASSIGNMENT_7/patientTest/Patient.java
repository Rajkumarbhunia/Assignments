package assignment_6;

import java.util.Comparator;

public class Patient implements Comparable<Patient> {
	private int patientId;
	private String name;
	private int age;
	public Patient(int patientId,String name,int age) {
		super();
		this.patientId=patientId;
		this.name=name;
		this.age=age;
	}
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static Comparator<Patient>PtNameCompare=new Comparator<Patient>() {

		@Override
		public int compare(Patient p1, Patient p2) {
			String pName1=p1.getName();
			String pName2=p2.getName();	
			return pName1.compareTo(pName2);
		}
		
	};	
	public static Comparator<Patient>PtAgeCompare=new Comparator<Patient>() {

		@Override
		public int compare(Patient p1, Patient p2) {
			int age1=p1.getAge();
			int age2=p2.getAge();	
			return age1-age2;
		}
		
	};
	public String toString() {
		return"[Patient Id="+patientId+" "+ "Name="+name+" "+"Age="+age+"]";
	}
	@Override
	public int compareTo(Patient b) {
	    if(patientId>b.patientId){  
	        return 1;  
	    }else if(patientId<b.patientId){  
	        return -1;  
	    }else{  
	    return 0;  
	    }
	}
}
