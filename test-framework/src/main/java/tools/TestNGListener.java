package tools;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.time.LocalDateTime;

@Slf4j
public class TestNGListener implements ITestListener {

    private final static Marker MARKER = MarkerFactory.getMarker("<<<<<<<<<<<<<< TestNGListener >>>>>>>>>>>>>>");
    @Override
    public void onTestStart(ITestResult result) {
        log.info(String.valueOf(MARKER));
        log.info("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        log.info("SUCCESS: " + iTestResult.getMethod());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        log.error("##########################################");
        log.error("Test failed: " + iTestResult.getTestName());
        log.error("##########################################");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        log.warn("*****************************************");
        log.warn("Skipped test: " + iTestResult.getTestName());
        log.warn("*****************************************");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        log.info("Almost made it: " + iTestResult.getStatus());
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
        log.info("***********************************");
        log.info("BBb  Y  Y EEEE       BBb  Y  Y EEEE");
        log.info("Bbbb  YY  Eee  ====  Bbbb  YY  Eee ");
        log.info("BBBB   Y  EEEE       BBBB   Y  EEEE");
        log.info("***********************************\n\n");
    }
}
