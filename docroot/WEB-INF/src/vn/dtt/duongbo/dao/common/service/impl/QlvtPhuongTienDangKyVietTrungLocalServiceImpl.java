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

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung;
import vn.dtt.duongbo.dao.common.service.base.QlvtPhuongTienDangKyVietTrungLocalServiceBaseImpl;

/**
 * The implementation of the qlvt phuong tien dang ky viet trung local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.QlvtPhuongTienDangKyVietTrungLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalServiceUtil
 */
public class QlvtPhuongTienDangKyVietTrungLocalServiceImpl
	extends QlvtPhuongTienDangKyVietTrungLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalServiceUtil} to access the qlvt phuong tien dang ky viet trung local service.
	 */
	
	public List<QlvtPhuongTienDangKyVietTrung> findByNoiDungHoSoId(long noiDungHoSoId) {
		try {
			return qlvtPhuongTienDangKyVietTrungPersistence.findByNoiDungHoSoId(noiDungHoSoId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Long> findIdByNoiDungHoSoId(long noiDungHoSoId) {
		try {
			return qlvtPhuongTienDangKyVietTrungFinder.findIdNoiDungHoSoId(noiDungHoSoId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean deleteAllByNoiDungHoSoId(long noiDungHoSoId) throws SystemException {
		return qlvtPhuongTienDangKyVietTrungFinder.deleteAllByNoiDungHoSoId(noiDungHoSoId);
	}
}