
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			switchCase("B");
	}
	static void switchCase(String val) {
		switch(val) {
		case "A": {
			System.out.println("A");
			break;
		}case "B": {
			System.out.println("B");
			break;
		}default : {
			System.out.println("Default");
			break;
		}
		}
	}

}


