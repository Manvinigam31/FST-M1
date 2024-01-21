package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumActivities_Activity8 extends BaseClass{

    @Test
    public void applyingForLeave(){
        username.sendKeys("orange");
        pwd.sendKeys("orangepassword123");
        Loginbutton.click();
        driver.findElement(By.linkText("Dashboard")).click();
        driver.findElement(By.xpath("//span[text()='Apply Leave']")).click();
        Select leavetype = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        leavetype.selectByIndex(1);
        driver.findElement(By.name("applyleave[txtFromDate]")).clear();
        driver.findElement(By.name("applyleave[txtFromDate]")).sendKeys("2024-04-05");
        driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']//following-sibling::img")).click();
        driver.findElement(By.name("applyleave[txtToDate]")).clear();
        driver.findElement(By.name("applyleave[txtToDate]")).sendKeys("2024-04-07");
        driver.findElement(By.id("applyBtn")).click();

}

    @Test
    public void checkLeaveStatus(){
        driver.findElement(By.linkText("My Leave")).click();
      String leaveStatus = driver.findElement(By.xpath("//table[@id='resultTable']//tr[1]/td[6]")).getText();
        Assert.assertEquals(leaveStatus, "Pending Approval(2.00)");

    }
}
