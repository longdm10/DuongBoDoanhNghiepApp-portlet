/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.duongbien.dao.vrcb.service.base;

import vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalServiceUtil;

import java.util.Arrays;

/**
 * @author longdm
 * @generated
 */
public class TempDocumentLocalServiceClpInvoker {
	public TempDocumentLocalServiceClpInvoker() {
		_methodName0 = "addTempDocument";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.duongbien.dao.vrcb.model.TempDocument"
			};

		_methodName1 = "createTempDocument";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTempDocument";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTempDocument";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.duongbien.dao.vrcb.model.TempDocument"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchTempDocument";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTempDocument";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTempDocuments";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTempDocumentsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTempDocument";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.duongbien.dao.vrcb.model.TempDocument"
			};

		_methodName568 = "getBeanIdentifier";

		_methodParameterTypes568 = new String[] {  };

		_methodName569 = "setBeanIdentifier";

		_methodParameterTypes569 = new String[] { "java.lang.String" };

		_methodName574 = "addTempDocument";

		_methodParameterTypes574 = new String[] {
				"java.lang.String", "long", "int", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.util.Date", "java.util.Date", "java.util.Date"
			};

		_methodName575 = "findByRequestCode";

		_methodParameterTypes575 = new String[] { "java.lang.String" };

		_methodName576 = "findByRequestCode";

		_methodParameterTypes576 = new String[] { "java.lang.String", "int", "int" };

		_methodName577 = "countByRequestCode";

		_methodParameterTypes577 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return TempDocumentLocalServiceUtil.addTempDocument((vn.dtt.duongbien.dao.vrcb.model.TempDocument)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return TempDocumentLocalServiceUtil.createTempDocument(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return TempDocumentLocalServiceUtil.deleteTempDocument(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return TempDocumentLocalServiceUtil.deleteTempDocument((vn.dtt.duongbien.dao.vrcb.model.TempDocument)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return TempDocumentLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return TempDocumentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return TempDocumentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return TempDocumentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return TempDocumentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return TempDocumentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return TempDocumentLocalServiceUtil.fetchTempDocument(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return TempDocumentLocalServiceUtil.getTempDocument(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return TempDocumentLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return TempDocumentLocalServiceUtil.getTempDocuments(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return TempDocumentLocalServiceUtil.getTempDocumentsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return TempDocumentLocalServiceUtil.updateTempDocument((vn.dtt.duongbien.dao.vrcb.model.TempDocument)arguments[0]);
		}

		if (_methodName568.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes568, parameterTypes)) {
			return TempDocumentLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName569.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes569, parameterTypes)) {
			TempDocumentLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName574.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes574, parameterTypes)) {
			return TempDocumentLocalServiceUtil.addTempDocument((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				(java.lang.String)arguments[9], (java.util.Date)arguments[10],
				(java.util.Date)arguments[11], (java.util.Date)arguments[12]);
		}

		if (_methodName575.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes575, parameterTypes)) {
			return TempDocumentLocalServiceUtil.findByRequestCode((java.lang.String)arguments[0]);
		}

		if (_methodName576.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes576, parameterTypes)) {
			return TempDocumentLocalServiceUtil.findByRequestCode((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName577.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes577, parameterTypes)) {
			return TempDocumentLocalServiceUtil.countByRequestCode((java.lang.String)arguments[0]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName568;
	private String[] _methodParameterTypes568;
	private String _methodName569;
	private String[] _methodParameterTypes569;
	private String _methodName574;
	private String[] _methodParameterTypes574;
	private String _methodName575;
	private String[] _methodParameterTypes575;
	private String _methodName576;
	private String[] _methodParameterTypes576;
	private String _methodName577;
	private String[] _methodParameterTypes577;
}