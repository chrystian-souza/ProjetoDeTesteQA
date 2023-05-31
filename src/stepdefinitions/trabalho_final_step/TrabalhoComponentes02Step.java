package stepdefinitions.trabalho_final_step;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.TrabalhoComponentes02;


public class TrabalhoComponentes02Step {

    TrabalhoComponentes02 componentes = new TrabalhoComponentes02();

    @Dado("que o usuário entrou na página Campo de Treinamento")
    public void que_o_usuário_entrou_na_página_Campo_de_Treinamento() {
        componentes.inicializar();
    }

    @Dado("que foi preenchido o formulario")
    public void que_foi_preenchido_o_formulario() {
        componentes.testarNome();
        componentes.testarSobrenome();
        componentes.testarSexo();
        componentes.testarComidaFavorita();
        componentes.testarEscolaridade();
        componentes.testarEsporte();
        componentes.testarSugestoes();
    }

    @Quando("o usuário clicar no botao de cadastrar")
    public void o_usuário_clicar_no_botao_de_cadastrar() {
        componentes.preencherInformacoes();
    }

    @Então("deve validar Nome Chrystian")
    public void deve_validar_Nome_Chrystian() {
        componentes.validarNome();
        componentes.validarNomeObr();
    }

    @Então("deve validar Sobrenome Souza")
    public void deve_validar_Sobrenome_Souza() {
        componentes.validarSobrenome();
        componentes.validarSobrenomeObr();
    }

    @Então("deve validar Sexo radio")
    public void deve_validar_Sexo_radio() {
        componentes.validarSexo();
        componentes.validarSexoObr();
    }

    @Então("deve validar Comida preferida checkbox")
    public void deve_validar_Comida_preferida_checkbox() {
        componentes.validarComidaFavorita();
    }

    @Então("deve validar Escolaridade select")
    public void deve_validar_Escolaridade_select() {
        componentes.validarEscolaridade();
    }

    @Então("deve validar Esporte select")
    public void deve_validar_Esporte_select() {
        componentes.validarEsporte();
    }

    @Então("deve validar Sugestões Nada a declarar")
    public void deve_validar_Sugestões_Nada_a_declarar() {
        componentes.validarSugestoes();
    }


}


