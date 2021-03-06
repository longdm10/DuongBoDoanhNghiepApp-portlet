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
 * The base model interface for the QlvtCapPhepGplvLoaiHinhVanTai service. Represents a row in the &quot;qlvt_capphep_gplienvan_loaihinhvantai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvLoaiHinhVanTaiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvLoaiHinhVanTaiImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvLoaiHinhVanTai
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvLoaiHinhVanTaiImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvLoaiHinhVanTaiModelImpl
 * @generated
 */
public interface QlvtCapPhepGplvLoaiHinhVanTaiModel extends BaseModel<QlvtCapPhepGplvLoaiHinhVanTai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt cap phep gplv loai hinh van tai model instance should use the {@link QlvtCapPhepGplvLoaiHinhVanTai} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt cap phep gplv loai hinh van tai.
	 *
	 * @return the primary key of this qlvt cap phep gplv loai hinh van tai
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt cap phep gplv loai hinh van tai.
	 *
	 * @param primaryKey the primary key of this qlvt cap phep gplv loai hinh van tai
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt cap phep gplv loai hinh van tai.
	 *
	 * @return the ID of this qlvt cap phep gplv loai hinh van tai
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt cap phep gplv loai hinh van tai.
	 *
	 * @param id the ID of this qlvt cap phep gplv loai hinh van tai
	 */
	public void setId(long id);

	/**
	 * Returns the gp lien van ID of this qlvt cap phep gplv loai hinh van tai.
	 *
	 * @return the gp lien van ID of this qlvt cap phep gplv loai hinh van tai
	 */
	public long getGpLienVanId();

	/**
	 * Sets the gp lien van ID of this qlvt cap phep gplv loai hinh van tai.
	 *
	 * @param gpLienVanId the gp lien van ID of this qlvt cap phep gplv loai hinh van tai
	 */
	public void setGpLienVanId(long gpLienVanId);

	/**
	 * Returns the ma loai hinh van tai of this qlvt cap phep gplv loai hinh van tai.
	 *
	 * @return the ma loai hinh van tai of this qlvt cap phep gplv loai hinh van tai
	 */
	@AutoEscape
	public String getMaLoaiHinhVanTai();

	/**
	 * Sets the ma loai hinh van tai of this qlvt cap phep gplv loai hinh van tai.
	 *
	 * @param maLoaiHinhVanTai the ma loai hinh van tai of this qlvt cap phep gplv loai hinh van tai
	 */
	public void setMaLoaiHinhVanTai(String maLoaiHinhVanTai);

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
		QlvtCapPhepGplvLoaiHinhVanTai qlvtCapPhepGplvLoaiHinhVanTai);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtCapPhepGplvLoaiHinhVanTai> toCacheModel();

	@Override
	public QlvtCapPhepGplvLoaiHinhVanTai toEscapedModel();

	@Override
	public QlvtCapPhepGplvLoaiHinhVanTai toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}