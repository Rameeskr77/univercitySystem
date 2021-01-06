package consoleread;

import java.util.InputMismatchException;
import java.util.Scanner;

import domain.Seminar;

public class SeminarConsoleReader {
	private Scanner userInputScanner;
	
	public SeminarConsoleReader() {
	}
	
	public Seminar makeSeminar() {
		System.out.println("======Making the Seminar======");
		userInputScanner = new Scanner(System.in);
		Seminar seminar = new Seminar();
		askSeminarNo(seminar);
		askSeminarName(seminar);
		
		System.out.println("==================================================================================");
		return seminar;
		
	}
	
	private void askSeminarNo(Seminar seminar) {
		
		System.out.print("Please enter the Seminar No:");
		try {
			seminar.setseminarno(userInputScanner.nextInt());
			if (seminar.getseminarno() == 0) {
				askSeminarNo(seminar);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			
			System.out.println("Incorrect data");
			seminar.setseminarno(0);
		}
		System.out
		.println("==================================================================================");
	}
	
	private void askSeminarName(Seminar seminar) {
		System.out.print("Please enter the Seminar Name:");
		try {
			seminar.setseminarname(userInputScanner.next());
			if(seminar.getseminarname()== null|| seminar.getseminarname().trim().equals("")) {
			askSeminarName(seminar);
			System.out.println("You have entered an invalid value!");
			}
		}
		catch (InputMismatchException e) {
			
			System.out.println("Your data format is incorrect:");
			seminar.setseminarname(null);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}
	
	

}
