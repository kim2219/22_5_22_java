package arryCopy;

import java.awt.print.Book;

public class bookArray {
	
	String bookName;
	String author;
	
	public bookArray(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
		
	}

	public void setBookName(String _bookName) {
		this.bookName = _bookName;
	}
	
	public void setAuthor(String _author) {
		this.author = _author;
		
	}
	
	public String getBookName() {
		return this.bookName;
		
	}
	public String getAuthor() {
		return this.author;
	}

	public void showBookArrayInfo () {
		
		
		
	}

	
	
	

//	public static void main(String[] args) {
//		
//		Book[] bookArray1 = new Book[3];
//		Book[] bookArray2 = new Book[3];
//		
//		bookArray1[0] = new Book("�¹���1", "������");
//		bookArray1[1] = new Book("�¹���2", "������");
//		bookArray1[2] = new Book("�¹���3", "������");
//		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 0);
//		
//		for(int i = 0; i < bookArray2.length; i++) {
//			bookArray2[i].showBookInfo();
//			
//		}
//		 
//		bookArray1[0].setBookName("����");
//		bookArray1[0].setAuthor("�ڿϼ�");
//		
//		for(int i = 0; i < bookArray1.length; i++) {
//			bookArray1[i].showBookInfo();
//		}
//		
//		System.out.println("=========");
//
	}


