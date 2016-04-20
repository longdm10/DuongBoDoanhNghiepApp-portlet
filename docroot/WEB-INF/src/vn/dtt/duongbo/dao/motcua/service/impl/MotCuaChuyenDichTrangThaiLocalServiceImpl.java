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

package vn.dtt.duongbo.dao.motcua.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.duongbo.dao.motcua.service.base.MotCuaChuyenDichTrangThaiLocalServiceBaseImpl;

/**
 * The implementation of the mot cua chuyen dich trang thai local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.base.MotCuaChuyenDichTrangThaiLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil
 */
public class MotCuaChuyenDichTrangThaiLocalServiceImpl
	extends MotCuaChuyenDichTrangThaiLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil} to access the mot cua chuyen dich trang thai local service.
	 */
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(
			String dieuKienChuyenDich, long trangThaiNguonId,
			long quyTrinhThuTucId){
		try{
			return motCuaChuyenDichTrangThaiPersistence.findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(dieuKienChuyenDich, trangThaiNguonId, quyTrinhThuTucId);
		}catch (SystemException e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<MotCuaChuyenDichTrangThai> findByKhoiTaoPhieuXuLy(
			long quyTrinhThuTucId, long trangThaiNguonId){
		try{
			return motCuaChuyenDichTrangThaiPersistence.findByKhoiTaoPhieuXuLy(quyTrinhThuTucId,trangThaiNguonId);
		}catch (SystemException e) {
			_log.error(e);
		}
		return null;
	}
	
	public MotCuaChuyenDichTrangThai fetchByTrangThaiNguonNull(long quyTrinhThuTucId, String dieuKienChuyenDich) throws SystemException {
		return motCuaChuyenDichTrangThaiPersistence.fetchByTrangThaiNguonNull(quyTrinhThuTucId, dieuKienChuyenDich);
	}
	public MotCuaChuyenDichTrangThai fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(long quyTrinhThuTucId,long trangThaiNguonId, String dieuKienChuyenDich) throws SystemException {
		return motCuaChuyenDichTrangThaiPersistence.fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(dieuKienChuyenDich, trangThaiNguonId, quyTrinhThuTucId);
	}
	
	private static Log _log = LogFactoryUtil.getLog(MotCuaChuyenDichTrangThaiLocalServiceImpl.class);
}