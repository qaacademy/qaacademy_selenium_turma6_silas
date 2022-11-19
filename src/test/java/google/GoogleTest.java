package google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleTest {
    WebDriver driver;
    @Before
    public void abrirBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
   @Test
   public void testarGoogle(){
        driver.get("https://www.google.com");
        BuscaGooglePage buscaGooglePage = new BuscaGooglePage(driver);
        buscaGooglePage.preencherCampoBusca();
        buscaGooglePage.clicarResultaBusca();
        RetornoGooglePage retornoGooglePage = new RetornoGooglePage(driver);
        retornoGooglePage.validarRetornoBusca();
   }
    @After
    public void fecharBrowser(){
        driver.quit();
    }
}
