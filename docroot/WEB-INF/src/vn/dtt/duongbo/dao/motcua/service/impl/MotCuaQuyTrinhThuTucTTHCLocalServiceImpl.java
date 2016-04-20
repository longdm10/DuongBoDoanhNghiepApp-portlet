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

import java.util.ArrayList;
import java.util.List;

import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC;
import vn.dtt.duongbo.dao.motcua.service.base.MotCuaQuyTrinhThuTucTTHCLocalServiceBaseImpl;

/**
 * The implementation of the mot cua quy trinh thu tuc t t h c local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.base.MotCuaQuyTrinhThuTucTTHCLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalServiceUtil
 */
public class MotCuaQuyTrinhThuTucTTHCLocalServiceImpl
	extends MotCuaQuyTrinhThuTucTTHCLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalServiceUtil} to access the mot cua quy trinh thu tuc t t h c local service.
	 */
	public List<MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(long thuTucHanhChinhID) {
		try {
			return motCuaQuyTrinhThuTucTTHCPersistence.findByThuTucHanhChinhID(thuTucHanhChinhID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList<MotCuaQuyTrinhThuTucTTHC>();
	}
	public List<MotCuaQuyTrinhThuTucTTHC> findByQuyTrinhThuTucId(long quyTrinhThuTucId) {
		try {
			return motCuaQuyTrinhThuTucTTHCPersistence.findByquyTrinhThuTucId(quyTrinhThuTucId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList<MotCuaQuyTrinhThuTucTTHC>();
	}
	public MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndToChucXuLy(long thuTucHanhChinhID, long toChucXuLy) {
		try {
			return motCuaQuyTrinhThuTucTTHCPersistence.findByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID, toChucXuLy);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}