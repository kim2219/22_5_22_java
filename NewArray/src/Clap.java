
public class Clap {

	public static void main(String[] args) {
		
//		int[][] arr = new int[10][10];
//		int num[] = {2, 3, 5, 9, 17, 33, 65};
//		
//		for(int i = 2; i <= arr.length; i++ ) {
//			if(i%2==2 ) {
//				System.out.println(i);
//			}
//		}
//		int[][] arr = new int[10][10];
//		
//		for(int i = 2; i <= arr.length; i++) {
//			for(int j = 1; j <= arr.length; j++) {
//				arr[i][j] += i*j; 
//			
//				System.out.println(arr[i][j]);
//			}
		int[][] arr = new int[10][10];
//		int num[] = {2, 3, 5, 9, 17, 33, 65};
		
		 int n = 1;
		 int k = 2;
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int j= 0; i < arr.length; j++) {
				 arr[i][j] = n;
				 if(arr[i][j] == k) {
					 System.out.print("(Â¦)");
					 k = k + k -1;
				 }else {
					 System.out.println("(½²)");
				 } n++;
			 }
			   System.out.println();
		 }
	    } 
		
	 }
			
				
		
//		int num=1, sum=0;
//
//		 while(num<=67)
//		 {
//		  if(num%2==0 && num%6==0)   // 2ÀÇ¹è¼öÀÌ¸é¼­ ...
//		  {
//		  System.out.println(num);
//		  sum=sum+num;
//		  }
//		  num++;
//		 }
//		 System.out.println("ÇÕ : "+ sum);
//		}
	
		
	


