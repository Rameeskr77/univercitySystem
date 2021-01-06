package writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import domain.Seminar;

public class SeminarWriteFile {
	private FileOutputStream fos;
	private BufferedWriter out;
	
	public SeminarWriteFile() {
		
	}
	
	public void writeToFile(String path, Seminar seminar) {
		System.out.println("======writing data to the file======");
		try {

			fos = new FileOutputStream(new File(path),true);
			out = new BufferedWriter(new OutputStreamWriter(fos));
			StringBuilder builder = new StringBuilder();
			builder.append(seminar.getseminarno());
			builder.append(".");
			builder.append(seminar.getseminarname());
			builder.append(",");
			

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
