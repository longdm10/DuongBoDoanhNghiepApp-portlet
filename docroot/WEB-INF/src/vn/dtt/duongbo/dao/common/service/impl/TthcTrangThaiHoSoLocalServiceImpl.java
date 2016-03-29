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

import vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo;
import vn.dtt.duongbo.dao.common.service.base.TthcTrangThaiHoSoLocalServiceBaseImpl;

/**
 * The implementation of the tthc trang thai ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.TthcTrangThaiHoSoLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalServiceUtil
 */
public class TthcTrangThaiHoSoLocalServiceImpl
	extends TthcTrangThaiHoSoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalServiceUtil} to access the tthc trang thai ho so local service.
	 */
	
	public TthcTrangThaiHoSo findMotCuaTrangThaiHoSoById(long motCuaTrangThaiHoSoId) {
		return tthcTrangThaiHoSoFinder.findMotCuaTrangThaiHoSoById(motCuaTrangThaiHoSoId);
	}
	public List<TthcTrangThaiHoSo> findTrangThaiHoSoInListId(String idStr) {
		return tthcTrangThaiHoSoFinder.findTrangThaiHoSoInListId(idStr);
	}
	
	public TthcTrangThaiHoSo fetchByMaTrangThai(String maTrangThai) {
		try {
			return tthcTrangThaiHoSoPersistence.fetchByMaTrangThai(maTrangThai);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}