package SeleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {

    WebDriver driver;
    WebDriverWait wait;

    WebElement username;
    WebElement pwd;
    WebElement Loginbutton;






    @BeforeClass
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        driver.get("http://alchemy.hguy.co/orangehrm");
         username = driver.findElement(By.id("txtUsername"));
         pwd = driver.findElement(By.id("txtPassword"));
         Loginbutton =  driver.findElement(By.name("Submit"));
}

    @AfterClass
    public void closebrowser(){

        driver.quit();
    }

}
