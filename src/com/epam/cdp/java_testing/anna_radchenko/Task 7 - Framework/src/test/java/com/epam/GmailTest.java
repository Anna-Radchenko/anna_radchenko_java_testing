package com.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by 1 on 12.03.2017.
 */
public class GmailTest {
    String account1 = data.get(0);
    String password = data.get(2);
    String account2 = data.get(1);
    String subject = "Test";
    String body = "This is my test email.";

    @DataProvider
    public Object[][] testData(Method method, String sheet){
        ExcelReader excelReader = new ExcelReader();
        excelReader.setExcelFile(System.getProperty("C:\\Users\\1\\Downloads\\TestData.xlsx"), sheet);
        List rowsNo = excelReader.getRowContains(method.getName(), COL_NUM);
        return excelReader.getTableArray(rowsNo);
    }

    @Test (dataProvider = "testData")
    public void OpenGmail(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com");
        driver.findElement(By.id("Email")).sendKeys(account1);
        driver.findElement(By.name("signIn")).click();
        driver.findElement(By.id("Passwd")).sendKeys(password);
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("//a[@class='WaidBe']")).click();
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
        driver.findElement(By.name("to")).sendKeys(account2);
        driver.findElement(By.name("subjectbox")).sendKeys(subject);
        driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys(body);
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
        driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
        driver.findElement(By.xpath("//a[@class='gb_Ha gb_6e gb_df gb_yb']")).click();
        driver.findElement(By.id("account-chooser-link")).click();
        driver.findElement(By.id("account-chooser-add-account")).click();
        driver.findElement(By.id("Email")).sendKeys(account2);
        driver.findElement(By.name("signIn")).click();
        driver.findElement(By.id("Passwd")).sendKeys(password);
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("//div[@class='ae4 aDM']")).click();
        driver.findElement(By.xpath("//*[@id=':5']/div[2]/div[1]/div/div[2]/div[2]")).click();
        driver.findElement(By.name("rs")).click();
        driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
        driver.findElement(By.xpath("//a[@class='gb_Ha gb_6e gb_df gb_yb']")).click();
        driver.findElement(By.id("account-chooser-add-account")).click();
        driver.findElement(By.id("Email")).sendKeys(account1);
        driver.findElement(By.name("signIn")).click();
        driver.findElement(By.id("Passwd")).sendKeys(password);
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
        driver.findElement(By.name("to")).sendKeys(account2);
        driver.findElement(By.name("subjectbox")).sendKeys(subject);
        driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys(body);
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
        driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
        driver.findElement(By.xpath("//a[@class='gb_Ha gb_6e gb_df gb_yb']")).click();
        driver.findElement(By.id("account-chooser-add-account")).click();
        driver.findElement(By.id("Email")).sendKeys(account2);
        driver.findElement(By.name("signIn")).click();
        driver.findElement(By.id("Passwd")).sendKeys(password);
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("//span[@class='CJ']")).click();
        driver.findElement(By.xpath("//span[@class='nU n1']")).click();
        String text = driver.findElement(By.xpath("//div[@class='yP']")).getText();
        Assert.assertEquals("Test", text.contains("Test"));
        driver.findElement(By.xpath("//span[@class='x2']")).click();
        driver.findElement(By.name("ok")).click();
        driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
        driver.findElement(By.xpath("//a[@class='gb_Ha gb_6e gb_df gb_yb']")).click();
        driver.findElement(By.id("edit-account-list")).click();
        driver.findElement(By.id("choose-account-0")).click();
        driver.findElement(By.id("choose-account-1")).click();
        driver.findElement(By.id("edit-account-list")).click();
        driver.quit();
    }
}
