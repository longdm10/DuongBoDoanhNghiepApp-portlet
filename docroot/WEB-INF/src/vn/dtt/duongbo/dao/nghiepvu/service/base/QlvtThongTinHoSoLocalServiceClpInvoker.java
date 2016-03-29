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

package vn.dtt.duongbo.dao.nghiepvu.service.base;

import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author NhanNc
 * @generated
 */
public class QlvtThongTinHoSoLocalServiceClpInvoker {
	public QlvtThongTinHoSoLocalServiceClpInvoker() {
		_methodName0 = "addQlvtThongTinHoSo";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"
			};

		_methodName1 = "createQlvtThongTinHoSo";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteQlvtThongTinHoSo";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteQlvtThongTinHoSo";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"
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

		_methodName10 = "fetchQlvtThongTinHoSo";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getQlvtThongTinHoSo";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getQlvtThongTinHoSos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getQlvtThongTinHoSosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateQlvtThongTinHoSo";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"
			};

		_methodName104 = "getBeanIdentifier";

		_methodParameterTypes104 = new String[] {  };

		_methodName105 = "setBeanIdentifier";

		_methodParameterTypes105 = new String[] { "java.lang.String" };

		_methodName110 = "getMaSoHoSo";

		_methodParameterTypes110 = new String[] { "java.lang.String" };

		_methodName111 = "fetchByphieuXuLyId";

		_methodParameterTypes111 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.addQlvtThongTinHoSo((vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.createQlvtThongTinHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.deleteQlvtThongTinHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.deleteQlvtThongTinHoSo((vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.getQlvtThongTinHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.getQlvtThongTinHoSos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.getQlvtThongTinHoSosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo((vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo)arguments[0]);
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			QlvtThongTinHoSoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.getMaSoHoSo((java.lang.String)arguments[0]);
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(((Long)arguments[0]).longValue());
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
	private String _methodName104;
	private String[] _methodParameterTypes104;
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
}