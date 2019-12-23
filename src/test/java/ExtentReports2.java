import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReports2 {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@Before 
	public void setReport() {
		htmlReporter= new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("sampleReport");
		htmlReporter.config().setReportName("automation");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "sumesh");
		extent.setSystemInfo("Organization", "Way2Automation");
		extent.setSystemInfo("build No", "7895");
			
	}
	
	@After
	public void endReports() {
		extent.flush();
	}
	
	@Test
	public void doLogin() {
		extent.createTest("Login Test");
		System.out.println("executing login");
		
	}
	@Test
	public void doReg() {
		extent.createTest("Reg Test");
		System.out.println("executing Reg");
		Assert.fail();
	}
	@Test
	public void doSkip() {
		extent.createTest("Skip Test");
		System.out.println("executing Skip");
		
	}
	
	
	
}

	

