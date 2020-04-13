package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    /*
    Utilities: BrowserFactory
    1. Create class BrowserFactory under utilities package.
    2. Create a public static method getDriver which takes a string argument.
    3. Return a new WebDriver object for ChromeDriver,FirefoxDriver,EdgeDriveror
    SafariDriver based on the value of the string argument.
     */

    public static WebDriver getDriver(String browserType) {
        //local veriables
        WebDriver driver = null;

        switch (browserType) {
            case "chrome":
                 WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
            case "edge":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
            case "safari":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
        }
            return  driver;
    }
}
