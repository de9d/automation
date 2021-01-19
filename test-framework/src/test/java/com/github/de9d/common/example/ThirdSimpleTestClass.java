package com.github.de9d.common.example;

import com.github.de9d.common.SimpleTestBaseClass;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class ThirdSimpleTestClass extends SimpleTestBaseClass {

    private static final String SUITE = "Third";

    @Test
    public void testNG1() {
        log.info(String.format(MSG, SUITE, "testNG1"));
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
