package testScripts;

import org.testng.annotations.Test;

import components.HMSPRComponents;

public class HMSCreatePatient {
	HMSPRComponents hmsPRComponents = new HMSPRComponents();
  @Test
  public void f() {
	  hmsPRComponents.launchBrowser();
	  hmsPRComponents.login();
	  hmsPRComponents.navigateToReg();
  }
}
