package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(2000);
        String actTitle1=driver.getTitle();
        String actTitle2=driver.getTitle();

        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String actetsyTitle1= driver.getTitle();
        String actetsyTitle2=driver.getTitle();

        driver.navigate().back();
        Thread.sleep(2000);

        if(actTitle1.equals(actTitle2)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.navigate().forward();
        Thread.sleep(2000);

        if(actetsyTitle1.equals(actetsyTitle2)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.close();

    }
}
