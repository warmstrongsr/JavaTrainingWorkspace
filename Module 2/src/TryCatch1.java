import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class TryCatch1 {

	static FileInputStream file;
	
	public static void main(String[] args) {
		try {
			file = new FileInputStream("file.txt");
		}catch(Exception e) {
			//recovery procedures 
			//create file.. then open it
			//log exception
		}
	}

}
