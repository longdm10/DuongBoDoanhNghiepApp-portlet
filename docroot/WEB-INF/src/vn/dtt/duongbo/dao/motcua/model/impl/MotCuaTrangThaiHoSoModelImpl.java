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

import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSoModel;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSoSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the MotCuaTrangThaiHoSo service. Represents a row in the &quot;motcua_trangthaihoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MotCuaTrangThaiHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see MotCuaTrangThaiHoSoImpl
 * @see vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo
 * @see vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSoModel
 * @generated
 */
@JSON(strict = true)
public class MotCuaTrangThaiHoSoModelImpl extends BaseModelImpl<MotCuaTrangThaiHoSo>
	implements MotCuaTrangThaiHoSoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mot cua trang thai ho so model instance should use the {@link vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo} interface instead.
	 */
	public static final String TABLE_NAME = "motcua_trangthaihoso";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "quyTrinhThuTucId", Types.BIGINT },
			{ "MATRANGTHAI", Types.VARCHAR },
			{ "tentrangthai", Types.VARCHAR },
			{ "tentienganh", Types.VARCHAR },
			{ "sothutu", Types.INTEGER },
			{ "trangthaiketthuc", Types.INTEGER },
			{ "motatrangthai", Types.VARCHAR },
			{ "vaitroxuly1", Types.BIGINT },
			{ "vaitroxuly2", Types.BIGINT },
			{ "vaitroxuly3", Types.BIGINT },
			{ "formxuly", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table motcua_trangthaihoso (id LONG not null primary key,quyTrinhThuTucId LONG,MATRANGTHAI VARCHAR(75) null,tentrangthai VARCHAR(75) null,tentienganh VARCHAR(75) null,sothutu INTEGER,trangthaiketthuc INTEGER,motatrangthai VARCHAR(75) null,vaitroxuly1 LONG,vaitroxuly2 LONG,vaitroxuly3 LONG,formxuly VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table motcua_trangthaihoso";
	public static final String ORDER_BY_JPQL = " ORDER BY motCuaTrangThaiHoSo.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY motcua_trangthaihoso.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo"),
			true);
	public static long MATRANGTHAI_COLUMN_BITMASK = 1L;
	public static long QUYTRINHTHUTUCID_COLUMN_BITMASK = 2L;
	public static long SOTHUTU_COLUMN_BITMASK = 4L;
	public static long VAITROXULY1_COLUMN_BITMASK = 8L;
	public static long VAITROXULY2_COLUMN_BITMASK = 16L;
	public static long VAITROXULY3_COLUMN_BITMASK = 32L;
	public static long ID_COLUMN_BITMASK = 64L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static MotCuaTrangThaiHoSo toModel(MotCuaTrangThaiHoSoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		MotCuaTrangThaiHoSo model = new MotCuaTrangThaiHoSoImpl();

		model.setId(soapModel.getId());
		model.setQuyTrinhThuTucId(soapModel.getQuyTrinhThuTucId());
		model.setMaTrangThai(soapModel.getMaTrangThai());
		model.setTenTrangThai(soapModel.getTenTrangThai());
		model.setTenTiengAnh(soapModel.getTenTiengAnh());
		model.setSoThuTu(soapModel.getSoThuTu());
		model.setTrangThaiKetThuc(soapModel.getTrangThaiKetThuc());
		model.setMoTaTrangThai(soapModel.getMoTaTrangThai());
		model.setVaiTroXuLy1(soapModel.getVaiTroXuLy1());
		model.setVaiTroXuLy2(soapModel.getVaiTroXuLy2());
		model.setVaiTroXuLy3(soapModel.getVaiTroXuLy3());
		model.setFormXuLy(soapModel.getFormXuLy());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<MotCuaTrangThaiHoSo> toModels(
		MotCuaTrangThaiHoSoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<MotCuaTrangThaiHoSo> models = new ArrayList<MotCuaTrangThaiHoSo>(soapModels.length);

		for (MotCuaTrangThaiHoSoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo"));

	public MotCuaTrangThaiHoSoModelImpl() {
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
		return MotCuaTrangThaiHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaTrangThaiHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("maTrangThai", getMaTrangThai());
		attributes.put("tenTrangThai", getTenTrangThai());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("soThuTu", getSoThuTu());
		attributes.put("trangThaiKetThuc", getTrangThaiKetThuc());
		attributes.put("moTaTrangThai", getMoTaTrangThai());
		attributes.put("vaiTroXuLy1", getVaiTroXuLy1());
		attributes.put("vaiTroXuLy2", getVaiTroXuLy2());
		attributes.put("vaiTroXuLy3", getVaiTroXuLy3());
		attributes.put("formXuLy", getFormXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		String maTrangThai = (String)attributes.get("maTrangThai");

		if (maTrangThai != null) {
			setMaTrangThai(maTrangThai);
		}

		String tenTrangThai = (String)attributes.get("tenTrangThai");

		if (tenTrangThai != null) {
			setTenTrangThai(tenTrangThai);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}

		Integer trangThaiKetThuc = (Integer)attributes.get("trangThaiKetThuc");

		if (trangThaiKetThuc != null) {
			setTrangThaiKetThuc(trangThaiKetThuc);
		}

		String moTaTrangThai = (String)attributes.get("moTaTrangThai");

		if (moTaTrangThai != null) {
			setMoTaTrangThai(moTaTrangThai);
		}

		Long vaiTroXuLy1 = (Long)attributes.get("vaiTroXuLy1");

		if (vaiTroXuLy1 != null) {
			setVaiTroXuLy1(vaiTroXuLy1);
		}

		Long vaiTroXuLy2 = (Long)attributes.get("vaiTroXuLy2");

		if (vaiTroXuLy2 != null) {
			setVaiTroXuLy2(vaiTroXuLy2);
		}

		Long vaiTroXuLy3 = (Long)attributes.get("vaiTroXuLy3");

		if (vaiTroXuLy3 != null) {
			setVaiTroXuLy3(vaiTroXuLy3);
		}

		String formXuLy = (String)attributes.get("formXuLy");

		if (formXuLy != null) {
			setFormXuLy(formXuLy);
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
	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_columnBitmask |= QUYTRINHTHUTUCID_COLUMN_BITMASK;

		if (!_setOriginalQuyTrinhThuTucId) {
			_setOriginalQuyTrinhThuTucId = true;

			_originalQuyTrinhThuTucId = _quyTrinhThuTucId;
		}

		_quyTrinhThuTucId = quyTrinhThuTucId;
	}

	public long getOriginalQuyTrinhThuTucId() {
		return _originalQuyTrinhThuTucId;
	}

	@JSON
	@Override
	public String getMaTrangThai() {
		if (_maTrangThai == null) {
			return StringPool.BLANK;
		}
		else {
			return _maTrangThai;
		}
	}

	@Override
	public void setMaTrangThai(String maTrangThai) {
		_columnBitmask |= MATRANGTHAI_COLUMN_BITMASK;

		if (_originalMaTrangThai == null) {
			_originalMaTrangThai = _maTrangThai;
		}

		_maTrangThai = maTrangThai;
	}

	public String getOriginalMaTrangThai() {
		return GetterUtil.getString(_originalMaTrangThai);
	}

	@JSON
	@Override
	public String getTenTrangThai() {
		if (_tenTrangThai == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenTrangThai;
		}
	}

	@Override
	public void setTenTrangThai(String tenTrangThai) {
		_tenTrangThai = tenTrangThai;
	}

	@JSON
	@Override
	public String getTenTiengAnh() {
		if (_tenTiengAnh == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenTiengAnh;
		}
	}

	@Override
	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;
	}

	@JSON
	@Override
	public int getSoThuTu() {
		return _soThuTu;
	}

	@Override
	public void setSoThuTu(int soThuTu) {
		_columnBitmask |= SOTHUTU_COLUMN_BITMASK;

		if (!_setOriginalSoThuTu) {
			_setOriginalSoThuTu = true;

			_originalSoThuTu = _soThuTu;
		}

		_soThuTu = soThuTu;
	}

	public int getOriginalSoThuTu() {
		return _originalSoThuTu;
	}

	@JSON
	@Override
	public int getTrangThaiKetThuc() {
		return _trangThaiKetThuc;
	}

	@Override
	public void setTrangThaiKetThuc(int trangThaiKetThuc) {
		_trangThaiKetThuc = trangThaiKetThuc;
	}

	@JSON
	@Override
	public String getMoTaTrangThai() {
		if (_moTaTrangThai == null) {
			return StringPool.BLANK;
		}
		else {
			return _moTaTrangThai;
		}
	}

	@Override
	public void setMoTaTrangThai(String moTaTrangThai) {
		_moTaTrangThai = moTaTrangThai;
	}

	@JSON
	@Override
	public long getVaiTroXuLy1() {
		return _vaiTroXuLy1;
	}

	@Override
	public void setVaiTroXuLy1(long vaiTroXuLy1) {
		_columnBitmask |= VAITROXULY1_COLUMN_BITMASK;

		if (!_setOriginalVaiTroXuLy1) {
			_setOriginalVaiTroXuLy1 = true;

			_originalVaiTroXuLy1 = _vaiTroXuLy1;
		}

		_vaiTroXuLy1 = vaiTroXuLy1;
	}

	public long getOriginalVaiTroXuLy1() {
		return _originalVaiTroXuLy1;
	}

	@JSON
	@Override
	public long getVaiTroXuLy2() {
		return _vaiTroXuLy2;
	}

	@Override
	public void setVaiTroXuLy2(long vaiTroXuLy2) {
		_columnBitmask |= VAITROXULY2_COLUMN_BITMASK;

		if (!_setOriginalVaiTroXuLy2) {
			_setOriginalVaiTroXuLy2 = true;

			_originalVaiTroXuLy2 = _vaiTroXuLy2;
		}

		_vaiTroXuLy2 = vaiTroXuLy2;
	}

	public long getOriginalVaiTroXuLy2() {
		return _originalVaiTroXuLy2;
	}

	@JSON
	@Override
	public long getVaiTroXuLy3() {
		return _vaiTroXuLy3;
	}

	@Override
	public void setVaiTroXuLy3(long vaiTroXuLy3) {
		_columnBitmask |= VAITROXULY3_COLUMN_BITMASK;

		if (!_setOriginalVaiTroXuLy3) {
			_setOriginalVaiTroXuLy3 = true;

			_originalVaiTroXuLy3 = _vaiTroXuLy3;
		}

		_vaiTroXuLy3 = vaiTroXuLy3;
	}

	public long getOriginalVaiTroXuLy3() {
		return _originalVaiTroXuLy3;
	}

	@JSON
	@Override
	public String getFormXuLy() {
		if (_formXuLy == null) {
			return StringPool.BLANK;
		}
		else {
			return _formXuLy;
		}
	}

	@Override
	public void setFormXuLy(String formXuLy) {
		_formXuLy = formXuLy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			MotCuaTrangThaiHoSo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MotCuaTrangThaiHoSo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (MotCuaTrangThaiHoSo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MotCuaTrangThaiHoSoImpl motCuaTrangThaiHoSoImpl = new MotCuaTrangThaiHoSoImpl();

		motCuaTrangThaiHoSoImpl.setId(getId());
		motCuaTrangThaiHoSoImpl.setQuyTrinhThuTucId(getQuyTrinhThuTucId());
		motCuaTrangThaiHoSoImpl.setMaTrangThai(getMaTrangThai());
		motCuaTrangThaiHoSoImpl.setTenTrangThai(getTenTrangThai());
		motCuaTrangThaiHoSoImpl.setTenTiengAnh(getTenTiengAnh());
		motCuaTrangThaiHoSoImpl.setSoThuTu(getSoThuTu());
		motCuaTrangThaiHoSoImpl.setTrangThaiKetThuc(getTrangThaiKetThuc());
		motCuaTrangThaiHoSoImpl.setMoTaTrangThai(getMoTaTrangThai());
		motCuaTrangThaiHoSoImpl.setVaiTroXuLy1(getVaiTroXuLy1());
		motCuaTrangThaiHoSoImpl.setVaiTroXuLy2(getVaiTroXuLy2());
		motCuaTrangThaiHoSoImpl.setVaiTroXuLy3(getVaiTroXuLy3());
		motCuaTrangThaiHoSoImpl.setFormXuLy(getFormXuLy());

		motCuaTrangThaiHoSoImpl.resetOriginalValues();

		return motCuaTrangThaiHoSoImpl;
	}

	@Override
	public int compareTo(MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		int value = 0;

		if (getId() < motCuaTrangThaiHoSo.getId()) {
			value = -1;
		}
		else if (getId() > motCuaTrangThaiHoSo.getId()) {
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

		if (!(obj instanceof MotCuaTrangThaiHoSo)) {
			return false;
		}

		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = (MotCuaTrangThaiHoSo)obj;

		long primaryKey = motCuaTrangThaiHoSo.getPrimaryKey();

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
		MotCuaTrangThaiHoSoModelImpl motCuaTrangThaiHoSoModelImpl = this;

		motCuaTrangThaiHoSoModelImpl._originalQuyTrinhThuTucId = motCuaTrangThaiHoSoModelImpl._quyTrinhThuTucId;

		motCuaTrangThaiHoSoModelImpl._setOriginalQuyTrinhThuTucId = false;

		motCuaTrangThaiHoSoModelImpl._originalMaTrangThai = motCuaTrangThaiHoSoModelImpl._maTrangThai;

		motCuaTrangThaiHoSoModelImpl._originalSoThuTu = motCuaTrangThaiHoSoModelImpl._soThuTu;

		motCuaTrangThaiHoSoModelImpl._setOriginalSoThuTu = false;

		motCuaTrangThaiHoSoModelImpl._originalVaiTroXuLy1 = motCuaTrangThaiHoSoModelImpl._vaiTroXuLy1;

		motCuaTrangThaiHoSoModelImpl._setOriginalVaiTroXuLy1 = false;

		motCuaTrangThaiHoSoModelImpl._originalVaiTroXuLy2 = motCuaTrangThaiHoSoModelImpl._vaiTroXuLy2;

		motCuaTrangThaiHoSoModelImpl._setOriginalVaiTroXuLy2 = false;

		motCuaTrangThaiHoSoModelImpl._originalVaiTroXuLy3 = motCuaTrangThaiHoSoModelImpl._vaiTroXuLy3;

		motCuaTrangThaiHoSoModelImpl._setOriginalVaiTroXuLy3 = false;

		motCuaTrangThaiHoSoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<MotCuaTrangThaiHoSo> toCacheModel() {
		MotCuaTrangThaiHoSoCacheModel motCuaTrangThaiHoSoCacheModel = new MotCuaTrangThaiHoSoCacheModel();

		motCuaTrangThaiHoSoCacheModel.id = getId();

		motCuaTrangThaiHoSoCacheModel.quyTrinhThuTucId = getQuyTrinhThuTucId();

		motCuaTrangThaiHoSoCacheModel.maTrangThai = getMaTrangThai();

		String maTrangThai = motCuaTrangThaiHoSoCacheModel.maTrangThai;

		if ((maTrangThai != null) && (maTrangThai.length() == 0)) {
			motCuaTrangThaiHoSoCacheModel.maTrangThai = null;
		}

		motCuaTrangThaiHoSoCacheModel.tenTrangThai = getTenTrangThai();

		String tenTrangThai = motCuaTrangThaiHoSoCacheModel.tenTrangThai;

		if ((tenTrangThai != null) && (tenTrangThai.length() == 0)) {
			motCuaTrangThaiHoSoCacheModel.tenTrangThai = null;
		}

		motCuaTrangThaiHoSoCacheModel.tenTiengAnh = getTenTiengAnh();

		String tenTiengAnh = motCuaTrangThaiHoSoCacheModel.tenTiengAnh;

		if ((tenTiengAnh != null) && (tenTiengAnh.length() == 0)) {
			motCuaTrangThaiHoSoCacheModel.tenTiengAnh = null;
		}

		motCuaTrangThaiHoSoCacheModel.soThuTu = getSoThuTu();

		motCuaTrangThaiHoSoCacheModel.trangThaiKetThuc = getTrangThaiKetThuc();

		motCuaTrangThaiHoSoCacheModel.moTaTrangThai = getMoTaTrangThai();

		String moTaTrangThai = motCuaTrangThaiHoSoCacheModel.moTaTrangThai;

		if ((moTaTrangThai != null) && (moTaTrangThai.length() == 0)) {
			motCuaTrangThaiHoSoCacheModel.moTaTrangThai = null;
		}

		motCuaTrangThaiHoSoCacheModel.vaiTroXuLy1 = getVaiTroXuLy1();

		motCuaTrangThaiHoSoCacheModel.vaiTroXuLy2 = getVaiTroXuLy2();

		motCuaTrangThaiHoSoCacheModel.vaiTroXuLy3 = getVaiTroXuLy3();

		motCuaTrangThaiHoSoCacheModel.formXuLy = getFormXuLy();

		String formXuLy = motCuaTrangThaiHoSoCacheModel.formXuLy;

		if ((formXuLy != null) && (formXuLy.length() == 0)) {
			motCuaTrangThaiHoSoCacheModel.formXuLy = null;
		}

		return motCuaTrangThaiHoSoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", quyTrinhThuTucId=");
		sb.append(getQuyTrinhThuTucId());
		sb.append(", maTrangThai=");
		sb.append(getMaTrangThai());
		sb.append(", tenTrangThai=");
		sb.append(getTenTrangThai());
		sb.append(", tenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", soThuTu=");
		sb.append(getSoThuTu());
		sb.append(", trangThaiKetThuc=");
		sb.append(getTrangThaiKetThuc());
		sb.append(", moTaTrangThai=");
		sb.append(getMoTaTrangThai());
		sb.append(", vaiTroXuLy1=");
		sb.append(getVaiTroXuLy1());
		sb.append(", vaiTroXuLy2=");
		sb.append(getVaiTroXuLy2());
		sb.append(", vaiTroXuLy3=");
		sb.append(getVaiTroXuLy3());
		sb.append(", formXuLy=");
		sb.append(getFormXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quyTrinhThuTucId</column-name><column-value><![CDATA[");
		sb.append(getQuyTrinhThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTrangThai</column-name><column-value><![CDATA[");
		sb.append(getMaTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTrangThai</column-name><column-value><![CDATA[");
		sb.append(getTenTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soThuTu</column-name><column-value><![CDATA[");
		sb.append(getSoThuTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiKetThuc</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiKetThuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moTaTrangThai</column-name><column-value><![CDATA[");
		sb.append(getMoTaTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy1</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy2</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy3</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formXuLy</column-name><column-value><![CDATA[");
		sb.append(getFormXuLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = MotCuaTrangThaiHoSo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			MotCuaTrangThaiHoSo.class
		};
	private long _id;
	private long _quyTrinhThuTucId;
	private long _originalQuyTrinhThuTucId;
	private boolean _setOriginalQuyTrinhThuTucId;
	private String _maTrangThai;
	private String _originalMaTrangThai;
	private String _tenTrangThai;
	private String _tenTiengAnh;
	private int _soThuTu;
	private int _originalSoThuTu;
	private boolean _setOriginalSoThuTu;
	private int _trangThaiKetThuc;
	private String _moTaTrangThai;
	private long _vaiTroXuLy1;
	private long _originalVaiTroXuLy1;
	private boolean _setOriginalVaiTroXuLy1;
	private long _vaiTroXuLy2;
	private long _originalVaiTroXuLy2;
	private boolean _setOriginalVaiTroXuLy2;
	private long _vaiTroXuLy3;
	private long _originalVaiTroXuLy3;
	private boolean _setOriginalVaiTroXuLy3;
	private String _formXuLy;
	private long _columnBitmask;
	private MotCuaTrangThaiHoSo _escapedModel;
}