package com.company.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alex\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

//        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//        driver.findElement(By.id("btnLogin")).click();

        // using xPath
//        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
//        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
//        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        // using cssSelector
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
        driver.findElement(By.cssSelector("input.button")).click();

        driver.close();
    }
}
