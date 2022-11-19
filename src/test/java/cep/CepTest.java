package cep;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CepTest {
    WebDriver driver;
    @Before
    public void abrirBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
    }
    @Test
    public void testCepRefactor(){
        BuscaCepPage buscaCepPage = new BuscaCepPage();
        buscaCepPage.preencherCampoCep(driver);
        buscaCepPage.selecionarTipo(driver);
        buscaCepPage.clicarBotaoBusca(driver);
        RetornaCepPage retornaCepPage = new RetornaCepPage();
        retornaCepPage.validarRetornoCep(driver);
    }
    @Test
     public void testCep(){
        driver.findElement(By.id("endereco")).sendKeys("06721507");
        Select select = new Select(driver.findElement(By.id("tipoCEP")));
        select.selectByVisibleText("Localidade/Logradouro");
        driver.findElement(By.id("btn_pesquisar")).click();
        String retorno = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]")).getText();
        Assert.assertEquals("Valor invalido", "Rua Mário Andreatini", retorno);
     }
     @After
     public void fechar(){

     }
}
