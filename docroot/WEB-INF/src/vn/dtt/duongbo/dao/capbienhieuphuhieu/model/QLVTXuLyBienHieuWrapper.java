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
 * This class is a wrapper for {@link QLVTXuLyBienHieu}.
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyBienHieu
 * @generated
 */
public class QLVTXuLyBienHieuWrapper implements QLVTXuLyBienHieu,
	ModelWrapper<QLVTXuLyBienHieu> {
	public QLVTXuLyBienHieuWrapper(QLVTXuLyBienHieu qlvtXuLyBienHieu) {
		_qlvtXuLyBienHieu = qlvtXuLyBienHieu;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyBienHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyBienHieu.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("LinhVucKinhDoanh", getLinhVucKinhDoanh());
		attributes.put("lyDoCapLai", getLyDoCapLai());
		attributes.put("gpkdLuuHanhQuocTe", getGpkdLuuHanhQuocTe());
		attributes.put("gpkdLuuHanhQuocTeCQCAP", getGpkdLuuHanhQuocTeCQCAP());
		attributes.put("gpkdLuuHanhQuocTeNgayCap", getGpkdLuuHanhQuocTeNgayCap());
		attributes.put("gpkdLuuHanhQuocTeNgayHetHan",
			getGpkdLuuHanhQuocTeNgayHetHan());
		attributes.put("soLuongXe", getSoLuongXe());
		attributes.put("soLuongBHPHNopLai", getSoLuongBHPHNopLai());
		attributes.put("lapCap", getLapCap());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String LinhVucKinhDoanh = (String)attributes.get("LinhVucKinhDoanh");

		if (LinhVucKinhDoanh != null) {
			setLinhVucKinhDoanh(LinhVucKinhDoanh);
		}

		String lyDoCapLai = (String)attributes.get("lyDoCapLai");

		if (lyDoCapLai != null) {
			setLyDoCapLai(lyDoCapLai);
		}

		String gpkdLuuHanhQuocTe = (String)attributes.get("gpkdLuuHanhQuocTe");

		if (gpkdLuuHanhQuocTe != null) {
			setGpkdLuuHanhQuocTe(gpkdLuuHanhQuocTe);
		}

		String gpkdLuuHanhQuocTeCQCAP = (String)attributes.get(
				"gpkdLuuHanhQuocTeCQCAP");

		if (gpkdLuuHanhQuocTeCQCAP != null) {
			setGpkdLuuHanhQuocTeCQCAP(gpkdLuuHanhQuocTeCQCAP);
		}

		Date gpkdLuuHanhQuocTeNgayCap = (Date)attributes.get(
				"gpkdLuuHanhQuocTeNgayCap");

		if (gpkdLuuHanhQuocTeNgayCap != null) {
			setGpkdLuuHanhQuocTeNgayCap(gpkdLuuHanhQuocTeNgayCap);
		}

		Date gpkdLuuHanhQuocTeNgayHetHan = (Date)attributes.get(
				"gpkdLuuHanhQuocTeNgayHetHan");

		if (gpkdLuuHanhQuocTeNgayHetHan != null) {
			setGpkdLuuHanhQuocTeNgayHetHan(gpkdLuuHanhQuocTeNgayHetHan);
		}

		String soLuongXe = (String)attributes.get("soLuongXe");

		if (soLuongXe != null) {
			setSoLuongXe(soLuongXe);
		}

		Integer soLuongBHPHNopLai = (Integer)attributes.get("soLuongBHPHNopLai");

		if (soLuongBHPHNopLai != null) {
			setSoLuongBHPHNopLai(soLuongBHPHNopLai);
		}

		Integer lapCap = (Integer)attributes.get("lapCap");

		if (lapCap != null) {
			setLapCap(lapCap);
		}
	}

	/**
	* Returns the primary key of this q l v t xu ly bien hieu.
	*
	* @return the primary key of this q l v t xu ly bien hieu
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtXuLyBienHieu.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t xu ly bien hieu.
	*
	* @param primaryKey the primary key of this q l v t xu ly bien hieu
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtXuLyBienHieu.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t xu ly bien hieu.
	*
	* @return the ID of this q l v t xu ly bien hieu
	*/
	@Override
	public int getId() {
		return _qlvtXuLyBienHieu.getId();
	}

	/**
	* Sets the ID of this q l v t xu ly bien hieu.
	*
	* @param id the ID of this q l v t xu ly bien hieu
	*/
	@Override
	public void setId(int id) {
		_qlvtXuLyBienHieu.setId(id);
	}

	/**
	* Returns the thong tin xu ly ID of this q l v t xu ly bien hieu.
	*
	* @return the thong tin xu ly ID of this q l v t xu ly bien hieu
	*/
	@Override
	public int getThongTinXuLyId() {
		return _qlvtXuLyBienHieu.getThongTinXuLyId();
	}

	/**
	* Sets the thong tin xu ly ID of this q l v t xu ly bien hieu.
	*
	* @param thongTinXuLyId the thong tin xu ly ID of this q l v t xu ly bien hieu
	*/
	@Override
	public void setThongTinXuLyId(int thongTinXuLyId) {
		_qlvtXuLyBienHieu.setThongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the linh vuc kinh doanh of this q l v t xu ly bien hieu.
	*
	* @return the linh vuc kinh doanh of this q l v t xu ly bien hieu
	*/
	@Override
	public java.lang.String getLinhVucKinhDoanh() {
		return _qlvtXuLyBienHieu.getLinhVucKinhDoanh();
	}

	/**
	* Sets the linh vuc kinh doanh of this q l v t xu ly bien hieu.
	*
	* @param LinhVucKinhDoanh the linh vuc kinh doanh of this q l v t xu ly bien hieu
	*/
	@Override
	public void setLinhVucKinhDoanh(java.lang.String LinhVucKinhDoanh) {
		_qlvtXuLyBienHieu.setLinhVucKinhDoanh(LinhVucKinhDoanh);
	}

	/**
	* Returns the ly do cap lai of this q l v t xu ly bien hieu.
	*
	* @return the ly do cap lai of this q l v t xu ly bien hieu
	*/
	@Override
	public java.lang.String getLyDoCapLai() {
		return _qlvtXuLyBienHieu.getLyDoCapLai();
	}

	/**
	* Sets the ly do cap lai of this q l v t xu ly bien hieu.
	*
	* @param lyDoCapLai the ly do cap lai of this q l v t xu ly bien hieu
	*/
	@Override
	public void setLyDoCapLai(java.lang.String lyDoCapLai) {
		_qlvtXuLyBienHieu.setLyDoCapLai(lyDoCapLai);
	}

	/**
	* Returns the gpkd luu hanh quoc te of this q l v t xu ly bien hieu.
	*
	* @return the gpkd luu hanh quoc te of this q l v t xu ly bien hieu
	*/
	@Override
	public java.lang.String getGpkdLuuHanhQuocTe() {
		return _qlvtXuLyBienHieu.getGpkdLuuHanhQuocTe();
	}

	/**
	* Sets the gpkd luu hanh quoc te of this q l v t xu ly bien hieu.
	*
	* @param gpkdLuuHanhQuocTe the gpkd luu hanh quoc te of this q l v t xu ly bien hieu
	*/
	@Override
	public void setGpkdLuuHanhQuocTe(java.lang.String gpkdLuuHanhQuocTe) {
		_qlvtXuLyBienHieu.setGpkdLuuHanhQuocTe(gpkdLuuHanhQuocTe);
	}

	/**
	* Returns the gpkd luu hanh quoc te c q c a p of this q l v t xu ly bien hieu.
	*
	* @return the gpkd luu hanh quoc te c q c a p of this q l v t xu ly bien hieu
	*/
	@Override
	public java.lang.String getGpkdLuuHanhQuocTeCQCAP() {
		return _qlvtXuLyBienHieu.getGpkdLuuHanhQuocTeCQCAP();
	}

	/**
	* Sets the gpkd luu hanh quoc te c q c a p of this q l v t xu ly bien hieu.
	*
	* @param gpkdLuuHanhQuocTeCQCAP the gpkd luu hanh quoc te c q c a p of this q l v t xu ly bien hieu
	*/
	@Override
	public void setGpkdLuuHanhQuocTeCQCAP(
		java.lang.String gpkdLuuHanhQuocTeCQCAP) {
		_qlvtXuLyBienHieu.setGpkdLuuHanhQuocTeCQCAP(gpkdLuuHanhQuocTeCQCAP);
	}

	/**
	* Returns the gpkd luu hanh quoc te ngay cap of this q l v t xu ly bien hieu.
	*
	* @return the gpkd luu hanh quoc te ngay cap of this q l v t xu ly bien hieu
	*/
	@Override
	public java.util.Date getGpkdLuuHanhQuocTeNgayCap() {
		return _qlvtXuLyBienHieu.getGpkdLuuHanhQuocTeNgayCap();
	}

	/**
	* Sets the gpkd luu hanh quoc te ngay cap of this q l v t xu ly bien hieu.
	*
	* @param gpkdLuuHanhQuocTeNgayCap the gpkd luu hanh quoc te ngay cap of this q l v t xu ly bien hieu
	*/
	@Override
	public void setGpkdLuuHanhQuocTeNgayCap(
		java.util.Date gpkdLuuHanhQuocTeNgayCap) {
		_qlvtXuLyBienHieu.setGpkdLuuHanhQuocTeNgayCap(gpkdLuuHanhQuocTeNgayCap);
	}

	/**
	* Returns the gpkd luu hanh quoc te ngay het han of this q l v t xu ly bien hieu.
	*
	* @return the gpkd luu hanh quoc te ngay het han of this q l v t xu ly bien hieu
	*/
	@Override
	public java.util.Date getGpkdLuuHanhQuocTeNgayHetHan() {
		return _qlvtXuLyBienHieu.getGpkdLuuHanhQuocTeNgayHetHan();
	}

	/**
	* Sets the gpkd luu hanh quoc te ngay het han of this q l v t xu ly bien hieu.
	*
	* @param gpkdLuuHanhQuocTeNgayHetHan the gpkd luu hanh quoc te ngay het han of this q l v t xu ly bien hieu
	*/
	@Override
	public void setGpkdLuuHanhQuocTeNgayHetHan(
		java.util.Date gpkdLuuHanhQuocTeNgayHetHan) {
		_qlvtXuLyBienHieu.setGpkdLuuHanhQuocTeNgayHetHan(gpkdLuuHanhQuocTeNgayHetHan);
	}

	/**
	* Returns the so luong xe of this q l v t xu ly bien hieu.
	*
	* @return the so luong xe of this q l v t xu ly bien hieu
	*/
	@Override
	public java.lang.String getSoLuongXe() {
		return _qlvtXuLyBienHieu.getSoLuongXe();
	}

	/**
	* Sets the so luong xe of this q l v t xu ly bien hieu.
	*
	* @param soLuongXe the so luong xe of this q l v t xu ly bien hieu
	*/
	@Override
	public void setSoLuongXe(java.lang.String soLuongXe) {
		_qlvtXuLyBienHieu.setSoLuongXe(soLuongXe);
	}

	/**
	* Returns the so luong b h p h nop lai of this q l v t xu ly bien hieu.
	*
	* @return the so luong b h p h nop lai of this q l v t xu ly bien hieu
	*/
	@Override
	public int getSoLuongBHPHNopLai() {
		return _qlvtXuLyBienHieu.getSoLuongBHPHNopLai();
	}

	/**
	* Sets the so luong b h p h nop lai of this q l v t xu ly bien hieu.
	*
	* @param soLuongBHPHNopLai the so luong b h p h nop lai of this q l v t xu ly bien hieu
	*/
	@Override
	public void setSoLuongBHPHNopLai(int soLuongBHPHNopLai) {
		_qlvtXuLyBienHieu.setSoLuongBHPHNopLai(soLuongBHPHNopLai);
	}

	/**
	* Returns the lap cap of this q l v t xu ly bien hieu.
	*
	* @return the lap cap of this q l v t xu ly bien hieu
	*/
	@Override
	public int getLapCap() {
		return _qlvtXuLyBienHieu.getLapCap();
	}

	/**
	* Sets the lap cap of this q l v t xu ly bien hieu.
	*
	* @param lapCap the lap cap of this q l v t xu ly bien hieu
	*/
	@Override
	public void setLapCap(int lapCap) {
		_qlvtXuLyBienHieu.setLapCap(lapCap);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyBienHieu.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyBienHieu.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyBienHieu.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyBienHieu.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyBienHieu.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyBienHieu.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyBienHieu.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyBienHieu.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyBienHieu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyBienHieu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyBienHieu.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTXuLyBienHieuWrapper((QLVTXuLyBienHieu)_qlvtXuLyBienHieu.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu qlvtXuLyBienHieu) {
		return _qlvtXuLyBienHieu.compareTo(qlvtXuLyBienHieu);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyBienHieu.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu> toCacheModel() {
		return _qlvtXuLyBienHieu.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu toEscapedModel() {
		return new QLVTXuLyBienHieuWrapper(_qlvtXuLyBienHieu.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu toUnescapedModel() {
		return new QLVTXuLyBienHieuWrapper(_qlvtXuLyBienHieu.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyBienHieu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyBienHieu.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyBienHieu.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTXuLyBienHieuWrapper)) {
			return false;
		}

		QLVTXuLyBienHieuWrapper qlvtXuLyBienHieuWrapper = (QLVTXuLyBienHieuWrapper)obj;

		if (Validator.equals(_qlvtXuLyBienHieu,
					qlvtXuLyBienHieuWrapper._qlvtXuLyBienHieu)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTXuLyBienHieu getWrappedQLVTXuLyBienHieu() {
		return _qlvtXuLyBienHieu;
	}

	@Override
	public QLVTXuLyBienHieu getWrappedModel() {
		return _qlvtXuLyBienHieu;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyBienHieu.resetOriginalValues();
	}

	private QLVTXuLyBienHieu _qlvtXuLyBienHieu;
}