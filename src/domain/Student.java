package domain;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int studentid;
	String studentname;
	long studentphonenumber;
	String studentemailaddress;
		
		public Student()
		{
			this.studentid = 0;
			this.studentname = null;
			this.studentphonenumber = 0;
			this.studentemailaddress = null;
		}
		
		public Student(int studentid,String studentname,long studentphonenumber,String studentemailaddress)
		{
			this.studentid=studentid;
			this.studentname =studentname ;
			this.studentphonenumber =studentphonenumber;
			this.studentemailaddress = studentemailaddress;
		}
		public int getstudentid()
		{
			return studentid;
		}
		public void setstudentid(int studentid)
		{
			this.studentid=studentid;
		}
		public String getstudentname()
		{
			return studentname;
		}
		public void setstudentname(String studentname)
		{
			this.studentname = studentname;
		}
		public long getstudentphonenumber()
		{
			return studentphonenumber;
		}
		public void setstudentphonenumber(long studentphonenumber)
		{
			this.studentphonenumber = studentphonenumber;
		}
		public String getstudentemailaddress()
		{
			return studentemailaddress;
		}
		public void setstudentemailaddress(String studentemailaddress)
		{
			this.studentemailaddress = studentemailaddress;
		}

		@Override
		public String toString() {
			return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentphonenumber="
					+ studentphonenumber + ", studentemailaddress=" + studentemailaddress + "]";
		}
		

}
