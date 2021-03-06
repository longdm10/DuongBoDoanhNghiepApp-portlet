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

package vn.dtt.duongbien.dao.vrcb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DmTestN01Request}.
 * </p>
 *
 * @author longdm
 * @see DmTestN01Request
 * @generated
 */
public class DmTestN01RequestWrapper implements DmTestN01Request,
	ModelWrapper<DmTestN01Request> {
	public DmTestN01RequestWrapper(DmTestN01Request dmTestN01Request) {
		_dmTestN01Request = dmTestN01Request;
	}

	@Override
	public Class<?> getModelClass() {
		return DmTestN01Request.class;
	}

	@Override
	public String getModelClassName() {
		return DmTestN01Request.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("requestID", getRequestID());
		attributes.put("enterpriseCode", getEnterpriseCode());
		attributes.put("tenDuAn", getTenDuAn());
		attributes.put("suCanThietDauTu", getSuCanThietDauTu());
		attributes.put("viTri", getViTri());
		attributes.put("loaiTauBienGioiHanVaoCang",
			getLoaiTauBienGioiHanVaoCang());
		attributes.put("soLuongCauCang", getSoLuongCauCang());
		attributes.put("tongDienTichXayDungDuKien",
			getTongDienTichXayDungDuKien());
		attributes.put("taiLieulienQuan", getTaiLieulienQuan());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedUser", getModifiedUser());
		attributes.put("isAuthorized", getIsAuthorized());
		attributes.put("authorizedDate", getAuthorizedDate());
		attributes.put("authorizedUser", getAuthorizedUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer requestID = (Integer)attributes.get("requestID");

		if (requestID != null) {
			setRequestID(requestID);
		}

		String enterpriseCode = (String)attributes.get("enterpriseCode");

		if (enterpriseCode != null) {
			setEnterpriseCode(enterpriseCode);
		}

		String tenDuAn = (String)attributes.get("tenDuAn");

		if (tenDuAn != null) {
			setTenDuAn(tenDuAn);
		}

		String suCanThietDauTu = (String)attributes.get("suCanThietDauTu");

		if (suCanThietDauTu != null) {
			setSuCanThietDauTu(suCanThietDauTu);
		}

		String viTri = (String)attributes.get("viTri");

		if (viTri != null) {
			setViTri(viTri);
		}

		String loaiTauBienGioiHanVaoCang = (String)attributes.get(
				"loaiTauBienGioiHanVaoCang");

		if (loaiTauBienGioiHanVaoCang != null) {
			setLoaiTauBienGioiHanVaoCang(loaiTauBienGioiHanVaoCang);
		}

		String soLuongCauCang = (String)attributes.get("soLuongCauCang");

		if (soLuongCauCang != null) {
			setSoLuongCauCang(soLuongCauCang);
		}

		String tongDienTichXayDungDuKien = (String)attributes.get(
				"tongDienTichXayDungDuKien");

		if (tongDienTichXayDungDuKien != null) {
			setTongDienTichXayDungDuKien(tongDienTichXayDungDuKien);
		}

		String taiLieulienQuan = (String)attributes.get("taiLieulienQuan");

		if (taiLieulienQuan != null) {
			setTaiLieulienQuan(taiLieulienQuan);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String modifiedUser = (String)attributes.get("modifiedUser");

		if (modifiedUser != null) {
			setModifiedUser(modifiedUser);
		}

		Integer isAuthorized = (Integer)attributes.get("isAuthorized");

		if (isAuthorized != null) {
			setIsAuthorized(isAuthorized);
		}

		Date authorizedDate = (Date)attributes.get("authorizedDate");

		if (authorizedDate != null) {
			setAuthorizedDate(authorizedDate);
		}

		String authorizedUser = (String)attributes.get("authorizedUser");

		if (authorizedUser != null) {
			setAuthorizedUser(authorizedUser);
		}
	}

	/**
	* Returns the primary key of this dm test n01 request.
	*
	* @return the primary key of this dm test n01 request
	*/
	@Override
	public int getPrimaryKey() {
		return _dmTestN01Request.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm test n01 request.
	*
	* @param primaryKey the primary key of this dm test n01 request
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmTestN01Request.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the request i d of this dm test n01 request.
	*
	* @return the request i d of this dm test n01 request
	*/
	@Override
	public int getRequestID() {
		return _dmTestN01Request.getRequestID();
	}

	/**
	* Sets the request i d of this dm test n01 request.
	*
	* @param requestID the request i d of this dm test n01 request
	*/
	@Override
	public void setRequestID(int requestID) {
		_dmTestN01Request.setRequestID(requestID);
	}

	/**
	* Returns the enterprise code of this dm test n01 request.
	*
	* @return the enterprise code of this dm test n01 request
	*/
	@Override
	public java.lang.String getEnterpriseCode() {
		return _dmTestN01Request.getEnterpriseCode();
	}

	/**
	* Sets the enterprise code of this dm test n01 request.
	*
	* @param enterpriseCode the enterprise code of this dm test n01 request
	*/
	@Override
	public void setEnterpriseCode(java.lang.String enterpriseCode) {
		_dmTestN01Request.setEnterpriseCode(enterpriseCode);
	}

	/**
	* Returns the ten du an of this dm test n01 request.
	*
	* @return the ten du an of this dm test n01 request
	*/
	@Override
	public java.lang.String getTenDuAn() {
		return _dmTestN01Request.getTenDuAn();
	}

	/**
	* Sets the ten du an of this dm test n01 request.
	*
	* @param tenDuAn the ten du an of this dm test n01 request
	*/
	@Override
	public void setTenDuAn(java.lang.String tenDuAn) {
		_dmTestN01Request.setTenDuAn(tenDuAn);
	}

	/**
	* Returns the su can thiet dau tu of this dm test n01 request.
	*
	* @return the su can thiet dau tu of this dm test n01 request
	*/
	@Override
	public java.lang.String getSuCanThietDauTu() {
		return _dmTestN01Request.getSuCanThietDauTu();
	}

	/**
	* Sets the su can thiet dau tu of this dm test n01 request.
	*
	* @param suCanThietDauTu the su can thiet dau tu of this dm test n01 request
	*/
	@Override
	public void setSuCanThietDauTu(java.lang.String suCanThietDauTu) {
		_dmTestN01Request.setSuCanThietDauTu(suCanThietDauTu);
	}

	/**
	* Returns the vi tri of this dm test n01 request.
	*
	* @return the vi tri of this dm test n01 request
	*/
	@Override
	public java.lang.String getViTri() {
		return _dmTestN01Request.getViTri();
	}

	/**
	* Sets the vi tri of this dm test n01 request.
	*
	* @param viTri the vi tri of this dm test n01 request
	*/
	@Override
	public void setViTri(java.lang.String viTri) {
		_dmTestN01Request.setViTri(viTri);
	}

	/**
	* Returns the loai tau bien gioi han vao cang of this dm test n01 request.
	*
	* @return the loai tau bien gioi han vao cang of this dm test n01 request
	*/
	@Override
	public java.lang.String getLoaiTauBienGioiHanVaoCang() {
		return _dmTestN01Request.getLoaiTauBienGioiHanVaoCang();
	}

	/**
	* Sets the loai tau bien gioi han vao cang of this dm test n01 request.
	*
	* @param loaiTauBienGioiHanVaoCang the loai tau bien gioi han vao cang of this dm test n01 request
	*/
	@Override
	public void setLoaiTauBienGioiHanVaoCang(
		java.lang.String loaiTauBienGioiHanVaoCang) {
		_dmTestN01Request.setLoaiTauBienGioiHanVaoCang(loaiTauBienGioiHanVaoCang);
	}

	/**
	* Returns the so luong cau cang of this dm test n01 request.
	*
	* @return the so luong cau cang of this dm test n01 request
	*/
	@Override
	public java.lang.String getSoLuongCauCang() {
		return _dmTestN01Request.getSoLuongCauCang();
	}

	/**
	* Sets the so luong cau cang of this dm test n01 request.
	*
	* @param soLuongCauCang the so luong cau cang of this dm test n01 request
	*/
	@Override
	public void setSoLuongCauCang(java.lang.String soLuongCauCang) {
		_dmTestN01Request.setSoLuongCauCang(soLuongCauCang);
	}

	/**
	* Returns the tong dien tich xay dung du kien of this dm test n01 request.
	*
	* @return the tong dien tich xay dung du kien of this dm test n01 request
	*/
	@Override
	public java.lang.String getTongDienTichXayDungDuKien() {
		return _dmTestN01Request.getTongDienTichXayDungDuKien();
	}

	/**
	* Sets the tong dien tich xay dung du kien of this dm test n01 request.
	*
	* @param tongDienTichXayDungDuKien the tong dien tich xay dung du kien of this dm test n01 request
	*/
	@Override
	public void setTongDienTichXayDungDuKien(
		java.lang.String tongDienTichXayDungDuKien) {
		_dmTestN01Request.setTongDienTichXayDungDuKien(tongDienTichXayDungDuKien);
	}

	/**
	* Returns the tai lieulien quan of this dm test n01 request.
	*
	* @return the tai lieulien quan of this dm test n01 request
	*/
	@Override
	public java.lang.String getTaiLieulienQuan() {
		return _dmTestN01Request.getTaiLieulienQuan();
	}

	/**
	* Sets the tai lieulien quan of this dm test n01 request.
	*
	* @param taiLieulienQuan the tai lieulien quan of this dm test n01 request
	*/
	@Override
	public void setTaiLieulienQuan(java.lang.String taiLieulienQuan) {
		_dmTestN01Request.setTaiLieulienQuan(taiLieulienQuan);
	}

	/**
	* Returns the modified date of this dm test n01 request.
	*
	* @return the modified date of this dm test n01 request
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmTestN01Request.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm test n01 request.
	*
	* @param modifiedDate the modified date of this dm test n01 request
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmTestN01Request.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the modified user of this dm test n01 request.
	*
	* @return the modified user of this dm test n01 request
	*/
	@Override
	public java.lang.String getModifiedUser() {
		return _dmTestN01Request.getModifiedUser();
	}

	/**
	* Sets the modified user of this dm test n01 request.
	*
	* @param modifiedUser the modified user of this dm test n01 request
	*/
	@Override
	public void setModifiedUser(java.lang.String modifiedUser) {
		_dmTestN01Request.setModifiedUser(modifiedUser);
	}

	/**
	* Returns the is authorized of this dm test n01 request.
	*
	* @return the is authorized of this dm test n01 request
	*/
	@Override
	public int getIsAuthorized() {
		return _dmTestN01Request.getIsAuthorized();
	}

	/**
	* Sets the is authorized of this dm test n01 request.
	*
	* @param isAuthorized the is authorized of this dm test n01 request
	*/
	@Override
	public void setIsAuthorized(int isAuthorized) {
		_dmTestN01Request.setIsAuthorized(isAuthorized);
	}

	/**
	* Returns the authorized date of this dm test n01 request.
	*
	* @return the authorized date of this dm test n01 request
	*/
	@Override
	public java.util.Date getAuthorizedDate() {
		return _dmTestN01Request.getAuthorizedDate();
	}

	/**
	* Sets the authorized date of this dm test n01 request.
	*
	* @param authorizedDate the authorized date of this dm test n01 request
	*/
	@Override
	public void setAuthorizedDate(java.util.Date authorizedDate) {
		_dmTestN01Request.setAuthorizedDate(authorizedDate);
	}

	/**
	* Returns the authorized user of this dm test n01 request.
	*
	* @return the authorized user of this dm test n01 request
	*/
	@Override
	public java.lang.String getAuthorizedUser() {
		return _dmTestN01Request.getAuthorizedUser();
	}

	/**
	* Sets the authorized user of this dm test n01 request.
	*
	* @param authorizedUser the authorized user of this dm test n01 request
	*/
	@Override
	public void setAuthorizedUser(java.lang.String authorizedUser) {
		_dmTestN01Request.setAuthorizedUser(authorizedUser);
	}

	@Override
	public boolean isNew() {
		return _dmTestN01Request.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmTestN01Request.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmTestN01Request.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmTestN01Request.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmTestN01Request.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmTestN01Request.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmTestN01Request.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmTestN01Request.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmTestN01Request.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmTestN01Request.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmTestN01Request.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmTestN01RequestWrapper((DmTestN01Request)_dmTestN01Request.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request dmTestN01Request) {
		return _dmTestN01Request.compareTo(dmTestN01Request);
	}

	@Override
	public int hashCode() {
		return _dmTestN01Request.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request> toCacheModel() {
		return _dmTestN01Request.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request toEscapedModel() {
		return new DmTestN01RequestWrapper(_dmTestN01Request.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request toUnescapedModel() {
		return new DmTestN01RequestWrapper(_dmTestN01Request.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmTestN01Request.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmTestN01Request.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmTestN01Request.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmTestN01RequestWrapper)) {
			return false;
		}

		DmTestN01RequestWrapper dmTestN01RequestWrapper = (DmTestN01RequestWrapper)obj;

		if (Validator.equals(_dmTestN01Request,
					dmTestN01RequestWrapper._dmTestN01Request)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmTestN01Request getWrappedDmTestN01Request() {
		return _dmTestN01Request;
	}

	@Override
	public DmTestN01Request getWrappedModel() {
		return _dmTestN01Request;
	}

	@Override
	public void resetOriginalValues() {
		_dmTestN01Request.resetOriginalValues();
	}

	private DmTestN01Request _dmTestN01Request;
}