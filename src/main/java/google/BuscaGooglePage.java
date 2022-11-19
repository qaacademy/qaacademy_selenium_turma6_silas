package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaGooglePage {

    WebDriver driver;

            public BuscaGooglePage(WebDriver driverParametro){
                 driver = driverParametro;
            }
    String campoBusca = "q";
   String resultadoBusca = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]";

   public void preencherCampoBusca(){
       driver.findElement(By.name(campoBusca)).sendKeys("Sociedade Esportiva Palmeiras");
   }

   public void clicarResultaBusca(){
       driver.findElement(By.xpath(resultadoBusca)).click();
   }
}
