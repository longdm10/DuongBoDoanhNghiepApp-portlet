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

import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietLaoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class QlvtPhuongTienDangKyVietLaoLocalServiceClpInvoker {
	public QlvtPhuongTienDangKyVietLaoLocalServiceClpInvoker() {
		_methodName0 = "addQlvtPhuongTienDangKyVietLao";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao"
			};

		_methodName1 = "createQlvtPhuongTienDangKyVietLao";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteQlvtPhuongTienDangKyVietLao";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteQlvtPhuongTienDangKyVietLao";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao"
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

		_methodName10 = "fetchQlvtPhuongTienDangKyVietLao";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getQlvtPhuongTienDangKyVietLao";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getQlvtPhuongTienDangKyVietLaos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getQlvtPhuongTienDangKyVietLaosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateQlvtPhuongTienDangKyVietLao";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao"
			};

		_methodName170 = "getBeanIdentifier";

		_methodParameterTypes170 = new String[] {  };

		_methodName171 = "setBeanIdentifier";

		_methodParameterTypes171 = new String[] { "java.lang.String" };

		_methodName176 = "findByNoiDungHoSoId";

		_methodParameterTypes176 = new String[] { "long" };

		_methodName177 = "findIdByNoiDungHoSoId";

		_methodParameterTypes177 = new String[] { "long" };

		_methodName178 = "deleteAllByNoiDungHoSoId";

		_methodParameterTypes178 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.addQlvtPhuongTienDangKyVietLao((vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.createQlvtPhuongTienDangKyVietLao(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.deleteQlvtPhuongTienDangKyVietLao(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.deleteQlvtPhuongTienDangKyVietLao((vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.fetchQlvtPhuongTienDangKyVietLao(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.getQlvtPhuongTienDangKyVietLao(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.getQlvtPhuongTienDangKyVietLaos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.getQlvtPhuongTienDangKyVietLaosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.updateQlvtPhuongTienDangKyVietLao((vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao)arguments[0]);
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			QlvtPhuongTienDangKyVietLaoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.findByNoiDungHoSoId(((Long)arguments[0]).longValue());
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.findIdByNoiDungHoSoId(((Long)arguments[0]).longValue());
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return QlvtPhuongTienDangKyVietLaoLocalServiceUtil.deleteAllByNoiDungHoSoId(((Long)arguments[0]).longValue());
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
	private String _methodName178;
	private String[] _methodParameterTypes178;
}