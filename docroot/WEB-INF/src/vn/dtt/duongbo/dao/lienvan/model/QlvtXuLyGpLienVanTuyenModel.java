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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the QlvtXuLyGpLienVanTuyen service. Represents a row in the &quot;qlvt_xuly_gplienvan_phuongtien_tuyen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanTuyen
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl
 * @generated
 */
public interface QlvtXuLyGpLienVanTuyenModel extends BaseModel<QlvtXuLyGpLienVanTuyen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt xu ly gp lien van tuyen model instance should use the {@link QlvtXuLyGpLienVanTuyen} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt xu ly gp lien van tuyen.
	 *
	 * @return the primary key of this qlvt xu ly gp lien van tuyen
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt xu ly gp lien van tuyen.
	 *
	 * @param primaryKey the primary key of this qlvt xu ly gp lien van tuyen
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt xu ly gp lien van tuyen.
	 *
	 * @return the ID of this qlvt xu ly gp lien van tuyen
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt xu ly gp lien van tuyen.
	 *
	 * @param id the ID of this qlvt xu ly gp lien van tuyen
	 */
	public void setId(long id);

	/**
	 * Returns the gp lien van phuong tien ID of this qlvt xu ly gp lien van tuyen.
	 *
	 * @return the gp lien van phuong tien ID of this qlvt xu ly gp lien van tuyen
	 */
	public long getGpLienVanPhuongTienId();

	/**
	 * Sets the gp lien van phuong tien ID of this qlvt xu ly gp lien van tuyen.
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID of this qlvt xu ly gp lien van tuyen
	 */
	public void setGpLienVanPhuongTienId(long gpLienVanPhuongTienId);

	/**
	 * Returns the ma tuyen of this qlvt xu ly gp lien van tuyen.
	 *
	 * @return the ma tuyen of this qlvt xu ly gp lien van tuyen
	 */
	@AutoEscape
	public String getMaTuyen();

	/**
	 * Sets the ma tuyen of this qlvt xu ly gp lien van tuyen.
	 *
	 * @param maTuyen the ma tuyen of this qlvt xu ly gp lien van tuyen
	 */
	public void setMaTuyen(String maTuyen);

	/**
	 * Returns the ten tuyen of this qlvt xu ly gp lien van tuyen.
	 *
	 * @return the ten tuyen of this qlvt xu ly gp lien van tuyen
	 */
	@AutoEscape
	public String getTenTuyen();

	/**
	 * Sets the ten tuyen of this qlvt xu ly gp lien van tuyen.
	 *
	 * @param tenTuyen the ten tuyen of this qlvt xu ly gp lien van tuyen
	 */
	public void setTenTuyen(String tenTuyen);

	/**
	 * Returns the tu ngay of this qlvt xu ly gp lien van tuyen.
	 *
	 * @return the tu ngay of this qlvt xu ly gp lien van tuyen
	 */
	public Date getTuNgay();

	/**
	 * Sets the tu ngay of this qlvt xu ly gp lien van tuyen.
	 *
	 * @param tuNgay the tu ngay of this qlvt xu ly gp lien van tuyen
	 */
	public void setTuNgay(Date tuNgay);

	/**
	 * Returns the den ngay of this qlvt xu ly gp lien van tuyen.
	 *
	 * @return the den ngay of this qlvt xu ly gp lien van tuyen
	 */
	public Date getDenNgay();

	/**
	 * Sets the den ngay of this qlvt xu ly gp lien van tuyen.
	 *
	 * @param denNgay the den ngay of this qlvt xu ly gp lien van tuyen
	 */
	public void setDenNgay(Date denNgay);

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
	public int compareTo(QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtXuLyGpLienVanTuyen> toCacheModel();

	@Override
	public QlvtXuLyGpLienVanTuyen toEscapedModel();

	@Override
	public QlvtXuLyGpLienVanTuyen toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}