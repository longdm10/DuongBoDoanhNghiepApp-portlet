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

package vn.dtt.duongbien.dao.vrcb.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DmState service. Represents a row in the &quot;dm_state&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmStateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmStateImpl}.
 * </p>
 *
 * @author longdm
 * @see DmState
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmStateImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmStateModelImpl
 * @generated
 */
public interface DmStateModel extends BaseModel<DmState> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm state model instance should use the {@link DmState} interface instead.
	 */

	/**
	 * Returns the primary key of this dm state.
	 *
	 * @return the primary key of this dm state
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this dm state.
	 *
	 * @param primaryKey the primary key of this dm state
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this dm state.
	 *
	 * @return the ID of this dm state
	 */
	public int getId();

	/**
	 * Sets the ID of this dm state.
	 *
	 * @param id the ID of this dm state
	 */
	public void setId(int id);

	/**
	 * Returns the state code of this dm state.
	 *
	 * @return the state code of this dm state
	 */
	@AutoEscape
	public String getStateCode();

	/**
	 * Sets the state code of this dm state.
	 *
	 * @param stateCode the state code of this dm state
	 */
	public void setStateCode(String stateCode);

	/**
	 * Returns the state name of this dm state.
	 *
	 * @return the state name of this dm state
	 */
	@AutoEscape
	public String getStateName();

	/**
	 * Sets the state name of this dm state.
	 *
	 * @param stateName the state name of this dm state
	 */
	public void setStateName(String stateName);

	/**
	 * Returns the description of this dm state.
	 *
	 * @return the description of this dm state
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this dm state.
	 *
	 * @param description the description of this dm state
	 */
	public void setDescription(String description);

	/**
	 * Returns the is delete of this dm state.
	 *
	 * @return the is delete of this dm state
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm state.
	 *
	 * @param isDelete the is delete of this dm state
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm state.
	 *
	 * @return the marked as delete of this dm state
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm state.
	 *
	 * @param markedAsDelete the marked as delete of this dm state
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm state.
	 *
	 * @return the modified date of this dm state
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm state.
	 *
	 * @param modifiedDate the modified date of this dm state
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm state.
	 *
	 * @return the requested date of this dm state
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm state.
	 *
	 * @param requestedDate the requested date of this dm state
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm state.
	 *
	 * @return the sync version of this dm state
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm state.
	 *
	 * @param syncVersion the sync version of this dm state
	 */
	public void setSyncVersion(String syncVersion);

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
	public int compareTo(DmState dmState);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DmState> toCacheModel();

	@Override
	public DmState toEscapedModel();

	@Override
	public DmState toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}