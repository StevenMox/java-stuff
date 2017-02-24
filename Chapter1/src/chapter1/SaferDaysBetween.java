package chapter1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaferDaysBetween {
	public static void main(String[] args) {
		Scanner conIn = new Scanner(System.in);
		String firstDate, lastDate;
		boolean done = false;

		while (!done) {
			try {
				System.out.println("Enter two 'modern' dates: month day year");
				System.out.println("For example, January 12, 1954, would be: 1 12 1954");
				System.out.println();
				System.out.println("Modern dates occur after " + Date.MINYEAR + ".");
				System.out.println();

				System.out.println("Enter the first date:");
				firstDate = conIn.nextLine();
				Date date1 = validateDate(firstDate);

				if (date1 == null) {
					System.out.println("First date is not valid !");
				} else {
					System.out.println("Enter the second date:");
					lastDate = conIn.nextLine();
					Date date2 = validateDate(lastDate);
					if (date2 == null) {
						System.out.println("Last date is not valid!");
					} else {

						if ((date1.getYear() <= Date.MINYEAR) || (date2.getYear() <= Date.MINYEAR))
							System.out.println("You entered a 'pre-modern' date.");
						else {
							System.out.println("The number of days between");
							System.out.print(date1);
							System.out.print(" and ");
							System.out.print(date2);
							System.out.print(" is ");
							System.out.println(Math.abs(date1.lilian() - date2.lilian()));
						}
						done = true;
					}
				}
			} catch (InputMismatchException exception) {
				System.out.println("Integers only, please!\n\n");
				conIn.next();
			}
		}
		// conIn.close();
	}

	static Date validateDate(String dateString) {
		Date convertedDate = null;
		String[] mdy = dateString.split(" ");
		String mString, dString, yString;
		Integer mInt, dInt, yInt;
		if (mdy.length == 3) {
			mString = mdy[0];
			dString = mdy[1];
			yString = mdy[2];
			mInt = intValue(mString);
			dInt = intValue(dString);
			yInt = intValue(yString);
			if (!((mInt == null) || (dInt == null) || (yInt == null))) {
				if (mInt >= 1 && mInt <= 12) {
					boolean isLeap = false;
					if (yInt % 4 == 0) {
						if (yInt % 400 == 0) {
							isLeap = true;
						} else if (!(yInt % 100 == 0))
							isLeap = true;
					}
					if (dInt >= 1) {
						if (mInt % 2 == 1) {
							if (dInt <= 31) {
								convertedDate = new Date(mInt, dInt, yInt);
							}
						} else if (mInt == 2) {
							if (isLeap) {
								if (dInt <= 29)
									convertedDate = new Date(mInt, dInt, yInt);
							} else if (dInt <= 28)
								convertedDate = new Date(mInt, dInt, yInt);

						} else if (dInt <= 30)
							convertedDate = new Date(mInt, dInt, yInt);
					}
				}
			}
		}
		return convertedDate;
	}

	static Integer intValue(String s) {
		Integer intValue = null;
		try {
			intValue = Integer.parseInt(s);
		} catch (NumberFormatException e) {

		}
		return intValue;
	}

}