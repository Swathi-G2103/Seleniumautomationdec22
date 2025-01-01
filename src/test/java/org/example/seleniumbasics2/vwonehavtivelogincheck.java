package org.example.seleniumbasics2;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class vwonehavtivelogincheck {
    @Description ("Verify invliad login")
    @Test
     public void test_vwoinvalid_login() throws Exception{

         ChromeOptions chromeOptions = new ChromeOptions();
         chromeOptions.addArguments("--start-maximizes");
         WebDriver driver = new ChromeDriver(chromeOptions);
         driver.navigate().to("https://app.vwo.com/#/login");
         WebElement login = driver.findElement(By.id("login-username"));
            login.sendKeys("swathigarimella");
            WebElement password= driver.findElement(By.id("login-password"));
            password.sendKeys("Swathi21");
        WebElement loginbutton=driver.findElement(By.id("js-login-btn"));
        loginbutton.click();
        Thread.sleep(3000);
        WebElement errormessge = driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(errormessge.getText(),"Your email, password, IP address or location did not match");
        driver.quit();

     }
}
