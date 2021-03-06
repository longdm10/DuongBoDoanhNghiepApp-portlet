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
 * The base model interface for the DmHistoryPackage service. Represents a row in the &quot;DM_HISTORY_PACKAGE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryPackage
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl
 * @generated
 */
public interface DmHistoryPackageModel extends BaseModel<DmHistoryPackage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm history package model instance should use the {@link DmHistoryPackage} interface instead.
	 */

	/**
	 * Returns the primary key of this dm history package.
	 *
	 * @return the primary key of this dm history package
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this dm history package.
	 *
	 * @param primaryKey the primary key of this dm history package
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this dm history package.
	 *
	 * @return the ID of this dm history package
	 */
	public int getId();

	/**
	 * Sets the ID of this dm history package.
	 *
	 * @param id the ID of this dm history package
	 */
	public void setId(int id);

	/**
	 * Returns the package code of this dm history package.
	 *
	 * @return the package code of this dm history package
	 */
	@AutoEscape
	public String getPackageCode();

	/**
	 * Sets the package code of this dm history package.
	 *
	 * @param packageCode the package code of this dm history package
	 */
	public void setPackageCode(String packageCode);

	/**
	 * Returns the package name of this dm history package.
	 *
	 * @return the package name of this dm history package
	 */
	@AutoEscape
	public String getPackageName();

	/**
	 * Sets the package name of this dm history package.
	 *
	 * @param packageName the package name of this dm history package
	 */
	public void setPackageName(String packageName);

	/**
	 * Returns the package name v n of this dm history package.
	 *
	 * @return the package name v n of this dm history package
	 */
	@AutoEscape
	public String getPackageNameVN();

	/**
	 * Sets the package name v n of this dm history package.
	 *
	 * @param packageNameVN the package name v n of this dm history package
	 */
	public void setPackageNameVN(String packageNameVN);

	/**
	 * Returns the package order of this dm history package.
	 *
	 * @return the package order of this dm history package
	 */
	public int getPackageOrder();

	/**
	 * Sets the package order of this dm history package.
	 *
	 * @param packageOrder the package order of this dm history package
	 */
	public void setPackageOrder(int packageOrder);

	/**
	 * Returns the is delete of this dm history package.
	 *
	 * @return the is delete of this dm history package
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm history package.
	 *
	 * @param isDelete the is delete of this dm history package
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm history package.
	 *
	 * @return the marked as delete of this dm history package
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm history package.
	 *
	 * @param markedAsDelete the marked as delete of this dm history package
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm history package.
	 *
	 * @return the modified date of this dm history package
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm history package.
	 *
	 * @param modifiedDate the modified date of this dm history package
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm history package.
	 *
	 * @return the requested date of this dm history package
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm history package.
	 *
	 * @param requestedDate the requested date of this dm history package
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm history package.
	 *
	 * @return the sync version of this dm history package
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm history package.
	 *
	 * @param syncVersion the sync version of this dm history package
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
	public int compareTo(DmHistoryPackage dmHistoryPackage);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DmHistoryPackage> toCacheModel();

	@Override
	public DmHistoryPackage toEscapedModel();

	@Override
	public DmHistoryPackage toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}