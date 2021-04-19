package test;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.BranchPage;
import pageobject.ClientPage;
import pageobject.CompanyPage;
import pageobject.CreateClient;
import pageobject.DivisionPage;
import pageobject.Payslip;
import pageobject.Timesheet;
import pageobject.Worker;
import utilities.BaseClass;

public class CompanyTest extends BaseClass {
	@Test(dataProvider = "dp")
	public void login(String n, String p, String a) throws InterruptedException, IOException {
		// System.out.println(a);
		CompanyTest shots=new CompanyTest();
		
		CompanyPage l = new CompanyPage(driver);
		l.CompanyloginDetails(n, p);
		shots.shot();
		// BranchPage m = new BranchPage(driver);
		// m.branchDetails();
		// DivisionPage d = new DivisionPage(driver);
		// d.divionDetails();
		//ClientPage c = new ClientPage(driver);
		//c.clientdetails();
		//CreateClient t = new CreateClient(driver);
		//t.createclientdetails();
		//Worker w=new Worker(driver);
		//w.Workerdetails();
		//Timesheet t=new Timesheet(driver);
		//t.timesheetdetails();
		//Payslip y=new Payslip();
		//y.payslipdetails();
	}

}
