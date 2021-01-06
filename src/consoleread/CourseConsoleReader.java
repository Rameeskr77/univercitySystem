package consoleread;

import java.util.InputMismatchException;
import java.util.Scanner;

import domain.Course;

public class CourseConsoleReader {
private Scanner userInputScanner;
	
	public CourseConsoleReader() {
	}
	
	public Course makeCourse() {
		System.out.println("======Making the Course======");
		userInputScanner = new Scanner(System.in);
		Course course = new Course();
		askCourseId(course);
		askCourseName(course);
		askCourseFees(course);
		
		System.out.println("==================================================================================");
		return course;
		
	}
	
	private void askCourseId(Course course) {
		
		System.out.print("Please enter the Course Id:");
		try {
			course.setcourseid(userInputScanner.nextInt());
			if (course.getcourseid() == 0) {
				askCourseId(course);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			
			System.out.println("Incorrect data");
			course.setcourseid(0);
		}
		System.out
		.println("==================================================================================");
	}
	
	private void askCourseName(Course course) {
		System.out.print("Please enter the Course Name:");
		try {
			course.setcoursename(userInputScanner.next());
			if(course.getcoursename()== null|| course.getcoursename().trim().equals("")) {
			askCourseName(course);
			System.out.println("You have entered an invalid value!");
			}
		}
		catch (InputMismatchException e) {
			
			System.out.println("Your data format is incorrect:");
			course.setcoursename(null);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}
	private void askCourseFees(Course course) {
		// TODO: Implement this..
		System.out.println("Please enter the Course Fees:");
		try {
			course.setcoursefees(userInputScanner.nextDouble());

			if (course.getcoursefees() == 0 || course.getcoursefees() == 0) {
				askCourseFees(course);
				System.out.println("You have entered an invalid value!");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Your data format is incorrect:");
			course.setcoursefees(00.00);
			// e.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}

}
