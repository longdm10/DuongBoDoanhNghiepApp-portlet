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
 * The base model interface for the TthcDoiTuongThucHien service. Represents a row in the &quot;tthc_thutuchanhchinh_doituongthuchien&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcDoiTuongThucHien
 * @see vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienImpl
 * @see vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl
 * @generated
 */
public interface TthcDoiTuongThucHienModel extends BaseModel<TthcDoiTuongThucHien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tthc doi tuong thuc hien model instance should use the {@link TthcDoiTuongThucHien} interface instead.
	 */

	/**
	 * Returns the primary key of this tthc doi tuong thuc hien.
	 *
	 * @return the primary key of this tthc doi tuong thuc hien
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tthc doi tuong thuc hien.
	 *
	 * @param primaryKey the primary key of this tthc doi tuong thuc hien
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tthc doi tuong thuc hien.
	 *
	 * @return the ID of this tthc doi tuong thuc hien
	 */
	public long getId();

	/**
	 * Sets the ID of this tthc doi tuong thuc hien.
	 *
	 * @param id the ID of this tthc doi tuong thuc hien
	 */
	public void setId(long id);

	/**
	 * Returns the thu tuc hanh chinh ID of this tthc doi tuong thuc hien.
	 *
	 * @return the thu tuc hanh chinh ID of this tthc doi tuong thuc hien
	 */
	public long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this tthc doi tuong thuc hien.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID of this tthc doi tuong thuc hien
	 */
	public void setThuTucHanhChinhId(long thuTucHanhChinhId);

	/**
	 * Returns the loai doi tuong thuc hien of this tthc doi tuong thuc hien.
	 *
	 * @return the loai doi tuong thuc hien of this tthc doi tuong thuc hien
	 */
	@AutoEscape
	public String getLoaiDoiTuongThucHien();

	/**
	 * Sets the loai doi tuong thuc hien of this tthc doi tuong thuc hien.
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien of this tthc doi tuong thuc hien
	 */
	public void setLoaiDoiTuongThucHien(String loaiDoiTuongThucHien);

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
	public int compareTo(TthcDoiTuongThucHien tthcDoiTuongThucHien);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TthcDoiTuongThucHien> toCacheModel();

	@Override
	public TthcDoiTuongThucHien toEscapedModel();

	@Override
	public TthcDoiTuongThucHien toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}