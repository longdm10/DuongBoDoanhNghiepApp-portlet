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

package vn.dtt.duongbo.dao.thanhtoan.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the TthcXacNhanThanhToanHoSo service. Represents a row in the &quot;tthc_xacnhanthanhtoan_hoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcXacNhanThanhToanHoSo
 * @see vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoImpl
 * @see vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl
 * @generated
 */
public interface TthcXacNhanThanhToanHoSoModel extends BaseModel<TthcXacNhanThanhToanHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tthc xac nhan thanh toan ho so model instance should use the {@link TthcXacNhanThanhToanHoSo} interface instead.
	 */

	/**
	 * Returns the primary key of this tthc xac nhan thanh toan ho so.
	 *
	 * @return the primary key of this tthc xac nhan thanh toan ho so
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tthc xac nhan thanh toan ho so.
	 *
	 * @param primaryKey the primary key of this tthc xac nhan thanh toan ho so
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tthc xac nhan thanh toan ho so.
	 *
	 * @return the ID of this tthc xac nhan thanh toan ho so
	 */
	public long getId();

	/**
	 * Sets the ID of this tthc xac nhan thanh toan ho so.
	 *
	 * @param id the ID of this tthc xac nhan thanh toan ho so
	 */
	public void setId(long id);

	/**
	 * Returns the xac nhan thanh toan ID of this tthc xac nhan thanh toan ho so.
	 *
	 * @return the xac nhan thanh toan ID of this tthc xac nhan thanh toan ho so
	 */
	public long getXacNhanThanhToanId();

	/**
	 * Sets the xac nhan thanh toan ID of this tthc xac nhan thanh toan ho so.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID of this tthc xac nhan thanh toan ho so
	 */
	public void setXacNhanThanhToanId(long xacNhanThanhToanId);

	/**
	 * Returns the ho so thu tuc ID of this tthc xac nhan thanh toan ho so.
	 *
	 * @return the ho so thu tuc ID of this tthc xac nhan thanh toan ho so
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this tthc xac nhan thanh toan ho so.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID of this tthc xac nhan thanh toan ho so
	 */
	public void setHoSoThuTucId(long hoSoThuTucId);

	/**
	 * Returns the so tien of this tthc xac nhan thanh toan ho so.
	 *
	 * @return the so tien of this tthc xac nhan thanh toan ho so
	 */
	public long getSoTien();

	/**
	 * Sets the so tien of this tthc xac nhan thanh toan ho so.
	 *
	 * @param soTien the so tien of this tthc xac nhan thanh toan ho so
	 */
	public void setSoTien(long soTien);

	/**
	 * Returns the phieu xu ly ID of this tthc xac nhan thanh toan ho so.
	 *
	 * @return the phieu xu ly ID of this tthc xac nhan thanh toan ho so
	 */
	public long getPhieuXuLyId();

	/**
	 * Sets the phieu xu ly ID of this tthc xac nhan thanh toan ho so.
	 *
	 * @param phieuXuLyId the phieu xu ly ID of this tthc xac nhan thanh toan ho so
	 */
	public void setPhieuXuLyId(long phieuXuLyId);

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
	public int compareTo(TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TthcXacNhanThanhToanHoSo> toCacheModel();

	@Override
	public TthcXacNhanThanhToanHoSo toEscapedModel();

	@Override
	public TthcXacNhanThanhToanHoSo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}