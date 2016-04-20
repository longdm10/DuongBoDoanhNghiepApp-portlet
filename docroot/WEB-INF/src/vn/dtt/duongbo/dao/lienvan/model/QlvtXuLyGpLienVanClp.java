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
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtXuLyGpLienVanClp extends BaseModelImpl<QlvtXuLyGpLienVan>
	implements QlvtXuLyGpLienVan {
	public QlvtXuLyGpLienVanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpLienVan.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVan.class.getName();
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
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("loaiCapPhep", getLoaiCapPhep());
		attributes.put("soGpvt", getSoGpvt());
		attributes.put("ngayCapGpvt", getNgayCapGpvt());
		attributes.put("soCongVanChapThuanTcd", getSoCongVanChapThuanTcd());
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
		attributes.put("loaiGiayPhepLienVan", getLoaiGiayPhepLienVan());
		attributes.put("soGiayPhepLienVan", getSoGiayPhepLienVan());
		attributes.put("ngayCapGiayPhepLienVan", getNgayCapGiayPhepLienVan());
		attributes.put("ngayHetHanGiayPhepLienVan",
			getNgayHetHanGiayPhepLienVan());
		attributes.put("coQuanCapPhepLienVan", getCoQuanCapPhepLienVan());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("ngayCapGiayPhepLienVan_LanDau",
			getNgayCapGiayPhepLienVan_LanDau());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thongTinXuLyId = (Long)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String loaiCapPhep = (String)attributes.get("loaiCapPhep");

		if (loaiCapPhep != null) {
			setLoaiCapPhep(loaiCapPhep);
		}

		String soGpvt = (String)attributes.get("soGpvt");

		if (soGpvt != null) {
			setSoGpvt(soGpvt);
		}

		Date ngayCapGpvt = (Date)attributes.get("ngayCapGpvt");

		if (ngayCapGpvt != null) {
			setNgayCapGpvt(ngayCapGpvt);
		}

		String soCongVanChapThuanTcd = (String)attributes.get(
				"soCongVanChapThuanTcd");

		if (soCongVanChapThuanTcd != null) {
			setSoCongVanChapThuanTcd(soCongVanChapThuanTcd);
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

		String loaiGiayPhepLienVan = (String)attributes.get(
				"loaiGiayPhepLienVan");

		if (loaiGiayPhepLienVan != null) {
			setLoaiGiayPhepLienVan(loaiGiayPhepLienVan);
		}

		String soGiayPhepLienVan = (String)attributes.get("soGiayPhepLienVan");

		if (soGiayPhepLienVan != null) {
			setSoGiayPhepLienVan(soGiayPhepLienVan);
		}

		Date ngayCapGiayPhepLienVan = (Date)attributes.get(
				"ngayCapGiayPhepLienVan");

		if (ngayCapGiayPhepLienVan != null) {
			setNgayCapGiayPhepLienVan(ngayCapGiayPhepLienVan);
		}

		Date ngayHetHanGiayPhepLienVan = (Date)attributes.get(
				"ngayHetHanGiayPhepLienVan");

		if (ngayHetHanGiayPhepLienVan != null) {
			setNgayHetHanGiayPhepLienVan(ngayHetHanGiayPhepLienVan);
		}

		String coQuanCapPhepLienVan = (String)attributes.get(
				"coQuanCapPhepLienVan");

		if (coQuanCapPhepLienVan != null) {
			setCoQuanCapPhepLienVan(coQuanCapPhepLienVan);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		Date ngayCapGiayPhepLienVan_LanDau = (Date)attributes.get(
				"ngayCapGiayPhepLienVan_LanDau");

		if (ngayCapGiayPhepLienVan_LanDau != null) {
			setNgayCapGiayPhepLienVan_LanDau(ngayCapGiayPhepLienVan_LanDau);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThongTinXuLyId() {
		return _thongTinXuLyId;
	}

	@Override
	public void setThongTinXuLyId(long thongTinXuLyId) {
		_thongTinXuLyId = thongTinXuLyId;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyId", long.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, thongTinXuLyId);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiCapPhep", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, loaiCapPhep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGpvt() {
		return _soGpvt;
	}

	@Override
	public void setSoGpvt(String soGpvt) {
		_soGpvt = soGpvt;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGpvt", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, soGpvt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGpvt() {
		return _ngayCapGpvt;
	}

	@Override
	public void setNgayCapGpvt(Date ngayCapGpvt) {
		_ngayCapGpvt = ngayCapGpvt;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGpvt", Date.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, ngayCapGpvt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoCongVanChapThuanTcd() {
		return _soCongVanChapThuanTcd;
	}

	@Override
	public void setSoCongVanChapThuanTcd(String soCongVanChapThuanTcd) {
		_soCongVanChapThuanTcd = soCongVanChapThuanTcd;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoCongVanChapThuanTcd",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel,
					soCongVanChapThuanTcd);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCongVanChapThuanTCD",
						Date.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel,
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenTu", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, tuyenTu);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setTuyenDi", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, tuyenDi);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setCuLy", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, cuLy);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBenDi", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, maBenDi);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBenDen", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, maBenDen);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinhDi", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, maTinhDi);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinhDen", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, maTinhDen);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setHanhTrinh", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, hanhTrinh);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMucPhi", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, mucPhi);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setMucDichChuyenDi",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, mucDichChuyenDi);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiGiayPhepLienVan",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, loaiGiayPhepLienVan);
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

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGiayPhepLienVan",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, soGiayPhepLienVan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGiayPhepLienVan() {
		return _ngayCapGiayPhepLienVan;
	}

	@Override
	public void setNgayCapGiayPhepLienVan(Date ngayCapGiayPhepLienVan) {
		_ngayCapGiayPhepLienVan = ngayCapGiayPhepLienVan;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGiayPhepLienVan",
						Date.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel,
					ngayCapGiayPhepLienVan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanGiayPhepLienVan() {
		return _ngayHetHanGiayPhepLienVan;
	}

	@Override
	public void setNgayHetHanGiayPhepLienVan(Date ngayHetHanGiayPhepLienVan) {
		_ngayHetHanGiayPhepLienVan = ngayHetHanGiayPhepLienVan;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanGiayPhepLienVan",
						Date.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel,
					ngayHetHanGiayPhepLienVan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoQuanCapPhepLienVan() {
		return _coQuanCapPhepLienVan;
	}

	@Override
	public void setCoQuanCapPhepLienVan(String coQuanCapPhepLienVan) {
		_coQuanCapPhepLienVan = coQuanCapPhepLienVan;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapPhepLienVan",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel,
					coQuanCapPhepLienVan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	@Override
	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, ketQuaXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	@Override
	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel, lyDoKhongDat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGiayPhepLienVan_LanDau() {
		return _ngayCapGiayPhepLienVan_LanDau;
	}

	@Override
	public void setNgayCapGiayPhepLienVan_LanDau(
		Date ngayCapGiayPhepLienVan_LanDau) {
		_ngayCapGiayPhepLienVan_LanDau = ngayCapGiayPhepLienVan_LanDau;

		if (_qlvtXuLyGpLienVanRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGiayPhepLienVan_LanDau",
						Date.class);

				method.invoke(_qlvtXuLyGpLienVanRemoteModel,
					ngayCapGiayPhepLienVan_LanDau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyGpLienVanRemoteModel() {
		return _qlvtXuLyGpLienVanRemoteModel;
	}

	public void setQlvtXuLyGpLienVanRemoteModel(
		BaseModel<?> qlvtXuLyGpLienVanRemoteModel) {
		_qlvtXuLyGpLienVanRemoteModel = qlvtXuLyGpLienVanRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyGpLienVanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyGpLienVanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpLienVanLocalServiceUtil.addQlvtXuLyGpLienVan(this);
		}
		else {
			QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(this);
		}
	}

	@Override
	public QlvtXuLyGpLienVan toEscapedModel() {
		return (QlvtXuLyGpLienVan)ProxyUtil.newProxyInstance(QlvtXuLyGpLienVan.class.getClassLoader(),
			new Class[] { QlvtXuLyGpLienVan.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyGpLienVanClp clone = new QlvtXuLyGpLienVanClp();

		clone.setId(getId());
		clone.setThongTinXuLyId(getThongTinXuLyId());
		clone.setLoaiCapPhep(getLoaiCapPhep());
		clone.setSoGpvt(getSoGpvt());
		clone.setNgayCapGpvt(getNgayCapGpvt());
		clone.setSoCongVanChapThuanTcd(getSoCongVanChapThuanTcd());
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
		clone.setLoaiGiayPhepLienVan(getLoaiGiayPhepLienVan());
		clone.setSoGiayPhepLienVan(getSoGiayPhepLienVan());
		clone.setNgayCapGiayPhepLienVan(getNgayCapGiayPhepLienVan());
		clone.setNgayHetHanGiayPhepLienVan(getNgayHetHanGiayPhepLienVan());
		clone.setCoQuanCapPhepLienVan(getCoQuanCapPhepLienVan());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setLyDoKhongDat(getLyDoKhongDat());
		clone.setNgayCapGiayPhepLienVan_LanDau(getNgayCapGiayPhepLienVan_LanDau());

		return clone;
	}

	@Override
	public int compareTo(QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		int value = 0;

		if (getId() < qlvtXuLyGpLienVan.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpLienVan.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpLienVanClp)) {
			return false;
		}

		QlvtXuLyGpLienVanClp qlvtXuLyGpLienVan = (QlvtXuLyGpLienVanClp)obj;

		long primaryKey = qlvtXuLyGpLienVan.getPrimaryKey();

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
		StringBundler sb = new StringBundler(51);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongTinXuLyId=");
		sb.append(getThongTinXuLyId());
		sb.append(", loaiCapPhep=");
		sb.append(getLoaiCapPhep());
		sb.append(", soGpvt=");
		sb.append(getSoGpvt());
		sb.append(", ngayCapGpvt=");
		sb.append(getNgayCapGpvt());
		sb.append(", soCongVanChapThuanTcd=");
		sb.append(getSoCongVanChapThuanTcd());
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
		sb.append(", loaiGiayPhepLienVan=");
		sb.append(getLoaiGiayPhepLienVan());
		sb.append(", soGiayPhepLienVan=");
		sb.append(getSoGiayPhepLienVan());
		sb.append(", ngayCapGiayPhepLienVan=");
		sb.append(getNgayCapGiayPhepLienVan());
		sb.append(", ngayHetHanGiayPhepLienVan=");
		sb.append(getNgayHetHanGiayPhepLienVan());
		sb.append(", coQuanCapPhepLienVan=");
		sb.append(getCoQuanCapPhepLienVan());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append(", ngayCapGiayPhepLienVan_LanDau=");
		sb.append(getNgayCapGiayPhepLienVan_LanDau());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXuLyId</column-name><column-value><![CDATA[");
		sb.append(getThongTinXuLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiCapPhep</column-name><column-value><![CDATA[");
		sb.append(getLoaiCapPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGpvt</column-name><column-value><![CDATA[");
		sb.append(getSoGpvt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGpvt</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGpvt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soCongVanChapThuanTcd</column-name><column-value><![CDATA[");
		sb.append(getSoCongVanChapThuanTcd());
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
			"<column><column-name>loaiGiayPhepLienVan</column-name><column-value><![CDATA[");
		sb.append(getLoaiGiayPhepLienVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGiayPhepLienVan</column-name><column-value><![CDATA[");
		sb.append(getSoGiayPhepLienVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGiayPhepLienVan</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGiayPhepLienVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHanGiayPhepLienVan</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanGiayPhepLienVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapPhepLienVan</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapPhepLienVan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLy</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGiayPhepLienVan_LanDau</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGiayPhepLienVan_LanDau());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thongTinXuLyId;
	private String _loaiCapPhep;
	private String _soGpvt;
	private Date _ngayCapGpvt;
	private String _soCongVanChapThuanTcd;
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
	private String _loaiGiayPhepLienVan;
	private String _soGiayPhepLienVan;
	private Date _ngayCapGiayPhepLienVan;
	private Date _ngayHetHanGiayPhepLienVan;
	private String _coQuanCapPhepLienVan;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private Date _ngayCapGiayPhepLienVan_LanDau;
	private BaseModel<?> _qlvtXuLyGpLienVanRemoteModel;
}