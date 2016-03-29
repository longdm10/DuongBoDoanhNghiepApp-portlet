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

import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class DmDataItemLocalServiceClpInvoker {
	public DmDataItemLocalServiceClpInvoker() {
		_methodName0 = "addDmDataItem";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.duongbo.dao.common.model.DmDataItem"
			};

		_methodName1 = "createDmDataItem";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteDmDataItem";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteDmDataItem";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.duongbo.dao.common.model.DmDataItem"
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

		_methodName10 = "fetchDmDataItem";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getDmDataItem";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getDmDataItems";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getDmDataItemsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateDmDataItem";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.duongbo.dao.common.model.DmDataItem"
			};

		_methodName170 = "getBeanIdentifier";

		_methodParameterTypes170 = new String[] {  };

		_methodName171 = "setBeanIdentifier";

		_methodParameterTypes171 = new String[] { "java.lang.String" };

		_methodName176 = "findByGroupIdAndLevel";

		_methodParameterTypes176 = new String[] { "long", "int" };

		_methodName177 = "findByGroupIdAndChaCode";

		_methodParameterTypes177 = new String[] { "long", "java.lang.String" };

		_methodName178 = "findByGroupIdAndCode";

		_methodParameterTypes178 = new String[] { "long", "java.lang.String" };

		_methodName179 = "findByGroupIdAndCodeStatus";

		_methodParameterTypes179 = new String[] { "long", "java.lang.String" };

		_methodName180 = "findTinhThanh";

		_methodParameterTypes180 = new String[] {  };

		_methodName181 = "findQuanHuyenByMaTinhThanh";

		_methodParameterTypes181 = new String[] { "java.lang.String" };

		_methodName182 = "findPhuongXaByMaTinhThanMaQuanHuyen";

		_methodParameterTypes182 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName183 = "findByGroupCodeAndItemCode0";

		_methodParameterTypes183 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName184 = "findByGroupCode";

		_methodParameterTypes184 = new String[] { "java.lang.String" };

		_methodName185 = "findByGroupCodeIdTTHC";

		_methodParameterTypes185 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName186 = "findByGroupCodeAndNode1";

		_methodParameterTypes186 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName187 = "findByGroupId";

		_methodParameterTypes187 = new String[] { "long" };

		_methodName188 = "findByGroupCodeAndLevel";

		_methodParameterTypes188 = new String[] { "java.lang.String", "int" };

		_methodName189 = "findByCodeAndStatus";

		_methodParameterTypes189 = new String[] { "java.lang.String", "int" };

		_methodName190 = "findByGroupIdAndStatus";

		_methodParameterTypes190 = new String[] { "long", "int" };

		_methodName191 = "findByArrayId";

		_methodParameterTypes191 = new String[] { "java.lang.String" };

		_methodName192 = "findByGroupIdAndItemCode";

		_methodParameterTypes192 = new String[] { "long", "java.lang.String" };

		_methodName193 = "getByGroupCodeAndItemCode0";

		_methodParameterTypes193 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName194 = "getByCode";

		_methodParameterTypes194 = new String[] { "java.lang.String" };

		_methodName195 = "getByCodeAndLevel";

		_methodParameterTypes195 = new String[] { "java.lang.String", "int" };

		_methodName196 = "getByCodeAndNode1";

		_methodParameterTypes196 = new String[] {
				"java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return DmDataItemLocalServiceUtil.addDmDataItem((vn.dtt.duongbo.dao.common.model.DmDataItem)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return DmDataItemLocalServiceUtil.createDmDataItem(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return DmDataItemLocalServiceUtil.deleteDmDataItem(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return DmDataItemLocalServiceUtil.deleteDmDataItem((vn.dtt.duongbo.dao.common.model.DmDataItem)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return DmDataItemLocalServiceUtil.fetchDmDataItem(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getDmDataItem(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getDmDataItems(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getDmDataItemsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return DmDataItemLocalServiceUtil.updateDmDataItem((vn.dtt.duongbo.dao.common.model.DmDataItem)arguments[0]);
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			DmDataItemLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupIdAndLevel(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupIdAndChaCode(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupIdAndCode(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupIdAndCodeStatus(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findTinhThanh();
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findQuanHuyenByMaTinhThanh((java.lang.String)arguments[0]);
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findPhuongXaByMaTinhThanMaQuanHuyen((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupCodeAndItemCode0((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupCode((java.lang.String)arguments[0]);
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupCodeIdTTHC((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupCodeAndNode1((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupCodeAndLevel((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByCodeAndStatus((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupIdAndStatus(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByArrayId((java.lang.String)arguments[0]);
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupIdAndItemCode(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByCode((java.lang.String)arguments[0]);
		}

		if (_methodName195.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes195, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByCodeAndLevel((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName196.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes196, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByCodeAndNode1((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
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
	private String _methodName179;
	private String[] _methodParameterTypes179;
	private String _methodName180;
	private String[] _methodParameterTypes180;
	private String _methodName181;
	private String[] _methodParameterTypes181;
	private String _methodName182;
	private String[] _methodParameterTypes182;
	private String _methodName183;
	private String[] _methodParameterTypes183;
	private String _methodName184;
	private String[] _methodParameterTypes184;
	private String _methodName185;
	private String[] _methodParameterTypes185;
	private String _methodName186;
	private String[] _methodParameterTypes186;
	private String _methodName187;
	private String[] _methodParameterTypes187;
	private String _methodName188;
	private String[] _methodParameterTypes188;
	private String _methodName189;
	private String[] _methodParameterTypes189;
	private String _methodName190;
	private String[] _methodParameterTypes190;
	private String _methodName191;
	private String[] _methodParameterTypes191;
	private String _methodName192;
	private String[] _methodParameterTypes192;
	private String _methodName193;
	private String[] _methodParameterTypes193;
	private String _methodName194;
	private String[] _methodParameterTypes194;
	private String _methodName195;
	private String[] _methodParameterTypes195;
	private String _methodName196;
	private String[] _methodParameterTypes196;
}