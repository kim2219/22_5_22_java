
public class main {

	public static void main(String[] args) {
		System.out.println("arrayEx ���α׷� ����");
//		///
//		int arr[] = new int[3];
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 2;
		
//		int arr[] = new int[] {0, 1, 2};
//		
		
//		�迭�� ���ҿ� ���� (100�� ���� ���ǽ� ����)
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i+1;
			
		}
		
		 int i = 0;
		 while(i < 100) {
			arr[i] = i+1;
			 i++;
			 
		 }
	
//   �迭�� ���� ��� (100�� ���� ���ǽ� ���)
//	 for (int i  = 0; i < 100; i++) {
//		 System.out.println(arr[i]);
//		 
		 
		int j = 0;
		while(j < 100) {
			System.out.println(arr[j]);
			j++;
		}
				
		
	 }
}
