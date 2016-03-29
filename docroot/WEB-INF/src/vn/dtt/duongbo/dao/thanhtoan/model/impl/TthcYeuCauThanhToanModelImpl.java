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

package vn.dtt.duongbo.dao.thanhtoan.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToanModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcYeuCauThanhToan service. Represents a row in the &quot;tthc_yeucauthanhtoan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToanModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcYeuCauThanhToanImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcYeuCauThanhToanImpl
 * @see vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan
 * @see vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToanModel
 * @generated
 */
public class TthcYeuCauThanhToanModelImpl extends BaseModelImpl<TthcYeuCauThanhToan>
	implements TthcYeuCauThanhToanModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc yeu cau thanh toan model instance should use the {@link vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_yeucauthanhtoan";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "masoyeucau", Types.VARCHAR },
			{ "sotien", Types.BIGINT },
			{ "chitietyeucau", Types.VARCHAR },
			{ "ngaytao", Types.TIMESTAMP },
			{ "nguoitao", Types.BIGINT },
			{ "tochucquanly", Types.BIGINT },
			{ "hosothutucid", Types.BIGINT },
			{ "xacnhanthanhtoanid", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_yeucauthanhtoan (id LONG not null primary key,masoyeucau VARCHAR(75) null,sotien LONG,chitietyeucau VARCHAR(75) null,ngaytao DATE null,nguoitao LONG,tochucquanly LONG,hosothutucid LONG,xacnhanthanhtoanid LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_yeucauthanhtoan";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcYeuCauThanhToan.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_yeucauthanhtoan.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan"));

	public TthcYeuCauThanhToanModelImpl() {
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
		return TthcYeuCauThanhToan.class;
	}

	@Override
	public String getModelClassName() {
		return TthcYeuCauThanhToan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maSoYeuCau", getMaSoYeuCau());
		attributes.put("soTien", getSoTien());
		attributes.put("chiTietYeuCau", getChiTietYeuCau());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("xacNhanThanhToanId", getXacNhanThanhToanId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maSoYeuCau = (String)attributes.get("maSoYeuCau");

		if (maSoYeuCau != null) {
			setMaSoYeuCau(maSoYeuCau);
		}

		Long soTien = (Long)attributes.get("soTien");

		if (soTien != null) {
			setSoTien(soTien);
		}

		String chiTietYeuCau = (String)attributes.get("chiTietYeuCau");

		if (chiTietYeuCau != null) {
			setChiTietYeuCau(chiTietYeuCau);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long xacNhanThanhToanId = (Long)attributes.get("xacNhanThanhToanId");

		if (xacNhanThanhToanId != null) {
			setXacNhanThanhToanId(xacNhanThanhToanId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public String getMaSoYeuCau() {
		if (_maSoYeuCau == null) {
			return StringPool.BLANK;
		}
		else {
			return _maSoYeuCau;
		}
	}

	@Override
	public void setMaSoYeuCau(String maSoYeuCau) {
		_maSoYeuCau = maSoYeuCau;
	}

	@Override
	public long getSoTien() {
		return _soTien;
	}

	@Override
	public void setSoTien(long soTien) {
		_soTien = soTien;
	}

	@Override
	public String getChiTietYeuCau() {
		if (_chiTietYeuCau == null) {
			return StringPool.BLANK;
		}
		else {
			return _chiTietYeuCau;
		}
	}

	@Override
	public void setChiTietYeuCau(String chiTietYeuCau) {
		_chiTietYeuCau = chiTietYeuCau;
	}

	@Override
	public Date getNgayTao() {
		return _ngayTao;
	}

	@Override
	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	@Override
	public long getNguoiTao() {
		return _nguoiTao;
	}

	@Override
	public void setNguoiTao(long nguoiTao) {
		_nguoiTao = nguoiTao;
	}

	@Override
	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	@Override
	public long getXacNhanThanhToanId() {
		return _xacNhanThanhToanId;
	}

	@Override
	public void setXacNhanThanhToanId(long xacNhanThanhToanId) {
		_xacNhanThanhToanId = xacNhanThanhToanId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcYeuCauThanhToan.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcYeuCauThanhToan toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcYeuCauThanhToan)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcYeuCauThanhToanImpl tthcYeuCauThanhToanImpl = new TthcYeuCauThanhToanImpl();

		tthcYeuCauThanhToanImpl.setId(getId());
		tthcYeuCauThanhToanImpl.setMaSoYeuCau(getMaSoYeuCau());
		tthcYeuCauThanhToanImpl.setSoTien(getSoTien());
		tthcYeuCauThanhToanImpl.setChiTietYeuCau(getChiTietYeuCau());
		tthcYeuCauThanhToanImpl.setNgayTao(getNgayTao());
		tthcYeuCauThanhToanImpl.setNguoiTao(getNguoiTao());
		tthcYeuCauThanhToanImpl.setToChucQuanLy(getToChucQuanLy());
		tthcYeuCauThanhToanImpl.setHoSoThuTucId(getHoSoThuTucId());
		tthcYeuCauThanhToanImpl.setXacNhanThanhToanId(getXacNhanThanhToanId());

		tthcYeuCauThanhToanImpl.resetOriginalValues();

		return tthcYeuCauThanhToanImpl;
	}

	@Override
	public int compareTo(TthcYeuCauThanhToan tthcYeuCauThanhToan) {
		int value = 0;

		if (getId() < tthcYeuCauThanhToan.getId()) {
			value = -1;
		}
		else if (getId() > tthcYeuCauThanhToan.getId()) {
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

		if (!(obj instanceof TthcYeuCauThanhToan)) {
			return false;
		}

		TthcYeuCauThanhToan tthcYeuCauThanhToan = (TthcYeuCauThanhToan)obj;

		long primaryKey = tthcYeuCauThanhToan.getPrimaryKey();

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
	public CacheModel<TthcYeuCauThanhToan> toCacheModel() {
		TthcYeuCauThanhToanCacheModel tthcYeuCauThanhToanCacheModel = new TthcYeuCauThanhToanCacheModel();

		tthcYeuCauThanhToanCacheModel.id = getId();

		tthcYeuCauThanhToanCacheModel.maSoYeuCau = getMaSoYeuCau();

		String maSoYeuCau = tthcYeuCauThanhToanCacheModel.maSoYeuCau;

		if ((maSoYeuCau != null) && (maSoYeuCau.length() == 0)) {
			tthcYeuCauThanhToanCacheModel.maSoYeuCau = null;
		}

		tthcYeuCauThanhToanCacheModel.soTien = getSoTien();

		tthcYeuCauThanhToanCacheModel.chiTietYeuCau = getChiTietYeuCau();

		String chiTietYeuCau = tthcYeuCauThanhToanCacheModel.chiTietYeuCau;

		if ((chiTietYeuCau != null) && (chiTietYeuCau.length() == 0)) {
			tthcYeuCauThanhToanCacheModel.chiTietYeuCau = null;
		}

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			tthcYeuCauThanhToanCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			tthcYeuCauThanhToanCacheModel.ngayTao = Long.MIN_VALUE;
		}

		tthcYeuCauThanhToanCacheModel.nguoiTao = getNguoiTao();

		tthcYeuCauThanhToanCacheModel.toChucQuanLy = getToChucQuanLy();

		tthcYeuCauThanhToanCacheModel.hoSoThuTucId = getHoSoThuTucId();

		tthcYeuCauThanhToanCacheModel.xacNhanThanhToanId = getXacNhanThanhToanId();

		return tthcYeuCauThanhToanCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maSoYeuCau=");
		sb.append(getMaSoYeuCau());
		sb.append(", soTien=");
		sb.append(getSoTien());
		sb.append(", chiTietYeuCau=");
		sb.append(getChiTietYeuCau());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", toChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", xacNhanThanhToanId=");
		sb.append(getXacNhanThanhToanId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoYeuCau</column-name><column-value><![CDATA[");
		sb.append(getMaSoYeuCau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTien</column-name><column-value><![CDATA[");
		sb.append(getSoTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiTietYeuCau</column-name><column-value><![CDATA[");
		sb.append(getChiTietYeuCau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xacNhanThanhToanId</column-name><column-value><![CDATA[");
		sb.append(getXacNhanThanhToanId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TthcYeuCauThanhToan.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcYeuCauThanhToan.class
		};
	private long _id;
	private String _maSoYeuCau;
	private long _soTien;
	private String _chiTietYeuCau;
	private Date _ngayTao;
	private long _nguoiTao;
	private long _toChucQuanLy;
	private long _hoSoThuTucId;
	private long _xacNhanThanhToanId;
	private TthcYeuCauThanhToan _escapedModel;
}