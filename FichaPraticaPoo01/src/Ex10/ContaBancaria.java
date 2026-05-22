package Ex10;

public class ContaBancaria {
    private String iban;
    private String titular;
    private double saldo = 0;

    public ContaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito efetuado na conta " + this.iban + ": " + valor + " €");
    }

    public void levantar(double valor) {

        if (this.saldo >= valor) { // Levantamento: sucesso

            this.saldo -= valor;
            System.out.println("Levantamento EFETUADO na conta " + this.iban + ": " + valor + " €");

        } else { // Levantamento: recusado

            System.out.println("Levantamento RECUSADO na conta " + this.iban + ": " + valor + " €");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {

        if (this.saldo >= valor) { // Transferencia: sucesso

            this.saldo -= valor;
            contaDestino.saldo += valor;

            System.out.println(this.titular + " mandou dinheiro para " + contaDestino.titular);
            System.out.println("Transferencia EFETUADA");

        } else { // Transferencia: recusado

            System.out.println("Transferencia RECUSADO");
        }
    }

    public void exibirDetalhes() {
        System.out.println(this.iban + "| " + this.titular + " | Saldo: " + this.saldo + " €");
    }
}
