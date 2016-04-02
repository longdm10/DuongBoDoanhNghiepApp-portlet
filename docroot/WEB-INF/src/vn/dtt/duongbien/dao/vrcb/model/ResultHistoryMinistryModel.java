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
 * The base model interface for the ResultHistoryMinistry service. Represents a row in the &quot;RESULT_HISTORY_MINISTRY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryImpl}.
 * </p>
 *
 * @author longdm
 * @see ResultHistoryMinistry
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl
 * @generated
 */
public interface ResultHistoryMinistryModel extends BaseModel<ResultHistoryMinistry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a result history ministry model instance should use the {@link ResultHistoryMinistry} interface instead.
	 */

	/**
	 * Returns the primary key of this result history ministry.
	 *
	 * @return the primary key of this result history ministry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this result history ministry.
	 *
	 * @param primaryKey the primary key of this result history ministry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this result history ministry.
	 *
	 * @return the ID of this result history ministry
	 */
	public long getId();

	/**
	 * Sets the ID of this result history ministry.
	 *
	 * @param id the ID of this result history ministry
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this result history ministry.
	 *
	 * @return the request code of this result history ministry
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this result history ministry.
	 *
	 * @param requestCode the request code of this result history ministry
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the request state of this result history ministry.
	 *
	 * @return the request state of this result history ministry
	 */
	public int getRequestState();

	/**
	 * Sets the request state of this result history ministry.
	 *
	 * @param requestState the request state of this result history ministry
	 */
	public void setRequestState(int requestState);

	/**
	 * Returns the document name of this result history ministry.
	 *
	 * @return the document name of this result history ministry
	 */
	public long getDocumentName();

	/**
	 * Sets the document name of this result history ministry.
	 *
	 * @param documentName the document name of this result history ministry
	 */
	public void setDocumentName(long documentName);

	/**
	 * Returns the document year of this result history ministry.
	 *
	 * @return the document year of this result history ministry
	 */
	public int getDocumentYear();

	/**
	 * Sets the document year of this result history ministry.
	 *
	 * @param documentYear the document year of this result history ministry
	 */
	public void setDocumentYear(int documentYear);

	/**
	 * Returns the ministry code of this result history ministry.
	 *
	 * @return the ministry code of this result history ministry
	 */
	@AutoEscape
	public String getMinistryCode();

	/**
	 * Sets the ministry code of this result history ministry.
	 *
	 * @param ministryCode the ministry code of this result history ministry
	 */
	public void setMinistryCode(String ministryCode);

	/**
	 * Returns the organization of this result history ministry.
	 *
	 * @return the organization of this result history ministry
	 */
	@AutoEscape
	public String getOrganization();

	/**
	 * Sets the organization of this result history ministry.
	 *
	 * @param organization the organization of this result history ministry
	 */
	public void setOrganization(String organization);

	/**
	 * Returns the division of this result history ministry.
	 *
	 * @return the division of this result history ministry
	 */
	@AutoEscape
	public String getDivision();

	/**
	 * Sets the division of this result history ministry.
	 *
	 * @param division the division of this result history ministry
	 */
	public void setDivision(String division);

	/**
	 * Returns the officer name of this result history ministry.
	 *
	 * @return the officer name of this result history ministry
	 */
	@AutoEscape
	public String getOfficerName();

	/**
	 * Sets the officer name of this result history ministry.
	 *
	 * @param officerName the officer name of this result history ministry
	 */
	public void setOfficerName(String officerName);

	/**
	 * Returns the latest date of this result history ministry.
	 *
	 * @return the latest date of this result history ministry
	 */
	public Date getLatestDate();

	/**
	 * Sets the latest date of this result history ministry.
	 *
	 * @param latestDate the latest date of this result history ministry
	 */
	public void setLatestDate(Date latestDate);

	/**
	 * Returns the business type code of this result history ministry.
	 *
	 * @return the business type code of this result history ministry
	 */
	public int getBusinessTypeCode();

	/**
	 * Sets the business type code of this result history ministry.
	 *
	 * @param businessTypeCode the business type code of this result history ministry
	 */
	public void setBusinessTypeCode(int businessTypeCode);

	/**
	 * Returns the response of this result history ministry.
	 *
	 * @return the response of this result history ministry
	 */
	@AutoEscape
	public String getResponse();

	/**
	 * Sets the response of this result history ministry.
	 *
	 * @param response the response of this result history ministry
	 */
	public void setResponse(String response);

	/**
	 * Returns the remarks of this result history ministry.
	 *
	 * @return the remarks of this result history ministry
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this result history ministry.
	 *
	 * @param remarks the remarks of this result history ministry
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
	public int compareTo(ResultHistoryMinistry resultHistoryMinistry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ResultHistoryMinistry> toCacheModel();

	@Override
	public ResultHistoryMinistry toEscapedModel();

	@Override
	public ResultHistoryMinistry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}