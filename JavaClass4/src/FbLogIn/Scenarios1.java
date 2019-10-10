package FbLogIn;

import org.openqa.selenium.By;

public class Scenarios1 {
	/*open chromeBrowser 
	 * go to target 
	 * verify title 
	 * verify url 
	 * verify Logo is displayed 
	 * search for kids toys 
	 * click enter 
	 * verify Kids toy is displayed in the page 
	 */
	void targetTest() throws InterruptedException {
		common1 c = new common1();
		c.openBrowser();
		c.getWebSite("https://www.target.com/");
		c.pageTitle();
		c.getUrl();
		c.verifyElement(By.cssSelector("#home"));
		c.myType2(By.xpath("//input[@id='search']"), "kids toys");
		c.myClick(By.cssSelector(".SearchInputButton-sc-1opoijs-0.gyZtAo"));
		Thread.sleep(5000);
		c.verifyElement(By.xpath("//span[text()='kids toys']"));
		
		c.closeBrowser();
	}
	
	/*Open chrome browser 
	 * go to FB 
	 * verify title 
	 * verify url 
	 * verify Sign Up text is visible 
	 * enter first name 
	 * enter last name 
	 * email
	 * re enter email 
	 * password
	 * birthday 
	 * gender
	 * gender
	 * verify text as Enter the code from your email
	 */
	void fbSignUp() throws InterruptedException {
		
		common1 c = new common1();
		//Open chrome browser 
		c.openBrowser(); 
		//go to FB 
		c.getWebSite("http://www.facebook.com"); 
		//verify title 
		c.pageTitle();
		//verify url 
		c.getUrl();
		// verify Sign Up text is visible 
		c.verifyElement(By.xpath("//h2[text()='Sign Up']"));
		 //enter first name 
		c.myType(c.dr.findElement(By.name("firstname")), "Bittech");
		 //enter last name 
		c.myType2(By.cssSelector("#u_0_h"), "USA");
		 //email
		c.myType2(By.xpath("//input[@name='reg_email__']"), "abc123@yahoo.com");
		 //re enter email 
		c.myType2(By.xpath("//input[@name='reg_email_confirmation__']"), "abc123@yahoo.com");
		 //password
		c.myType2(By.name("reg_passwd__"), "Abvc!2!@");
		 //birthday month
		c.selectValueInDropDown_index(By.name("birthday_month"), 6);
		//birthday day
		c.selectValueInDropDown_value(By.id("day"), "8");
		//birthday year
		c.selectValueInDropDown_visibleText(By.name("birthday_year"), "1987");
		 //gender
		Thread.sleep(3000);
		c.myClick(By.xpath("//span[@id='u_0_u']/span[1]/input"));
		 //click submit
		c.myClick(By.name("websubmit"));
		
		c.closeBrowser();
	}
	
	
}
