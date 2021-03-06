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
 * The base model interface for the TempShipSecurityPortItems service. Represents a row in the &quot;TEMP_SHIP_SECURITY_PORT_ITEMS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsImpl}.
 * </p>
 *
 * @author longdm
 * @see TempShipSecurityPortItems
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl
 * @generated
 */
public interface TempShipSecurityPortItemsModel extends BaseModel<TempShipSecurityPortItems> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp ship security port items model instance should use the {@link TempShipSecurityPortItems} interface instead.
	 */

	/**
	 * Returns the primary key of this temp ship security port items.
	 *
	 * @return the primary key of this temp ship security port items
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this temp ship security port items.
	 *
	 * @param primaryKey the primary key of this temp ship security port items
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this temp ship security port items.
	 *
	 * @return the ID of this temp ship security port items
	 */
	public long getId();

	/**
	 * Sets the ID of this temp ship security port items.
	 *
	 * @param id the ID of this temp ship security port items
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this temp ship security port items.
	 *
	 * @return the request code of this temp ship security port items
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this temp ship security port items.
	 *
	 * @param requestCode the request code of this temp ship security port items
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the ship security port item code of this temp ship security port items.
	 *
	 * @return the ship security port item code of this temp ship security port items
	 */
	@AutoEscape
	public String getShipSecurityPortItemCode();

	/**
	 * Sets the ship security port item code of this temp ship security port items.
	 *
	 * @param shipSecurityPortItemCode the ship security port item code of this temp ship security port items
	 */
	public void setShipSecurityPortItemCode(String shipSecurityPortItemCode);

	/**
	 * Returns the port code of this temp ship security port items.
	 *
	 * @return the port code of this temp ship security port items
	 */
	@AutoEscape
	public String getPortCode();

	/**
	 * Sets the port code of this temp ship security port items.
	 *
	 * @param portCode the port code of this temp ship security port items
	 */
	public void setPortCode(String portCode);

	/**
	 * Returns the date arrival of this temp ship security port items.
	 *
	 * @return the date arrival of this temp ship security port items
	 */
	public Date getDateArrival();

	/**
	 * Sets the date arrival of this temp ship security port items.
	 *
	 * @param dateArrival the date arrival of this temp ship security port items
	 */
	public void setDateArrival(Date dateArrival);

	/**
	 * Returns the date departure of this temp ship security port items.
	 *
	 * @return the date departure of this temp ship security port items
	 */
	public Date getDateDeparture();

	/**
	 * Sets the date departure of this temp ship security port items.
	 *
	 * @param dateDeparture the date departure of this temp ship security port items
	 */
	public void setDateDeparture(Date dateDeparture);

	/**
	 * Returns the security level code of this temp ship security port items.
	 *
	 * @return the security level code of this temp ship security port items
	 */
	@AutoEscape
	public String getSecurityLevelCode();

	/**
	 * Sets the security level code of this temp ship security port items.
	 *
	 * @param securityLevelCode the security level code of this temp ship security port items
	 */
	public void setSecurityLevelCode(String securityLevelCode);

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
	public int compareTo(TempShipSecurityPortItems tempShipSecurityPortItems);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TempShipSecurityPortItems> toCacheModel();

	@Override
	public TempShipSecurityPortItems toEscapedModel();

	@Override
	public TempShipSecurityPortItems toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}