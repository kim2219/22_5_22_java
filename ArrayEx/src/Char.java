
public class Char {

	public static void main(String[] args) {
		System.out.println("arrayEx 프로그램 시작");
//		char[] arr =new char[10];
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
//		char d = 'D';
//		char e = 'E';
//		char f = 'F';
//		char g = 'G';
//		char h = 'H';
//		char i = 'I';
//		char j = 'J';
//		
		
		char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		String str = new String(arr);
		System.out.println();
		
		
		char[] charArray1 = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		String stringFromCharArray = new String(charArray1);
		System.out.print(stringFromCharArray);
		
		char[] charArr = new char[10];
		int a = 65;
		for (int i = 0; i < 10; i++) {
			charArr[i] = (char)a;
			a++;
			
			System.out.println(charArr[i]);
			
		}
		
	}

}  
