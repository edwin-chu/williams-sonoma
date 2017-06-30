/**
 * File Name: AutoBasics.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 28, 2017
 */
package com.sqa.ec.auto;

import org.openqa.selenium.*;
import org.testng.log4testng.*;

/**
 * AutoBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class AutoBasics
{

	public static boolean isElementPresent(WebDriver driver, By by, Logger logger)
	{
		try
		{
			WebElement element = driver.findElement(by);
			return true;
		} catch (NoSuchElementException e)
		{
			// TODO Auto-generated catch block
			logger.warn("Element was not found: " + by);
			return false;
		}
	}
}
