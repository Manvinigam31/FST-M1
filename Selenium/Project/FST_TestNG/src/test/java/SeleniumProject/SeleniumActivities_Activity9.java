package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumActivities_Activity9 extends BaseClass {
    @Test
    public void retriveEmergencyContacts() {

        username.sendKeys("orange");
        pwd.sendKeys("orangepassword123");
        Loginbutton.click();

        driver.findElement(By.linkText("My Info")).click();
        driver.findElement(By.linkText("My Info")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("sidenav"))));
        driver.findElement(By.linkText("Emergency Contacts")).click();
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='emgcontact_list']//tr"));

// And iterate over them and get all the cells
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print the contents of each cell
            for (WebElement cell : cells) {
//retrieving elements and print to console

                System.out.println(cell.getText());


            }


        }
    }
}