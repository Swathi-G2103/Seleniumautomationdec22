package org.example.seleniumbasics2.idrive360;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login_IDrive360 {
    @Description("Verify the Expiry ")
    @Test

    public void TestloginIdrive360() throws Exception{

        ChromeOptions chromeOptions = new ChromeOptions();
//
        chromeOptions.addArguments("--start-maximized");
//
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
        email.sendKeys("augtest_040823@idrive.com");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("123456");

        WebElement signin = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        signin.click();
        Thread.sleep(15000);
//h5[text()="Your free trial has expired"]
        WebElement errormessge = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));
        Assert.assertEquals(errormessge.getText(),"Your free trial has expired");
        driver.quit();


    }

}
