package arryCopy;

public class main {

	public static void main(String[] args) {
		System.out.println("arrayEx 프로그램 시작");
		int []array1 = {10, 20, 30, 40, 50};
		int []array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 0, array2, 0, array1.length);
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}


	}

}
