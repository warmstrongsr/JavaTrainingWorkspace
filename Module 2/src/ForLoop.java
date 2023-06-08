
public class ForLoop {

	public static void main(String[] args) {
		loop(10);

	}
	
	static void loop(int max) {
		//counter variable; condition; increment
		for(int i = 0; i < max; i ++) {
			System.out.print(i);
		}
	}
}
//for (int i = 0; i < array.length; i++) {
//		array[i] = i + 2;
//		}