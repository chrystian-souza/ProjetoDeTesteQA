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


    public void validarCadastro() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:cadastrar")).isSelected());
        Assert.assertTrue(element.isDisplayed());
    }

    public void fecharPesquisa() {
        driver.quit();

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
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
    }

    public void testarComidaFavorita() {
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
    }

    public void validarComidaFavorita() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
    }

    public void testarEscolaridade() {
        element = driver.findElement(By.id("elementosForm:escolaridade"));
        select.selectByValue("superior");

    }

    public void validarEscolaridade() {
        Select select = new Select(element);
        boolean isSelected = select.getFirstSelectedOption().isSelected();
        Assert.assertTrue(isSelected);

    }

    public void testarEsporte() {
        Select select = new Select(element);
        element = driver.findElement(By.id("elementosForm:esporte"));
        select.selectByIndex(1);

    }

    public void validarEsporte() {
        Select select = new Select(element);
        boolean isSelected = select.getFirstSelectedOption().isSelected();
        Assert.assertTrue(isSelected);

    }

    public void testarSugestoes() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Nada a declarar");
    }

    public void validarSugestoes() {
        Assert.assertEquals("Nada a declarar", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }


    public void testarCadastro() {
        element = driver.findElement(By.id("elementosForm:cadastrar"));
        element.click();
    }




}
