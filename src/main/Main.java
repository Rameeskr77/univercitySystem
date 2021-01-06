package main;

import consoleread.CourseConsoleReader;
import consoleread.SeminarConsoleReader;
import consoleread.StudentConsoleReader;
import domain.Course;
import domain.Seminar;
import domain.Student;
import fileread.SeminarFileRead;
import fileread.StudentFileRead;
import serialization.StudentSerialize;
import writefile.CourseWriteFile;
import writefile.SeminarWriteFile;
import writefile.StudentWriteFile;

public class Main {
	
	public static void main(String args[]){
		
		
		SeminarConsoleReader seminarConsoleReader = new SeminarConsoleReader();
		Seminar seminar =  seminarConsoleReader.makeSeminar();
		System.out.println(seminar.toString());
		
		SeminarWriteFile writerTest = new SeminarWriteFile();
		writerTest.writeToFile("Files/Seminar.txt",seminar);
		
		SeminarFileRead readfile = new SeminarFileRead();
		readfile.readAsString("Files/Seminar.txt");
		
		CourseConsoleReader courseConsoleReader = new CourseConsoleReader();
		Course course =  courseConsoleReader.makeCourse();
		System.out.println(course.toString());
		
		CourseWriteFile writerTest1 = new CourseWriteFile();
		writerTest1.writeToFileC("Files/Course.txt",course, seminar);
		
		SeminarFileRead readfile1 = new SeminarFileRead();
		readfile1.readAsString("Files/Course.txt");
		
		StudentConsoleReader studentConsoleReader = new StudentConsoleReader();
		Student student =  studentConsoleReader.makeStudent();
		System.out.println(student.toString());
		
		StudentWriteFile writerTest2 = new StudentWriteFile();
		writerTest2.writeToFileS("Files/Student.txt",course, student);
		
		StudentFileRead readfile2 = new StudentFileRead();
		readfile2.readAsString("Files/Student.txt");
		
		StudentSerialize serializeDemo = new StudentSerialize();
		serializeDemo.serializeStudent("Files/Serialization.txt", student);
		serializeDemo.deserializeStudent();
	}

}
