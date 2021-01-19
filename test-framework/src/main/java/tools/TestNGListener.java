package tools;

import lombok.extern.slf4j.Slf4j;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import java.time.LocalDateTime;

@Slf4j
public class TestNGListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        log.info("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        log.info(String.valueOf(LocalDateTime.now().toLocalTime()));
        log.info("*****************************************************");
        log.info("H  H EEEE L    L     OO   W     W OO  RRR  L    DDD");
        log.info("HHHH E==  L    L    O  O   W W W O  O RRR  L    D  D");
        log.info("H  H EEEE LLLL LLLL  OO     W W   OO  R  R LLLL DDD");
        log.info("*****************************************************\n\n");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
