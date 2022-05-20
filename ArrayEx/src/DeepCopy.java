package arryCopy;

public class DeepCopy {

	public static void main(String[] args) {
		bookArray[] bookArray1 = new bookArray[5];
		bookArray[] bookArray2 = new bookArray[5];
	
		bookArray1[0] = new bookArray("책1", "저자1");
		bookArray1[1] = new bookArray("책2", "저자2");
		bookArray1[2] = new bookArray("책3", "저자3");
		bookArray1[3] = new bookArray("책4", "저자4");
		bookArray1[4] = new bookArray("책5", "저자5");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 5);
		
		for(int i = 0; i < bookArray1.length; i++) {
			
			System.out.println("책이름:" + bookArray2[i].getBookName());
			System.out.println("저자:" + bookArray2[i].getAuthor());
		}
		
		bookArray[] bookArray3 = new bookArray[5];
		bookArray3[0] = new bookArray("책1", "저자1");
		bookArray3[1] = new bookArray("책2", "저자2");
		bookArray3[2] = new bookArray("책3", "저자3");
		bookArray3[3] = new bookArray("책4", "저자4");
		bookArray3[4] = new bookArray("책5", "저자5");
		
		

		for(int i = 0; i < bookArray1.length; i++) {
			bookArray3[i].setBookName(bookArray1[i].getBookName());
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
			
			System.out.println(bookArray3);
		}
		
	
		
		
//		System.out.println(book1.hashCode());
//		System.out.println(book2.hashCode());
//		
//		book1.setBookName(book1.getBookName());
//		book2.setBookName(book1.getAuthor());
//		book2.showBookArrayInfo();
//		
//		

	}

}
