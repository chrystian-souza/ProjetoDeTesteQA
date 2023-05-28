package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/features/sistema_senac/Componentes02.feature", glue = "", tags = "@Validar_Varios_Campos")


public class TestRunner {

}
