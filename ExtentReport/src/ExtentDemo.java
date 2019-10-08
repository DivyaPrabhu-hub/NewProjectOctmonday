
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo {
	static ExtentReports reports;
	static ExtentTest logger;
	
	/*
	 * This code i have shared with you over the GitHub
	 */
	
	public static void main(String[] args) {
		
		String filFilename= new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm'.html'").format(new Date());
		
		
		String path = ("/Users/divya/Desktop/ExtentReport/Report1.html");
				
		
		reports = new ExtentReports (path);
		logger = reports.startTest("Login into Gmail");
		logger.log(LogStatus.INFO, "We have entered valid email id");
		logger.log(LogStatus.PASS, "Enter email id");
		
		logger.log(LogStatus.INFO, "We have entered valid password");
		logger.log(LogStatus.PASS, "Enter password");
		logger.log(LogStatus.PASS, "Click on login button");
		
		logger = reports.startTest("Remember Me");
		logger.log(LogStatus.INFO, "We have entered valid email id");
		logger.log(LogStatus.PASS, "Enter email id");
		
		logger.log(LogStatus.INFO, "We have entered valid password");
		logger.log(LogStatus.PASS, "Enter password");
		logger.log(LogStatus.PASS, "Click on Remember Me");
		logger.log(LogStatus.FAIL, "Click on login");
		
		reports.endTest(logger);
		reports.flush();
		
	}
	

}
