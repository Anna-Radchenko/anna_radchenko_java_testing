package com.epam.cdp.java_testing.anna_radchenko.task8;

/*
* Create a java project. Import Calculator.jar and TestNG libraries.
* For the project do following tasks:
* 1.	Write at least 10 unit tests for calculator methods (5 positive and 5 negative).
* 2.	Tests should have Before* and After* methods.
* 3.	Add Assert to each test method.
* 4.	Create .xml file configuration and use it to run tests.
* 5.	Create at least one test group. Some tests can depend on this group, or this group can be used to exclude/include tests from launch using XML-suite.
* 6.	Create parameterized test (use Data Provider).
* 7.	Use checks for expected exceptions.
* 8.	Configure and execute tests in parallel.
* 9.	Try to find all bugs.
* 10.	Implement tests launching with custom Runner, implement and use at least one listener.
*/

import static org.testng.Assert.*;
import org.testng.annotations;

public class CalculatorTest {

    //positive tests

    @Test(groups = "positiveTests")
    public void testSumDouble() {
        Assert.assertEquals(10.22, calc.sum(4.11,6.11));
    }

    @Test(groups = "positiveTests")
    public void testSubDouble() {
        Assert.assertEquals(2.22, calc.sub(5.55,3.33));
    }

    @Test(groups = "positiveTests")
    public void testSumLong() {
        Assert.assertEquals(2222222223, calc.sum(1111111111,1111111112));
    }

    @Test(groups = "positiveTests")
    public void testSubLong()  {
        Assert.assertEquals(1111111112, calc.sub(2222222223,1111111111));
    }

    @Test(groups = "positiveTests")
    public void testMultDouble()  {
        Assert.assertEquals(20, calc.mult(4.11, 5.11));
    }

    @Test(expectedExceptions = NumberFormatException, groups = "positiveTests")
    public void testNumberFormatException() {
        b == 0
    }

    //parameterized test

    @DataProvider(groups = "positiveTests")
    public Object[][] divLocalData() {
        return new Object[][]{
                {4, calc.div(4.44, 1.11)},
        };
    }

    @Test(dataProvider = "divLocalData")
    public void div(int result, int divNumber) {
        assertEquals(result, divNumber);
    }

    //negative tests

    @Test
    public void(groups = "negativeTests")
        public void testThreeNumbers() {
        Assert.assertNotEquals(3, calc.sum(1, 1, 1));
        }

    @Test
    public void(groups = "negativeTests")
        public void divSecondValue() {
        Assert.asserNotEquals(3, calc.div(2,6));
        }
    @Test
    public void(groups = "negativeTests")
        public void powSecondValue() {
        Assert.assertNotEquals(2, calc.pow(1,2))
        }
}
