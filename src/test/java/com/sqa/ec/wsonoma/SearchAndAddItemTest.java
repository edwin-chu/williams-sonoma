/**
 * File Name: SearchAndAddItemTest.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 10, 2017
 */
package com.sqa.ec.wsonoma;

import org.testng.annotations.*;

/**
 * SearchAndAddItemTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class SearchAndAddItemTest extends WSonomaTest
{

	/*
	 * @DataProvider(name = "csvData") public Object[][] csvData() { return
	 * DataHelper.getTextFileData("src/main/resources/", "ebayitem.csv",
	 * TextFormat.CSV, false, new DataType[] { DataType.INT, DataType.STRING,
	 * DataType.INT, DataType.DOUBLE }); }
	 * @DataProvider(name = "dbData") public Object[][] dbData() throws
	 * ClassNotFoundException, DataTypesMismatchException, SQLException,
	 * DataTypesCountException, DataTypesTypeException { return
	 * DataHelper.evalDatabaseTable("com.mysql.jdbc.Driver",
	 * "jdbc:mysql://localhost:8889/squad", getProp("username"),
	 * getProp("password"), getProp("tablename"), 0, 0, new DataType[] {
	 * DataType.INT, DataType.STRING, DataType.INT, DataType.DOUBLE }); }
	 */
	@DataProvider(name = "dp")
	public Object[][] dp()
	{
		return new Object[][]
		{ new Object[]
				{ 1, "All-Clad NS1 Nonstick Induction Covered Fry Pan 12", 4, 319.80 }, new Object[]
				{ 2, "Walnut Knifedock In-Drawer Deluxe Tray", 3, 239.85 }, new Object[]
				{ 3, "Google Home", 2, 198.00 }, new Object[]
				{ 4, "Cuisinart Tri-ply Stainless-Steel 10-Piece Cookware Set", 2, 799.90 }, new Object[]
				{ 5, "Chef'sChoice 1520 Angle Select Electric Knife Sharpener", 3, 599.85 }, new Object[]
				{ 6, "Rustic Melamine Chip Dip Platter Ivory", 4, 83.88 }, new Object[]
				{ 7, "Backyard Beehive & Starter Kit", 3, 1619.85 }, new Object[]
				{ 8, "Wusthof Classic Ikon Paring Knife 3 1 2", 6, 359.70 }, };
	}

	/*
	 * @DataProvider(name = "excel2003Data") public Object[][] excel2003Data()
	 * throws InvalidExcelExtensionException { return
	 * DataHelper.getExcelFileData("src/main/resources/", "ebayitem.xls", false,
	 * new DataType[] { DataType.INT, DataType.STRING, DataType.INT,
	 * DataType.DOUBLE }); }
	 * @DataProvider(name = "excel2012Data") public Object[][] excel2012Data()
	 * throws InvalidExcelExtensionException { return
	 * DataHelper.getExcelFileData("src/main/resources/", "ebayitem.xlsx",
	 * false, new DataType[] { DataType.INT, DataType.STRING, DataType.INT,
	 * DataType.DOUBLE }); }
	 */
	@Test(dataProvider = "dp")
	public void testSearchAndAddItemToCard(int id, String itemName, int quantity, double expectedPrice)
	{
		// getLog().info(DataHelper.displayData(dp()));
		getLog().info("Test " + id + "\n\tSearching for " + quantity + " " + itemName + "(s) for an expected total of $" + expectedPrice);
	}
}
