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

import vn.dtt.duongbo.dao.common.service.base.QlvtDiemDungDangKyVietCamLocalServiceBaseImpl;

/**
 * The implementation of the qlvt diem dung dang ky viet cam local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietCamLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.QlvtDiemDungDangKyVietCamLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietCamLocalServiceUtil
 */
public class QlvtDiemDungDangKyVietCamLocalServiceImpl
	extends QlvtDiemDungDangKyVietCamLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietCamLocalServiceUtil} to access the qlvt diem dung dang ky viet cam local service.
	 */
	

	public List<Long> findIdNoiDungHoSoId(long noiDungHoSoI) {
		try {
			return qlvtDiemDungDangKyVietCamFinder.findIdNoiDungHoSoId(noiDungHoSoI);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}