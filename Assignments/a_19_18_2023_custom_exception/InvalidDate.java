package a_19_18_2023_custom_exception;

import java.time.LocalDate;

class InvalidDateException extends Exception {
	public InvalidDateException(String s) {
		super(s);
	}
}

public class InvalidDate {
	public static void main(String args[]) {
		LocalDate date1 = LocalDate.of(2000,1,1);
		LocalDate date2 = LocalDate.of(1980,1,1);
		LocalDate date3 = LocalDate.of(1985,1,1);

		
		try {
			if ( ! date1.isBefore(date2)) {
				throw new InvalidDateException("first date should be before second date");
			}
		} catch (InvalidDateException e) {
			System.out.println(e);
		}

	}
}
