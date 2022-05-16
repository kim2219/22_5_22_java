
public class main {

	public static void main (String[] arge) {
		System.out.println("프로그램이 시작되었습니다.");
		recipe recip;
		
		recipe recipe;
		recipe = new recipe();//instance 생성
		
		recipe.setSource(2);
		System.out.println(recipe.getSource());
		
		recipe = recipe;
		System.out.println(recipe.getSource());
		
	}
}
