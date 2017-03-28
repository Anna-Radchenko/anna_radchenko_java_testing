package com.epam;

/**
 * Created by 1 on 20.03.2017.
 */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class CaptureScreenshotListener extends TestListenerAdapter
    {
        @Override
        public void onTestFailure (ITestResult testResult)
        {
            super.onTestFailure(testResult);

            WebDriver driver = new  ChromeDriver ();

                // Create a calendar object so we can create a date and time for the screenshot
                Calendar calendar = Calendar.getInstance();

                // Get the users home path and append the screen shots folder destination
                String userHome = System.getProperty("user.home");
                String screenShotsFolder = userHome + "\\Desktop\\Test-Failure-Screenshots\\";

                // The file includes the the test method and the test class
                String testMethodAndTestClass = testResult.getMethod().getMethodName() + "(" + testResult.getTestClass().getName() + ")";

                System.out.println(" *** This is where the capture file is created for the Test \n" + testMethodAndTestClass );

                // Create the filename for the screen shots
                String filename = screenShotsFolder + "-"
                        + testMethodAndTestClass + "-"
                        + calendar.get(Calendar.YEAR) + "-"
                        + calendar.get(Calendar.MONTH) + "-"
                        + calendar.get(Calendar.DAY_OF_MONTH) + "-"
                        + calendar.get(Calendar.HOUR_OF_DAY) + "-"
                        + calendar.get(Calendar.MINUTE) + "-"
                        + calendar.get(Calendar.SECOND) + "-"
                        + calendar.get(Calendar.MILLISECOND)
                        + ".png";

                // Take the screen shot and then copy the file to the screen shot folder
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

                try  {
                    FileUtils.copyFile(scrFile, new File(filename));
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

            }

        }
