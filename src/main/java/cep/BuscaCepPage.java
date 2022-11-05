package cep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BuscaCepPage {

    private String nameCampoBusca = "endereco";
    private String idSelectTipo = "tipoCEP";
    private String IdbotaoPesquisar = "btn_pesquisar";

    public void preencherCampoCep(WebDriver driver){
        driver.findElement(By.name(nameCampoBusca)).sendKeys("06716507");
    }

    public void selecionarTipo(WebDriver driver){
       Select select = new Select(driver.findElement(By.id(idSelectTipo)));
        select.selectByVisibleText("Localidade/Logradouro");
    }
    public void clicarBotaoBusca(WebDriver driver){
        driver.findElement(By.id(IdbotaoPesquisar)).click();
    }
}
