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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo;
import vn.dtt.duongbo.dao.common.service.base.TthcPhanNhomHoSoLocalServiceBaseImpl;

/**
 * The implementation of the tthc phan nhom ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.TthcPhanNhomHoSoLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil
 */
public class TthcPhanNhomHoSoLocalServiceImpl extends TthcPhanNhomHoSoLocalServiceBaseImpl {
	
	public TthcPhanNhomHoSo findByMaPhanNhom(String maPhanNhom) {
		try {
			return tthcPhanNhomHoSoPersistence.findByMaPhanNhom(maPhanNhom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TthcPhanNhomHoSo> findByToChucQuanLyId(long toChucQuanLy) {
		try {
			return tthcPhanNhomHoSoPersistence.findByToChucQuanLyId(toChucQuanLy);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<TthcPhanNhomHoSo>();
	}
	
	public List<TthcPhanNhomHoSo> findTthcPhanNhomHoSoByVaTroXuLy(String vaiTroXuLy, int loaiPhanNhom) {
		try {
			return tthcPhanNhomHoSoFinder.findTthcPhanNhomHoSoByVaTroXuLy(vaiTroXuLy, loaiPhanNhom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<TthcPhanNhomHoSo>();
	}
	
	public List<TthcPhanNhomHoSo> findByDoanhNghiep() {
		return tthcPhanNhomHoSoFinder.findByDoanhNghiep();
	}
	
	public TthcPhanNhomHoSo getByMaPhanNhom(String maPhanNhom) {
		try {
			return tthcPhanNhomHoSoPersistence.findByMaPhanNhom(maPhanNhom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
