package cep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetornaCepPage {
    WebDriver driver;
    public RetornaCepPage(WebDriver driverParametro){
        driver = driverParametro;
    }
    private String xpathTextoRetornoCep = "//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]";
    public void validarRetornoCep(String retorno){
        String texto = driver.findElement(By.xpath(xpathTextoRetornoCep)).getText();
        Assert.assertEquals(retorno,texto);
    }
}
