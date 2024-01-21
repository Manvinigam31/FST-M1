package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumActivities_Activity4 extends SeleniumActivities_Activity3 {

    @Test
    public void addEmployee() {
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAdd")));
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys("Manvi");
        driver.findElement(By.id("lastName")).sendKeys("Nigam");
        driver.findElement(By.id("btnSave")).click();

    }

    @Test
    public void searchAddedEmployee() {
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Manvi Nigam");
        driver.findElement(By.id("searchBtn")).click();
       String employeetableresult = driver.findElement(By.xpath("//table[@id='resultTable']//td")).getText();
        Assert.assertFalse(employeetableresult.equalsIgnoreCase("No Records Found") , "Employee has not been added"); //will get this error only when assertion fails

    }


}