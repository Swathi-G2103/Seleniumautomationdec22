package org.example.seleniumbasics2.katalonproject1;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class katalon_Login {
    @Description(".https://katalon-demo-cura.herokuapp.com/\n" +
            "\n" +
            "Click on Make Appointment button\n" +
            "\n" +
            "Enter the Login creds and submit click\n" +
            "\n" +
            "Verify the current URL == https://katalon-demo-cura.herokuapp.com/#appointment ")
    @Test
    public void katalon_studio_login() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
//
        chromeOptions.addArguments("--start-maximized");
//
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
//    driver.navigate().to("https://app.vwo.com");

        WebElement make_Appointment = driver.findElement(By.linkText("Make Appointment"));
        make_Appointment.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("ThisIsNotAPassword");



        WebElement login_button = driver.findElement(By.id("btn-login"));
        login_button.click();

        Thread.sleep(2000);

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://katalon-demo-cura.herokuapp.com/#appointment");


        Thread.sleep(5000);
        driver.quit();

    }
}