package domain;

public class Course {
	int courseid;
	String coursename;
	double coursefees;
		
		public Course()
		{
			this.courseid = 0;
			this.coursename = null;
			this.coursefees = 0;
		}
		
		public Course(int courseid,String coursename,double coursefees)
		{
			this.courseid=courseid;
			this.coursename =coursename ;
			this.coursefees = coursefees;
		}
		public int getcourseid()
		{
			return courseid;
		}
		public void setcourseid(int courseid)
		{
			this.courseid=courseid;
		}
		public String getcoursename()
		{
			return coursename;
		}
		public void setcoursename(String coursename)
		{
			this.coursename = coursename;
		}
		public double getcoursefees()
		{
			return coursefees;
		}
		public void setcoursefees(double coursefees)
		{
			this.coursefees = coursefees;
		}

		@Override
		public String toString() {
			return "Course [courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees + "]";
		}

		
}
