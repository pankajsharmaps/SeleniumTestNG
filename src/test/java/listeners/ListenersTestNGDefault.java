package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersTestNGDefault implements ITestListener {
	
	public void onStart(ITestContext context) {	
		System.out.println("onStart method started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started" +result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method" +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method" +result.getName());
		if (ITestResult.FAILURE == result.getStatus()){
			System.out.println("********** Inside if loop **********");
		}
				
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Method" +result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage" +result.getName());
	}

}



//public class Listeners extends TestListenerAdapter{	
//	public void onTestStart(ITestResult tr) {
//		
//		System.out.println("Test started");
//	}
//	
//	public void onTestSuccess(ITestResult tr) {
//		System.out.println("Test run successfully");	
//		}
//	
//	public void onTestFailure(ITestResult tr) {
//		System.out.println("Test FAILED");
//	}
//	
//	public void onTestSkipped(ITestResult tr) {
//		System.out.println("Test skipped");
//	}
//
//}
