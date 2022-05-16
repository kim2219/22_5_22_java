
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People peopleKim = new People("김학생", 19, 1000, "학생");
		People peopleNa = new People("나가난", 15, 100, "학생");
		People peoplePark = new People("박재현", 32, 1000000, "직장인");
		People peopleLee = new People("이현수", 31, 100000, "직장인");
		
		peopleKim.takeBus();
		peopleNa.takeSubway();
		peoplePark.takeBus();
		peopleLee.takeSubway();

	}

}
