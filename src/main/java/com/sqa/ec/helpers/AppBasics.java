package com.sqa.ec.helpers;

import java.util.*;

public class AppBasics
{

	private static Scanner scanner = new Scanner(System.in);

	// Method to farewell user from the application.
	public static void fareWellUser(String name)
	{
		System.out.println("\nThanks for using this app.\nHave a great day " + name + "!");
	}

	public static String greetUserAndGetName(String appName)
	{
		System.out.println("Welcome to the " + appName + " Application");
		System.out.println("Could I get your name please: ");
		return scanner.nextLine();
	}
}
