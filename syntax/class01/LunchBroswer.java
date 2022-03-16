package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LunchBroswer {
    public static void main(String[] args) {

        // two agrugemnts  first is built int webdriver...

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();   // launch the browser
        driver.get("https://www.google.com/");

       String url= driver.getCurrentUrl();
        System.out.println(url);   // prints url
        String title =  driver.getTitle();
        System.out.println(title);  //prints the title of the website
        driver.quit(); // closes the website



    }
}
