package fileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CourseFileRead {
	private FileReader fr;
	private BufferedReader br;

	public CourseFileRead() {
		
	}
	
	public void readAsString(String path) {
		try {
			System.out.println("======Reading from the file======");
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String s;
			while ((s = br.readLine()) != null)
				System.out.println(s);
			
		} catch (IOException e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		System.out
				.println("==================================================================================");
	}

}
