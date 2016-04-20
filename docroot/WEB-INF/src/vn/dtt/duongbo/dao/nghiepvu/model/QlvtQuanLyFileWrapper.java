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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtQuanLyFile}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtQuanLyFile
 * @generated
 */
public class QlvtQuanLyFileWrapper implements QlvtQuanLyFile,
	ModelWrapper<QlvtQuanLyFile> {
	public QlvtQuanLyFileWrapper(QlvtQuanLyFile qlvtQuanLyFile) {
		_qlvtQuanLyFile = qlvtQuanLyFile;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtQuanLyFile.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtQuanLyFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tenFile", getTenFile());
		attributes.put("loaiFile", getLoaiFile());
		attributes.put("thongTinFile", getThongTinFile());
		attributes.put("ngayTai", getNgayTai());
		attributes.put("ngayCap", getNgayCap());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("idFile", getIdFile());
		attributes.put("trangThai", getTrangThai());
		attributes.put("doanhNghiepId", getDoanhNghiepId());
		attributes.put("taiKhoan", getTaiKhoan());
		attributes.put("mieuTa", getMieuTa());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tenFile = (String)attributes.get("tenFile");

		if (tenFile != null) {
			setTenFile(tenFile);
		}

		Long loaiFile = (Long)attributes.get("loaiFile");

		if (loaiFile != null) {
			setLoaiFile(loaiFile);
		}

		String thongTinFile = (String)attributes.get("thongTinFile");

		if (thongTinFile != null) {
			setThongTinFile(thongTinFile);
		}

		Date ngayTai = (Date)attributes.get("ngayTai");

		if (ngayTai != null) {
			setNgayTai(ngayTai);
		}

		Date ngayCap = (Date)attributes.get("ngayCap");

		if (ngayCap != null) {
			setNgayCap(ngayCap);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		Long idFile = (Long)attributes.get("idFile");

		if (idFile != null) {
			setIdFile(idFile);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long doanhNghiepId = (Long)attributes.get("doanhNghiepId");

		if (doanhNghiepId != null) {
			setDoanhNghiepId(doanhNghiepId);
		}

		Long taiKhoan = (Long)attributes.get("taiKhoan");

		if (taiKhoan != null) {
			setTaiKhoan(taiKhoan);
		}

		String mieuTa = (String)attributes.get("mieuTa");

		if (mieuTa != null) {
			setMieuTa(mieuTa);
		}
	}

	/**
	* Returns the primary key of this qlvt quan ly file.
	*
	* @return the primary key of this qlvt quan ly file
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtQuanLyFile.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt quan ly file.
	*
	* @param primaryKey the primary key of this qlvt quan ly file
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtQuanLyFile.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt quan ly file.
	*
	* @return the ID of this qlvt quan ly file
	*/
	@Override
	public long getId() {
		return _qlvtQuanLyFile.getId();
	}

	/**
	* Sets the ID of this qlvt quan ly file.
	*
	* @param id the ID of this qlvt quan ly file
	*/
	@Override
	public void setId(long id) {
		_qlvtQuanLyFile.setId(id);
	}

	/**
	* Returns the ten file of this qlvt quan ly file.
	*
	* @return the ten file of this qlvt quan ly file
	*/
	@Override
	public java.lang.String getTenFile() {
		return _qlvtQuanLyFile.getTenFile();
	}

	/**
	* Sets the ten file of this qlvt quan ly file.
	*
	* @param tenFile the ten file of this qlvt quan ly file
	*/
	@Override
	public void setTenFile(java.lang.String tenFile) {
		_qlvtQuanLyFile.setTenFile(tenFile);
	}

	/**
	* Returns the loai file of this qlvt quan ly file.
	*
	* @return the loai file of this qlvt quan ly file
	*/
	@Override
	public long getLoaiFile() {
		return _qlvtQuanLyFile.getLoaiFile();
	}

	/**
	* Sets the loai file of this qlvt quan ly file.
	*
	* @param loaiFile the loai file of this qlvt quan ly file
	*/
	@Override
	public void setLoaiFile(long loaiFile) {
		_qlvtQuanLyFile.setLoaiFile(loaiFile);
	}

	/**
	* Returns the thong tin file of this qlvt quan ly file.
	*
	* @return the thong tin file of this qlvt quan ly file
	*/
	@Override
	public java.lang.String getThongTinFile() {
		return _qlvtQuanLyFile.getThongTinFile();
	}

	/**
	* Sets the thong tin file of this qlvt quan ly file.
	*
	* @param thongTinFile the thong tin file of this qlvt quan ly file
	*/
	@Override
	public void setThongTinFile(java.lang.String thongTinFile) {
		_qlvtQuanLyFile.setThongTinFile(thongTinFile);
	}

	/**
	* Returns the ngay tai of this qlvt quan ly file.
	*
	* @return the ngay tai of this qlvt quan ly file
	*/
	@Override
	public java.util.Date getNgayTai() {
		return _qlvtQuanLyFile.getNgayTai();
	}

	/**
	* Sets the ngay tai of this qlvt quan ly file.
	*
	* @param ngayTai the ngay tai of this qlvt quan ly file
	*/
	@Override
	public void setNgayTai(java.util.Date ngayTai) {
		_qlvtQuanLyFile.setNgayTai(ngayTai);
	}

	/**
	* Returns the ngay cap of this qlvt quan ly file.
	*
	* @return the ngay cap of this qlvt quan ly file
	*/
	@Override
	public java.util.Date getNgayCap() {
		return _qlvtQuanLyFile.getNgayCap();
	}

	/**
	* Sets the ngay cap of this qlvt quan ly file.
	*
	* @param ngayCap the ngay cap of this qlvt quan ly file
	*/
	@Override
	public void setNgayCap(java.util.Date ngayCap) {
		_qlvtQuanLyFile.setNgayCap(ngayCap);
	}

	/**
	* Returns the ngay het han of this qlvt quan ly file.
	*
	* @return the ngay het han of this qlvt quan ly file
	*/
	@Override
	public java.util.Date getNgayHetHan() {
		return _qlvtQuanLyFile.getNgayHetHan();
	}

	/**
	* Sets the ngay het han of this qlvt quan ly file.
	*
	* @param ngayHetHan the ngay het han of this qlvt quan ly file
	*/
	@Override
	public void setNgayHetHan(java.util.Date ngayHetHan) {
		_qlvtQuanLyFile.setNgayHetHan(ngayHetHan);
	}

	/**
	* Returns the id file of this qlvt quan ly file.
	*
	* @return the id file of this qlvt quan ly file
	*/
	@Override
	public long getIdFile() {
		return _qlvtQuanLyFile.getIdFile();
	}

	/**
	* Sets the id file of this qlvt quan ly file.
	*
	* @param idFile the id file of this qlvt quan ly file
	*/
	@Override
	public void setIdFile(long idFile) {
		_qlvtQuanLyFile.setIdFile(idFile);
	}

	/**
	* Returns the trang thai of this qlvt quan ly file.
	*
	* @return the trang thai of this qlvt quan ly file
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _qlvtQuanLyFile.getTrangThai();
	}

	/**
	* Sets the trang thai of this qlvt quan ly file.
	*
	* @param trangThai the trang thai of this qlvt quan ly file
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_qlvtQuanLyFile.setTrangThai(trangThai);
	}

	/**
	* Returns the doanh nghiep ID of this qlvt quan ly file.
	*
	* @return the doanh nghiep ID of this qlvt quan ly file
	*/
	@Override
	public long getDoanhNghiepId() {
		return _qlvtQuanLyFile.getDoanhNghiepId();
	}

	/**
	* Sets the doanh nghiep ID of this qlvt quan ly file.
	*
	* @param doanhNghiepId the doanh nghiep ID of this qlvt quan ly file
	*/
	@Override
	public void setDoanhNghiepId(long doanhNghiepId) {
		_qlvtQuanLyFile.setDoanhNghiepId(doanhNghiepId);
	}

	/**
	* Returns the tai khoan of this qlvt quan ly file.
	*
	* @return the tai khoan of this qlvt quan ly file
	*/
	@Override
	public long getTaiKhoan() {
		return _qlvtQuanLyFile.getTaiKhoan();
	}

	/**
	* Sets the tai khoan of this qlvt quan ly file.
	*
	* @param taiKhoan the tai khoan of this qlvt quan ly file
	*/
	@Override
	public void setTaiKhoan(long taiKhoan) {
		_qlvtQuanLyFile.setTaiKhoan(taiKhoan);
	}

	/**
	* Returns the mieu ta of this qlvt quan ly file.
	*
	* @return the mieu ta of this qlvt quan ly file
	*/
	@Override
	public java.lang.String getMieuTa() {
		return _qlvtQuanLyFile.getMieuTa();
	}

	/**
	* Sets the mieu ta of this qlvt quan ly file.
	*
	* @param mieuTa the mieu ta of this qlvt quan ly file
	*/
	@Override
	public void setMieuTa(java.lang.String mieuTa) {
		_qlvtQuanLyFile.setMieuTa(mieuTa);
	}

	@Override
	public boolean isNew() {
		return _qlvtQuanLyFile.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtQuanLyFile.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtQuanLyFile.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtQuanLyFile.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtQuanLyFile.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtQuanLyFile.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtQuanLyFile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtQuanLyFile.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtQuanLyFile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtQuanLyFile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtQuanLyFile.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtQuanLyFileWrapper((QlvtQuanLyFile)_qlvtQuanLyFile.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile) {
		return _qlvtQuanLyFile.compareTo(qlvtQuanLyFile);
	}

	@Override
	public int hashCode() {
		return _qlvtQuanLyFile.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> toCacheModel() {
		return _qlvtQuanLyFile.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile toEscapedModel() {
		return new QlvtQuanLyFileWrapper(_qlvtQuanLyFile.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile toUnescapedModel() {
		return new QlvtQuanLyFileWrapper(_qlvtQuanLyFile.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtQuanLyFile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtQuanLyFile.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtQuanLyFile.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtQuanLyFileWrapper)) {
			return false;
		}

		QlvtQuanLyFileWrapper qlvtQuanLyFileWrapper = (QlvtQuanLyFileWrapper)obj;

		if (Validator.equals(_qlvtQuanLyFile,
					qlvtQuanLyFileWrapper._qlvtQuanLyFile)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtQuanLyFile getWrappedQlvtQuanLyFile() {
		return _qlvtQuanLyFile;
	}

	@Override
	public QlvtQuanLyFile getWrappedModel() {
		return _qlvtQuanLyFile;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtQuanLyFile.resetOriginalValues();
	}

	private QlvtQuanLyFile _qlvtQuanLyFile;
}