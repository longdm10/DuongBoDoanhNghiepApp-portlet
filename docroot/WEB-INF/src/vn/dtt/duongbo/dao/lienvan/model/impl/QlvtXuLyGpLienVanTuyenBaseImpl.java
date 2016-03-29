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

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanTuyenLocalServiceUtil;

/**
 * The extended model base implementation for the QlvtXuLyGpLienVanTuyen service. Represents a row in the &quot;qlvt_xuly_gplienvan_phuongtien_tuyen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtXuLyGpLienVanTuyenImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanTuyenImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen
 * @generated
 */
public abstract class QlvtXuLyGpLienVanTuyenBaseImpl
	extends QlvtXuLyGpLienVanTuyenModelImpl implements QlvtXuLyGpLienVanTuyen {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt xu ly gp lien van tuyen model instance should use the {@link QlvtXuLyGpLienVanTuyen} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpLienVanTuyenLocalServiceUtil.addQlvtXuLyGpLienVanTuyen(this);
		}
		else {
			QlvtXuLyGpLienVanTuyenLocalServiceUtil.updateQlvtXuLyGpLienVanTuyen(this);
		}
	}
}