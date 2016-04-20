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
public class QLVTXuLyBienHieuSoap implements Serializable {
	public static QLVTXuLyBienHieuSoap toSoapModel(QLVTXuLyBienHieu model) {
		QLVTXuLyBienHieuSoap soapModel = new QLVTXuLyBienHieuSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinXuLyId(model.getThongTinXuLyId());
		soapModel.setLinhVucKinhDoanh(model.getLinhVucKinhDoanh());
		soapModel.setLyDoCapLai(model.getLyDoCapLai());
		soapModel.setGpkdLuuHanhQuocTe(model.getGpkdLuuHanhQuocTe());
		soapModel.setGpkdLuuHanhQuocTeCQCAP(model.getGpkdLuuHanhQuocTeCQCAP());
		soapModel.setGpkdLuuHanhQuocTeNgayCap(model.getGpkdLuuHanhQuocTeNgayCap());
		soapModel.setGpkdLuuHanhQuocTeNgayHetHan(model.getGpkdLuuHanhQuocTeNgayHetHan());
		soapModel.setSoLuongXe(model.getSoLuongXe());
		soapModel.setSoLuongBHPHNopLai(model.getSoLuongBHPHNopLai());
		soapModel.setLapCap(model.getLapCap());

		return soapModel;
	}

	public static QLVTXuLyBienHieuSoap[] toSoapModels(QLVTXuLyBienHieu[] models) {
		QLVTXuLyBienHieuSoap[] soapModels = new QLVTXuLyBienHieuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QLVTXuLyBienHieuSoap[][] toSoapModels(
		QLVTXuLyBienHieu[][] models) {
		QLVTXuLyBienHieuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QLVTXuLyBienHieuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QLVTXuLyBienHieuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QLVTXuLyBienHieuSoap[] toSoapModels(
		List<QLVTXuLyBienHieu> models) {
		List<QLVTXuLyBienHieuSoap> soapModels = new ArrayList<QLVTXuLyBienHieuSoap>(models.size());

		for (QLVTXuLyBienHieu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QLVTXuLyBienHieuSoap[soapModels.size()]);
	}

	public QLVTXuLyBienHieuSoap() {
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

	public int getThongTinXuLyId() {
		return _thongTinXuLyId;
	}

	public void setThongTinXuLyId(int thongTinXuLyId) {
		_thongTinXuLyId = thongTinXuLyId;
	}

	public String getLinhVucKinhDoanh() {
		return _LinhVucKinhDoanh;
	}

	public void setLinhVucKinhDoanh(String LinhVucKinhDoanh) {
		_LinhVucKinhDoanh = LinhVucKinhDoanh;
	}

	public String getLyDoCapLai() {
		return _lyDoCapLai;
	}

	public void setLyDoCapLai(String lyDoCapLai) {
		_lyDoCapLai = lyDoCapLai;
	}

	public String getGpkdLuuHanhQuocTe() {
		return _gpkdLuuHanhQuocTe;
	}

	public void setGpkdLuuHanhQuocTe(String gpkdLuuHanhQuocTe) {
		_gpkdLuuHanhQuocTe = gpkdLuuHanhQuocTe;
	}

	public String getGpkdLuuHanhQuocTeCQCAP() {
		return _gpkdLuuHanhQuocTeCQCAP;
	}

	public void setGpkdLuuHanhQuocTeCQCAP(String gpkdLuuHanhQuocTeCQCAP) {
		_gpkdLuuHanhQuocTeCQCAP = gpkdLuuHanhQuocTeCQCAP;
	}

	public Date getGpkdLuuHanhQuocTeNgayCap() {
		return _gpkdLuuHanhQuocTeNgayCap;
	}

	public void setGpkdLuuHanhQuocTeNgayCap(Date gpkdLuuHanhQuocTeNgayCap) {
		_gpkdLuuHanhQuocTeNgayCap = gpkdLuuHanhQuocTeNgayCap;
	}

	public Date getGpkdLuuHanhQuocTeNgayHetHan() {
		return _gpkdLuuHanhQuocTeNgayHetHan;
	}

	public void setGpkdLuuHanhQuocTeNgayHetHan(Date gpkdLuuHanhQuocTeNgayHetHan) {
		_gpkdLuuHanhQuocTeNgayHetHan = gpkdLuuHanhQuocTeNgayHetHan;
	}

	public String getSoLuongXe() {
		return _soLuongXe;
	}

	public void setSoLuongXe(String soLuongXe) {
		_soLuongXe = soLuongXe;
	}

	public int getSoLuongBHPHNopLai() {
		return _soLuongBHPHNopLai;
	}

	public void setSoLuongBHPHNopLai(int soLuongBHPHNopLai) {
		_soLuongBHPHNopLai = soLuongBHPHNopLai;
	}

	public int getLapCap() {
		return _lapCap;
	}

	public void setLapCap(int lapCap) {
		_lapCap = lapCap;
	}

	private int _id;
	private int _thongTinXuLyId;
	private String _LinhVucKinhDoanh;
	private String _lyDoCapLai;
	private String _gpkdLuuHanhQuocTe;
	private String _gpkdLuuHanhQuocTeCQCAP;
	private Date _gpkdLuuHanhQuocTeNgayCap;
	private Date _gpkdLuuHanhQuocTeNgayHetHan;
	private String _soLuongXe;
	private int _soLuongBHPHNopLai;
	private int _lapCap;
}