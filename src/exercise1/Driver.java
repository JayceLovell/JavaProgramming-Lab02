package exercise1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clinic patients = new Clinic();
		patients.addPatient(createPatient(21,"Waynell","Lovell",1));			
	}
	private static Patient createPatient(int age,String firstName,String lastName,int patientID)
	{
		// TODO Auto-generated method stub
		Patient patient = new Patient(patientID,firstName,lastName,age);
		return patient;
	}
	private static void printPatients()
	{
	}
}