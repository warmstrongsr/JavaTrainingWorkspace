
public class Shadow {

	public static void main(String[] args) {
		Child child = new Child();
		int returned = child.getX();
		System.out.print(returned);
	}
}

class Parent {
	int x = 10;
}
class Child extends Parent {
	int x = 5;
	
	public void setX(int x)	{
		this.x = x;
	}
	
	public int getX() {
		return super.x;
	}
}
