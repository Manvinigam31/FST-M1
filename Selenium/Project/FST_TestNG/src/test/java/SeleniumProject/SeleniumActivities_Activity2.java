package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumActivities_Activity2 extends BaseClass {

    @Test
    public void urlOfHeaderImage(){

        WebElement logo =driver.findElement(By.id("divLogo"));
        String url = logo.getAttribute("src");
        System.out.println("url");

    }
}
