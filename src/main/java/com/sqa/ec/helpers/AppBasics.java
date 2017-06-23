package com.sqa.ec.helpers;

import java.util.*;

import com.sqa.ec.helpers.exceptions.*;

public class AppBasics
{

	private static Scanner scanner = new Scanner(System.in);

	/*
	 * Method to farewell user from the application.
	 * @param name User name to farewell to
	 */
	public static void fareWellUser(String name)
	{
		System.out.println("\nThanks for using this app.\nHave a great day " + name + "!");
	}

	/*
	 * Method to greet user and get the name.
	 */
	public static String greetUserAndGetName(String appName)
	{
		System.out.println("Welcome to the " + appName + " Application");
		System.out.println("Could I get your name please: ");
		return scanner.nextLine();
	}

	public static boolean requestBoolean(String question)
	{
		boolean response = true;
		boolean isInvalid = true;
		while (isInvalid)
		{
			String input = "";
			System.out.print(question + " ");
			input = scanner.nextLine();
			if (input.equalsIgnoreCase("Yes") == true)
			{
				response = true;
				isInvalid = false;
			} else if (input.equalsIgnoreCase("No") == true)
			{
				response = false;
				isInvalid = false;
			} else
			{
				System.out.println("Please limit your response to Yes or No [" + input + "]");
			}
		}
		return response;
	}

	/**
	 * Method to request character response from user.
	 *
	 * @param question
	 *            Question to ask user
	 * @return char response from user
	 */
	public static char requestChar(String question)
	{
		boolean isInvalid = true;
		String input = "";
		while (isInvalid)
		{
			System.out.print(question + " ");
			input = scanner.nextLine();
			try
			{
				if (input.length() > 1)
				{
					throw new InvalidCharResponseLength();
				}
				isInvalid = false;
			} catch (InvalidCharResponseLength e)
			{
				// TODO Auto-generated catch block
				System.out.println("You have entered too many characters [" + input + "]");
			}
		}
		return input.charAt(0);
	}

	public static char requestChar(String question, String charErrorResponse, char... possibleChars)
	{
		boolean isInvalid = true;
		String input = "";
		boolean validChar = false;
		while (isInvalid)
		{
			System.out.print(question + " ");
			input = scanner.nextLine();
			try
			{
				if (input.length() > 1)
				{
					throw new InvalidCharResponseLength();
				}
				for (char c : possibleChars)
				{
					if (Character.toUpperCase(c) == input.toUpperCase().charAt(0))
					{
						validChar = true;
					}
				}
				if (!validChar)
				{
					throw new CharNotValidException();
				}
				isInvalid = false;
			} catch (InvalidCharResponseLength e)
			{
				// TODO Auto-generated catch block
				System.out.println("You can only entered one characters [" + input + "]");
			} catch (CharNotValidException e)
			{
				// TODO Auto-generated catch block
				System.out.println(charErrorResponse + " [" + input + "]");
			}
		}
		return input.charAt(0);
	}

	public static double requestDouble(String question)
	{
		double value = 0;
		boolean isInvalid = true;
		while (isInvalid)
		{
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try
			{
				value = Double.parseDouble(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e)
			{
				// TODO Auto-generated catch block
				System.out.println("You have not entered a correct formatted decimal number [" + input + "]");
			}
		}
		return value;
	}

	public static float requestFloat(String question)
	{
		float value = 0;
		boolean isInvalid = true;
		while (isInvalid)
		{
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try
			{
				value = Float.parseFloat(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e)
			{
				// TODO Auto-generated catch block
				System.out.println("You have not entered a correct formatted decimal number [" + input + "]");
			}
		}
		return value;
	}

	public static int requestInt(String question)
	{
		return requestIntWithinRange(question, 0, 0, "");
	}

	/**
	 * @param string
	 * @param i
	 * @param j
	 * @param string2
	 * @return
	 */
	public static int requestIntWithinRange(String question, int min, int max, String rangeErrorResponse)
	{
		// TODO Auto-generated method stub
		int value = 0;
		boolean isInvalid = true;
		while (isInvalid)
		{
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try
			{
				value = Integer.parseInt(input.trim());
				if (min != 0 && max != 0)
				{
					if (value < min)
					{
						throw new UnderMinException();
					}
					if (value > max)
					{
						throw new OverMaxException();
					}
				}
				isInvalid = false;
			} catch (NumberFormatException e)
			{
				// TODO Auto-generated catch block
				System.out.println("You have not entered a correct formatted number [" + input + "]");
			} catch (OutOfRangeException e)
			{
				// TODO Auto-generated catch block
				System.out.println(rangeErrorResponse + " [" + input + "]");
			}
		}
		return value;
	}

	public static long requestLong(String question)
	{
		long value = 0;
		boolean isInvalid = true;
		while (isInvalid)
		{
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try
			{
				value = Long.parseLong(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e)
			{
				// TODO Auto-generated catch block
				System.out.println("You have not entered a correct formatted decimal number [" + input + "]");
			}
		}
		return value;
	}

	public static short requestShort(String question)
	{
		short value = 0;
		boolean isInvalid = true;
		while (isInvalid)
		{
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try
			{
				value = Short.parseShort(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e)
			{
				// TODO Auto-generated catch block
				System.out.println("You have not entered a correct formatted decimal number [" + input + "]");
			}
		}
		return value;
	}

	public static String requestString(String question)
	{
		System.out.print(question + " ");
		String input = scanner.nextLine();
		return input.trim();
	}
}
