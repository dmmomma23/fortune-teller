import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What's your first name?"); // ask first name
		String userFirst = input.nextLine();

		System.out.println("What's your Last name?"); // ask last name
		String userLast = input.nextLine();

		System.out.println("What's your age?"); // ask user's age
		int userAge = input.nextInt();

		// retirement Year based on whether the age is odd or even
		int retirementYear;
		if ((userAge % 2) == 1) {
			retirementYear = 67;
		} else {
			retirementYear = 45;
		}

		System.out.println("What's your month were you born?");
		System.out.println("(the numerical date, so January = 1, February = 2, ... etc.)");
		int userBirthMonth = input.nextInt();

		// retirement bank account based on month born
		double bankAccount;
		switch (userBirthMonth) {
		case 1:
		case 2:
		case 3:
			bankAccount = 561203.00;
			break;
		case 4:
		case 5:
		case 6:
			bankAccount = 1500000000.00;
			break;
		case 7:
		case 8:
		case 9:
			bankAccount = 42.42;
			break;
		case 10:
		case 11:
		case 12:
			bankAccount = 5294035.31;
			break;
		default:
			bankAccount = 0.00;
			break;
		}

		System.out.println("What's your favorite ROYGBIV color? \nType \"Help\" if you don't know what ROYGBIV is.");
		String userFaveColor = input.next();

		// Transportation based on color
		String userCar;
		while (userFaveColor.equalsIgnoreCase("help")) {
			System.out.println("Choose from: Red, Orange, Yellow, Green, Blue, Indigo, or Violet.");
			userFaveColor = input.next();
		}
		switch (userFaveColor.toLowerCase()) {
		case "red":
			userCar = "Lamborghini";
			break;
		case "orange":
			userCar = "Minivan";
			break;
		case "yellow":
			userCar = "Volkswagon Beetle";
			break;
		case "green":
			userCar = "Maserati";
			break;
		case "blue":
			userCar = "Honda Civic";
			break;
		case "indigo":
			userCar = "A MOTHER****ING DRAGON";
			break;
		case "violet":
			userCar = "Razor scooter";
			break;
		default:
			System.out.println("That's not a color! Didn't you read the instructions? It's fine.");
			userCar = "a small donkey";
		}

		System.out.println("How many siblings do you have?"); // ask user's siblings
		int userSiblings = input.nextInt();

		// vacation home based on number of siblings
		String vacationHome;
		if (userSiblings == 0) {
			vacationHome = "Myrtle Beach, SC";
		} else if (userSiblings == 1) {
			vacationHome = "Tampa Bay, FL";
		} else if (userSiblings == 2) {
			vacationHome = "Moon Base Beta";
		} else if (userSiblings == 3) {
			vacationHome = "South Haven, MI";
		} else if (userSiblings > 3) {
			vacationHome = "Salt Lake City, UT";
		} else {
			vacationHome = "Mom and Dad's basement";
		}

		// *[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank
		// balance]* in the bank,
		// a vacation home in *[location]*, and travel by *[mode of transportation]*.
		System.out.println(userFirst + " " + userLast + ", you will retire at the age of " + retirementYear + ", with "
				+ bankAccount + " in the bank.");
		System.out.println(
				"You'll have a luxurious vacation home in " + vacationHome + ", and travel by " + userCar + ".");

	}
}
