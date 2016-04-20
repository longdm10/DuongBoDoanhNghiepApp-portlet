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

package vn.dtt.duongbo.dao.common.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.service.base.TthcNoidungHoSoLocalServiceBaseImpl;
import vn.dtt.duongthuy.business.DuongThuyUtil;

/**
 * The implementation of the tthc noidung ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.TthcNoidungHoSoLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil
 */
public class TthcNoidungHoSoLocalServiceImpl extends TthcNoidungHoSoLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil} to access the tthc noidung ho so local service.
	 */
	
	private static Log _log = LogFactoryUtil.getLog(TthcNoidungHoSoLocalServiceImpl.class);
	
	public TthcNoidungHoSo updateNoiDungHoSo(long userId, long hoSoThuTucId,
			long thanhPhanHoSoId, String tenTaiLieu,
			long taiLieuDinhKem, String noiDungXML, long loaiTaiLieu, int trangThai)
			throws PortalException, SystemException {
		
		TthcNoidungHoSo noiDungHoSo = null;
		
		Date now = new Date();
			
		long bieuMauHoSoId = DuongThuyUtil.getBieuMauHoSoIdByThanhPhanHoSoId(thanhPhanHoSoId);
		
		noiDungHoSo = tthcNoidungHoSoPersistence
			.fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
					bieuMauHoSoId, hoSoThuTucId, thanhPhanHoSoId);
	
		if(noiDungHoSo == null) {
			long id = counterLocalService.increment(TthcNoidungHoSo.class.getName());
			
			noiDungHoSo = tthcNoidungHoSoPersistence.create(id);
			noiDungHoSo.setNgayTao(now);
			noiDungHoSo.setNguoiTao(userId);
		}
		
		noiDungHoSo.setHoSoThuTucId(hoSoThuTucId);
		noiDungHoSo.setBieuMauHoSoId(bieuMauHoSoId);
		noiDungHoSo.setThanhPhanHoSoId(thanhPhanHoSoId);
		noiDungHoSo.setTenTaiLieu(tenTaiLieu);
		noiDungHoSo.setTaiLieuDinhKem(taiLieuDinhKem);
		noiDungHoSo.setNoiDungXml(noiDungXML);
		noiDungHoSo.setTrangThai(trangThai);
		noiDungHoSo.setLoaiTaiLieu(loaiTaiLieu);
		
		tthcNoidungHoSoPersistence.update(noiDungHoSo);
		
		return noiDungHoSo;
	}
	
	public TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId) {
		try {
			
			return tthcNoidungHoSoPersistence.fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, bieuMauHoSoId, thanhPhanHoSoId);
		} catch (Exception e) {
			_log.error("NoSuchTthcNoidungHoSoException: No TthcNoidungHoSo exists with the key {hoSoThuTucId=" + hoSoThuTucId + ", bieuMauHoSoId=" + bieuMauHoSoId + ", thanhPhanHoSoId=" + thanhPhanHoSoId + "}");
		}
		return null;
	}
	
	public TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId, long trangThai) {
		try {
			return tthcNoidungHoSoPersistence.fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId, bieuMauHoSoId, thanhPhanHoSoId, trangThai);
		} catch (Exception e) {
			_log.error("No TthcNoidungHoSo exists with the key {hoSoThuTucId=" + hoSoThuTucId + ", bieuMauHoSoId=" + bieuMauHoSoId + ", thanhPhanHoSoId=" + thanhPhanHoSoId + ", trangThai=" + trangThai + "}");
			
		}
		return null;
	}
	
	public List<TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId, long thanhPhanHoSoId) {
		try {
			return tthcNoidungHoSoPersistence.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<TthcNoidungHoSo> findByHoSoThuTucId(long hoSoThuTucId) {
		try {
			return tthcNoidungHoSoPersistence.findByHoSoThuTucId(hoSoThuTucId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoId(long hoSoThuTucId, long bieuMauHoSoId) {
		try {
			
			return tthcNoidungHoSoPersistence.fetchByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId, bieuMauHoSoId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<TthcNoidungHoSo> findByHoSoThuTucIdThanhPhanHoSoId(long hoSoThuTucId, long thanhPhanHoSoId) {
		try {
			return tthcNoidungHoSoFinder.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public TthcNoidungHoSo getLastByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId, long thanhPhanHoSoId) {
		try {
			return tthcNoidungHoSoFinder.getLastByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public TthcNoidungHoSo findHoSoThuTucId_TaiLieuDinhKem(long hoSoThuTucId, long taiLieuDinhKem) throws SystemException {
		return tthcNoidungHoSoPersistence.fetchByHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId, taiLieuDinhKem);
}
	public TthcNoidungHoSo fetchByHoSoThuTucDonOnline(long hoSoThuTucId, long thanhPhanHoSoId) throws SystemException {
		return tthcNoidungHoSoPersistence.fetchByHoSoThuTucDonOnline(hoSoThuTucId, thanhPhanHoSoId);
}
	public List<TthcNoidungHoSo> findByF_HS_DINH_KEM(long hoSoThuTucId) throws SystemException {
		return tthcNoidungHoSoPersistence.findByF_HS_DINH_KEM(hoSoThuTucId);
	}
}
