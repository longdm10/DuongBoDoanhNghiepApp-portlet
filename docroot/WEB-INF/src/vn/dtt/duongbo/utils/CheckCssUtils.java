
package vn.dtt.duongbo.utils;

import java.util.List;

public class CheckCssUtils {
	
	public static String checkSelectData(long number1, long number2) {
		try {
			if (number1 == number2) { return " selected=\"selected\" "; }
		} catch (Exception es) {
		}
		return "";
	}
	
	public static String checkSelectData(long number1, String number2) {
		try {
			if ((number2 != null) && (number2.trim().length() > 0)) {
				if (number1 == Long.parseLong(number2.trim())) { return " selected=\"selected\" "; }
			}
			
		} catch (Exception es) {
		}
		return "";
	}
	
	public static String checkEqualData(String valRes, String valDes) {
		try {
			if (valRes.equalsIgnoreCase(valDes)) { return " selected=\"selected\" "; }
		} catch (Exception es) {
		}
		return "";
	}
	
	public static String checkEqualRadio(String valRes, String valDes) {
		try {
			if (valRes.equalsIgnoreCase(valDes)) { return " checked=\"checked\" "; }
		} catch (Exception es) {
		}
		return "";
	}
	
	public static String checkbox(String valRes, String valDes) {
		try {
			if (valRes.equalsIgnoreCase(valDes)) { return " checked=\"checked\" "; }
		} catch (Exception es) {
		}
		return "";
	}
	
	public static String hiddenItem(List<String> lstData, String codeItem) {
		if (lstData != null && lstData.size() > 0) {
			for (String s : lstData) {
				if (codeItem.trim().equalsIgnoreCase(s)) {
					return "";
				}
			}
		}
		return " hidden=\"hidden\" ";
	}
	
	public static String checkedCodeItemFromList(List<String> lstData, String codeItem) {
		if (codeItem != null && codeItem.trim().length() > 0) {
			if (lstData != null && lstData.size() > 0) {
				for (String s : lstData) {
					if (codeItem.trim().equalsIgnoreCase(s)) { return " checked=\"checked\" "; }
				}
			}
		}
		return "";
	}
	
	public static boolean isExist(List<String> lstData, String codeItem) {
		if (codeItem != null && codeItem.trim().length() > 0) {
			if (lstData != null && lstData.size() > 0) {
				for (String s : lstData) {
					if (codeItem.trim().equalsIgnoreCase(s)) { return true ; }
				}
			}
		}
		return false;
	}
}
