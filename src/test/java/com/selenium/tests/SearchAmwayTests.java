package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchAmwayTests {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.navigate().to("https://www.amway.ru/");
    }

    @Test
    public void searchFromNavMenuTest(){
        // click on Nav Panel: Nashi Brendy (Our Brands)
        wd.findElement(By.cssSelector("#amweia-app nav [href=\"/our-brands\"]")).click();
        // get Page Title
        String pageTitle = wd.findElement(By.cssSelector("h1")).getText();
        System.out.println(pageTitle);
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        wd.quit();
    }

}
