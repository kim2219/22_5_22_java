
public class Exarray {

	public static void main(String[] args) {
//		2���� �迭 �ڵ� (size : 9*9, variable: int)
		
		
		int[][] arr = new int[9][9];
		

		
		for(int i = 1; i <= arr.length; i++) {
			for(int j = 1; j <= arr.length; j++) {
			   
				
				 System.out.print(" "+ i*j + " ");
				
	    	} 
			System.out.println();
		}
	
	}

}
