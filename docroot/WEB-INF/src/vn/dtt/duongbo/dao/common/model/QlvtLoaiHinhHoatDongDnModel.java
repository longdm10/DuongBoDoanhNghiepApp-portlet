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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the QlvtLoaiHinhHoatDongDn service. Represents a row in the &quot;qlvt_loaihinhhoatdong&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnImpl}.
 * </p>
 *
 * @author win_64
 * @see QlvtLoaiHinhHoatDongDn
 * @see vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnImpl
 * @see vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl
 * @generated
 */
public interface QlvtLoaiHinhHoatDongDnModel extends BaseModel<QlvtLoaiHinhHoatDongDn> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt loai hinh hoat dong dn model instance should use the {@link QlvtLoaiHinhHoatDongDn} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt loai hinh hoat dong dn.
	 *
	 * @return the primary key of this qlvt loai hinh hoat dong dn
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt loai hinh hoat dong dn.
	 *
	 * @param primaryKey the primary key of this qlvt loai hinh hoat dong dn
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt loai hinh hoat dong dn.
	 *
	 * @return the ID of this qlvt loai hinh hoat dong dn
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt loai hinh hoat dong dn.
	 *
	 * @param id the ID of this qlvt loai hinh hoat dong dn
	 */
	public void setId(long id);

	/**
	 * Returns the ho so thu tuc ID of this qlvt loai hinh hoat dong dn.
	 *
	 * @return the ho so thu tuc ID of this qlvt loai hinh hoat dong dn
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this qlvt loai hinh hoat dong dn.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID of this qlvt loai hinh hoat dong dn
	 */
	public void setHoSoThuTucId(long hoSoThuTucId);

	/**
	 * Returns the noi dung ho so ID of this qlvt loai hinh hoat dong dn.
	 *
	 * @return the noi dung ho so ID of this qlvt loai hinh hoat dong dn
	 */
	public long getNoiDungHoSoId();

	/**
	 * Sets the noi dung ho so ID of this qlvt loai hinh hoat dong dn.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID of this qlvt loai hinh hoat dong dn
	 */
	public void setNoiDungHoSoId(long noiDungHoSoId);

	/**
	 * Returns the ma loai hinh hoat dong of this qlvt loai hinh hoat dong dn.
	 *
	 * @return the ma loai hinh hoat dong of this qlvt loai hinh hoat dong dn
	 */
	@AutoEscape
	public String getMaLoaiHinhHoatDong();

	/**
	 * Sets the ma loai hinh hoat dong of this qlvt loai hinh hoat dong dn.
	 *
	 * @param maLoaiHinhHoatDong the ma loai hinh hoat dong of this qlvt loai hinh hoat dong dn
	 */
	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong);

	/**
	 * Returns the ma mau son of this qlvt loai hinh hoat dong dn.
	 *
	 * @return the ma mau son of this qlvt loai hinh hoat dong dn
	 */
	@AutoEscape
	public String getMaMauSon();

	/**
	 * Sets the ma mau son of this qlvt loai hinh hoat dong dn.
	 *
	 * @param maMauSon the ma mau son of this qlvt loai hinh hoat dong dn
	 */
	public void setMaMauSon(String maMauSon);

	/**
	 * Returns the ma pham vi hoat dong of this qlvt loai hinh hoat dong dn.
	 *
	 * @return the ma pham vi hoat dong of this qlvt loai hinh hoat dong dn
	 */
	@AutoEscape
	public String getMaPhamViHoatDong();

	/**
	 * Sets the ma pham vi hoat dong of this qlvt loai hinh hoat dong dn.
	 *
	 * @param maPhamViHoatDong the ma pham vi hoat dong of this qlvt loai hinh hoat dong dn
	 */
	public void setMaPhamViHoatDong(String maPhamViHoatDong);

	/**
	 * Returns the so luong phuong tien of this qlvt loai hinh hoat dong dn.
	 *
	 * @return the so luong phuong tien of this qlvt loai hinh hoat dong dn
	 */
	@AutoEscape
	public String getSoLuongPhuongTien();

	/**
	 * Sets the so luong phuong tien of this qlvt loai hinh hoat dong dn.
	 *
	 * @param soLuongPhuongTien the so luong phuong tien of this qlvt loai hinh hoat dong dn
	 */
	public void setSoLuongPhuongTien(String soLuongPhuongTien);

	/**
	 * Returns the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong dn.
	 *
	 * @return the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong dn
	 */
	@AutoEscape
	public String getThietBiGiamSatHanhTrinh();

	/**
	 * Sets the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong dn.
	 *
	 * @param thietBiGiamSatHanhTrinh the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong dn
	 */
	public void setThietBiGiamSatHanhTrinh(String thietBiGiamSatHanhTrinh);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtLoaiHinhHoatDongDn> toCacheModel();

	@Override
	public QlvtLoaiHinhHoatDongDn toEscapedModel();

	@Override
	public QlvtLoaiHinhHoatDongDn toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}