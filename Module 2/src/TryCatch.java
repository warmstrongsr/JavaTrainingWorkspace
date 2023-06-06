import java.io.FileInputStream;

public class TryCatch {

    static FileInputStream file;

    public static void main(String[] args) {
        try {
            file = new FileInputStream("file.txt");
        }catch (FileNotFoundException e) {}
        // recovery procedueres
        // create file.. then open it
        // log exception
    }
}