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

import vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException;
import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn;
import vn.dtt.duongbo.dao.common.service.base.QlvtLoaiHinhHoatDongDnLocalServiceBaseImpl;

/**
 * The implementation of the qlvt loai hinh hoat dong dn local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.QlvtLoaiHinhHoatDongDnLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalServiceUtil
 */
public class QlvtLoaiHinhHoatDongDnLocalServiceImpl
	extends QlvtLoaiHinhHoatDongDnLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalServiceUtil} to access the qlvt loai hinh hoat dong dn local service.
	 */
	
	public QlvtLoaiHinhHoatDongDn getByHoSoThuTucIdAndMaLhhd(long hoSoThuTucId, String maLoaiHinhHoatDong) throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		return qlvtLoaiHinhHoatDongDnPersistence.findByHoSoThuTucIdAndMaLhhd(hoSoThuTucId, maLoaiHinhHoatDong);
	}
	
	public List<QlvtLoaiHinhHoatDongDn> findByNoiDungHoSoId(long noiDungHoSoId) throws NoSuchQlvtLoaiHinhHoatDongDnException, SystemException {
		return qlvtLoaiHinhHoatDongDnPersistence.findByNoiDungHoSoId(noiDungHoSoId);
	}
	
	public List<Long> findIdNoiDungHoSoId(long noiDungHoSoId) throws SystemException {
		return qlvtLoaiHinhHoatDongDnFinder.findIdNoiDungHoSoId(noiDungHoSoId);
	}
	
	public boolean deleteAllByNoiDungHoSoId(long noiDungHoSoId) throws SystemException {
		return qlvtLoaiHinhHoatDongDnFinder.deleteAllByNoiDungHoSoId(noiDungHoSoId);
	}
}