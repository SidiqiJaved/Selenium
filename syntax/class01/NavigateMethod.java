package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
       driver.navigate().to("https://www.google.com/");
       driver.navigate().back();
       driver.navigate().forward();
        Thread.sleep(2000); // it pauses excution for when ask millis 2 second
       driver.navigate().refresh();
       driver.close();  // will close the current tab the active
        driver.quit(); /// will close the browser





    }
}
