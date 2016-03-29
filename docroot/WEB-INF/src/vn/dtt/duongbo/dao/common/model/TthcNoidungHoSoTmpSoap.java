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
public class TthcNoidungHoSoTmpSoap implements Serializable {
	public static TthcNoidungHoSoTmpSoap toSoapModel(TthcNoidungHoSoTmp model) {
		TthcNoidungHoSoTmpSoap soapModel = new TthcNoidungHoSoTmpSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTuSinh(model.getMaTuSinh());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setThanhPhanHoSoId(model.getThanhPhanHoSoId());
		soapModel.setTenTaiLieu(model.getTenTaiLieu());
		soapModel.setTaiLieuDinhKem(model.getTaiLieuDinhKem());
		soapModel.setNoiDungXml(model.getNoiDungXml());
		soapModel.setNoiDungHtml(model.getNoiDungHtml());
		soapModel.setBieuMauHoSoId(model.getBieuMauHoSoId());
		soapModel.setNgayGuiNhan(model.getNgayGuiNhan());
		soapModel.setLoaiTaiLieu(model.getLoaiTaiLieu());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setNguoiTao(model.getNguoiTao());
		soapModel.setTrangThai(model.getTrangThai());

		return soapModel;
	}

	public static TthcNoidungHoSoTmpSoap[] toSoapModels(
		TthcNoidungHoSoTmp[] models) {
		TthcNoidungHoSoTmpSoap[] soapModels = new TthcNoidungHoSoTmpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcNoidungHoSoTmpSoap[][] toSoapModels(
		TthcNoidungHoSoTmp[][] models) {
		TthcNoidungHoSoTmpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcNoidungHoSoTmpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcNoidungHoSoTmpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcNoidungHoSoTmpSoap[] toSoapModels(
		List<TthcNoidungHoSoTmp> models) {
		List<TthcNoidungHoSoTmpSoap> soapModels = new ArrayList<TthcNoidungHoSoTmpSoap>(models.size());

		for (TthcNoidungHoSoTmp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcNoidungHoSoTmpSoap[soapModels.size()]);
	}

	public TthcNoidungHoSoTmpSoap() {
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

	public String getMaTuSinh() {
		return _maTuSinh;
	}

	public void setMaTuSinh(String maTuSinh) {
		_maTuSinh = maTuSinh;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getThanhPhanHoSoId() {
		return _thanhPhanHoSoId;
	}

	public void setThanhPhanHoSoId(long thanhPhanHoSoId) {
		_thanhPhanHoSoId = thanhPhanHoSoId;
	}

	public String getTenTaiLieu() {
		return _tenTaiLieu;
	}

	public void setTenTaiLieu(String tenTaiLieu) {
		_tenTaiLieu = tenTaiLieu;
	}

	public long getTaiLieuDinhKem() {
		return _taiLieuDinhKem;
	}

	public void setTaiLieuDinhKem(long taiLieuDinhKem) {
		_taiLieuDinhKem = taiLieuDinhKem;
	}

	public String getNoiDungXml() {
		return _noiDungXml;
	}

	public void setNoiDungXml(String noiDungXml) {
		_noiDungXml = noiDungXml;
	}

	public String getNoiDungHtml() {
		return _noiDungHtml;
	}

	public void setNoiDungHtml(String noiDungHtml) {
		_noiDungHtml = noiDungHtml;
	}

	public long getBieuMauHoSoId() {
		return _bieuMauHoSoId;
	}

	public void setBieuMauHoSoId(long bieuMauHoSoId) {
		_bieuMauHoSoId = bieuMauHoSoId;
	}

	public Date getNgayGuiNhan() {
		return _ngayGuiNhan;
	}

	public void setNgayGuiNhan(Date ngayGuiNhan) {
		_ngayGuiNhan = ngayGuiNhan;
	}

	public long getLoaiTaiLieu() {
		return _loaiTaiLieu;
	}

	public void setLoaiTaiLieu(long loaiTaiLieu) {
		_loaiTaiLieu = loaiTaiLieu;
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

	public long getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(long trangThai) {
		_trangThai = trangThai;
	}

	private long _id;
	private String _maTuSinh;
	private long _hoSoThuTucId;
	private long _thanhPhanHoSoId;
	private String _tenTaiLieu;
	private long _taiLieuDinhKem;
	private String _noiDungXml;
	private String _noiDungHtml;
	private long _bieuMauHoSoId;
	private Date _ngayGuiNhan;
	private long _loaiTaiLieu;
	private Date _ngayTao;
	private long _nguoiTao;
	private long _trangThai;
}