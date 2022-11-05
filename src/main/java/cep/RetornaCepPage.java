package cep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetornaCepPage {
    private String xpathTextoRetornoCep = "//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]";
    public void validarRetornoCep(WebDriver driver){
        String texto = driver.findElement(By.xpath(xpathTextoRetornoCep)).getText();
        Assert.assertEquals("Rua Mario Andreatini",texto);
    }
}
