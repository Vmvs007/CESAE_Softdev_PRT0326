package controllers;

import models.Utilizador;
import repositories.UtilizadorRepository;

import java.io.FileNotFoundException;

public class LoginController {

    private UtilizadorRepository utilizadorRepository;

    public LoginController() throws FileNotFoundException {
        this.utilizadorRepository = new UtilizadorRepository();
    }

    public String validarLogin(String usernameIntroduzido, String passwordIntroduzida) {

        for (Utilizador utilizadorAtual : this.utilizadorRepository.getListaUtilizadores()) {

            if(utilizadorAtual.getUsername().equals(usernameIntroduzido) && utilizadorAtual.getPassword().equals(passwordIntroduzida)){
                return utilizadorAtual.getTipoConta();
            }
        }

        return "ERRO";
    }
}
