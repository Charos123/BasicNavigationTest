package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com", "https://www.westelm.com",
                "https://walmart.com");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://luluandgeorgia.com");
       Thread.sleep(2000);

        String expluluUrl = driver.getCurrentUrl();
        String actluluTitle = driver.getTitle().toLowerCase().replace(" ", "");

        if (expluluUrl.contains(actluluTitle)) {
            System.out.println("Test is pass");
        } else {
            System.out.println("Test is fail");
        }
     driver.close();


        WebDriverManager.chromedriver().setup();
        driver.navigate().to("https://wayfair.com");

      Thread.sleep(2000);

        String expwayfairUrl = driver.getCurrentUrl();
        String actualwayfairTitle = driver.getTitle().toLowerCase();

        if (expwayfairUrl.contains(actualwayfairTitle)) {
            System.out.println("Wayfair page is pass");
        } else {
            System.out.println("Wayfair page is not pass");
        }
        driver.close();
    }
}