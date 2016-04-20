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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the QlvtThongTinHoSoCapPhepGplv service. Represents a row in the &quot;nghiepvu_thongtinhoso_qlvt_capphep_gplienvan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoCapPhepGplv
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl
 * @generated
 */
public interface QlvtThongTinHoSoCapPhepGplvModel extends BaseModel<QlvtThongTinHoSoCapPhepGplv> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt thong tin ho so cap phep gplv model instance should use the {@link QlvtThongTinHoSoCapPhepGplv} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt thong tin ho so cap phep gplv.
	 *
	 * @return the primary key of this qlvt thong tin ho so cap phep gplv
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt thong tin ho so cap phep gplv.
	 *
	 * @param primaryKey the primary key of this qlvt thong tin ho so cap phep gplv
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt thong tin ho so cap phep gplv.
	 *
	 * @return the ID of this qlvt thong tin ho so cap phep gplv
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt thong tin ho so cap phep gplv.
	 *
	 * @param id the ID of this qlvt thong tin ho so cap phep gplv
	 */
	public void setId(long id);

	/**
	 * Returns the thongtinhoso ID of this qlvt thong tin ho so cap phep gplv.
	 *
	 * @return the thongtinhoso ID of this qlvt thong tin ho so cap phep gplv
	 */
	public long getThongtinhosoId();

	/**
	 * Sets the thongtinhoso ID of this qlvt thong tin ho so cap phep gplv.
	 *
	 * @param thongtinhosoId the thongtinhoso ID of this qlvt thong tin ho so cap phep gplv
	 */
	public void setThongtinhosoId(long thongtinhosoId);

	/**
	 * Returns the capphep gplienvan ID of this qlvt thong tin ho so cap phep gplv.
	 *
	 * @return the capphep gplienvan ID of this qlvt thong tin ho so cap phep gplv
	 */
	public long getCapphepGplienvanId();

	/**
	 * Sets the capphep gplienvan ID of this qlvt thong tin ho so cap phep gplv.
	 *
	 * @param capphepGplienvanId the capphep gplienvan ID of this qlvt thong tin ho so cap phep gplv
	 */
	public void setCapphepGplienvanId(long capphepGplienvanId);

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
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtThongTinHoSoCapPhepGplv> toCacheModel();

	@Override
	public QlvtThongTinHoSoCapPhepGplv toEscapedModel();

	@Override
	public QlvtThongTinHoSoCapPhepGplv toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}