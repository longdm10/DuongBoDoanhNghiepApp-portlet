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

import java.util.Date;

/**
 * The base model interface for the DmDataVersion service. Represents a row in the &quot;dm_dataversion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.common.model.impl.DmDataVersionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.common.model.impl.DmDataVersionImpl}.
 * </p>
 *
 * @author win_64
 * @see DmDataVersion
 * @see vn.dtt.duongbo.dao.common.model.impl.DmDataVersionImpl
 * @see vn.dtt.duongbo.dao.common.model.impl.DmDataVersionModelImpl
 * @generated
 */
public interface DmDataVersionModel extends BaseModel<DmDataVersion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm data version model instance should use the {@link DmDataVersion} interface instead.
	 */

	/**
	 * Returns the primary key of this dm data version.
	 *
	 * @return the primary key of this dm data version
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dm data version.
	 *
	 * @param primaryKey the primary key of this dm data version
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this dm data version.
	 *
	 * @return the ID of this dm data version
	 */
	public long getId();

	/**
	 * Sets the ID of this dm data version.
	 *
	 * @param id the ID of this dm data version
	 */
	public void setId(long id);

	/**
	 * Returns the data group ID of this dm data version.
	 *
	 * @return the data group ID of this dm data version
	 */
	public long getDataGroupId();

	/**
	 * Sets the data group ID of this dm data version.
	 *
	 * @param dataGroupId the data group ID of this dm data version
	 */
	public void setDataGroupId(long dataGroupId);

	/**
	 * Returns the version of this dm data version.
	 *
	 * @return the version of this dm data version
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this dm data version.
	 *
	 * @param version the version of this dm data version
	 */
	public void setVersion(String version);

	/**
	 * Returns the issued time of this dm data version.
	 *
	 * @return the issued time of this dm data version
	 */
	public Date getIssuedTime();

	/**
	 * Sets the issued time of this dm data version.
	 *
	 * @param issuedTime the issued time of this dm data version
	 */
	public void setIssuedTime(Date issuedTime);

	/**
	 * Returns the validate d from of this dm data version.
	 *
	 * @return the validate d from of this dm data version
	 */
	public Date getValidateDFrom();

	/**
	 * Sets the validate d from of this dm data version.
	 *
	 * @param validateDFrom the validate d from of this dm data version
	 */
	public void setValidateDFrom(Date validateDFrom);

	/**
	 * Returns the validated to of this dm data version.
	 *
	 * @return the validated to of this dm data version
	 */
	public Date getValidatedTo();

	/**
	 * Sets the validated to of this dm data version.
	 *
	 * @param validatedTo the validated to of this dm data version
	 */
	public void setValidatedTo(Date validatedTo);

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
	public int compareTo(DmDataVersion dmDataVersion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DmDataVersion> toCacheModel();

	@Override
	public DmDataVersion toEscapedModel();

	@Override
	public DmDataVersion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}