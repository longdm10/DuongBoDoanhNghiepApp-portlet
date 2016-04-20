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

package vn.dtt.duongbo.dao.quocte.model.impl;

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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModel;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen service. Represents a row in the &quot;qlvt_xuly_gpkdvt_quocte_loaihinhvantai_tuyen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl
 * @see vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen
 * @see vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModel
 * @generated
 */
@JSON(strict = true)
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl
	extends BaseModelImpl<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>
	implements QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen model instance should use the {@link vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen} interface instead.
	 */
	public static final String TABLE_NAME = "qlvt_xuly_gpkdvt_quocte_loaihinhvantai_tuyen";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "GPKD_LOAIHINHKDID", Types.INTEGER },
			{ "MATUYEN", Types.VARCHAR },
			{ "TENTUYEN", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table qlvt_xuly_gpkdvt_quocte_loaihinhvantai_tuyen (ID LONG not null primary key,GPKD_LOAIHINHKDID INTEGER,MATUYEN VARCHAR(75) null,TENTUYEN VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table qlvt_xuly_gpkdvt_quocte_loaihinhvantai_tuyen";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY qlvt_xuly_gpkdvt_quocte_loaihinhvantai_tuyen.ID ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen"),
			true);
	public static long GPKDLOAIHINHKDID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen toModel(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen model = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl();

		model.setId(soapModel.getId());
		model.setGpkdLoaiHinhKdId(soapModel.getGpkdLoaiHinhKdId());
		model.setMaTuyen(soapModel.getMaTuyen());
		model.setTenTuyen(soapModel.getTenTuyen());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> toModels(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> models = new ArrayList<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>(soapModels.length);

		for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen"));

	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl() {
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
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpkdLoaiHinhKdId", getGpkdLoaiHinhKdId());
		attributes.put("maTuyen", getMaTuyen());
		attributes.put("tenTuyen", getTenTuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer gpkdLoaiHinhKdId = (Integer)attributes.get("gpkdLoaiHinhKdId");

		if (gpkdLoaiHinhKdId != null) {
			setGpkdLoaiHinhKdId(gpkdLoaiHinhKdId);
		}

		String maTuyen = (String)attributes.get("maTuyen");

		if (maTuyen != null) {
			setMaTuyen(maTuyen);
		}

		String tenTuyen = (String)attributes.get("tenTuyen");

		if (tenTuyen != null) {
			setTenTuyen(tenTuyen);
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
	public int getGpkdLoaiHinhKdId() {
		return _gpkdLoaiHinhKdId;
	}

	@Override
	public void setGpkdLoaiHinhKdId(int gpkdLoaiHinhKdId) {
		_columnBitmask |= GPKDLOAIHINHKDID_COLUMN_BITMASK;

		if (!_setOriginalGpkdLoaiHinhKdId) {
			_setOriginalGpkdLoaiHinhKdId = true;

			_originalGpkdLoaiHinhKdId = _gpkdLoaiHinhKdId;
		}

		_gpkdLoaiHinhKdId = gpkdLoaiHinhKdId;
	}

	public int getOriginalGpkdLoaiHinhKdId() {
		return _originalGpkdLoaiHinhKdId;
	}

	@JSON
	@Override
	public String getMaTuyen() {
		if (_maTuyen == null) {
			return StringPool.BLANK;
		}
		else {
			return _maTuyen;
		}
	}

	@Override
	public void setMaTuyen(String maTuyen) {
		_maTuyen = maTuyen;
	}

	@JSON
	@Override
	public String getTenTuyen() {
		if (_tenTuyen == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenTuyen;
		}
	}

	@Override
	public void setTenTuyen(String tenTuyen) {
		_tenTuyen = tenTuyen;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl =
			new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl();

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setId(getId());
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setGpkdLoaiHinhKdId(getGpkdLoaiHinhKdId());
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setMaTuyen(getMaTuyen());
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setTenTuyen(getTenTuyen());

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.resetOriginalValues();

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl;
	}

	@Override
	public int compareTo(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) {
		int value = 0;

		if (getId() < qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)) {
			return false;
		}

		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
			(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)obj;

		long primaryKey = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKey();

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
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl =
			this;

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl._originalGpkdLoaiHinhKdId = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl._gpkdLoaiHinhKdId;

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl._setOriginalGpkdLoaiHinhKdId = false;

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> toCacheModel() {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel =
			new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel();

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel.id = getId();

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel.gpkdLoaiHinhKdId = getGpkdLoaiHinhKdId();

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel.maTuyen = getMaTuyen();

		String maTuyen = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel.maTuyen;

		if ((maTuyen != null) && (maTuyen.length() == 0)) {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel.maTuyen = null;
		}

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel.tenTuyen = getTenTuyen();

		String tenTuyen = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel.tenTuyen;

		if ((tenTuyen != null) && (tenTuyen.length() == 0)) {
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel.tenTuyen = null;
		}

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", gpkdLoaiHinhKdId=");
		sb.append(getGpkdLoaiHinhKdId());
		sb.append(", maTuyen=");
		sb.append(getMaTuyen());
		sb.append(", tenTuyen=");
		sb.append(getTenTuyen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpkdLoaiHinhKdId</column-name><column-value><![CDATA[");
		sb.append(getGpkdLoaiHinhKdId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuyen</column-name><column-value><![CDATA[");
		sb.append(getMaTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTuyen</column-name><column-value><![CDATA[");
		sb.append(getTenTuyen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class
		};
	private long _id;
	private int _gpkdLoaiHinhKdId;
	private int _originalGpkdLoaiHinhKdId;
	private boolean _setOriginalGpkdLoaiHinhKdId;
	private String _maTuyen;
	private String _tenTuyen;
	private long _columnBitmask;
	private QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen _escapedModel;
}