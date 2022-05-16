package functionEX;

public class main {
	public static void main(String[] args) {
		System.out.println("프로그램이 시작 되었습니다.");
		Method function = new Method();
		String data = "데이터";
		function.setData(data, data);//값을 전달
		System.out.println("main data:" + data);
		
		
		int num = 10;
		function.setInt(num);
		System.out.println("main num :" + num);
	}

}
