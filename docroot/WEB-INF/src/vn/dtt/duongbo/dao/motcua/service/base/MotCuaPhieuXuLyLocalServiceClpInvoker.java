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

import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class MotCuaPhieuXuLyLocalServiceClpInvoker {
	public MotCuaPhieuXuLyLocalServiceClpInvoker() {
		_methodName0 = "addMotCuaPhieuXuLy";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy"
			};

		_methodName1 = "createMotCuaPhieuXuLy";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteMotCuaPhieuXuLy";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteMotCuaPhieuXuLy";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy"
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

		_methodName10 = "fetchMotCuaPhieuXuLy";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getMotCuaPhieuXuLy";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getMotCuaPhieuXuLies";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getMotCuaPhieuXuLiesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateMotCuaPhieuXuLy";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy"
			};

		_methodName146 = "getBeanIdentifier";

		_methodParameterTypes146 = new String[] {  };

		_methodName147 = "setBeanIdentifier";

		_methodParameterTypes147 = new String[] { "java.lang.String" };

		_methodName152 = "findByHoSoThuTucIdAndQuyTrinhThuTucId";

		_methodParameterTypes152 = new String[] { "long", "long" };

		_methodName153 = "findByHoSoThuTucId";

		_methodParameterTypes153 = new String[] { "long" };

		_methodName154 = "findByToChucQuanLyId";

		_methodParameterTypes154 = new String[] { "long" };

		_methodName155 = "findByToChucQuanLyAndPhanNhomHoSo";

		_methodParameterTypes155 = new String[] { "long", "long" };

		_methodName156 = "searhMotCuaPhieuXuLy";

		_methodParameterTypes156 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "int"
			};

		_methodName157 = "countMotCuaPhieuXuLy";

		_methodParameterTypes157 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName158 = "countMotCuaPhieuXuLy";

		_methodParameterTypes158 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String"
			};

		_methodName159 = "countMotCuaPhieuXuLyByPhanNhomHoSo";

		_methodParameterTypes159 = new String[] {
				"long", "long", "long", "java.lang.String"
			};

		_methodName160 = "findMotCuaPhieuXuLy";

		_methodParameterTypes160 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String", "int", "int"
			};

		_methodName161 = "countMotCuaPhieuXuLyByTrangThai";

		_methodParameterTypes161 = new String[] { "java.lang.String" };

		_methodName162 = "layHoSoDaXuLyOrDangXuLy";

		_methodParameterTypes162 = new String[] {
				"long", "java.lang.String", "java.util.Date"
			};

		_methodName163 = "countMotCuaPhieuXuLyByUserId_TC01";

		_methodParameterTypes163 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long"
			};

		_methodName164 = "countMotCuaPhieuXuLyByUserId";

		_methodParameterTypes164 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long"
			};

		_methodName165 = "countMotCuaPhieuXuLyByUserId2";

		_methodParameterTypes165 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long"
			};

		_methodName166 = "findMotCuaPhieuXuLyByUserId";

		_methodParameterTypes166 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long", "int",
				"int"
			};

		_methodName167 = "findMotCuaPhieuXuLyByUserId_TC01";

		_methodParameterTypes167 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long", "int",
				"int"
			};

		_methodName168 = "findMotCuaPhieuXuLyByUserId2";

		_methodParameterTypes168 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long", "int",
				"int"
			};

		_methodName169 = "findMotCuaPhieuXuLyDoneByOrgid";

		_methodParameterTypes169 = new String[] { "long" };

		_methodName170 = "countMotCuaPhieuXuLyTrangThai";

		_methodParameterTypes170 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long"
			};

		_methodName171 = "findMotCuaPhieuXuLyTrangThai";

		_methodParameterTypes171 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long", "int",
				"int"
			};

		_methodName172 = "countMotCuaPhieuXuLyByTrangThaiAndUserId";

		_methodParameterTypes172 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName173 = "countMotCuaPhieuXuLyByTrangThaiAndUserId2";

		_methodParameterTypes173 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName174 = "getMotCuaPhieuXuLyByTrangThaiAndUserId";

		_methodParameterTypes174 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName175 = "getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc";

		_methodParameterTypes175 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName176 = "getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2";

		_methodParameterTypes176 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName177 = "getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3";

		_methodParameterTypes177 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName178 = "getMotCuaPhieuXuLyByOrgs";

		_methodParameterTypes178 = new String[] { "long" };

		_methodName179 = "getMotCuaPhieuXuLyByOrgs2";

		_methodParameterTypes179 = new String[] { "long" };

		_methodName180 = "getMotCuaPhieuXuLyVanThuByOrgs";

		_methodParameterTypes180 = new String[] { "long" };

		_methodName181 = "countMotCuaPhieuXuLyByTrangThaiVanThu";

		_methodParameterTypes181 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName182 = "findMotCuaPhieuXuLy_NEW";

		_methodParameterTypes182 = new String[] { "java.util.List", "int", "int" };

		_methodName183 = "countMotCuaPhieuXuLy_NEW";

		_methodParameterTypes183 = new String[] { "java.util.List" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.addMotCuaPhieuXuLy((vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.createMotCuaPhieuXuLy(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.deleteMotCuaPhieuXuLy(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.deleteMotCuaPhieuXuLy((vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLies(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLiesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy((vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)arguments[0]);
		}

		if (_methodName146.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes146, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			MotCuaPhieuXuLyLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findByHoSoThuTucIdAndQuyTrinhThuTucId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findByHoSoThuTucId(((Long)arguments[0]).longValue());
		}

		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findByToChucQuanLyId(((Long)arguments[0]).longValue());
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findByToChucQuanLyAndPhanNhomHoSo(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.searhMotCuaPhieuXuLy(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue());
		}

		if (_methodName157.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes157, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLy(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLy(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue(),
				(java.lang.String)arguments[11]);
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByPhanNhomHoSo(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findMotCuaPhieuXuLy(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue(),
				(java.lang.String)arguments[11],
				((Integer)arguments[12]).intValue(),
				((Integer)arguments[13]).intValue());
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByTrangThai((java.lang.String)arguments[0]);
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.layHoSoDaXuLyOrDangXuLy(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.util.Date)arguments[2]);
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByUserId_TC01(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByUserId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue());
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByUserId2(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue());
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findMotCuaPhieuXuLyByUserId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue(),
				((Integer)arguments[11]).intValue(),
				((Integer)arguments[12]).intValue());
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findMotCuaPhieuXuLyByUserId_TC01(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue(),
				((Integer)arguments[11]).intValue(),
				((Integer)arguments[12]).intValue());
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findMotCuaPhieuXuLyByUserId2(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue(),
				((Integer)arguments[11]).intValue(),
				((Integer)arguments[12]).intValue());
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findMotCuaPhieuXuLyDoneByOrgid(((Long)arguments[0]).longValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyTrangThai(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findMotCuaPhieuXuLyTrangThai(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				(java.util.Date)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				((Long)arguments[10]).longValue(),
				((Integer)arguments[11]).intValue(),
				((Integer)arguments[12]).intValue());
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByTrangThaiAndUserId(((Long)arguments[0]).longValue(),
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(), (java.lang.String)arguments[5]);
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByTrangThaiAndUserId2(((Long)arguments[0]).longValue(),
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(), (java.lang.String)arguments[5]);
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLyByTrangThaiAndUserId(((Long)arguments[0]).longValue(),
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(), (java.lang.String)arguments[5]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(((Long)arguments[0]).longValue(),
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(), (java.lang.String)arguments[5]);
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(((Long)arguments[0]).longValue(),
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(), (java.lang.String)arguments[5]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(((Long)arguments[0]).longValue(),
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(), (java.lang.String)arguments[5]);
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLyByOrgs(((Long)arguments[0]).longValue());
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLyByOrgs2(((Long)arguments[0]).longValue());
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLyVanThuByOrgs(((Long)arguments[0]).longValue());
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByTrangThaiVanThu(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.lang.String)arguments[2]);
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.findMotCuaPhieuXuLy_NEW((java.util.List<java.lang.String>)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLy_NEW((java.util.List<java.lang.String>)arguments[0]);
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
	private String _methodName154;
	private String[] _methodParameterTypes154;
	private String _methodName155;
	private String[] _methodParameterTypes155;
	private String _methodName156;
	private String[] _methodParameterTypes156;
	private String _methodName157;
	private String[] _methodParameterTypes157;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName160;
	private String[] _methodParameterTypes160;
	private String _methodName161;
	private String[] _methodParameterTypes161;
	private String _methodName162;
	private String[] _methodParameterTypes162;
	private String _methodName163;
	private String[] _methodParameterTypes163;
	private String _methodName164;
	private String[] _methodParameterTypes164;
	private String _methodName165;
	private String[] _methodParameterTypes165;
	private String _methodName166;
	private String[] _methodParameterTypes166;
	private String _methodName167;
	private String[] _methodParameterTypes167;
	private String _methodName168;
	private String[] _methodParameterTypes168;
	private String _methodName169;
	private String[] _methodParameterTypes169;
	private String _methodName170;
	private String[] _methodParameterTypes170;
	private String _methodName171;
	private String[] _methodParameterTypes171;
	private String _methodName172;
	private String[] _methodParameterTypes172;
	private String _methodName173;
	private String[] _methodParameterTypes173;
	private String _methodName174;
	private String[] _methodParameterTypes174;
	private String _methodName175;
	private String[] _methodParameterTypes175;
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
}