package smarttech.ny.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttech.ny.basepage.ParentClass;
import smarttech.ny.generic.CommonUtil;

public class MasterPageFactory extends ParentClass{
//PageFactory initilization	
public MasterPageFactory() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//input[@type='email'])[1]")
@CacheLookup()
 private WebElement enterEmail;
public WebElement getEnterEmail() {
	return enterEmail;
}
@FindBy(xpath="//input[@type='password']")
@CacheLookup()
 private WebElement enterPassword;
public WebElement getEnterPassword() {
	return enterPassword;
}
@FindBy(xpath="(//button[@type='submit'])[1]")
@CacheLookup()
 private WebElement clickOnLoginBTN;
public WebElement getClickOnLoginBTN() {
	return clickOnLoginBTN;
}

public void getLogin(String userName, String pwd) {
	
	getEnterEmail().sendKeys(userName);
	getEnterPassword().sendKeys(pwd);
	//getClickOnLoginBTN().click();
	//Actions ac = new Actions(driver);
	//ac.click(getClickOnLoginBTN()).build().perform();
	CommonUtil.actionClick(getClickOnLoginBTN());
}

}
