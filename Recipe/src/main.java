
public class main {

	public static void main (String[] arge) {
		System.out.println("���α׷��� ���۵Ǿ����ϴ�.");
		recipe recip;
		
		recipe recipe;
		recipe = new recipe();//instance ����
		
		recipe.setSource(2);
		System.out.println(recipe.getSource());
		
		recipe = recipe;
		System.out.println(recipe.getSource());
		
	}
}
