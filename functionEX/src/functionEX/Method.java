package functionEX;

public class Method {
	public void setData(String data, String data2) {//선언 (같은 이름 안됨)
		data = "데이터1";
	    data2 = "데이터2";
		System.out.println("method.setData data :" + data);
		System.out.println("method.setData data2 :" + data2);
	}
public void setInt(int num) {
	num = 11;
	System.out.println("method.setInt num:" + num);
}
}
