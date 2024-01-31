// Lab02AStudentLastName.java
// Student starting version of the Lab02A assignment.
// Student Name:   Cyrus Gronblom          Date: 1/31/24
// Purpose of Program: 
// Computes hours, minutes, seconds and milliseconds in 10000123 Milisecond 


public class Lab02AGronblom
{
	public static void main(String[] args)
	{
		System.out.println("Lab02A Calculate Hours, Minutes, Seconds, and Miliseconds in 10000123 Miliseconds\n");
		int startMill = 10000123; // Start milliseconds
		int hours = startMill / 60 / 60 / 1000; // Hours
		startMill -= hours * 60 * 60 * 1000;
		int minutes = startMill / 60 / 1000; //Minutes
		startMill -= minutes * 60 * 1000;
		int seconds = startMill / 1000; // Seconds
		int milliseconds = startMill - seconds * 1000; // Remaining Milliseconds

		// Print out data
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		System.out.println("Milliseconds: " + milliseconds);
	}


}

