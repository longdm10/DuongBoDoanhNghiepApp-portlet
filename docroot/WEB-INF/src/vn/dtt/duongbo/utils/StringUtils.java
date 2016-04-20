
package vn.dtt.duongbo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class StringUtils {
	
	public static String[] sAlPhaBe = {
		"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "w", "x", "y", "z"
	};
	
	public static String[] getAlPhaBe(int size) {
		
		String[] result = new String[size];
		
		for (int i = 0; i < size; i++) {
			if (i > 23) {
				result[i] = "a";
			} else {
				result[i] = sAlPhaBe[i];
			}
		}
		return result;
	}
	
	public static String getAlPhaBeByIndex(int index) {
		
		return sAlPhaBe[index];
	}
	
	public static <T> String listToString(List<T> list) {
		
		StringBuilder builder = new StringBuilder();
		boolean firstCheck = true;
		for (T s : list) {
			if (firstCheck) {
				builder.append(s);
				firstCheck = false;
			} else {
				builder.append(", ");
				builder.append(s);
			}
		}
		return builder.toString();
	}
	
	public static List<String> stringOfListToList(String s) {
		
		if (s == null) { return new ArrayList<String>(); }
		return Arrays.asList(s.split("\\s*,\\s*"));
	}
	
	public static String getIndexLetter(int number) {
		String letter[] = {
			"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "w", "x", "y", "z"
		};
		if (number > -1 && number < letter.length) { return letter[number]; }
		
		return "";
	}
	
	public static String getIndexRoman(int number) {
		String[] roman = {
			"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV"
		};
		if (number > -1 && number < 15) {
			return roman[number];
		} else return "";
	}
	
	public static <T> T coalesce(T o, T defaultValue) {
		return (o != null ? o : defaultValue);
	}
	
	public static String romanNumerals(long number) {
		
		String riman[] = {
			"M", "XM", "CM", "D", "XD", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
		};
		int arab[] = {
			1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
		};
		StringBuilder result = new StringBuilder();
		int i = 0;
		while (number > 0 || arab.length == (i - 1)) {
			while ((number - arab[i]) >= 0) {
				number -= arab[i];
				result.append(riman[i]);
			}
			i++;
		}
		return result.toString();
	}
	
	private static Log _log = LogFactoryUtil.getLog(StringUtils.class);
	
}
