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

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyenModel;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyenSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QlvtXuLyGpLienVanTuyen service. Represents a row in the &quot;qlvt_xuly_gplienvan_phuongtien_tuyen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyenModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtXuLyGpLienVanTuyenImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanTuyenImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen
 * @see vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyenModel
 * @generated
 */
@JSON(strict = true)
public class QlvtXuLyGpLienVanTuyenModelImpl extends BaseModelImpl<QlvtXuLyGpLienVanTuyen>
	implements QlvtXuLyGpLienVanTuyenModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt xu ly gp lien van tuyen model instance should use the {@link vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen} interface instead.
	 */
	public static final String TABLE_NAME = "qlvt_xuly_gplienvan_phuongtien_tuyen";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "GPLIENVAN_PHUONGTIENID", Types.BIGINT },
			{ "MATUYEN", Types.VARCHAR },
			{ "TENTUYEN", Types.VARCHAR },
			{ "TUNGAY", Types.TIMESTAMP },
			{ "DENNGAY", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table qlvt_xuly_gplienvan_phuongtien_tuyen (ID LONG not null primary key,GPLIENVAN_PHUONGTIENID LONG,MATUYEN VARCHAR(75) null,TENTUYEN VARCHAR(75) null,TUNGAY DATE null,DENNGAY DATE null)";
	public static final String TABLE_SQL_DROP = "drop table qlvt_xuly_gplienvan_phuongtien_tuyen";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtXuLyGpLienVanTuyen.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY qlvt_xuly_gplienvan_phuongtien_tuyen.ID ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen"),
			true);
	public static long GPLIENVANPHUONGTIENID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QlvtXuLyGpLienVanTuyen toModel(
		QlvtXuLyGpLienVanTuyenSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QlvtXuLyGpLienVanTuyen model = new QlvtXuLyGpLienVanTuyenImpl();

		model.setId(soapModel.getId());
		model.setGpLienVanPhuongTienId(soapModel.getGpLienVanPhuongTienId());
		model.setMaTuyen(soapModel.getMaTuyen());
		model.setTenTuyen(soapModel.getTenTuyen());
		model.setTuNgay(soapModel.getTuNgay());
		model.setDenNgay(soapModel.getDenNgay());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QlvtXuLyGpLienVanTuyen> toModels(
		QlvtXuLyGpLienVanTuyenSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QlvtXuLyGpLienVanTuyen> models = new ArrayList<QlvtXuLyGpLienVanTuyen>(soapModels.length);

		for (QlvtXuLyGpLienVanTuyenSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen"));

	public QlvtXuLyGpLienVanTuyenModelImpl() {
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
		return QlvtXuLyGpLienVanTuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVanTuyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpLienVanPhuongTienId", getGpLienVanPhuongTienId());
		attributes.put("maTuyen", getMaTuyen());
		attributes.put("tenTuyen", getTenTuyen());
		attributes.put("tuNgay", getTuNgay());
		attributes.put("denNgay", getDenNgay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpLienVanPhuongTienId = (Long)attributes.get(
				"gpLienVanPhuongTienId");

		if (gpLienVanPhuongTienId != null) {
			setGpLienVanPhuongTienId(gpLienVanPhuongTienId);
		}

		String maTuyen = (String)attributes.get("maTuyen");

		if (maTuyen != null) {
			setMaTuyen(maTuyen);
		}

		String tenTuyen = (String)attributes.get("tenTuyen");

		if (tenTuyen != null) {
			setTenTuyen(tenTuyen);
		}

		Date tuNgay = (Date)attributes.get("tuNgay");

		if (tuNgay != null) {
			setTuNgay(tuNgay);
		}

		Date denNgay = (Date)attributes.get("denNgay");

		if (denNgay != null) {
			setDenNgay(denNgay);
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
	public long getGpLienVanPhuongTienId() {
		return _gpLienVanPhuongTienId;
	}

	@Override
	public void setGpLienVanPhuongTienId(long gpLienVanPhuongTienId) {
		_columnBitmask |= GPLIENVANPHUONGTIENID_COLUMN_BITMASK;

		if (!_setOriginalGpLienVanPhuongTienId) {
			_setOriginalGpLienVanPhuongTienId = true;

			_originalGpLienVanPhuongTienId = _gpLienVanPhuongTienId;
		}

		_gpLienVanPhuongTienId = gpLienVanPhuongTienId;
	}

	public long getOriginalGpLienVanPhuongTienId() {
		return _originalGpLienVanPhuongTienId;
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

	@JSON
	@Override
	public Date getTuNgay() {
		return _tuNgay;
	}

	@Override
	public void setTuNgay(Date tuNgay) {
		_tuNgay = tuNgay;
	}

	@JSON
	@Override
	public Date getDenNgay() {
		return _denNgay;
	}

	@Override
	public void setDenNgay(Date denNgay) {
		_denNgay = denNgay;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtXuLyGpLienVanTuyen.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtXuLyGpLienVanTuyen toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtXuLyGpLienVanTuyen)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtXuLyGpLienVanTuyenImpl qlvtXuLyGpLienVanTuyenImpl = new QlvtXuLyGpLienVanTuyenImpl();

		qlvtXuLyGpLienVanTuyenImpl.setId(getId());
		qlvtXuLyGpLienVanTuyenImpl.setGpLienVanPhuongTienId(getGpLienVanPhuongTienId());
		qlvtXuLyGpLienVanTuyenImpl.setMaTuyen(getMaTuyen());
		qlvtXuLyGpLienVanTuyenImpl.setTenTuyen(getTenTuyen());
		qlvtXuLyGpLienVanTuyenImpl.setTuNgay(getTuNgay());
		qlvtXuLyGpLienVanTuyenImpl.setDenNgay(getDenNgay());

		qlvtXuLyGpLienVanTuyenImpl.resetOriginalValues();

		return qlvtXuLyGpLienVanTuyenImpl;
	}

	@Override
	public int compareTo(QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen) {
		int value = 0;

		if (getId() < qlvtXuLyGpLienVanTuyen.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpLienVanTuyen.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpLienVanTuyen)) {
			return false;
		}

		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = (QlvtXuLyGpLienVanTuyen)obj;

		long primaryKey = qlvtXuLyGpLienVanTuyen.getPrimaryKey();

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
		QlvtXuLyGpLienVanTuyenModelImpl qlvtXuLyGpLienVanTuyenModelImpl = this;

		qlvtXuLyGpLienVanTuyenModelImpl._originalGpLienVanPhuongTienId = qlvtXuLyGpLienVanTuyenModelImpl._gpLienVanPhuongTienId;

		qlvtXuLyGpLienVanTuyenModelImpl._setOriginalGpLienVanPhuongTienId = false;

		qlvtXuLyGpLienVanTuyenModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QlvtXuLyGpLienVanTuyen> toCacheModel() {
		QlvtXuLyGpLienVanTuyenCacheModel qlvtXuLyGpLienVanTuyenCacheModel = new QlvtXuLyGpLienVanTuyenCacheModel();

		qlvtXuLyGpLienVanTuyenCacheModel.id = getId();

		qlvtXuLyGpLienVanTuyenCacheModel.gpLienVanPhuongTienId = getGpLienVanPhuongTienId();

		qlvtXuLyGpLienVanTuyenCacheModel.maTuyen = getMaTuyen();

		String maTuyen = qlvtXuLyGpLienVanTuyenCacheModel.maTuyen;

		if ((maTuyen != null) && (maTuyen.length() == 0)) {
			qlvtXuLyGpLienVanTuyenCacheModel.maTuyen = null;
		}

		qlvtXuLyGpLienVanTuyenCacheModel.tenTuyen = getTenTuyen();

		String tenTuyen = qlvtXuLyGpLienVanTuyenCacheModel.tenTuyen;

		if ((tenTuyen != null) && (tenTuyen.length() == 0)) {
			qlvtXuLyGpLienVanTuyenCacheModel.tenTuyen = null;
		}

		Date tuNgay = getTuNgay();

		if (tuNgay != null) {
			qlvtXuLyGpLienVanTuyenCacheModel.tuNgay = tuNgay.getTime();
		}
		else {
			qlvtXuLyGpLienVanTuyenCacheModel.tuNgay = Long.MIN_VALUE;
		}

		Date denNgay = getDenNgay();

		if (denNgay != null) {
			qlvtXuLyGpLienVanTuyenCacheModel.denNgay = denNgay.getTime();
		}
		else {
			qlvtXuLyGpLienVanTuyenCacheModel.denNgay = Long.MIN_VALUE;
		}

		return qlvtXuLyGpLienVanTuyenCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", gpLienVanPhuongTienId=");
		sb.append(getGpLienVanPhuongTienId());
		sb.append(", maTuyen=");
		sb.append(getMaTuyen());
		sb.append(", tenTuyen=");
		sb.append(getTenTuyen());
		sb.append(", tuNgay=");
		sb.append(getTuNgay());
		sb.append(", denNgay=");
		sb.append(getDenNgay());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpLienVanPhuongTienId</column-name><column-value><![CDATA[");
		sb.append(getGpLienVanPhuongTienId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuyen</column-name><column-value><![CDATA[");
		sb.append(getMaTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTuyen</column-name><column-value><![CDATA[");
		sb.append(getTenTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tuNgay</column-name><column-value><![CDATA[");
		sb.append(getTuNgay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>denNgay</column-name><column-value><![CDATA[");
		sb.append(getDenNgay());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtXuLyGpLienVanTuyen.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtXuLyGpLienVanTuyen.class
		};
	private long _id;
	private long _gpLienVanPhuongTienId;
	private long _originalGpLienVanPhuongTienId;
	private boolean _setOriginalGpLienVanPhuongTienId;
	private String _maTuyen;
	private String _tenTuyen;
	private Date _tuNgay;
	private Date _denNgay;
	private long _columnBitmask;
	private QlvtXuLyGpLienVanTuyen _escapedModel;
}