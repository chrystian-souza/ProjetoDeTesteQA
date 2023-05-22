package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/sistema_senac/Componentes.feature", glue = "", tags = "@validar_campo_textfield_sobrenome_sugestoes")

public class TestRunner {


}
