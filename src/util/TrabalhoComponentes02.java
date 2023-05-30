package util;                                /* toda a lógica é feita aqui!*/

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TrabalhoComponentes02 {

    private WebDriver driver;

    private WebElement element;

    private Select select;


    public void inicializar() {
        String chromedriver = System.getProperty("user.dir")
                + "/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");
    }


    public void testarNome() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Chrystian");
    }

    public void validarNome() {

        Assert.assertEquals("Chrystian", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void testarSobrenome() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Souza");
    }

    public void validarSobrenome() {
        Assert.assertEquals("Souza", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
    }


    public void testarSexo() {
        driver.findElement(By.id("elementosForm:sexo:1")).click();

    }

    public void validarSexo() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
    }

    public void testarComidaFavorita() {
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
    }

    public void validarComidaFavorita() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
    }

    public void testarEscolaridade() {
        WebElement elementoweb = driver.findElement(By.id("elementosForm:escolaridade"));
        select = new Select(elementoweb);
        select.selectByIndex(4);

    }

    public void validarEscolaridade() {
        Assert.assertEquals("superior", driver.findElement(By.id("descEscolaridade")).findElement(By.tagName("span")).getText());

    }


    public void testarEsporte() {
        WebElement elementoSelect = driver.findElement(By.id("elementosForm:esportes"));
        Select select = new Select(elementoSelect);
        WebElement escolha = driver.findElement(By.cssSelector("option[value=futebol]"));
        select.selectByVisibleText("Futebol");
        Assert.assertTrue(escolha.isSelected());

    }

    public void validarEsporte() {
        Assert.assertTrue(driver.findElement(By.cssSelector("option[value=futebol")).isSelected());

    }

    public void testarSugestoes() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Nada a declarar");
    }

    public void validarSugestoes() {
        Assert.assertEquals("Nada a declarar", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }


    public void preencherInformacoes() {
      driver.findElement(By.id("elementosForm:cadastrar")).click();
    }


    public void fecharPesquisa() {
        driver.quit();

    }


}
