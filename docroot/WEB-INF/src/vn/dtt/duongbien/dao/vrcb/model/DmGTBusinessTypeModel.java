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
 * The base model interface for the DmGTBusinessType service. Represents a row in the &quot;DM_GT_BUSINESS_TYPE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeImpl}.
 * </p>
 *
 * @author longdm
 * @see DmGTBusinessType
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl
 * @generated
 */
public interface DmGTBusinessTypeModel extends BaseModel<DmGTBusinessType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm g t business type model instance should use the {@link DmGTBusinessType} interface instead.
	 */

	/**
	 * Returns the primary key of this dm g t business type.
	 *
	 * @return the primary key of this dm g t business type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dm g t business type.
	 *
	 * @param primaryKey the primary key of this dm g t business type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this dm g t business type.
	 *
	 * @return the ID of this dm g t business type
	 */
	public long getId();

	/**
	 * Sets the ID of this dm g t business type.
	 *
	 * @param id the ID of this dm g t business type
	 */
	public void setId(long id);

	/**
	 * Returns the business type code of this dm g t business type.
	 *
	 * @return the business type code of this dm g t business type
	 */
	public int getBusinessTypeCode();

	/**
	 * Sets the business type code of this dm g t business type.
	 *
	 * @param businessTypeCode the business type code of this dm g t business type
	 */
	public void setBusinessTypeCode(int businessTypeCode);

	/**
	 * Returns the business type name of this dm g t business type.
	 *
	 * @return the business type name of this dm g t business type
	 */
	@AutoEscape
	public String getBusinessTypeName();

	/**
	 * Sets the business type name of this dm g t business type.
	 *
	 * @param businessTypeName the business type name of this dm g t business type
	 */
	public void setBusinessTypeName(String businessTypeName);

	/**
	 * Returns the business type name v n of this dm g t business type.
	 *
	 * @return the business type name v n of this dm g t business type
	 */
	@AutoEscape
	public String getBusinessTypeNameVN();

	/**
	 * Sets the business type name v n of this dm g t business type.
	 *
	 * @param businessTypeNameVN the business type name v n of this dm g t business type
	 */
	public void setBusinessTypeNameVN(String businessTypeNameVN);

	/**
	 * Returns the business type order of this dm g t business type.
	 *
	 * @return the business type order of this dm g t business type
	 */
	public int getBusinessTypeOrder();

	/**
	 * Sets the business type order of this dm g t business type.
	 *
	 * @param businessTypeOrder the business type order of this dm g t business type
	 */
	public void setBusinessTypeOrder(int businessTypeOrder);

	/**
	 * Returns the is delete of this dm g t business type.
	 *
	 * @return the is delete of this dm g t business type
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm g t business type.
	 *
	 * @param isDelete the is delete of this dm g t business type
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm g t business type.
	 *
	 * @return the marked as delete of this dm g t business type
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm g t business type.
	 *
	 * @param markedAsDelete the marked as delete of this dm g t business type
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm g t business type.
	 *
	 * @return the modified date of this dm g t business type
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm g t business type.
	 *
	 * @param modifiedDate the modified date of this dm g t business type
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm g t business type.
	 *
	 * @return the requested date of this dm g t business type
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm g t business type.
	 *
	 * @param requestedDate the requested date of this dm g t business type
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm g t business type.
	 *
	 * @return the sync version of this dm g t business type
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm g t business type.
	 *
	 * @param syncVersion the sync version of this dm g t business type
	 */
	public void setSyncVersion(String syncVersion);

	/**
	 * Returns the remarks of this dm g t business type.
	 *
	 * @return the remarks of this dm g t business type
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this dm g t business type.
	 *
	 * @param remarks the remarks of this dm g t business type
	 */
	public void setRemarks(String remarks);

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
	public int compareTo(DmGTBusinessType dmGTBusinessType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DmGTBusinessType> toCacheModel();

	@Override
	public DmGTBusinessType toEscapedModel();

	@Override
	public DmGTBusinessType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}