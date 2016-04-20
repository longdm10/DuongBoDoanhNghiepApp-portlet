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

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.service.base.TthcThanhPhanHoSoLocalServiceBaseImpl;

/**
 * The implementation of the tthc thanh phan ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.TthcThanhPhanHoSoLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil
 */
public class TthcThanhPhanHoSoLocalServiceImpl
	extends TthcThanhPhanHoSoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil} to access the tthc thanh phan ho so local service.
	 */
	public TthcThanhPhanHoSo getByThuTucHanhChinhIdAndMaThanhPhan(long thuTucHanhChinhId, String maThanhPhan) {
		TthcThanhPhanHoSo result = null;
		
		try {
			result = tthcThanhPhanHoSoPersistence.fetchByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinhId, maThanhPhan);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<TthcThanhPhanHoSo> findByThuTucHanhChinhId(long thuTucHanhChinhId) {
		List<TthcThanhPhanHoSo> result = null;
		try {
			result = tthcThanhPhanHoSoPersistence.findByThuTucHanhChinhId(thuTucHanhChinhId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<TthcThanhPhanHoSo> findByThutucHanhChinhIdAndLoaiThanhPhan(String thuTucHanhChinhId, String loaiThanhPhan) {
		List<TthcThanhPhanHoSo> result = null;
		try {
			result = tthcThanhPhanHoSoFinder.findByThutucHanhChinhIdAndLoaiThanhPhan(thuTucHanhChinhId, loaiThanhPhan);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public TthcThanhPhanHoSo findByThuTucHanhChinhIdMauDonOnline(long thuTucHanhChinhId) throws SystemException {
		return tthcThanhPhanHoSoPersistence.fetchByThuTucHanhChinhIdMauDonOnline(thuTucHanhChinhId);
	}
	public TthcThanhPhanHoSo fetchByF_thuTucHanhChinhId_maThanhPhan(long thuTucHanhChinhId, String maThanhPhan) throws SystemException {
		return tthcThanhPhanHoSoPersistence.fetchByF_thuTucHanhChinhId_maThanhPhan(thuTucHanhChinhId, maThanhPhan);
	}
}