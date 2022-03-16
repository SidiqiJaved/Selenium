package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Task {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver amzn = new ChromeDriver();
        amzn.get("https://www.amazon.com/");

        String url = amzn.getCurrentUrl();
        String title = amzn.getTitle();
        System.out.println(title+ " "+ url);
        amzn.quit();



    }
}
