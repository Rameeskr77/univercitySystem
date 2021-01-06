package consoleread;

import java.util.InputMismatchException;
import java.util.Scanner;

import domain.Student;

public class StudentConsoleReader {
private Scanner userInputScanner;
	
	public StudentConsoleReader() {
	}
	
	public Student makeStudent() {
		System.out.println("======Making the Student======");
		userInputScanner = new Scanner(System.in);
		Student student = new Student();
		askStudentId(student);
		askStudentName(student);
		askStudentPhoneNumber(student);
		askStudentEmailAddress(student);
		
		System.out.println("==================================================================================");
		return student;
		
	}
	
	private void askStudentId(Student student) {
		
		System.out.print("Please enter the Student Id:");
		try {
			student.setstudentid(userInputScanner.nextInt());
			if (student.getstudentid() == 0) {
				askStudentId(student);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			
			System.out.println("Incorrect data");
			student.setstudentid(0);
		}
		System.out
		.println("==================================================================================");
	}
	
	private void askStudentName(Student student) {
		System.out.print("Please enter the Student Name:");
		try {
			student.setstudentname(userInputScanner.next());
			if(student.getstudentname()== null|| student.getstudentname().trim().equals("")) {
			askStudentName(student);
			System.out.println("You have entered an invalid value!");
			}
		}
		catch (InputMismatchException e) {
			
			System.out.println("Your data format is incorrect:");
			student.setstudentname(null);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}
	private void askStudentPhoneNumber(Student student) {
		
		System.out.print("Please enter the Student Phone Number:");
		try {
			student.setstudentphonenumber(userInputScanner.nextLong());
			if (student.getstudentphonenumber() == 0) {
				askStudentPhoneNumber(student);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			
			System.out.println("Incorrect data");
			student.setstudentid(0);
		}
		System.out
		.println("==================================================================================");
	}
	private void askStudentEmailAddress(Student student) {
		System.out.print("Please enter the Student Email Address:");
		try {
			student.setstudentemailaddress(userInputScanner.next());
			if(student.getstudentemailaddress()== null|| student.getstudentemailaddress().trim().equals("")) {
			askStudentEmailAddress(student);
			System.out.println("You have entered an invalid value!");
			}
		}
		catch (InputMismatchException e) {
			
			System.out.println("Your data format is incorrect:");
			student.setstudentemailaddress(null);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}

}
