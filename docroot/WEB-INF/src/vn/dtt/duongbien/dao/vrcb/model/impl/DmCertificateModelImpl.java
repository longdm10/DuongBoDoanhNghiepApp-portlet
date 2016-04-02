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

import vn.dtt.duongbien.dao.vrcb.model.DmCertificate;
import vn.dtt.duongbien.dao.vrcb.model.DmCertificateModel;
import vn.dtt.duongbien.dao.vrcb.model.DmCertificateSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DmCertificate service. Represents a row in the &quot;DM_CERTIFICATE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmCertificateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmCertificateImpl}.
 * </p>
 *
 * @author longdm
 * @see DmCertificateImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmCertificate
 * @see vn.dtt.duongbien.dao.vrcb.model.DmCertificateModel
 * @generated
 */
@JSON(strict = true)
public class DmCertificateModelImpl extends BaseModelImpl<DmCertificate>
	implements DmCertificateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm certificate model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmCertificate} interface instead.
	 */
	public static final String TABLE_NAME = "DM_CERTIFICATE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "CertificateCode", Types.VARCHAR },
			{ "CertificateName", Types.VARCHAR },
			{ "CertificateNameVN", Types.VARCHAR },
			{ "CertificateOrder", Types.INTEGER },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_CERTIFICATE (ID LONG not null primary key,CertificateCode VARCHAR(75) null,CertificateName VARCHAR(75) null,CertificateNameVN VARCHAR(75) null,CertificateOrder INTEGER,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_CERTIFICATE";
	public static final String ORDER_BY_JPQL = " ORDER BY dmCertificate.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_CERTIFICATE.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmCertificate"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmCertificate"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.DmCertificate"),
			true);
	public static long CERTIFICATECODE_COLUMN_BITMASK = 1L;
	public static long CERTIFICATENAME_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DmCertificate toModel(DmCertificateSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DmCertificate model = new DmCertificateImpl();

		model.setId(soapModel.getId());
		model.setCertificateCode(soapModel.getCertificateCode());
		model.setCertificateName(soapModel.getCertificateName());
		model.setCertificateNameVN(soapModel.getCertificateNameVN());
		model.setCertificateOrder(soapModel.getCertificateOrder());
		model.setIsDelete(soapModel.getIsDelete());
		model.setMarkedAsDelete(soapModel.getMarkedAsDelete());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setRequestedDate(soapModel.getRequestedDate());
		model.setSyncVersion(soapModel.getSyncVersion());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DmCertificate> toModels(DmCertificateSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DmCertificate> models = new ArrayList<DmCertificate>(soapModels.length);

		for (DmCertificateSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmCertificate"));

	public DmCertificateModelImpl() {
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
		return DmCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return DmCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("certificateCode", getCertificateCode());
		attributes.put("certificateName", getCertificateName());
		attributes.put("certificateNameVN", getCertificateNameVN());
		attributes.put("certificateOrder", getCertificateOrder());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String certificateCode = (String)attributes.get("certificateCode");

		if (certificateCode != null) {
			setCertificateCode(certificateCode);
		}

		String certificateName = (String)attributes.get("certificateName");

		if (certificateName != null) {
			setCertificateName(certificateName);
		}

		String certificateNameVN = (String)attributes.get("certificateNameVN");

		if (certificateNameVN != null) {
			setCertificateNameVN(certificateNameVN);
		}

		Integer certificateOrder = (Integer)attributes.get("certificateOrder");

		if (certificateOrder != null) {
			setCertificateOrder(certificateOrder);
		}

		Integer isDelete = (Integer)attributes.get("isDelete");

		if (isDelete != null) {
			setIsDelete(isDelete);
		}

		Integer markedAsDelete = (Integer)attributes.get("markedAsDelete");

		if (markedAsDelete != null) {
			setMarkedAsDelete(markedAsDelete);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
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
	public String getCertificateCode() {
		if (_certificateCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _certificateCode;
		}
	}

	@Override
	public void setCertificateCode(String certificateCode) {
		_columnBitmask |= CERTIFICATECODE_COLUMN_BITMASK;

		if (_originalCertificateCode == null) {
			_originalCertificateCode = _certificateCode;
		}

		_certificateCode = certificateCode;
	}

	public String getOriginalCertificateCode() {
		return GetterUtil.getString(_originalCertificateCode);
	}

	@JSON
	@Override
	public String getCertificateName() {
		if (_certificateName == null) {
			return StringPool.BLANK;
		}
		else {
			return _certificateName;
		}
	}

	@Override
	public void setCertificateName(String certificateName) {
		_columnBitmask |= CERTIFICATENAME_COLUMN_BITMASK;

		if (_originalCertificateName == null) {
			_originalCertificateName = _certificateName;
		}

		_certificateName = certificateName;
	}

	public String getOriginalCertificateName() {
		return GetterUtil.getString(_originalCertificateName);
	}

	@JSON
	@Override
	public String getCertificateNameVN() {
		if (_certificateNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _certificateNameVN;
		}
	}

	@Override
	public void setCertificateNameVN(String certificateNameVN) {
		_certificateNameVN = certificateNameVN;
	}

	@JSON
	@Override
	public int getCertificateOrder() {
		return _certificateOrder;
	}

	@Override
	public void setCertificateOrder(int certificateOrder) {
		_certificateOrder = certificateOrder;
	}

	@JSON
	@Override
	public int getIsDelete() {
		return _isDelete;
	}

	@Override
	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;
	}

	@JSON
	@Override
	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
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
	public String getSyncVersion() {
		if (_syncVersion == null) {
			return StringPool.BLANK;
		}
		else {
			return _syncVersion;
		}
	}

	@Override
	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DmCertificate.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DmCertificate toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmCertificate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmCertificateImpl dmCertificateImpl = new DmCertificateImpl();

		dmCertificateImpl.setId(getId());
		dmCertificateImpl.setCertificateCode(getCertificateCode());
		dmCertificateImpl.setCertificateName(getCertificateName());
		dmCertificateImpl.setCertificateNameVN(getCertificateNameVN());
		dmCertificateImpl.setCertificateOrder(getCertificateOrder());
		dmCertificateImpl.setIsDelete(getIsDelete());
		dmCertificateImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmCertificateImpl.setModifiedDate(getModifiedDate());
		dmCertificateImpl.setRequestedDate(getRequestedDate());
		dmCertificateImpl.setSyncVersion(getSyncVersion());

		dmCertificateImpl.resetOriginalValues();

		return dmCertificateImpl;
	}

	@Override
	public int compareTo(DmCertificate dmCertificate) {
		int value = 0;

		if (getId() < dmCertificate.getId()) {
			value = -1;
		}
		else if (getId() > dmCertificate.getId()) {
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

		if (!(obj instanceof DmCertificate)) {
			return false;
		}

		DmCertificate dmCertificate = (DmCertificate)obj;

		long primaryKey = dmCertificate.getPrimaryKey();

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
		DmCertificateModelImpl dmCertificateModelImpl = this;

		dmCertificateModelImpl._originalCertificateCode = dmCertificateModelImpl._certificateCode;

		dmCertificateModelImpl._originalCertificateName = dmCertificateModelImpl._certificateName;

		dmCertificateModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmCertificate> toCacheModel() {
		DmCertificateCacheModel dmCertificateCacheModel = new DmCertificateCacheModel();

		dmCertificateCacheModel.id = getId();

		dmCertificateCacheModel.certificateCode = getCertificateCode();

		String certificateCode = dmCertificateCacheModel.certificateCode;

		if ((certificateCode != null) && (certificateCode.length() == 0)) {
			dmCertificateCacheModel.certificateCode = null;
		}

		dmCertificateCacheModel.certificateName = getCertificateName();

		String certificateName = dmCertificateCacheModel.certificateName;

		if ((certificateName != null) && (certificateName.length() == 0)) {
			dmCertificateCacheModel.certificateName = null;
		}

		dmCertificateCacheModel.certificateNameVN = getCertificateNameVN();

		String certificateNameVN = dmCertificateCacheModel.certificateNameVN;

		if ((certificateNameVN != null) && (certificateNameVN.length() == 0)) {
			dmCertificateCacheModel.certificateNameVN = null;
		}

		dmCertificateCacheModel.certificateOrder = getCertificateOrder();

		dmCertificateCacheModel.isDelete = getIsDelete();

		dmCertificateCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmCertificateCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmCertificateCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmCertificateCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmCertificateCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmCertificateCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmCertificateCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmCertificateCacheModel.syncVersion = null;
		}

		return dmCertificateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", certificateCode=");
		sb.append(getCertificateCode());
		sb.append(", certificateName=");
		sb.append(getCertificateName());
		sb.append(", certificateNameVN=");
		sb.append(getCertificateNameVN());
		sb.append(", certificateOrder=");
		sb.append(getCertificateOrder());
		sb.append(", isDelete=");
		sb.append(getIsDelete());
		sb.append(", markedAsDelete=");
		sb.append(getMarkedAsDelete());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmCertificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateCode</column-name><column-value><![CDATA[");
		sb.append(getCertificateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateName</column-name><column-value><![CDATA[");
		sb.append(getCertificateName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNameVN</column-name><column-value><![CDATA[");
		sb.append(getCertificateNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOrder</column-name><column-value><![CDATA[");
		sb.append(getCertificateOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDelete</column-name><column-value><![CDATA[");
		sb.append(getIsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAsDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkedAsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DmCertificate.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmCertificate.class
		};
	private long _id;
	private String _certificateCode;
	private String _originalCertificateCode;
	private String _certificateName;
	private String _originalCertificateName;
	private String _certificateNameVN;
	private int _certificateOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private long _columnBitmask;
	private DmCertificate _escapedModel;
}