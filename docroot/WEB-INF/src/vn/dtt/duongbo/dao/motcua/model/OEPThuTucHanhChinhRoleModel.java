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
 * The base model interface for the OEPThuTucHanhChinhRole service. Represents a row in the &quot;oep_thutuchanhchinh_role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleImpl}.
 * </p>
 *
 * @author win_64
 * @see OEPThuTucHanhChinhRole
 * @see vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleImpl
 * @see vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl
 * @generated
 */
public interface OEPThuTucHanhChinhRoleModel extends BaseModel<OEPThuTucHanhChinhRole> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a o e p thu tuc hanh chinh role model instance should use the {@link OEPThuTucHanhChinhRole} interface instead.
	 */

	/**
	 * Returns the primary key of this o e p thu tuc hanh chinh role.
	 *
	 * @return the primary key of this o e p thu tuc hanh chinh role
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this o e p thu tuc hanh chinh role.
	 *
	 * @param primaryKey the primary key of this o e p thu tuc hanh chinh role
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this o e p thu tuc hanh chinh role.
	 *
	 * @return the ID of this o e p thu tuc hanh chinh role
	 */
	public int getId();

	/**
	 * Sets the ID of this o e p thu tuc hanh chinh role.
	 *
	 * @param id the ID of this o e p thu tuc hanh chinh role
	 */
	public void setId(int id);

	/**
	 * Returns the thu tuc hinh chinh ID of this o e p thu tuc hanh chinh role.
	 *
	 * @return the thu tuc hinh chinh ID of this o e p thu tuc hanh chinh role
	 */
	public int getThuTucHinhChinhId();

	/**
	 * Sets the thu tuc hinh chinh ID of this o e p thu tuc hanh chinh role.
	 *
	 * @param thuTucHinhChinhId the thu tuc hinh chinh ID of this o e p thu tuc hanh chinh role
	 */
	public void setThuTucHinhChinhId(int thuTucHinhChinhId);

	/**
	 * Returns the vai tro thuc hien of this o e p thu tuc hanh chinh role.
	 *
	 * @return the vai tro thuc hien of this o e p thu tuc hanh chinh role
	 */
	public int getVaiTroThucHien();

	/**
	 * Sets the vai tro thuc hien of this o e p thu tuc hanh chinh role.
	 *
	 * @param vaiTroThucHien the vai tro thuc hien of this o e p thu tuc hanh chinh role
	 */
	public void setVaiTroThucHien(int vaiTroThucHien);

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
	public int compareTo(OEPThuTucHanhChinhRole oepThuTucHanhChinhRole);

	@Override
	public int hashCode();

	@Override
	public CacheModel<OEPThuTucHanhChinhRole> toCacheModel();

	@Override
	public OEPThuTucHanhChinhRole toEscapedModel();

	@Override
	public OEPThuTucHanhChinhRole toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}