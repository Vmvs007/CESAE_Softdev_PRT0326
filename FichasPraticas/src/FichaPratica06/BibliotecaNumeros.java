package FichaPratica06;

public class BibliotecaNumeros {

    public static int quadradoNumero(int num) {
        int resultado = num * num;
        return resultado;
    }

    /**
     * Função que converter valores em EUR, para uma moeda à escolha
     * @param valorOriginal Valor em EUR
     * @param moedaPretendida Sigla da moeda que nós queremos
     * @return Valor na moedaPretendida
     */
    public static double converterMoedas(double valorOriginal, String moedaPretendida) {
        double valorConvertido = 0;

        switch (moedaPretendida) {
            case "USD":
                valorConvertido = valorOriginal * 1.2;
                break;

            case "BRL":
                valorConvertido = valorOriginal * 6.5;
                break;

            case "GBP":
                valorConvertido = valorOriginal * 0.85;
                break;

            case "YEN":
                valorConvertido = valorOriginal * 540;
                break;

            case "ZSD":
                valorConvertido = valorOriginal * 1000000;
                break;

            default:
                valorConvertido = valorOriginal;
        }

        return valorConvertido;
    }

}
