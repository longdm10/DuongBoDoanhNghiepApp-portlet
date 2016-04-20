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

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai;
import vn.dtt.duongbo.dao.lienvan.service.base.QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceBaseImpl;

/**
 * The implementation of the qlvt xu ly gp lien van loai hinh van tai local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.lienvan.service.base.QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceUtil
 */
public class QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceImpl
	extends QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceUtil} to access the qlvt xu ly gp lien van loai hinh van tai local service.
	 */
	public List<QlvtXuLyGpLienVanLoaiHinhVanTai> findBygpLienVanId(int gpLienVanId) throws SystemException {
		return qlvtXuLyGpLienVanLoaiHinhVanTaiPersistence.findBygpLienVanId(gpLienVanId);
	}
	
	public List<QlvtXuLyGpLienVanLoaiHinhVanTai> findBygpLienVanId(long gpLienVanId) throws SystemException {
		return qlvtXuLyGpLienVanLoaiHinhVanTaiPersistence.findBygpLienVanId(gpLienVanId);
	}
}