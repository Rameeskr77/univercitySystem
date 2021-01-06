package domain;

public class Seminar {
	int seminarno;
	String seminarname;
		
		public Seminar()
		{
			this.seminarno = 0;
			this.seminarname = null;
		}
		
		public Seminar(int seminarno,String seminarname)
		{
			this.seminarno=seminarno;
			this.seminarname =seminarname ;
		}
		public int getseminarno()
		{
			return seminarno;
		}
		public void setseminarno(int seminarno)
		{
			this.seminarno=seminarno;
		}
		public String getseminarname()
		{
			return seminarname;
		}
		public void setseminarname(String seminarname)
		{
			this.seminarname = seminarname;
		}

		@Override
		public String toString() {
			return "Seminar [seminarno=" + seminarno + ", seminarname=" + seminarname + "]";
		}
		

}
