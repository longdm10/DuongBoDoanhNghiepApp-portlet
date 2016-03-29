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
 * This class is a wrapper for {@link QLVTCapPhepPhuHieu}.
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepPhuHieu
 * @generated
 */
public class QLVTCapPhepPhuHieuWrapper implements QLVTCapPhepPhuHieu,
	ModelWrapper<QLVTCapPhepPhuHieu> {
	public QLVTCapPhepPhuHieuWrapper(QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu) {
		_qlvtCapPhepPhuHieu = qlvtCapPhepPhuHieu;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTCapPhepPhuHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTCapPhepPhuHieu.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinHoSoId", getThongTinHoSoId());
		attributes.put("loaiHinhKinhDoanhId", getLoaiHinhKinhDoanhId());
		attributes.put("soPhuHieu", getSoPhuHieu());
		attributes.put("coQuanCapLanDauId", getCoQuanCapLanDauId());
		attributes.put("CoQuanCapPhepId", getCoQuanCapPhepId());
		attributes.put("ngayCapPhuHieu", getNgayCapPhuHieu());
		attributes.put("thoiHanPhuHieu", getThoiHanPhuHieu());
		attributes.put("noiSanXuat", getNoiSanXuat());
		attributes.put("namSanXuat", getNamSanXuat());
		attributes.put("maTuyenCoDinh", getMaTuyenCoDinh());
		attributes.put("loaiPhuHieu", getLoaiPhuHieu());
		attributes.put("lanGiaHan", getLanGiaHan());
		attributes.put("ngayCapLanDau", getNgayCapLanDau());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("trangThai", getTrangThai());
		attributes.put("fileId", getFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinHoSoId = (Integer)attributes.get("thongTinHoSoId");

		if (thongTinHoSoId != null) {
			setThongTinHoSoId(thongTinHoSoId);
		}

		Integer loaiHinhKinhDoanhId = (Integer)attributes.get(
				"loaiHinhKinhDoanhId");

		if (loaiHinhKinhDoanhId != null) {
			setLoaiHinhKinhDoanhId(loaiHinhKinhDoanhId);
		}

		Integer soPhuHieu = (Integer)attributes.get("soPhuHieu");

		if (soPhuHieu != null) {
			setSoPhuHieu(soPhuHieu);
		}

		Integer coQuanCapLanDauId = (Integer)attributes.get("coQuanCapLanDauId");

		if (coQuanCapLanDauId != null) {
			setCoQuanCapLanDauId(coQuanCapLanDauId);
		}

		Integer CoQuanCapPhepId = (Integer)attributes.get("CoQuanCapPhepId");

		if (CoQuanCapPhepId != null) {
			setCoQuanCapPhepId(CoQuanCapPhepId);
		}

		Date ngayCapPhuHieu = (Date)attributes.get("ngayCapPhuHieu");

		if (ngayCapPhuHieu != null) {
			setNgayCapPhuHieu(ngayCapPhuHieu);
		}

		Date thoiHanPhuHieu = (Date)attributes.get("thoiHanPhuHieu");

		if (thoiHanPhuHieu != null) {
			setThoiHanPhuHieu(thoiHanPhuHieu);
		}

		String noiSanXuat = (String)attributes.get("noiSanXuat");

		if (noiSanXuat != null) {
			setNoiSanXuat(noiSanXuat);
		}

		Integer namSanXuat = (Integer)attributes.get("namSanXuat");

		if (namSanXuat != null) {
			setNamSanXuat(namSanXuat);
		}

		String maTuyenCoDinh = (String)attributes.get("maTuyenCoDinh");

		if (maTuyenCoDinh != null) {
			setMaTuyenCoDinh(maTuyenCoDinh);
		}

		String loaiPhuHieu = (String)attributes.get("loaiPhuHieu");

		if (loaiPhuHieu != null) {
			setLoaiPhuHieu(loaiPhuHieu);
		}

		Integer lanGiaHan = (Integer)attributes.get("lanGiaHan");

		if (lanGiaHan != null) {
			setLanGiaHan(lanGiaHan);
		}

		Date ngayCapLanDau = (Date)attributes.get("ngayCapLanDau");

		if (ngayCapLanDau != null) {
			setNgayCapLanDau(ngayCapLanDau);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer fileId = (Integer)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}
	}

	/**
	* Returns the primary key of this q l v t cap phep phu hieu.
	*
	* @return the primary key of this q l v t cap phep phu hieu
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtCapPhepPhuHieu.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t cap phep phu hieu.
	*
	* @param primaryKey the primary key of this q l v t cap phep phu hieu
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtCapPhepPhuHieu.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t cap phep phu hieu.
	*
	* @return the ID of this q l v t cap phep phu hieu
	*/
	@Override
	public int getId() {
		return _qlvtCapPhepPhuHieu.getId();
	}

	/**
	* Sets the ID of this q l v t cap phep phu hieu.
	*
	* @param id the ID of this q l v t cap phep phu hieu
	*/
	@Override
	public void setId(int id) {
		_qlvtCapPhepPhuHieu.setId(id);
	}

	/**
	* Returns the thong tin ho so ID of this q l v t cap phep phu hieu.
	*
	* @return the thong tin ho so ID of this q l v t cap phep phu hieu
	*/
	@Override
	public int getThongTinHoSoId() {
		return _qlvtCapPhepPhuHieu.getThongTinHoSoId();
	}

	/**
	* Sets the thong tin ho so ID of this q l v t cap phep phu hieu.
	*
	* @param thongTinHoSoId the thong tin ho so ID of this q l v t cap phep phu hieu
	*/
	@Override
	public void setThongTinHoSoId(int thongTinHoSoId) {
		_qlvtCapPhepPhuHieu.setThongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Returns the loai hinh kinh doanh ID of this q l v t cap phep phu hieu.
	*
	* @return the loai hinh kinh doanh ID of this q l v t cap phep phu hieu
	*/
	@Override
	public int getLoaiHinhKinhDoanhId() {
		return _qlvtCapPhepPhuHieu.getLoaiHinhKinhDoanhId();
	}

	/**
	* Sets the loai hinh kinh doanh ID of this q l v t cap phep phu hieu.
	*
	* @param loaiHinhKinhDoanhId the loai hinh kinh doanh ID of this q l v t cap phep phu hieu
	*/
	@Override
	public void setLoaiHinhKinhDoanhId(int loaiHinhKinhDoanhId) {
		_qlvtCapPhepPhuHieu.setLoaiHinhKinhDoanhId(loaiHinhKinhDoanhId);
	}

	/**
	* Returns the so phu hieu of this q l v t cap phep phu hieu.
	*
	* @return the so phu hieu of this q l v t cap phep phu hieu
	*/
	@Override
	public int getSoPhuHieu() {
		return _qlvtCapPhepPhuHieu.getSoPhuHieu();
	}

	/**
	* Sets the so phu hieu of this q l v t cap phep phu hieu.
	*
	* @param soPhuHieu the so phu hieu of this q l v t cap phep phu hieu
	*/
	@Override
	public void setSoPhuHieu(int soPhuHieu) {
		_qlvtCapPhepPhuHieu.setSoPhuHieu(soPhuHieu);
	}

	/**
	* Returns the co quan cap lan dau ID of this q l v t cap phep phu hieu.
	*
	* @return the co quan cap lan dau ID of this q l v t cap phep phu hieu
	*/
	@Override
	public int getCoQuanCapLanDauId() {
		return _qlvtCapPhepPhuHieu.getCoQuanCapLanDauId();
	}

	/**
	* Sets the co quan cap lan dau ID of this q l v t cap phep phu hieu.
	*
	* @param coQuanCapLanDauId the co quan cap lan dau ID of this q l v t cap phep phu hieu
	*/
	@Override
	public void setCoQuanCapLanDauId(int coQuanCapLanDauId) {
		_qlvtCapPhepPhuHieu.setCoQuanCapLanDauId(coQuanCapLanDauId);
	}

	/**
	* Returns the co quan cap phep ID of this q l v t cap phep phu hieu.
	*
	* @return the co quan cap phep ID of this q l v t cap phep phu hieu
	*/
	@Override
	public int getCoQuanCapPhepId() {
		return _qlvtCapPhepPhuHieu.getCoQuanCapPhepId();
	}

	/**
	* Sets the co quan cap phep ID of this q l v t cap phep phu hieu.
	*
	* @param CoQuanCapPhepId the co quan cap phep ID of this q l v t cap phep phu hieu
	*/
	@Override
	public void setCoQuanCapPhepId(int CoQuanCapPhepId) {
		_qlvtCapPhepPhuHieu.setCoQuanCapPhepId(CoQuanCapPhepId);
	}

	/**
	* Returns the ngay cap phu hieu of this q l v t cap phep phu hieu.
	*
	* @return the ngay cap phu hieu of this q l v t cap phep phu hieu
	*/
	@Override
	public java.util.Date getNgayCapPhuHieu() {
		return _qlvtCapPhepPhuHieu.getNgayCapPhuHieu();
	}

	/**
	* Sets the ngay cap phu hieu of this q l v t cap phep phu hieu.
	*
	* @param ngayCapPhuHieu the ngay cap phu hieu of this q l v t cap phep phu hieu
	*/
	@Override
	public void setNgayCapPhuHieu(java.util.Date ngayCapPhuHieu) {
		_qlvtCapPhepPhuHieu.setNgayCapPhuHieu(ngayCapPhuHieu);
	}

	/**
	* Returns the thoi han phu hieu of this q l v t cap phep phu hieu.
	*
	* @return the thoi han phu hieu of this q l v t cap phep phu hieu
	*/
	@Override
	public java.util.Date getThoiHanPhuHieu() {
		return _qlvtCapPhepPhuHieu.getThoiHanPhuHieu();
	}

	/**
	* Sets the thoi han phu hieu of this q l v t cap phep phu hieu.
	*
	* @param thoiHanPhuHieu the thoi han phu hieu of this q l v t cap phep phu hieu
	*/
	@Override
	public void setThoiHanPhuHieu(java.util.Date thoiHanPhuHieu) {
		_qlvtCapPhepPhuHieu.setThoiHanPhuHieu(thoiHanPhuHieu);
	}

	/**
	* Returns the noi san xuat of this q l v t cap phep phu hieu.
	*
	* @return the noi san xuat of this q l v t cap phep phu hieu
	*/
	@Override
	public java.lang.String getNoiSanXuat() {
		return _qlvtCapPhepPhuHieu.getNoiSanXuat();
	}

	/**
	* Sets the noi san xuat of this q l v t cap phep phu hieu.
	*
	* @param noiSanXuat the noi san xuat of this q l v t cap phep phu hieu
	*/
	@Override
	public void setNoiSanXuat(java.lang.String noiSanXuat) {
		_qlvtCapPhepPhuHieu.setNoiSanXuat(noiSanXuat);
	}

	/**
	* Returns the nam san xuat of this q l v t cap phep phu hieu.
	*
	* @return the nam san xuat of this q l v t cap phep phu hieu
	*/
	@Override
	public int getNamSanXuat() {
		return _qlvtCapPhepPhuHieu.getNamSanXuat();
	}

	/**
	* Sets the nam san xuat of this q l v t cap phep phu hieu.
	*
	* @param namSanXuat the nam san xuat of this q l v t cap phep phu hieu
	*/
	@Override
	public void setNamSanXuat(int namSanXuat) {
		_qlvtCapPhepPhuHieu.setNamSanXuat(namSanXuat);
	}

	/**
	* Returns the ma tuyen co dinh of this q l v t cap phep phu hieu.
	*
	* @return the ma tuyen co dinh of this q l v t cap phep phu hieu
	*/
	@Override
	public java.lang.String getMaTuyenCoDinh() {
		return _qlvtCapPhepPhuHieu.getMaTuyenCoDinh();
	}

	/**
	* Sets the ma tuyen co dinh of this q l v t cap phep phu hieu.
	*
	* @param maTuyenCoDinh the ma tuyen co dinh of this q l v t cap phep phu hieu
	*/
	@Override
	public void setMaTuyenCoDinh(java.lang.String maTuyenCoDinh) {
		_qlvtCapPhepPhuHieu.setMaTuyenCoDinh(maTuyenCoDinh);
	}

	/**
	* Returns the loai phu hieu of this q l v t cap phep phu hieu.
	*
	* @return the loai phu hieu of this q l v t cap phep phu hieu
	*/
	@Override
	public java.lang.String getLoaiPhuHieu() {
		return _qlvtCapPhepPhuHieu.getLoaiPhuHieu();
	}

	/**
	* Sets the loai phu hieu of this q l v t cap phep phu hieu.
	*
	* @param loaiPhuHieu the loai phu hieu of this q l v t cap phep phu hieu
	*/
	@Override
	public void setLoaiPhuHieu(java.lang.String loaiPhuHieu) {
		_qlvtCapPhepPhuHieu.setLoaiPhuHieu(loaiPhuHieu);
	}

	/**
	* Returns the lan gia han of this q l v t cap phep phu hieu.
	*
	* @return the lan gia han of this q l v t cap phep phu hieu
	*/
	@Override
	public int getLanGiaHan() {
		return _qlvtCapPhepPhuHieu.getLanGiaHan();
	}

	/**
	* Sets the lan gia han of this q l v t cap phep phu hieu.
	*
	* @param lanGiaHan the lan gia han of this q l v t cap phep phu hieu
	*/
	@Override
	public void setLanGiaHan(int lanGiaHan) {
		_qlvtCapPhepPhuHieu.setLanGiaHan(lanGiaHan);
	}

	/**
	* Returns the ngay cap lan dau of this q l v t cap phep phu hieu.
	*
	* @return the ngay cap lan dau of this q l v t cap phep phu hieu
	*/
	@Override
	public java.util.Date getNgayCapLanDau() {
		return _qlvtCapPhepPhuHieu.getNgayCapLanDau();
	}

	/**
	* Sets the ngay cap lan dau of this q l v t cap phep phu hieu.
	*
	* @param ngayCapLanDau the ngay cap lan dau of this q l v t cap phep phu hieu
	*/
	@Override
	public void setNgayCapLanDau(java.util.Date ngayCapLanDau) {
		_qlvtCapPhepPhuHieu.setNgayCapLanDau(ngayCapLanDau);
	}

	/**
	* Returns the ghi chu of this q l v t cap phep phu hieu.
	*
	* @return the ghi chu of this q l v t cap phep phu hieu
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _qlvtCapPhepPhuHieu.getGhiChu();
	}

	/**
	* Sets the ghi chu of this q l v t cap phep phu hieu.
	*
	* @param ghiChu the ghi chu of this q l v t cap phep phu hieu
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_qlvtCapPhepPhuHieu.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai of this q l v t cap phep phu hieu.
	*
	* @return the trang thai of this q l v t cap phep phu hieu
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _qlvtCapPhepPhuHieu.getTrangThai();
	}

	/**
	* Sets the trang thai of this q l v t cap phep phu hieu.
	*
	* @param trangThai the trang thai of this q l v t cap phep phu hieu
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_qlvtCapPhepPhuHieu.setTrangThai(trangThai);
	}

	/**
	* Returns the file ID of this q l v t cap phep phu hieu.
	*
	* @return the file ID of this q l v t cap phep phu hieu
	*/
	@Override
	public int getFileId() {
		return _qlvtCapPhepPhuHieu.getFileId();
	}

	/**
	* Sets the file ID of this q l v t cap phep phu hieu.
	*
	* @param fileId the file ID of this q l v t cap phep phu hieu
	*/
	@Override
	public void setFileId(int fileId) {
		_qlvtCapPhepPhuHieu.setFileId(fileId);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepPhuHieu.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepPhuHieu.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepPhuHieu.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepPhuHieu.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepPhuHieu.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepPhuHieu.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepPhuHieu.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepPhuHieu.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepPhuHieu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepPhuHieu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepPhuHieu.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTCapPhepPhuHieuWrapper((QLVTCapPhepPhuHieu)_qlvtCapPhepPhuHieu.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieu qlvtCapPhepPhuHieu) {
		return _qlvtCapPhepPhuHieu.compareTo(qlvtCapPhepPhuHieu);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepPhuHieu.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieu> toCacheModel() {
		return _qlvtCapPhepPhuHieu.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieu toEscapedModel() {
		return new QLVTCapPhepPhuHieuWrapper(_qlvtCapPhepPhuHieu.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieu toUnescapedModel() {
		return new QLVTCapPhepPhuHieuWrapper(_qlvtCapPhepPhuHieu.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepPhuHieu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepPhuHieu.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepPhuHieu.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTCapPhepPhuHieuWrapper)) {
			return false;
		}

		QLVTCapPhepPhuHieuWrapper qlvtCapPhepPhuHieuWrapper = (QLVTCapPhepPhuHieuWrapper)obj;

		if (Validator.equals(_qlvtCapPhepPhuHieu,
					qlvtCapPhepPhuHieuWrapper._qlvtCapPhepPhuHieu)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTCapPhepPhuHieu getWrappedQLVTCapPhepPhuHieu() {
		return _qlvtCapPhepPhuHieu;
	}

	@Override
	public QLVTCapPhepPhuHieu getWrappedModel() {
		return _qlvtCapPhepPhuHieu;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepPhuHieu.resetOriginalValues();
	}

	private QLVTCapPhepPhuHieu _qlvtCapPhepPhuHieu;
}