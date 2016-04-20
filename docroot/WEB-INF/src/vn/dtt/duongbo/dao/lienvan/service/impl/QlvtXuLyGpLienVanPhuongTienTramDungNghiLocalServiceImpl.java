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

package vn.dtt.duongbo.dao.lienvan.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;
import vn.dtt.duongbo.dao.lienvan.service.base.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceBaseImpl;

/**
 * The implementation of the qlvt xu ly gp lien van phuong tien tram dung nghi local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.base.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil
 */
public class QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceImpl
	extends QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil} to access the qlvt xu ly gp lien van phuong tien tram dung nghi local service.
	 */
	public List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findBycapGplxPhuongTienId(int capGplxPhuongTienId) throws SystemException {
		return qlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence.findByCapGplxPhuongTienId(capGplxPhuongTienId);
	}
	
	public List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findBycapGplxPhuongTienId(long capGplxPhuongTienId) throws SystemException {
		return qlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence.findByCapGplxPhuongTienId(capGplxPhuongTienId);
	}

	
}