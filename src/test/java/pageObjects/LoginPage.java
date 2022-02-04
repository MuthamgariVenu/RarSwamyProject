package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
     public WebDriver ldriver;

     public  LoginPage(WebDriver rdriver)
     {
          ldriver =rdriver;
          PageFactory.initElements(rdriver,this);

     }
     @FindBy(id = "txtUsername")
     @CacheLookup
     WebElement txtemail;


     public void setUserName(String uname)
     {
          txtemail.clear();
          txtemail.sendKeys(uname);
     }
}
