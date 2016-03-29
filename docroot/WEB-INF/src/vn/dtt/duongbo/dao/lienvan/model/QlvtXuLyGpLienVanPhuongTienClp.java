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
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtXuLyGpLienVanPhuongTienClp extends BaseModelImpl<QlvtXuLyGpLienVanPhuongTien>
	implements QlvtXuLyGpLienVanPhuongTien {
	public QlvtXuLyGpLienVanPhuongTienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpLienVanPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVanPhuongTien.class.getName();
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
		attributes.put("capGplvId", getCapGplvId());
		attributes.put("bienSo", getBienSo());
		attributes.put("trongTai", getTrongTai());
		attributes.put("namSx", getNamSx());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soMay", getSoMay());
		attributes.put("mauSon", getMauSon());
		attributes.put("cuaKhau", getCuaKhau());
		attributes.put("maCuaKhau", getMaCuaKhau());
		attributes.put("xinCapPhepTuNgay", getXinCapPhepTuNgay());
		attributes.put("xinCapPhepDenNgay", getXinCapPhepDenNgay());
		attributes.put("hinhThucHoatDong", getHinhThucHoatDong());
		attributes.put("soPhuHieu", getSoPhuHieu());
		attributes.put("thoiHanPhuHieu", getThoiHanPhuHieu());
		attributes.put("soNgayXinhGiaHan", getSoNgayXinhGiaHan());
		attributes.put("xinGiaHanTuNgay", getXinGiaHanTuNgay());
		attributes.put("xinGiaHanDenNgay", getXinGiaHanDenNgay());
		attributes.put("hinhThucSoHuu", getHinhThucSoHuu());
		attributes.put("doanhNghiepChoThue", getDoanhNghiepChoThue());
		attributes.put("thoiHanChoThue", getThoiHanChoThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("thoiGianNhapCanh", getThoiGianNhapCanh());
		attributes.put("thoiGianKhoiHanh", getThoiGianKhoiHanh());
		attributes.put("loaiHinhGiaHan", getLoaiHinhGiaHan());
		attributes.put("loaiGiayPhep", getLoaiGiayPhep());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("hanhTrinh", getHanhTrinh());
		attributes.put("phiCapPhep", getPhiCapPhep());
		attributes.put("soGiayPhepLienVanPhuongTien",
			getSoGiayPhepLienVanPhuongTien());
		attributes.put("loaiTuyen", getLoaiTuyen());
		attributes.put("loaiHangVanChuyen", getLoaiHangVanChuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long capGplvId = (Long)attributes.get("capGplvId");

		if (capGplvId != null) {
			setCapGplvId(capGplvId);
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

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		String cuaKhau = (String)attributes.get("cuaKhau");

		if (cuaKhau != null) {
			setCuaKhau(cuaKhau);
		}

		String maCuaKhau = (String)attributes.get("maCuaKhau");

		if (maCuaKhau != null) {
			setMaCuaKhau(maCuaKhau);
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

		String soPhuHieu = (String)attributes.get("soPhuHieu");

		if (soPhuHieu != null) {
			setSoPhuHieu(soPhuHieu);
		}

		Date thoiHanPhuHieu = (Date)attributes.get("thoiHanPhuHieu");

		if (thoiHanPhuHieu != null) {
			setThoiHanPhuHieu(thoiHanPhuHieu);
		}

		Integer soNgayXinhGiaHan = (Integer)attributes.get("soNgayXinhGiaHan");

		if (soNgayXinhGiaHan != null) {
			setSoNgayXinhGiaHan(soNgayXinhGiaHan);
		}

		Date xinGiaHanTuNgay = (Date)attributes.get("xinGiaHanTuNgay");

		if (xinGiaHanTuNgay != null) {
			setXinGiaHanTuNgay(xinGiaHanTuNgay);
		}

		Date xinGiaHanDenNgay = (Date)attributes.get("xinGiaHanDenNgay");

		if (xinGiaHanDenNgay != null) {
			setXinGiaHanDenNgay(xinGiaHanDenNgay);
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

		String loaiHinhGiaHan = (String)attributes.get("loaiHinhGiaHan");

		if (loaiHinhGiaHan != null) {
			setLoaiHinhGiaHan(loaiHinhGiaHan);
		}

		String loaiGiayPhep = (String)attributes.get("loaiGiayPhep");

		if (loaiGiayPhep != null) {
			setLoaiGiayPhep(loaiGiayPhep);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		String soChoNgoi = (String)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
		}

		String hanhTrinh = (String)attributes.get("hanhTrinh");

		if (hanhTrinh != null) {
			setHanhTrinh(hanhTrinh);
		}

		Integer phiCapPhep = (Integer)attributes.get("phiCapPhep");

		if (phiCapPhep != null) {
			setPhiCapPhep(phiCapPhep);
		}

		String soGiayPhepLienVanPhuongTien = (String)attributes.get(
				"soGiayPhepLienVanPhuongTien");

		if (soGiayPhepLienVanPhuongTien != null) {
			setSoGiayPhepLienVanPhuongTien(soGiayPhepLienVanPhuongTien);
		}

		String loaiTuyen = (String)attributes.get("loaiTuyen");

		if (loaiTuyen != null) {
			setLoaiTuyen(loaiTuyen);
		}

		String loaiHangVanChuyen = (String)attributes.get("loaiHangVanChuyen");

		if (loaiHangVanChuyen != null) {
			setLoaiHangVanChuyen(loaiHangVanChuyen);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCapGplvId() {
		return _capGplvId;
	}

	@Override
	public void setCapGplvId(long capGplvId) {
		_capGplvId = capGplvId;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setCapGplvId", long.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, capGplvId);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setBienSo", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, bienSo);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setTrongTai", int.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, trongTai);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSx", int.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, namSx);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanHieu", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, nhanHieu);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoKhung", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, soKhung);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMay", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, soMay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMauSon() {
		return _mauSon;
	}

	@Override
	public void setMauSon(String mauSon) {
		_mauSon = mauSon;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setMauSon", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, mauSon);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaKhau", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, cuaKhau);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setMaCuaKhau", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, maCuaKhau);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setXinCapPhepTuNgay",
						Date.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setXinCapPhepDenNgay",
						Date.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucHoatDong",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					hinhThucHoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoPhuHieu() {
		return _soPhuHieu;
	}

	@Override
	public void setSoPhuHieu(String soPhuHieu) {
		_soPhuHieu = soPhuHieu;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoPhuHieu", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, soPhuHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiHanPhuHieu() {
		return _thoiHanPhuHieu;
	}

	@Override
	public void setThoiHanPhuHieu(Date thoiHanPhuHieu) {
		_thoiHanPhuHieu = thoiHanPhuHieu;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanPhuHieu", Date.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					thoiHanPhuHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNgayXinhGiaHan() {
		return _soNgayXinhGiaHan;
	}

	@Override
	public void setSoNgayXinhGiaHan(int soNgayXinhGiaHan) {
		_soNgayXinhGiaHan = soNgayXinhGiaHan;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNgayXinhGiaHan", int.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					soNgayXinhGiaHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getXinGiaHanTuNgay() {
		return _xinGiaHanTuNgay;
	}

	@Override
	public void setXinGiaHanTuNgay(Date xinGiaHanTuNgay) {
		_xinGiaHanTuNgay = xinGiaHanTuNgay;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setXinGiaHanTuNgay", Date.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					xinGiaHanTuNgay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getXinGiaHanDenNgay() {
		return _xinGiaHanDenNgay;
	}

	@Override
	public void setXinGiaHanDenNgay(Date xinGiaHanDenNgay) {
		_xinGiaHanDenNgay = xinGiaHanDenNgay;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setXinGiaHanDenNgay",
						Date.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					xinGiaHanDenNgay);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucSoHuu", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setDoanhNghiepChoThue",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanChoThue", Date.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHopDongSauCung", long.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianNhapCanh",
						Date.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianKhoiHanh",
						Date.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					thoiGianKhoiHanh);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhGiaHan",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					loaiHinhGiaHan);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiGiayPhep", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					loaiGiayPhep);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					lyDoKhongDat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoChoNgoi() {
		return _soChoNgoi;
	}

	@Override
	public void setSoChoNgoi(String soChoNgoi) {
		_soChoNgoi = soChoNgoi;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoChoNgoi", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, soChoNgoi);
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

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHanhTrinh", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, hanhTrinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPhiCapPhep() {
		return _phiCapPhep;
	}

	@Override
	public void setPhiCapPhep(int phiCapPhep) {
		_phiCapPhep = phiCapPhep;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setPhiCapPhep", int.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					phiCapPhep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGiayPhepLienVanPhuongTien() {
		return _soGiayPhepLienVanPhuongTien;
	}

	@Override
	public void setSoGiayPhepLienVanPhuongTien(
		String soGiayPhepLienVanPhuongTien) {
		_soGiayPhepLienVanPhuongTien = soGiayPhepLienVanPhuongTien;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGiayPhepLienVanPhuongTien",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					soGiayPhepLienVanPhuongTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiTuyen() {
		return _loaiTuyen;
	}

	@Override
	public void setLoaiTuyen(String loaiTuyen) {
		_loaiTuyen = loaiTuyen;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiTuyen", String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel, loaiTuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiHangVanChuyen() {
		return _loaiHangVanChuyen;
	}

	@Override
	public void setLoaiHangVanChuyen(String loaiHangVanChuyen) {
		_loaiHangVanChuyen = loaiHangVanChuyen;

		if (_qlvtXuLyGpLienVanPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHangVanChuyen",
						String.class);

				method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
					loaiHangVanChuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyGpLienVanPhuongTienRemoteModel() {
		return _qlvtXuLyGpLienVanPhuongTienRemoteModel;
	}

	public void setQlvtXuLyGpLienVanPhuongTienRemoteModel(
		BaseModel<?> qlvtXuLyGpLienVanPhuongTienRemoteModel) {
		_qlvtXuLyGpLienVanPhuongTienRemoteModel = qlvtXuLyGpLienVanPhuongTienRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyGpLienVanPhuongTienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyGpLienVanPhuongTienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.addQlvtXuLyGpLienVanPhuongTien(this);
		}
		else {
			QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(this);
		}
	}

	@Override
	public QlvtXuLyGpLienVanPhuongTien toEscapedModel() {
		return (QlvtXuLyGpLienVanPhuongTien)ProxyUtil.newProxyInstance(QlvtXuLyGpLienVanPhuongTien.class.getClassLoader(),
			new Class[] { QlvtXuLyGpLienVanPhuongTien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyGpLienVanPhuongTienClp clone = new QlvtXuLyGpLienVanPhuongTienClp();

		clone.setId(getId());
		clone.setCapGplvId(getCapGplvId());
		clone.setBienSo(getBienSo());
		clone.setTrongTai(getTrongTai());
		clone.setNamSx(getNamSx());
		clone.setNhanHieu(getNhanHieu());
		clone.setSoKhung(getSoKhung());
		clone.setSoMay(getSoMay());
		clone.setMauSon(getMauSon());
		clone.setCuaKhau(getCuaKhau());
		clone.setMaCuaKhau(getMaCuaKhau());
		clone.setXinCapPhepTuNgay(getXinCapPhepTuNgay());
		clone.setXinCapPhepDenNgay(getXinCapPhepDenNgay());
		clone.setHinhThucHoatDong(getHinhThucHoatDong());
		clone.setSoPhuHieu(getSoPhuHieu());
		clone.setThoiHanPhuHieu(getThoiHanPhuHieu());
		clone.setSoNgayXinhGiaHan(getSoNgayXinhGiaHan());
		clone.setXinGiaHanTuNgay(getXinGiaHanTuNgay());
		clone.setXinGiaHanDenNgay(getXinGiaHanDenNgay());
		clone.setHinhThucSoHuu(getHinhThucSoHuu());
		clone.setDoanhNghiepChoThue(getDoanhNghiepChoThue());
		clone.setThoiHanChoThue(getThoiHanChoThue());
		clone.setHopDongSauCung(getHopDongSauCung());
		clone.setThoiGianNhapCanh(getThoiGianNhapCanh());
		clone.setThoiGianKhoiHanh(getThoiGianKhoiHanh());
		clone.setLoaiHinhGiaHan(getLoaiHinhGiaHan());
		clone.setLoaiGiayPhep(getLoaiGiayPhep());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setLyDoKhongDat(getLyDoKhongDat());
		clone.setSoChoNgoi(getSoChoNgoi());
		clone.setHanhTrinh(getHanhTrinh());
		clone.setPhiCapPhep(getPhiCapPhep());
		clone.setSoGiayPhepLienVanPhuongTien(getSoGiayPhepLienVanPhuongTien());
		clone.setLoaiTuyen(getLoaiTuyen());
		clone.setLoaiHangVanChuyen(getLoaiHangVanChuyen());

		return clone;
	}

	@Override
	public int compareTo(
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien) {
		int value = 0;

		if (getId() < qlvtXuLyGpLienVanPhuongTien.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpLienVanPhuongTien.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpLienVanPhuongTienClp)) {
			return false;
		}

		QlvtXuLyGpLienVanPhuongTienClp qlvtXuLyGpLienVanPhuongTien = (QlvtXuLyGpLienVanPhuongTienClp)obj;

		long primaryKey = qlvtXuLyGpLienVanPhuongTien.getPrimaryKey();

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
		StringBundler sb = new StringBundler(71);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", capGplvId=");
		sb.append(getCapGplvId());
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
		sb.append(", mauSon=");
		sb.append(getMauSon());
		sb.append(", cuaKhau=");
		sb.append(getCuaKhau());
		sb.append(", maCuaKhau=");
		sb.append(getMaCuaKhau());
		sb.append(", xinCapPhepTuNgay=");
		sb.append(getXinCapPhepTuNgay());
		sb.append(", xinCapPhepDenNgay=");
		sb.append(getXinCapPhepDenNgay());
		sb.append(", hinhThucHoatDong=");
		sb.append(getHinhThucHoatDong());
		sb.append(", soPhuHieu=");
		sb.append(getSoPhuHieu());
		sb.append(", thoiHanPhuHieu=");
		sb.append(getThoiHanPhuHieu());
		sb.append(", soNgayXinhGiaHan=");
		sb.append(getSoNgayXinhGiaHan());
		sb.append(", xinGiaHanTuNgay=");
		sb.append(getXinGiaHanTuNgay());
		sb.append(", xinGiaHanDenNgay=");
		sb.append(getXinGiaHanDenNgay());
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
		sb.append(", loaiHinhGiaHan=");
		sb.append(getLoaiHinhGiaHan());
		sb.append(", loaiGiayPhep=");
		sb.append(getLoaiGiayPhep());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append(", soChoNgoi=");
		sb.append(getSoChoNgoi());
		sb.append(", hanhTrinh=");
		sb.append(getHanhTrinh());
		sb.append(", phiCapPhep=");
		sb.append(getPhiCapPhep());
		sb.append(", soGiayPhepLienVanPhuongTien=");
		sb.append(getSoGiayPhepLienVanPhuongTien());
		sb.append(", loaiTuyen=");
		sb.append(getLoaiTuyen());
		sb.append(", loaiHangVanChuyen=");
		sb.append(getLoaiHangVanChuyen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(109);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capGplvId</column-name><column-value><![CDATA[");
		sb.append(getCapGplvId());
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
			"<column><column-name>mauSon</column-name><column-value><![CDATA[");
		sb.append(getMauSon());
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
			"<column><column-name>soPhuHieu</column-name><column-value><![CDATA[");
		sb.append(getSoPhuHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanPhuHieu</column-name><column-value><![CDATA[");
		sb.append(getThoiHanPhuHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNgayXinhGiaHan</column-name><column-value><![CDATA[");
		sb.append(getSoNgayXinhGiaHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xinGiaHanTuNgay</column-name><column-value><![CDATA[");
		sb.append(getXinGiaHanTuNgay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xinGiaHanDenNgay</column-name><column-value><![CDATA[");
		sb.append(getXinGiaHanDenNgay());
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
			"<column><column-name>loaiHinhGiaHan</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhGiaHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiGiayPhep</column-name><column-value><![CDATA[");
		sb.append(getLoaiGiayPhep());
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
			"<column><column-name>soChoNgoi</column-name><column-value><![CDATA[");
		sb.append(getSoChoNgoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hanhTrinh</column-name><column-value><![CDATA[");
		sb.append(getHanhTrinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phiCapPhep</column-name><column-value><![CDATA[");
		sb.append(getPhiCapPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGiayPhepLienVanPhuongTien</column-name><column-value><![CDATA[");
		sb.append(getSoGiayPhepLienVanPhuongTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiTuyen</column-name><column-value><![CDATA[");
		sb.append(getLoaiTuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiHangVanChuyen</column-name><column-value><![CDATA[");
		sb.append(getLoaiHangVanChuyen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _capGplvId;
	private String _bienSo;
	private int _trongTai;
	private int _namSx;
	private String _nhanHieu;
	private String _soKhung;
	private String _soMay;
	private String _mauSon;
	private String _cuaKhau;
	private String _maCuaKhau;
	private Date _xinCapPhepTuNgay;
	private Date _xinCapPhepDenNgay;
	private String _hinhThucHoatDong;
	private String _soPhuHieu;
	private Date _thoiHanPhuHieu;
	private int _soNgayXinhGiaHan;
	private Date _xinGiaHanTuNgay;
	private Date _xinGiaHanDenNgay;
	private String _hinhThucSoHuu;
	private String _doanhNghiepChoThue;
	private Date _thoiHanChoThue;
	private long _hopDongSauCung;
	private Date _thoiGianNhapCanh;
	private Date _thoiGianKhoiHanh;
	private String _loaiHinhGiaHan;
	private String _loaiGiayPhep;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private String _soChoNgoi;
	private String _hanhTrinh;
	private int _phiCapPhep;
	private String _soGiayPhepLienVanPhuongTien;
	private String _loaiTuyen;
	private String _loaiHangVanChuyen;
	private BaseModel<?> _qlvtXuLyGpLienVanPhuongTienRemoteModel;
}