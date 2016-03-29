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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalServiceUtil;

/**
 * The extended model base implementation for the QlvtPhuongTienDangKyVietTrung service. Represents a row in the &quot;qlvt_phuongtiendangky_vt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtPhuongTienDangKyVietTrungImpl}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietTrungImpl
 * @see vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung
 * @generated
 */
public abstract class QlvtPhuongTienDangKyVietTrungBaseImpl
	extends QlvtPhuongTienDangKyVietTrungModelImpl
	implements QlvtPhuongTienDangKyVietTrung {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt phuong tien dang ky viet trung model instance should use the {@link QlvtPhuongTienDangKyVietTrung} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtPhuongTienDangKyVietTrungLocalServiceUtil.addQlvtPhuongTienDangKyVietTrung(this);
		}
		else {
			QlvtPhuongTienDangKyVietTrungLocalServiceUtil.updateQlvtPhuongTienDangKyVietTrung(this);
		}
	}
}