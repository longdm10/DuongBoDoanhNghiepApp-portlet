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
 * The base model interface for the DmHistoryEnterrise service. Represents a row in the &quot;dm_history_enterprise&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryEnterrise
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl
 * @generated
 */
public interface DmHistoryEnterriseModel extends BaseModel<DmHistoryEnterrise> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm history enterrise model instance should use the {@link DmHistoryEnterrise} interface instead.
	 */

	/**
	 * Returns the primary key of this dm history enterrise.
	 *
	 * @return the primary key of this dm history enterrise
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this dm history enterrise.
	 *
	 * @param primaryKey the primary key of this dm history enterrise
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this dm history enterrise.
	 *
	 * @return the ID of this dm history enterrise
	 */
	public int getId();

	/**
	 * Sets the ID of this dm history enterrise.
	 *
	 * @param id the ID of this dm history enterrise
	 */
	public void setId(int id);

	/**
	 * Returns the enterprise code of this dm history enterrise.
	 *
	 * @return the enterprise code of this dm history enterrise
	 */
	@AutoEscape
	public String getEnterpriseCode();

	/**
	 * Sets the enterprise code of this dm history enterrise.
	 *
	 * @param enterpriseCode the enterprise code of this dm history enterrise
	 */
	public void setEnterpriseCode(String enterpriseCode);

	/**
	 * Returns the enterprise tax code of this dm history enterrise.
	 *
	 * @return the enterprise tax code of this dm history enterrise
	 */
	@AutoEscape
	public String getEnterpriseTaxCode();

	/**
	 * Sets the enterprise tax code of this dm history enterrise.
	 *
	 * @param enterpriseTaxCode the enterprise tax code of this dm history enterrise
	 */
	public void setEnterpriseTaxCode(String enterpriseTaxCode);

	/**
	 * Returns the enterprise name of this dm history enterrise.
	 *
	 * @return the enterprise name of this dm history enterrise
	 */
	@AutoEscape
	public String getEnterpriseName();

	/**
	 * Sets the enterprise name of this dm history enterrise.
	 *
	 * @param enterpriseName the enterprise name of this dm history enterrise
	 */
	public void setEnterpriseName(String enterpriseName);

	/**
	 * Returns the enterprise short name of this dm history enterrise.
	 *
	 * @return the enterprise short name of this dm history enterrise
	 */
	@AutoEscape
	public String getEnterpriseShortName();

	/**
	 * Sets the enterprise short name of this dm history enterrise.
	 *
	 * @param enterpriseShortName the enterprise short name of this dm history enterrise
	 */
	public void setEnterpriseShortName(String enterpriseShortName);

	/**
	 * Returns the enterprise foreign name of this dm history enterrise.
	 *
	 * @return the enterprise foreign name of this dm history enterrise
	 */
	@AutoEscape
	public String getEnterpriseForeignName();

	/**
	 * Sets the enterprise foreign name of this dm history enterrise.
	 *
	 * @param enterpriseForeignName the enterprise foreign name of this dm history enterrise
	 */
	public void setEnterpriseForeignName(String enterpriseForeignName);

	/**
	 * Returns the enterprise person of this dm history enterrise.
	 *
	 * @return the enterprise person of this dm history enterrise
	 */
	@AutoEscape
	public String getEnterprisePerson();

	/**
	 * Sets the enterprise person of this dm history enterrise.
	 *
	 * @param enterprisePerson the enterprise person of this dm history enterrise
	 */
	public void setEnterprisePerson(String enterprisePerson);

	/**
	 * Returns the enterprise h o address of this dm history enterrise.
	 *
	 * @return the enterprise h o address of this dm history enterrise
	 */
	@AutoEscape
	public String getEnterpriseHOAddress();

	/**
	 * Sets the enterprise h o address of this dm history enterrise.
	 *
	 * @param enterpriseHOAddress the enterprise h o address of this dm history enterrise
	 */
	public void setEnterpriseHOAddress(String enterpriseHOAddress);

	/**
	 * Returns the state code of this dm history enterrise.
	 *
	 * @return the state code of this dm history enterrise
	 */
	@AutoEscape
	public String getStateCode();

	/**
	 * Sets the state code of this dm history enterrise.
	 *
	 * @param stateCode the state code of this dm history enterrise
	 */
	public void setStateCode(String stateCode);

	/**
	 * Returns the city code of this dm history enterrise.
	 *
	 * @return the city code of this dm history enterrise
	 */
	@AutoEscape
	public String getCityCode();

	/**
	 * Sets the city code of this dm history enterrise.
	 *
	 * @param cityCode the city code of this dm history enterrise
	 */
	public void setCityCode(String cityCode);

	/**
	 * Returns the district code of this dm history enterrise.
	 *
	 * @return the district code of this dm history enterrise
	 */
	@AutoEscape
	public String getDistrictCode();

	/**
	 * Sets the district code of this dm history enterrise.
	 *
	 * @param districtCode the district code of this dm history enterrise
	 */
	public void setDistrictCode(String districtCode);

	/**
	 * Returns the ward code of this dm history enterrise.
	 *
	 * @return the ward code of this dm history enterrise
	 */
	@AutoEscape
	public String getWardCode();

	/**
	 * Sets the ward code of this dm history enterrise.
	 *
	 * @param wardCode the ward code of this dm history enterrise
	 */
	public void setWardCode(String wardCode);

	/**
	 * Returns the telephone no of this dm history enterrise.
	 *
	 * @return the telephone no of this dm history enterrise
	 */
	@AutoEscape
	public String getTelephoneNo();

	/**
	 * Sets the telephone no of this dm history enterrise.
	 *
	 * @param telephoneNo the telephone no of this dm history enterrise
	 */
	public void setTelephoneNo(String telephoneNo);

	/**
	 * Returns the registration code of this dm history enterrise.
	 *
	 * @return the registration code of this dm history enterrise
	 */
	@AutoEscape
	public String getRegistrationCode();

	/**
	 * Sets the registration code of this dm history enterrise.
	 *
	 * @param registrationCode the registration code of this dm history enterrise
	 */
	public void setRegistrationCode(String registrationCode);

	/**
	 * Returns the registration address of this dm history enterrise.
	 *
	 * @return the registration address of this dm history enterrise
	 */
	@AutoEscape
	public String getRegistrationAddress();

	/**
	 * Sets the registration address of this dm history enterrise.
	 *
	 * @param registrationAddress the registration address of this dm history enterrise
	 */
	public void setRegistrationAddress(String registrationAddress);

	/**
	 * Returns the registration date of this dm history enterrise.
	 *
	 * @return the registration date of this dm history enterrise
	 */
	public Date getRegistrationDate();

	/**
	 * Sets the registration date of this dm history enterrise.
	 *
	 * @param registrationDate the registration date of this dm history enterrise
	 */
	public void setRegistrationDate(Date registrationDate);

	/**
	 * Returns the is delete of this dm history enterrise.
	 *
	 * @return the is delete of this dm history enterrise
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm history enterrise.
	 *
	 * @param isDelete the is delete of this dm history enterrise
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm history enterrise.
	 *
	 * @return the marked as delete of this dm history enterrise
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm history enterrise.
	 *
	 * @param markedAsDelete the marked as delete of this dm history enterrise
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm history enterrise.
	 *
	 * @return the modified date of this dm history enterrise
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm history enterrise.
	 *
	 * @param modifiedDate the modified date of this dm history enterrise
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm history enterrise.
	 *
	 * @return the requested date of this dm history enterrise
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm history enterrise.
	 *
	 * @param requestedDate the requested date of this dm history enterrise
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm history enterrise.
	 *
	 * @return the sync version of this dm history enterrise
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm history enterrise.
	 *
	 * @param syncVersion the sync version of this dm history enterrise
	 */
	public void setSyncVersion(String syncVersion);

	/**
	 * Returns the modified user of this dm history enterrise.
	 *
	 * @return the modified user of this dm history enterrise
	 */
	@AutoEscape
	public String getModifiedUser();

	/**
	 * Sets the modified user of this dm history enterrise.
	 *
	 * @param modifiedUser the modified user of this dm history enterrise
	 */
	public void setModifiedUser(String modifiedUser);

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
	public int compareTo(DmHistoryEnterrise dmHistoryEnterrise);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DmHistoryEnterrise> toCacheModel();

	@Override
	public DmHistoryEnterrise toEscapedModel();

	@Override
	public DmHistoryEnterrise toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}