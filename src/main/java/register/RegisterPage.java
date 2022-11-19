package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private String firstName = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]";
    private String lastName= "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String address= "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String emailAddress= "//*[@id=\"eid\"]/input";
    private String phone= "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String gender= "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobbies= "//input[@value='Movies']";
    private String skills = "Skills";
    private String selectCountry1 = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";
    private String selectCountry2= "//*[@id=\"select2-country-results\"]/li[3]";
    private String year= "yearbox";
    private String month= "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";
    private String day= "daybox";

    public void preencherNome(WebDriver driver){
        driver.findElement(By.xpath(firstName)).sendKeys("Silas");
    }

    public void preencherSobreNome(WebDriver driver){
        driver.findElement(By.xpath(lastName)).sendKeys("Leão");
    }

    public void preencherEndereco(WebDriver driver){
        driver.findElement(By.xpath(address)).sendKeys("Rua dos bobos numero 0");
    }
     public void preencherEmail(WebDriver driver){
         driver.findElement(By.xpath(emailAddress)).sendKeys("silas.souza@testes.com");
     }
     public void preencherPhone(WebDriver driver){
         driver.findElement(By.xpath(phone)).sendKeys("1178941236");
     }

     public void preencherGender(WebDriver driver){
         driver.findElement(By.xpath(gender)).click();
     }

     public void clicarHobbies(WebDriver driver){
         driver.findElement(By.xpath(hobbies)).click();
     }

     public void selecionarSkills(WebDriver driver){
         Select skillsSelect = new Select(driver.findElement(By.id(skills)));
         skillsSelect.selectByVisibleText("Java");
     }

     public void clicarCountry(WebDriver driver){
         driver.findElement(By.xpath(selectCountry1)).click();
         driver.findElement(By.xpath(selectCountry2)).click();
     }

     public void selecionarAno(WebDriver driver){
         Select ano = new Select(driver.findElement(By.id(year)));
         ano.selectByVisibleText("1996");
     }

    public void selecionarMes(WebDriver driver){
        Select mes = new Select(driver.findElement(By.xpath(month)));
        mes.selectByVisibleText("April");
    }

    public void selecionarDia(WebDriver driver){
        Select dia = new Select(driver.findElement(By.id(day)));
        dia.selectByVisibleText("4");
    }
}
