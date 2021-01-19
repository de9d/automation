package com.github.de9d.common;

import api.SimpleClass;
import com.github.de9d.common.example.FirstSimpleTestClass;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.time.LocalDateTime;


@Slf4j
public class SimpleTestBaseClass {

    public final static Logger LOG = LoggerFactory.getLogger(FirstSimpleTestClass.class);
    public final static SimpleClass SIMPLE_CLASS = new SimpleClass();
    public final static String MARKER = "\n\n===================================================================\n\n";
    public final static String MSG = "Executing suite:%s\n running test: %s";
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
        log.info("Executing suite: " + getClass());
        log.info(String.valueOf(LocalDateTime.now()));
        log.info("    O    0 0     0 0");
        log.info("    0   0 0 0   0 0 0");
        log.info("0   0  00000 0 0 00000");
        log.info(" 0 0  0     0 0 0     0");
    }
    /*
    *
    * Actions that should be performed before running
    * test cases and after before suit
    *
    * */
    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        log.info("\n\n");
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
