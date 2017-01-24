/**
 * 
 */
package exercise1;

import java.util.ArrayList;

/**
 * @author Waynell Lovell
 *
 */
public class Clinic {
	Address address;
	ArrayList <Patient> patients;
	
	public void addPatient(Patient value)
	{
		patients.add(value);
	}
	public void removePatient(String value)
	{
		patients.remove(value);
	}
	public void setAddress(String value1, String value2, String value3)
	{
		new Address(value1,value2,value3);
	}
	public ArrayList<Patient> getAllPatients()
	{
		return patients;
	}

	public Clinic()
	{
		patients =new ArrayList<Patient>();
	}
}
