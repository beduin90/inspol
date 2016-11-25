package com.inspol.tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.inspol.objects.indexPage;

import java.io.File;

public class TestBase
{
protected WebDriver driver;
    public indexPage indexPage;

    @Before
    public void testPrintMessage(){

        System.setProperty("webdriver.chrome.driver", ".//src//test//resources/chromedriver.exe");
      driver = new ChromeDriver();
        indexPage=new indexPage();
        driver.navigate().to("http://inspol-instalacje.pl");
        System.out.println("test1");
    }

    @After
    public void close()
    {
        driver.close();
    }

}
