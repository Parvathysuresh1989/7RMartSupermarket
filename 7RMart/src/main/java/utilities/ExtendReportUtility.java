package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility 
{
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() 
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");//specify the location for report to be generated
		reporter.config().setReportName("7 SuperMarket");//will come at the top of report
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Organization", "Obsqura");//will come at the end of report
		extentReports.setSystemInfo("Name", "Parvathy");
		extentReports.setSystemInfo("Name", "aleena");
		return extentReports;
	}
}
