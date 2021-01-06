package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import domain.Student;

public class StudentSerialize {
	private Student student;
	
	public void serializeStudent(String fileName, Student student) {
		System.out.println("======Writing to the file======");
		try {
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(student);
			out.close();
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException i) {
			i.printStackTrace();
		}
		System.out
				.println("==================================================================================");
	}
	
	public void deserializeStudent() {
		System.out.println("======Reading from the file======");
		student = null;
		try {
			FileInputStream fileIn = new FileInputStream(
					"Files/Serialization.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			student = (Student) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println(".Student class not found.");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Student...");
		System.out.println("ID: " + student.getstudentid());
		System.out.println("Category: " + student.getstudentname());
		System.out.println("Rate: " + student.getstudentphonenumber());
		System.out.println("Description: " + student.getstudentemailaddress());
		System.out
				.println("==================================================================================");

	}

}
