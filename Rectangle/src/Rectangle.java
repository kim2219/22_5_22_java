
public class Rectangle {
	
	int x;
	int y;
	int width;
	int height;
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
				
		}
	
	
	public int square() {
		return(width*height);
	}
	
	public void show() {
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	
	Boolean contains(Rectangle r) {
		if(x < r.x && y < r.y) {
			if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height)) {
				return true;
			}
		}
		return false;
	}

}
