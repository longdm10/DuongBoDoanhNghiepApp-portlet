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

package vn.dtt.duongbo.dao.motcua.service.impl;

import java.util.List;

import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.service.base.MotCuaTrangThaiHoSoLocalServiceBaseImpl;

/**
 * The implementation of the mot cua trang thai ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.base.MotCuaTrangThaiHoSoLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil
 */
public class MotCuaTrangThaiHoSoLocalServiceImpl
	extends MotCuaTrangThaiHoSoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil} to access the mot cua trang thai ho so local service.
	 */
	public MotCuaTrangThaiHoSo findMotCuaTrangThaiHoSoById(long motCuaTrangThaiHoSoId) {
		return motCuaTrangThaiHoSoFinder.findMotCuaTrangThaiHoSoById(motCuaTrangThaiHoSoId);
	}
	public List<MotCuaTrangThaiHoSo> findTrangThaiHoSoInListId(String idStr) {
		return motCuaTrangThaiHoSoFinder.findTrangThaiHoSoInListId(idStr);
	}
	
	public MotCuaTrangThaiHoSo fetchByMaTrangThai(String maTrangThai) {
		try {
			return motCuaTrangThaiHoSoPersistence.fetchByMaTrangThai(maTrangThai);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndSoThuTu(long quyTrinhThuTucId, int soThuTu) {
		try {
			return motCuaTrangThaiHoSoPersistence.findByQuyTrinhThuTucIdAndSoThuTu(quyTrinhThuTucId, soThuTu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}