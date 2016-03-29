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

import vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.duongbo.dao.motcua.service.base.MotCuaDienBienHoSoLocalServiceBaseImpl;

/**
 * The implementation of the mot cua dien bien ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.motcua.service.MotCuaDienBienHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.base.MotCuaDienBienHoSoLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil
 */
public class MotCuaDienBienHoSoLocalServiceImpl
	extends MotCuaDienBienHoSoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil} to access the mot cua dien bien ho so local service.
	 */
	public List<MotCuaDienBienHoSo> findMotCuaDienBienHoSo(long phieuxulyid) {
		return motCuaDienBienHoSoFinder.findMotCuaDienBienHoSo(phieuxulyid);
	}
	public MotCuaDienBienHoSo findByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(long hoSoThuTucId,long trangThaiTruocId,long trangThaiSauId) {
		try {
			return motCuaDienBienHoSoPersistence.findByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(hoSoThuTucId, trangThaiTruocId, trangThaiSauId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}