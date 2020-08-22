package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04Locat {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");
        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();
        //WebElement HomeLinki = driver.findElement(By.linkText("          Home\n"));
        //HomeLinki.click();
        WebElement HomeLinki = driver.findElement(By.partialLinkText("H"));
        HomeLinki.click();
    }
}
