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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author binhta
 */
public class QLVTXuLyBienHieuPhuongTienClp extends BaseModelImpl<QLVTXuLyBienHieuPhuongTien>
	implements QLVTXuLyBienHieuPhuongTien {
	public QLVTXuLyBienHieuPhuongTienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyBienHieuPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyBienHieuPhuongTien.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("capBienHieuID", getCapBienHieuID());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("bienSo", getBienSo());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soMay", getSoMay());
		attributes.put("namSx", getNamSx());
		attributes.put("mauSon", getMauSon());
		attributes.put("trongTai", getTrongTai());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("hinhThucSoHuuXe", getHinhThucSoHuuXe());
		attributes.put("linhVucKinhDoanhXeDuLich", getLinhVucKinhDoanhXeDuLich());
		attributes.put("nienHanSuDungGiayDangKiem",
			getNienHanSuDungGiayDangKiem());
		attributes.put("nienHanSuDungND86", getNienHanSuDungND86());
		attributes.put("doanhNghiepSoHuuThue", getDoanhNghiepSoHuuThue());
		attributes.put("thoiHanThue", getThoiHanThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("soPhuHieuDuocCap", getSoPhuHieuDuocCap());
		attributes.put("thoiHanDuocCapPhep", getThoiHanDuocCapPhep());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("soA", getSoA());
		attributes.put("soB", getSoB());
		attributes.put("coGiaTriDen", getCoGiaTriDen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer capBienHieuID = (Integer)attributes.get("capBienHieuID");

		if (capBienHieuID != null) {
			setCapBienHieuID(capBienHieuID);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		String bienSo = (String)attributes.get("bienSo");

		if (bienSo != null) {
			setBienSo(bienSo);
		}

		String soKhung = (String)attributes.get("soKhung");

		if (soKhung != null) {
			setSoKhung(soKhung);
		}

		String soMay = (String)attributes.get("soMay");

		if (soMay != null) {
			setSoMay(soMay);
		}

		Integer namSx = (Integer)attributes.get("namSx");

		if (namSx != null) {
			setNamSx(namSx);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		Long trongTai = (Long)attributes.get("trongTai");

		if (trongTai != null) {
			setTrongTai(trongTai);
		}

		Integer soChoNgoi = (Integer)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
		}

		String hinhThucSoHuuXe = (String)attributes.get("hinhThucSoHuuXe");

		if (hinhThucSoHuuXe != null) {
			setHinhThucSoHuuXe(hinhThucSoHuuXe);
		}

		String linhVucKinhDoanhXeDuLich = (String)attributes.get(
				"linhVucKinhDoanhXeDuLich");

		if (linhVucKinhDoanhXeDuLich != null) {
			setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
		}

		Integer nienHanSuDungGiayDangKiem = (Integer)attributes.get(
				"nienHanSuDungGiayDangKiem");

		if (nienHanSuDungGiayDangKiem != null) {
			setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
		}

		Integer nienHanSuDungND86 = (Integer)attributes.get("nienHanSuDungND86");

		if (nienHanSuDungND86 != null) {
			setNienHanSuDungND86(nienHanSuDungND86);
		}

		String doanhNghiepSoHuuThue = (String)attributes.get(
				"doanhNghiepSoHuuThue");

		if (doanhNghiepSoHuuThue != null) {
			setDoanhNghiepSoHuuThue(doanhNghiepSoHuuThue);
		}

		Date thoiHanThue = (Date)attributes.get("thoiHanThue");

		if (thoiHanThue != null) {
			setThoiHanThue(thoiHanThue);
		}

		Integer hopDongSauCung = (Integer)attributes.get("hopDongSauCung");

		if (hopDongSauCung != null) {
			setHopDongSauCung(hopDongSauCung);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String soPhuHieuDuocCap = (String)attributes.get("soPhuHieuDuocCap");

		if (soPhuHieuDuocCap != null) {
			setSoPhuHieuDuocCap(soPhuHieuDuocCap);
		}

		Date thoiHanDuocCapPhep = (Date)attributes.get("thoiHanDuocCapPhep");

		if (thoiHanDuocCapPhep != null) {
			setThoiHanDuocCapPhep(thoiHanDuocCapPhep);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		String soA = (String)attributes.get("soA");

		if (soA != null) {
			setSoA(soA);
		}

		String soB = (String)attributes.get("soB");

		if (soB != null) {
			setSoB(soB);
		}

		Date coGiaTriDen = (Date)attributes.get("coGiaTriDen");

		if (coGiaTriDen != null) {
			setCoGiaTriDen(coGiaTriDen);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCapBienHieuID() {
		return _capBienHieuID;
	}

	@Override
	public void setCapBienHieuID(int capBienHieuID) {
		_capBienHieuID = capBienHieuID;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setCapBienHieuID", int.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					capBienHieuID);
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

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanHieu", String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, nhanHieu);
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

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setBienSo", String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, bienSo);
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

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoKhung", String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, soKhung);
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

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMay", String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, soMay);
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

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSx", int.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, namSx);
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

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setMauSon", String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, mauSon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrongTai() {
		return _trongTai;
	}

	@Override
	public void setTrongTai(long trongTai) {
		_trongTai = trongTai;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setTrongTai", long.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, trongTai);
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

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoChoNgoi", int.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, soChoNgoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHinhThucSoHuuXe() {
		return _hinhThucSoHuuXe;
	}

	@Override
	public void setHinhThucSoHuuXe(String hinhThucSoHuuXe) {
		_hinhThucSoHuuXe = hinhThucSoHuuXe;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucSoHuuXe",
						String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					hinhThucSoHuuXe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLinhVucKinhDoanhXeDuLich() {
		return _linhVucKinhDoanhXeDuLich;
	}

	@Override
	public void setLinhVucKinhDoanhXeDuLich(String linhVucKinhDoanhXeDuLich) {
		_linhVucKinhDoanhXeDuLich = linhVucKinhDoanhXeDuLich;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLinhVucKinhDoanhXeDuLich",
						String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					linhVucKinhDoanhXeDuLich);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNienHanSuDungGiayDangKiem() {
		return _nienHanSuDungGiayDangKiem;
	}

	@Override
	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem) {
		_nienHanSuDungGiayDangKiem = nienHanSuDungGiayDangKiem;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNienHanSuDungGiayDangKiem",
						int.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					nienHanSuDungGiayDangKiem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNienHanSuDungND86() {
		return _nienHanSuDungND86;
	}

	@Override
	public void setNienHanSuDungND86(int nienHanSuDungND86) {
		_nienHanSuDungND86 = nienHanSuDungND86;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNienHanSuDungND86",
						int.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					nienHanSuDungND86);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDoanhNghiepSoHuuThue() {
		return _doanhNghiepSoHuuThue;
	}

	@Override
	public void setDoanhNghiepSoHuuThue(String doanhNghiepSoHuuThue) {
		_doanhNghiepSoHuuThue = doanhNghiepSoHuuThue;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setDoanhNghiepSoHuuThue",
						String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					doanhNghiepSoHuuThue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiHanThue() {
		return _thoiHanThue;
	}

	@Override
	public void setThoiHanThue(Date thoiHanThue) {
		_thoiHanThue = thoiHanThue;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanThue", Date.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					thoiHanThue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getHopDongSauCung() {
		return _hopDongSauCung;
	}

	@Override
	public void setHopDongSauCung(int hopDongSauCung) {
		_hopDongSauCung = hopDongSauCung;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHopDongSauCung", int.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					hopDongSauCung);
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

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, ketQuaXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoPhuHieuDuocCap() {
		return _soPhuHieuDuocCap;
	}

	@Override
	public void setSoPhuHieuDuocCap(String soPhuHieuDuocCap) {
		_soPhuHieuDuocCap = soPhuHieuDuocCap;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoPhuHieuDuocCap",
						String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					soPhuHieuDuocCap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiHanDuocCapPhep() {
		return _thoiHanDuocCapPhep;
	}

	@Override
	public void setThoiHanDuocCapPhep(Date thoiHanDuocCapPhep) {
		_thoiHanDuocCapPhep = thoiHanDuocCapPhep;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanDuocCapPhep",
						Date.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					thoiHanDuocCapPhep);
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

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					lyDoKhongDat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoA() {
		return _soA;
	}

	@Override
	public void setSoA(String soA) {
		_soA = soA;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoA", String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, soA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoB() {
		return _soB;
	}

	@Override
	public void setSoB(String soB) {
		_soB = soB;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoB", String.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel, soB);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCoGiaTriDen() {
		return _coGiaTriDen;
	}

	@Override
	public void setCoGiaTriDen(Date coGiaTriDen) {
		_coGiaTriDen = coGiaTriDen;

		if (_qlvtXuLyBienHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setCoGiaTriDen", Date.class);

				method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
					coGiaTriDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQLVTXuLyBienHieuPhuongTienRemoteModel() {
		return _qlvtXuLyBienHieuPhuongTienRemoteModel;
	}

	public void setQLVTXuLyBienHieuPhuongTienRemoteModel(
		BaseModel<?> qlvtXuLyBienHieuPhuongTienRemoteModel) {
		_qlvtXuLyBienHieuPhuongTienRemoteModel = qlvtXuLyBienHieuPhuongTienRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyBienHieuPhuongTienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyBienHieuPhuongTienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTXuLyBienHieuPhuongTienLocalServiceUtil.addQLVTXuLyBienHieuPhuongTien(this);
		}
		else {
			QLVTXuLyBienHieuPhuongTienLocalServiceUtil.updateQLVTXuLyBienHieuPhuongTien(this);
		}
	}

	@Override
	public QLVTXuLyBienHieuPhuongTien toEscapedModel() {
		return (QLVTXuLyBienHieuPhuongTien)ProxyUtil.newProxyInstance(QLVTXuLyBienHieuPhuongTien.class.getClassLoader(),
			new Class[] { QLVTXuLyBienHieuPhuongTien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QLVTXuLyBienHieuPhuongTienClp clone = new QLVTXuLyBienHieuPhuongTienClp();

		clone.setId(getId());
		clone.setCapBienHieuID(getCapBienHieuID());
		clone.setNhanHieu(getNhanHieu());
		clone.setBienSo(getBienSo());
		clone.setSoKhung(getSoKhung());
		clone.setSoMay(getSoMay());
		clone.setNamSx(getNamSx());
		clone.setMauSon(getMauSon());
		clone.setTrongTai(getTrongTai());
		clone.setSoChoNgoi(getSoChoNgoi());
		clone.setHinhThucSoHuuXe(getHinhThucSoHuuXe());
		clone.setLinhVucKinhDoanhXeDuLich(getLinhVucKinhDoanhXeDuLich());
		clone.setNienHanSuDungGiayDangKiem(getNienHanSuDungGiayDangKiem());
		clone.setNienHanSuDungND86(getNienHanSuDungND86());
		clone.setDoanhNghiepSoHuuThue(getDoanhNghiepSoHuuThue());
		clone.setThoiHanThue(getThoiHanThue());
		clone.setHopDongSauCung(getHopDongSauCung());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setSoPhuHieuDuocCap(getSoPhuHieuDuocCap());
		clone.setThoiHanDuocCapPhep(getThoiHanDuocCapPhep());
		clone.setLyDoKhongDat(getLyDoKhongDat());
		clone.setSoA(getSoA());
		clone.setSoB(getSoB());
		clone.setCoGiaTriDen(getCoGiaTriDen());

		return clone;
	}

	@Override
	public int compareTo(QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien) {
		int primaryKey = qlvtXuLyBienHieuPhuongTien.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTXuLyBienHieuPhuongTienClp)) {
			return false;
		}

		QLVTXuLyBienHieuPhuongTienClp qlvtXuLyBienHieuPhuongTien = (QLVTXuLyBienHieuPhuongTienClp)obj;

		int primaryKey = qlvtXuLyBienHieuPhuongTien.getPrimaryKey();

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
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", capBienHieuID=");
		sb.append(getCapBienHieuID());
		sb.append(", nhanHieu=");
		sb.append(getNhanHieu());
		sb.append(", bienSo=");
		sb.append(getBienSo());
		sb.append(", soKhung=");
		sb.append(getSoKhung());
		sb.append(", soMay=");
		sb.append(getSoMay());
		sb.append(", namSx=");
		sb.append(getNamSx());
		sb.append(", mauSon=");
		sb.append(getMauSon());
		sb.append(", trongTai=");
		sb.append(getTrongTai());
		sb.append(", soChoNgoi=");
		sb.append(getSoChoNgoi());
		sb.append(", hinhThucSoHuuXe=");
		sb.append(getHinhThucSoHuuXe());
		sb.append(", linhVucKinhDoanhXeDuLich=");
		sb.append(getLinhVucKinhDoanhXeDuLich());
		sb.append(", nienHanSuDungGiayDangKiem=");
		sb.append(getNienHanSuDungGiayDangKiem());
		sb.append(", nienHanSuDungND86=");
		sb.append(getNienHanSuDungND86());
		sb.append(", doanhNghiepSoHuuThue=");
		sb.append(getDoanhNghiepSoHuuThue());
		sb.append(", thoiHanThue=");
		sb.append(getThoiHanThue());
		sb.append(", hopDongSauCung=");
		sb.append(getHopDongSauCung());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", soPhuHieuDuocCap=");
		sb.append(getSoPhuHieuDuocCap());
		sb.append(", thoiHanDuocCapPhep=");
		sb.append(getThoiHanDuocCapPhep());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append(", soA=");
		sb.append(getSoA());
		sb.append(", soB=");
		sb.append(getSoB());
		sb.append(", coGiaTriDen=");
		sb.append(getCoGiaTriDen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capBienHieuID</column-name><column-value><![CDATA[");
		sb.append(getCapBienHieuID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhanHieu</column-name><column-value><![CDATA[");
		sb.append(getNhanHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bienSo</column-name><column-value><![CDATA[");
		sb.append(getBienSo());
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
			"<column><column-name>namSx</column-name><column-value><![CDATA[");
		sb.append(getNamSx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauSon</column-name><column-value><![CDATA[");
		sb.append(getMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trongTai</column-name><column-value><![CDATA[");
		sb.append(getTrongTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soChoNgoi</column-name><column-value><![CDATA[");
		sb.append(getSoChoNgoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hinhThucSoHuuXe</column-name><column-value><![CDATA[");
		sb.append(getHinhThucSoHuuXe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>linhVucKinhDoanhXeDuLich</column-name><column-value><![CDATA[");
		sb.append(getLinhVucKinhDoanhXeDuLich());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nienHanSuDungGiayDangKiem</column-name><column-value><![CDATA[");
		sb.append(getNienHanSuDungGiayDangKiem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nienHanSuDungND86</column-name><column-value><![CDATA[");
		sb.append(getNienHanSuDungND86());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doanhNghiepSoHuuThue</column-name><column-value><![CDATA[");
		sb.append(getDoanhNghiepSoHuuThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanThue</column-name><column-value><![CDATA[");
		sb.append(getThoiHanThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hopDongSauCung</column-name><column-value><![CDATA[");
		sb.append(getHopDongSauCung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLy</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soPhuHieuDuocCap</column-name><column-value><![CDATA[");
		sb.append(getSoPhuHieuDuocCap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanDuocCapPhep</column-name><column-value><![CDATA[");
		sb.append(getThoiHanDuocCapPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soA</column-name><column-value><![CDATA[");
		sb.append(getSoA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soB</column-name><column-value><![CDATA[");
		sb.append(getSoB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coGiaTriDen</column-name><column-value><![CDATA[");
		sb.append(getCoGiaTriDen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _capBienHieuID;
	private String _nhanHieu;
	private String _bienSo;
	private String _soKhung;
	private String _soMay;
	private int _namSx;
	private String _mauSon;
	private long _trongTai;
	private int _soChoNgoi;
	private String _hinhThucSoHuuXe;
	private String _linhVucKinhDoanhXeDuLich;
	private int _nienHanSuDungGiayDangKiem;
	private int _nienHanSuDungND86;
	private String _doanhNghiepSoHuuThue;
	private Date _thoiHanThue;
	private int _hopDongSauCung;
	private String _ketQuaXuLy;
	private String _soPhuHieuDuocCap;
	private Date _thoiHanDuocCapPhep;
	private String _lyDoKhongDat;
	private String _soA;
	private String _soB;
	private Date _coGiaTriDen;
	private BaseModel<?> _qlvtXuLyBienHieuPhuongTienRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.class;
}