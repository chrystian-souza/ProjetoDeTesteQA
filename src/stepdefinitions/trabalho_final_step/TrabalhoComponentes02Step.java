package stepdefinitions.trabalho_final_step;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.TrabalhoComponentes02;


public class TrabalhoComponentes02Step {

    TrabalhoComponentes02 componentes = new TrabalhoComponentes02();

    @Dado("que o usuário entrou na página Campo de Treinamento")
    public void que_o_usuario_entrou_na_pagina_Campo_de_Treinamento() {
        componentes.inicializar();
    }

    @Quando("o usuário digitar no Nome")
    public void o_usuário_digitar_no_Nome() {
        componentes.testarNome();

    }

    @Então("deve apresentar o Chrystian")
    public void deve_apresentar_o_Chrystian() {
        componentes.validarNome();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar no Sobrenome")
    public void o_usuário_digitar_no_Sobrenome() {
        componentes.testarSobrenome();

    }

    @Então("deve apresentar o Souza")
    public void deve_apresentar_o_Souza() {
        componentes.validarSobrenome();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar no Sugestões")
    public void o_usuário_digitar_no_Sugestões() {
        componentes.testarSugestoes();
    }

    @Então("deve apresentar o Nada a declarar")
    public void deve_apresentar_o_Nada_a_declarar() {
        componentes.validarSugestoes();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar no Sexo")
    public void o_usuário_digitar_no_Sexo() {
        componentes.testarSexo();
    }

    @Então("deve apresentar o radio")
    public void deve_apresentar_o_radio() {
        componentes.validarSexo();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar no Comida preferida")
    public void o_usuário_digitar_no_Comida_preferida() {
        componentes.testarComidaFavorita();
    }

    @Então("deve apresentar o checkbox")
    public void deve_apresentar_o_checkbox() {
        componentes.validarComidaFavorita();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar no Escolaridade")
    public void o_usuário_digitar_no_Escolaridade() {
        componentes.testarEscolaridade();
    }

    @Então("deve apresentar o select")
    public void deve_apresentar_o_select() {
        componentes.validarEscolaridade();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar no Esporte")
    public void o_usuário_digitar_no_Esporte() {
        componentes.testarEsporte();
    }

    @Então("deve apresentar select")
    public void deve_apresentar_select() {
        componentes.validarEsporte();
        componentes.fecharPesquisa();
    }

    @Quando("o usuário digitar no Cadastrar")
    public void o_usuário_digitar_no_Cadastrar() {
        componentes.testarCadastro();

    }

    @Então("deve apresentar o onclick")
    public void deve_apresentar_o_onclick() {
        componentes.validarCadastro();
        componentes.fecharPesquisa();

    }


}


