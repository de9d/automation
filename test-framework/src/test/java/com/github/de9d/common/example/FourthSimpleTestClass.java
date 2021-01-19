package com.github.de9d.common.example;

import com.github.de9d.common.SimpleTestBaseClass;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tools.TestNGListener;

@Slf4j
@Listeners(TestNGListener.class)
public class FourthSimpleTestClass extends SimpleTestBaseClass {

    private static final String SUITE = "Fourth";

    @DataProvider(name = "new")
    public Object[][] dataProvider() {
        return new Object[][] {
                {"title: ", 0, 0},
                {"title: ", 1, 1},
                {"title: " , 2, 2},
        };
    }

    @Test(dataProvider = "new")
    public void testNG1(String title, int value_1, int value_2) {
        log.info(String.format(MSG, SUITE, "testNG1"));
        log.debug(String.format("{%s} :: {%d} :: {%d}",title, value_1, value_2));
    }

    @Test
    public void testNG2() {
        log.info(String.format(MSG, SUITE, "testNG2"));
    }

    @Test
    public void testNG3() {
        log.info(String.format(MSG, SUITE, "testNG3"));
    }

    @Test
    public void testNG4() {
        log.info(String.format(MSG, SUITE, "testNG4"));
    }

    @Test
    public void testNG5() {
        log.info(String.format(MSG, SUITE, "testNG5"));
    }

    @Test(groups = "666")
    public void testNG6() {
        log.info(String.format(MSG, SUITE, "testNG6"));
    }
}
