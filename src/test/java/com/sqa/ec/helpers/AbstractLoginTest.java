/**
 * File Name: AbstractLoginTest.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 1, 2017
 */
package com.sqa.ec.helpers;

/**
 * AbstractLoginTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public abstract class AbstractLoginTest extends BasicTest
{

	/**
	 * @param baseUrl
	 */
	public AbstractLoginTest(String baseUrl)
	{
		super(baseUrl);
		// TODO Auto-generated constructor stub
	}

	abstract public void login(String username, String password);

	abstract public void logout();
}
