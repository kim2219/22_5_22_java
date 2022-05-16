package classProject;

public class main {
	public static void main(String[] args) {
		Student student1 = new Student();
		Bus bus123 = new Bus();
		Subway subway1 = new Subway();
		
		
		
		student1.takeBus(bus123);
		System.out.println(student1.getMoney());
		
		bus123.take(1000);
		System.out.println();
		
		student1.setGrade(3);
		System.out.println();
				
		student1.setMoney(1000);
		System.out.println();	
		
	}

}
