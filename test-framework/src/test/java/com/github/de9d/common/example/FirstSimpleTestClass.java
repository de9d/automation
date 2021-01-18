package com.github.de9d.common.example;

import api.SimpleClass;
import com.github.de9d.common.SimpleTestBaseClass;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.testng.annotations.*;
import tools.TestNGListener;

import static org.testng.Assert.*;

@Slf4j
@Listeners(TestNGListener.class)
public class FirstSimpleTestClass extends SimpleTestBaseClass {

    final static Logger LOG = LoggerFactory.getLogger(FirstSimpleTestClass.class);
    final static SimpleClass SIMPLE_CLASS = new SimpleClass();
    final static String MARKER = "\n\n===================================================================\n\n";

    @BeforeGroups
    public void beforeGroup() {

    }
    /*
     *
     * Actions that should be performed before running
     * test suit (before loading test classes)
     *
     * */
    @BeforeSuite
    public void beforeSuite() {
        super.beforeSuite();
        LOG.info("invoked beforeSuite()");
        LOG.info("Debug status: {}", LOG.isDebugEnabled());
        LOG.info("Error status: {}", LOG.isErrorEnabled());
        LOG.info("Info status: {}", LOG.isInfoEnabled());
        LOG.info("Trace status: {}", LOG.isTraceEnabled());
        LOG.info("Warn status: {}", LOG.isWarnEnabled());
        LOG.info(MARKER);
        log.info("Message logged with thr use of annotation");
    }
    /*
     *
     * Actions that should be performed before running
     * test cases and after before suit
     *
     * */
    @BeforeTest
    public void beforeTest() {
        super.beforeTest();
        LOG.info("invoked beforeTest()");
        LOG.info(MARKER);
    }
    /*
     *
     * Actions that should be performed after beforeSuit() and before loading
     * certain class (before methods in class are invoked)
     *
     * */
    @BeforeClass
    public void beforeClass() {
        super.beforeClass();
        LOG.info("invoked beforeClass()");
        LOG.info(MARKER);
    }
    /*
     *
     * Actions that should be performed before executing
     * certain method
     *
     * */
    @BeforeMethod
    public void beforeMethod() {
        super.beforeMethod();
        LOG.debug(Marker.ANY_MARKER);
        LOG.info("invoked beforeMethod()");
        SIMPLE_CLASS.setId(1);
        int oldID = SIMPLE_CLASS.getId();
        LOG.debug("ID was changed from: {} to: {}", oldID, SIMPLE_CLASS.getId());
        String oldName = SIMPLE_CLASS.getName();
        SIMPLE_CLASS.setName("SimpleClass");
        LOG.debug("Name was changed from: {} to: {}", oldName, SIMPLE_CLASS.getName());
        double oldQuote = SIMPLE_CLASS.getQuote();
        SIMPLE_CLASS.setQuote(0.5D);
        LOG.debug("Quote was changed from: {} to: {}", oldQuote, SIMPLE_CLASS.getQuote());
    }

    @Test
    public void testSetId() {
        LOG.info("invoked testSetId()");
        int boundaryLow = 0;
        int boundaryHigh = Integer.MAX_VALUE;
        SIMPLE_CLASS.setId(-1);
        int newID = SIMPLE_CLASS.getId();
        log.info("ID set to {}, must be larger than {}", newID, boundaryLow);
        // check that id is positive value
        if (newID < 1) {
            log.error("ID Value must be positive integer",
                    new Exception("IllegalArgument utilized by method!"));
        }
        // check what happens with variable size overflow
        SIMPLE_CLASS.setId(boundaryHigh + 1);
        newID = SIMPLE_CLASS.getId();
        LOG.debug("ID set to {}, expected to be larger than {}, or the same", newID, boundaryHigh);
        if (newID < boundaryHigh) {
            LOG.error("Unexpected value of ID: {}", newID,
                    new Exception("Illegal argument utilized by method!"));
        }
        assertTrue(newID > 1, "ID value must be positive integer!");
        log.error("expected: positive integer, but got {}", newID);
    }

    @Test
    public void testSetName() {
        String oldName = SIMPLE_CLASS.getName();
        SIMPLE_CLASS.setName("New" + oldName);
        log.info(MARKER);
        assertNotEquals(oldName, SIMPLE_CLASS.getName());
    }

    @Test
    public void testNG3() {}

    @Test
    public void testNG4() {}

    @Test
    public void testNG5() {}

    @Test
    public void testNG6() {}
}
