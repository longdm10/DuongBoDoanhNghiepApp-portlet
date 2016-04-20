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

import vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtJobpos2rolePK;

import java.io.Serializable;

/**
 * The base model interface for the OEPUserMgtJobpos2role service. Represents a row in the &quot;oep_usermgt_jobpos2role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleImpl}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtJobpos2role
 * @see vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleImpl
 * @see vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleModelImpl
 * @generated
 */
public interface OEPUserMgtJobpos2roleModel extends BaseModel<OEPUserMgtJobpos2role> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a o e p user mgt jobpos2role model instance should use the {@link OEPUserMgtJobpos2role} interface instead.
	 */

	/**
	 * Returns the primary key of this o e p user mgt jobpos2role.
	 *
	 * @return the primary key of this o e p user mgt jobpos2role
	 */
	public OEPUserMgtJobpos2rolePK getPrimaryKey();

	/**
	 * Sets the primary key of this o e p user mgt jobpos2role.
	 *
	 * @param primaryKey the primary key of this o e p user mgt jobpos2role
	 */
	public void setPrimaryKey(OEPUserMgtJobpos2rolePK primaryKey);

	/**
	 * Returns the job pos ID of this o e p user mgt jobpos2role.
	 *
	 * @return the job pos ID of this o e p user mgt jobpos2role
	 */
	public int getJobPosId();

	/**
	 * Sets the job pos ID of this o e p user mgt jobpos2role.
	 *
	 * @param jobPosId the job pos ID of this o e p user mgt jobpos2role
	 */
	public void setJobPosId(int jobPosId);

	/**
	 * Returns the role ID of this o e p user mgt jobpos2role.
	 *
	 * @return the role ID of this o e p user mgt jobpos2role
	 */
	public int getRoleId();

	/**
	 * Sets the role ID of this o e p user mgt jobpos2role.
	 *
	 * @param roleId the role ID of this o e p user mgt jobpos2role
	 */
	public void setRoleId(int roleId);

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
	public int compareTo(OEPUserMgtJobpos2role oepUserMgtJobpos2role);

	@Override
	public int hashCode();

	@Override
	public CacheModel<OEPUserMgtJobpos2role> toCacheModel();

	@Override
	public OEPUserMgtJobpos2role toEscapedModel();

	@Override
	public OEPUserMgtJobpos2role toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}