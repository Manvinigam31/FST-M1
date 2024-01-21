package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;




public class SeleniumActivities_Activity3 extends BaseClass{





    @Test
    public void Loginandverifyhomepage(){

       username.sendKeys("orange");
        pwd.sendKeys("orangepassword123");
        Loginbutton.click();
        Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed(), "Home page is Displayed");
    }
}

