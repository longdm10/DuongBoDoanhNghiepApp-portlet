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

package vn.dtt.duongbien.dao.vrcb.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbien.dao.vrcb.model.ResultNotification;
import vn.dtt.duongbien.dao.vrcb.model.ResultNotificationModel;
import vn.dtt.duongbien.dao.vrcb.model.ResultNotificationSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ResultNotification service. Represents a row in the &quot;result_notification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.ResultNotificationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ResultNotificationImpl}.
 * </p>
 *
 * @author longdm
 * @see ResultNotificationImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.ResultNotification
 * @see vn.dtt.duongbien.dao.vrcb.model.ResultNotificationModel
 * @generated
 */
@JSON(strict = true)
public class ResultNotificationModelImpl extends BaseModelImpl<ResultNotification>
	implements ResultNotificationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a result notification model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.ResultNotification} interface instead.
	 */
	public static final String TABLE_NAME = "result_notification";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "RequestState", Types.INTEGER },
			{ "DocumentName", Types.BIGINT },
			{ "DocumentYear", Types.INTEGER },
			{ "MaritimeCode", Types.VARCHAR },
			{ "Role", Types.BIGINT },
			{ "Response", Types.VARCHAR },
			{ "Organization", Types.VARCHAR },
			{ "Division", Types.VARCHAR },
			{ "OfficerName", Types.VARCHAR },
			{ "LatestDate", Types.VARCHAR },
			{ "BusinessTypeCode", Types.INTEGER },
			{ "Remarks", Types.VARCHAR },
			{ "IsReply", Types.INTEGER },
			{ "ResponseTime", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table result_notification (ID LONG not null primary key,RequestCode VARCHAR(75) null,RequestState INTEGER,DocumentName LONG,DocumentYear INTEGER,MaritimeCode VARCHAR(75) null,Role LONG,Response VARCHAR(75) null,Organization VARCHAR(75) null,Division VARCHAR(75) null,OfficerName VARCHAR(75) null,LatestDate VARCHAR(75) null,BusinessTypeCode INTEGER,Remarks VARCHAR(75) null,IsReply INTEGER,ResponseTime DATE null)";
	public static final String TABLE_SQL_DROP = "drop table result_notification";
	public static final String ORDER_BY_JPQL = " ORDER BY resultNotification.id DESC";
	public static final String ORDER_BY_SQL = " ORDER BY result_notification.ID DESC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.ResultNotification"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.ResultNotification"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.ResultNotification"),
			true);
	public static long BUSINESSTYPECODE_COLUMN_BITMASK = 1L;
	public static long DOCUMENTNAME_COLUMN_BITMASK = 2L;
	public static long DOCUMENTYEAR_COLUMN_BITMASK = 4L;
	public static long ID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ResultNotification toModel(ResultNotificationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ResultNotification model = new ResultNotificationImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setRequestState(soapModel.getRequestState());
		model.setDocumentName(soapModel.getDocumentName());
		model.setDocumentYear(soapModel.getDocumentYear());
		model.setMaritimeCode(soapModel.getMaritimeCode());
		model.setRole(soapModel.getRole());
		model.setResponse(soapModel.getResponse());
		model.setOrganization(soapModel.getOrganization());
		model.setDivision(soapModel.getDivision());
		model.setOfficerName(soapModel.getOfficerName());
		model.setLatestDate(soapModel.getLatestDate());
		model.setBusinessTypeCode(soapModel.getBusinessTypeCode());
		model.setRemarks(soapModel.getRemarks());
		model.setIsReply(soapModel.getIsReply());
		model.setResponseTime(soapModel.getResponseTime());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ResultNotification> toModels(
		ResultNotificationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ResultNotification> models = new ArrayList<ResultNotification>(soapModels.length);

		for (ResultNotificationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.ResultNotification"));

	public ResultNotificationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ResultNotification.class;
	}

	@Override
	public String getModelClassName() {
		return ResultNotification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("role", getRole());
		attributes.put("response", getResponse());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("officerName", getOfficerName());
		attributes.put("latestDate", getLatestDate());
		attributes.put("businessTypeCode", getBusinessTypeCode());
		attributes.put("remarks", getRemarks());
		attributes.put("isReply", getIsReply());
		attributes.put("responseTime", getResponseTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String requestCode = (String)attributes.get("requestCode");

		if (requestCode != null) {
			setRequestCode(requestCode);
		}

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
		}

		Long role = (Long)attributes.get("role");

		if (role != null) {
			setRole(role);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String officerName = (String)attributes.get("officerName");

		if (officerName != null) {
			setOfficerName(officerName);
		}

		String latestDate = (String)attributes.get("latestDate");

		if (latestDate != null) {
			setLatestDate(latestDate);
		}

		Integer businessTypeCode = (Integer)attributes.get("businessTypeCode");

		if (businessTypeCode != null) {
			setBusinessTypeCode(businessTypeCode);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer isReply = (Integer)attributes.get("isReply");

		if (isReply != null) {
			setIsReply(isReply);
		}

		Date responseTime = (Date)attributes.get("responseTime");

		if (responseTime != null) {
			setResponseTime(responseTime);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public String getRequestCode() {
		if (_requestCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestCode;
		}
	}

	@Override
	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;
	}

	@JSON
	@Override
	public int getRequestState() {
		return _requestState;
	}

	@Override
	public void setRequestState(int requestState) {
		_requestState = requestState;
	}

	@JSON
	@Override
	public long getDocumentName() {
		return _documentName;
	}

	@Override
	public void setDocumentName(long documentName) {
		_columnBitmask |= DOCUMENTNAME_COLUMN_BITMASK;

		if (!_setOriginalDocumentName) {
			_setOriginalDocumentName = true;

			_originalDocumentName = _documentName;
		}

		_documentName = documentName;
	}

	public long getOriginalDocumentName() {
		return _originalDocumentName;
	}

	@JSON
	@Override
	public int getDocumentYear() {
		return _documentYear;
	}

	@Override
	public void setDocumentYear(int documentYear) {
		_columnBitmask |= DOCUMENTYEAR_COLUMN_BITMASK;

		if (!_setOriginalDocumentYear) {
			_setOriginalDocumentYear = true;

			_originalDocumentYear = _documentYear;
		}

		_documentYear = documentYear;
	}

	public int getOriginalDocumentYear() {
		return _originalDocumentYear;
	}

	@JSON
	@Override
	public String getMaritimeCode() {
		if (_maritimeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _maritimeCode;
		}
	}

	@Override
	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	@JSON
	@Override
	public long getRole() {
		return _role;
	}

	@Override
	public void setRole(long role) {
		_role = role;
	}

	@JSON
	@Override
	public String getResponse() {
		if (_response == null) {
			return StringPool.BLANK;
		}
		else {
			return _response;
		}
	}

	@Override
	public void setResponse(String response) {
		_response = response;
	}

	@JSON
	@Override
	public String getOrganization() {
		if (_organization == null) {
			return StringPool.BLANK;
		}
		else {
			return _organization;
		}
	}

	@Override
	public void setOrganization(String organization) {
		_organization = organization;
	}

	@JSON
	@Override
	public String getDivision() {
		if (_division == null) {
			return StringPool.BLANK;
		}
		else {
			return _division;
		}
	}

	@Override
	public void setDivision(String division) {
		_division = division;
	}

	@JSON
	@Override
	public String getOfficerName() {
		if (_officerName == null) {
			return StringPool.BLANK;
		}
		else {
			return _officerName;
		}
	}

	@Override
	public void setOfficerName(String officerName) {
		_officerName = officerName;
	}

	@JSON
	@Override
	public String getLatestDate() {
		if (_latestDate == null) {
			return StringPool.BLANK;
		}
		else {
			return _latestDate;
		}
	}

	@Override
	public void setLatestDate(String latestDate) {
		_latestDate = latestDate;
	}

	@JSON
	@Override
	public int getBusinessTypeCode() {
		return _businessTypeCode;
	}

	@Override
	public void setBusinessTypeCode(int businessTypeCode) {
		_columnBitmask |= BUSINESSTYPECODE_COLUMN_BITMASK;

		if (!_setOriginalBusinessTypeCode) {
			_setOriginalBusinessTypeCode = true;

			_originalBusinessTypeCode = _businessTypeCode;
		}

		_businessTypeCode = businessTypeCode;
	}

	public int getOriginalBusinessTypeCode() {
		return _originalBusinessTypeCode;
	}

	@JSON
	@Override
	public String getRemarks() {
		if (_remarks == null) {
			return StringPool.BLANK;
		}
		else {
			return _remarks;
		}
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	@JSON
	@Override
	public int getIsReply() {
		return _isReply;
	}

	@Override
	public void setIsReply(int isReply) {
		_isReply = isReply;
	}

	@JSON
	@Override
	public Date getResponseTime() {
		return _responseTime;
	}

	@Override
	public void setResponseTime(Date responseTime) {
		_responseTime = responseTime;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ResultNotification.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ResultNotification toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ResultNotification)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ResultNotificationImpl resultNotificationImpl = new ResultNotificationImpl();

		resultNotificationImpl.setId(getId());
		resultNotificationImpl.setRequestCode(getRequestCode());
		resultNotificationImpl.setRequestState(getRequestState());
		resultNotificationImpl.setDocumentName(getDocumentName());
		resultNotificationImpl.setDocumentYear(getDocumentYear());
		resultNotificationImpl.setMaritimeCode(getMaritimeCode());
		resultNotificationImpl.setRole(getRole());
		resultNotificationImpl.setResponse(getResponse());
		resultNotificationImpl.setOrganization(getOrganization());
		resultNotificationImpl.setDivision(getDivision());
		resultNotificationImpl.setOfficerName(getOfficerName());
		resultNotificationImpl.setLatestDate(getLatestDate());
		resultNotificationImpl.setBusinessTypeCode(getBusinessTypeCode());
		resultNotificationImpl.setRemarks(getRemarks());
		resultNotificationImpl.setIsReply(getIsReply());
		resultNotificationImpl.setResponseTime(getResponseTime());

		resultNotificationImpl.resetOriginalValues();

		return resultNotificationImpl;
	}

	@Override
	public int compareTo(ResultNotification resultNotification) {
		int value = 0;

		if (getId() < resultNotification.getId()) {
			value = -1;
		}
		else if (getId() > resultNotification.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultNotification)) {
			return false;
		}

		ResultNotification resultNotification = (ResultNotification)obj;

		long primaryKey = resultNotification.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ResultNotificationModelImpl resultNotificationModelImpl = this;

		resultNotificationModelImpl._originalDocumentName = resultNotificationModelImpl._documentName;

		resultNotificationModelImpl._setOriginalDocumentName = false;

		resultNotificationModelImpl._originalDocumentYear = resultNotificationModelImpl._documentYear;

		resultNotificationModelImpl._setOriginalDocumentYear = false;

		resultNotificationModelImpl._originalBusinessTypeCode = resultNotificationModelImpl._businessTypeCode;

		resultNotificationModelImpl._setOriginalBusinessTypeCode = false;

		resultNotificationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ResultNotification> toCacheModel() {
		ResultNotificationCacheModel resultNotificationCacheModel = new ResultNotificationCacheModel();

		resultNotificationCacheModel.id = getId();

		resultNotificationCacheModel.requestCode = getRequestCode();

		String requestCode = resultNotificationCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			resultNotificationCacheModel.requestCode = null;
		}

		resultNotificationCacheModel.requestState = getRequestState();

		resultNotificationCacheModel.documentName = getDocumentName();

		resultNotificationCacheModel.documentYear = getDocumentYear();

		resultNotificationCacheModel.maritimeCode = getMaritimeCode();

		String maritimeCode = resultNotificationCacheModel.maritimeCode;

		if ((maritimeCode != null) && (maritimeCode.length() == 0)) {
			resultNotificationCacheModel.maritimeCode = null;
		}

		resultNotificationCacheModel.role = getRole();

		resultNotificationCacheModel.response = getResponse();

		String response = resultNotificationCacheModel.response;

		if ((response != null) && (response.length() == 0)) {
			resultNotificationCacheModel.response = null;
		}

		resultNotificationCacheModel.organization = getOrganization();

		String organization = resultNotificationCacheModel.organization;

		if ((organization != null) && (organization.length() == 0)) {
			resultNotificationCacheModel.organization = null;
		}

		resultNotificationCacheModel.division = getDivision();

		String division = resultNotificationCacheModel.division;

		if ((division != null) && (division.length() == 0)) {
			resultNotificationCacheModel.division = null;
		}

		resultNotificationCacheModel.officerName = getOfficerName();

		String officerName = resultNotificationCacheModel.officerName;

		if ((officerName != null) && (officerName.length() == 0)) {
			resultNotificationCacheModel.officerName = null;
		}

		resultNotificationCacheModel.latestDate = getLatestDate();

		String latestDate = resultNotificationCacheModel.latestDate;

		if ((latestDate != null) && (latestDate.length() == 0)) {
			resultNotificationCacheModel.latestDate = null;
		}

		resultNotificationCacheModel.businessTypeCode = getBusinessTypeCode();

		resultNotificationCacheModel.remarks = getRemarks();

		String remarks = resultNotificationCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			resultNotificationCacheModel.remarks = null;
		}

		resultNotificationCacheModel.isReply = getIsReply();

		Date responseTime = getResponseTime();

		if (responseTime != null) {
			resultNotificationCacheModel.responseTime = responseTime.getTime();
		}
		else {
			resultNotificationCacheModel.responseTime = Long.MIN_VALUE;
		}

		return resultNotificationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", role=");
		sb.append(getRole());
		sb.append(", response=");
		sb.append(getResponse());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", officerName=");
		sb.append(getOfficerName());
		sb.append(", latestDate=");
		sb.append(getLatestDate());
		sb.append(", businessTypeCode=");
		sb.append(getBusinessTypeCode());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", isReply=");
		sb.append(getIsReply());
		sb.append(", responseTime=");
		sb.append(getResponseTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.ResultNotification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>role</column-name><column-value><![CDATA[");
		sb.append(getRole());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>response</column-name><column-value><![CDATA[");
		sb.append(getResponse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>officerName</column-name><column-value><![CDATA[");
		sb.append(getOfficerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestDate</column-name><column-value><![CDATA[");
		sb.append(getLatestDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeCode</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isReply</column-name><column-value><![CDATA[");
		sb.append(getIsReply());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTime</column-name><column-value><![CDATA[");
		sb.append(getResponseTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ResultNotification.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ResultNotification.class
		};
	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private long _originalDocumentName;
	private boolean _setOriginalDocumentName;
	private int _documentYear;
	private int _originalDocumentYear;
	private boolean _setOriginalDocumentYear;
	private String _maritimeCode;
	private long _role;
	private String _response;
	private String _organization;
	private String _division;
	private String _officerName;
	private String _latestDate;
	private int _businessTypeCode;
	private int _originalBusinessTypeCode;
	private boolean _setOriginalBusinessTypeCode;
	private String _remarks;
	private int _isReply;
	private Date _responseTime;
	private long _columnBitmask;
	private ResultNotification _escapedModel;
}