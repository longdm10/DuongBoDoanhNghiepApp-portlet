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

package vn.dtt.duongbo.dao.nghiepvu.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the QlvtThongTinHoSoLienVan service. Represents a row in the &quot;nghiepvu_thongtinhoso_qlvt_capphep_gplienvan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoLienVan
 * @see vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanImpl
 * @see vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanModelImpl
 * @generated
 */
public interface QlvtThongTinHoSoLienVanModel extends BaseModel<QlvtThongTinHoSoLienVan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt thong tin ho so lien van model instance should use the {@link QlvtThongTinHoSoLienVan} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt thong tin ho so lien van.
	 *
	 * @return the primary key of this qlvt thong tin ho so lien van
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt thong tin ho so lien van.
	 *
	 * @param primaryKey the primary key of this qlvt thong tin ho so lien van
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt thong tin ho so lien van.
	 *
	 * @return the ID of this qlvt thong tin ho so lien van
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt thong tin ho so lien van.
	 *
	 * @param id the ID of this qlvt thong tin ho so lien van
	 */
	public void setId(long id);

	/**
	 * Returns the thongtin ho so ID of this qlvt thong tin ho so lien van.
	 *
	 * @return the thongtin ho so ID of this qlvt thong tin ho so lien van
	 */
	public long getThongtinHoSoId();

	/**
	 * Sets the thongtin ho so ID of this qlvt thong tin ho so lien van.
	 *
	 * @param thongtinHoSoId the thongtin ho so ID of this qlvt thong tin ho so lien van
	 */
	public void setThongtinHoSoId(long thongtinHoSoId);

	/**
	 * Returns the gplienvan i d of this qlvt thong tin ho so lien van.
	 *
	 * @return the gplienvan i d of this qlvt thong tin ho so lien van
	 */
	public long getGplienvanID();

	/**
	 * Sets the gplienvan i d of this qlvt thong tin ho so lien van.
	 *
	 * @param gplienvanID the gplienvan i d of this qlvt thong tin ho so lien van
	 */
	public void setGplienvanID(long gplienvanID);

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
	public int compareTo(QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtThongTinHoSoLienVan> toCacheModel();

	@Override
	public QlvtThongTinHoSoLienVan toEscapedModel();

	@Override
	public QlvtThongTinHoSoLienVan toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}