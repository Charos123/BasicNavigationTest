package com.cybertek.tests;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaUrl {
    public static void main(String[] args) throws InterruptedException {

        /*
        1.Go to wikipedia.org
        2.enter search term selenium webdriver
        3.click on search button
        4.click on search result Selenium (software)
        5.verify url ends with Selenium_(software)
         */

        // 1.Go to wikipedia.org
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(" https://wikipedia.org");

        // 2.enter search term selenium webdriver
        WebElement searchTerm = driver.findElement(By.id("searchInput"));
       searchTerm.sendKeys("Selenium Webdriver");
        System.out.println(searchTerm.getText());
 //       searchTerm.click();

//        // 3.click on search button
//        Thread.sleep(2000);
//        WebElement searchBtn = driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']"));
//        searchBtn.submit();
//
//       // 4.click on search result Selenium (software)
//        Thread.sleep(3000);
//        WebElement searchSelenium=driver.findElement(By.className("mw-search-result-heading"));
//       searchSelenium.click();


    }
}