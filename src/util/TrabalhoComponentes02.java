package util;                                /* toda a lógica é feita aqui!*/

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TrabalhoComponentes02 {

    private WebDriver driver;

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

        Assert.assertEquals("Chrystian", driver.findElement(By.id("descNome")).findElement(By.tagName("span")).getText());

    }

    public void validarNomeObr() {

        Alert alerta = driver.switchTo().alert();
        String alerta_texto = alerta.getText();
        Assert.assertEquals("Nome é obrigatório", alerta_texto);
    }

    public void testarSobrenome() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Souza");
    }

    public void validarSobrenome() {
        Assert.assertEquals("Souza", driver.findElement(By.id("descSobrenome")).findElement(By.tagName("span")).getText());
    }

    public void validarSobrenomeObr() {

        Alert alerta = driver.switchTo().alert();
        String alerta_texto = alerta.getText();
        Assert.assertEquals("Sobrenome é obrigatório", alerta_texto);
    }



    public void testarSexo() {
        driver.findElement(By.id("elementosForm:sexo:0")).click();

    }

    public void validarSexo() {
        Assert.assertEquals("Masculino", driver.findElement(By.id("descSexo")).findElement(By.tagName("span")).getText());
    }

    public void validarSexoObr() {

        Alert alerta = driver.switchTo().alert();
        String alerta_texto = alerta.getText();
        Assert.assertEquals("Sexo é obrigatório", alerta_texto);
    }


    public void testarComidaFavorita() {
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
    }

    public void validarComidaFavorita() {
        Assert.assertEquals("Carne", driver.findElement(By.id("descComida")).findElement(By.tagName("span")).getText());
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
        WebElement elementoweb = driver.findElement(By.id("elementosForm:esportes"));
        select = new Select(elementoweb);
        select.selectByValue("futebol");

    }

    public void validarEsporte() {
        Assert.assertEquals("Futebol", driver.findElement(By.id("descEsportes")).findElement(By.tagName("span")).getText());

    }

    public void testarSugestoes() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Nada a declarar");
    }

    public void validarSugestoes() {
        Assert.assertEquals("Nada a declarar", driver.findElement(By.id("descSugestoes")).findElement(By.tagName("span")).getText());
    }


    public void preencherInformacoes() {
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }


    public void fecharPesquisa() {
        driver.quit();

    }


}
