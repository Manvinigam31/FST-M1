package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SeleniumActivities_Activity7 extends BaseClass{

    @Test
        public void addQualificaions(){
        username.sendKeys("orange");
        pwd.sendKeys("orangepassword123");
        Loginbutton.click();
        driver.findElement(By.linkText("My Info")).click();
        driver.findElement(By.linkText("My Info")).click();
        driver.findElement(By.linkText("Qualifications")).click();

        driver.findElement(By.xpath("//input[@id='addWorkExperience']")).click();
        driver.findElement(By.id("experience_employer")).sendKeys("Accenture");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("SSE");
        driver.findElement(By.xpath("//input[@id='btnWorkExpSave']")).click();






    }


}
