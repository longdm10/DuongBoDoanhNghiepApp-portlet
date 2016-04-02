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
 * The base model interface for the DmShipType service. Represents a row in the &quot;DM_SHIP_TYPE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeImpl}.
 * </p>
 *
 * @author longdm
 * @see DmShipType
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeModelImpl
 * @generated
 */
public interface DmShipTypeModel extends BaseModel<DmShipType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm ship type model instance should use the {@link DmShipType} interface instead.
	 */

	/**
	 * Returns the primary key of this dm ship type.
	 *
	 * @return the primary key of this dm ship type
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this dm ship type.
	 *
	 * @param primaryKey the primary key of this dm ship type
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this dm ship type.
	 *
	 * @return the ID of this dm ship type
	 */
	public int getId();

	/**
	 * Sets the ID of this dm ship type.
	 *
	 * @param id the ID of this dm ship type
	 */
	public void setId(int id);

	/**
	 * Returns the ship type code of this dm ship type.
	 *
	 * @return the ship type code of this dm ship type
	 */
	@AutoEscape
	public String getShipTypeCode();

	/**
	 * Sets the ship type code of this dm ship type.
	 *
	 * @param shipTypeCode the ship type code of this dm ship type
	 */
	public void setShipTypeCode(String shipTypeCode);

	/**
	 * Returns the ship type name of this dm ship type.
	 *
	 * @return the ship type name of this dm ship type
	 */
	@AutoEscape
	public String getShipTypeName();

	/**
	 * Sets the ship type name of this dm ship type.
	 *
	 * @param shipTypeName the ship type name of this dm ship type
	 */
	public void setShipTypeName(String shipTypeName);

	/**
	 * Returns the ship type name v n of this dm ship type.
	 *
	 * @return the ship type name v n of this dm ship type
	 */
	@AutoEscape
	public String getShipTypeNameVN();

	/**
	 * Sets the ship type name v n of this dm ship type.
	 *
	 * @param shipTypeNameVN the ship type name v n of this dm ship type
	 */
	public void setShipTypeNameVN(String shipTypeNameVN);

	/**
	 * Returns the ship type order of this dm ship type.
	 *
	 * @return the ship type order of this dm ship type
	 */
	public int getShipTypeOrder();

	/**
	 * Sets the ship type order of this dm ship type.
	 *
	 * @param shipTypeOrder the ship type order of this dm ship type
	 */
	public void setShipTypeOrder(int shipTypeOrder);

	/**
	 * Returns the is delete of this dm ship type.
	 *
	 * @return the is delete of this dm ship type
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm ship type.
	 *
	 * @param isDelete the is delete of this dm ship type
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm ship type.
	 *
	 * @return the marked as delete of this dm ship type
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm ship type.
	 *
	 * @param markedAsDelete the marked as delete of this dm ship type
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm ship type.
	 *
	 * @return the modified date of this dm ship type
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm ship type.
	 *
	 * @param modifiedDate the modified date of this dm ship type
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm ship type.
	 *
	 * @return the requested date of this dm ship type
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm ship type.
	 *
	 * @param requestedDate the requested date of this dm ship type
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm ship type.
	 *
	 * @return the sync version of this dm ship type
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm ship type.
	 *
	 * @param syncVersion the sync version of this dm ship type
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
	public int compareTo(DmShipType dmShipType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DmShipType> toCacheModel();

	@Override
	public DmShipType toEscapedModel();

	@Override
	public DmShipType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}