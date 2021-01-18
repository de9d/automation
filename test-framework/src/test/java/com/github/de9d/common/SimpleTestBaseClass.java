package com.github.de9d.common;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

import java.time.LocalDateTime;


@Slf4j
public class SimpleTestBaseClass {
    /*
    *
    * Actions that should be performed before running certain
    * groups of tests
    *
    * */
    @BeforeGroups
    public void beforeGroup() {
        log.info(String.valueOf(LocalDateTime.now()));
    }
    /*
    *
    * Actions that should be performed before running
    * test suit (before loading test classes)
    *
    * */
    @BeforeSuite
    public void beforeSuite() {
        log.info(String.valueOf(LocalDateTime.now()));
    }
    /*
    *
    * Actions that should be performed before running
    * test cases and after before suit
    *
    * */
    @BeforeTest
    public void beforeTest() {
        log.info(String.valueOf(LocalDateTime.now()));
    }
    /*
    *
    * Actions that should be performed after beforeSuit() and before loading
    * certain class (before methods in class are invoked)
    *
    * */
    @BeforeClass
    public void beforeClass() {
        log.info(String.valueOf(LocalDateTime.now()));
    }
    /*
    *
    * Actions that should be performed before executing
    * certain method
    *
    * */
    @BeforeMethod
    public void beforeMethod() {
        log.info(String.valueOf(LocalDateTime.now()));
    }
}
