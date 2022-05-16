package classProject;

public class Student {
	private String name;
	private int grade;
	private int money;
	
	public String getName() { 
		return name;
		}
	
	public int getGrade() { 
		return grade;
		}
	
	public int getPrice() { 
		return money;
		}
	
	public void setStudentName(String studentName) {
		this.name = studentName;
	} 
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
// public Student(String studentName, int money) {
//	 this.studentName = studentName;
//	 this.money = money;
// }
// public void takeBus(Bus bus){
//	 bus.take(1000);
//	 money -= 1000;
//	 }
// public void showLnfo() {
//	 System.out.println(studenName + "학생의 남은 돈은" + money + "입니다.");
//  }

	public char[] getMoney() {
		// TODO Auto-generated method stub
		return null;
	}
 }