package org.example.seleniumbasics1;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testselenium1 {
    @Description("open the URL")
    @Test
public void test_selenium()
    {
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());

    }


}
