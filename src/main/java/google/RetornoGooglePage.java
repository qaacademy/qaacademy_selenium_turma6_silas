package google;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetornoGooglePage {
    String textoRetorno = "//*[@id=\"sports-app\"]/div/div[1]/div/div/div[1]/div/div[2]/div[2]";

    public void validarRetornoBusca(WebDriver driver){
       String texto = driver.findElement(By.xpath(textoRetorno)).getText();
       Assert.assertEquals("Texto invalido","Sociedade Esportiva Palmeiras",texto);
    }

}
