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
public class QLVTCapPhepPhuHieuTuyenSoap implements Serializable {
	public static QLVTCapPhepPhuHieuTuyenSoap toSoapModel(
		QLVTCapPhepPhuHieuTuyen model) {
		QLVTCapPhepPhuHieuTuyenSoap soapModel = new QLVTCapPhepPhuHieuTuyenSoap();

		soapModel.setId(model.getId());
		soapModel.setPtCapPhuHieuId(model.getPtCapPhuHieuId());
		soapModel.setMaTuyen(model.getMaTuyen());
		soapModel.setTenTuyen(model.getTenTuyen());

		return soapModel;
	}

	public static QLVTCapPhepPhuHieuTuyenSoap[] toSoapModels(
		QLVTCapPhepPhuHieuTuyen[] models) {
		QLVTCapPhepPhuHieuTuyenSoap[] soapModels = new QLVTCapPhepPhuHieuTuyenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepPhuHieuTuyenSoap[][] toSoapModels(
		QLVTCapPhepPhuHieuTuyen[][] models) {
		QLVTCapPhepPhuHieuTuyenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QLVTCapPhepPhuHieuTuyenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QLVTCapPhepPhuHieuTuyenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepPhuHieuTuyenSoap[] toSoapModels(
		List<QLVTCapPhepPhuHieuTuyen> models) {
		List<QLVTCapPhepPhuHieuTuyenSoap> soapModels = new ArrayList<QLVTCapPhepPhuHieuTuyenSoap>(models.size());

		for (QLVTCapPhepPhuHieuTuyen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QLVTCapPhepPhuHieuTuyenSoap[soapModels.size()]);
	}

	public QLVTCapPhepPhuHieuTuyenSoap() {
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

	public int getPtCapPhuHieuId() {
		return _ptCapPhuHieuId;
	}

	public void setPtCapPhuHieuId(int ptCapPhuHieuId) {
		_ptCapPhuHieuId = ptCapPhuHieuId;
	}

	public String getMaTuyen() {
		return _maTuyen;
	}

	public void setMaTuyen(String maTuyen) {
		_maTuyen = maTuyen;
	}

	public String getTenTuyen() {
		return _tenTuyen;
	}

	public void setTenTuyen(String tenTuyen) {
		_tenTuyen = tenTuyen;
	}

	private int _id;
	private int _ptCapPhuHieuId;
	private String _maTuyen;
	private String _tenTuyen;
}