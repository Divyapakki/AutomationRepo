package testng.failtestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailTestScriptsRuns implements IRetryAnalyzer {

    private int retryCount = 0;
    public static final int maxRetryCount = 3;

    @Override

    public boolean retry(ITestResult iTestResult){
        if(retryCount<maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }


}