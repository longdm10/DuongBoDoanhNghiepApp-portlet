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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author binhta
 * @generated
 */
public class QLVTXuLyPhuHieuSoap implements Serializable {
	public static QLVTXuLyPhuHieuSoap toSoapModel(QLVTXuLyPhuHieu model) {
		QLVTXuLyPhuHieuSoap soapModel = new QLVTXuLyPhuHieuSoap();

		soapModel.setId(model.getId());
		soapModel.setSoLuongBHPHNopLai(model.getSoLuongBHPHNopLai());
		soapModel.setSoLuongBienHieu(model.getSoLuongBienHieu());
		soapModel.setThongTinXuLyId(model.getThongTinXuLyId());
		soapModel.setLoaiPhuHieu(model.getLoaiPhuHieu());
		soapModel.setSoLuong(model.getSoLuong());
		soapModel.setSoLuongBH_PHNopLai(model.getSoLuongBH_PHNopLai());
		soapModel.setSovbChapNhanTuyen(model.getSovbChapNhanTuyen());
		soapModel.setNgayCapVBChapNhanTuyen(model.getNgayCapVBChapNhanTuyen());
		soapModel.setLanCap(model.getLanCap());

		return soapModel;
	}

	public static QLVTXuLyPhuHieuSoap[] toSoapModels(QLVTXuLyPhuHieu[] models) {
		QLVTXuLyPhuHieuSoap[] soapModels = new QLVTXuLyPhuHieuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QLVTXuLyPhuHieuSoap[][] toSoapModels(
		QLVTXuLyPhuHieu[][] models) {
		QLVTXuLyPhuHieuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QLVTXuLyPhuHieuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QLVTXuLyPhuHieuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QLVTXuLyPhuHieuSoap[] toSoapModels(
		List<QLVTXuLyPhuHieu> models) {
		List<QLVTXuLyPhuHieuSoap> soapModels = new ArrayList<QLVTXuLyPhuHieuSoap>(models.size());

		for (QLVTXuLyPhuHieu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QLVTXuLyPhuHieuSoap[soapModels.size()]);
	}

	public QLVTXuLyPhuHieuSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public int getSoLuongBHPHNopLai() {
		return _soLuongBHPHNopLai;
	}

	public void setSoLuongBHPHNopLai(int soLuongBHPHNopLai) {
		_soLuongBHPHNopLai = soLuongBHPHNopLai;
	}

	public int getSoLuongBienHieu() {
		return _soLuongBienHieu;
	}

	public void setSoLuongBienHieu(int soLuongBienHieu) {
		_soLuongBienHieu = soLuongBienHieu;
	}

	public int getThongTinXuLyId() {
		return _thongTinXuLyId;
	}

	public void setThongTinXuLyId(int thongTinXuLyId) {
		_thongTinXuLyId = thongTinXuLyId;
	}

	public String getLoaiPhuHieu() {
		return _loaiPhuHieu;
	}

	public void setLoaiPhuHieu(String loaiPhuHieu) {
		_loaiPhuHieu = loaiPhuHieu;
	}

	public int getSoLuong() {
		return _soLuong;
	}

	public void setSoLuong(int soLuong) {
		_soLuong = soLuong;
	}

	public int getSoLuongBH_PHNopLai() {
		return _soLuongBH_PHNopLai;
	}

	public void setSoLuongBH_PHNopLai(int soLuongBH_PHNopLai) {
		_soLuongBH_PHNopLai = soLuongBH_PHNopLai;
	}

	public String getSovbChapNhanTuyen() {
		return _sovbChapNhanTuyen;
	}

	public void setSovbChapNhanTuyen(String sovbChapNhanTuyen) {
		_sovbChapNhanTuyen = sovbChapNhanTuyen;
	}

	public Date getNgayCapVBChapNhanTuyen() {
		return _ngayCapVBChapNhanTuyen;
	}

	public void setNgayCapVBChapNhanTuyen(Date ngayCapVBChapNhanTuyen) {
		_ngayCapVBChapNhanTuyen = ngayCapVBChapNhanTuyen;
	}

	public int getLanCap() {
		return _lanCap;
	}

	public void setLanCap(int lanCap) {
		_lanCap = lanCap;
	}

	private int _id;
	private int _soLuongBHPHNopLai;
	private int _soLuongBienHieu;
	private int _thongTinXuLyId;
	private String _loaiPhuHieu;
	private int _soLuong;
	private int _soLuongBH_PHNopLai;
	private String _sovbChapNhanTuyen;
	private Date _ngayCapVBChapNhanTuyen;
	private int _lanCap;
}