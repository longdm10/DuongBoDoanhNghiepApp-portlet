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
 * The base model interface for the TthcPhanNhomHoSo service. Represents a row in the &quot;tthc_phannhomhoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSo
 * @see vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoImpl
 * @see vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoModelImpl
 * @generated
 */
public interface TthcPhanNhomHoSoModel extends BaseModel<TthcPhanNhomHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tthc phan nhom ho so model instance should use the {@link TthcPhanNhomHoSo} interface instead.
	 */

	/**
	 * Returns the primary key of this tthc phan nhom ho so.
	 *
	 * @return the primary key of this tthc phan nhom ho so
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tthc phan nhom ho so.
	 *
	 * @param primaryKey the primary key of this tthc phan nhom ho so
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tthc phan nhom ho so.
	 *
	 * @return the ID of this tthc phan nhom ho so
	 */
	public long getId();

	/**
	 * Sets the ID of this tthc phan nhom ho so.
	 *
	 * @param id the ID of this tthc phan nhom ho so
	 */
	public void setId(long id);

	/**
	 * Returns the ma phan nhom of this tthc phan nhom ho so.
	 *
	 * @return the ma phan nhom of this tthc phan nhom ho so
	 */
	@AutoEscape
	public String getMaPhanNhom();

	/**
	 * Sets the ma phan nhom of this tthc phan nhom ho so.
	 *
	 * @param maPhanNhom the ma phan nhom of this tthc phan nhom ho so
	 */
	public void setMaPhanNhom(String maPhanNhom);

	/**
	 * Returns the ten phan nhom of this tthc phan nhom ho so.
	 *
	 * @return the ten phan nhom of this tthc phan nhom ho so
	 */
	@AutoEscape
	public String getTenPhanNhom();

	/**
	 * Sets the ten phan nhom of this tthc phan nhom ho so.
	 *
	 * @param tenPhanNhom the ten phan nhom of this tthc phan nhom ho so
	 */
	public void setTenPhanNhom(String tenPhanNhom);

	/**
	 * Returns the ten tieng anh of this tthc phan nhom ho so.
	 *
	 * @return the ten tieng anh of this tthc phan nhom ho so
	 */
	@AutoEscape
	public String getTenTiengAnh();

	/**
	 * Sets the ten tieng anh of this tthc phan nhom ho so.
	 *
	 * @param tenTiengAnh the ten tieng anh of this tthc phan nhom ho so
	 */
	public void setTenTiengAnh(String tenTiengAnh);

	/**
	 * Returns the so thu tu of this tthc phan nhom ho so.
	 *
	 * @return the so thu tu of this tthc phan nhom ho so
	 */
	public int getSoThuTu();

	/**
	 * Sets the so thu tu of this tthc phan nhom ho so.
	 *
	 * @param soThuTu the so thu tu of this tthc phan nhom ho so
	 */
	public void setSoThuTu(int soThuTu);

	/**
	 * Returns the loai phan nhom of this tthc phan nhom ho so.
	 *
	 * @return the loai phan nhom of this tthc phan nhom ho so
	 */
	public int getLoaiPhanNhom();

	/**
	 * Sets the loai phan nhom of this tthc phan nhom ho so.
	 *
	 * @param loaiPhanNhom the loai phan nhom of this tthc phan nhom ho so
	 */
	public void setLoaiPhanNhom(int loaiPhanNhom);

	/**
	 * Returns the to chuc quan ly of this tthc phan nhom ho so.
	 *
	 * @return the to chuc quan ly of this tthc phan nhom ho so
	 */
	public long getToChucQuanLy();

	/**
	 * Sets the to chuc quan ly of this tthc phan nhom ho so.
	 *
	 * @param toChucQuanLy the to chuc quan ly of this tthc phan nhom ho so
	 */
	public void setToChucQuanLy(long toChucQuanLy);

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
	public int compareTo(TthcPhanNhomHoSo tthcPhanNhomHoSo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TthcPhanNhomHoSo> toCacheModel();

	@Override
	public TthcPhanNhomHoSo toEscapedModel();

	@Override
	public TthcPhanNhomHoSo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}