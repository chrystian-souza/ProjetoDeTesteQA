package features.stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class AcessarGoogleStep {

    Componentes componentes = new Componentes();
    @Dado("que o usuário instanciou o chrome-driver")
    public void que_o_usuário_instanciou_o_chrome_driver() {
        // Write code here that turns the phrase above into concrete actions
        componentes.inicializar();

    }

    @Dado("que o uduário digitou o endereço do Google no navegador")
    public void que_o_uduário_digitou_o_endereço_do_Google_no_navegador() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("clicar em Entrar")
    public void clicar_em_Entrar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("a página do Google deve abrir")
    public void a_página_do_Google_deve_abrir() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}

