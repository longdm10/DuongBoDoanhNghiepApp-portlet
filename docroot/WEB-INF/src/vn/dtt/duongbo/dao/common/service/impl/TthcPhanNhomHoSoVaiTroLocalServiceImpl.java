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

import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro;
import vn.dtt.duongbo.dao.common.service.base.TthcPhanNhomHoSoVaiTroLocalServiceBaseImpl;

/**
 * The implementation of the tthc phan nhom ho so vai tro local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoVaiTroLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.TthcPhanNhomHoSoVaiTroLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil
 */
public class TthcPhanNhomHoSoVaiTroLocalServiceImpl extends TthcPhanNhomHoSoVaiTroLocalServiceBaseImpl {
	public TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoIdAndVaiTroXuLy(long phanNhomHoSoId, long vaiTroXuLy){
		try {
			return tthcPhanNhomHoSoVaiTroPersistence.findByPhanNhomHoSoIdAndVaiTroXuLy(phanNhomHoSoId, vaiTroXuLy);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(long phanNhomHoSoId){
		try {
			return tthcPhanNhomHoSoVaiTroPersistence.findByPhanNhomHoSoId(phanNhomHoSoId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<TthcPhanNhomHoSoVaiTro>();
	}
}