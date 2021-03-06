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

package vn.dtt.duongbo.dao.motcua.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthcModel;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthcSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the OEPUserMgtWorkingUnit2tthc service. Represents a row in the &quot;oep_usermgt_workingunit2tthc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthcModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OEPUserMgtWorkingUnit2tthcImpl}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit2tthcImpl
 * @see vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc
 * @see vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthcModel
 * @generated
 */
@JSON(strict = true)
public class OEPUserMgtWorkingUnit2tthcModelImpl extends BaseModelImpl<OEPUserMgtWorkingUnit2tthc>
	implements OEPUserMgtWorkingUnit2tthcModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a o e p user mgt working unit2tthc model instance should use the {@link vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc} interface instead.
	 */
	public static final String TABLE_NAME = "oep_usermgt_workingunit2tthc";
	public static final Object[][] TABLE_COLUMNS = {
			{ "workingUnit2TTHCId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "workingUnitId", Types.BIGINT },
			{ "TTHCId", Types.BIGINT },
			{ "laDonViTiepNhanBanDau", Types.INTEGER },
			{ "parentWorkingUnitID", Types.BIGINT },
			{ "tiepNhanTrucTiep", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_usermgt_workingunit2tthc (workingUnit2TTHCId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,workingUnitId LONG,TTHCId LONG,laDonViTiepNhanBanDau INTEGER,parentWorkingUnitID LONG,tiepNhanTrucTiep INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table oep_usermgt_workingunit2tthc";
	public static final String ORDER_BY_JPQL = " ORDER BY oepUserMgtWorkingUnit2tthc.workingUnit2TTHCId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_usermgt_workingunit2tthc.workingUnit2TTHCId ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc"),
			true);
	public static long TTHCID_COLUMN_BITMASK = 1L;
	public static long WORKINGUNITID_COLUMN_BITMASK = 2L;
	public static long WORKINGUNIT2TTHCID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static OEPUserMgtWorkingUnit2tthc toModel(
		OEPUserMgtWorkingUnit2tthcSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		OEPUserMgtWorkingUnit2tthc model = new OEPUserMgtWorkingUnit2tthcImpl();

		model.setWorkingUnit2TTHCId(soapModel.getWorkingUnit2TTHCId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setWorkingUnitId(soapModel.getWorkingUnitId());
		model.setTTHCId(soapModel.getTTHCId());
		model.setLaDonViTiepNhanBanDau(soapModel.getLaDonViTiepNhanBanDau());
		model.setParentWorkingUnitID(soapModel.getParentWorkingUnitID());
		model.setTiepNhanTrucTiep(soapModel.getTiepNhanTrucTiep());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<OEPUserMgtWorkingUnit2tthc> toModels(
		OEPUserMgtWorkingUnit2tthcSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<OEPUserMgtWorkingUnit2tthc> models = new ArrayList<OEPUserMgtWorkingUnit2tthc>(soapModels.length);

		for (OEPUserMgtWorkingUnit2tthcSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc"));

	public OEPUserMgtWorkingUnit2tthcModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _workingUnit2TTHCId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWorkingUnit2TTHCId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _workingUnit2TTHCId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtWorkingUnit2tthc.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtWorkingUnit2tthc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workingUnit2TTHCId", getWorkingUnit2TTHCId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("TTHCId", getTTHCId());
		attributes.put("laDonViTiepNhanBanDau", getLaDonViTiepNhanBanDau());
		attributes.put("parentWorkingUnitID", getParentWorkingUnitID());
		attributes.put("tiepNhanTrucTiep", getTiepNhanTrucTiep());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workingUnit2TTHCId = (Long)attributes.get("workingUnit2TTHCId");

		if (workingUnit2TTHCId != null) {
			setWorkingUnit2TTHCId(workingUnit2TTHCId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Long TTHCId = (Long)attributes.get("TTHCId");

		if (TTHCId != null) {
			setTTHCId(TTHCId);
		}

		Integer laDonViTiepNhanBanDau = (Integer)attributes.get(
				"laDonViTiepNhanBanDau");

		if (laDonViTiepNhanBanDau != null) {
			setLaDonViTiepNhanBanDau(laDonViTiepNhanBanDau);
		}

		Long parentWorkingUnitID = (Long)attributes.get("parentWorkingUnitID");

		if (parentWorkingUnitID != null) {
			setParentWorkingUnitID(parentWorkingUnitID);
		}

		Integer tiepNhanTrucTiep = (Integer)attributes.get("tiepNhanTrucTiep");

		if (tiepNhanTrucTiep != null) {
			setTiepNhanTrucTiep(tiepNhanTrucTiep);
		}
	}

	@JSON
	@Override
	public long getWorkingUnit2TTHCId() {
		return _workingUnit2TTHCId;
	}

	@Override
	public void setWorkingUnit2TTHCId(long workingUnit2TTHCId) {
		_workingUnit2TTHCId = workingUnit2TTHCId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
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
	public long getWorkingUnitId() {
		return _workingUnitId;
	}

	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_columnBitmask |= WORKINGUNITID_COLUMN_BITMASK;

		if (!_setOriginalWorkingUnitId) {
			_setOriginalWorkingUnitId = true;

			_originalWorkingUnitId = _workingUnitId;
		}

		_workingUnitId = workingUnitId;
	}

	public long getOriginalWorkingUnitId() {
		return _originalWorkingUnitId;
	}

	@JSON
	@Override
	public long getTTHCId() {
		return _TTHCId;
	}

	@Override
	public void setTTHCId(long TTHCId) {
		_columnBitmask |= TTHCID_COLUMN_BITMASK;

		if (!_setOriginalTTHCId) {
			_setOriginalTTHCId = true;

			_originalTTHCId = _TTHCId;
		}

		_TTHCId = TTHCId;
	}

	public long getOriginalTTHCId() {
		return _originalTTHCId;
	}

	@JSON
	@Override
	public int getLaDonViTiepNhanBanDau() {
		return _laDonViTiepNhanBanDau;
	}

	@Override
	public void setLaDonViTiepNhanBanDau(int laDonViTiepNhanBanDau) {
		_laDonViTiepNhanBanDau = laDonViTiepNhanBanDau;
	}

	@JSON
	@Override
	public long getParentWorkingUnitID() {
		return _parentWorkingUnitID;
	}

	@Override
	public void setParentWorkingUnitID(long parentWorkingUnitID) {
		_parentWorkingUnitID = parentWorkingUnitID;
	}

	@JSON
	@Override
	public int getTiepNhanTrucTiep() {
		return _tiepNhanTrucTiep;
	}

	@Override
	public void setTiepNhanTrucTiep(int tiepNhanTrucTiep) {
		_tiepNhanTrucTiep = tiepNhanTrucTiep;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			OEPUserMgtWorkingUnit2tthc.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OEPUserMgtWorkingUnit2tthc toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (OEPUserMgtWorkingUnit2tthc)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OEPUserMgtWorkingUnit2tthcImpl oepUserMgtWorkingUnit2tthcImpl = new OEPUserMgtWorkingUnit2tthcImpl();

		oepUserMgtWorkingUnit2tthcImpl.setWorkingUnit2TTHCId(getWorkingUnit2TTHCId());
		oepUserMgtWorkingUnit2tthcImpl.setUserId(getUserId());
		oepUserMgtWorkingUnit2tthcImpl.setGroupId(getGroupId());
		oepUserMgtWorkingUnit2tthcImpl.setCompanyId(getCompanyId());
		oepUserMgtWorkingUnit2tthcImpl.setCreateDate(getCreateDate());
		oepUserMgtWorkingUnit2tthcImpl.setModifiedDate(getModifiedDate());
		oepUserMgtWorkingUnit2tthcImpl.setWorkingUnitId(getWorkingUnitId());
		oepUserMgtWorkingUnit2tthcImpl.setTTHCId(getTTHCId());
		oepUserMgtWorkingUnit2tthcImpl.setLaDonViTiepNhanBanDau(getLaDonViTiepNhanBanDau());
		oepUserMgtWorkingUnit2tthcImpl.setParentWorkingUnitID(getParentWorkingUnitID());
		oepUserMgtWorkingUnit2tthcImpl.setTiepNhanTrucTiep(getTiepNhanTrucTiep());

		oepUserMgtWorkingUnit2tthcImpl.resetOriginalValues();

		return oepUserMgtWorkingUnit2tthcImpl;
	}

	@Override
	public int compareTo(OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		long primaryKey = oepUserMgtWorkingUnit2tthc.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtWorkingUnit2tthc)) {
			return false;
		}

		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = (OEPUserMgtWorkingUnit2tthc)obj;

		long primaryKey = oepUserMgtWorkingUnit2tthc.getPrimaryKey();

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
		OEPUserMgtWorkingUnit2tthcModelImpl oepUserMgtWorkingUnit2tthcModelImpl = this;

		oepUserMgtWorkingUnit2tthcModelImpl._originalWorkingUnitId = oepUserMgtWorkingUnit2tthcModelImpl._workingUnitId;

		oepUserMgtWorkingUnit2tthcModelImpl._setOriginalWorkingUnitId = false;

		oepUserMgtWorkingUnit2tthcModelImpl._originalTTHCId = oepUserMgtWorkingUnit2tthcModelImpl._TTHCId;

		oepUserMgtWorkingUnit2tthcModelImpl._setOriginalTTHCId = false;

		oepUserMgtWorkingUnit2tthcModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<OEPUserMgtWorkingUnit2tthc> toCacheModel() {
		OEPUserMgtWorkingUnit2tthcCacheModel oepUserMgtWorkingUnit2tthcCacheModel =
			new OEPUserMgtWorkingUnit2tthcCacheModel();

		oepUserMgtWorkingUnit2tthcCacheModel.workingUnit2TTHCId = getWorkingUnit2TTHCId();

		oepUserMgtWorkingUnit2tthcCacheModel.userId = getUserId();

		oepUserMgtWorkingUnit2tthcCacheModel.groupId = getGroupId();

		oepUserMgtWorkingUnit2tthcCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			oepUserMgtWorkingUnit2tthcCacheModel.createDate = createDate.getTime();
		}
		else {
			oepUserMgtWorkingUnit2tthcCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			oepUserMgtWorkingUnit2tthcCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			oepUserMgtWorkingUnit2tthcCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		oepUserMgtWorkingUnit2tthcCacheModel.workingUnitId = getWorkingUnitId();

		oepUserMgtWorkingUnit2tthcCacheModel.TTHCId = getTTHCId();

		oepUserMgtWorkingUnit2tthcCacheModel.laDonViTiepNhanBanDau = getLaDonViTiepNhanBanDau();

		oepUserMgtWorkingUnit2tthcCacheModel.parentWorkingUnitID = getParentWorkingUnitID();

		oepUserMgtWorkingUnit2tthcCacheModel.tiepNhanTrucTiep = getTiepNhanTrucTiep();

		return oepUserMgtWorkingUnit2tthcCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{workingUnit2TTHCId=");
		sb.append(getWorkingUnit2TTHCId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", workingUnitId=");
		sb.append(getWorkingUnitId());
		sb.append(", TTHCId=");
		sb.append(getTTHCId());
		sb.append(", laDonViTiepNhanBanDau=");
		sb.append(getLaDonViTiepNhanBanDau());
		sb.append(", parentWorkingUnitID=");
		sb.append(getParentWorkingUnitID());
		sb.append(", tiepNhanTrucTiep=");
		sb.append(getTiepNhanTrucTiep());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>workingUnit2TTHCId</column-name><column-value><![CDATA[");
		sb.append(getWorkingUnit2TTHCId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workingUnitId</column-name><column-value><![CDATA[");
		sb.append(getWorkingUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TTHCId</column-name><column-value><![CDATA[");
		sb.append(getTTHCId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>laDonViTiepNhanBanDau</column-name><column-value><![CDATA[");
		sb.append(getLaDonViTiepNhanBanDau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentWorkingUnitID</column-name><column-value><![CDATA[");
		sb.append(getParentWorkingUnitID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiepNhanTrucTiep</column-name><column-value><![CDATA[");
		sb.append(getTiepNhanTrucTiep());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = OEPUserMgtWorkingUnit2tthc.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			OEPUserMgtWorkingUnit2tthc.class
		};
	private long _workingUnit2TTHCId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _workingUnitId;
	private long _originalWorkingUnitId;
	private boolean _setOriginalWorkingUnitId;
	private long _TTHCId;
	private long _originalTTHCId;
	private boolean _setOriginalTTHCId;
	private int _laDonViTiepNhanBanDau;
	private long _parentWorkingUnitID;
	private int _tiepNhanTrucTiep;
	private long _columnBitmask;
	private OEPUserMgtWorkingUnit2tthc _escapedModel;
}