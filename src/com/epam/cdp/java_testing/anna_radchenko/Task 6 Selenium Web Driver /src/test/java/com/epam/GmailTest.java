package com.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by 1 on 12.03.2017.
 */
public class GmailTest {
    @Test
    public void OpenGmail(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com");
        driver.findElement(By.id("Email")).sendKeys("anyatest08");
        driver.findElement(By.name("signIn")).click();
        driver.findElement(By.id("Passwd")).sendKeys("17111994a");
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("//a[@class='WaidBe']")).click();
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
        driver.findElement(By.name("to")).sendKeys("anyatest09@gmail.com");
        driver.findElement(By.name("subjectbox")).sendKeys("Test");
        driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("This is my test email.");
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
        driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
        driver.findElement(By.xpath("//a[@class='gb_Ha gb_3e gb_af gb_yb']")).click();
        driver.findElement(By.id("account-chooser-link")).click();
        driver.findElement(By.id("account-chooser-add-account")).click();
        driver.findElement(By.id("Email")).sendKeys("anyatest09");
        driver.findElement(By.name("signIn")).click();
        driver.findElement(By.id("Passwd")).sendKeys("17111994a");
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("//div[@class='ae4 aDM']")).click();
        driver.findElement(By.xpath("//*[@id=':5']/div[2]/div[1]/div/div[2]/div[2]")).click();
        driver.findElement(By.name("rs")).click();
        driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
        driver.findElement(By.xpath("//a[@class='gb_Ha gb_3e gb_af gb_yb']")).click();
        driver.findElement(By.id("account-chooser-add-account")).click();
        driver.findElement(By.id("Email")).sendKeys("anyatest08");
        driver.findElement(By.name("signIn")).click();
        driver.findElement(By.id("Passwd")).sendKeys("17111994a");
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
        driver.findElement(By.name("to")).sendKeys("anyatest09@gmail.com");
        driver.findElement(By.name("subjectbox")).sendKeys("Test");
        driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("This is my test email.");
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
        driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
        driver.findElement(By.xpath("//a[@class='gb_Ha gb_3e gb_af gb_yb']")).click();
        driver.findElement(By.id("account-chooser-add-account")).click();
        driver.findElement(By.id("Email")).sendKeys("anyatest09");
        driver.findElement(By.name("signIn")).click();
        driver.findElement(By.id("Passwd")).sendKeys("17111994a");
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("//span[@class='CJ']")).click();
        driver.findElement(By.xpath("//span[@class='nU n1']")).click();
        String text = driver.findElement(By.xpath("//div[@class='afn']")).getText();
        Assert.assertEquals("Test", text.contains("Test"));
        driver.findElement(By.xpath("//span[@class='x2']")).click();
        driver.findElement(By.name("ok")).click();
        driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
        driver.findElement(By.xpath("//a[@class='gb_Ha gb_3e gb_af gb_yb']")).click();
        driver.findElement(By.id("edit-account-list")).click();
        driver.findElement(By.id("choose-account-0")).click();
        driver.findElement(By.id("choose-account-1")).click();
        driver.findElement(By.id("edit-account-list")).click();
        driver.quit();
    }
}
