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

import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class TthcHoSoThuTucLocalServiceClpInvoker {
	public TthcHoSoThuTucLocalServiceClpInvoker() {
		_methodName0 = "addTthcHoSoThuTuc";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"
			};

		_methodName1 = "createTthcHoSoThuTuc";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTthcHoSoThuTuc";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTthcHoSoThuTuc";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"
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

		_methodName10 = "fetchTthcHoSoThuTuc";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTthcHoSoThuTuc";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTthcHoSoThuTucs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTthcHoSoThuTucsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTthcHoSoThuTuc";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"
			};

		_methodName170 = "getBeanIdentifier";

		_methodParameterTypes170 = new String[] {  };

		_methodName171 = "setBeanIdentifier";

		_methodParameterTypes171 = new String[] { "java.lang.String" };

		_methodName176 = "updateHoSoThuTuc";

		_methodParameterTypes176 = new String[] {
				"long", "long", "long", "long", "long", "long",
				"java.lang.String", "long", "long", "java.lang.String", "int"
			};

		_methodName177 = "findByMaSoHoSo";

		_methodParameterTypes177 = new String[] { "java.lang.String" };

		_methodName178 = "getByNguoiLamThuTucId";

		_methodParameterTypes178 = new String[] { "long" };

		_methodName179 = "getByNguoiLamThuTucIdAndThuTucHanhChinhId";

		_methodParameterTypes179 = new String[] { "long", "long" };

		_methodName180 = "findByNguoiTaoAndThuTucHanhChinhId";

		_methodParameterTypes180 = new String[] { "long", "long" };

		_methodName181 = "searchQuanLyHoSo";

		_methodParameterTypes181 = new String[] {
				"java.lang.String", "java.lang.String", "long", "long", "int",
				"int"
			};

		_methodName182 = "findHoSoByNguoiLamThuTucIdAndMaTrangThai";

		_methodParameterTypes182 = new String[] { "long", "java.lang.String" };

		_methodName183 = "countQuanLyHoSo";

		_methodParameterTypes183 = new String[] {
				"java.lang.String", "java.lang.String", "long", "long"
			};

		_methodName184 = "countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId";

		_methodParameterTypes184 = new String[] { "java.lang.String", "long" };

		_methodName185 = "searchQuanLyHoSoInPhanNhomGroup";

		_methodParameterTypes185 = new String[] {
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String", "int", "int"
			};

		_methodName186 = "countQuanLyHoSoInPhanNhomGroup";

		_methodParameterTypes186 = new String[] {
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String"
			};

		_methodName187 = "searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep";

		_methodParameterTypes187 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "java.lang.String", "int", "int"
			};

		_methodName188 = "countQuanLyHoSoInPhanNhomHoSoDoanhNghiep";

		_methodParameterTypes188 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "java.lang.String"
			};

		_methodName189 = "countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId";

		_methodParameterTypes189 = new String[] { "long", "long" };

		_methodName190 = "countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId";

		_methodParameterTypes190 = new String[] { "java.lang.String", "long" };

		_methodName191 = "findByUserAndThuTucHanhChinhId";

		_methodParameterTypes191 = new String[] { "long", "long" };

		_methodName192 = "maxMaBienNhan";

		_methodParameterTypes192 = new String[] { "java.util.Date" };

		_methodName193 = "maxMaSoHoSo";

		_methodParameterTypes193 = new String[] { "java.lang.String" };

		_methodName194 = "countHoSoThuTucByTrangThai";

		_methodParameterTypes194 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.addTthcHoSoThuTuc((vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.createTthcHoSoThuTuc(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.deleteTthcHoSoThuTuc(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.deleteTthcHoSoThuTuc((vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTucs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTucsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc((vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc)arguments[0]);
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			TthcHoSoThuTucLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.updateHoSoThuTuc(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				((Long)arguments[5]).longValue(),
				(java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				((Long)arguments[8]).longValue(),
				(java.lang.String)arguments[9],
				((Integer)arguments[10]).intValue());
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.findByMaSoHoSo((java.lang.String)arguments[0]);
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.getByNguoiLamThuTucId(((Long)arguments[0]).longValue());
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.getByNguoiLamThuTucIdAndThuTucHanhChinhId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.findByNguoiTaoAndThuTucHanhChinhId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.searchQuanLyHoSo((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue());
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.findHoSoByNguoiLamThuTucIdAndMaTrangThai(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.countQuanLyHoSo((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue());
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.searchQuanLyHoSoInPhanNhomGroup((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue());
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.countQuanLyHoSoInPhanNhomGroup((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				(java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.countQuanLyHoSoInPhanNhomHoSoDoanhNghiep((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(), (java.lang.String)arguments[4]);
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.findByUserAndThuTucHanhChinhId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.maxMaBienNhan((java.util.Date)arguments[0]);
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.maxMaSoHoSo((java.lang.String)arguments[0]);
		}

		if (_methodName194.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes194, parameterTypes)) {
			return TthcHoSoThuTucLocalServiceUtil.countHoSoThuTucByTrangThai((java.lang.String)arguments[0]);
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
}