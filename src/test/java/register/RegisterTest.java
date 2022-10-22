package register;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegisterTest {
    WebDriver driver;
    @Test
    public void testRegister(){
          driver = new ChromeDriver();
          driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://demo.automationtesting.in/Register.html");
         driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Silas");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Leão");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Rua dos bobos numero 0");
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("silas.souza@testes.com");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1178941236");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
        driver.findElement(By.xpath("//input[@value='Movies']")).click();
     // Select
        Select skills = new Select(driver.findElement(By.id("Skills")));
         skills.selectByVisibleText("Java");
          driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[3]")).click();

        Select ano = new Select(driver.findElement(By.id("yearbox")));
        ano.selectByVisibleText("1996");

        Select mes = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
        mes.selectByVisibleText("April");

        Select dia = new Select(driver.findElement(By.id("daybox")));
        dia.selectByVisibleText("4");

    }

}
