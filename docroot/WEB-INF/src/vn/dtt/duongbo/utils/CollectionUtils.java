
package vn.dtt.duongbo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class CollectionUtils {
	
	private static Log _log = LogFactoryUtil.getLog(CollectionUtils.class);
	
	public static <T> String listToString(List<T> list) {
		StringBuilder builder = new StringBuilder();
		boolean firstCheck = true;
		for (T s : list) {
			if (firstCheck) {
				builder.append(s);
				firstCheck = false;
			} else {
				builder.append(",");
				builder.append(s);
			}
		}
		return builder.toString();
	}
	
	public static <T> String listToSqlString(List<T> list) {
		StringBuilder builder = new StringBuilder();
		boolean firstCheck = true;
		for (T s : list) {
			if (firstCheck) {
				builder.append("'" + s + "'");
				firstCheck = false;
			} else {
				builder.append(",");
				builder.append("'" + s + "'");
			}
		}
		return builder.toString();
	}
	
	public static List<String> stringOfListToList(String s) {
		if (s == null) { return new ArrayList<String>(); }
		return Arrays.asList(s.split("\\s*,\\s*"));
	}
	
}
