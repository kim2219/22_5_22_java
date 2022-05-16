
public class Grade {
	
	 int math;
	 int science;
	 int english;
	

	public Grade(int math, int science, int english) {
		
		this.math = math;
		this.science = science;
		this.english = english;
		
		// TODO Auto-generated constructor stub
	}

	public int average() {
		// TODO Auto-generated method stub
		return (math + science + english)/3;
	}

}
