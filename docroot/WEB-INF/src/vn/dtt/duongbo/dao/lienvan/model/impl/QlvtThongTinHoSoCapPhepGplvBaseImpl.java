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

import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv;
import vn.dtt.duongbo.dao.lienvan.service.QlvtThongTinHoSoCapPhepGplvLocalServiceUtil;

/**
 * The extended model base implementation for the QlvtThongTinHoSoCapPhepGplv service. Represents a row in the &quot;nghiepvu_thongtinhoso_qlvt_capphep_gplienvan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtThongTinHoSoCapPhepGplvImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoCapPhepGplvImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv
 * @generated
 */
public abstract class QlvtThongTinHoSoCapPhepGplvBaseImpl
	extends QlvtThongTinHoSoCapPhepGplvModelImpl
	implements QlvtThongTinHoSoCapPhepGplv {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt thong tin ho so cap phep gplv model instance should use the {@link QlvtThongTinHoSoCapPhepGplv} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtThongTinHoSoCapPhepGplvLocalServiceUtil.addQlvtThongTinHoSoCapPhepGplv(this);
		}
		else {
			QlvtThongTinHoSoCapPhepGplvLocalServiceUtil.updateQlvtThongTinHoSoCapPhepGplv(this);
		}
	}
}