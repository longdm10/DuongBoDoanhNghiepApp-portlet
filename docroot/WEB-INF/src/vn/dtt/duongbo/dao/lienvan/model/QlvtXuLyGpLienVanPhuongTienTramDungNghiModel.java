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

/**
 * The base model interface for the QlvtXuLyGpLienVanPhuongTienTramDungNghi service. Represents a row in the &quot;qlvt_xuly_gplienvan_phuongtien_tramdungnghi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghi
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl
 * @generated
 */
public interface QlvtXuLyGpLienVanPhuongTienTramDungNghiModel extends BaseModel<QlvtXuLyGpLienVanPhuongTienTramDungNghi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt xu ly gp lien van phuong tien tram dung nghi model instance should use the {@link QlvtXuLyGpLienVanPhuongTienTramDungNghi} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	 *
	 * @return the primary key of this qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	 *
	 * @param primaryKey the primary key of this qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	 *
	 * @return the ID of this qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	 *
	 * @param id the ID of this qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	public void setId(long id);

	/**
	 * Returns the cap gplx phuong tien ID of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	 *
	 * @return the cap gplx phuong tien ID of this qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	public long getCapGplxPhuongTienId();

	/**
	 * Sets the cap gplx phuong tien ID of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID of this qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	public void setCapGplxPhuongTienId(long capGplxPhuongTienId);

	/**
	 * Returns the ma tram dung nghi of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	 *
	 * @return the ma tram dung nghi of this qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	@AutoEscape
	public String getMaTramDungNghi();

	/**
	 * Sets the ma tram dung nghi of this qlvt xu ly gp lien van phuong tien tram dung nghi.
	 *
	 * @param maTramDungNghi the ma tram dung nghi of this qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	public void setMaTramDungNghi(String maTramDungNghi);

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
	public int compareTo(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtXuLyGpLienVanPhuongTienTramDungNghi> toCacheModel();

	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi toEscapedModel();

	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}