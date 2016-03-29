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

import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.duongbo.dao.common.service.base.TthcThuTucHanhChinhLocalServiceBaseImpl;

/**
 * The implementation of the tthc thu tuc hanh chinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.TthcThuTucHanhChinhLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil
 */
public class TthcThuTucHanhChinhLocalServiceImpl
	extends TthcThuTucHanhChinhLocalServiceBaseImpl {
	
	public List<TthcThuTucHanhChinh> findByLinhVucThuTuc(String linhVucThuTuc) {
		List<TthcThuTucHanhChinh> result = null;
		try {
			result = tthcThuTucHanhChinhPersistence.findByLinhVucThuTuc(linhVucThuTuc);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public TthcThuTucHanhChinh findByMaThuTuc(String maThuTuc) {
		try {
			return tthcThuTucHanhChinhPersistence.findByMaThuTuc(maThuTuc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}