package edu.kit.aifb.eorg.util;

public class NumberUtil {
	
	public boolean isPositive(int number) {
		return number > 0;
	}
	
	public boolean isNegative(int number) {
		return number < 0;
	}
	
	public boolean isValidMessage(String message) {
		return message != null && message.length() > 0;
	}

}
