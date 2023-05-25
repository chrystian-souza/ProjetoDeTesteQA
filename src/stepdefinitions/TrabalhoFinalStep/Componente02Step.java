package stepdefinitions.TrabalhoFinalStep;


package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;


public class Componente02Step {

    Componentes componentes = new Componentes();


    @Dado("que o usuário acessou o arquivo Campo de treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_treinamento() {
        componentes.inicializar();
    }


    @Quando("o usuário digitar ou selecionar Chrystian")
    public void o_usuário_digitar_ou_selecionar_Chrystian() { componentes.testarCheckbox();

    }

    @Então("no campo textfield deve apresentar o Batatinha")
    public void no_campo_textfield_deve_apresentar_o_Batatinha() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar ou selecionar Souza")
    public void o_usuário_digitar_ou_selecionar_Souza() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("no campo sobrenome deve apresentar o Souza")
    public void no_campo_sobrenome_deve_apresentar_o_Souza() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar ou selecionar Aula legal")
    public void o_usuário_digitar_ou_selecionar_Aula_legal() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("no campo textarea deve apresentar o Aula legal")
    public void no_campo_textarea_deve_apresentar_o_Aula_legal() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar ou selecionar sexo")
    public void o_usuário_digitar_ou_selecionar_sexo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("no campo radio deve apresentar o radio")
    public void no_campo_radio_deve_apresentar_o_radio() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar ou selecionar comida preferida")
    public void o_usuário_digitar_ou_selecionar_comida_preferida() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("no campo checkbox deve apresentar o checkbox")
    public void no_campo_checkbox_deve_apresentar_o_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar ou selecionar escolaridade")
    public void o_usuário_digitar_ou_selecionar_escolaridade() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("no campo select deve apresentar o select")
    public void no_campo_select_deve_apresentar_o_select() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar ou selecionar esporte")
    public void o_usuário_digitar_ou_selecionar_esporte() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
