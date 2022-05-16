
public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
	  System.out.println("Singleton 생성자 호출");
	}
    
	public static Singleton getlnstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
