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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien;
import vn.dtt.duongbo.dao.common.service.base.TthcDoiTuongThucHienLocalServiceBaseImpl;

/**
 * The implementation of the tthc doi tuong thuc hien local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.TthcDoiTuongThucHienLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.TthcDoiTuongThucHienLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.TthcDoiTuongThucHienLocalServiceUtil
 */
public class TthcDoiTuongThucHienLocalServiceImpl
	extends TthcDoiTuongThucHienLocalServiceBaseImpl {
	
	public List<TthcDoiTuongThucHien> getByLoaiDoiTuongThucHien(String loaiDoiTuongThucHien) {
		List<TthcDoiTuongThucHien> list = new ArrayList<TthcDoiTuongThucHien>();
		
		try {
			list = tthcDoiTuongThucHienPersistence.findByLoaiDoiTuongThucHien(loaiDoiTuongThucHien);
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return list;
	}
	
	public List<Long> getTTHCIdByLoaiDoiTuongThucHien(String loaiDoiTuongThucHien) {
		List<Long> tthcIds = new ArrayList<Long>();
		
		try {
			List<TthcDoiTuongThucHien> list = tthcDoiTuongThucHienPersistence.findByLoaiDoiTuongThucHien(loaiDoiTuongThucHien);
			
			for(TthcDoiTuongThucHien tthcDoiTuongThucHien : list) {
				tthcIds.add(tthcDoiTuongThucHien.getThuTucHanhChinhId());
			}
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return tthcIds;
	}
	
	private static Log _log = LogFactoryUtil.getLog(TthcDoiTuongThucHienLocalServiceImpl.class);
}