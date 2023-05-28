package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_treinamento() {
        componentes.inicializar();
    }

    @Quando("o usuário digitar Batatinha")
    public void o_usuário_digitar_Batatinha() {
        componentes.testarTextField();

    }

    @Então("no campo textfield deve apresentar a palavra Batatinha")
    public void no_campo_textfield_deve_apresentar_a_palavra_Batatinha() {
        componentes.validarTextField();
        componentes.fecharPesquisa();

    }

    @Quando("o usuário digitar Frita")
    public void o_usuário_digitar_Frita() {
        componentes.testarSobrenome();
    }

    @Então("no campo sobrenome deve apresentar a palavra Frita")
    public void no_campo_sobrenome_deve_apresentar_a_palavra_Frita() {
        componentes.validarSobrenome();
        componentes.fecharPesquisa();

    }

    @Quando("o usuário digitar Batatinhaa")
    public void o_usuário_digitar_Batatinhaa() {
        componentes.testarSugestoes();

    }

    @Então("no campo sugestoes deve apresentar a palavra Batatinhaa")
    public void no_campo_sugestoes_deve_apresentar_a_palavra_Batatinhaa() {
        componentes.validarSugestoes();
        componentes.fecharPesquisa();

    }

    @Quando("o usuário clicar no elemento rádio button")
    public void o_usuário_clicar_no_elemento_rádio_button() {
        componentes.testarRadioButton();

    }

    @Então("o elemento rádio button deve aparecer selecionado")
    public void o_elemento_rádio_button_deve_aparecer_selecionado() {
        componentes.validarRadioButton();
        componentes.fecharPesquisa();

    }

    @Quando("o usuário clicar no elemento checkbox")
    public void o_usuário_clicar_no_elemento_checkbox() {
        componentes.testarCheckbox();


    }

    @Então("o elemento checkbox deve aparecer selecionado")
    public void o_elemento_checkbox_deve_aparecer_selecionado() {
        componentes.validarCheckbox();


    }

}
