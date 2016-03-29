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
 * The base model interface for the QlvtPhuongTienCapPhuHieu service. Represents a row in the &quot;qlvt_phuongtiencapphuhieu&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuImpl}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienCapPhuHieu
 * @see vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuImpl
 * @see vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl
 * @generated
 */
public interface QlvtPhuongTienCapPhuHieuModel extends BaseModel<QlvtPhuongTienCapPhuHieu> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt phuong tien cap phu hieu model instance should use the {@link QlvtPhuongTienCapPhuHieu} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the primary key of this qlvt phuong tien cap phu hieu
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt phuong tien cap phu hieu.
	 *
	 * @param primaryKey the primary key of this qlvt phuong tien cap phu hieu
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the ID of this qlvt phuong tien cap phu hieu
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt phuong tien cap phu hieu.
	 *
	 * @param id the ID of this qlvt phuong tien cap phu hieu
	 */
	public void setId(long id);

	/**
	 * Returns the nhan hieu of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the nhan hieu of this qlvt phuong tien cap phu hieu
	 */
	@AutoEscape
	public String getNhanHieu();

	/**
	 * Sets the nhan hieu of this qlvt phuong tien cap phu hieu.
	 *
	 * @param NhanHieu the nhan hieu of this qlvt phuong tien cap phu hieu
	 */
	public void setNhanHieu(String NhanHieu);

	/**
	 * Returns the bien so of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the bien so of this qlvt phuong tien cap phu hieu
	 */
	@AutoEscape
	public String getBienSo();

	/**
	 * Sets the bien so of this qlvt phuong tien cap phu hieu.
	 *
	 * @param BienSo the bien so of this qlvt phuong tien cap phu hieu
	 */
	public void setBienSo(String BienSo);

	/**
	 * Returns the trong tai of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the trong tai of this qlvt phuong tien cap phu hieu
	 */
	public long getTrongTai();

	/**
	 * Sets the trong tai of this qlvt phuong tien cap phu hieu.
	 *
	 * @param TrongTai the trong tai of this qlvt phuong tien cap phu hieu
	 */
	public void setTrongTai(long TrongTai);

	/**
	 * Returns the nuoc san xuat of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the nuoc san xuat of this qlvt phuong tien cap phu hieu
	 */
	@AutoEscape
	public String getNuocSanXuat();

	/**
	 * Sets the nuoc san xuat of this qlvt phuong tien cap phu hieu.
	 *
	 * @param NuocSanXuat the nuoc san xuat of this qlvt phuong tien cap phu hieu
	 */
	public void setNuocSanXuat(String NuocSanXuat);

	/**
	 * Returns the nam san xuat of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the nam san xuat of this qlvt phuong tien cap phu hieu
	 */
	@AutoEscape
	public String getNamSanXuat();

	/**
	 * Sets the nam san xuat of this qlvt phuong tien cap phu hieu.
	 *
	 * @param NamSanXuat the nam san xuat of this qlvt phuong tien cap phu hieu
	 */
	public void setNamSanXuat(String NamSanXuat);

	/**
	 * Returns the tuyen hoat dong of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the tuyen hoat dong of this qlvt phuong tien cap phu hieu
	 */
	@AutoEscape
	public String getTuyenHoatDong();

	/**
	 * Sets the tuyen hoat dong of this qlvt phuong tien cap phu hieu.
	 *
	 * @param TuyenHoatDong the tuyen hoat dong of this qlvt phuong tien cap phu hieu
	 */
	public void setTuyenHoatDong(String TuyenHoatDong);

	/**
	 * Returns the loai hinh hoat dong of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the loai hinh hoat dong of this qlvt phuong tien cap phu hieu
	 */
	@AutoEscape
	public String getLoaiHinhHoatDong();

	/**
	 * Sets the loai hinh hoat dong of this qlvt phuong tien cap phu hieu.
	 *
	 * @param LoaiHinhHoatDong the loai hinh hoat dong of this qlvt phuong tien cap phu hieu
	 */
	public void setLoaiHinhHoatDong(String LoaiHinhHoatDong);

	/**
	 * Returns the noi dung ho so ID of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the noi dung ho so ID of this qlvt phuong tien cap phu hieu
	 */
	public long getNoiDungHoSoId();

	/**
	 * Sets the noi dung ho so ID of this qlvt phuong tien cap phu hieu.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID of this qlvt phuong tien cap phu hieu
	 */
	public void setNoiDungHoSoId(long NoiDungHoSoId);

	/**
	 * Returns the ho so thu tuc ID of this qlvt phuong tien cap phu hieu.
	 *
	 * @return the ho so thu tuc ID of this qlvt phuong tien cap phu hieu
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this qlvt phuong tien cap phu hieu.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID of this qlvt phuong tien cap phu hieu
	 */
	public void setHoSoThuTucId(long HoSoThuTucId);

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
	public int compareTo(QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtPhuongTienCapPhuHieu> toCacheModel();

	@Override
	public QlvtPhuongTienCapPhuHieu toEscapedModel();

	@Override
	public QlvtPhuongTienCapPhuHieu toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}