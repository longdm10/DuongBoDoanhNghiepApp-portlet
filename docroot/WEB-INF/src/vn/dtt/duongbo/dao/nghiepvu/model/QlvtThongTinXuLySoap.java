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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtThongTinXuLyServiceSoap}.
 *
 * @author NhanNc
 * @see vn.dtt.duongbo.dao.nghiepvu.service.http.QlvtThongTinXuLyServiceSoap
 * @generated
 */
public class QlvtThongTinXuLySoap implements Serializable {
	public static QlvtThongTinXuLySoap toSoapModel(QlvtThongTinXuLy model) {
		QlvtThongTinXuLySoap soapModel = new QlvtThongTinXuLySoap();

		soapModel.setId(model.getId());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setThongTinHoSoId(model.getThongTinHoSoId());
		soapModel.setMaSoHoSo(model.getMaSoHoSo());
		soapModel.setCanBoXuLy(model.getCanBoXuLy());
		soapModel.setThoiGianXuLy(model.getThoiGianXuLy());
		soapModel.setYKienCanBoXuLy(model.getYKienCanBoXuLy());
		soapModel.setLanhDaoDuyet(model.getLanhDaoDuyet());
		soapModel.setYKienLanhDaoDuyet(model.getYKienLanhDaoDuyet());
		soapModel.setThoiGianDuyet(model.getThoiGianDuyet());
		soapModel.setKetQuaDuyet(model.getKetQuaDuyet());
		soapModel.setLanhDaoPheDuyet(model.getLanhDaoPheDuyet());
		soapModel.setThoiGianPheDuyet(model.getThoiGianPheDuyet());
		soapModel.setKetQuaPheDuyet(model.getKetQuaPheDuyet());
		soapModel.setYKienLanhDaoPheDuyet(model.getYKienLanhDaoPheDuyet());
		soapModel.setNguoiTraKetQua(model.getNguoiTraKetQua());
		soapModel.setThoiGianTraKetQua(model.getThoiGianTraKetQua());
		soapModel.setThoiGianCapPhep(model.getThoiGianCapPhep());
		soapModel.setKetQuaThamDinhXML(model.getKetQuaThamDinhXML());

		return soapModel;
	}

	public static QlvtThongTinXuLySoap[] toSoapModels(QlvtThongTinXuLy[] models) {
		QlvtThongTinXuLySoap[] soapModels = new QlvtThongTinXuLySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinXuLySoap[][] toSoapModels(
		QlvtThongTinXuLy[][] models) {
		QlvtThongTinXuLySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QlvtThongTinXuLySoap[models.length][models[0].length];
		}
		else {
			soapModels = new QlvtThongTinXuLySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QlvtThongTinXuLySoap[] toSoapModels(
		List<QlvtThongTinXuLy> models) {
		List<QlvtThongTinXuLySoap> soapModels = new ArrayList<QlvtThongTinXuLySoap>(models.size());

		for (QlvtThongTinXuLy model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QlvtThongTinXuLySoap[soapModels.size()]);
	}

	public QlvtThongTinXuLySoap() {
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

	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;
	}

	public long getThongTinHoSoId() {
		return _thongTinHoSoId;
	}

	public void setThongTinHoSoId(long thongTinHoSoId) {
		_thongTinHoSoId = thongTinHoSoId;
	}

	public String getMaSoHoSo() {
		return _maSoHoSo;
	}

	public void setMaSoHoSo(String maSoHoSo) {
		_maSoHoSo = maSoHoSo;
	}

	public int getCanBoXuLy() {
		return _canBoXuLy;
	}

	public void setCanBoXuLy(int canBoXuLy) {
		_canBoXuLy = canBoXuLy;
	}

	public Date getThoiGianXuLy() {
		return _thoiGianXuLy;
	}

	public void setThoiGianXuLy(Date thoiGianXuLy) {
		_thoiGianXuLy = thoiGianXuLy;
	}

	public String getYKienCanBoXuLy() {
		return _yKienCanBoXuLy;
	}

	public void setYKienCanBoXuLy(String yKienCanBoXuLy) {
		_yKienCanBoXuLy = yKienCanBoXuLy;
	}

	public int getLanhDaoDuyet() {
		return _lanhDaoDuyet;
	}

	public void setLanhDaoDuyet(int lanhDaoDuyet) {
		_lanhDaoDuyet = lanhDaoDuyet;
	}

	public String getYKienLanhDaoDuyet() {
		return _yKienLanhDaoDuyet;
	}

	public void setYKienLanhDaoDuyet(String yKienLanhDaoDuyet) {
		_yKienLanhDaoDuyet = yKienLanhDaoDuyet;
	}

	public Date getThoiGianDuyet() {
		return _thoiGianDuyet;
	}

	public void setThoiGianDuyet(Date thoiGianDuyet) {
		_thoiGianDuyet = thoiGianDuyet;
	}

	public int getKetQuaDuyet() {
		return _ketQuaDuyet;
	}

	public void setKetQuaDuyet(int ketQuaDuyet) {
		_ketQuaDuyet = ketQuaDuyet;
	}

	public int getLanhDaoPheDuyet() {
		return _lanhDaoPheDuyet;
	}

	public void setLanhDaoPheDuyet(int lanhDaoPheDuyet) {
		_lanhDaoPheDuyet = lanhDaoPheDuyet;
	}

	public Date getThoiGianPheDuyet() {
		return _thoiGianPheDuyet;
	}

	public void setThoiGianPheDuyet(Date thoiGianPheDuyet) {
		_thoiGianPheDuyet = thoiGianPheDuyet;
	}

	public int getKetQuaPheDuyet() {
		return _ketQuaPheDuyet;
	}

	public void setKetQuaPheDuyet(int ketQuaPheDuyet) {
		_ketQuaPheDuyet = ketQuaPheDuyet;
	}

	public String getYKienLanhDaoPheDuyet() {
		return _yKienLanhDaoPheDuyet;
	}

	public void setYKienLanhDaoPheDuyet(String yKienLanhDaoPheDuyet) {
		_yKienLanhDaoPheDuyet = yKienLanhDaoPheDuyet;
	}

	public int getNguoiTraKetQua() {
		return _nguoiTraKetQua;
	}

	public void setNguoiTraKetQua(int nguoiTraKetQua) {
		_nguoiTraKetQua = nguoiTraKetQua;
	}

	public Date getThoiGianTraKetQua() {
		return _thoiGianTraKetQua;
	}

	public void setThoiGianTraKetQua(Date thoiGianTraKetQua) {
		_thoiGianTraKetQua = thoiGianTraKetQua;
	}

	public Date getThoiGianCapPhep() {
		return _thoiGianCapPhep;
	}

	public void setThoiGianCapPhep(Date thoiGianCapPhep) {
		_thoiGianCapPhep = thoiGianCapPhep;
	}

	public String getKetQuaThamDinhXML() {
		return _ketQuaThamDinhXML;
	}

	public void setKetQuaThamDinhXML(String ketQuaThamDinhXML) {
		_ketQuaThamDinhXML = ketQuaThamDinhXML;
	}

	private long _id;
	private String _ketQuaXuLy;
	private long _thongTinHoSoId;
	private String _maSoHoSo;
	private int _canBoXuLy;
	private Date _thoiGianXuLy;
	private String _yKienCanBoXuLy;
	private int _lanhDaoDuyet;
	private String _yKienLanhDaoDuyet;
	private Date _thoiGianDuyet;
	private int _ketQuaDuyet;
	private int _lanhDaoPheDuyet;
	private Date _thoiGianPheDuyet;
	private int _ketQuaPheDuyet;
	private String _yKienLanhDaoPheDuyet;
	private int _nguoiTraKetQua;
	private Date _thoiGianTraKetQua;
	private Date _thoiGianCapPhep;
	private String _ketQuaThamDinhXML;
}