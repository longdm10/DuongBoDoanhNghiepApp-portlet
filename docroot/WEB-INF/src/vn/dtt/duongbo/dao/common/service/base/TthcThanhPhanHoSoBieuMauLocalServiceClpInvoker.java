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

package vn.dtt.duongbo.dao.common.service.base;

import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class TthcThanhPhanHoSoBieuMauLocalServiceClpInvoker {
	public TthcThanhPhanHoSoBieuMauLocalServiceClpInvoker() {
		_methodName0 = "addTthcThanhPhanHoSoBieuMau";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"
			};

		_methodName1 = "createTthcThanhPhanHoSoBieuMau";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTthcThanhPhanHoSoBieuMau";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTthcThanhPhanHoSoBieuMau";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"
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

		_methodName10 = "fetchTthcThanhPhanHoSoBieuMau";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTthcThanhPhanHoSoBieuMau";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTthcThanhPhanHoSoBieuMaus";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTthcThanhPhanHoSoBieuMausCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTthcThanhPhanHoSoBieuMau";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"
			};

		_methodName170 = "getBeanIdentifier";

		_methodParameterTypes170 = new String[] {  };

		_methodName171 = "setBeanIdentifier";

		_methodParameterTypes171 = new String[] { "java.lang.String" };

		_methodName176 = "findByThanhPhanHoSoId";

		_methodParameterTypes176 = new String[] { "long" };

		_methodName177 = "findByBieuMauHoSoId";

		_methodParameterTypes177 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.addTthcThanhPhanHoSoBieuMau((vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.createTthcThanhPhanHoSoBieuMau(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.deleteTthcThanhPhanHoSoBieuMau(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.deleteTthcThanhPhanHoSoBieuMau((vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.fetchTthcThanhPhanHoSoBieuMau(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.getTthcThanhPhanHoSoBieuMau(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.getTthcThanhPhanHoSoBieuMaus(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.getTthcThanhPhanHoSoBieuMausCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.updateTthcThanhPhanHoSoBieuMau((vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau)arguments[0]);
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			TthcThanhPhanHoSoBieuMauLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(((Long)arguments[0]).longValue());
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByBieuMauHoSoId(((Long)arguments[0]).longValue());
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
	private String _methodName170;
	private String[] _methodParameterTypes170;
	private String _methodName171;
	private String[] _methodParameterTypes171;
	private String _methodName176;
	private String[] _methodParameterTypes176;
	private String _methodName177;
	private String[] _methodParameterTypes177;
}