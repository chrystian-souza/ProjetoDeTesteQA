package stepdefinitions;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.TrabalhoComponentes02;


public class TrabalhoComponente02Step {

    TrabalhoComponentes02 componentes = new TrabalhoComponentes02();


    @Dado("que o usuário acessou o arquivo Campo de treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_treinamento() {
        componentes.inicializar();
    }


    @Quando("o usuário digitar Chrystian")
    public void o_usuário_digitar_Chrystian() {
        componentes.testarTextField();

    }

    @Então("no campo textfield deve apresentar o Chrystian")
    public void no_campo_textfield_deve_apresentar_o_Chrystian() {
        componentes.validarTextField();
        componentes.fecharPesquisa();

    }

    @Quando("o usuário digitar Souza")
    public void o_usuário_digitar_Souza() {
        componentes.testarSobrenome();


    }

    @Então("no campo sobrenome deve apresentar Souza")
    public void no_campo_sobrenome_deve_apresentar_Souza() {
        componentes.validarSobrenome();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar Aula legal")
    public void o_usuário_digitar_Aula_legal() {
        componentes.testarTextArea();

    }

    @Então("no campo textarea deve apresentar  Aula legal")
    public void no_campo_textarea_deve_apresentar_Aula_legal() {
        componentes.validarTextArea();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar ou selecionar sexo")
    public void o_usuário_digitar_ou_selecionar_sexo() {
        componentes.testarRadioButton();

    }

    @Então("no campo radio deve apresentar o radio")
    public void no_campo_radio_deve_apresentar_o_radio() {
        componentes.validarRadioButton();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar ou selecionar comida preferida")
    public void o_usuário_digitar_ou_selecionar_comida_preferida() {
        componentes.testarCheckbox();
    }

    @Então("no campo checkbox deve apresentar o checkbox")
    public void no_campo_checkbox_deve_apresentar_o_checkbox() {
        componentes.validarCheckbox();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário selecionar escolaridade")
    public void o_usuário_digitar_ou_selecionar_escolaridade() {


    }

    @Então("no campo select deve apresentar o select")
    public void no_campo_select_deve_apresentar_o_select() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
