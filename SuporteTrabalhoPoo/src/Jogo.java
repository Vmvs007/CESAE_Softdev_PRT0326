import static java.lang.Thread.sleep;

public class Jogo {

    private int historia;

    public Jogo(int historia) {
        this.historia = historia;
    }

    private void prefacio() {

        switch (historia) {
            case 1:
                System.out.println("Bem-vindo/a ao Mistério do Serial Killer V1");
                System.out.println("Assassinato no Iate");
                break;

            case 2:
                System.out.println("Bem-vindo/a ao Mistério do Serial Killer V2");
                System.out.println("Assassinato no Hotel");
                break;

            case 3:
                System.out.println("Bem-vindo/a ao Mistério do Serial Killer V3");
                System.out.println("Assassinato na Festa de Casamento");
                break;

        }
    }

    private void narrativa01() {
        switch (historia) {
            case 1:
                System.out.println("Tens de descobrir como o corpo foi atirado aos tubarões");
                break;

            case 2:
                System.out.println("Apareceu no quarto vizinho, morto na casa de banho");
                break;

            case 3:
                System.out.println("A festa estava a correr bem, até cair e deixar o copo com um liquido entornado");
                break;

        }
    }

    public void misterioSerialKiller() throws InterruptedException {

        prefacio();
        sleep(2000);
        narrativa01();

    }
}
