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

package vn.dtt.duongbo.dao.motcua.service.base;

import vn.dtt.duongbo.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class MotCuaDienBienHoSoLocalServiceClpInvoker {
	public MotCuaDienBienHoSoLocalServiceClpInvoker() {
		_methodName0 = "addMotCuaDienBienHoSo";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo"
			};

		_methodName1 = "createMotCuaDienBienHoSo";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteMotCuaDienBienHoSo";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteMotCuaDienBienHoSo";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo"
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

		_methodName10 = "fetchMotCuaDienBienHoSo";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getMotCuaDienBienHoSo";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getMotCuaDienBienHoSos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getMotCuaDienBienHoSosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateMotCuaDienBienHoSo";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo"
			};

		_methodName146 = "getBeanIdentifier";

		_methodParameterTypes146 = new String[] {  };

		_methodName147 = "setBeanIdentifier";

		_methodParameterTypes147 = new String[] { "java.lang.String" };

		_methodName152 = "findMotCuaDienBienHoSo";

		_methodParameterTypes152 = new String[] { "long" };

		_methodName153 = "findByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId";

		_methodParameterTypes153 = new String[] { "long", "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo((vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.createMotCuaDienBienHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.deleteMotCuaDienBienHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.deleteMotCuaDienBienHoSo((vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.fetchMotCuaDienBienHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getMotCuaDienBienHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getMotCuaDienBienHoSos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getMotCuaDienBienHoSosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.updateMotCuaDienBienHoSo((vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo)arguments[0]);
		}

		if (_methodName146.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes146, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			MotCuaDienBienHoSoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findMotCuaDienBienHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
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
	private String _methodName146;
	private String[] _methodParameterTypes146;
	private String _methodName147;
	private String[] _methodParameterTypes147;
	private String _methodName152;
	private String[] _methodParameterTypes152;
	private String _methodName153;
	private String[] _methodParameterTypes153;
}