package stepdefinitions.trabalho_final_step;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.trabalho_final_util.TrabalhoComponentes02;


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
        componentes.fecharPesquisa();

    }

    @Então("deve validar Sobrenome Souza")
    public void deve_validar_Sobrenome_Souza() {
        componentes.validarSobrenome();
        componentes.fecharPesquisa();

    }

    @Então("deve validar Sexo radio")
    public void deve_validar_Sexo_radio() {
        componentes.validarSexo();
        componentes.fecharPesquisa();

    }

    @Então("deve validar Comida preferida checkbox")
    public void deve_validar_Comida_preferida_checkbox() {
        componentes.validarComidaFavorita();
        componentes.fecharPesquisa();
    }

    @Então("deve validar Escolaridade select")
    public void deve_validar_Escolaridade_select() {
        componentes.validarEscolaridade();
        componentes.fecharPesquisa();
    }

    @Então("deve validar Esporte select")
    public void deve_validar_Esporte_select() {
        componentes.validarEsporte();
        componentes.fecharPesquisa();
    }

    @Então("deve validar Sugestões Nada a declarar")
    public void deve_validar_Sugestões_Nada_a_declarar() {
        componentes.validarSugestoes();
        componentes.fecharPesquisa();
    }


    @Dado("que o usuário não preencheu o campo Nome")
    public void que_o_usuário_não_preencheu_o_campo_Nome() {
        componentes.testarSobrenome();

    }

    @Quando("clicar em Salvar")
    public void clicar_em_Salvar() {
        componentes.preencherInformacoes();
    }

    @Então("deve apresentar a mensagem de feedback informando que o campo Nome Nome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_o_campo_Nome_Nome_eh_obrigatorio() {
        componentes.validarNomeObr();
        componentes.fecharPesquisa();
    }

    @Dado("que o usuário não preencheu o campo Sobrenome")
    public void que_o_usuário_não_preencheu_o_campo_Sobrenome() {
        componentes.testarNome();

    }

    @Então("deve apresentar a mensagem de feedback informando que o campo Sobrenome Sobrenome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_o_campo_Sobrenome_Sobrenome_eh_obrigatorio() {
        componentes.validarSobrenomeObr();
        componentes.fecharPesquisa();
    }

    @Dado("que o usuário não preencheu o campo Sexo")
    public void que_o_usuário_não_preencheu_o_campo_Sexo() {
        componentes.testarNome();
        componentes.testarSobrenome();

    }

    @Então("deve apresentar a mensagem de feedback informando que o campo Sexo Sexo eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_o_campo_Sexo_Sexo_eh_obrigatorio() {
        componentes.validarSexoObr();
        componentes.fecharPesquisa();
    }

    @Dado("que o usuário não preencheu os campos Nome e Sobrenome")
    public void que_o_usuário_não_preencheu_os_campos_Nome_e_Sobrenome() {
        componentes.testarSexo();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Nome e Sobrenome Nome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Nome_e_Sobrenome_Nome_eh_obrigatorio() {
        componentes.validarNomeObr();
        componentes.fecharPesquisa();

    }

    @Dado("que o usuário não preencheu os campos Nome e Sexo")
    public void que_o_usuário_não_preencheu_os_campos_Nome_e_Sexo() {
        componentes.testarSobrenome();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Nome e Sexo Nome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Nome_e_Sexo_Nome_eh_obrigatorio() {
        componentes.validarNomeObr();
        componentes.fecharPesquisa();

    }

    @Dado("que o usuário não preencheu os campos Sobrenome e Sexo")
    public void que_o_usuário_não_preencheu_os_campos_Sobrenome_e_Sexo() {
        componentes.testarNome();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Sobrenome e Sexo Sobrenome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Sobrenome_e_Sexo_Sobrenome_eh_obrigatorio() {
        componentes.validarSobrenomeObr();
        componentes.fecharPesquisa();

    }

    @Dado("que o usuário não preencheu os campos Nome, Sobrenome e Sexo")
    public void que_o_usuário_não_preencheu_os_campos_Nome_Sobrenome_e_Sexo() {

    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Nome, Sobrenome e Sexo Nome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Nome_Sobrenome_e_Sexo_Nome_eh_obrigatorio() {
       componentes.validarNomeObr();
       componentes.fecharPesquisa();

    }


}


