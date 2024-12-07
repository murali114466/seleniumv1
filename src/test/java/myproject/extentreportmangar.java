package myproject;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreportmangar implements ITestListener
{
	 public  ExtentSparkReporter sparkReporter;
    public  ExtentReports extent;
    public  ExtentTest test;

    // Method to configure ExtentReports
    public  void onStart(ITestContext context) {
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/Report/Myreport.html");
        sparkReporter.config().setReportName("Automation Test Report");
        sparkReporter.config().setDocumentTitle("Test Results");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Tester", "Murali");
        extent.setSystemInfo("Environment", "QA");
    }

    public  void onTestSuccess(ITestResult Result)
    {
    	test=extent.createTest(Result.getName());
    	test.log(Status.PASS, "testpassed:"+Result.getName());
    
    }
    
    public  void onTestFailure(ITestResult Result)
    {
    	test=extent.createTest(Result.getName());
    	test.log(Status.FAIL, "testFiled:"+Result.getName());
    	test.log(Status.FAIL, "testFiled case:"+Result.getThrowable());
    
    }
    public  void onTestSkip(ITestResult Result)
    {
    	test=extent.createTest(Result.getName());
    	test.log(Status.PASS, "testskipped:"+Result.getName());
    
    }
    
    
    // Method to flush the report after execution
    public  void onFinish(ITestContext context) {
        extent.flush();
    }
}