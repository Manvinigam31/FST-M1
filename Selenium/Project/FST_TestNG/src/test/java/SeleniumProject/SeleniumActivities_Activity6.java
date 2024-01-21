package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumActivities_Activity6 extends BaseClass{
    @Test
    public void verfydirectorymenu(){
        username.sendKeys("orange");
        pwd.sendKeys("orangepassword123");
        Loginbutton.click();
        driver.findElement(By.xpath("//div[@class='menu']"));
       WebElement directory =  driver.findElement(By.linkText("Directory"));
       Assert.assertTrue(directory.isDisplayed(), "Directory is not displayed");
        Assert.assertTrue(directory.isEnabled(), "Directory is enabled to click");
        wait.until(ExpectedConditions.elementToBeClickable(directory));
        directory.click();
        directory.click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='head']")).getText(), "Search Directory");




    }
}
