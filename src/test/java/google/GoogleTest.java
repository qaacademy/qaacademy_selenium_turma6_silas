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
        BuscaGooglePage buscaGooglePage = new BuscaGooglePage();
        buscaGooglePage.preencherCampoBusca(driver);
        buscaGooglePage.clicarResultaBusca(driver);
        RetornoGooglePage retornoGooglePage = new RetornoGooglePage();
        retornoGooglePage.validarRetornoBusca(driver);
   }



    @Test
    public void testGoogle() throws InterruptedException {
       // acessar url
        driver.get("https://www.google.com");
        // preencher campo busca
        driver.findElement(By.name("q")).sendKeys("Palmeiras");
       // clicando no primeiro resultado da busca
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span")).click();
       // capturando o texto do elemento encontrado
        String texto = driver.findElement(By.xpath("//*[@id=\"sports-app\"]/div/div[1]/div/div/div[1]/div/div[2]/div[2]")).getText();
       // validando texto
        Assert.assertEquals("Texto invalido","Sociedade Esportiva Palmeiras",texto);
    }

    @After
    public void fecharBrowser(){
        driver.quit();
    }
}
