package learnListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		//System.out.println(" **************************************Listerner calling------->onTestStart------");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("**************************************Listerner calling------onTestSuccess------");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("**************************************Listerner calling------onTestFailure------"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("**************************************Listerner calling------onStart------");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("**************************************Listerner calling------onFinish------");
	}



}
