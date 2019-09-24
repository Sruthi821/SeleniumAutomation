package components;

import objectRepository.HMSPRLocators;
import utility.BC;

public class HMSPRcomponents extends BC {
	 HMSPRLocators hmsPRLocators=new HMSPRLocators();
	 public void LaunchBrowser() {
		 OpenBrowser();
		 openURL("http://selenium4testing.com/hms/");
	 }
	 public void Login() {
		 enterText(hmsPRLocators.username, "admin");
		 enterText(hmsPRLocators.password, "admin");
		 click(hmsPRLocators.login);
	 }
	 public void navigatetoreg() {
		 click(hmsPRLocators.registration);
	 }
	 
	 
        
}
