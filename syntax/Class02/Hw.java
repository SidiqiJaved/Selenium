package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
    driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
    driver.findElement(By.name("customer.firstName")).sendKeys("Sarkar");
    driver.findElement(By.name("customer.lastName")).sendKeys("Sidiski");
    driver.findElement(By.name("customer.address.street")).sendKeys("135");
    driver.findElement(By.name("customer.address.city")).sendKeys("Alexandria");
    driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
    driver.findElement(By.name("customer.address.zipCode")).sendKeys("223144");
    driver.findElement(By.name("customer.phoneNumber")).sendKeys("3217-5646-545");
    driver.findElement(By.id("customer.ssn")).sendKeys("564-564-4555");
    driver.findElement(By.name("customer.username")).sendKeys("Alpha Beta");
    driver.findElement(By.name("customer.password")).sendKeys("asd54we");
    driver.findElement(By.name("repeatedPassword")).sendKeys("asd54we");
    driver.findElement(By.className("button")).click();
    Thread.sleep(2000);
    driver.close();

    }
}
