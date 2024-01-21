package SeleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumActivites_Activity1 extends BaseClass{




       @Test
      public void verifywebsitetitle(){

          System.out.println("Title of wepage is :"+driver.getTitle());
           Assert.assertEquals(driver.getTitle() , "OrangeHRM");

    }




}
