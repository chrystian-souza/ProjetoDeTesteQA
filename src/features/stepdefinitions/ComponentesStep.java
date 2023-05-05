package features.stepdefinitions;

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


}
