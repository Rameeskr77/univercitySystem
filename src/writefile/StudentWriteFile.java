package writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import domain.Course;
import domain.Student;

public class StudentWriteFile {
	private FileOutputStream fos;
	private BufferedWriter out;
	
	public StudentWriteFile() {
		
	}
	
	public void writeToFileS(String path, Course course, Student student) {
		System.out.println("======writing data to the file======");
		try {

			fos = new FileOutputStream(new File(path),true);
			out = new BufferedWriter(new OutputStreamWriter(fos));
			StringBuilder builder = new StringBuilder();
			builder.append(student.getstudentid());
			builder.append(".");
			builder.append(student.getstudentname());
			builder.append(",");
			builder.append(student.getstudentphonenumber());
			builder.append(",");
			builder.append(student.getstudentemailaddress());
			builder.append(",");
			builder.append(course.getcoursename());
			

			out.write(new String(builder));

		} catch (IOException e) {
			System.out.println("An I/O Exception Occurred: " + e);
		} finally {
			try {
				out.flush();
				out.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		System.out
		.println("==================================================================================");
	
	}

}
