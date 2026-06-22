package Ex01;

import java.util.ArrayList;

public class FilaImpressao {

    // 1. Criar espaço de armazenamento para o único objeto
    private static FilaImpressao instance;

    private ArrayList<String> listaDocumentos;

    // 2. Passar o construtor para privado
    private FilaImpressao() {
        this.listaDocumentos = new ArrayList<String>();
    }

    // 3. Criar o construtor tuning que chamamos de getInstance()
    public static FilaImpressao getInstance(){
        if(instance == null){
            instance = new FilaImpressao();
        }

        return instance;
    }

    public void adicionarDocumento(String documentoNovo) {
        this.listaDocumentos.add(documentoNovo);
    }

    public void imprimirProximoDocumento() {
        System.out.println("A imprimir: " + this.listaDocumentos.getFirst());
        this.listaDocumentos.removeFirst();
    }

    public void exibirListaImpressao() {
        System.out.println("Fila de Impressão: " + this.listaDocumentos);
    }
}
