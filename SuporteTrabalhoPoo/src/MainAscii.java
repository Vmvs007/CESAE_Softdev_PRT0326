import java.io.FileNotFoundException;

public class MainAscii {
    public static void main(String[] args) throws FileNotFoundException {

        FileTools.printFile("resources/images/castle.txt");

        System.out.println("\n");

        FileTools.printFile("resources/images/dino.txt");
    }
}
