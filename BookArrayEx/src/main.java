
public class main {

	public static void main(String[] args) {
		Book[] bookArr = new Book[5];
		bookArr[0] = new Book("헤리포터", "J.K 롤링");
		bookArr[1] = new Book("정의란 무엇인가", "마이크 샌델");
		bookArr[2] = new Book("Do it java 프로그래밍", "박은종");
		bookArr[3] = new Book("어린왕자","생택쥐베리");
		bookArr[4] = new Book("괭이부리말 아이들","김종미");
		
		for(int i = 0; i <  bookArr.length; i++) {
		
			System.out.println("책이름" + bookArr[i].getBookName());
			System.out.println("저자" + bookArr[i].getAuthor());
		}

	}

}
