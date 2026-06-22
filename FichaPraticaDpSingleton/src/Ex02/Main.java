package Ex02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger loggerMain = Logger.getInstance("logs/loggerPrograma.txt");

        loggerMain.info("Programa começou");
        loggerMain.aviso("Utilizador tentou colocar um caracter não permitido");
        loggerMain.aviso("Utilizador não selecionou uma opção correta no menu");



        Logger loggerObjetos = Logger.getInstance("logs/loggerObjetos.txt");

        loggerObjetos.info("Objeto de Carro criado");
        loggerObjetos.info("Método ligar invocado");


        loggerMain.erro("Programa estourou porque o método corrida deu problemas");

    }
}
