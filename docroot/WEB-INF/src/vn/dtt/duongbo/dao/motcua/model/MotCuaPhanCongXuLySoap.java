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

package vn.dtt.duongbo.dao.motcua.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.MotCuaPhanCongXuLyServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.MotCuaPhanCongXuLyServiceSoap
 * @generated
 */
public class MotCuaPhanCongXuLySoap implements Serializable {
	public static MotCuaPhanCongXuLySoap toSoapModel(MotCuaPhanCongXuLy model) {
		MotCuaPhanCongXuLySoap soapModel = new MotCuaPhanCongXuLySoap();

		soapModel.setId(model.getId());
		soapModel.setPhieuXuLyId(model.getPhieuXuLyId());
		soapModel.setTrangThaiHoSoId(model.getTrangThaiHoSoId());
		soapModel.setNguoiXuLy(model.getNguoiXuLy());
		soapModel.setNhomXuLy(model.getNhomXuLy());
		soapModel.setNgayPhanCong(model.getNgayPhanCong());
		soapModel.setNguoiPhanCong(model.getNguoiPhanCong());
		soapModel.setNguoiDuocUyQuyen(model.getNguoiDuocUyQuyen());
		soapModel.setToChucXuLy(model.getToChucXuLy());
		soapModel.setToChucXetDuyet(model.getToChucXetDuyet());

		return soapModel;
	}

	public static MotCuaPhanCongXuLySoap[] toSoapModels(
		MotCuaPhanCongXuLy[] models) {
		MotCuaPhanCongXuLySoap[] soapModels = new MotCuaPhanCongXuLySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaPhanCongXuLySoap[][] toSoapModels(
		MotCuaPhanCongXuLy[][] models) {
		MotCuaPhanCongXuLySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaPhanCongXuLySoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaPhanCongXuLySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaPhanCongXuLySoap[] toSoapModels(
		List<MotCuaPhanCongXuLy> models) {
		List<MotCuaPhanCongXuLySoap> soapModels = new ArrayList<MotCuaPhanCongXuLySoap>(models.size());

		for (MotCuaPhanCongXuLy model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaPhanCongXuLySoap[soapModels.size()]);
	}

	public MotCuaPhanCongXuLySoap() {
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

	public long getPhieuXuLyId() {
		return _phieuXuLyId;
	}

	public void setPhieuXuLyId(long phieuXuLyId) {
		_phieuXuLyId = phieuXuLyId;
	}

	public long getTrangThaiHoSoId() {
		return _trangThaiHoSoId;
	}

	public void setTrangThaiHoSoId(long trangThaiHoSoId) {
		_trangThaiHoSoId = trangThaiHoSoId;
	}

	public long getNguoiXuLy() {
		return _nguoiXuLy;
	}

	public void setNguoiXuLy(long nguoiXuLy) {
		_nguoiXuLy = nguoiXuLy;
	}

	public long getNhomXuLy() {
		return _nhomXuLy;
	}

	public void setNhomXuLy(long nhomXuLy) {
		_nhomXuLy = nhomXuLy;
	}

	public Date getNgayPhanCong() {
		return _ngayPhanCong;
	}

	public void setNgayPhanCong(Date ngayPhanCong) {
		_ngayPhanCong = ngayPhanCong;
	}

	public long getNguoiPhanCong() {
		return _nguoiPhanCong;
	}

	public void setNguoiPhanCong(long nguoiPhanCong) {
		_nguoiPhanCong = nguoiPhanCong;
	}

	public long getNguoiDuocUyQuyen() {
		return _nguoiDuocUyQuyen;
	}

	public void setNguoiDuocUyQuyen(long nguoiDuocUyQuyen) {
		_nguoiDuocUyQuyen = nguoiDuocUyQuyen;
	}

	public long getToChucXuLy() {
		return _toChucXuLy;
	}

	public void setToChucXuLy(long toChucXuLy) {
		_toChucXuLy = toChucXuLy;
	}

	public long getToChucXetDuyet() {
		return _toChucXetDuyet;
	}

	public void setToChucXetDuyet(long toChucXetDuyet) {
		_toChucXetDuyet = toChucXetDuyet;
	}

	private long _id;
	private long _phieuXuLyId;
	private long _trangThaiHoSoId;
	private long _nguoiXuLy;
	private long _nhomXuLy;
	private Date _ngayPhanCong;
	private long _nguoiPhanCong;
	private long _nguoiDuocUyQuyen;
	private long _toChucXuLy;
	private long _toChucXetDuyet;
}