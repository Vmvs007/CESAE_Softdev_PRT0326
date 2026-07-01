package views;

import controllers.LoginController;
import tools.ConsoleColors;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {

    private LoginController loginController;

    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    public void menuLogin() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcaoLogin;

        do {

            System.out.println("\n-+-+-+-+-+-+-+-+- Bem/vind@ à Aplicação do Minimercado Grandes Negócios -+-+-+-+-+-+-+-+-");
            System.out.println("1. Cliente");
            System.out.println("2. Staff");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcaoLogin = input.nextInt();

            switch (opcaoLogin) {
                case 1: // CLIENTE
                    ConsoleColors.clear();

                    ClienteView clienteView = new ClienteView();
                    clienteView.menuCliente();

                    break;

                case 2: // STAFF
                    ConsoleColors.clear();

                    this.menuStaffLogin();
                    break;

                case 0:
                    ConsoleColors.clear();
                    System.out.println("Sair...");
                    break;

                default:
                    ConsoleColors.clear();
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (opcaoLogin != 0);

    }

    public void menuStaffLogin() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("\nUsername: ");
        String usernameIntroduzido = input.next();

        System.out.print("Password: ");
        String passwordIntroduzido = input.next();

        switch (loginController.validarLogin(usernameIntroduzido, passwordIntroduzido)) {

            case "ADMIN":
                AdminView adminView = new AdminView();
                adminView.menuAdmin();
                break;

            case "FUNC":
                break;

            case "ERRO":
                System.out.println("Credenciais Inválidas");
                break;
        }


    }
}
