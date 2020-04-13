package com.cybertek.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.*;
public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {

        /*
        1.Create a new class TitleVerification2under testspackageand create a main method.
        2.Add this ArrayListdeclaration to the main method: List<String> urls = Arrays.asList("https://luluandgeorgia.com",
        "https://wayfair.com", "https://www.westelm.com","https://walmart.com);
        3.Visit all websites one by one.
        4.Verify that URL of the website contains the title ofthe website.
         Ignore spaces and case in comparison.   For example, title of in the first
         website title is Lulu and Giorgiaand the URL is https://lulugandgeorgia.com.
          So, this test case must pass.5.Close the browser at the end of the test
         */

        // 2.Add this ArrayListdeclaration to the main method: List<String> urls = Arrays.asList("https://luluandgeorgia.com",
        //        "https://wayfair.com", "https://www.westelm.com","https://walmart.com);
        List<String>urls= Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com", "https://www.westelm.com",
                "https://walmart.com");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://luluandgeorgia.com");
        Thread.sleep(2000);

        String expluluUrl=driver.getCurrentUrl();
        String  actluluTitle=driver.getTitle().toLowerCase().replace(" ","");

        if(expluluUrl.contains(actluluTitle)){
            System.out.println("Test is pass");
        }else{
            System.out.println("Test is fail");
        }

        driver.navigate().to("https://wayfair.com");
        Thread.sleep(2000);

        String expwayfairUrl=driver.getCurrentUrl();
        String actualwayfairTitle= driver.getTitle().toLowerCase();

        if(expwayfairUrl.contains(actualwayfairTitle)){
            System.out.println("Wayfair page is pass");
        }else{
            System.out.println("Wayfaire page is not pass");
        }

        driver.navigate().to("https://www.westelm.com");
        Thread.sleep(2000);

        String expWestelm=driver.getCurrentUrl();
        String actWestelm=driver.getTitle().toLowerCase().replace(" ","");

        if(expWestelm.contains(actualwayfairTitle)){
            System.out.println("Westelm page is Pass");
        }else{
            System.out.println("Westelm page is fail");
        }


       driver.navigate().to("https://walmart.com");
       Thread.sleep(2000);

       String expWalmart =driver.getCurrentUrl();
       String actWalmart=driver.getTitle().toLowerCase();

       if(expWalmart.contains(actWalmart)){
           System.out.println("Walmart page is pass");
       }else{
           System.out.println("Walmart page is fail");
       }
        driver.close();





    }
}
