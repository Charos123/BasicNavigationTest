package com.cybertek.tests;


import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class AmazonTitle {
    //main method to invoke the test
    public static void main(String[] args) throws InterruptedException {
        /*
        1 Open go to amazon
        2.enter any search term
        3.click on search button
        4. remember the name of the first result
        5. click on the first result
        6.verify that product name is same in the product page

         */
      nameMatchTest();
    }
                //each test will be a seperate method
      private static void nameMatchTest() throws InterruptedException {
                //  1 Open go to amazon
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://amazon.com");

                //  2.enter any search term
        String searchTerm = "disinfectant wipes";
        WebElement searchInput = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
            // Option 1: enter search term and hit Enter button
            // searchInput.sendKeys(searchTerm+ Keys.ENTER);

             //OPTION 2: Enter search term and  click the search button
        searchInput.sendKeys(searchTerm);

             //  3.click on search button
        WebElement searchBtn=driver.findElement(By.className("nav-input"));
        searchBtn.click();

                //  4. remember the name of the first result
        Thread.sleep(2000);
        //write xpath that captures first result
        WebElement firstResult = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        //it's printing the value
        System.out.println(firstResult.getText());
        //click on the first result
        String expectedName = firstResult.getText();

             //  5. click on the first result
        firstResult.click();

            // 6.verify that product name is same in the product page
            //creating new variable
        WebElement productname = driver.findElement(By.id("productTitle"));
        String actualName = productname.getText();
        System.out.println(actualName);

        if(expectedName.equals(actualName)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedName="+ expectedName);
            System.out.println("actualName ="+actualName);
        }
        driver.close();
      }

}
