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

package vn.dtt.duongbo.dao.common.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class TthcHoSoThuTucSoap implements Serializable {
	public static TthcHoSoThuTucSoap toSoapModel(TthcHoSoThuTuc model) {
		TthcHoSoThuTucSoap soapModel = new TthcHoSoThuTucSoap();

		soapModel.setId(model.getId());
		soapModel.setMaSoHoSo(model.getMaSoHoSo());
		soapModel.setMaBienNhan(model.getMaBienNhan());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setLoaiChuHoSo(model.getLoaiChuHoSo());
		soapModel.setMaSoChuHoSo(model.getMaSoChuHoSo());
		soapModel.setTenChuHoSo(model.getTenChuHoSo());
		soapModel.setDiaChiChuHoSo(model.getDiaChiChuHoSo());
		soapModel.setMaDonVi(model.getMaDonVi());
		soapModel.setNguonGocHoSo(model.getNguonGocHoSo());
		soapModel.setTrichYeuNoiDung(model.getTrichYeuNoiDung());
		soapModel.setNgayGuiHoSo(model.getNgayGuiHoSo());
		soapModel.setNgayTiepNhan(model.getNgayTiepNhan());
		soapModel.setNgayBoSung(model.getNgayBoSung());
		soapModel.setNgayHenTra(model.getNgayHenTra());
		soapModel.setNgayTraKetQua(model.getNgayTraKetQua());
		soapModel.setNgayDongHoSo(model.getNgayDongHoSo());
		soapModel.setTrangThaiHoSo(model.getTrangThaiHoSo());
		soapModel.setPhanNhomHoSoId(model.getPhanNhomHoSoId());
		soapModel.setMaTinhThanh(model.getMaTinhThanh());
		soapModel.setMaQuanHuyen(model.getMaQuanHuyen());
		soapModel.setMaPhuongXa(model.getMaPhuongXa());
		soapModel.setThongBaoXuLy(model.getThongBaoXuLy());
		soapModel.setToChucQuanLy(model.getToChucQuanLy());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setNguoiTao(model.getNguoiTao());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setNguoiLamThuTucId(model.getNguoiLamThuTucId());

		return soapModel;
	}

	public static TthcHoSoThuTucSoap[] toSoapModels(TthcHoSoThuTuc[] models) {
		TthcHoSoThuTucSoap[] soapModels = new TthcHoSoThuTucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcHoSoThuTucSoap[][] toSoapModels(TthcHoSoThuTuc[][] models) {
		TthcHoSoThuTucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcHoSoThuTucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcHoSoThuTucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcHoSoThuTucSoap[] toSoapModels(List<TthcHoSoThuTuc> models) {
		List<TthcHoSoThuTucSoap> soapModels = new ArrayList<TthcHoSoThuTucSoap>(models.size());

		for (TthcHoSoThuTuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcHoSoThuTucSoap[soapModels.size()]);
	}

	public TthcHoSoThuTucSoap() {
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

	public String getMaSoHoSo() {
		return _maSoHoSo;
	}

	public void setMaSoHoSo(String maSoHoSo) {
		_maSoHoSo = maSoHoSo;
	}

	public String getMaBienNhan() {
		return _maBienNhan;
	}

	public void setMaBienNhan(String maBienNhan) {
		_maBienNhan = maBienNhan;
	}

	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public long getLoaiChuHoSo() {
		return _loaiChuHoSo;
	}

	public void setLoaiChuHoSo(long loaiChuHoSo) {
		_loaiChuHoSo = loaiChuHoSo;
	}

	public String getMaSoChuHoSo() {
		return _maSoChuHoSo;
	}

	public void setMaSoChuHoSo(String maSoChuHoSo) {
		_maSoChuHoSo = maSoChuHoSo;
	}

	public String getTenChuHoSo() {
		return _tenChuHoSo;
	}

	public void setTenChuHoSo(String tenChuHoSo) {
		_tenChuHoSo = tenChuHoSo;
	}

	public String getDiaChiChuHoSo() {
		return _diaChiChuHoSo;
	}

	public void setDiaChiChuHoSo(String diaChiChuHoSo) {
		_diaChiChuHoSo = diaChiChuHoSo;
	}

	public String getMaDonVi() {
		return _maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		_maDonVi = maDonVi;
	}

	public String getNguonGocHoSo() {
		return _nguonGocHoSo;
	}

	public void setNguonGocHoSo(String nguonGocHoSo) {
		_nguonGocHoSo = nguonGocHoSo;
	}

	public String getTrichYeuNoiDung() {
		return _trichYeuNoiDung;
	}

	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;
	}

	public Date getNgayGuiHoSo() {
		return _ngayGuiHoSo;
	}

	public void setNgayGuiHoSo(Date ngayGuiHoSo) {
		_ngayGuiHoSo = ngayGuiHoSo;
	}

	public Date getNgayTiepNhan() {
		return _ngayTiepNhan;
	}

	public void setNgayTiepNhan(Date ngayTiepNhan) {
		_ngayTiepNhan = ngayTiepNhan;
	}

	public Date getNgayBoSung() {
		return _ngayBoSung;
	}

	public void setNgayBoSung(Date ngayBoSung) {
		_ngayBoSung = ngayBoSung;
	}

	public Date getNgayHenTra() {
		return _ngayHenTra;
	}

	public void setNgayHenTra(Date ngayHenTra) {
		_ngayHenTra = ngayHenTra;
	}

	public Date getNgayTraKetQua() {
		return _ngayTraKetQua;
	}

	public void setNgayTraKetQua(Date ngayTraKetQua) {
		_ngayTraKetQua = ngayTraKetQua;
	}

	public Date getNgayDongHoSo() {
		return _ngayDongHoSo;
	}

	public void setNgayDongHoSo(Date ngayDongHoSo) {
		_ngayDongHoSo = ngayDongHoSo;
	}

	public String getTrangThaiHoSo() {
		return _trangThaiHoSo;
	}

	public void setTrangThaiHoSo(String trangThaiHoSo) {
		_trangThaiHoSo = trangThaiHoSo;
	}

	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	public String getMaTinhThanh() {
		return _maTinhThanh;
	}

	public void setMaTinhThanh(String maTinhThanh) {
		_maTinhThanh = maTinhThanh;
	}

	public String getMaQuanHuyen() {
		return _maQuanHuyen;
	}

	public void setMaQuanHuyen(String maQuanHuyen) {
		_maQuanHuyen = maQuanHuyen;
	}

	public String getMaPhuongXa() {
		return _maPhuongXa;
	}

	public void setMaPhuongXa(String maPhuongXa) {
		_maPhuongXa = maPhuongXa;
	}

	public String getThongBaoXuLy() {
		return _thongBaoXuLy;
	}

	public void setThongBaoXuLy(String thongBaoXuLy) {
		_thongBaoXuLy = thongBaoXuLy;
	}

	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public long getNguoiTao() {
		return _nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
		_nguoiTao = nguoiTao;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public long getNguoiLamThuTucId() {
		return _nguoiLamThuTucId;
	}

	public void setNguoiLamThuTucId(long nguoiLamThuTucId) {
		_nguoiLamThuTucId = nguoiLamThuTucId;
	}

	private long _id;
	private String _maSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private long _loaiChuHoSo;
	private String _maSoChuHoSo;
	private String _tenChuHoSo;
	private String _diaChiChuHoSo;
	private String _maDonVi;
	private String _nguonGocHoSo;
	private String _trichYeuNoiDung;
	private Date _ngayGuiHoSo;
	private Date _ngayTiepNhan;
	private Date _ngayBoSung;
	private Date _ngayHenTra;
	private Date _ngayTraKetQua;
	private Date _ngayDongHoSo;
	private String _trangThaiHoSo;
	private long _phanNhomHoSoId;
	private String _maTinhThanh;
	private String _maQuanHuyen;
	private String _maPhuongXa;
	private String _thongBaoXuLy;
	private long _toChucQuanLy;
	private Date _ngayTao;
	private long _nguoiTao;
	private String _ghiChu;
	private long _nguoiLamThuTucId;
}