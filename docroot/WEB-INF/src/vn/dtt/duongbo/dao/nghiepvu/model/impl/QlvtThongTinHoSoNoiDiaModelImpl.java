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

package vn.dtt.duongbo.dao.nghiepvu.model.impl;

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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDiaModel;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDiaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QlvtThongTinHoSoNoiDia service. Represents a row in the &quot;nghiepvu_thongtinhoso_qlvt_capphep_gpkdvt_bangoto_noidia&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDiaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtThongTinHoSoNoiDiaImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoNoiDiaImpl
 * @see vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia
 * @see vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDiaModel
 * @generated
 */
@JSON(strict = true)
public class QlvtThongTinHoSoNoiDiaModelImpl extends BaseModelImpl<QlvtThongTinHoSoNoiDia>
	implements QlvtThongTinHoSoNoiDiaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt thong tin ho so noi dia model instance should use the {@link vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia} interface instead.
	 */
	public static final String TABLE_NAME = "nghiepvu_thongtinhoso_qlvt_capphep_gpkdvt_bangoto_noidia";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "nghiepvu_thongtinhosoID", Types.BIGINT },
			{ "qlvt_capphep_gpkdvt_duongbo_noidiaID", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table nghiepvu_thongtinhoso_qlvt_capphep_gpkdvt_bangoto_noidia (id LONG not null primary key,nghiepvu_thongtinhosoID LONG,qlvt_capphep_gpkdvt_duongbo_noidiaID LONG)";
	public static final String TABLE_SQL_DROP = "drop table nghiepvu_thongtinhoso_qlvt_capphep_gpkdvt_bangoto_noidia";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtThongTinHoSoNoiDia.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nghiepvu_thongtinhoso_qlvt_capphep_gpkdvt_bangoto_noidia.id ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QlvtThongTinHoSoNoiDia toModel(
		QlvtThongTinHoSoNoiDiaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QlvtThongTinHoSoNoiDia model = new QlvtThongTinHoSoNoiDiaImpl();

		model.setId(soapModel.getId());
		model.setThongtinHoSoId(soapModel.getThongtinHoSoId());
		model.setNoiDiaId(soapModel.getNoiDiaId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QlvtThongTinHoSoNoiDia> toModels(
		QlvtThongTinHoSoNoiDiaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QlvtThongTinHoSoNoiDia> models = new ArrayList<QlvtThongTinHoSoNoiDia>(soapModels.length);

		for (QlvtThongTinHoSoNoiDiaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia"));

	public QlvtThongTinHoSoNoiDiaModelImpl() {
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
		return QlvtThongTinHoSoNoiDia.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoNoiDia.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongtinHoSoId", getThongtinHoSoId());
		attributes.put("noiDiaId", getNoiDiaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thongtinHoSoId = (Long)attributes.get("thongtinHoSoId");

		if (thongtinHoSoId != null) {
			setThongtinHoSoId(thongtinHoSoId);
		}

		Long noiDiaId = (Long)attributes.get("noiDiaId");

		if (noiDiaId != null) {
			setNoiDiaId(noiDiaId);
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
	public long getThongtinHoSoId() {
		return _thongtinHoSoId;
	}

	@Override
	public void setThongtinHoSoId(long thongtinHoSoId) {
		_thongtinHoSoId = thongtinHoSoId;
	}

	@JSON
	@Override
	public long getNoiDiaId() {
		return _noiDiaId;
	}

	@Override
	public void setNoiDiaId(long noiDiaId) {
		_noiDiaId = noiDiaId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtThongTinHoSoNoiDia.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtThongTinHoSoNoiDia toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtThongTinHoSoNoiDia)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtThongTinHoSoNoiDiaImpl qlvtThongTinHoSoNoiDiaImpl = new QlvtThongTinHoSoNoiDiaImpl();

		qlvtThongTinHoSoNoiDiaImpl.setId(getId());
		qlvtThongTinHoSoNoiDiaImpl.setThongtinHoSoId(getThongtinHoSoId());
		qlvtThongTinHoSoNoiDiaImpl.setNoiDiaId(getNoiDiaId());

		qlvtThongTinHoSoNoiDiaImpl.resetOriginalValues();

		return qlvtThongTinHoSoNoiDiaImpl;
	}

	@Override
	public int compareTo(QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia) {
		int value = 0;

		if (getId() < qlvtThongTinHoSoNoiDia.getId()) {
			value = -1;
		}
		else if (getId() > qlvtThongTinHoSoNoiDia.getId()) {
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

		if (!(obj instanceof QlvtThongTinHoSoNoiDia)) {
			return false;
		}

		QlvtThongTinHoSoNoiDia qlvtThongTinHoSoNoiDia = (QlvtThongTinHoSoNoiDia)obj;

		long primaryKey = qlvtThongTinHoSoNoiDia.getPrimaryKey();

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
	public CacheModel<QlvtThongTinHoSoNoiDia> toCacheModel() {
		QlvtThongTinHoSoNoiDiaCacheModel qlvtThongTinHoSoNoiDiaCacheModel = new QlvtThongTinHoSoNoiDiaCacheModel();

		qlvtThongTinHoSoNoiDiaCacheModel.id = getId();

		qlvtThongTinHoSoNoiDiaCacheModel.thongtinHoSoId = getThongtinHoSoId();

		qlvtThongTinHoSoNoiDiaCacheModel.noiDiaId = getNoiDiaId();

		return qlvtThongTinHoSoNoiDiaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongtinHoSoId=");
		sb.append(getThongtinHoSoId());
		sb.append(", noiDiaId=");
		sb.append(getNoiDiaId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDia");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongtinHoSoId</column-name><column-value><![CDATA[");
		sb.append(getThongtinHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDiaId</column-name><column-value><![CDATA[");
		sb.append(getNoiDiaId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtThongTinHoSoNoiDia.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtThongTinHoSoNoiDia.class
		};
	private long _id;
	private long _thongtinHoSoId;
	private long _noiDiaId;
	private QlvtThongTinHoSoNoiDia _escapedModel;
}