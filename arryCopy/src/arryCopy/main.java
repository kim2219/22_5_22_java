package arryCopy;

import java.awt.print.Book;

public class main {

	public static void main(String[] args) {
//		System.out.println("arrayEx 프로그램 시작");
//		int []array1 = {10, 20, 30, 40, 50};
//		int []array2 = {1, 2, 3, 4, 5};
//		
//		System.arraycopy(array1, 0, array2, 0, array1.length);
//		for(int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}
//		
//		Book book1 = new book("책1", "저자1");
//		Book book2 = new book("책2", "저자2");
//	    book2.showBookInfo();
//		book2 = book1;
//		book2.showBookInfo();
//		book1.setBookName("다른책1");
//		book1.setAuthor("다른저자1");
//		book2.showBookInfo();
//		
//		
		int a= 5;
		int b = 6;
		b= a ;
		System.out.println(b);
		
		
//		int[] arr = new int[3];
//		int[][] arr2 = new int[2][3];
		
		
//		
//		int[] arr = {1, 2, 3};
//		int[][] arr2 = {{1, 2, 3},{1, 2, 3}};
		
//		int[][]arr = {{1, 2, 3}, {4, 5, 6}};
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//			}
//			System.out.println();
		
		  int[][] arr2 = new int[5][5];
		  
		   for(int i = 0; i < 5; i++) {
			   for(int j = 0; j <5; j++) {
				   arr2[i][j] =  arr2[i][j];
			   }
		   }
		}
		
		
			
		


	} 


