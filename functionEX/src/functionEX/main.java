package functionEX;

public class main {
	public static void main(String[] args) {
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		Method function = new Method();
		String data = "������";
		function.setData(data, data);//���� ����
		System.out.println("main data:" + data);
		
		
		int num = 10;
		function.setInt(num);
		System.out.println("main num :" + num);
	}

}
