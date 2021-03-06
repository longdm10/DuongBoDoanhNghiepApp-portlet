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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the MotCuaQuyTrinhThuTucTTHC service. Represents a row in the &quot;motcua_quytrinhthutuc_tthc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCImpl}.
 * </p>
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucTTHC
 * @see vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCImpl
 * @see vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl
 * @generated
 */
public interface MotCuaQuyTrinhThuTucTTHCModel extends BaseModel<MotCuaQuyTrinhThuTucTTHC> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mot cua quy trinh thu tuc t t h c model instance should use the {@link MotCuaQuyTrinhThuTucTTHC} interface instead.
	 */

	/**
	 * Returns the primary key of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @return the primary key of this mot cua quy trinh thu tuc t t h c
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @param primaryKey the primary key of this mot cua quy trinh thu tuc t t h c
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @return the ID of this mot cua quy trinh thu tuc t t h c
	 */
	public long getId();

	/**
	 * Sets the ID of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @param id the ID of this mot cua quy trinh thu tuc t t h c
	 */
	public void setId(long id);

	/**
	 * Returns the quy trinh thu tuc ID of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @return the quy trinh thu tuc ID of this mot cua quy trinh thu tuc t t h c
	 */
	public long getQuyTrinhThuTucId();

	/**
	 * Sets the quy trinh thu tuc ID of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID of this mot cua quy trinh thu tuc t t h c
	 */
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId);

	/**
	 * Returns the thu tuc hanh chinh i d of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @return the thu tuc hanh chinh i d of this mot cua quy trinh thu tuc t t h c
	 */
	public long getThuTucHanhChinhID();

	/**
	 * Sets the thu tuc hanh chinh i d of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @param thuTucHanhChinhID the thu tuc hanh chinh i d of this mot cua quy trinh thu tuc t t h c
	 */
	public void setThuTucHanhChinhID(long thuTucHanhChinhID);

	/**
	 * Returns the to chuc xu ly of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @return the to chuc xu ly of this mot cua quy trinh thu tuc t t h c
	 */
	public long getToChucXuLy();

	/**
	 * Sets the to chuc xu ly of this mot cua quy trinh thu tuc t t h c.
	 *
	 * @param toChucXuLy the to chuc xu ly of this mot cua quy trinh thu tuc t t h c
	 */
	public void setToChucXuLy(long toChucXuLy);

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
	public int compareTo(MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MotCuaQuyTrinhThuTucTTHC> toCacheModel();

	@Override
	public MotCuaQuyTrinhThuTucTTHC toEscapedModel();

	@Override
	public MotCuaQuyTrinhThuTucTTHC toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}