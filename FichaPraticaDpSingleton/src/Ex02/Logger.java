package Ex02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;

    private String filePath;

    private Logger(String filePath) {
        this.filePath = filePath;
    }

    public static Logger getInstance(String filePath) {
        if (instance == null) {
            instance = new Logger(filePath);
        }

        return instance;
    }

    public void info(String mensagem) throws IOException {

        FileWriter fw = new FileWriter(new File(filePath), true);
        fw.append("[INFO]: " + mensagem + "\n");
        fw.close();
    }

    public void aviso(String mensagem) throws IOException {

        FileWriter fw = new FileWriter(new File(filePath), true);
        fw.append("[AVISO]: " + mensagem + "\n");
        fw.close();
    }

    public void erro(String mensagem) throws IOException {

        FileWriter fw = new FileWriter(new File(filePath), true);
        fw.append("[ERRO]: " + mensagem + "\n");
        fw.close();
    }


}
