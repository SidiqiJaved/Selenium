package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {



        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
           driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(new CharSequence[]{"tester"});
           driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(new CharSequence[]{"test"});
           driver.findElement(By.className("button")).click();
           String title = driver.getTitle();
           if (title.equals("Web Orders")) {
               System.out.println(" title is correct ");
           } else {
              System.out.println("Title is not correct");
              driver.quit();
           }

        }
    }

