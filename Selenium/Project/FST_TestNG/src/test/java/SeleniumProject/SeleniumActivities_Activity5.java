package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumActivities_Activity5 extends BaseClass{

 @Test ()
    public void editUserInfo(){
    username.sendKeys("orange");
    pwd.sendKeys("orangepassword123");
    Loginbutton.click();
    driver.findElement(By.id("menu_pim_viewMyDetails")).click();
     driver.findElement(By.id("menu_pim_viewMyDetails")).click();
     driver.findElement(By.id("btnSave")).click();
    WebElement fname = driver.findElement(By.id("personal_txtEmpFirstName"));
     fname.clear();
     fname.sendKeys("Conor");
     WebElement lastname = driver.findElement(By.id("personal_txtEmpLastName"));
     lastname.clear();
     lastname.sendKeys("Harte");

      driver.findElement(By.id("personal_DOB")).sendKeys("1996-01-31");
     WebElement nationalitydropdown = driver.findElement(By.id("personal_cmbNation"));

     Select nationality = new Select(nationalitydropdown);
     nationality.selectByVisibleText("Indian");
     driver.findElement(By.id("btnSave")).click();

 }



}
