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
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author binhta
 */
public class QLVTXuLyPhuHieuPhuongTienClp extends BaseModelImpl<QLVTXuLyPhuHieuPhuongTien>
	implements QLVTXuLyPhuHieuPhuongTien {
	public QLVTXuLyPhuHieuPhuongTienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyPhuHieuPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyPhuHieuPhuongTien.class.getName();
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
		attributes.put("capPhuHieuID", getCapPhuHieuID());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("bienSo", getBienSo());
		attributes.put("trongTai", getTrongTai());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("noiSanXuat", getNoiSanXuat());
		attributes.put("namSanXuat", getNamSanXuat());
		attributes.put("maTuyenCoDinh", getMaTuyenCoDinh());
		attributes.put("loaiTuyen", getLoaiTuyen());
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
		attributes.put("loaiPhuHieuXinCap", getLoaiPhuHieuXinCap());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("coGiaTriDen", getCoGiaTriDen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer capPhuHieuID = (Integer)attributes.get("capPhuHieuID");

		if (capPhuHieuID != null) {
			setCapPhuHieuID(capPhuHieuID);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		String bienSo = (String)attributes.get("bienSo");

		if (bienSo != null) {
			setBienSo(bienSo);
		}

		Integer trongTai = (Integer)attributes.get("trongTai");

		if (trongTai != null) {
			setTrongTai(trongTai);
		}

		Integer soChoNgoi = (Integer)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
		}

		String noiSanXuat = (String)attributes.get("noiSanXuat");

		if (noiSanXuat != null) {
			setNoiSanXuat(noiSanXuat);
		}

		Integer namSanXuat = (Integer)attributes.get("namSanXuat");

		if (namSanXuat != null) {
			setNamSanXuat(namSanXuat);
		}

		String maTuyenCoDinh = (String)attributes.get("maTuyenCoDinh");

		if (maTuyenCoDinh != null) {
			setMaTuyenCoDinh(maTuyenCoDinh);
		}

		String loaiTuyen = (String)attributes.get("loaiTuyen");

		if (loaiTuyen != null) {
			setLoaiTuyen(loaiTuyen);
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

		String loaiPhuHieuXinCap = (String)attributes.get("loaiPhuHieuXinCap");

		if (loaiPhuHieuXinCap != null) {
			setLoaiPhuHieuXinCap(loaiPhuHieuXinCap);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCapPhuHieuID() {
		return _capPhuHieuID;
	}

	@Override
	public void setCapPhuHieuID(int capPhuHieuID) {
		_capPhuHieuID = capPhuHieuID;

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setCapPhuHieuID", int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
					capPhuHieuID);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanHieu", String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, nhanHieu);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setBienSo", String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, bienSo);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setTrongTai", int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, trongTai);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoChoNgoi", int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, soChoNgoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiSanXuat() {
		return _noiSanXuat;
	}

	@Override
	public void setNoiSanXuat(String noiSanXuat) {
		_noiSanXuat = noiSanXuat;

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSanXuat", String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, noiSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamSanXuat() {
		return _namSanXuat;
	}

	@Override
	public void setNamSanXuat(int namSanXuat) {
		_namSanXuat = namSanXuat;

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSanXuat", int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, namSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTuyenCoDinh() {
		return _maTuyenCoDinh;
	}

	@Override
	public void setMaTuyenCoDinh(String maTuyenCoDinh) {
		_maTuyenCoDinh = maTuyenCoDinh;

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTuyenCoDinh", String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
					maTuyenCoDinh);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiTuyen", String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, loaiTuyen);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucSoHuuXe",
						String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLinhVucKinhDoanhXeDuLich",
						String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNienHanSuDungGiayDangKiem",
						int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setNienHanSuDungND86",
						int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setDoanhNghiepSoHuuThue",
						String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanThue", Date.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, thoiHanThue);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setHopDongSauCung", int.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, ketQuaXuLy);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setSoPhuHieuDuocCap",
						String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanDuocCapPhep",
						Date.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
					thoiHanDuocCapPhep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiPhuHieuXinCap() {
		return _loaiPhuHieuXinCap;
	}

	@Override
	public void setLoaiPhuHieuXinCap(String loaiPhuHieuXinCap) {
		_loaiPhuHieuXinCap = loaiPhuHieuXinCap;

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiPhuHieuXinCap",
						String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
					loaiPhuHieuXinCap);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
					lyDoKhongDat);
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

		if (_qlvtXuLyPhuHieuPhuongTienRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

				Method method = clazz.getMethod("setCoGiaTriDen", Date.class);

				method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel, coGiaTriDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQLVTXuLyPhuHieuPhuongTienRemoteModel() {
		return _qlvtXuLyPhuHieuPhuongTienRemoteModel;
	}

	public void setQLVTXuLyPhuHieuPhuongTienRemoteModel(
		BaseModel<?> qlvtXuLyPhuHieuPhuongTienRemoteModel) {
		_qlvtXuLyPhuHieuPhuongTienRemoteModel = qlvtXuLyPhuHieuPhuongTienRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyPhuHieuPhuongTienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyPhuHieuPhuongTienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.addQLVTXuLyPhuHieuPhuongTien(this);
		}
		else {
			QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.updateQLVTXuLyPhuHieuPhuongTien(this);
		}
	}

	@Override
	public QLVTXuLyPhuHieuPhuongTien toEscapedModel() {
		return (QLVTXuLyPhuHieuPhuongTien)ProxyUtil.newProxyInstance(QLVTXuLyPhuHieuPhuongTien.class.getClassLoader(),
			new Class[] { QLVTXuLyPhuHieuPhuongTien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QLVTXuLyPhuHieuPhuongTienClp clone = new QLVTXuLyPhuHieuPhuongTienClp();

		clone.setId(getId());
		clone.setCapPhuHieuID(getCapPhuHieuID());
		clone.setNhanHieu(getNhanHieu());
		clone.setBienSo(getBienSo());
		clone.setTrongTai(getTrongTai());
		clone.setSoChoNgoi(getSoChoNgoi());
		clone.setNoiSanXuat(getNoiSanXuat());
		clone.setNamSanXuat(getNamSanXuat());
		clone.setMaTuyenCoDinh(getMaTuyenCoDinh());
		clone.setLoaiTuyen(getLoaiTuyen());
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
		clone.setLoaiPhuHieuXinCap(getLoaiPhuHieuXinCap());
		clone.setLyDoKhongDat(getLyDoKhongDat());
		clone.setCoGiaTriDen(getCoGiaTriDen());

		return clone;
	}

	@Override
	public int compareTo(QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien) {
		int primaryKey = qlvtXuLyPhuHieuPhuongTien.getPrimaryKey();

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

		if (!(obj instanceof QLVTXuLyPhuHieuPhuongTienClp)) {
			return false;
		}

		QLVTXuLyPhuHieuPhuongTienClp qlvtXuLyPhuHieuPhuongTien = (QLVTXuLyPhuHieuPhuongTienClp)obj;

		int primaryKey = qlvtXuLyPhuHieuPhuongTien.getPrimaryKey();

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
		StringBundler sb = new StringBundler(47);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", capPhuHieuID=");
		sb.append(getCapPhuHieuID());
		sb.append(", nhanHieu=");
		sb.append(getNhanHieu());
		sb.append(", bienSo=");
		sb.append(getBienSo());
		sb.append(", trongTai=");
		sb.append(getTrongTai());
		sb.append(", soChoNgoi=");
		sb.append(getSoChoNgoi());
		sb.append(", noiSanXuat=");
		sb.append(getNoiSanXuat());
		sb.append(", namSanXuat=");
		sb.append(getNamSanXuat());
		sb.append(", maTuyenCoDinh=");
		sb.append(getMaTuyenCoDinh());
		sb.append(", loaiTuyen=");
		sb.append(getLoaiTuyen());
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
		sb.append(", loaiPhuHieuXinCap=");
		sb.append(getLoaiPhuHieuXinCap());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append(", coGiaTriDen=");
		sb.append(getCoGiaTriDen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capPhuHieuID</column-name><column-value><![CDATA[");
		sb.append(getCapPhuHieuID());
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
			"<column><column-name>trongTai</column-name><column-value><![CDATA[");
		sb.append(getTrongTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soChoNgoi</column-name><column-value><![CDATA[");
		sb.append(getSoChoNgoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNoiSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNamSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuyenCoDinh</column-name><column-value><![CDATA[");
		sb.append(getMaTuyenCoDinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiTuyen</column-name><column-value><![CDATA[");
		sb.append(getLoaiTuyen());
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
			"<column><column-name>loaiPhuHieuXinCap</column-name><column-value><![CDATA[");
		sb.append(getLoaiPhuHieuXinCap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coGiaTriDen</column-name><column-value><![CDATA[");
		sb.append(getCoGiaTriDen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _capPhuHieuID;
	private String _nhanHieu;
	private String _bienSo;
	private int _trongTai;
	private int _soChoNgoi;
	private String _noiSanXuat;
	private int _namSanXuat;
	private String _maTuyenCoDinh;
	private String _loaiTuyen;
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
	private String _loaiPhuHieuXinCap;
	private String _lyDoKhongDat;
	private Date _coGiaTriDen;
	private BaseModel<?> _qlvtXuLyPhuHieuPhuongTienRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.class;
}