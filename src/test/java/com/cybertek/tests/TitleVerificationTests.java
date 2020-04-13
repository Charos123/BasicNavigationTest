package com.cybertek.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
public class TitleVerificationTests {
    public static void main(String[] args) throws InterruptedException {
        /*

        	Tests: Title and URLtest
        	   1.Create a new class TitleVerificationTestsunder	testspackage
        		and create a main method.
        		2.Add this ArrayList declaration to the main method: List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
        		 "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");
        		 3.Open chrome browser
        		 4.Visit all the websitesfrom step 3and verify that they all have the same title.
        		 5.Verify that all URLsof all pages start with http://practice.cybertekschool.com.
                6.Close the browser at the end of the test. Tests: Title a
         */

        List<String>urls=  Arrays.asList("http://practice.cybertekschool.com",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com.");
        Thread.sleep(2000);
         String expUrl="http://practice.cybertekschool.com.";
         String act1 = driver.getCurrentUrl();

         if(act1.startsWith(expUrl)){
             System.out.println("Pass");
         }else{
             System.out.println("Fail");
         }


driver.navigate().to("http://practice.cybertekschool.com/dropdown");
Thread.sleep(2000);

String  expUrl2="http://practice.cybertekschool.com/dropdown";
 String act2=driver.getCurrentUrl();
 Thread.sleep(2000);

 if(act2.startsWith(expUrl2)){
     System.out.println("Pass");
 }else{
     System.out.println("Fail");
 }



driver.navigate().to("http://practice.cybertekschool.com/login");
Thread.sleep(2000);
String expUrl3="http://practice.cybertekschool.com/login";
String actual3=driver.getCurrentUrl();

if(actual3.startsWith(expUrl3)){
    System.out.println("pass");
}else{
    System.out.println("Fail");
}

driver.close();




    }
}
