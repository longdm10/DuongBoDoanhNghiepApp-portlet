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

package vn.dtt.duongbo.dao.motcua.service;

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author win_64
 * @generated
 */
public class MotCuaPhieuXuLyLocalServiceClp
	implements MotCuaPhieuXuLyLocalService {
	public MotCuaPhieuXuLyLocalServiceClp(
		InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

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

		_methodName16 = "getBeanIdentifier";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "setBeanIdentifier";

		_methodParameterTypes17 = new String[] { "java.lang.String" };

		_methodName19 = "findByHoSoThuTucIdAndQuyTrinhThuTucId";

		_methodParameterTypes19 = new String[] { "long", "long" };

		_methodName20 = "findByHoSoThuTucId";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "findByToChucQuanLyId";

		_methodParameterTypes21 = new String[] { "long" };

		_methodName22 = "findByToChucQuanLyAndPhanNhomHoSo";

		_methodParameterTypes22 = new String[] { "long", "long" };

		_methodName23 = "searhMotCuaPhieuXuLy";

		_methodParameterTypes23 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "int"
			};

		_methodName24 = "countMotCuaPhieuXuLy";

		_methodParameterTypes24 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName25 = "countMotCuaPhieuXuLy";

		_methodParameterTypes25 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String"
			};

		_methodName26 = "countMotCuaPhieuXuLyByPhanNhomHoSo";

		_methodParameterTypes26 = new String[] {
				"long", "long", "long", "java.lang.String"
			};

		_methodName27 = "findMotCuaPhieuXuLy";

		_methodParameterTypes27 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String", "int", "int"
			};

		_methodName28 = "countMotCuaPhieuXuLyByTrangThai";

		_methodParameterTypes28 = new String[] { "java.lang.String" };

		_methodName29 = "layHoSoDaXuLyOrDangXuLy";

		_methodParameterTypes29 = new String[] {
				"long", "java.lang.String", "java.util.Date"
			};

		_methodName30 = "countMotCuaPhieuXuLyByUserId_TC01";

		_methodParameterTypes30 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long"
			};

		_methodName31 = "countMotCuaPhieuXuLyByUserId";

		_methodParameterTypes31 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long"
			};

		_methodName32 = "countMotCuaPhieuXuLyByUserId2";

		_methodParameterTypes32 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long"
			};

		_methodName33 = "findMotCuaPhieuXuLyByUserId";

		_methodParameterTypes33 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long", "int",
				"int"
			};

		_methodName34 = "findMotCuaPhieuXuLyByUserId_TC01";

		_methodParameterTypes34 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long", "int",
				"int"
			};

		_methodName35 = "findMotCuaPhieuXuLyByUserId2";

		_methodParameterTypes35 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long", "int",
				"int"
			};

		_methodName36 = "findMotCuaPhieuXuLyDoneByOrgid";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "countMotCuaPhieuXuLyTrangThai";

		_methodParameterTypes37 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long"
			};

		_methodName38 = "findMotCuaPhieuXuLyTrangThai";

		_methodParameterTypes38 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.util.Date", "java.util.Date",
				"java.lang.String", "java.lang.String", "long", "long", "int",
				"int"
			};

		_methodName39 = "countMotCuaPhieuXuLyByTrangThaiAndUserId";

		_methodParameterTypes39 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName40 = "countMotCuaPhieuXuLyByTrangThaiAndUserId2";

		_methodParameterTypes40 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName41 = "getMotCuaPhieuXuLyByTrangThaiAndUserId";

		_methodParameterTypes41 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName42 = "getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc";

		_methodParameterTypes42 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName43 = "getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2";

		_methodParameterTypes43 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName44 = "getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3";

		_methodParameterTypes44 = new String[] {
				"long", "java.util.Date", "java.util.Date", "long", "long",
				"java.lang.String"
			};

		_methodName45 = "getMotCuaPhieuXuLyByOrgs";

		_methodParameterTypes45 = new String[] { "long" };

		_methodName46 = "getMotCuaPhieuXuLyByOrgs2";

		_methodParameterTypes46 = new String[] { "long" };

		_methodName47 = "getMotCuaPhieuXuLyVanThuByOrgs";

		_methodParameterTypes47 = new String[] { "long" };

		_methodName48 = "countMotCuaPhieuXuLyByTrangThaiVanThu";

		_methodParameterTypes48 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName49 = "findMotCuaPhieuXuLy_NEW";

		_methodParameterTypes49 = new String[] { "java.util.List", "int", "int" };

		_methodName50 = "countMotCuaPhieuXuLy_NEW";

		_methodParameterTypes50 = new String[] { "java.util.List" };
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy addMotCuaPhieuXuLy(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(motCuaPhieuXuLy) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy createMotCuaPhieuXuLy(
		long id) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] { id });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy deleteMotCuaPhieuXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { id });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy deleteMotCuaPhieuXuLy(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(motCuaPhieuXuLy) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.DynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					ClpSerializer.translateInput(projection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchMotCuaPhieuXuLy(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { id });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy getMotCuaPhieuXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11, new Object[] { id });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> getMotCuaPhieuXuLies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getMotCuaPhieuXuLiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy updateMotCuaPhieuXuLy(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { ClpSerializer.translateInput(motCuaPhieuXuLy) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName17,
				_methodParameterTypes17,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] { hoSoThuTucId, quyTrinhThuTucId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByHoSoThuTucId(
		long hoSoThuTucId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20, new Object[] { hoSoThuTucId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyId(
		long toChucQuanLy) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21, new Object[] { toChucQuanLy });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName22,
					_methodParameterTypes22,
					new Object[] { toChucQuanLy, phanNhomHoSoId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> searhMotCuaPhieuXuLy(
		long thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayGuiHoSoFrom, java.lang.String ngayGuiHoSoTo,
		int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] {
						thuTucHanhChinhId,
						
					ClpSerializer.translateInput(maSoHoSo),
						
					ClpSerializer.translateInput(ngayGuiHoSoFrom),
						
					ClpSerializer.translateInput(ngayGuiHoSoTo),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countMotCuaPhieuXuLy(long thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayGuiHoSoFrom,
		java.lang.String ngayGuiHoSoTo) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24,
					new Object[] {
						thuTucHanhChinhId,
						
					ClpSerializer.translateInput(maSoHoSo),
						
					ClpSerializer.translateInput(ngayGuiHoSoFrom),
						
					ClpSerializer.translateInput(ngayGuiHoSoTo)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countMotCuaPhieuXuLy(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId, java.lang.String role) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					userId,
						
					ClpSerializer.translateInput(role)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countMotCuaPhieuXuLyByPhanNhomHoSo(long phanNhomHoSo,
		long ogrId, long userId, java.lang.String role)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName26,
					_methodParameterTypes26,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					userId,
						
					ClpSerializer.translateInput(role)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLy(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, java.lang.String role, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					userId,
						
					ClpSerializer.translateInput(role),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countMotCuaPhieuXuLyByTrangThai(java.lang.String trangThaiId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName28,
					_methodParameterTypes28,
					new Object[] { ClpSerializer.translateInput(trangThaiId) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int layHoSoDaXuLyOrDangXuLy(long userId, java.lang.String trangThai,
		java.util.Date date) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29,
					new Object[] {
						userId,
						
					ClpSerializer.translateInput(trangThai),
						
					ClpSerializer.translateInput(date)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countMotCuaPhieuXuLyByUserId_TC01(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName30,
					_methodParameterTypes30,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					userId
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countMotCuaPhieuXuLyByUserId(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName31,
					_methodParameterTypes31,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					userId
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countMotCuaPhieuXuLyByUserId2(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName32,
					_methodParameterTypes32,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					userId
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName33,
					_methodParameterTypes33,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					userId,
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId_TC01(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName34,
					_methodParameterTypes34,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					userId,
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId2(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName35,
					_methodParameterTypes35,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					userId,
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyDoneByOrgid(
		long ogrId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName36,
					_methodParameterTypes36, new Object[] { ogrId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countMotCuaPhieuXuLyTrangThai(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long trangThaiHienTaiId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName37,
					_methodParameterTypes37,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					trangThaiHienTaiId
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyTrangThai(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long trangThaiHienTaiId, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName38,
					_methodParameterTypes38,
					new Object[] {
						phanNhomHoSo,
						
					ogrId,
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					ClpSerializer.translateInput(henTraTuNgay),
						
					ClpSerializer.translateInput(henTraDenNgay),
						
					ClpSerializer.translateInput(doanhNghiep),
						
					ClpSerializer.translateInput(linhVucThuTucHanhChinh),
						
					idThuTucHanhChinh,
						
					trangThaiHienTaiId,
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countMotCuaPhieuXuLyByTrangThaiAndUserId(long ogrId,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName39,
					_methodParameterTypes39,
					new Object[] {
						ogrId,
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					idThuTucHanhChinh,
						
					userId,
						
					ClpSerializer.translateInput(trangThaiIds)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countMotCuaPhieuXuLyByTrangThaiAndUserId2(long ogrId,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName40,
					_methodParameterTypes40,
					new Object[] {
						ogrId,
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					idThuTucHanhChinh,
						
					userId,
						
					ClpSerializer.translateInput(trangThaiIds)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserId(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName41,
					_methodParameterTypes41,
					new Object[] {
						ogrId,
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					idThuTucHanhChinh,
						
					userId,
						
					ClpSerializer.translateInput(trangThaiIds)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<java.lang.Object>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName42,
					_methodParameterTypes42,
					new Object[] {
						ogrId,
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					idThuTucHanhChinh,
						
					userId,
						
					ClpSerializer.translateInput(trangThaiIds)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<java.lang.Object>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName43,
					_methodParameterTypes43,
					new Object[] {
						ogrId,
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					idThuTucHanhChinh,
						
					userId,
						
					ClpSerializer.translateInput(trangThaiIds)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<java.lang.Object>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName44,
					_methodParameterTypes44,
					new Object[] {
						ogrId,
						
					ClpSerializer.translateInput(nopTuNgay),
						
					ClpSerializer.translateInput(nopDenNgay),
						
					idThuTucHanhChinh,
						
					userId,
						
					ClpSerializer.translateInput(trangThaiIds)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<java.lang.Object>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByOrgs(long ogrId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName45,
					_methodParameterTypes45, new Object[] { ogrId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<java.lang.Object>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByOrgs2(
		long ogrId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName46,
					_methodParameterTypes46, new Object[] { ogrId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<java.lang.Object>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyVanThuByOrgs(
		long ogrId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName47,
					_methodParameterTypes47, new Object[] { ogrId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<java.lang.Object>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countMotCuaPhieuXuLyByTrangThaiVanThu(long ogrId,
		long idThuTucHanhChinh, java.lang.String trangThaiIds) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName48,
					_methodParameterTypes48,
					new Object[] {
						ogrId,
						
					idThuTucHanhChinh,
						
					ClpSerializer.translateInput(trangThaiIds)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLy_NEW(
		java.util.List<java.lang.String> lstPar, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName49,
					_methodParameterTypes49,
					new Object[] {
						ClpSerializer.translateInput(lstPar),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countMotCuaPhieuXuLy_NEW(
		java.util.List<java.lang.String> lstCount) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName50,
					_methodParameterTypes50,
					new Object[] { ClpSerializer.translateInput(lstCount) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	private InvokableLocalService _invokableLocalService;
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
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
}