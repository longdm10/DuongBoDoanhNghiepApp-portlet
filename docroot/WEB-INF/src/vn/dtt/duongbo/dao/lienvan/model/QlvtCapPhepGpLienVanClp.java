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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.lienvan.service.ClpSerializer;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGpLienVanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtCapPhepGpLienVanClp extends BaseModelImpl<QlvtCapPhepGpLienVan>
	implements QlvtCapPhepGpLienVan {
	public QlvtCapPhepGpLienVanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGpLienVan.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGpLienVan.class.getName();
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
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpkdvtVietLaoId", getGpkdvtVietLaoId());
		attributes.put("loaiCapPhep", getLoaiCapPhep());
		attributes.put("loaiGiayPhepLienVan", getLoaiGiayPhepLienVan());
		attributes.put("soGiayPhepLienVan", getSoGiayPhepLienVan());
		attributes.put("ngayCapGplv", getNgayCapGplv());
		attributes.put("ngayHetHanGplv", getNgayHetHanGplv());
		attributes.put("coQuanCpLienVan", getCoQuanCpLienVan());
		attributes.put("soCongVanChapThuanTCD", getSoCongVanChapThuanTCD());
		attributes.put("ngayCongVanChapThuanTCD", getNgayCongVanChapThuanTCD());
		attributes.put("tuyenTu", getTuyenTu());
		attributes.put("tuyenDi", getTuyenDi());
		attributes.put("cuLy", getCuLy());
		attributes.put("maBenDi", getMaBenDi());
		attributes.put("maBenDen", getMaBenDen());
		attributes.put("maTinhDi", getMaTinhDi());
		attributes.put("maTinhDen", getMaTinhDen());
		attributes.put("hanhTrinh", getHanhTrinh());
		attributes.put("mucPhi", getMucPhi());
		attributes.put("mucDichChuyenDi", getMucDichChuyenDi());
		attributes.put("fileId", getFileId());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpkdvtVietLaoId = (Long)attributes.get("gpkdvtVietLaoId");

		if (gpkdvtVietLaoId != null) {
			setGpkdvtVietLaoId(gpkdvtVietLaoId);
		}

		String loaiCapPhep = (String)attributes.get("loaiCapPhep");

		if (loaiCapPhep != null) {
			setLoaiCapPhep(loaiCapPhep);
		}

		String loaiGiayPhepLienVan = (String)attributes.get(
				"loaiGiayPhepLienVan");

		if (loaiGiayPhepLienVan != null) {
			setLoaiGiayPhepLienVan(loaiGiayPhepLienVan);
		}

		String soGiayPhepLienVan = (String)attributes.get("soGiayPhepLienVan");

		if (soGiayPhepLienVan != null) {
			setSoGiayPhepLienVan(soGiayPhepLienVan);
		}

		Date ngayCapGplv = (Date)attributes.get("ngayCapGplv");

		if (ngayCapGplv != null) {
			setNgayCapGplv(ngayCapGplv);
		}

		Date ngayHetHanGplv = (Date)attributes.get("ngayHetHanGplv");

		if (ngayHetHanGplv != null) {
			setNgayHetHanGplv(ngayHetHanGplv);
		}

		String coQuanCpLienVan = (String)attributes.get("coQuanCpLienVan");

		if (coQuanCpLienVan != null) {
			setCoQuanCpLienVan(coQuanCpLienVan);
		}

		String soCongVanChapThuanTCD = (String)attributes.get(
				"soCongVanChapThuanTCD");

		if (soCongVanChapThuanTCD != null) {
			setSoCongVanChapThuanTCD(soCongVanChapThuanTCD);
		}

		Date ngayCongVanChapThuanTCD = (Date)attributes.get(
				"ngayCongVanChapThuanTCD");

		if (ngayCongVanChapThuanTCD != null) {
			setNgayCongVanChapThuanTCD(ngayCongVanChapThuanTCD);
		}

		String tuyenTu = (String)attributes.get("tuyenTu");

		if (tuyenTu != null) {
			setTuyenTu(tuyenTu);
		}

		String tuyenDi = (String)attributes.get("tuyenDi");

		if (tuyenDi != null) {
			setTuyenDi(tuyenDi);
		}

		String cuLy = (String)attributes.get("cuLy");

		if (cuLy != null) {
			setCuLy(cuLy);
		}

		String maBenDi = (String)attributes.get("maBenDi");

		if (maBenDi != null) {
			setMaBenDi(maBenDi);
		}

		String maBenDen = (String)attributes.get("maBenDen");

		if (maBenDen != null) {
			setMaBenDen(maBenDen);
		}

		String maTinhDi = (String)attributes.get("maTinhDi");

		if (maTinhDi != null) {
			setMaTinhDi(maTinhDi);
		}

		String maTinhDen = (String)attributes.get("maTinhDen");

		if (maTinhDen != null) {
			setMaTinhDen(maTinhDen);
		}

		String hanhTrinh = (String)attributes.get("hanhTrinh");

		if (hanhTrinh != null) {
			setHanhTrinh(hanhTrinh);
		}

		String mucPhi = (String)attributes.get("mucPhi");

		if (mucPhi != null) {
			setMucPhi(mucPhi);
		}

		String mucDichChuyenDi = (String)attributes.get("mucDichChuyenDi");

		if (mucDichChuyenDi != null) {
			setMucDichChuyenDi(mucDichChuyenDi);
		}

		Long fileId = (Long)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGpkdvtVietLaoId() {
		return _gpkdvtVietLaoId;
	}

	@Override
	public void setGpkdvtVietLaoId(long gpkdvtVietLaoId) {
		_gpkdvtVietLaoId = gpkdvtVietLaoId;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setGpkdvtVietLaoId", long.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, gpkdvtVietLaoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiCapPhep() {
		return _loaiCapPhep;
	}

	@Override
	public void setLoaiCapPhep(String loaiCapPhep) {
		_loaiCapPhep = loaiCapPhep;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiCapPhep", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, loaiCapPhep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiGiayPhepLienVan() {
		return _loaiGiayPhepLienVan;
	}

	@Override
	public void setLoaiGiayPhepLienVan(String loaiGiayPhepLienVan) {
		_loaiGiayPhepLienVan = loaiGiayPhepLienVan;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiGiayPhepLienVan",
						String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel,
					loaiGiayPhepLienVan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGiayPhepLienVan() {
		return _soGiayPhepLienVan;
	}

	@Override
	public void setSoGiayPhepLienVan(String soGiayPhepLienVan) {
		_soGiayPhepLienVan = soGiayPhepLienVan;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGiayPhepLienVan",
						String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel,
					soGiayPhepLienVan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGplv() {
		return _ngayCapGplv;
	}

	@Override
	public void setNgayCapGplv(Date ngayCapGplv) {
		_ngayCapGplv = ngayCapGplv;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGplv", Date.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, ngayCapGplv);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanGplv() {
		return _ngayHetHanGplv;
	}

	@Override
	public void setNgayHetHanGplv(Date ngayHetHanGplv) {
		_ngayHetHanGplv = ngayHetHanGplv;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanGplv", Date.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, ngayHetHanGplv);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoQuanCpLienVan() {
		return _coQuanCpLienVan;
	}

	@Override
	public void setCoQuanCpLienVan(String coQuanCpLienVan) {
		_coQuanCpLienVan = coQuanCpLienVan;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCpLienVan",
						String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, coQuanCpLienVan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoCongVanChapThuanTCD() {
		return _soCongVanChapThuanTCD;
	}

	@Override
	public void setSoCongVanChapThuanTCD(String soCongVanChapThuanTCD) {
		_soCongVanChapThuanTCD = soCongVanChapThuanTCD;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoCongVanChapThuanTCD",
						String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel,
					soCongVanChapThuanTCD);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCongVanChapThuanTCD() {
		return _ngayCongVanChapThuanTCD;
	}

	@Override
	public void setNgayCongVanChapThuanTCD(Date ngayCongVanChapThuanTCD) {
		_ngayCongVanChapThuanTCD = ngayCongVanChapThuanTCD;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCongVanChapThuanTCD",
						Date.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel,
					ngayCongVanChapThuanTCD);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTuyenTu() {
		return _tuyenTu;
	}

	@Override
	public void setTuyenTu(String tuyenTu) {
		_tuyenTu = tuyenTu;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenTu", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, tuyenTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTuyenDi() {
		return _tuyenDi;
	}

	@Override
	public void setTuyenDi(String tuyenDi) {
		_tuyenDi = tuyenDi;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenDi", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, tuyenDi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCuLy() {
		return _cuLy;
	}

	@Override
	public void setCuLy(String cuLy) {
		_cuLy = cuLy;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setCuLy", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, cuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaBenDi() {
		return _maBenDi;
	}

	@Override
	public void setMaBenDi(String maBenDi) {
		_maBenDi = maBenDi;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBenDi", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, maBenDi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaBenDen() {
		return _maBenDen;
	}

	@Override
	public void setMaBenDen(String maBenDen) {
		_maBenDen = maBenDen;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBenDen", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, maBenDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTinhDi() {
		return _maTinhDi;
	}

	@Override
	public void setMaTinhDi(String maTinhDi) {
		_maTinhDi = maTinhDi;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinhDi", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, maTinhDi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTinhDen() {
		return _maTinhDen;
	}

	@Override
	public void setMaTinhDen(String maTinhDen) {
		_maTinhDen = maTinhDen;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinhDen", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, maTinhDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHanhTrinh() {
		return _hanhTrinh;
	}

	@Override
	public void setHanhTrinh(String hanhTrinh) {
		_hanhTrinh = hanhTrinh;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setHanhTrinh", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, hanhTrinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMucPhi() {
		return _mucPhi;
	}

	@Override
	public void setMucPhi(String mucPhi) {
		_mucPhi = mucPhi;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMucPhi", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, mucPhi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMucDichChuyenDi() {
		return _mucDichChuyenDi;
	}

	@Override
	public void setMucDichChuyenDi(String mucDichChuyenDi) {
		_mucDichChuyenDi = mucDichChuyenDi;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMucDichChuyenDi",
						String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, mucDichChuyenDi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileId() {
		return _fileId;
	}

	@Override
	public void setFileId(long fileId) {
		_fileId = fileId;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setFileId", long.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, fileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;

		if (_qlvtCapPhepGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtCapPhepGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_qlvtCapPhepGpLienVanRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtCapPhepGpLienVanRemoteModel() {
		return _qlvtCapPhepGpLienVanRemoteModel;
	}

	public void setQlvtCapPhepGpLienVanRemoteModel(
		BaseModel<?> qlvtCapPhepGpLienVanRemoteModel) {
		_qlvtCapPhepGpLienVanRemoteModel = qlvtCapPhepGpLienVanRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _qlvtCapPhepGpLienVanRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_qlvtCapPhepGpLienVanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtCapPhepGpLienVanLocalServiceUtil.addQlvtCapPhepGpLienVan(this);
		}
		else {
			QlvtCapPhepGpLienVanLocalServiceUtil.updateQlvtCapPhepGpLienVan(this);
		}
	}

	@Override
	public QlvtCapPhepGpLienVan toEscapedModel() {
		return (QlvtCapPhepGpLienVan)ProxyUtil.newProxyInstance(QlvtCapPhepGpLienVan.class.getClassLoader(),
			new Class[] { QlvtCapPhepGpLienVan.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtCapPhepGpLienVanClp clone = new QlvtCapPhepGpLienVanClp();

		clone.setId(getId());
		clone.setGpkdvtVietLaoId(getGpkdvtVietLaoId());
		clone.setLoaiCapPhep(getLoaiCapPhep());
		clone.setLoaiGiayPhepLienVan(getLoaiGiayPhepLienVan());
		clone.setSoGiayPhepLienVan(getSoGiayPhepLienVan());
		clone.setNgayCapGplv(getNgayCapGplv());
		clone.setNgayHetHanGplv(getNgayHetHanGplv());
		clone.setCoQuanCpLienVan(getCoQuanCpLienVan());
		clone.setSoCongVanChapThuanTCD(getSoCongVanChapThuanTCD());
		clone.setNgayCongVanChapThuanTCD(getNgayCongVanChapThuanTCD());
		clone.setTuyenTu(getTuyenTu());
		clone.setTuyenDi(getTuyenDi());
		clone.setCuLy(getCuLy());
		clone.setMaBenDi(getMaBenDi());
		clone.setMaBenDen(getMaBenDen());
		clone.setMaTinhDi(getMaTinhDi());
		clone.setMaTinhDen(getMaTinhDen());
		clone.setHanhTrinh(getHanhTrinh());
		clone.setMucPhi(getMucPhi());
		clone.setMucDichChuyenDi(getMucDichChuyenDi());
		clone.setFileId(getFileId());
		clone.setTrangThai(getTrangThai());

		return clone;
	}

	@Override
	public int compareTo(QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan) {
		int value = 0;

		if (getId() < qlvtCapPhepGpLienVan.getId()) {
			value = -1;
		}
		else if (getId() > qlvtCapPhepGpLienVan.getId()) {
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

		if (!(obj instanceof QlvtCapPhepGpLienVanClp)) {
			return false;
		}

		QlvtCapPhepGpLienVanClp qlvtCapPhepGpLienVan = (QlvtCapPhepGpLienVanClp)obj;

		long primaryKey = qlvtCapPhepGpLienVan.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", gpkdvtVietLaoId=");
		sb.append(getGpkdvtVietLaoId());
		sb.append(", loaiCapPhep=");
		sb.append(getLoaiCapPhep());
		sb.append(", loaiGiayPhepLienVan=");
		sb.append(getLoaiGiayPhepLienVan());
		sb.append(", soGiayPhepLienVan=");
		sb.append(getSoGiayPhepLienVan());
		sb.append(", ngayCapGplv=");
		sb.append(getNgayCapGplv());
		sb.append(", ngayHetHanGplv=");
		sb.append(getNgayHetHanGplv());
		sb.append(", coQuanCpLienVan=");
		sb.append(getCoQuanCpLienVan());
		sb.append(", soCongVanChapThuanTCD=");
		sb.append(getSoCongVanChapThuanTCD());
		sb.append(", ngayCongVanChapThuanTCD=");
		sb.append(getNgayCongVanChapThuanTCD());
		sb.append(", tuyenTu=");
		sb.append(getTuyenTu());
		sb.append(", tuyenDi=");
		sb.append(getTuyenDi());
		sb.append(", cuLy=");
		sb.append(getCuLy());
		sb.append(", maBenDi=");
		sb.append(getMaBenDi());
		sb.append(", maBenDen=");
		sb.append(getMaBenDen());
		sb.append(", maTinhDi=");
		sb.append(getMaTinhDi());
		sb.append(", maTinhDen=");
		sb.append(getMaTinhDen());
		sb.append(", hanhTrinh=");
		sb.append(getHanhTrinh());
		sb.append(", mucPhi=");
		sb.append(getMucPhi());
		sb.append(", mucDichChuyenDi=");
		sb.append(getMucDichChuyenDi());
		sb.append(", fileId=");
		sb.append(getFileId());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpkdvtVietLaoId</column-name><column-value><![CDATA[");
		sb.append(getGpkdvtVietLaoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiCapPhep</column-name><column-value><![CDATA[");
		sb.append(getLoaiCapPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiGiayPhepLienVan</column-name><column-value><![CDATA[");
		sb.append(getLoaiGiayPhepLienVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGiayPhepLienVan</column-name><column-value><![CDATA[");
		sb.append(getSoGiayPhepLienVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGplv</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGplv());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHanGplv</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanGplv());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCpLienVan</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCpLienVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soCongVanChapThuanTCD</column-name><column-value><![CDATA[");
		sb.append(getSoCongVanChapThuanTCD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCongVanChapThuanTCD</column-name><column-value><![CDATA[");
		sb.append(getNgayCongVanChapThuanTCD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tuyenTu</column-name><column-value><![CDATA[");
		sb.append(getTuyenTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tuyenDi</column-name><column-value><![CDATA[");
		sb.append(getTuyenDi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cuLy</column-name><column-value><![CDATA[");
		sb.append(getCuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maBenDi</column-name><column-value><![CDATA[");
		sb.append(getMaBenDi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maBenDen</column-name><column-value><![CDATA[");
		sb.append(getMaBenDen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTinhDi</column-name><column-value><![CDATA[");
		sb.append(getMaTinhDi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTinhDen</column-name><column-value><![CDATA[");
		sb.append(getMaTinhDen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hanhTrinh</column-name><column-value><![CDATA[");
		sb.append(getHanhTrinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mucPhi</column-name><column-value><![CDATA[");
		sb.append(getMucPhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mucDichChuyenDi</column-name><column-value><![CDATA[");
		sb.append(getMucDichChuyenDi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileId</column-name><column-value><![CDATA[");
		sb.append(getFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _gpkdvtVietLaoId;
	private String _loaiCapPhep;
	private String _loaiGiayPhepLienVan;
	private String _soGiayPhepLienVan;
	private Date _ngayCapGplv;
	private Date _ngayHetHanGplv;
	private String _coQuanCpLienVan;
	private String _soCongVanChapThuanTCD;
	private Date _ngayCongVanChapThuanTCD;
	private String _tuyenTu;
	private String _tuyenDi;
	private String _cuLy;
	private String _maBenDi;
	private String _maBenDen;
	private String _maTinhDi;
	private String _maTinhDen;
	private String _hanhTrinh;
	private String _mucPhi;
	private String _mucDichChuyenDi;
	private long _fileId;
	private String _trangThai;
	private BaseModel<?> _qlvtCapPhepGpLienVanRemoteModel;
}