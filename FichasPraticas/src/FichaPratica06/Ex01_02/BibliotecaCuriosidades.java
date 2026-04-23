package FichaPratica06.Ex01_02;

public class BibliotecaCuriosidades {

    /**
     * Função que avalia se alguém é ou não <b>maior de idade</b>
     *
     * @param idade Idade da pessoa a ser avaliada
     * @return true - se maior de idade || false - se menor de idade
     */
    public static boolean maiorDeIdade(int idade) {

        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Função que retorna a <b>Fase da Vida</b> de uma pessoa, de acordo com a sua idade
     * @param idade Idade da pessoa a ser avaliada
     * @return Fase da Vida (criança, adolescente, adulto ou idoso)
     */
    public static String faseVida(int idade) {

        if (idade >= 0 && idade <= 12) {
            return "Criança";
        } else if (idade <= 17) {
            return "Adolescente";
        } else if (idade <= 64) {
            return "Adulto";
        } else {
            return "Idoso";
        }

    }


    public static String capitalPais(String pais){

//        if(pais.equalsIgnoreCase("Portugal")){
//            return "Libsoa";
//        }

        switch (pais.toLowerCase()){
            case "portugal":
                return "Lisboa";

            case "espanha":
                return "Madrid";

            case "frança":
                return "Paris";

            case "itália":
                return "Roma";

            case "alemanha":
                return "Berlim";

            default:
                return "País não está na lista";
        }


    }
}
