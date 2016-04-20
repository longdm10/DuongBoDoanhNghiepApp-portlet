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

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil;

/**
 * The extended model base implementation for the QlvtXuLyGpLienVanPhuongTienTramDungNghi service. Represents a row in the &quot;qlvt_xuly_gplienvan_phuongtien_tramdungnghi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi
 * @generated
 */
public abstract class QlvtXuLyGpLienVanPhuongTienTramDungNghiBaseImpl
	extends QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl
	implements QlvtXuLyGpLienVanPhuongTienTramDungNghi {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt xu ly gp lien van phuong tien tram dung nghi model instance should use the {@link QlvtXuLyGpLienVanPhuongTienTramDungNghi} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.addQlvtXuLyGpLienVanPhuongTienTramDungNghi(this);
		}
		else {
			QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(this);
		}
	}
}