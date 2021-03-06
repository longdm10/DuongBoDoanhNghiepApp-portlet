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

import vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil;

import java.util.Arrays;

/**
 * @author longdm
 * @generated
 */
public class TempGeneralDeclarationLocalServiceClpInvoker {
	public TempGeneralDeclarationLocalServiceClpInvoker() {
		_methodName0 = "addTempGeneralDeclaration";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"
			};

		_methodName1 = "createTempGeneralDeclaration";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTempGeneralDeclaration";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTempGeneralDeclaration";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"
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

		_methodName10 = "fetchTempGeneralDeclaration";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTempGeneralDeclaration";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTempGeneralDeclarations";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTempGeneralDeclarationsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTempGeneralDeclaration";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"
			};

		_methodName568 = "getBeanIdentifier";

		_methodParameterTypes568 = new String[] {  };

		_methodName569 = "setBeanIdentifier";

		_methodParameterTypes569 = new String[] { "java.lang.String" };

		_methodName574 = "addTemGeneralDeclaration";

		_methodParameterTypes574 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "java.lang.String", "int", "int", "java.lang.String",
				"java.util.Date", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.util.Date"
			};

		_methodName575 = "updateTemGeneralDeclaration";

		_methodParameterTypes575 = new String[] {
				"java.lang.Long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "java.lang.String", "int", "int",
				"java.lang.String", "java.util.Date", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.util.Date"
			};

		_methodName576 = "deletTempGeneral";

		_methodParameterTypes576 = new String[] { "long" };

		_methodName577 = "updateTempGeneral";

		_methodParameterTypes577 = new String[] {
				"long", "java.lang.String", "double"
			};

		_methodName578 = "updateRemarks";

		_methodParameterTypes578 = new String[] { "long", "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.addTempGeneralDeclaration((vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.createTempGeneralDeclaration(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.deleteTempGeneralDeclaration(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.deleteTempGeneralDeclaration((vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.fetchTempGeneralDeclaration(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclarations(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclarationsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.updateTempGeneralDeclaration((vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration)arguments[0]);
		}

		if (_methodName568.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes568, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName569.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes569, parameterTypes)) {
			TempGeneralDeclarationLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName574.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes574, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.addTemGeneralDeclaration((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5],
				((Integer)arguments[6]).intValue(),
				(java.lang.String)arguments[7],
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue(),
				(java.lang.String)arguments[10], (java.util.Date)arguments[11],
				(java.lang.String)arguments[12],
				(java.lang.String)arguments[13],
				(java.lang.String)arguments[14],
				(java.lang.String)arguments[15],
				(java.lang.String)arguments[16],
				(java.lang.String)arguments[17], (java.util.Date)arguments[18]);
		}

		if (_methodName575.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes575, parameterTypes)) {
			return TempGeneralDeclarationLocalServiceUtil.updateTemGeneralDeclaration((java.lang.Long)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				((Integer)arguments[7]).intValue(),
				(java.lang.String)arguments[8],
				((Integer)arguments[9]).intValue(),
				((Integer)arguments[10]).intValue(),
				(java.lang.String)arguments[11], (java.util.Date)arguments[12],
				(java.lang.String)arguments[13],
				(java.lang.String)arguments[14],
				(java.lang.String)arguments[15],
				(java.lang.String)arguments[16],
				(java.lang.String)arguments[17],
				(java.lang.String)arguments[18], (java.util.Date)arguments[19]);
		}

		if (_methodName576.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes576, parameterTypes)) {
			TempGeneralDeclarationLocalServiceUtil.deletTempGeneral(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName577.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes577, parameterTypes)) {
			TempGeneralDeclarationLocalServiceUtil.updateTempGeneral(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Double)arguments[2]).doubleValue());

			return null;
		}

		if (_methodName578.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes578, parameterTypes)) {
			TempGeneralDeclarationLocalServiceUtil.updateRemarks(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);

			return null;
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
	private String _methodName578;
	private String[] _methodParameterTypes578;
}