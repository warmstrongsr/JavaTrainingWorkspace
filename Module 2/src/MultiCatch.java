import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	try {
		process();
		// specialized first -> more generalized
	}
	catch(ExecutionException | DataFormatException e) {
		// same code
	}
	}
	static void process() throws DataFormatException, ExecutionException{
		// code
	}
}	

