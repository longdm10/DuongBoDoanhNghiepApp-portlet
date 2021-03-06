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

import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField;
import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestFieldModel;
import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestFieldSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the InterfaceRequestField service. Represents a row in the &quot;INTERFACE_REQUEST&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestFieldModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InterfaceRequestFieldImpl}.
 * </p>
 *
 * @author longdm
 * @see InterfaceRequestFieldImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField
 * @see vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestFieldModel
 * @generated
 */
@JSON(strict = true)
public class InterfaceRequestFieldModelImpl extends BaseModelImpl<InterfaceRequestField>
	implements InterfaceRequestFieldModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a interface request field model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField} interface instead.
	 */
	public static final String TABLE_NAME = "INTERFACE_REQUEST";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "OrganizationCode", Types.VARCHAR },
			{ "LocCode", Types.VARCHAR },
			{ "RequestDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "RequestDirection", Types.VARCHAR },
			{ "RequestState", Types.INTEGER },
			{ "RequestResponseTime", Types.TIMESTAMP },
			{ "DocumentType", Types.VARCHAR },
			{ "BusinessType", Types.VARCHAR },
			{ "FunctionType", Types.VARCHAR },
			{ "SenderName", Types.VARCHAR },
			{ "RequestVersion", Types.VARCHAR },
			{ "SenderIdentify", Types.VARCHAR },
			{ "ReceiverName", Types.VARCHAR },
			{ "SendingDate", Types.TIMESTAMP },
			{ "ReceiverIdentify", Types.VARCHAR },
			{ "Remarks", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table INTERFACE_REQUEST (ID LONG not null primary key,RequestCode VARCHAR(75) null,OrganizationCode VARCHAR(75) null,LocCode VARCHAR(75) null,RequestDate DATE null,RequestedDate DATE null,RequestDirection VARCHAR(75) null,RequestState INTEGER,RequestResponseTime DATE null,DocumentType VARCHAR(75) null,BusinessType VARCHAR(75) null,FunctionType VARCHAR(75) null,SenderName VARCHAR(75) null,RequestVersion VARCHAR(75) null,SenderIdentify VARCHAR(75) null,ReceiverName VARCHAR(75) null,SendingDate DATE null,ReceiverIdentify VARCHAR(75) null,Remarks VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table INTERFACE_REQUEST";
	public static final String ORDER_BY_JPQL = " ORDER BY interfaceRequestField.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY INTERFACE_REQUEST.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField"),
			true);
	public static long LOCCODE_COLUMN_BITMASK = 1L;
	public static long ORGANIZATIONCODE_COLUMN_BITMASK = 2L;
	public static long REQUESTCODE_COLUMN_BITMASK = 4L;
	public static long ID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static InterfaceRequestField toModel(
		InterfaceRequestFieldSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		InterfaceRequestField model = new InterfaceRequestFieldImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setOrganizationCode(soapModel.getOrganizationCode());
		model.setLocCode(soapModel.getLocCode());
		model.setRequestDate(soapModel.getRequestDate());
		model.setRequestedDate(soapModel.getRequestedDate());
		model.setRequestDirection(soapModel.getRequestDirection());
		model.setRequestState(soapModel.getRequestState());
		model.setRequestResponseTime(soapModel.getRequestResponseTime());
		model.setDocumentType(soapModel.getDocumentType());
		model.setBusinessType(soapModel.getBusinessType());
		model.setFunctionType(soapModel.getFunctionType());
		model.setSenderName(soapModel.getSenderName());
		model.setRequestVersion(soapModel.getRequestVersion());
		model.setSenderIdentify(soapModel.getSenderIdentify());
		model.setReceiverName(soapModel.getReceiverName());
		model.setSendingDate(soapModel.getSendingDate());
		model.setReceiverIdentify(soapModel.getReceiverIdentify());
		model.setRemarks(soapModel.getRemarks());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<InterfaceRequestField> toModels(
		InterfaceRequestFieldSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<InterfaceRequestField> models = new ArrayList<InterfaceRequestField>(soapModels.length);

		for (InterfaceRequestFieldSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField"));

	public InterfaceRequestFieldModelImpl() {
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
		return InterfaceRequestField.class;
	}

	@Override
	public String getModelClassName() {
		return InterfaceRequestField.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("organizationCode", getOrganizationCode());
		attributes.put("locCode", getLocCode());
		attributes.put("requestDate", getRequestDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("requestDirection", getRequestDirection());
		attributes.put("requestState", getRequestState());
		attributes.put("requestResponseTime", getRequestResponseTime());
		attributes.put("documentType", getDocumentType());
		attributes.put("businessType", getBusinessType());
		attributes.put("functionType", getFunctionType());
		attributes.put("senderName", getSenderName());
		attributes.put("requestVersion", getRequestVersion());
		attributes.put("senderIdentify", getSenderIdentify());
		attributes.put("receiverName", getReceiverName());
		attributes.put("sendingDate", getSendingDate());
		attributes.put("receiverIdentify", getReceiverIdentify());
		attributes.put("remarks", getRemarks());

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

		String organizationCode = (String)attributes.get("organizationCode");

		if (organizationCode != null) {
			setOrganizationCode(organizationCode);
		}

		String locCode = (String)attributes.get("locCode");

		if (locCode != null) {
			setLocCode(locCode);
		}

		Date requestDate = (Date)attributes.get("requestDate");

		if (requestDate != null) {
			setRequestDate(requestDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String requestDirection = (String)attributes.get("requestDirection");

		if (requestDirection != null) {
			setRequestDirection(requestDirection);
		}

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Date requestResponseTime = (Date)attributes.get("requestResponseTime");

		if (requestResponseTime != null) {
			setRequestResponseTime(requestResponseTime);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String businessType = (String)attributes.get("businessType");

		if (businessType != null) {
			setBusinessType(businessType);
		}

		String functionType = (String)attributes.get("functionType");

		if (functionType != null) {
			setFunctionType(functionType);
		}

		String senderName = (String)attributes.get("senderName");

		if (senderName != null) {
			setSenderName(senderName);
		}

		String requestVersion = (String)attributes.get("requestVersion");

		if (requestVersion != null) {
			setRequestVersion(requestVersion);
		}

		String senderIdentify = (String)attributes.get("senderIdentify");

		if (senderIdentify != null) {
			setSenderIdentify(senderIdentify);
		}

		String receiverName = (String)attributes.get("receiverName");

		if (receiverName != null) {
			setReceiverName(receiverName);
		}

		Date sendingDate = (Date)attributes.get("sendingDate");

		if (sendingDate != null) {
			setSendingDate(sendingDate);
		}

		String receiverIdentify = (String)attributes.get("receiverIdentify");

		if (receiverIdentify != null) {
			setReceiverIdentify(receiverIdentify);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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
		_columnBitmask |= REQUESTCODE_COLUMN_BITMASK;

		if (_originalRequestCode == null) {
			_originalRequestCode = _requestCode;
		}

		_requestCode = requestCode;
	}

	public String getOriginalRequestCode() {
		return GetterUtil.getString(_originalRequestCode);
	}

	@JSON
	@Override
	public String getOrganizationCode() {
		if (_organizationCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _organizationCode;
		}
	}

	@Override
	public void setOrganizationCode(String organizationCode) {
		_columnBitmask |= ORGANIZATIONCODE_COLUMN_BITMASK;

		if (_originalOrganizationCode == null) {
			_originalOrganizationCode = _organizationCode;
		}

		_organizationCode = organizationCode;
	}

	public String getOriginalOrganizationCode() {
		return GetterUtil.getString(_originalOrganizationCode);
	}

	@JSON
	@Override
	public String getLocCode() {
		if (_locCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _locCode;
		}
	}

	@Override
	public void setLocCode(String locCode) {
		_columnBitmask |= LOCCODE_COLUMN_BITMASK;

		if (_originalLocCode == null) {
			_originalLocCode = _locCode;
		}

		_locCode = locCode;
	}

	public String getOriginalLocCode() {
		return GetterUtil.getString(_originalLocCode);
	}

	@JSON
	@Override
	public Date getRequestDate() {
		return _requestDate;
	}

	@Override
	public void setRequestDate(Date requestDate) {
		_requestDate = requestDate;
	}

	@JSON
	@Override
	public Date getRequestedDate() {
		return _requestedDate;
	}

	@Override
	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	@JSON
	@Override
	public String getRequestDirection() {
		if (_requestDirection == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestDirection;
		}
	}

	@Override
	public void setRequestDirection(String requestDirection) {
		_requestDirection = requestDirection;
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
	public Date getRequestResponseTime() {
		return _requestResponseTime;
	}

	@Override
	public void setRequestResponseTime(Date requestResponseTime) {
		_requestResponseTime = requestResponseTime;
	}

	@JSON
	@Override
	public String getDocumentType() {
		if (_documentType == null) {
			return StringPool.BLANK;
		}
		else {
			return _documentType;
		}
	}

	@Override
	public void setDocumentType(String documentType) {
		_documentType = documentType;
	}

	@JSON
	@Override
	public String getBusinessType() {
		if (_businessType == null) {
			return StringPool.BLANK;
		}
		else {
			return _businessType;
		}
	}

	@Override
	public void setBusinessType(String businessType) {
		_businessType = businessType;
	}

	@JSON
	@Override
	public String getFunctionType() {
		if (_functionType == null) {
			return StringPool.BLANK;
		}
		else {
			return _functionType;
		}
	}

	@Override
	public void setFunctionType(String functionType) {
		_functionType = functionType;
	}

	@JSON
	@Override
	public String getSenderName() {
		if (_senderName == null) {
			return StringPool.BLANK;
		}
		else {
			return _senderName;
		}
	}

	@Override
	public void setSenderName(String senderName) {
		_senderName = senderName;
	}

	@JSON
	@Override
	public String getRequestVersion() {
		if (_requestVersion == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestVersion;
		}
	}

	@Override
	public void setRequestVersion(String requestVersion) {
		_requestVersion = requestVersion;
	}

	@JSON
	@Override
	public String getSenderIdentify() {
		if (_senderIdentify == null) {
			return StringPool.BLANK;
		}
		else {
			return _senderIdentify;
		}
	}

	@Override
	public void setSenderIdentify(String senderIdentify) {
		_senderIdentify = senderIdentify;
	}

	@JSON
	@Override
	public String getReceiverName() {
		if (_receiverName == null) {
			return StringPool.BLANK;
		}
		else {
			return _receiverName;
		}
	}

	@Override
	public void setReceiverName(String receiverName) {
		_receiverName = receiverName;
	}

	@JSON
	@Override
	public Date getSendingDate() {
		return _sendingDate;
	}

	@Override
	public void setSendingDate(Date sendingDate) {
		_sendingDate = sendingDate;
	}

	@JSON
	@Override
	public String getReceiverIdentify() {
		if (_receiverIdentify == null) {
			return StringPool.BLANK;
		}
		else {
			return _receiverIdentify;
		}
	}

	@Override
	public void setReceiverIdentify(String receiverIdentify) {
		_receiverIdentify = receiverIdentify;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			InterfaceRequestField.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public InterfaceRequestField toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (InterfaceRequestField)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		InterfaceRequestFieldImpl interfaceRequestFieldImpl = new InterfaceRequestFieldImpl();

		interfaceRequestFieldImpl.setId(getId());
		interfaceRequestFieldImpl.setRequestCode(getRequestCode());
		interfaceRequestFieldImpl.setOrganizationCode(getOrganizationCode());
		interfaceRequestFieldImpl.setLocCode(getLocCode());
		interfaceRequestFieldImpl.setRequestDate(getRequestDate());
		interfaceRequestFieldImpl.setRequestedDate(getRequestedDate());
		interfaceRequestFieldImpl.setRequestDirection(getRequestDirection());
		interfaceRequestFieldImpl.setRequestState(getRequestState());
		interfaceRequestFieldImpl.setRequestResponseTime(getRequestResponseTime());
		interfaceRequestFieldImpl.setDocumentType(getDocumentType());
		interfaceRequestFieldImpl.setBusinessType(getBusinessType());
		interfaceRequestFieldImpl.setFunctionType(getFunctionType());
		interfaceRequestFieldImpl.setSenderName(getSenderName());
		interfaceRequestFieldImpl.setRequestVersion(getRequestVersion());
		interfaceRequestFieldImpl.setSenderIdentify(getSenderIdentify());
		interfaceRequestFieldImpl.setReceiverName(getReceiverName());
		interfaceRequestFieldImpl.setSendingDate(getSendingDate());
		interfaceRequestFieldImpl.setReceiverIdentify(getReceiverIdentify());
		interfaceRequestFieldImpl.setRemarks(getRemarks());

		interfaceRequestFieldImpl.resetOriginalValues();

		return interfaceRequestFieldImpl;
	}

	@Override
	public int compareTo(InterfaceRequestField interfaceRequestField) {
		int value = 0;

		if (getId() < interfaceRequestField.getId()) {
			value = -1;
		}
		else if (getId() > interfaceRequestField.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof InterfaceRequestField)) {
			return false;
		}

		InterfaceRequestField interfaceRequestField = (InterfaceRequestField)obj;

		long primaryKey = interfaceRequestField.getPrimaryKey();

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
		InterfaceRequestFieldModelImpl interfaceRequestFieldModelImpl = this;

		interfaceRequestFieldModelImpl._originalRequestCode = interfaceRequestFieldModelImpl._requestCode;

		interfaceRequestFieldModelImpl._originalOrganizationCode = interfaceRequestFieldModelImpl._organizationCode;

		interfaceRequestFieldModelImpl._originalLocCode = interfaceRequestFieldModelImpl._locCode;

		interfaceRequestFieldModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<InterfaceRequestField> toCacheModel() {
		InterfaceRequestFieldCacheModel interfaceRequestFieldCacheModel = new InterfaceRequestFieldCacheModel();

		interfaceRequestFieldCacheModel.id = getId();

		interfaceRequestFieldCacheModel.requestCode = getRequestCode();

		String requestCode = interfaceRequestFieldCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			interfaceRequestFieldCacheModel.requestCode = null;
		}

		interfaceRequestFieldCacheModel.organizationCode = getOrganizationCode();

		String organizationCode = interfaceRequestFieldCacheModel.organizationCode;

		if ((organizationCode != null) && (organizationCode.length() == 0)) {
			interfaceRequestFieldCacheModel.organizationCode = null;
		}

		interfaceRequestFieldCacheModel.locCode = getLocCode();

		String locCode = interfaceRequestFieldCacheModel.locCode;

		if ((locCode != null) && (locCode.length() == 0)) {
			interfaceRequestFieldCacheModel.locCode = null;
		}

		Date requestDate = getRequestDate();

		if (requestDate != null) {
			interfaceRequestFieldCacheModel.requestDate = requestDate.getTime();
		}
		else {
			interfaceRequestFieldCacheModel.requestDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			interfaceRequestFieldCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			interfaceRequestFieldCacheModel.requestedDate = Long.MIN_VALUE;
		}

		interfaceRequestFieldCacheModel.requestDirection = getRequestDirection();

		String requestDirection = interfaceRequestFieldCacheModel.requestDirection;

		if ((requestDirection != null) && (requestDirection.length() == 0)) {
			interfaceRequestFieldCacheModel.requestDirection = null;
		}

		interfaceRequestFieldCacheModel.requestState = getRequestState();

		Date requestResponseTime = getRequestResponseTime();

		if (requestResponseTime != null) {
			interfaceRequestFieldCacheModel.requestResponseTime = requestResponseTime.getTime();
		}
		else {
			interfaceRequestFieldCacheModel.requestResponseTime = Long.MIN_VALUE;
		}

		interfaceRequestFieldCacheModel.documentType = getDocumentType();

		String documentType = interfaceRequestFieldCacheModel.documentType;

		if ((documentType != null) && (documentType.length() == 0)) {
			interfaceRequestFieldCacheModel.documentType = null;
		}

		interfaceRequestFieldCacheModel.businessType = getBusinessType();

		String businessType = interfaceRequestFieldCacheModel.businessType;

		if ((businessType != null) && (businessType.length() == 0)) {
			interfaceRequestFieldCacheModel.businessType = null;
		}

		interfaceRequestFieldCacheModel.functionType = getFunctionType();

		String functionType = interfaceRequestFieldCacheModel.functionType;

		if ((functionType != null) && (functionType.length() == 0)) {
			interfaceRequestFieldCacheModel.functionType = null;
		}

		interfaceRequestFieldCacheModel.senderName = getSenderName();

		String senderName = interfaceRequestFieldCacheModel.senderName;

		if ((senderName != null) && (senderName.length() == 0)) {
			interfaceRequestFieldCacheModel.senderName = null;
		}

		interfaceRequestFieldCacheModel.requestVersion = getRequestVersion();

		String requestVersion = interfaceRequestFieldCacheModel.requestVersion;

		if ((requestVersion != null) && (requestVersion.length() == 0)) {
			interfaceRequestFieldCacheModel.requestVersion = null;
		}

		interfaceRequestFieldCacheModel.senderIdentify = getSenderIdentify();

		String senderIdentify = interfaceRequestFieldCacheModel.senderIdentify;

		if ((senderIdentify != null) && (senderIdentify.length() == 0)) {
			interfaceRequestFieldCacheModel.senderIdentify = null;
		}

		interfaceRequestFieldCacheModel.receiverName = getReceiverName();

		String receiverName = interfaceRequestFieldCacheModel.receiverName;

		if ((receiverName != null) && (receiverName.length() == 0)) {
			interfaceRequestFieldCacheModel.receiverName = null;
		}

		Date sendingDate = getSendingDate();

		if (sendingDate != null) {
			interfaceRequestFieldCacheModel.sendingDate = sendingDate.getTime();
		}
		else {
			interfaceRequestFieldCacheModel.sendingDate = Long.MIN_VALUE;
		}

		interfaceRequestFieldCacheModel.receiverIdentify = getReceiverIdentify();

		String receiverIdentify = interfaceRequestFieldCacheModel.receiverIdentify;

		if ((receiverIdentify != null) && (receiverIdentify.length() == 0)) {
			interfaceRequestFieldCacheModel.receiverIdentify = null;
		}

		interfaceRequestFieldCacheModel.remarks = getRemarks();

		String remarks = interfaceRequestFieldCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			interfaceRequestFieldCacheModel.remarks = null;
		}

		return interfaceRequestFieldCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", organizationCode=");
		sb.append(getOrganizationCode());
		sb.append(", locCode=");
		sb.append(getLocCode());
		sb.append(", requestDate=");
		sb.append(getRequestDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", requestDirection=");
		sb.append(getRequestDirection());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", requestResponseTime=");
		sb.append(getRequestResponseTime());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", businessType=");
		sb.append(getBusinessType());
		sb.append(", functionType=");
		sb.append(getFunctionType());
		sb.append(", senderName=");
		sb.append(getSenderName());
		sb.append(", requestVersion=");
		sb.append(getRequestVersion());
		sb.append(", senderIdentify=");
		sb.append(getSenderIdentify());
		sb.append(", receiverName=");
		sb.append(getReceiverName());
		sb.append(", sendingDate=");
		sb.append(getSendingDate());
		sb.append(", receiverIdentify=");
		sb.append(getReceiverIdentify());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField");
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
			"<column><column-name>organizationCode</column-name><column-value><![CDATA[");
		sb.append(getOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locCode</column-name><column-value><![CDATA[");
		sb.append(getLocCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDate</column-name><column-value><![CDATA[");
		sb.append(getRequestDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDirection</column-name><column-value><![CDATA[");
		sb.append(getRequestDirection());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestResponseTime</column-name><column-value><![CDATA[");
		sb.append(getRequestResponseTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessType</column-name><column-value><![CDATA[");
		sb.append(getBusinessType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionType</column-name><column-value><![CDATA[");
		sb.append(getFunctionType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderName</column-name><column-value><![CDATA[");
		sb.append(getSenderName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestVersion</column-name><column-value><![CDATA[");
		sb.append(getRequestVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderIdentify</column-name><column-value><![CDATA[");
		sb.append(getSenderIdentify());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverName</column-name><column-value><![CDATA[");
		sb.append(getReceiverName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sendingDate</column-name><column-value><![CDATA[");
		sb.append(getSendingDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverIdentify</column-name><column-value><![CDATA[");
		sb.append(getReceiverIdentify());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = InterfaceRequestField.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			InterfaceRequestField.class
		};
	private long _id;
	private String _requestCode;
	private String _originalRequestCode;
	private String _organizationCode;
	private String _originalOrganizationCode;
	private String _locCode;
	private String _originalLocCode;
	private Date _requestDate;
	private Date _requestedDate;
	private String _requestDirection;
	private int _requestState;
	private Date _requestResponseTime;
	private String _documentType;
	private String _businessType;
	private String _functionType;
	private String _senderName;
	private String _requestVersion;
	private String _senderIdentify;
	private String _receiverName;
	private Date _sendingDate;
	private String _receiverIdentify;
	private String _remarks;
	private long _columnBitmask;
	private InterfaceRequestField _escapedModel;
}