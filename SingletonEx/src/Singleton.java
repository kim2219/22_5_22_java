
public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
	  System.out.println("Singleton ������ ȣ��");
	}
    
	public static Singleton getlnstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
