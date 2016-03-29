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
 * This class is a wrapper for {@link QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper
	implements QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi,
		ModelWrapper<QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> {
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper(
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi = qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("capGplienvanPhuongtienId", getCapGplienvanPhuongtienId());
		attributes.put("maTramDungNghi", getMaTramDungNghi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long capGplienvanPhuongtienId = (Long)attributes.get(
				"capGplienvanPhuongtienId");

		if (capGplienvanPhuongtienId != null) {
			setCapGplienvanPhuongtienId(capGplienvanPhuongtienId);
		}

		String maTramDungNghi = (String)attributes.get("maTramDungNghi");

		if (maTramDungNghi != null) {
			setMaTramDungNghi(maTramDungNghi);
		}
	}

	/**
	* Returns the primary key of this qlvt cap phep gplv phuong tien van tai tramdungnghi.
	*
	* @return the primary key of this qlvt cap phep gplv phuong tien van tai tramdungnghi
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt cap phep gplv phuong tien van tai tramdungnghi.
	*
	* @param primaryKey the primary key of this qlvt cap phep gplv phuong tien van tai tramdungnghi
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt cap phep gplv phuong tien van tai tramdungnghi.
	*
	* @return the ID of this qlvt cap phep gplv phuong tien van tai tramdungnghi
	*/
	@Override
	public long getId() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getId();
	}

	/**
	* Sets the ID of this qlvt cap phep gplv phuong tien van tai tramdungnghi.
	*
	* @param id the ID of this qlvt cap phep gplv phuong tien van tai tramdungnghi
	*/
	@Override
	public void setId(long id) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setId(id);
	}

	/**
	* Returns the cap gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai tramdungnghi.
	*
	* @return the cap gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai tramdungnghi
	*/
	@Override
	public long getCapGplienvanPhuongtienId() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getCapGplienvanPhuongtienId();
	}

	/**
	* Sets the cap gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai tramdungnghi.
	*
	* @param capGplienvanPhuongtienId the cap gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai tramdungnghi
	*/
	@Override
	public void setCapGplienvanPhuongtienId(long capGplienvanPhuongtienId) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setCapGplienvanPhuongtienId(capGplienvanPhuongtienId);
	}

	/**
	* Returns the ma tram dung nghi of this qlvt cap phep gplv phuong tien van tai tramdungnghi.
	*
	* @return the ma tram dung nghi of this qlvt cap phep gplv phuong tien van tai tramdungnghi
	*/
	@Override
	public java.lang.String getMaTramDungNghi() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getMaTramDungNghi();
	}

	/**
	* Sets the ma tram dung nghi of this qlvt cap phep gplv phuong tien van tai tramdungnghi.
	*
	* @param maTramDungNghi the ma tram dung nghi of this qlvt cap phep gplv phuong tien van tai tramdungnghi
	*/
	@Override
	public void setMaTramDungNghi(java.lang.String maTramDungNghi) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setMaTramDungNghi(maTramDungNghi);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper((QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi) {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.compareTo(qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi> toCacheModel() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi toEscapedModel() {
		return new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper(_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi toUnescapedModel() {
		return new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper(_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper)) {
			return false;
		}

		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper =
			(QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper)obj;

		if (Validator.equals(_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi,
					qlvtCapPhepGplvPhuongTienVanTaiTramdungnghiWrapper._qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi getWrappedQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
	}

	@Override
	public QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi getWrappedModel() {
		return _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi.resetOriginalValues();
	}

	private QlvtCapPhepGplvPhuongTienVanTaiTramdungnghi _qlvtCapPhepGplvPhuongTienVanTaiTramdungnghi;
}