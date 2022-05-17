
public class main {

	public static void main(String[] args) {
		System.out.println("arrayEx 프로그램 시작");
//		///
//		int arr[] = new int[3];
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 2;
		
//		int arr[] = new int[] {0, 1, 2};
//		
		
//		배열의 원소에 접근 (100에 따른 조건식 생성)
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i+1;
			
		}
		
		 int i = 0;
		 while(i < 100) {
			arr[i] = i+1;
			 i++;
			 
		 }
	
//   배열의 원소 출력 (100에 따른 조건시 출력)
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
