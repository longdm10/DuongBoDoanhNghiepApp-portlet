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
 * This class is a wrapper for {@link QlvtCapPhepGplvPhuongTienVanTai}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTienVanTai
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienVanTaiWrapper
	implements QlvtCapPhepGplvPhuongTienVanTai,
		ModelWrapper<QlvtCapPhepGplvPhuongTienVanTai> {
	public QlvtCapPhepGplvPhuongTienVanTaiWrapper(
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai) {
		_qlvtCapPhepGplvPhuongTienVanTai = qlvtCapPhepGplvPhuongTienVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGplvPhuongTienVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGplvPhuongTienVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("capphepGplienvanPhuongtienId",
			getCapphepGplienvanPhuongtienId());
		attributes.put("capphepPhuongtienvantaiId",
			getCapphepPhuongtienvantaiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long capphepGplienvanPhuongtienId = (Long)attributes.get(
				"capphepGplienvanPhuongtienId");

		if (capphepGplienvanPhuongtienId != null) {
			setCapphepGplienvanPhuongtienId(capphepGplienvanPhuongtienId);
		}

		Long capphepPhuongtienvantaiId = (Long)attributes.get(
				"capphepPhuongtienvantaiId");

		if (capphepPhuongtienvantaiId != null) {
			setCapphepPhuongtienvantaiId(capphepPhuongtienvantaiId);
		}
	}

	/**
	* Returns the primary key of this qlvt cap phep gplv phuong tien van tai.
	*
	* @return the primary key of this qlvt cap phep gplv phuong tien van tai
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt cap phep gplv phuong tien van tai.
	*
	* @param primaryKey the primary key of this qlvt cap phep gplv phuong tien van tai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtCapPhepGplvPhuongTienVanTai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt cap phep gplv phuong tien van tai.
	*
	* @return the ID of this qlvt cap phep gplv phuong tien van tai
	*/
	@Override
	public long getId() {
		return _qlvtCapPhepGplvPhuongTienVanTai.getId();
	}

	/**
	* Sets the ID of this qlvt cap phep gplv phuong tien van tai.
	*
	* @param id the ID of this qlvt cap phep gplv phuong tien van tai
	*/
	@Override
	public void setId(long id) {
		_qlvtCapPhepGplvPhuongTienVanTai.setId(id);
	}

	/**
	* Returns the capphep gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai.
	*
	* @return the capphep gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai
	*/
	@Override
	public long getCapphepGplienvanPhuongtienId() {
		return _qlvtCapPhepGplvPhuongTienVanTai.getCapphepGplienvanPhuongtienId();
	}

	/**
	* Sets the capphep gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai.
	*
	* @param capphepGplienvanPhuongtienId the capphep gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai
	*/
	@Override
	public void setCapphepGplienvanPhuongtienId(
		long capphepGplienvanPhuongtienId) {
		_qlvtCapPhepGplvPhuongTienVanTai.setCapphepGplienvanPhuongtienId(capphepGplienvanPhuongtienId);
	}

	/**
	* Returns the capphep phuongtienvantai ID of this qlvt cap phep gplv phuong tien van tai.
	*
	* @return the capphep phuongtienvantai ID of this qlvt cap phep gplv phuong tien van tai
	*/
	@Override
	public long getCapphepPhuongtienvantaiId() {
		return _qlvtCapPhepGplvPhuongTienVanTai.getCapphepPhuongtienvantaiId();
	}

	/**
	* Sets the capphep phuongtienvantai ID of this qlvt cap phep gplv phuong tien van tai.
	*
	* @param capphepPhuongtienvantaiId the capphep phuongtienvantai ID of this qlvt cap phep gplv phuong tien van tai
	*/
	@Override
	public void setCapphepPhuongtienvantaiId(long capphepPhuongtienvantaiId) {
		_qlvtCapPhepGplvPhuongTienVanTai.setCapphepPhuongtienvantaiId(capphepPhuongtienvantaiId);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepGplvPhuongTienVanTai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepGplvPhuongTienVanTai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepGplvPhuongTienVanTai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepGplvPhuongTienVanTai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepGplvPhuongTienVanTai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepGplvPhuongTienVanTai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepGplvPhuongTienVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepGplvPhuongTienVanTai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepGplvPhuongTienVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepGplvPhuongTienVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepGplvPhuongTienVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtCapPhepGplvPhuongTienVanTaiWrapper((QlvtCapPhepGplvPhuongTienVanTai)_qlvtCapPhepGplvPhuongTienVanTai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai) {
		return _qlvtCapPhepGplvPhuongTienVanTai.compareTo(qlvtCapPhepGplvPhuongTienVanTai);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepGplvPhuongTienVanTai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTai> toCacheModel() {
		return _qlvtCapPhepGplvPhuongTienVanTai.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTai toEscapedModel() {
		return new QlvtCapPhepGplvPhuongTienVanTaiWrapper(_qlvtCapPhepGplvPhuongTienVanTai.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTai toUnescapedModel() {
		return new QlvtCapPhepGplvPhuongTienVanTaiWrapper(_qlvtCapPhepGplvPhuongTienVanTai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepGplvPhuongTienVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepGplvPhuongTienVanTai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepGplvPhuongTienVanTai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtCapPhepGplvPhuongTienVanTaiWrapper)) {
			return false;
		}

		QlvtCapPhepGplvPhuongTienVanTaiWrapper qlvtCapPhepGplvPhuongTienVanTaiWrapper =
			(QlvtCapPhepGplvPhuongTienVanTaiWrapper)obj;

		if (Validator.equals(_qlvtCapPhepGplvPhuongTienVanTai,
					qlvtCapPhepGplvPhuongTienVanTaiWrapper._qlvtCapPhepGplvPhuongTienVanTai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtCapPhepGplvPhuongTienVanTai getWrappedQlvtCapPhepGplvPhuongTienVanTai() {
		return _qlvtCapPhepGplvPhuongTienVanTai;
	}

	@Override
	public QlvtCapPhepGplvPhuongTienVanTai getWrappedModel() {
		return _qlvtCapPhepGplvPhuongTienVanTai;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepGplvPhuongTienVanTai.resetOriginalValues();
	}

	private QlvtCapPhepGplvPhuongTienVanTai _qlvtCapPhepGplvPhuongTienVanTai;
}