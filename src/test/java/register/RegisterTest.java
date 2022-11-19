package register;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegisterTest {
    WebDriver driver;

    @Before
    public void abrirBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://demo.automationtesting.in/Register.html");
    }
    @Test
    public void testRegister(){
         RegisterPage registerPage = new RegisterPage(driver);
         registerPage.preencherNome("Silas");
         registerPage.preencherSobreNome("Leao");
         registerPage.preencherEndereco("Rua mario");
         registerPage.preencherEmail("silas.teste@sda.com.br");
         registerPage.preencherPhone("1178941236");
         registerPage.clicarGender();
         registerPage.clicarHobbies();
         registerPage.selecionarSkills("Java");
         registerPage.clicarCountry();
         registerPage.selecionarAno("1996");
         registerPage.selecionarMes("April");
         registerPage.selecionarDia("4");
    }

    @Test
    public void alertOK(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        Alert alert = driver.switchTo().alert();
       String textoAlert =  alert.getText();
        Assert.assertEquals("Texto alert invalido","I am an alert box!",textoAlert);
        alert.accept();
    }
    @Test
    public void alertCancela(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        String alertTexto = alert.getText();
        Assert.assertEquals("Texto alert invalido","Press a Button !",alertTexto);
        alert.dismiss();
    }
@Test
    public void alertComTexto(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("QA Academy");
        alert.accept();
        String msg = driver.findElement(By.id("demo1")).getText();
        Assert.assertTrue("Texto alert invalido",msg.contains("QA Academy"));
    }
    @Test
    public void frameTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("QA Academy");
        driver.switchTo().defaultContent();
    }
    @Test
    public void windowTes(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        Object[] janelas =  driver.getWindowHandles().toArray();
        driver.switchTo().window(janelas[1].toString());
       String url =  driver.getCurrentUrl();
       Assert.assertEquals("https://www.selenium.dev/",url);
    }
    @After
    public void fecharBrowser(){
        driver.quit();
    }

}
