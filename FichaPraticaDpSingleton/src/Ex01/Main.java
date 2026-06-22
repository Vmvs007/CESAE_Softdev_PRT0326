package Ex01;

public class Main {
    public static void main(String[] args) {

        FilaImpressao fi = FilaImpressao.getInstance();


        fi.adicionarDocumento("salarios.xlsx");
        fi.exibirListaImpressao();


        fi.adicionarDocumento("fatura1220.pdf");
        fi.exibirListaImpressao();


        fi.adicionarDocumento("apresentacaoBoasVindas.pptx");
        fi.exibirListaImpressao();


        fi.adicionarDocumento("cvJoaquim.doxc");
        fi.exibirListaImpressao();


        fi.imprimirProximoDocumento();
        fi.exibirListaImpressao();


        FilaImpressao minhaFilaPessoal = FilaImpressao.getInstance();
        minhaFilaPessoal.adicionarDocumento("cvVitor.pdf");
        minhaFilaPessoal.exibirListaImpressao();

        minhaFilaPessoal.imprimirProximoDocumento();
        minhaFilaPessoal.exibirListaImpressao();

        fi.imprimirProximoDocumento();
        minhaFilaPessoal.exibirListaImpressao();
    }
}
