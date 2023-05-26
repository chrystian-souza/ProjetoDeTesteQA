package util;                                /* toda a lógica é feita aqui!*/

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TrabalhoComponentes02 {

    private WebDriver driver;
    private Select select;

    public void inicializar() {
        String chromedriver = System.getProperty("user.dir") + "/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");

    }


    public void testarTextField() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Chrystian");
    }

    public void validarTextField() {
        Assert.assertEquals("Chrystian", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void testarSobrenome() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Souza");
    }

    public void validarSobrenome() {
        Assert.assertEquals("Frita", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
    }

    public void testarSugestoes() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Aula legal");
    }

    public void validarSugestoes() {
        Assert.assertEquals("Aula legal", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    public void testarRadioButton() {
        driver.findElement(By.id("elementosForm:sexo:1")).click();

    }

    public void validarRadioButton() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
    }

    public void testarCheckbox() {
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
    }

    public void validarCheckbox() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
    }

    public void testarEscolaridade(String opcao_escolaridade) {
        WebElement escolaridade = driver.findElement(By.id("elementosForm:comidaFavorita"));
        Select select = new Select(escolaridade);
        select.selectByVisibleText(opcao_escolaridade);

    }

    public void validarEscolaridade(String opcao_escolaridade) {


        WebElement campo_escolaridade = driver.findElement(By.id("elementosForm:comidaFavorita"));
        Select select_escolaridade = new Select(campo_escolaridade);


    }

    public void testarTextArea() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Aula legal");
    }

    public void validarTextArea() {
        Assert.assertEquals("Aula legal", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    public void fecharPesquisa() {
        driver.quit();
    }


}
