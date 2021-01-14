package com.github.de9d.common;

import org.testng.ITestNGListener;
import org.testng.annotations.*;

@Listeners(ITestNGListener.class)
public class SimpleTestBaseClass {

    @BeforeGroups
    private void beforeGroup() {}

    @BeforeSuite
    private void beforeSuite() {}

    @BeforeTest
    private void beforeTest() {}

    @BeforeClass
    private void beforeClass() {}

    @BeforeMethod
    private void beforeMethod() {}


}
