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

package vn.dtt.duongbo.dao.nghiepvu.service.impl;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra;
import vn.dtt.duongbo.dao.nghiepvu.service.base.QlvtTTHCKetQuaThamTraLocalServiceBaseImpl;

/**
 * The implementation of the qlvt t t h c ket qua tham tra local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCKetQuaThamTraLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.base.QlvtTTHCKetQuaThamTraLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCKetQuaThamTraLocalServiceUtil
 */
public class QlvtTTHCKetQuaThamTraLocalServiceImpl
	extends QlvtTTHCKetQuaThamTraLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCKetQuaThamTraLocalServiceUtil} to access the qlvt t t h c ket qua tham tra local service.
	 */
	public List<QlvtTTHCKetQuaThamTra> findByToChucIdAndMaTthc(String maTthc, int buocXuLy, int toChucId) {
		try {
			return qlvtTTHCKetQuaThamTraPersistence.findByToChucIdAndMaTthc(maTthc, buocXuLy, toChucId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ArrayList<QlvtTTHCKetQuaThamTra>();
	}
	
}