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

package vn.dtt.duongbo.dao.nghiepvu.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtThongTinHoSoServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtThongTinHoSoServiceSoap
 * @generated
 */
public class QlvtThongTinHoSoSoap implements Serializable {
	public static QlvtThongTinHoSoSoap toSoapModel(QlvtThongTinHoSo model) {
		QlvtThongTinHoSoSoap soapModel = new QlvtThongTinHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setSoCongVanDen(model.getSoCongVanDen());
		soapModel.setTenDn(model.getTenDn());
		soapModel.setDiaChiDn(model.getDiaChiDn());
		soapModel.setDienThoaiDn(model.getDienThoaiDn());
		soapModel.setSoFaxDn(model.getSoFaxDn());
		soapModel.setEmailDn(model.getEmailDn());
		soapModel.setWebSiteDn(model.getWebSiteDn());
		soapModel.setSoDkkd(model.getSoDkkd());
		soapModel.setNgayCapDkkd(model.getNgayCapDkkd());
		soapModel.setNgayHetHanDkkd(model.getNgayHetHanDkkd());
		soapModel.setCoQuanCapDkkd(model.getCoQuanCapDkkd());
		soapModel.setDaiDienDn(model.getDaiDienDn());
		soapModel.setCoQuanGiaiQuyet(model.getCoQuanGiaiQuyet());
		soapModel.setDiaDiemLamHoSo(model.getDiaDiemLamHoSo());
		soapModel.setPhieuXuLyId(model.getPhieuXuLyId());
		soapModel.setMaSoHoSo(model.getMaSoHoSo());
		soapModel.setLyDoCapLai(model.getLyDoCapLai());
		soapModel.setLanCapGiayDangKyKinhDoanh(model.getLanCapGiayDangKyKinhDoanh());
		soapModel.setSoGiayPhepKinhDoanhVanTaiNoiDia(model.getSoGiayPhepKinhDoanhVanTaiNoiDia());
		soapModel.setNgayCapGPKDVTNoiDia(model.getNgayCapGPKDVTNoiDia());
		soapModel.setNgayGiaHanGPKDVTNoiDia(model.getNgayGiaHanGPKDVTNoiDia());
		soapModel.setNgayHetHanGPKDVTNoiDia(model.getNgayHetHanGPKDVTNoiDia());
		soapModel.setLanCapGPKDVTNoiDia(model.getLanCapGPKDVTNoiDia());
		soapModel.setNgayGiaHanGiayDangKyKinhDoanh(model.getNgayGiaHanGiayDangKyKinhDoanh());
		soapModel.setSoGiayPhepKinhDoanhVanTaiQuocTe(model.getSoGiayPhepKinhDoanhVanTaiQuocTe());
		soapModel.setLanCapGPKDVTQuocTe(model.getLanCapGPKDVTQuocTe());
		soapModel.setNgayCapGPKDVTQuocTe(model.getNgayCapGPKDVTQuocTe());
		soapModel.setNgayGiaHanGPKDVTQuocTe(model.getNgayGiaHanGPKDVTQuocTe());
		soapModel.setNgayHetHanGPKDVTQuocTe(model.getNgayHetHanGPKDVTQuocTe());
		soapModel.setNguoiLienHeTraKetQua(model.getNguoiLienHeTraKetQua());
		soapModel.setSoDienThoaiNguoiLienHe(model.getSoDienThoaiNguoiLienHe());
		soapModel.setCoQuanCapGPKDVTNoiDia(model.getCoQuanCapGPKDVTNoiDia());
		soapModel.setNguoiNhanKetQua(model.getNguoiNhanKetQua());
		soapModel.setThongTinTraKetQua(model.getThongTinTraKetQua());
		soapModel.setNgayTraKetQua(model.getNgayTraKetQua());
		soapModel.setDiaChiNguoiLienHeTraKetQua(model.getDiaChiNguoiLienHeTraKetQua());

		return soapModel;
	}

	public static QlvtThongTinHoSoSoap[] toSoapModels(QlvtThongTinHoSo[] models) {
		QlvtThongTinHoSoSoap[] soapModels = new QlvtThongTinHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoSoap[][] toSoapModels(
		QlvtThongTinHoSo[][] models) {
		QlvtThongTinHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtThongTinHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtThongTinHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinHoSoSoap[] toSoapModels(
		List<QlvtThongTinHoSo> models) {
		List<QlvtThongTinHoSoSoap> soapModels = new ArrayList<QlvtThongTinHoSoSoap>(models.size());

		for (QlvtThongTinHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtThongTinHoSoSoap[soapModels.size()]);
	}

	public QlvtThongTinHoSoSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getSoCongVanDen() {
		return _soCongVanDen;
	}

	public void setSoCongVanDen(String soCongVanDen) {
		_soCongVanDen = soCongVanDen;
	}

	public String getTenDn() {
		return _tenDn;
	}

	public void setTenDn(String tenDn) {
		_tenDn = tenDn;
	}

	public String getDiaChiDn() {
		return _diaChiDn;
	}

	public void setDiaChiDn(String diaChiDn) {
		_diaChiDn = diaChiDn;
	}

	public String getDienThoaiDn() {
		return _dienThoaiDn;
	}

	public void setDienThoaiDn(String dienThoaiDn) {
		_dienThoaiDn = dienThoaiDn;
	}

	public String getSoFaxDn() {
		return _soFaxDn;
	}

	public void setSoFaxDn(String soFaxDn) {
		_soFaxDn = soFaxDn;
	}

	public String getEmailDn() {
		return _emailDn;
	}

	public void setEmailDn(String emailDn) {
		_emailDn = emailDn;
	}

	public String getWebSiteDn() {
		return _webSiteDn;
	}

	public void setWebSiteDn(String webSiteDn) {
		_webSiteDn = webSiteDn;
	}

	public String getSoDkkd() {
		return _soDkkd;
	}

	public void setSoDkkd(String soDkkd) {
		_soDkkd = soDkkd;
	}

	public Date getNgayCapDkkd() {
		return _ngayCapDkkd;
	}

	public void setNgayCapDkkd(Date ngayCapDkkd) {
		_ngayCapDkkd = ngayCapDkkd;
	}

	public Date getNgayHetHanDkkd() {
		return _ngayHetHanDkkd;
	}

	public void setNgayHetHanDkkd(Date ngayHetHanDkkd) {
		_ngayHetHanDkkd = ngayHetHanDkkd;
	}

	public String getCoQuanCapDkkd() {
		return _coQuanCapDkkd;
	}

	public void setCoQuanCapDkkd(String coQuanCapDkkd) {
		_coQuanCapDkkd = coQuanCapDkkd;
	}

	public String getDaiDienDn() {
		return _daiDienDn;
	}

	public void setDaiDienDn(String daiDienDn) {
		_daiDienDn = daiDienDn;
	}

	public long getCoQuanGiaiQuyet() {
		return _coQuanGiaiQuyet;
	}

	public void setCoQuanGiaiQuyet(long coQuanGiaiQuyet) {
		_coQuanGiaiQuyet = coQuanGiaiQuyet;
	}

	public String getDiaDiemLamHoSo() {
		return _diaDiemLamHoSo;
	}

	public void setDiaDiemLamHoSo(String diaDiemLamHoSo) {
		_diaDiemLamHoSo = diaDiemLamHoSo;
	}

	public long getPhieuXuLyId() {
		return _phieuXuLyId;
	}

	public void setPhieuXuLyId(long phieuXuLyId) {
		_phieuXuLyId = phieuXuLyId;
	}

	public String getMaSoHoSo() {
		return _maSoHoSo;
	}

	public void setMaSoHoSo(String maSoHoSo) {
		_maSoHoSo = maSoHoSo;
	}

	public String getLyDoCapLai() {
		return _lyDoCapLai;
	}

	public void setLyDoCapLai(String lyDoCapLai) {
		_lyDoCapLai = lyDoCapLai;
	}

	public int getLanCapGiayDangKyKinhDoanh() {
		return _lanCapGiayDangKyKinhDoanh;
	}

	public void setLanCapGiayDangKyKinhDoanh(int lanCapGiayDangKyKinhDoanh) {
		_lanCapGiayDangKyKinhDoanh = lanCapGiayDangKyKinhDoanh;
	}

	public String getSoGiayPhepKinhDoanhVanTaiNoiDia() {
		return _soGiayPhepKinhDoanhVanTaiNoiDia;
	}

	public void setSoGiayPhepKinhDoanhVanTaiNoiDia(
		String soGiayPhepKinhDoanhVanTaiNoiDia) {
		_soGiayPhepKinhDoanhVanTaiNoiDia = soGiayPhepKinhDoanhVanTaiNoiDia;
	}

	public Date getNgayCapGPKDVTNoiDia() {
		return _ngayCapGPKDVTNoiDia;
	}

	public void setNgayCapGPKDVTNoiDia(Date ngayCapGPKDVTNoiDia) {
		_ngayCapGPKDVTNoiDia = ngayCapGPKDVTNoiDia;
	}

	public Date getNgayGiaHanGPKDVTNoiDia() {
		return _NgayGiaHanGPKDVTNoiDia;
	}

	public void setNgayGiaHanGPKDVTNoiDia(Date NgayGiaHanGPKDVTNoiDia) {
		_NgayGiaHanGPKDVTNoiDia = NgayGiaHanGPKDVTNoiDia;
	}

	public Date getNgayHetHanGPKDVTNoiDia() {
		return _NgayHetHanGPKDVTNoiDia;
	}

	public void setNgayHetHanGPKDVTNoiDia(Date NgayHetHanGPKDVTNoiDia) {
		_NgayHetHanGPKDVTNoiDia = NgayHetHanGPKDVTNoiDia;
	}

	public int getLanCapGPKDVTNoiDia() {
		return _lanCapGPKDVTNoiDia;
	}

	public void setLanCapGPKDVTNoiDia(int lanCapGPKDVTNoiDia) {
		_lanCapGPKDVTNoiDia = lanCapGPKDVTNoiDia;
	}

	public Date getNgayGiaHanGiayDangKyKinhDoanh() {
		return _ngayGiaHanGiayDangKyKinhDoanh;
	}

	public void setNgayGiaHanGiayDangKyKinhDoanh(
		Date ngayGiaHanGiayDangKyKinhDoanh) {
		_ngayGiaHanGiayDangKyKinhDoanh = ngayGiaHanGiayDangKyKinhDoanh;
	}

	public String getSoGiayPhepKinhDoanhVanTaiQuocTe() {
		return _soGiayPhepKinhDoanhVanTaiQuocTe;
	}

	public void setSoGiayPhepKinhDoanhVanTaiQuocTe(
		String soGiayPhepKinhDoanhVanTaiQuocTe) {
		_soGiayPhepKinhDoanhVanTaiQuocTe = soGiayPhepKinhDoanhVanTaiQuocTe;
	}

	public int getLanCapGPKDVTQuocTe() {
		return _lanCapGPKDVTQuocTe;
	}

	public void setLanCapGPKDVTQuocTe(int lanCapGPKDVTQuocTe) {
		_lanCapGPKDVTQuocTe = lanCapGPKDVTQuocTe;
	}

	public Date getNgayCapGPKDVTQuocTe() {
		return _ngayCapGPKDVTQuocTe;
	}

	public void setNgayCapGPKDVTQuocTe(Date ngayCapGPKDVTQuocTe) {
		_ngayCapGPKDVTQuocTe = ngayCapGPKDVTQuocTe;
	}

	public Date getNgayGiaHanGPKDVTQuocTe() {
		return _ngayGiaHanGPKDVTQuocTe;
	}

	public void setNgayGiaHanGPKDVTQuocTe(Date ngayGiaHanGPKDVTQuocTe) {
		_ngayGiaHanGPKDVTQuocTe = ngayGiaHanGPKDVTQuocTe;
	}

	public Date getNgayHetHanGPKDVTQuocTe() {
		return _ngayHetHanGPKDVTQuocTe;
	}

	public void setNgayHetHanGPKDVTQuocTe(Date ngayHetHanGPKDVTQuocTe) {
		_ngayHetHanGPKDVTQuocTe = ngayHetHanGPKDVTQuocTe;
	}

	public String getNguoiLienHeTraKetQua() {
		return _nguoiLienHeTraKetQua;
	}

	public void setNguoiLienHeTraKetQua(String nguoiLienHeTraKetQua) {
		_nguoiLienHeTraKetQua = nguoiLienHeTraKetQua;
	}

	public String getSoDienThoaiNguoiLienHe() {
		return _soDienThoaiNguoiLienHe;
	}

	public void setSoDienThoaiNguoiLienHe(String soDienThoaiNguoiLienHe) {
		_soDienThoaiNguoiLienHe = soDienThoaiNguoiLienHe;
	}

	public String getCoQuanCapGPKDVTNoiDia() {
		return _coQuanCapGPKDVTNoiDia;
	}

	public void setCoQuanCapGPKDVTNoiDia(String coQuanCapGPKDVTNoiDia) {
		_coQuanCapGPKDVTNoiDia = coQuanCapGPKDVTNoiDia;
	}

	public String getNguoiNhanKetQua() {
		return _nguoiNhanKetQua;
	}

	public void setNguoiNhanKetQua(String nguoiNhanKetQua) {
		_nguoiNhanKetQua = nguoiNhanKetQua;
	}

	public String getThongTinTraKetQua() {
		return _thongTinTraKetQua;
	}

	public void setThongTinTraKetQua(String thongTinTraKetQua) {
		_thongTinTraKetQua = thongTinTraKetQua;
	}

	public Date getNgayTraKetQua() {
		return _ngayTraKetQua;
	}

	public void setNgayTraKetQua(Date ngayTraKetQua) {
		_ngayTraKetQua = ngayTraKetQua;
	}

	public String getDiaChiNguoiLienHeTraKetQua() {
		return _diaChiNguoiLienHeTraKetQua;
	}

	public void setDiaChiNguoiLienHeTraKetQua(String diaChiNguoiLienHeTraKetQua) {
		_diaChiNguoiLienHeTraKetQua = diaChiNguoiLienHeTraKetQua;
	}

	private long _id;
	private String _soCongVanDen;
	private String _tenDn;
	private String _diaChiDn;
	private String _dienThoaiDn;
	private String _soFaxDn;
	private String _emailDn;
	private String _webSiteDn;
	private String _soDkkd;
	private Date _ngayCapDkkd;
	private Date _ngayHetHanDkkd;
	private String _coQuanCapDkkd;
	private String _daiDienDn;
	private long _coQuanGiaiQuyet;
	private String _diaDiemLamHoSo;
	private long _phieuXuLyId;
	private String _maSoHoSo;
	private String _lyDoCapLai;
	private int _lanCapGiayDangKyKinhDoanh;
	private String _soGiayPhepKinhDoanhVanTaiNoiDia;
	private Date _ngayCapGPKDVTNoiDia;
	private Date _NgayGiaHanGPKDVTNoiDia;
	private Date _NgayHetHanGPKDVTNoiDia;
	private int _lanCapGPKDVTNoiDia;
	private Date _ngayGiaHanGiayDangKyKinhDoanh;
	private String _soGiayPhepKinhDoanhVanTaiQuocTe;
	private int _lanCapGPKDVTQuocTe;
	private Date _ngayCapGPKDVTQuocTe;
	private Date _ngayGiaHanGPKDVTQuocTe;
	private Date _ngayHetHanGPKDVTQuocTe;
	private String _nguoiLienHeTraKetQua;
	private String _soDienThoaiNguoiLienHe;
	private String _coQuanCapGPKDVTNoiDia;
	private String _nguoiNhanKetQua;
	private String _thongTinTraKetQua;
	private Date _ngayTraKetQua;
	private String _diaChiNguoiLienHeTraKetQua;
}