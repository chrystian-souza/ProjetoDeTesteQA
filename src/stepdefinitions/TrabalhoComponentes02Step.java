package stepdefinitions;


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

    @Dado("que o usuário esta para preencher os campos")
    public void que_o_usuario_esta_para_preencher_os_campos() {
        

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
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar o Souza")
    public void deve_apresentar_o_Souza() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar no Sugestões")
    public void o_usuário_digitar_no_Sugestões() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar o Nada a declarar")
    public void deve_apresentar_o_Nada_a_declarar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar no Sexo")
    public void o_usuário_digitar_no_Sexo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar o radio")
    public void deve_apresentar_o_radio() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar no Comida preferida")
    public void o_usuário_digitar_no_Comida_preferida() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar o checkbox")
    public void deve_apresentar_o_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar no Escolaridade")
    public void o_usuário_digitar_no_Escolaridade() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar o select")
    public void deve_apresentar_o_select() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar no Esporte")
    public void o_usuário_digitar_no_Esporte() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("o usuário digitar no Cadastrar")
    public void o_usuário_digitar_no_Cadastrar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar o onclick")
    public void deve_apresentar_o_onclick() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



}


