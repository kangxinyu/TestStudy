package com.test.stu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
    @Test
    public void testcase1(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("www.baidu.com");
        
    }
}
