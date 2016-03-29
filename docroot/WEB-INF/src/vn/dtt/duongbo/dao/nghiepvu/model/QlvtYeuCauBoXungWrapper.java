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
 * This class is a wrapper for {@link QlvtYeuCauBoXung}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtYeuCauBoXung
 * @generated
 */
public class QlvtYeuCauBoXungWrapper implements QlvtYeuCauBoXung,
	ModelWrapper<QlvtYeuCauBoXung> {
	public QlvtYeuCauBoXungWrapper(QlvtYeuCauBoXung qlvtYeuCauBoXung) {
		_qlvtYeuCauBoXung = qlvtYeuCauBoXung;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtYeuCauBoXung.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtYeuCauBoXung.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("noiDung", getNoiDung());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("soCongVan", getSoCongVan());
		attributes.put("ngayCongVan", getNgayCongVan());
		attributes.put("fileID", getFileID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String noiDung = (String)attributes.get("noiDung");

		if (noiDung != null) {
			setNoiDung(noiDung);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String soCongVan = (String)attributes.get("soCongVan");

		if (soCongVan != null) {
			setSoCongVan(soCongVan);
		}

		Date ngayCongVan = (Date)attributes.get("ngayCongVan");

		if (ngayCongVan != null) {
			setNgayCongVan(ngayCongVan);
		}

		Integer fileID = (Integer)attributes.get("fileID");

		if (fileID != null) {
			setFileID(fileID);
		}
	}

	/**
	* Returns the primary key of this qlvt yeu cau bo xung.
	*
	* @return the primary key of this qlvt yeu cau bo xung
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtYeuCauBoXung.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt yeu cau bo xung.
	*
	* @param primaryKey the primary key of this qlvt yeu cau bo xung
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtYeuCauBoXung.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt yeu cau bo xung.
	*
	* @return the ID of this qlvt yeu cau bo xung
	*/
	@Override
	public long getId() {
		return _qlvtYeuCauBoXung.getId();
	}

	/**
	* Sets the ID of this qlvt yeu cau bo xung.
	*
	* @param id the ID of this qlvt yeu cau bo xung
	*/
	@Override
	public void setId(long id) {
		_qlvtYeuCauBoXung.setId(id);
	}

	/**
	* Returns the noi dung of this qlvt yeu cau bo xung.
	*
	* @return the noi dung of this qlvt yeu cau bo xung
	*/
	@Override
	public java.lang.String getNoiDung() {
		return _qlvtYeuCauBoXung.getNoiDung();
	}

	/**
	* Sets the noi dung of this qlvt yeu cau bo xung.
	*
	* @param noiDung the noi dung of this qlvt yeu cau bo xung
	*/
	@Override
	public void setNoiDung(java.lang.String noiDung) {
		_qlvtYeuCauBoXung.setNoiDung(noiDung);
	}

	/**
	* Returns the thong tin xu ly ID of this qlvt yeu cau bo xung.
	*
	* @return the thong tin xu ly ID of this qlvt yeu cau bo xung
	*/
	@Override
	public int getThongTinXuLyId() {
		return _qlvtYeuCauBoXung.getThongTinXuLyId();
	}

	/**
	* Sets the thong tin xu ly ID of this qlvt yeu cau bo xung.
	*
	* @param thongTinXuLyId the thong tin xu ly ID of this qlvt yeu cau bo xung
	*/
	@Override
	public void setThongTinXuLyId(int thongTinXuLyId) {
		_qlvtYeuCauBoXung.setThongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the so cong van of this qlvt yeu cau bo xung.
	*
	* @return the so cong van of this qlvt yeu cau bo xung
	*/
	@Override
	public java.lang.String getSoCongVan() {
		return _qlvtYeuCauBoXung.getSoCongVan();
	}

	/**
	* Sets the so cong van of this qlvt yeu cau bo xung.
	*
	* @param soCongVan the so cong van of this qlvt yeu cau bo xung
	*/
	@Override
	public void setSoCongVan(java.lang.String soCongVan) {
		_qlvtYeuCauBoXung.setSoCongVan(soCongVan);
	}

	/**
	* Returns the ngay cong van of this qlvt yeu cau bo xung.
	*
	* @return the ngay cong van of this qlvt yeu cau bo xung
	*/
	@Override
	public java.util.Date getNgayCongVan() {
		return _qlvtYeuCauBoXung.getNgayCongVan();
	}

	/**
	* Sets the ngay cong van of this qlvt yeu cau bo xung.
	*
	* @param ngayCongVan the ngay cong van of this qlvt yeu cau bo xung
	*/
	@Override
	public void setNgayCongVan(java.util.Date ngayCongVan) {
		_qlvtYeuCauBoXung.setNgayCongVan(ngayCongVan);
	}

	/**
	* Returns the file i d of this qlvt yeu cau bo xung.
	*
	* @return the file i d of this qlvt yeu cau bo xung
	*/
	@Override
	public int getFileID() {
		return _qlvtYeuCauBoXung.getFileID();
	}

	/**
	* Sets the file i d of this qlvt yeu cau bo xung.
	*
	* @param fileID the file i d of this qlvt yeu cau bo xung
	*/
	@Override
	public void setFileID(int fileID) {
		_qlvtYeuCauBoXung.setFileID(fileID);
	}

	@Override
	public boolean isNew() {
		return _qlvtYeuCauBoXung.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtYeuCauBoXung.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtYeuCauBoXung.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtYeuCauBoXung.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtYeuCauBoXung.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtYeuCauBoXung.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtYeuCauBoXung.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtYeuCauBoXung.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtYeuCauBoXung.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtYeuCauBoXung.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtYeuCauBoXung.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtYeuCauBoXungWrapper((QlvtYeuCauBoXung)_qlvtYeuCauBoXung.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung qlvtYeuCauBoXung) {
		return _qlvtYeuCauBoXung.compareTo(qlvtYeuCauBoXung);
	}

	@Override
	public int hashCode() {
		return _qlvtYeuCauBoXung.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung> toCacheModel() {
		return _qlvtYeuCauBoXung.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung toEscapedModel() {
		return new QlvtYeuCauBoXungWrapper(_qlvtYeuCauBoXung.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung toUnescapedModel() {
		return new QlvtYeuCauBoXungWrapper(_qlvtYeuCauBoXung.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtYeuCauBoXung.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtYeuCauBoXung.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtYeuCauBoXung.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtYeuCauBoXungWrapper)) {
			return false;
		}

		QlvtYeuCauBoXungWrapper qlvtYeuCauBoXungWrapper = (QlvtYeuCauBoXungWrapper)obj;

		if (Validator.equals(_qlvtYeuCauBoXung,
					qlvtYeuCauBoXungWrapper._qlvtYeuCauBoXung)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtYeuCauBoXung getWrappedQlvtYeuCauBoXung() {
		return _qlvtYeuCauBoXung;
	}

	@Override
	public QlvtYeuCauBoXung getWrappedModel() {
		return _qlvtYeuCauBoXung;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtYeuCauBoXung.resetOriginalValues();
	}

	private QlvtYeuCauBoXung _qlvtYeuCauBoXung;
}