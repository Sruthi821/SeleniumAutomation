package testscripts;

import org.testng.annotations.Test;

import components.HMSPRcomponents;

public class HMScreatepatient {
	HMSPRcomponents hmsPrComponents=new HMSPRcomponents();
	
  @Test
  public void f() {
	  hmsPrComponents.LaunchBrowser();
	  hmsPrComponents.Login();
	  hmsPrComponents.navigatetoreg();
  }
}
