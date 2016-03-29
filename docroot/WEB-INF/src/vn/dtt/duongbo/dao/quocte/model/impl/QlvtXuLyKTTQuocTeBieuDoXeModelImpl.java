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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXeModel;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXeSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QlvtXuLyKTTQuocTeBieuDoXe service. Represents a row in the &quot;qlvt_xuly_ktt_quocte_bieudoxe&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtXuLyKTTQuocTeBieuDoXeImpl}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeBieuDoXeImpl
 * @see vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe
 * @see vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXeModel
 * @generated
 */
@JSON(strict = true)
public class QlvtXuLyKTTQuocTeBieuDoXeModelImpl extends BaseModelImpl<QlvtXuLyKTTQuocTeBieuDoXe>
	implements QlvtXuLyKTTQuocTeBieuDoXeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt xu ly k t t quoc te bieu do xe model instance should use the {@link vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe} interface instead.
	 */
	public static final String TABLE_NAME = "qlvt_xuly_ktt_quocte_bieudoxe";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "KTT_QUOCTEID", Types.INTEGER },
			{ "LOAILUOT", Types.VARCHAR },
			{ "SOTHUTULUOT", Types.INTEGER },
			{ "MABEN", Types.VARCHAR },
			{ "GIOXUATBEN", Types.INTEGER },
			{ "PHUTXUATBEN", Types.INTEGER },
			{ "TANXUAT", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table qlvt_xuly_ktt_quocte_bieudoxe (ID LONG not null primary key,KTT_QUOCTEID INTEGER,LOAILUOT VARCHAR(75) null,SOTHUTULUOT INTEGER,MABEN VARCHAR(75) null,GIOXUATBEN INTEGER,PHUTXUATBEN INTEGER,TANXUAT INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table qlvt_xuly_ktt_quocte_bieudoxe";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtXuLyKTTQuocTeBieuDoXe.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY qlvt_xuly_ktt_quocte_bieudoxe.ID ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QlvtXuLyKTTQuocTeBieuDoXe toModel(
		QlvtXuLyKTTQuocTeBieuDoXeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QlvtXuLyKTTQuocTeBieuDoXe model = new QlvtXuLyKTTQuocTeBieuDoXeImpl();

		model.setId(soapModel.getId());
		model.setKttQuocTeId(soapModel.getKttQuocTeId());
		model.setLoaiLuot(soapModel.getLoaiLuot());
		model.setSoThuTuLuot(soapModel.getSoThuTuLuot());
		model.setMaBen(soapModel.getMaBen());
		model.setGioXuatBen(soapModel.getGioXuatBen());
		model.setPhuXuatBen(soapModel.getPhuXuatBen());
		model.setTanXuat(soapModel.getTanXuat());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QlvtXuLyKTTQuocTeBieuDoXe> toModels(
		QlvtXuLyKTTQuocTeBieuDoXeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QlvtXuLyKTTQuocTeBieuDoXe> models = new ArrayList<QlvtXuLyKTTQuocTeBieuDoXe>(soapModels.length);

		for (QlvtXuLyKTTQuocTeBieuDoXeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe"));

	public QlvtXuLyKTTQuocTeBieuDoXeModelImpl() {
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
		return QlvtXuLyKTTQuocTeBieuDoXe.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyKTTQuocTeBieuDoXe.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("kttQuocTeId", getKttQuocTeId());
		attributes.put("loaiLuot", getLoaiLuot());
		attributes.put("soThuTuLuot", getSoThuTuLuot());
		attributes.put("maBen", getMaBen());
		attributes.put("gioXuatBen", getGioXuatBen());
		attributes.put("phuXuatBen", getPhuXuatBen());
		attributes.put("tanXuat", getTanXuat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer kttQuocTeId = (Integer)attributes.get("kttQuocTeId");

		if (kttQuocTeId != null) {
			setKttQuocTeId(kttQuocTeId);
		}

		String loaiLuot = (String)attributes.get("loaiLuot");

		if (loaiLuot != null) {
			setLoaiLuot(loaiLuot);
		}

		Integer soThuTuLuot = (Integer)attributes.get("soThuTuLuot");

		if (soThuTuLuot != null) {
			setSoThuTuLuot(soThuTuLuot);
		}

		String maBen = (String)attributes.get("maBen");

		if (maBen != null) {
			setMaBen(maBen);
		}

		Integer gioXuatBen = (Integer)attributes.get("gioXuatBen");

		if (gioXuatBen != null) {
			setGioXuatBen(gioXuatBen);
		}

		Integer phuXuatBen = (Integer)attributes.get("phuXuatBen");

		if (phuXuatBen != null) {
			setPhuXuatBen(phuXuatBen);
		}

		Integer tanXuat = (Integer)attributes.get("tanXuat");

		if (tanXuat != null) {
			setTanXuat(tanXuat);
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
	public int getKttQuocTeId() {
		return _kttQuocTeId;
	}

	@Override
	public void setKttQuocTeId(int kttQuocTeId) {
		_kttQuocTeId = kttQuocTeId;
	}

	@JSON
	@Override
	public String getLoaiLuot() {
		if (_loaiLuot == null) {
			return StringPool.BLANK;
		}
		else {
			return _loaiLuot;
		}
	}

	@Override
	public void setLoaiLuot(String loaiLuot) {
		_loaiLuot = loaiLuot;
	}

	@JSON
	@Override
	public int getSoThuTuLuot() {
		return _soThuTuLuot;
	}

	@Override
	public void setSoThuTuLuot(int soThuTuLuot) {
		_soThuTuLuot = soThuTuLuot;
	}

	@JSON
	@Override
	public String getMaBen() {
		if (_maBen == null) {
			return StringPool.BLANK;
		}
		else {
			return _maBen;
		}
	}

	@Override
	public void setMaBen(String maBen) {
		_maBen = maBen;
	}

	@JSON
	@Override
	public int getGioXuatBen() {
		return _gioXuatBen;
	}

	@Override
	public void setGioXuatBen(int gioXuatBen) {
		_gioXuatBen = gioXuatBen;
	}

	@JSON
	@Override
	public int getPhuXuatBen() {
		return _phuXuatBen;
	}

	@Override
	public void setPhuXuatBen(int phuXuatBen) {
		_phuXuatBen = phuXuatBen;
	}

	@JSON
	@Override
	public int getTanXuat() {
		return _tanXuat;
	}

	@Override
	public void setTanXuat(int tanXuat) {
		_tanXuat = tanXuat;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtXuLyKTTQuocTeBieuDoXe.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtXuLyKTTQuocTeBieuDoXe toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtXuLyKTTQuocTeBieuDoXe)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtXuLyKTTQuocTeBieuDoXeImpl qlvtXuLyKTTQuocTeBieuDoXeImpl = new QlvtXuLyKTTQuocTeBieuDoXeImpl();

		qlvtXuLyKTTQuocTeBieuDoXeImpl.setId(getId());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setKttQuocTeId(getKttQuocTeId());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setLoaiLuot(getLoaiLuot());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setSoThuTuLuot(getSoThuTuLuot());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setMaBen(getMaBen());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setGioXuatBen(getGioXuatBen());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setPhuXuatBen(getPhuXuatBen());
		qlvtXuLyKTTQuocTeBieuDoXeImpl.setTanXuat(getTanXuat());

		qlvtXuLyKTTQuocTeBieuDoXeImpl.resetOriginalValues();

		return qlvtXuLyKTTQuocTeBieuDoXeImpl;
	}

	@Override
	public int compareTo(QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe) {
		int value = 0;

		if (getId() < qlvtXuLyKTTQuocTeBieuDoXe.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyKTTQuocTeBieuDoXe.getId()) {
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

		if (!(obj instanceof QlvtXuLyKTTQuocTeBieuDoXe)) {
			return false;
		}

		QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe = (QlvtXuLyKTTQuocTeBieuDoXe)obj;

		long primaryKey = qlvtXuLyKTTQuocTeBieuDoXe.getPrimaryKey();

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
	public CacheModel<QlvtXuLyKTTQuocTeBieuDoXe> toCacheModel() {
		QlvtXuLyKTTQuocTeBieuDoXeCacheModel qlvtXuLyKTTQuocTeBieuDoXeCacheModel = new QlvtXuLyKTTQuocTeBieuDoXeCacheModel();

		qlvtXuLyKTTQuocTeBieuDoXeCacheModel.id = getId();

		qlvtXuLyKTTQuocTeBieuDoXeCacheModel.kttQuocTeId = getKttQuocTeId();

		qlvtXuLyKTTQuocTeBieuDoXeCacheModel.loaiLuot = getLoaiLuot();

		String loaiLuot = qlvtXuLyKTTQuocTeBieuDoXeCacheModel.loaiLuot;

		if ((loaiLuot != null) && (loaiLuot.length() == 0)) {
			qlvtXuLyKTTQuocTeBieuDoXeCacheModel.loaiLuot = null;
		}

		qlvtXuLyKTTQuocTeBieuDoXeCacheModel.soThuTuLuot = getSoThuTuLuot();

		qlvtXuLyKTTQuocTeBieuDoXeCacheModel.maBen = getMaBen();

		String maBen = qlvtXuLyKTTQuocTeBieuDoXeCacheModel.maBen;

		if ((maBen != null) && (maBen.length() == 0)) {
			qlvtXuLyKTTQuocTeBieuDoXeCacheModel.maBen = null;
		}

		qlvtXuLyKTTQuocTeBieuDoXeCacheModel.gioXuatBen = getGioXuatBen();

		qlvtXuLyKTTQuocTeBieuDoXeCacheModel.phuXuatBen = getPhuXuatBen();

		qlvtXuLyKTTQuocTeBieuDoXeCacheModel.tanXuat = getTanXuat();

		return qlvtXuLyKTTQuocTeBieuDoXeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", kttQuocTeId=");
		sb.append(getKttQuocTeId());
		sb.append(", loaiLuot=");
		sb.append(getLoaiLuot());
		sb.append(", soThuTuLuot=");
		sb.append(getSoThuTuLuot());
		sb.append(", maBen=");
		sb.append(getMaBen());
		sb.append(", gioXuatBen=");
		sb.append(getGioXuatBen());
		sb.append(", phuXuatBen=");
		sb.append(getPhuXuatBen());
		sb.append(", tanXuat=");
		sb.append(getTanXuat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kttQuocTeId</column-name><column-value><![CDATA[");
		sb.append(getKttQuocTeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiLuot</column-name><column-value><![CDATA[");
		sb.append(getLoaiLuot());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soThuTuLuot</column-name><column-value><![CDATA[");
		sb.append(getSoThuTuLuot());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maBen</column-name><column-value><![CDATA[");
		sb.append(getMaBen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioXuatBen</column-name><column-value><![CDATA[");
		sb.append(getGioXuatBen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phuXuatBen</column-name><column-value><![CDATA[");
		sb.append(getPhuXuatBen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tanXuat</column-name><column-value><![CDATA[");
		sb.append(getTanXuat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtXuLyKTTQuocTeBieuDoXe.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtXuLyKTTQuocTeBieuDoXe.class
		};
	private long _id;
	private int _kttQuocTeId;
	private String _loaiLuot;
	private int _soThuTuLuot;
	private String _maBen;
	private int _gioXuatBen;
	private int _phuXuatBen;
	private int _tanXuat;
	private QlvtXuLyKTTQuocTeBieuDoXe _escapedModel;
}