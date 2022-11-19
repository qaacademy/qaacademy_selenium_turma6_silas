package cep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BuscaCepPage {

    WebDriver driver;
     public BuscaCepPage(WebDriver driverParametro){
         driver = driverParametro;
     }
    private String nameCampoBusca = "endereco";
    private String idSelectTipo = "tipoCEP";
    private String IdbotaoPesquisar = "btn_pesquisar";

    public void preencherCampoCep(String cep ){
        driver.findElement(By.name(nameCampoBusca)).sendKeys(cep);
    }

    public void selecionarTipo(String tipo){
       Select select = new Select(driver.findElement(By.id(idSelectTipo)));
        select.selectByVisibleText(tipo);
    }
    public void clicarBotaoBusca(){
        driver.findElement(By.id(IdbotaoPesquisar)).click();
    }
}
