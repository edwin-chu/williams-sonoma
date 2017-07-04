package com.sqa.ec.adactin;

import org.testng.annotations.*;

import com.sqa.ec.helpers.*;

public class AdactinTC101B extends BasicTest
{

	private String testName;

	public AdactinTC101B()
	{
		super("http://adactin.com/HotelApp");
		this.testName = "Adactin PG ";
	}

	@Test
	public void loginTest()
	{
		AdactinHomePage homePage = new AdactinHomePage(this);
		System.out.println("Before login screenshot");
		this.takeScreenshot();
		homePage.login("sqabcjune12", "sqaadmin2017");
		this.takeScreenshot();
		System.out.println("After login screenshot");
	}
}
