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

package vn.dtt.duongbo.dao.lienvan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtThongTinHoSoGiayPhepVanTai}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoGiayPhepVanTai
 * @generated
 */
public class QlvtThongTinHoSoGiayPhepVanTaiWrapper
	implements QlvtThongTinHoSoGiayPhepVanTai,
		ModelWrapper<QlvtThongTinHoSoGiayPhepVanTai> {
	public QlvtThongTinHoSoGiayPhepVanTaiWrapper(
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai) {
		_qlvtThongTinHoSoGiayPhepVanTai = qlvtThongTinHoSoGiayPhepVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSoGiayPhepVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSoGiayPhepVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongtinhosoId", getThongtinhosoId());
		attributes.put("capphepGpkdvtId", getCapphepGpkdvtId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thongtinhosoId = (Long)attributes.get("thongtinhosoId");

		if (thongtinhosoId != null) {
			setThongtinhosoId(thongtinhosoId);
		}

		Long capphepGpkdvtId = (Long)attributes.get("capphepGpkdvtId");

		if (capphepGpkdvtId != null) {
			setCapphepGpkdvtId(capphepGpkdvtId);
		}
	}

	/**
	* Returns the primary key of this qlvt thong tin ho so giay phep van tai.
	*
	* @return the primary key of this qlvt thong tin ho so giay phep van tai
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt thong tin ho so giay phep van tai.
	*
	* @param primaryKey the primary key of this qlvt thong tin ho so giay phep van tai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtThongTinHoSoGiayPhepVanTai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt thong tin ho so giay phep van tai.
	*
	* @return the ID of this qlvt thong tin ho so giay phep van tai
	*/
	@Override
	public long getId() {
		return _qlvtThongTinHoSoGiayPhepVanTai.getId();
	}

	/**
	* Sets the ID of this qlvt thong tin ho so giay phep van tai.
	*
	* @param id the ID of this qlvt thong tin ho so giay phep van tai
	*/
	@Override
	public void setId(long id) {
		_qlvtThongTinHoSoGiayPhepVanTai.setId(id);
	}

	/**
	* Returns the thongtinhoso ID of this qlvt thong tin ho so giay phep van tai.
	*
	* @return the thongtinhoso ID of this qlvt thong tin ho so giay phep van tai
	*/
	@Override
	public long getThongtinhosoId() {
		return _qlvtThongTinHoSoGiayPhepVanTai.getThongtinhosoId();
	}

	/**
	* Sets the thongtinhoso ID of this qlvt thong tin ho so giay phep van tai.
	*
	* @param thongtinhosoId the thongtinhoso ID of this qlvt thong tin ho so giay phep van tai
	*/
	@Override
	public void setThongtinhosoId(long thongtinhosoId) {
		_qlvtThongTinHoSoGiayPhepVanTai.setThongtinhosoId(thongtinhosoId);
	}

	/**
	* Returns the capphep gpkdvt ID of this qlvt thong tin ho so giay phep van tai.
	*
	* @return the capphep gpkdvt ID of this qlvt thong tin ho so giay phep van tai
	*/
	@Override
	public long getCapphepGpkdvtId() {
		return _qlvtThongTinHoSoGiayPhepVanTai.getCapphepGpkdvtId();
	}

	/**
	* Sets the capphep gpkdvt ID of this qlvt thong tin ho so giay phep van tai.
	*
	* @param capphepGpkdvtId the capphep gpkdvt ID of this qlvt thong tin ho so giay phep van tai
	*/
	@Override
	public void setCapphepGpkdvtId(long capphepGpkdvtId) {
		_qlvtThongTinHoSoGiayPhepVanTai.setCapphepGpkdvtId(capphepGpkdvtId);
	}

	@Override
	public boolean isNew() {
		return _qlvtThongTinHoSoGiayPhepVanTai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtThongTinHoSoGiayPhepVanTai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtThongTinHoSoGiayPhepVanTai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtThongTinHoSoGiayPhepVanTai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtThongTinHoSoGiayPhepVanTai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtThongTinHoSoGiayPhepVanTai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtThongTinHoSoGiayPhepVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtThongTinHoSoGiayPhepVanTai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtThongTinHoSoGiayPhepVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtThongTinHoSoGiayPhepVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtThongTinHoSoGiayPhepVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtThongTinHoSoGiayPhepVanTaiWrapper((QlvtThongTinHoSoGiayPhepVanTai)_qlvtThongTinHoSoGiayPhepVanTai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai) {
		return _qlvtThongTinHoSoGiayPhepVanTai.compareTo(qlvtThongTinHoSoGiayPhepVanTai);
	}

	@Override
	public int hashCode() {
		return _qlvtThongTinHoSoGiayPhepVanTai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai> toCacheModel() {
		return _qlvtThongTinHoSoGiayPhepVanTai.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai toEscapedModel() {
		return new QlvtThongTinHoSoGiayPhepVanTaiWrapper(_qlvtThongTinHoSoGiayPhepVanTai.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai toUnescapedModel() {
		return new QlvtThongTinHoSoGiayPhepVanTaiWrapper(_qlvtThongTinHoSoGiayPhepVanTai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtThongTinHoSoGiayPhepVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtThongTinHoSoGiayPhepVanTai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtThongTinHoSoGiayPhepVanTai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtThongTinHoSoGiayPhepVanTaiWrapper)) {
			return false;
		}

		QlvtThongTinHoSoGiayPhepVanTaiWrapper qlvtThongTinHoSoGiayPhepVanTaiWrapper =
			(QlvtThongTinHoSoGiayPhepVanTaiWrapper)obj;

		if (Validator.equals(_qlvtThongTinHoSoGiayPhepVanTai,
					qlvtThongTinHoSoGiayPhepVanTaiWrapper._qlvtThongTinHoSoGiayPhepVanTai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtThongTinHoSoGiayPhepVanTai getWrappedQlvtThongTinHoSoGiayPhepVanTai() {
		return _qlvtThongTinHoSoGiayPhepVanTai;
	}

	@Override
	public QlvtThongTinHoSoGiayPhepVanTai getWrappedModel() {
		return _qlvtThongTinHoSoGiayPhepVanTai;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtThongTinHoSoGiayPhepVanTai.resetOriginalValues();
	}

	private QlvtThongTinHoSoGiayPhepVanTai _qlvtThongTinHoSoGiayPhepVanTai;
}