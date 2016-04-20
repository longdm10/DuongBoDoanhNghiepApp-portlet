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

package vn.dtt.duongbo.dao.quocte.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.quocte.service.ClpSerializer;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NoiPham
 */
public class QlvtXuLyKTTQuocTePhuongTienClp extends BaseModelImpl<QlvtXuLyKTTQuocTePhuongTien>
	implements QlvtXuLyKTTQuocTePhuongTien {
	public QlvtXuLyKTTQuocTePhuongTienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyKTTQuocTePhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyKTTQuocTePhuongTien.class.getName();
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
		attributes.put("kttQuocTeID", getKttQuocTeID());
		attributes.put("bienSo", getBienSo());
		attributes.put("trongTai", getTrongTai());
		attributes.put("namSx", getNamSx());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soMay", getSoMay());
		attributes.put("cuaKhau", getCuaKhau());
		attributes.put("maCuaKhau", getMaCuaKhau());
		attributes.put("hinhThucSoHuu", getHinhThucSoHuu());
		attributes.put("doanhNghiepChoThue", getDoanhNghiepChoThue());
		attributes.put("thoiHanChoThue", getThoiHanChoThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("thoiGianNhapCanh", getThoiGianNhapCanh());
		attributes.put("thoiGianKhoiHanh", getThoiGianKhoiHanh());
		attributes.put("xinCapPhepTuNgay", getXinCapPhepTuNgay());
		attributes.put("xinCapPhepDenNgay", getXinCapPhepDenNgay());
		attributes.put("hinhThucHoatDong", getHinhThucHoatDong());
		attributes.put("loaiHinhGiaHan", getLoaiHinhGiaHan());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("capPhepKTTQuocTeID", getCapPhepKTTQuocTeID());
		attributes.put("loaiGiayPhep", getLoaiGiayPhep());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("tenDangKySoHuu", getTenDangKySoHuu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long kttQuocTeID = (Long)attributes.get("kttQuocTeID");

		if (kttQuocTeID != null) {
			setKttQuocTeID(kttQuocTeID);
		}

		String bienSo = (String)attributes.get("bienSo");

		if (bienSo != null) {
			setBienSo(bienSo);
		}

		Integer trongTai = (Integer)attributes.get("trongTai");

		if (trongTai != null) {
			setTrongTai(trongTai);
		}

		Integer namSx = (Integer)attributes.get("namSx");

		if (namSx != null) {
			setNamSx(namSx);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		String soKhung = (String)attributes.get("soKhung");

		if (soKhung != null) {
			setSoKhung(soKhung);
		}

		String soMay = (String)attributes.get("soMay");

		if (soMay != null) {
			setSoMay(soMay);
		}

		String cuaKhau = (String)attributes.get("cuaKhau");

		if (cuaKhau != null) {
			setCuaKhau(cuaKhau);
		}

		String maCuaKhau = (String)attributes.get("maCuaKhau");

		if (maCuaKhau != null) {
			setMaCuaKhau(maCuaKhau);
		}

		String hinhThucSoHuu = (String)attributes.get("hinhThucSoHuu");

		if (hinhThucSoHuu != null) {
			setHinhThucSoHuu(hinhThucSoHuu);
		}

		String doanhNghiepChoThue = (String)attributes.get("doanhNghiepChoThue");

		if (doanhNghiepChoThue != null) {
			setDoanhNghiepChoThue(doanhNghiepChoThue);
		}

		Date thoiHanChoThue = (Date)attributes.get("thoiHanChoThue");

		if (thoiHanChoThue != null) {
			setThoiHanChoThue(thoiHanChoThue);
		}

		Long hopDongSauCung = (Long)attributes.get("hopDongSauCung");

		if (hopDongSauCung != null) {
			setHopDongSauCung(hopDongSauCung);
		}

		Date thoiGianNhapCanh = (Date)attributes.get("thoiGianNhapCanh");

		if (thoiGianNhapCanh != null) {
			setThoiGianNhapCanh(thoiGianNhapCanh);
		}

		Date thoiGianKhoiHanh = (Date)attributes.get("thoiGianKhoiHanh");

		if (thoiGianKhoiHanh != null) {
			setThoiGianKhoiHanh(thoiGianKhoiHanh);
		}

		Date xinCapPhepTuNgay = (Date)attributes.get("xinCapPhepTuNgay");

		if (xinCapPhepTuNgay != null) {
			setXinCapPhepTuNgay(xinCapPhepTuNgay);
		}

		Date xinCapPhepDenNgay = (Date)attributes.get("xinCapPhepDenNgay");

		if (xinCapPhepDenNgay != null) {
			setXinCapPhepDenNgay(xinCapPhepDenNgay);
		}

		String hinhThucHoatDong = (String)attributes.get("hinhThucHoatDong");

		if (hinhThucHoatDong != null) {
			setHinhThucHoatDong(hinhThucHoatDong);
		}

		String loaiHinhGiaHan = (String)attributes.get("loaiHinhGiaHan");

		if (loaiHinhGiaHan != null) {
			setLoaiHinhGiaHan(loaiHinhGiaHan);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		Long capPhepKTTQuocTeID = (Long)attributes.get("capPhepKTTQuocTeID");

		if (capPhepKTTQuocTeID != null) {
			setCapPhepKTTQuocTeID(capPhepKTTQuocTeID);
		}

		String loaiGiayPhep = (String)attributes.get("loaiGiayPhep");

		if (loaiGiayPhep != null) {
			setLoaiGiayPhep(loaiGiayPhep);
		}

		Integer soChoNgoi = (Integer)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
		}

		String tenDangKySoHuu = (String)attributes.get("tenDangKySoHuu");

		if (tenDangKySoHuu != null) {
			setTenDangKySoHuu(tenDangKySoHuu);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKttQuocTeID() {
		return _kttQuocTeID;
	}

	@Override
	public void setKttQuocTeID(long kttQuocTeID) {
		_kttQuocTeID = kttQuocTeID;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setKttQuocTeID", long.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					kttQuocTeID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBienSo() {
		return _bienSo;
	}

	@Override
	public void setBienSo(String bienSo) {
		_bienSo = bienSo;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setBienSo", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, bienSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrongTai() {
		return _trongTai;
	}

	@Override
	public void setTrongTai(int trongTai) {
		_trongTai = trongTai;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setTrongTai", int.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, trongTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamSx() {
		return _namSx;
	}

	@Override
	public void setNamSx(int namSx) {
		_namSx = namSx;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSx", int.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, namSx);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhanHieu() {
		return _nhanHieu;
	}

	@Override
	public void setNhanHieu(String nhanHieu) {
		_nhanHieu = nhanHieu;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanHieu", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, nhanHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoKhung() {
		return _soKhung;
	}

	@Override
	public void setSoKhung(String soKhung) {
		_soKhung = soKhung;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoKhung", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, soKhung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoMay() {
		return _soMay;
	}

	@Override
	public void setSoMay(String soMay) {
		_soMay = soMay;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMay", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, soMay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCuaKhau() {
		return _cuaKhau;
	}

	@Override
	public void setCuaKhau(String cuaKhau) {
		_cuaKhau = cuaKhau;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaKhau", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, cuaKhau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaCuaKhau() {
		return _maCuaKhau;
	}

	@Override
	public void setMaCuaKhau(String maCuaKhau) {
		_maCuaKhau = maCuaKhau;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setMaCuaKhau", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, maCuaKhau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHinhThucSoHuu() {
		return _hinhThucSoHuu;
	}

	@Override
	public void setHinhThucSoHuu(String hinhThucSoHuu) {
		_hinhThucSoHuu = hinhThucSoHuu;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucSoHuu", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					hinhThucSoHuu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDoanhNghiepChoThue() {
		return _doanhNghiepChoThue;
	}

	@Override
	public void setDoanhNghiepChoThue(String doanhNghiepChoThue) {
		_doanhNghiepChoThue = doanhNghiepChoThue;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setDoanhNghiepChoThue",
						String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					doanhNghiepChoThue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiHanChoThue() {
		return _thoiHanChoThue;
	}

	@Override
	public void setThoiHanChoThue(Date thoiHanChoThue) {
		_thoiHanChoThue = thoiHanChoThue;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanChoThue", Date.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					thoiHanChoThue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHopDongSauCung() {
		return _hopDongSauCung;
	}

	@Override
	public void setHopDongSauCung(long hopDongSauCung) {
		_hopDongSauCung = hopDongSauCung;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHopDongSauCung", long.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					hopDongSauCung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianNhapCanh() {
		return _thoiGianNhapCanh;
	}

	@Override
	public void setThoiGianNhapCanh(Date thoiGianNhapCanh) {
		_thoiGianNhapCanh = thoiGianNhapCanh;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianNhapCanh",
						Date.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					thoiGianNhapCanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianKhoiHanh() {
		return _thoiGianKhoiHanh;
	}

	@Override
	public void setThoiGianKhoiHanh(Date thoiGianKhoiHanh) {
		_thoiGianKhoiHanh = thoiGianKhoiHanh;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianKhoiHanh",
						Date.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					thoiGianKhoiHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getXinCapPhepTuNgay() {
		return _xinCapPhepTuNgay;
	}

	@Override
	public void setXinCapPhepTuNgay(Date xinCapPhepTuNgay) {
		_xinCapPhepTuNgay = xinCapPhepTuNgay;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setXinCapPhepTuNgay",
						Date.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					xinCapPhepTuNgay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getXinCapPhepDenNgay() {
		return _xinCapPhepDenNgay;
	}

	@Override
	public void setXinCapPhepDenNgay(Date xinCapPhepDenNgay) {
		_xinCapPhepDenNgay = xinCapPhepDenNgay;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setXinCapPhepDenNgay",
						Date.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					xinCapPhepDenNgay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHinhThucHoatDong() {
		return _hinhThucHoatDong;
	}

	@Override
	public void setHinhThucHoatDong(String hinhThucHoatDong) {
		_hinhThucHoatDong = hinhThucHoatDong;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucHoatDong",
						String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					hinhThucHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiHinhGiaHan() {
		return _loaiHinhGiaHan;
	}

	@Override
	public void setLoaiHinhGiaHan(String loaiHinhGiaHan) {
		_loaiHinhGiaHan = loaiHinhGiaHan;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhGiaHan",
						String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					loaiHinhGiaHan);
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

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					ketQuaXuLy);
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

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					lyDoKhongDat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCapPhepKTTQuocTeID() {
		return _capPhepKTTQuocTeID;
	}

	@Override
	public void setCapPhepKTTQuocTeID(long capPhepKTTQuocTeID) {
		_capPhepKTTQuocTeID = capPhepKTTQuocTeID;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setCapPhepKTTQuocTeID",
						long.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					capPhepKTTQuocTeID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiGiayPhep() {
		return _loaiGiayPhep;
	}

	@Override
	public void setLoaiGiayPhep(String loaiGiayPhep) {
		_loaiGiayPhep = loaiGiayPhep;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiGiayPhep", String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					loaiGiayPhep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoChoNgoi() {
		return _soChoNgoi;
	}

	@Override
	public void setSoChoNgoi(int soChoNgoi) {
		_soChoNgoi = soChoNgoi;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoChoNgoi", int.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel, soChoNgoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDangKySoHuu() {
		return _tenDangKySoHuu;
	}

	@Override
	public void setTenDangKySoHuu(String tenDangKySoHuu) {
		_tenDangKySoHuu = tenDangKySoHuu;

		if (_qlvtXuLyKTTQuocTePhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDangKySoHuu",
						String.class);

				method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
					tenDangKySoHuu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyKTTQuocTePhuongTienRemoteModel() {
		return _qlvtXuLyKTTQuocTePhuongTienRemoteModel;
	}

	public void setQlvtXuLyKTTQuocTePhuongTienRemoteModel(
		BaseModel<?> qlvtXuLyKTTQuocTePhuongTienRemoteModel) {
		_qlvtXuLyKTTQuocTePhuongTienRemoteModel = qlvtXuLyKTTQuocTePhuongTienRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyKTTQuocTePhuongTienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyKTTQuocTePhuongTienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.addQlvtXuLyKTTQuocTePhuongTien(this);
		}
		else {
			QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.updateQlvtXuLyKTTQuocTePhuongTien(this);
		}
	}

	@Override
	public QlvtXuLyKTTQuocTePhuongTien toEscapedModel() {
		return (QlvtXuLyKTTQuocTePhuongTien)ProxyUtil.newProxyInstance(QlvtXuLyKTTQuocTePhuongTien.class.getClassLoader(),
			new Class[] { QlvtXuLyKTTQuocTePhuongTien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyKTTQuocTePhuongTienClp clone = new QlvtXuLyKTTQuocTePhuongTienClp();

		clone.setId(getId());
		clone.setKttQuocTeID(getKttQuocTeID());
		clone.setBienSo(getBienSo());
		clone.setTrongTai(getTrongTai());
		clone.setNamSx(getNamSx());
		clone.setNhanHieu(getNhanHieu());
		clone.setSoKhung(getSoKhung());
		clone.setSoMay(getSoMay());
		clone.setCuaKhau(getCuaKhau());
		clone.setMaCuaKhau(getMaCuaKhau());
		clone.setHinhThucSoHuu(getHinhThucSoHuu());
		clone.setDoanhNghiepChoThue(getDoanhNghiepChoThue());
		clone.setThoiHanChoThue(getThoiHanChoThue());
		clone.setHopDongSauCung(getHopDongSauCung());
		clone.setThoiGianNhapCanh(getThoiGianNhapCanh());
		clone.setThoiGianKhoiHanh(getThoiGianKhoiHanh());
		clone.setXinCapPhepTuNgay(getXinCapPhepTuNgay());
		clone.setXinCapPhepDenNgay(getXinCapPhepDenNgay());
		clone.setHinhThucHoatDong(getHinhThucHoatDong());
		clone.setLoaiHinhGiaHan(getLoaiHinhGiaHan());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setLyDoKhongDat(getLyDoKhongDat());
		clone.setCapPhepKTTQuocTeID(getCapPhepKTTQuocTeID());
		clone.setLoaiGiayPhep(getLoaiGiayPhep());
		clone.setSoChoNgoi(getSoChoNgoi());
		clone.setTenDangKySoHuu(getTenDangKySoHuu());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien) {
		int value = 0;

		if (getId() < qlvtXuLyKTTQuocTePhuongTien.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyKTTQuocTePhuongTien.getId()) {
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

		if (!(obj instanceof QlvtXuLyKTTQuocTePhuongTienClp)) {
			return false;
		}

		QlvtXuLyKTTQuocTePhuongTienClp qlvtXuLyKTTQuocTePhuongTien = (QlvtXuLyKTTQuocTePhuongTienClp)obj;

		long primaryKey = qlvtXuLyKTTQuocTePhuongTien.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", kttQuocTeID=");
		sb.append(getKttQuocTeID());
		sb.append(", bienSo=");
		sb.append(getBienSo());
		sb.append(", trongTai=");
		sb.append(getTrongTai());
		sb.append(", namSx=");
		sb.append(getNamSx());
		sb.append(", nhanHieu=");
		sb.append(getNhanHieu());
		sb.append(", soKhung=");
		sb.append(getSoKhung());
		sb.append(", soMay=");
		sb.append(getSoMay());
		sb.append(", cuaKhau=");
		sb.append(getCuaKhau());
		sb.append(", maCuaKhau=");
		sb.append(getMaCuaKhau());
		sb.append(", hinhThucSoHuu=");
		sb.append(getHinhThucSoHuu());
		sb.append(", doanhNghiepChoThue=");
		sb.append(getDoanhNghiepChoThue());
		sb.append(", thoiHanChoThue=");
		sb.append(getThoiHanChoThue());
		sb.append(", hopDongSauCung=");
		sb.append(getHopDongSauCung());
		sb.append(", thoiGianNhapCanh=");
		sb.append(getThoiGianNhapCanh());
		sb.append(", thoiGianKhoiHanh=");
		sb.append(getThoiGianKhoiHanh());
		sb.append(", xinCapPhepTuNgay=");
		sb.append(getXinCapPhepTuNgay());
		sb.append(", xinCapPhepDenNgay=");
		sb.append(getXinCapPhepDenNgay());
		sb.append(", hinhThucHoatDong=");
		sb.append(getHinhThucHoatDong());
		sb.append(", loaiHinhGiaHan=");
		sb.append(getLoaiHinhGiaHan());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append(", capPhepKTTQuocTeID=");
		sb.append(getCapPhepKTTQuocTeID());
		sb.append(", loaiGiayPhep=");
		sb.append(getLoaiGiayPhep());
		sb.append(", soChoNgoi=");
		sb.append(getSoChoNgoi());
		sb.append(", tenDangKySoHuu=");
		sb.append(getTenDangKySoHuu());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(82);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kttQuocTeID</column-name><column-value><![CDATA[");
		sb.append(getKttQuocTeID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bienSo</column-name><column-value><![CDATA[");
		sb.append(getBienSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trongTai</column-name><column-value><![CDATA[");
		sb.append(getTrongTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namSx</column-name><column-value><![CDATA[");
		sb.append(getNamSx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhanHieu</column-name><column-value><![CDATA[");
		sb.append(getNhanHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soKhung</column-name><column-value><![CDATA[");
		sb.append(getSoKhung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soMay</column-name><column-value><![CDATA[");
		sb.append(getSoMay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cuaKhau</column-name><column-value><![CDATA[");
		sb.append(getCuaKhau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maCuaKhau</column-name><column-value><![CDATA[");
		sb.append(getMaCuaKhau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hinhThucSoHuu</column-name><column-value><![CDATA[");
		sb.append(getHinhThucSoHuu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doanhNghiepChoThue</column-name><column-value><![CDATA[");
		sb.append(getDoanhNghiepChoThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanChoThue</column-name><column-value><![CDATA[");
		sb.append(getThoiHanChoThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hopDongSauCung</column-name><column-value><![CDATA[");
		sb.append(getHopDongSauCung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianNhapCanh</column-name><column-value><![CDATA[");
		sb.append(getThoiGianNhapCanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianKhoiHanh</column-name><column-value><![CDATA[");
		sb.append(getThoiGianKhoiHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xinCapPhepTuNgay</column-name><column-value><![CDATA[");
		sb.append(getXinCapPhepTuNgay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xinCapPhepDenNgay</column-name><column-value><![CDATA[");
		sb.append(getXinCapPhepDenNgay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hinhThucHoatDong</column-name><column-value><![CDATA[");
		sb.append(getHinhThucHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiHinhGiaHan</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhGiaHan());
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
			"<column><column-name>capPhepKTTQuocTeID</column-name><column-value><![CDATA[");
		sb.append(getCapPhepKTTQuocTeID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiGiayPhep</column-name><column-value><![CDATA[");
		sb.append(getLoaiGiayPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soChoNgoi</column-name><column-value><![CDATA[");
		sb.append(getSoChoNgoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenDangKySoHuu</column-name><column-value><![CDATA[");
		sb.append(getTenDangKySoHuu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _kttQuocTeID;
	private String _bienSo;
	private int _trongTai;
	private int _namSx;
	private String _nhanHieu;
	private String _soKhung;
	private String _soMay;
	private String _cuaKhau;
	private String _maCuaKhau;
	private String _hinhThucSoHuu;
	private String _doanhNghiepChoThue;
	private Date _thoiHanChoThue;
	private long _hopDongSauCung;
	private Date _thoiGianNhapCanh;
	private Date _thoiGianKhoiHanh;
	private Date _xinCapPhepTuNgay;
	private Date _xinCapPhepDenNgay;
	private String _hinhThucHoatDong;
	private String _loaiHinhGiaHan;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private long _capPhepKTTQuocTeID;
	private String _loaiGiayPhep;
	private int _soChoNgoi;
	private String _tenDangKySoHuu;
	private BaseModel<?> _qlvtXuLyKTTQuocTePhuongTienRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.quocte.service.ClpSerializer.class;
}