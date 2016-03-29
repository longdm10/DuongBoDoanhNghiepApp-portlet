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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author binhta
 * @generated
 */
public class QLVTCapPhepPhuHieuPhuongTienSoap implements Serializable {
	public static QLVTCapPhepPhuHieuPhuongTienSoap toSoapModel(
		QLVTCapPhepPhuHieuPhuongTien model) {
		QLVTCapPhepPhuHieuPhuongTienSoap soapModel = new QLVTCapPhepPhuHieuPhuongTienSoap();

		soapModel.setId(model.getId());
		soapModel.setQlvtCapPhepPhuHieuXeId(model.getQlvtCapPhepPhuHieuXeId());
		soapModel.setQlvtPhuongTienVanTaiId(model.getQlvtPhuongTienVanTaiId());
		soapModel.setTrangThai(model.getTrangThai());

		return soapModel;
	}

	public static QLVTCapPhepPhuHieuPhuongTienSoap[] toSoapModels(
		QLVTCapPhepPhuHieuPhuongTien[] models) {
		QLVTCapPhepPhuHieuPhuongTienSoap[] soapModels = new QLVTCapPhepPhuHieuPhuongTienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepPhuHieuPhuongTienSoap[][] toSoapModels(
		QLVTCapPhepPhuHieuPhuongTien[][] models) {
		QLVTCapPhepPhuHieuPhuongTienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QLVTCapPhepPhuHieuPhuongTienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QLVTCapPhepPhuHieuPhuongTienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepPhuHieuPhuongTienSoap[] toSoapModels(
		List<QLVTCapPhepPhuHieuPhuongTien> models) {
		List<QLVTCapPhepPhuHieuPhuongTienSoap> soapModels = new ArrayList<QLVTCapPhepPhuHieuPhuongTienSoap>(models.size());

		for (QLVTCapPhepPhuHieuPhuongTien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QLVTCapPhepPhuHieuPhuongTienSoap[soapModels.size()]);
	}

	public QLVTCapPhepPhuHieuPhuongTienSoap() {
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

	public int getQlvtCapPhepPhuHieuXeId() {
		return _qlvtCapPhepPhuHieuXeId;
	}

	public void setQlvtCapPhepPhuHieuXeId(int qlvtCapPhepPhuHieuXeId) {
		_qlvtCapPhepPhuHieuXeId = qlvtCapPhepPhuHieuXeId;
	}

	public int getQlvtPhuongTienVanTaiId() {
		return _qlvtPhuongTienVanTaiId;
	}

	public void setQlvtPhuongTienVanTaiId(int qlvtPhuongTienVanTaiId) {
		_qlvtPhuongTienVanTaiId = qlvtPhuongTienVanTaiId;
	}

	public String getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;
	}

	private int _id;
	private int _qlvtCapPhepPhuHieuXeId;
	private int _qlvtPhuongTienVanTaiId;
	private String _trangThai;
}