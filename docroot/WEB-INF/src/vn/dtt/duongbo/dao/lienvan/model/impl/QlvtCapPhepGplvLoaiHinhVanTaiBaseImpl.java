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

package vn.dtt.duongbo.dao.lienvan.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil;

/**
 * The extended model base implementation for the QlvtCapPhepGplvLoaiHinhVanTai service. Represents a row in the &quot;qlvt_capphep_gplienvan_loaihinhvantai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtCapPhepGplvLoaiHinhVanTaiImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvLoaiHinhVanTaiImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai
 * @generated
 */
public abstract class QlvtCapPhepGplvLoaiHinhVanTaiBaseImpl
	extends QlvtCapPhepGplvLoaiHinhVanTaiModelImpl
	implements QlvtCapPhepGplvLoaiHinhVanTai {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt cap phep gplv loai hinh van tai model instance should use the {@link QlvtCapPhepGplvLoaiHinhVanTai} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil.addQlvtCapPhepGplvLoaiHinhVanTai(this);
		}
		else {
			QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil.updateQlvtCapPhepGplvLoaiHinhVanTai(this);
		}
	}
}