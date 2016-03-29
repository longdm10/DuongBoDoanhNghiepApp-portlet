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

package vn.dtt.duongbo.dao.doanhnghiep.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;
import vn.dtt.duongbo.dao.doanhnghiep.service.base.DnDoanhNghiepUserLocalServiceBaseImpl;

/**
 * The implementation of the dn doanh nghiep user local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.doanhnghiep.service.base.DnDoanhNghiepUserLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil
 */
public class DnDoanhNghiepUserLocalServiceImpl
	extends DnDoanhNghiepUserLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil} to access the dn doanh nghiep user local service.
	 */
	public DnDoanhNghiepUser findByUserId(long userId) {
		try {
			return dnDoanhNghiepUserPersistence.fetchByUserId(userId);
		} catch (SystemException e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<DnDoanhNghiepUser> findByDnNguoiLamThuTucUserID(long nguoiLamThuTucId) {
		try {
			return dnDoanhNghiepUserPersistence.findByDnNguoiLamThuTucUserID(nguoiLamThuTucId);
		} catch (SystemException e) {
			_log.error(e);
		}
		return null;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DnDoanhNghiepUserLocalServiceImpl.class);
}