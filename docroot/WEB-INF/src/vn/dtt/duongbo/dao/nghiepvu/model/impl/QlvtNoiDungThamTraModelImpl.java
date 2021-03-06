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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTraModel;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTraSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QlvtNoiDungThamTra service. Represents a row in the &quot;nghiepvu_noidungthamtra&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTraModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtNoiDungThamTraImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtNoiDungThamTraImpl
 * @see vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra
 * @see vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTraModel
 * @generated
 */
@JSON(strict = true)
public class QlvtNoiDungThamTraModelImpl extends BaseModelImpl<QlvtNoiDungThamTra>
	implements QlvtNoiDungThamTraModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt noi dung tham tra model instance should use the {@link vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra} interface instead.
	 */
	public static final String TABLE_NAME = "nghiepvu_noidungthamtra";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "MUCKIEMTRA", Types.VARCHAR },
			{ "CHAID", Types.INTEGER },
			{ "COYKIEN", Types.INTEGER },
			{ "BUOCXULY", Types.INTEGER },
			{ "THUTUHIENTHI", Types.INTEGER },
			{ "TTHC_NOIDUNGTHAMTRAID", Types.INTEGER },
			{ "TIENTO", Types.VARCHAR },
			{ "THANHPHANHOSO", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table nghiepvu_noidungthamtra (id LONG not null primary key,MUCKIEMTRA VARCHAR(75) null,CHAID INTEGER,COYKIEN INTEGER,BUOCXULY INTEGER,THUTUHIENTHI INTEGER,TTHC_NOIDUNGTHAMTRAID INTEGER,TIENTO VARCHAR(75) null,THANHPHANHOSO VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table nghiepvu_noidungthamtra";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtNoiDungThamTra.thuTuHienThi ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nghiepvu_noidungthamtra.THUTUHIENTHI ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra"),
			true);
	public static long TTHCNOIDUNGTHAMTRAID_COLUMN_BITMASK = 1L;
	public static long THUTUHIENTHI_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QlvtNoiDungThamTra toModel(QlvtNoiDungThamTraSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QlvtNoiDungThamTra model = new QlvtNoiDungThamTraImpl();

		model.setId(soapModel.getId());
		model.setMucKiemTra(soapModel.getMucKiemTra());
		model.setChaId(soapModel.getChaId());
		model.setCoYKien(soapModel.getCoYKien());
		model.setBuocXuLy(soapModel.getBuocXuLy());
		model.setThuTuHienThi(soapModel.getThuTuHienThi());
		model.setTthcNoiDungThamTraId(soapModel.getTthcNoiDungThamTraId());
		model.setTienTo(soapModel.getTienTo());
		model.setThanhPhanHoSo(soapModel.getThanhPhanHoSo());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QlvtNoiDungThamTra> toModels(
		QlvtNoiDungThamTraSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QlvtNoiDungThamTra> models = new ArrayList<QlvtNoiDungThamTra>(soapModels.length);

		for (QlvtNoiDungThamTraSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra"));

	public QlvtNoiDungThamTraModelImpl() {
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
		return QlvtNoiDungThamTra.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtNoiDungThamTra.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mucKiemTra", getMucKiemTra());
		attributes.put("chaId", getChaId());
		attributes.put("coYKien", getCoYKien());
		attributes.put("buocXuLy", getBuocXuLy());
		attributes.put("thuTuHienThi", getThuTuHienThi());
		attributes.put("tthcNoiDungThamTraId", getTthcNoiDungThamTraId());
		attributes.put("tienTo", getTienTo());
		attributes.put("thanhPhanHoSo", getThanhPhanHoSo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String mucKiemTra = (String)attributes.get("mucKiemTra");

		if (mucKiemTra != null) {
			setMucKiemTra(mucKiemTra);
		}

		Integer chaId = (Integer)attributes.get("chaId");

		if (chaId != null) {
			setChaId(chaId);
		}

		Integer coYKien = (Integer)attributes.get("coYKien");

		if (coYKien != null) {
			setCoYKien(coYKien);
		}

		Integer buocXuLy = (Integer)attributes.get("buocXuLy");

		if (buocXuLy != null) {
			setBuocXuLy(buocXuLy);
		}

		Integer thuTuHienThi = (Integer)attributes.get("thuTuHienThi");

		if (thuTuHienThi != null) {
			setThuTuHienThi(thuTuHienThi);
		}

		Integer tthcNoiDungThamTraId = (Integer)attributes.get(
				"tthcNoiDungThamTraId");

		if (tthcNoiDungThamTraId != null) {
			setTthcNoiDungThamTraId(tthcNoiDungThamTraId);
		}

		String tienTo = (String)attributes.get("tienTo");

		if (tienTo != null) {
			setTienTo(tienTo);
		}

		String thanhPhanHoSo = (String)attributes.get("thanhPhanHoSo");

		if (thanhPhanHoSo != null) {
			setThanhPhanHoSo(thanhPhanHoSo);
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
	public String getMucKiemTra() {
		if (_mucKiemTra == null) {
			return StringPool.BLANK;
		}
		else {
			return _mucKiemTra;
		}
	}

	@Override
	public void setMucKiemTra(String mucKiemTra) {
		_mucKiemTra = mucKiemTra;
	}

	@JSON
	@Override
	public int getChaId() {
		return _chaId;
	}

	@Override
	public void setChaId(int chaId) {
		_chaId = chaId;
	}

	@JSON
	@Override
	public int getCoYKien() {
		return _coYKien;
	}

	@Override
	public void setCoYKien(int coYKien) {
		_coYKien = coYKien;
	}

	@JSON
	@Override
	public int getBuocXuLy() {
		return _buocXuLy;
	}

	@Override
	public void setBuocXuLy(int buocXuLy) {
		_buocXuLy = buocXuLy;
	}

	@JSON
	@Override
	public int getThuTuHienThi() {
		return _thuTuHienThi;
	}

	@Override
	public void setThuTuHienThi(int thuTuHienThi) {
		_columnBitmask = -1L;

		_thuTuHienThi = thuTuHienThi;
	}

	@JSON
	@Override
	public int getTthcNoiDungThamTraId() {
		return _tthcNoiDungThamTraId;
	}

	@Override
	public void setTthcNoiDungThamTraId(int tthcNoiDungThamTraId) {
		_columnBitmask |= TTHCNOIDUNGTHAMTRAID_COLUMN_BITMASK;

		if (!_setOriginalTthcNoiDungThamTraId) {
			_setOriginalTthcNoiDungThamTraId = true;

			_originalTthcNoiDungThamTraId = _tthcNoiDungThamTraId;
		}

		_tthcNoiDungThamTraId = tthcNoiDungThamTraId;
	}

	public int getOriginalTthcNoiDungThamTraId() {
		return _originalTthcNoiDungThamTraId;
	}

	@JSON
	@Override
	public String getTienTo() {
		if (_tienTo == null) {
			return StringPool.BLANK;
		}
		else {
			return _tienTo;
		}
	}

	@Override
	public void setTienTo(String tienTo) {
		_tienTo = tienTo;
	}

	@JSON
	@Override
	public String getThanhPhanHoSo() {
		if (_thanhPhanHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _thanhPhanHoSo;
		}
	}

	@Override
	public void setThanhPhanHoSo(String thanhPhanHoSo) {
		_thanhPhanHoSo = thanhPhanHoSo;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			QlvtNoiDungThamTra.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QlvtNoiDungThamTra toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QlvtNoiDungThamTra)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QlvtNoiDungThamTraImpl qlvtNoiDungThamTraImpl = new QlvtNoiDungThamTraImpl();

		qlvtNoiDungThamTraImpl.setId(getId());
		qlvtNoiDungThamTraImpl.setMucKiemTra(getMucKiemTra());
		qlvtNoiDungThamTraImpl.setChaId(getChaId());
		qlvtNoiDungThamTraImpl.setCoYKien(getCoYKien());
		qlvtNoiDungThamTraImpl.setBuocXuLy(getBuocXuLy());
		qlvtNoiDungThamTraImpl.setThuTuHienThi(getThuTuHienThi());
		qlvtNoiDungThamTraImpl.setTthcNoiDungThamTraId(getTthcNoiDungThamTraId());
		qlvtNoiDungThamTraImpl.setTienTo(getTienTo());
		qlvtNoiDungThamTraImpl.setThanhPhanHoSo(getThanhPhanHoSo());

		qlvtNoiDungThamTraImpl.resetOriginalValues();

		return qlvtNoiDungThamTraImpl;
	}

	@Override
	public int compareTo(QlvtNoiDungThamTra qlvtNoiDungThamTra) {
		int value = 0;

		if (getThuTuHienThi() < qlvtNoiDungThamTra.getThuTuHienThi()) {
			value = -1;
		}
		else if (getThuTuHienThi() > qlvtNoiDungThamTra.getThuTuHienThi()) {
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

		if (!(obj instanceof QlvtNoiDungThamTra)) {
			return false;
		}

		QlvtNoiDungThamTra qlvtNoiDungThamTra = (QlvtNoiDungThamTra)obj;

		long primaryKey = qlvtNoiDungThamTra.getPrimaryKey();

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
		QlvtNoiDungThamTraModelImpl qlvtNoiDungThamTraModelImpl = this;

		qlvtNoiDungThamTraModelImpl._originalTthcNoiDungThamTraId = qlvtNoiDungThamTraModelImpl._tthcNoiDungThamTraId;

		qlvtNoiDungThamTraModelImpl._setOriginalTthcNoiDungThamTraId = false;

		qlvtNoiDungThamTraModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QlvtNoiDungThamTra> toCacheModel() {
		QlvtNoiDungThamTraCacheModel qlvtNoiDungThamTraCacheModel = new QlvtNoiDungThamTraCacheModel();

		qlvtNoiDungThamTraCacheModel.id = getId();

		qlvtNoiDungThamTraCacheModel.mucKiemTra = getMucKiemTra();

		String mucKiemTra = qlvtNoiDungThamTraCacheModel.mucKiemTra;

		if ((mucKiemTra != null) && (mucKiemTra.length() == 0)) {
			qlvtNoiDungThamTraCacheModel.mucKiemTra = null;
		}

		qlvtNoiDungThamTraCacheModel.chaId = getChaId();

		qlvtNoiDungThamTraCacheModel.coYKien = getCoYKien();

		qlvtNoiDungThamTraCacheModel.buocXuLy = getBuocXuLy();

		qlvtNoiDungThamTraCacheModel.thuTuHienThi = getThuTuHienThi();

		qlvtNoiDungThamTraCacheModel.tthcNoiDungThamTraId = getTthcNoiDungThamTraId();

		qlvtNoiDungThamTraCacheModel.tienTo = getTienTo();

		String tienTo = qlvtNoiDungThamTraCacheModel.tienTo;

		if ((tienTo != null) && (tienTo.length() == 0)) {
			qlvtNoiDungThamTraCacheModel.tienTo = null;
		}

		qlvtNoiDungThamTraCacheModel.thanhPhanHoSo = getThanhPhanHoSo();

		String thanhPhanHoSo = qlvtNoiDungThamTraCacheModel.thanhPhanHoSo;

		if ((thanhPhanHoSo != null) && (thanhPhanHoSo.length() == 0)) {
			qlvtNoiDungThamTraCacheModel.thanhPhanHoSo = null;
		}

		return qlvtNoiDungThamTraCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", mucKiemTra=");
		sb.append(getMucKiemTra());
		sb.append(", chaId=");
		sb.append(getChaId());
		sb.append(", coYKien=");
		sb.append(getCoYKien());
		sb.append(", buocXuLy=");
		sb.append(getBuocXuLy());
		sb.append(", thuTuHienThi=");
		sb.append(getThuTuHienThi());
		sb.append(", tthcNoiDungThamTraId=");
		sb.append(getTthcNoiDungThamTraId());
		sb.append(", tienTo=");
		sb.append(getTienTo());
		sb.append(", thanhPhanHoSo=");
		sb.append(getThanhPhanHoSo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mucKiemTra</column-name><column-value><![CDATA[");
		sb.append(getMucKiemTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chaId</column-name><column-value><![CDATA[");
		sb.append(getChaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coYKien</column-name><column-value><![CDATA[");
		sb.append(getCoYKien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>buocXuLy</column-name><column-value><![CDATA[");
		sb.append(getBuocXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTuHienThi</column-name><column-value><![CDATA[");
		sb.append(getThuTuHienThi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tthcNoiDungThamTraId</column-name><column-value><![CDATA[");
		sb.append(getTthcNoiDungThamTraId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tienTo</column-name><column-value><![CDATA[");
		sb.append(getTienTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoSo</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoSo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QlvtNoiDungThamTra.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QlvtNoiDungThamTra.class
		};
	private long _id;
	private String _mucKiemTra;
	private int _chaId;
	private int _coYKien;
	private int _buocXuLy;
	private int _thuTuHienThi;
	private int _tthcNoiDungThamTraId;
	private int _originalTthcNoiDungThamTraId;
	private boolean _setOriginalTthcNoiDungThamTraId;
	private String _tienTo;
	private String _thanhPhanHoSo;
	private long _columnBitmask;
	private QlvtNoiDungThamTra _escapedModel;
}