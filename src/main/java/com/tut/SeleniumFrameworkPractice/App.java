package com.tut.SeleniumFrameworkPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement sel=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select s=new Select(sel);
        s.selectByValue("option1");
        driver.findElement(By.id("name")).sendKeys("Mayuresh");
        driver.findElement(By.id("alertbtn")).click();
        driver.quit();
        
        
        
    }
}
