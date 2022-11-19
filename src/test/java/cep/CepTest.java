package cep;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
        BuscaCepPage buscaCepPage = new BuscaCepPage(driver);
        buscaCepPage.preencherCampoCep("06716507");
        buscaCepPage.selecionarTipo("Localidade/Logradouro");
        buscaCepPage.clicarBotaoBusca();
        RetornaCepPage retornaCepPage = new RetornaCepPage(driver);
        retornaCepPage.validarRetornoCep("Rua Mario Andreatini");
    }
     @After
     public void fechar(){
       driver.quit();
     }
}
