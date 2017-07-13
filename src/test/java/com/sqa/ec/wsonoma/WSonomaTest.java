package com.sqa.ec.wsonoma;

import com.sqa.ec.auto.*;
import com.sqa.ec.helpers.*;

public class WSonomaTest extends AbstractLoginTest
{

	public WSonomaTest()
	{
		super("https://www.williams-sonoma.com/");
	}

	/**
	 * @see com.sqa.ec.auto.AbstractLoginTest#login(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public void login(String username, String password)
	{
		getLog().info("Login into " + this.getBaseURL() + "with username:password" + username + ":" + password);
		getDriver().get(getBaseURL());
		// WebElement mouseOver =
		// getDriver().findElement(By.cssSelector(".my-account a"));
		// Actions myAccount = new Actions(getDriver());
		// myAccount.moveToElement(mouseOver).perform();
		// getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// WebElement signIn =
		// getDriver().findElement(By.cssSelector("li.sign-in a"));
		// myAccount.moveToElement(signIn);
		// myAccount.click().build().perform();
		// WebElement usernameField =
		// getDriver().findElement(By.id("login-email"));
		// WebElement passwordField =
		// getDriver().findElement(By.id("login-password"));
		// usernameField.sendKeys(username);
		// passwordField.sendKeys(password);
		// WebElement signInButton =
		// getDriver().findElement(By.cssSelector("btn-sign-in"));
		// signInButton.click();
	}

	/**
	 * @see com.sqa.ec.auto.AbstractLoginTest#logout()
	 */
	@Override
	public void logout()
	{
		// TODO Auto-generated method stub
	}
}
