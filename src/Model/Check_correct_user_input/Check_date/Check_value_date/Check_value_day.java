package Model.Check_correct_user_input.Check_date.Check_value_date;

import Model.Check_correct_user_input.Check_date.Check_value_date.Exception_of_error_value_date.Error_date_value;
import View.Printer;

import java.util.NoSuchElementException;

public class Check_value_day {

	public void check_value_days(String[] date) throws NullPointerException, NoSuchElementException,Error_date_value{
		if (date == null) {
			throw new NullPointerException(Printer.not_date);
		}
		if (Integer.parseInt(date[0]) < 1) {
			throw new Error_date_value(Printer.day_is_false);
		}
		if (date[1].equals("01")) {
			if (Integer.parseInt(date[0]) > 31) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("02")) {
			if (Integer.parseInt(date[0]) > 29) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("03")) {
			if (Integer.parseInt(date[0]) > 31) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("04")) {
			if (Integer.parseInt(date[0]) > 30) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("05")) {
			if (Integer.parseInt(date[0]) > 31) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("06")) {
			if (Integer.parseInt(date[0]) > 30) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("07")) {
			if (Integer.parseInt(date[0]) > 31) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("08")) {
			if (Integer.parseInt(date[0]) > 31) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("09")) {
			if (Integer.parseInt(date[0]) > 30) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("10")) {
			if (Integer.parseInt(date[0]) > 31) {
				throw new Error_date_value(Printer.day_is_false);
			}
		} else if (date[1].equals("11")) {
			if (Integer.parseInt(date[0]) > 30) {
				throw new Error_date_value(Printer.day_is_false);
			}
		}else if (date[1].equals("12")) {
			if (Integer.parseInt(date[0]) > 31) {
				throw new Error_date_value(Printer.day_is_false);
			}
		}
	}
}
