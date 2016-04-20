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

package vn.dtt.duongbo.dao.lienvan.model.impl;

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

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTaiModel;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTaiSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QlvtCapPhepGplvLoaiHinhVanTai service. Represents a row in the &quot;qlvt_capphep_gplienvan_loaihinhvantai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTaiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtCapPhepGplvLoaiHinhVanTaiImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvLoaiHinhVanTaiImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTaiModel
 * @generated
 */
@JSON(strict = true)
public class QlvtCapPhepGplvLoaiHinhVanTaiModelImpl extends BaseModelImpl<QlvtCapPhepGplvLoaiHinhVanTai>
	implements QlvtCapPhepGplvLoaiHinhVanTaiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt cap phep gplv loai hinh van tai model instance should use the {@link vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai} interface instead.
	 */
	public static final String TABLE_NAME = "qlvt_capphep_gplienvan_loaihinhvantai";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "GPLIENVANID", Types.BIGINT },
			{ "MALOAIHINHVANTAI", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table qlvt_capphep_gplienvan_loaihinhvantai (ID LONG not null primary key,GPLIENVANID LONG,MALOAIHINHVANTAI VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table qlvt_capphep_gplienvan_loaihinhvantai";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtCapPhepGplvLoaiHinhVanTai.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY qlvt_capphep_gplienvan_loaihinhvantai.ID ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QlvtCapPhepGplvLoaiHinhVanTai toModel(
		QlvtCapPhepGplvLoaiHinhVanTaiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QlvtCapPhepGplvLoaiHinhVanTai model = new QlvtCapPhepGplvLoaiHinhVanTaiImpl();

		model.setId(soapModel.getId());
		model.setGpLienVanId(soapModel.getGpLienVanId());
		model.setMaLoaiHinhVanTai(soapModel.getMaLoaiHinhVanTai());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QlvtCapPhepGplvLoaiHinhVanTai> toModels(
		QlvtCapPhepGplvLoaiHinhVanTaiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QlvtCapPhepGplvLoaiHinhVanTai> models = new ArrayList<QlvtCapPhepGplvLoaiHinhVanTai>(soapModels.length);

		for (QlvtCapPhepGplvLoaiHinhVanTaiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai"));

	public QlvtCapPhepGplvLoaiHinhVanTaiModelImpl() {
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
		return QlvtCapPhepGplvLoaiHinhVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGplvLoaiHinhVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpLienVanId", getGpLienVanId());
		attributes.put("maLoaiHinhVanTai", getMaLoaiHinhVanTai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpLienVanId = (Long)attributes.get("gpLienVanId");

		if (gpLienVanId != null) {
			setGpLienVanId(gpLienVanId);
		}

		String maLoaiHinhVanTai = (String)attributes.get("maLoaiHinhVanTai");

		if (maLoaiHinhVanTai != null) {
			setMaLoaiHinhVanTai(maLoaiHinhVanTai);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public long getGpLienVanId() {
		return _gpLienVanId;
	}

	@Override
	public void setGpLienVanId(long gpLienVanId) {
		_gpLienVanId = gpLienVanId;
	}

	@JSON
	@Override
	public String getMaLoaiHinhVanTai() {
		if (_maLoaiHinhVanTai == null) {
			return StringPool.BLANK;
		}
		else {
			return _maLoaiHinhVanTai;
		}
	}

	@Override
	public void setMaLoaiHinhVanTai(String maLoaiHinhVanTai) {
		_maLoaiHinhVanTai = maLoaiHinhVanTai;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtCapPhepGplvLoaiHinhVanTai.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtCapPhepGplvLoaiHinhVanTai toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtCapPhepGplvLoaiHinhVanTai)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtCapPhepGplvLoaiHinhVanTaiImpl qlvtCapPhepGplvLoaiHinhVanTaiImpl = new QlvtCapPhepGplvLoaiHinhVanTaiImpl();

		qlvtCapPhepGplvLoaiHinhVanTaiImpl.setId(getId());
		qlvtCapPhepGplvLoaiHinhVanTaiImpl.setGpLienVanId(getGpLienVanId());
		qlvtCapPhepGplvLoaiHinhVanTaiImpl.setMaLoaiHinhVanTai(getMaLoaiHinhVanTai());

		qlvtCapPhepGplvLoaiHinhVanTaiImpl.resetOriginalValues();

		return qlvtCapPhepGplvLoaiHinhVanTaiImpl;
	}

	@Override
	public int compareTo(
		QlvtCapPhepGplvLoaiHinhVanTai qlvtCapPhepGplvLoaiHinhVanTai) {
		int value = 0;

		if (getId() < qlvtCapPhepGplvLoaiHinhVanTai.getId()) {
			value = -1;
		}
		else if (getId() > qlvtCapPhepGplvLoaiHinhVanTai.getId()) {
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

		if (!(obj instanceof QlvtCapPhepGplvLoaiHinhVanTai)) {
			return false;
		}

		QlvtCapPhepGplvLoaiHinhVanTai qlvtCapPhepGplvLoaiHinhVanTai = (QlvtCapPhepGplvLoaiHinhVanTai)obj;

		long primaryKey = qlvtCapPhepGplvLoaiHinhVanTai.getPrimaryKey();

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
	}

	@Override
	public CacheModel<QlvtCapPhepGplvLoaiHinhVanTai> toCacheModel() {
		QlvtCapPhepGplvLoaiHinhVanTaiCacheModel qlvtCapPhepGplvLoaiHinhVanTaiCacheModel =
			new QlvtCapPhepGplvLoaiHinhVanTaiCacheModel();

		qlvtCapPhepGplvLoaiHinhVanTaiCacheModel.id = getId();

		qlvtCapPhepGplvLoaiHinhVanTaiCacheModel.gpLienVanId = getGpLienVanId();

		qlvtCapPhepGplvLoaiHinhVanTaiCacheModel.maLoaiHinhVanTai = getMaLoaiHinhVanTai();

		String maLoaiHinhVanTai = qlvtCapPhepGplvLoaiHinhVanTaiCacheModel.maLoaiHinhVanTai;

		if ((maLoaiHinhVanTai != null) && (maLoaiHinhVanTai.length() == 0)) {
			qlvtCapPhepGplvLoaiHinhVanTaiCacheModel.maLoaiHinhVanTai = null;
		}

		return qlvtCapPhepGplvLoaiHinhVanTaiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", gpLienVanId=");
		sb.append(getGpLienVanId());
		sb.append(", maLoaiHinhVanTai=");
		sb.append(getMaLoaiHinhVanTai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpLienVanId</column-name><column-value><![CDATA[");
		sb.append(getGpLienVanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maLoaiHinhVanTai</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiHinhVanTai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtCapPhepGplvLoaiHinhVanTai.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtCapPhepGplvLoaiHinhVanTai.class
		};
	private long _id;
	private long _gpLienVanId;
	private String _maLoaiHinhVanTai;
	private QlvtCapPhepGplvLoaiHinhVanTai _escapedModel;
}