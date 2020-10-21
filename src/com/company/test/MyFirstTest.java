package com.company.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyFirstTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alex\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setHeadless(true);
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();
        driver.getTitle();
    }
}
