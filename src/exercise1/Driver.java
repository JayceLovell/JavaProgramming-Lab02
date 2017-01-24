package exercise1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clinic patients = new Clinic();
		patients.addPatient(createPatient(21,"Waynell","Lovell",1));
		patients.addPatient(createPatient(22,"Wayne","Lovell",2));
		patients.addPatient(createPatient(23,"Jayce","Lovell",3));
		patients.addPatient(createPatient(24,"Jake","Lovell",4));
		patients.addPatient(createPatient(25,"Sprite","Lovell",5));
		printPatients(patients.getAllPatients());
	}
	private static Patient createPatient(int age,String firstName,String lastName,int patientID)
	{
		// TODO Auto-generated method stub
		Patient patient = new Patient(patientID,firstName,lastName,age);
		return patient;
	}
	private static void printPatients(ArrayList<Patient> arrayList)
	{
		for(Patient item:arrayList)
		{
			System.out.print(item.getPatient_id());
			System.out.print(item.getFirstname());
			System.out.print(item.getLastname());
			System.out.println(item.getAge());
		}
	}
}