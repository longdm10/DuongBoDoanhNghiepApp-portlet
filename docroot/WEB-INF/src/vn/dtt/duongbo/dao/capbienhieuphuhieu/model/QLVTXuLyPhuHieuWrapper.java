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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QLVTXuLyPhuHieu}.
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyPhuHieu
 * @generated
 */
public class QLVTXuLyPhuHieuWrapper implements QLVTXuLyPhuHieu,
	ModelWrapper<QLVTXuLyPhuHieu> {
	public QLVTXuLyPhuHieuWrapper(QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		_qlvtXuLyPhuHieu = qlvtXuLyPhuHieu;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyPhuHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyPhuHieu.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("soLuongBHPHNopLai", getSoLuongBHPHNopLai());
		attributes.put("soLuongBienHieu", getSoLuongBienHieu());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("loaiPhuHieu", getLoaiPhuHieu());
		attributes.put("soLuong", getSoLuong());
		attributes.put("soLuongBH_PHNopLai", getSoLuongBH_PHNopLai());
		attributes.put("sovbChapNhanTuyen", getSovbChapNhanTuyen());
		attributes.put("ngayCapVBChapNhanTuyen", getNgayCapVBChapNhanTuyen());
		attributes.put("lanCap", getLanCap());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer soLuongBHPHNopLai = (Integer)attributes.get("soLuongBHPHNopLai");

		if (soLuongBHPHNopLai != null) {
			setSoLuongBHPHNopLai(soLuongBHPHNopLai);
		}

		Integer soLuongBienHieu = (Integer)attributes.get("soLuongBienHieu");

		if (soLuongBienHieu != null) {
			setSoLuongBienHieu(soLuongBienHieu);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String loaiPhuHieu = (String)attributes.get("loaiPhuHieu");

		if (loaiPhuHieu != null) {
			setLoaiPhuHieu(loaiPhuHieu);
		}

		Integer soLuong = (Integer)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Integer soLuongBH_PHNopLai = (Integer)attributes.get(
				"soLuongBH_PHNopLai");

		if (soLuongBH_PHNopLai != null) {
			setSoLuongBH_PHNopLai(soLuongBH_PHNopLai);
		}

		String sovbChapNhanTuyen = (String)attributes.get("sovbChapNhanTuyen");

		if (sovbChapNhanTuyen != null) {
			setSovbChapNhanTuyen(sovbChapNhanTuyen);
		}

		Date ngayCapVBChapNhanTuyen = (Date)attributes.get(
				"ngayCapVBChapNhanTuyen");

		if (ngayCapVBChapNhanTuyen != null) {
			setNgayCapVBChapNhanTuyen(ngayCapVBChapNhanTuyen);
		}

		Integer lanCap = (Integer)attributes.get("lanCap");

		if (lanCap != null) {
			setLanCap(lanCap);
		}
	}

	/**
	* Returns the primary key of this q l v t xu ly phu hieu.
	*
	* @return the primary key of this q l v t xu ly phu hieu
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtXuLyPhuHieu.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t xu ly phu hieu.
	*
	* @param primaryKey the primary key of this q l v t xu ly phu hieu
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtXuLyPhuHieu.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t xu ly phu hieu.
	*
	* @return the ID of this q l v t xu ly phu hieu
	*/
	@Override
	public int getId() {
		return _qlvtXuLyPhuHieu.getId();
	}

	/**
	* Sets the ID of this q l v t xu ly phu hieu.
	*
	* @param id the ID of this q l v t xu ly phu hieu
	*/
	@Override
	public void setId(int id) {
		_qlvtXuLyPhuHieu.setId(id);
	}

	/**
	* Returns the so luong b h p h nop lai of this q l v t xu ly phu hieu.
	*
	* @return the so luong b h p h nop lai of this q l v t xu ly phu hieu
	*/
	@Override
	public int getSoLuongBHPHNopLai() {
		return _qlvtXuLyPhuHieu.getSoLuongBHPHNopLai();
	}

	/**
	* Sets the so luong b h p h nop lai of this q l v t xu ly phu hieu.
	*
	* @param soLuongBHPHNopLai the so luong b h p h nop lai of this q l v t xu ly phu hieu
	*/
	@Override
	public void setSoLuongBHPHNopLai(int soLuongBHPHNopLai) {
		_qlvtXuLyPhuHieu.setSoLuongBHPHNopLai(soLuongBHPHNopLai);
	}

	/**
	* Returns the so luong bien hieu of this q l v t xu ly phu hieu.
	*
	* @return the so luong bien hieu of this q l v t xu ly phu hieu
	*/
	@Override
	public int getSoLuongBienHieu() {
		return _qlvtXuLyPhuHieu.getSoLuongBienHieu();
	}

	/**
	* Sets the so luong bien hieu of this q l v t xu ly phu hieu.
	*
	* @param soLuongBienHieu the so luong bien hieu of this q l v t xu ly phu hieu
	*/
	@Override
	public void setSoLuongBienHieu(int soLuongBienHieu) {
		_qlvtXuLyPhuHieu.setSoLuongBienHieu(soLuongBienHieu);
	}

	/**
	* Returns the thong tin xu ly ID of this q l v t xu ly phu hieu.
	*
	* @return the thong tin xu ly ID of this q l v t xu ly phu hieu
	*/
	@Override
	public int getThongTinXuLyId() {
		return _qlvtXuLyPhuHieu.getThongTinXuLyId();
	}

	/**
	* Sets the thong tin xu ly ID of this q l v t xu ly phu hieu.
	*
	* @param thongTinXuLyId the thong tin xu ly ID of this q l v t xu ly phu hieu
	*/
	@Override
	public void setThongTinXuLyId(int thongTinXuLyId) {
		_qlvtXuLyPhuHieu.setThongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the loai phu hieu of this q l v t xu ly phu hieu.
	*
	* @return the loai phu hieu of this q l v t xu ly phu hieu
	*/
	@Override
	public java.lang.String getLoaiPhuHieu() {
		return _qlvtXuLyPhuHieu.getLoaiPhuHieu();
	}

	/**
	* Sets the loai phu hieu of this q l v t xu ly phu hieu.
	*
	* @param loaiPhuHieu the loai phu hieu of this q l v t xu ly phu hieu
	*/
	@Override
	public void setLoaiPhuHieu(java.lang.String loaiPhuHieu) {
		_qlvtXuLyPhuHieu.setLoaiPhuHieu(loaiPhuHieu);
	}

	/**
	* Returns the so luong of this q l v t xu ly phu hieu.
	*
	* @return the so luong of this q l v t xu ly phu hieu
	*/
	@Override
	public int getSoLuong() {
		return _qlvtXuLyPhuHieu.getSoLuong();
	}

	/**
	* Sets the so luong of this q l v t xu ly phu hieu.
	*
	* @param soLuong the so luong of this q l v t xu ly phu hieu
	*/
	@Override
	public void setSoLuong(int soLuong) {
		_qlvtXuLyPhuHieu.setSoLuong(soLuong);
	}

	/**
	* Returns the so luong b h_ p h nop lai of this q l v t xu ly phu hieu.
	*
	* @return the so luong b h_ p h nop lai of this q l v t xu ly phu hieu
	*/
	@Override
	public int getSoLuongBH_PHNopLai() {
		return _qlvtXuLyPhuHieu.getSoLuongBH_PHNopLai();
	}

	/**
	* Sets the so luong b h_ p h nop lai of this q l v t xu ly phu hieu.
	*
	* @param soLuongBH_PHNopLai the so luong b h_ p h nop lai of this q l v t xu ly phu hieu
	*/
	@Override
	public void setSoLuongBH_PHNopLai(int soLuongBH_PHNopLai) {
		_qlvtXuLyPhuHieu.setSoLuongBH_PHNopLai(soLuongBH_PHNopLai);
	}

	/**
	* Returns the sovb chap nhan tuyen of this q l v t xu ly phu hieu.
	*
	* @return the sovb chap nhan tuyen of this q l v t xu ly phu hieu
	*/
	@Override
	public java.lang.String getSovbChapNhanTuyen() {
		return _qlvtXuLyPhuHieu.getSovbChapNhanTuyen();
	}

	/**
	* Sets the sovb chap nhan tuyen of this q l v t xu ly phu hieu.
	*
	* @param sovbChapNhanTuyen the sovb chap nhan tuyen of this q l v t xu ly phu hieu
	*/
	@Override
	public void setSovbChapNhanTuyen(java.lang.String sovbChapNhanTuyen) {
		_qlvtXuLyPhuHieu.setSovbChapNhanTuyen(sovbChapNhanTuyen);
	}

	/**
	* Returns the ngay cap v b chap nhan tuyen of this q l v t xu ly phu hieu.
	*
	* @return the ngay cap v b chap nhan tuyen of this q l v t xu ly phu hieu
	*/
	@Override
	public java.util.Date getNgayCapVBChapNhanTuyen() {
		return _qlvtXuLyPhuHieu.getNgayCapVBChapNhanTuyen();
	}

	/**
	* Sets the ngay cap v b chap nhan tuyen of this q l v t xu ly phu hieu.
	*
	* @param ngayCapVBChapNhanTuyen the ngay cap v b chap nhan tuyen of this q l v t xu ly phu hieu
	*/
	@Override
	public void setNgayCapVBChapNhanTuyen(java.util.Date ngayCapVBChapNhanTuyen) {
		_qlvtXuLyPhuHieu.setNgayCapVBChapNhanTuyen(ngayCapVBChapNhanTuyen);
	}

	/**
	* Returns the lan cap of this q l v t xu ly phu hieu.
	*
	* @return the lan cap of this q l v t xu ly phu hieu
	*/
	@Override
	public int getLanCap() {
		return _qlvtXuLyPhuHieu.getLanCap();
	}

	/**
	* Sets the lan cap of this q l v t xu ly phu hieu.
	*
	* @param lanCap the lan cap of this q l v t xu ly phu hieu
	*/
	@Override
	public void setLanCap(int lanCap) {
		_qlvtXuLyPhuHieu.setLanCap(lanCap);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyPhuHieu.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyPhuHieu.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyPhuHieu.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyPhuHieu.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyPhuHieu.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyPhuHieu.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyPhuHieu.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyPhuHieu.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyPhuHieu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyPhuHieu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyPhuHieu.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTXuLyPhuHieuWrapper((QLVTXuLyPhuHieu)_qlvtXuLyPhuHieu.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		return _qlvtXuLyPhuHieu.compareTo(qlvtXuLyPhuHieu);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyPhuHieu.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu> toCacheModel() {
		return _qlvtXuLyPhuHieu.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu toEscapedModel() {
		return new QLVTXuLyPhuHieuWrapper(_qlvtXuLyPhuHieu.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu toUnescapedModel() {
		return new QLVTXuLyPhuHieuWrapper(_qlvtXuLyPhuHieu.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyPhuHieu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyPhuHieu.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyPhuHieu.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTXuLyPhuHieuWrapper)) {
			return false;
		}

		QLVTXuLyPhuHieuWrapper qlvtXuLyPhuHieuWrapper = (QLVTXuLyPhuHieuWrapper)obj;

		if (Validator.equals(_qlvtXuLyPhuHieu,
					qlvtXuLyPhuHieuWrapper._qlvtXuLyPhuHieu)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTXuLyPhuHieu getWrappedQLVTXuLyPhuHieu() {
		return _qlvtXuLyPhuHieu;
	}

	@Override
	public QLVTXuLyPhuHieu getWrappedModel() {
		return _qlvtXuLyPhuHieu;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyPhuHieu.resetOriginalValues();
	}

	private QLVTXuLyPhuHieu _qlvtXuLyPhuHieu;
}