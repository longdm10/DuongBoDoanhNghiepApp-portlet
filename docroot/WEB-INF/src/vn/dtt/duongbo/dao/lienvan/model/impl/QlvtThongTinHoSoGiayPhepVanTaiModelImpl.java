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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai;
import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTaiModel;
import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTaiSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QlvtThongTinHoSoGiayPhepVanTai service. Represents a row in the &quot;ngbiepvu_thongtinhoso_qlvt_giayphepvantai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTaiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtThongTinHoSoGiayPhepVanTaiImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoGiayPhepVanTaiImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTaiModel
 * @generated
 */
@JSON(strict = true)
public class QlvtThongTinHoSoGiayPhepVanTaiModelImpl extends BaseModelImpl<QlvtThongTinHoSoGiayPhepVanTai>
	implements QlvtThongTinHoSoGiayPhepVanTaiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt thong tin ho so giay phep van tai model instance should use the {@link vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai} interface instead.
	 */
	public static final String TABLE_NAME = "ngbiepvu_thongtinhoso_qlvt_giayphepvantai";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "nghiepvu_thongtinhosoID", Types.BIGINT },
			{ "qlvt_capphep_gpkdvtID", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table ngbiepvu_thongtinhoso_qlvt_giayphepvantai (ID LONG not null primary key,nghiepvu_thongtinhosoID LONG,qlvt_capphep_gpkdvtID LONG)";
	public static final String TABLE_SQL_DROP = "drop table ngbiepvu_thongtinhoso_qlvt_giayphepvantai";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtThongTinHoSoGiayPhepVanTai.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ngbiepvu_thongtinhoso_qlvt_giayphepvantai.ID ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QlvtThongTinHoSoGiayPhepVanTai toModel(
		QlvtThongTinHoSoGiayPhepVanTaiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QlvtThongTinHoSoGiayPhepVanTai model = new QlvtThongTinHoSoGiayPhepVanTaiImpl();

		model.setId(soapModel.getId());
		model.setThongtinhosoId(soapModel.getThongtinhosoId());
		model.setCapphepGpkdvtId(soapModel.getCapphepGpkdvtId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QlvtThongTinHoSoGiayPhepVanTai> toModels(
		QlvtThongTinHoSoGiayPhepVanTaiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QlvtThongTinHoSoGiayPhepVanTai> models = new ArrayList<QlvtThongTinHoSoGiayPhepVanTai>(soapModels.length);

		for (QlvtThongTinHoSoGiayPhepVanTaiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai"));

	public QlvtThongTinHoSoGiayPhepVanTaiModelImpl() {
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
		return QlvtThongTinHoSoGiayPhepVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoGiayPhepVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongtinhosoId", getThongtinhosoId());
		attributes.put("capphepGpkdvtId", getCapphepGpkdvtId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thongtinhosoId = (Long)attributes.get("thongtinhosoId");

		if (thongtinhosoId != null) {
			setThongtinhosoId(thongtinhosoId);
		}

		Long capphepGpkdvtId = (Long)attributes.get("capphepGpkdvtId");

		if (capphepGpkdvtId != null) {
			setCapphepGpkdvtId(capphepGpkdvtId);
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
	public long getThongtinhosoId() {
		return _thongtinhosoId;
	}

	@Override
	public void setThongtinhosoId(long thongtinhosoId) {
		_thongtinhosoId = thongtinhosoId;
	}

	@JSON
	@Override
	public long getCapphepGpkdvtId() {
		return _capphepGpkdvtId;
	}

	@Override
	public void setCapphepGpkdvtId(long capphepGpkdvtId) {
		_capphepGpkdvtId = capphepGpkdvtId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtThongTinHoSoGiayPhepVanTai.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtThongTinHoSoGiayPhepVanTai toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtThongTinHoSoGiayPhepVanTai)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtThongTinHoSoGiayPhepVanTaiImpl qlvtThongTinHoSoGiayPhepVanTaiImpl = new QlvtThongTinHoSoGiayPhepVanTaiImpl();

		qlvtThongTinHoSoGiayPhepVanTaiImpl.setId(getId());
		qlvtThongTinHoSoGiayPhepVanTaiImpl.setThongtinhosoId(getThongtinhosoId());
		qlvtThongTinHoSoGiayPhepVanTaiImpl.setCapphepGpkdvtId(getCapphepGpkdvtId());

		qlvtThongTinHoSoGiayPhepVanTaiImpl.resetOriginalValues();

		return qlvtThongTinHoSoGiayPhepVanTaiImpl;
	}

	@Override
	public int compareTo(
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai) {
		int value = 0;

		if (getId() < qlvtThongTinHoSoGiayPhepVanTai.getId()) {
			value = -1;
		}
		else if (getId() > qlvtThongTinHoSoGiayPhepVanTai.getId()) {
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

		if (!(obj instanceof QlvtThongTinHoSoGiayPhepVanTai)) {
			return false;
		}

		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai = (QlvtThongTinHoSoGiayPhepVanTai)obj;

		long primaryKey = qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKey();

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
	public CacheModel<QlvtThongTinHoSoGiayPhepVanTai> toCacheModel() {
		QlvtThongTinHoSoGiayPhepVanTaiCacheModel qlvtThongTinHoSoGiayPhepVanTaiCacheModel =
			new QlvtThongTinHoSoGiayPhepVanTaiCacheModel();

		qlvtThongTinHoSoGiayPhepVanTaiCacheModel.id = getId();

		qlvtThongTinHoSoGiayPhepVanTaiCacheModel.thongtinhosoId = getThongtinhosoId();

		qlvtThongTinHoSoGiayPhepVanTaiCacheModel.capphepGpkdvtId = getCapphepGpkdvtId();

		return qlvtThongTinHoSoGiayPhepVanTaiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongtinhosoId=");
		sb.append(getThongtinhosoId());
		sb.append(", capphepGpkdvtId=");
		sb.append(getCapphepGpkdvtId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongtinhosoId</column-name><column-value><![CDATA[");
		sb.append(getThongtinhosoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capphepGpkdvtId</column-name><column-value><![CDATA[");
		sb.append(getCapphepGpkdvtId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtThongTinHoSoGiayPhepVanTai.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtThongTinHoSoGiayPhepVanTai.class
		};
	private long _id;
	private long _thongtinhosoId;
	private long _capphepGpkdvtId;
	private QlvtThongTinHoSoGiayPhepVanTai _escapedModel;
}