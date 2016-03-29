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
 * This class is a wrapper for {@link QLVTCapPhepBienHieu}.
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepBienHieu
 * @generated
 */
public class QLVTCapPhepBienHieuWrapper implements QLVTCapPhepBienHieu,
	ModelWrapper<QLVTCapPhepBienHieu> {
	public QLVTCapPhepBienHieuWrapper(QLVTCapPhepBienHieu qlvtCapPhepBienHieu) {
		_qlvtCapPhepBienHieu = qlvtCapPhepBienHieu;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTCapPhepBienHieu.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTCapPhepBienHieu.class.getName();
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
		attributes.put("maTuyenCoDinh", getMaTuyenCoDinh());
		attributes.put("linhVucKinhDoanhXeDuLich", getLinhVucKinhDoanhXeDuLich());
		attributes.put("doanhNghiepChoThue", getDoanhNghiepChoThue());
		attributes.put("thoiHanThue", getThoiHanThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("ngayCapLanDau", getNgayCapLanDau());
		attributes.put("lanGiaHan", getLanGiaHan());
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

		String maTuyenCoDinh = (String)attributes.get("maTuyenCoDinh");

		if (maTuyenCoDinh != null) {
			setMaTuyenCoDinh(maTuyenCoDinh);
		}

		String linhVucKinhDoanhXeDuLich = (String)attributes.get(
				"linhVucKinhDoanhXeDuLich");

		if (linhVucKinhDoanhXeDuLich != null) {
			setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
		}

		String doanhNghiepChoThue = (String)attributes.get("doanhNghiepChoThue");

		if (doanhNghiepChoThue != null) {
			setDoanhNghiepChoThue(doanhNghiepChoThue);
		}

		Date thoiHanThue = (Date)attributes.get("thoiHanThue");

		if (thoiHanThue != null) {
			setThoiHanThue(thoiHanThue);
		}

		Integer hopDongSauCung = (Integer)attributes.get("hopDongSauCung");

		if (hopDongSauCung != null) {
			setHopDongSauCung(hopDongSauCung);
		}

		Date ngayCapLanDau = (Date)attributes.get("ngayCapLanDau");

		if (ngayCapLanDau != null) {
			setNgayCapLanDau(ngayCapLanDau);
		}

		Integer lanGiaHan = (Integer)attributes.get("lanGiaHan");

		if (lanGiaHan != null) {
			setLanGiaHan(lanGiaHan);
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
	* Returns the primary key of this q l v t cap phep bien hieu.
	*
	* @return the primary key of this q l v t cap phep bien hieu
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtCapPhepBienHieu.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t cap phep bien hieu.
	*
	* @param primaryKey the primary key of this q l v t cap phep bien hieu
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtCapPhepBienHieu.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t cap phep bien hieu.
	*
	* @return the ID of this q l v t cap phep bien hieu
	*/
	@Override
	public int getId() {
		return _qlvtCapPhepBienHieu.getId();
	}

	/**
	* Sets the ID of this q l v t cap phep bien hieu.
	*
	* @param id the ID of this q l v t cap phep bien hieu
	*/
	@Override
	public void setId(int id) {
		_qlvtCapPhepBienHieu.setId(id);
	}

	/**
	* Returns the thong tin ho so ID of this q l v t cap phep bien hieu.
	*
	* @return the thong tin ho so ID of this q l v t cap phep bien hieu
	*/
	@Override
	public int getThongTinHoSoId() {
		return _qlvtCapPhepBienHieu.getThongTinHoSoId();
	}

	/**
	* Sets the thong tin ho so ID of this q l v t cap phep bien hieu.
	*
	* @param thongTinHoSoId the thong tin ho so ID of this q l v t cap phep bien hieu
	*/
	@Override
	public void setThongTinHoSoId(int thongTinHoSoId) {
		_qlvtCapPhepBienHieu.setThongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Returns the loai hinh kinh doanh ID of this q l v t cap phep bien hieu.
	*
	* @return the loai hinh kinh doanh ID of this q l v t cap phep bien hieu
	*/
	@Override
	public int getLoaiHinhKinhDoanhId() {
		return _qlvtCapPhepBienHieu.getLoaiHinhKinhDoanhId();
	}

	/**
	* Sets the loai hinh kinh doanh ID of this q l v t cap phep bien hieu.
	*
	* @param loaiHinhKinhDoanhId the loai hinh kinh doanh ID of this q l v t cap phep bien hieu
	*/
	@Override
	public void setLoaiHinhKinhDoanhId(int loaiHinhKinhDoanhId) {
		_qlvtCapPhepBienHieu.setLoaiHinhKinhDoanhId(loaiHinhKinhDoanhId);
	}

	/**
	* Returns the so phu hieu of this q l v t cap phep bien hieu.
	*
	* @return the so phu hieu of this q l v t cap phep bien hieu
	*/
	@Override
	public int getSoPhuHieu() {
		return _qlvtCapPhepBienHieu.getSoPhuHieu();
	}

	/**
	* Sets the so phu hieu of this q l v t cap phep bien hieu.
	*
	* @param soPhuHieu the so phu hieu of this q l v t cap phep bien hieu
	*/
	@Override
	public void setSoPhuHieu(int soPhuHieu) {
		_qlvtCapPhepBienHieu.setSoPhuHieu(soPhuHieu);
	}

	/**
	* Returns the co quan cap lan dau ID of this q l v t cap phep bien hieu.
	*
	* @return the co quan cap lan dau ID of this q l v t cap phep bien hieu
	*/
	@Override
	public int getCoQuanCapLanDauId() {
		return _qlvtCapPhepBienHieu.getCoQuanCapLanDauId();
	}

	/**
	* Sets the co quan cap lan dau ID of this q l v t cap phep bien hieu.
	*
	* @param coQuanCapLanDauId the co quan cap lan dau ID of this q l v t cap phep bien hieu
	*/
	@Override
	public void setCoQuanCapLanDauId(int coQuanCapLanDauId) {
		_qlvtCapPhepBienHieu.setCoQuanCapLanDauId(coQuanCapLanDauId);
	}

	/**
	* Returns the co quan cap phep ID of this q l v t cap phep bien hieu.
	*
	* @return the co quan cap phep ID of this q l v t cap phep bien hieu
	*/
	@Override
	public int getCoQuanCapPhepId() {
		return _qlvtCapPhepBienHieu.getCoQuanCapPhepId();
	}

	/**
	* Sets the co quan cap phep ID of this q l v t cap phep bien hieu.
	*
	* @param CoQuanCapPhepId the co quan cap phep ID of this q l v t cap phep bien hieu
	*/
	@Override
	public void setCoQuanCapPhepId(int CoQuanCapPhepId) {
		_qlvtCapPhepBienHieu.setCoQuanCapPhepId(CoQuanCapPhepId);
	}

	/**
	* Returns the ngay cap phu hieu of this q l v t cap phep bien hieu.
	*
	* @return the ngay cap phu hieu of this q l v t cap phep bien hieu
	*/
	@Override
	public java.util.Date getNgayCapPhuHieu() {
		return _qlvtCapPhepBienHieu.getNgayCapPhuHieu();
	}

	/**
	* Sets the ngay cap phu hieu of this q l v t cap phep bien hieu.
	*
	* @param ngayCapPhuHieu the ngay cap phu hieu of this q l v t cap phep bien hieu
	*/
	@Override
	public void setNgayCapPhuHieu(java.util.Date ngayCapPhuHieu) {
		_qlvtCapPhepBienHieu.setNgayCapPhuHieu(ngayCapPhuHieu);
	}

	/**
	* Returns the thoi han phu hieu of this q l v t cap phep bien hieu.
	*
	* @return the thoi han phu hieu of this q l v t cap phep bien hieu
	*/
	@Override
	public java.util.Date getThoiHanPhuHieu() {
		return _qlvtCapPhepBienHieu.getThoiHanPhuHieu();
	}

	/**
	* Sets the thoi han phu hieu of this q l v t cap phep bien hieu.
	*
	* @param thoiHanPhuHieu the thoi han phu hieu of this q l v t cap phep bien hieu
	*/
	@Override
	public void setThoiHanPhuHieu(java.util.Date thoiHanPhuHieu) {
		_qlvtCapPhepBienHieu.setThoiHanPhuHieu(thoiHanPhuHieu);
	}

	/**
	* Returns the ma tuyen co dinh of this q l v t cap phep bien hieu.
	*
	* @return the ma tuyen co dinh of this q l v t cap phep bien hieu
	*/
	@Override
	public java.lang.String getMaTuyenCoDinh() {
		return _qlvtCapPhepBienHieu.getMaTuyenCoDinh();
	}

	/**
	* Sets the ma tuyen co dinh of this q l v t cap phep bien hieu.
	*
	* @param maTuyenCoDinh the ma tuyen co dinh of this q l v t cap phep bien hieu
	*/
	@Override
	public void setMaTuyenCoDinh(java.lang.String maTuyenCoDinh) {
		_qlvtCapPhepBienHieu.setMaTuyenCoDinh(maTuyenCoDinh);
	}

	/**
	* Returns the linh vuc kinh doanh xe du lich of this q l v t cap phep bien hieu.
	*
	* @return the linh vuc kinh doanh xe du lich of this q l v t cap phep bien hieu
	*/
	@Override
	public java.lang.String getLinhVucKinhDoanhXeDuLich() {
		return _qlvtCapPhepBienHieu.getLinhVucKinhDoanhXeDuLich();
	}

	/**
	* Sets the linh vuc kinh doanh xe du lich of this q l v t cap phep bien hieu.
	*
	* @param linhVucKinhDoanhXeDuLich the linh vuc kinh doanh xe du lich of this q l v t cap phep bien hieu
	*/
	@Override
	public void setLinhVucKinhDoanhXeDuLich(
		java.lang.String linhVucKinhDoanhXeDuLich) {
		_qlvtCapPhepBienHieu.setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
	}

	/**
	* Returns the doanh nghiep cho thue of this q l v t cap phep bien hieu.
	*
	* @return the doanh nghiep cho thue of this q l v t cap phep bien hieu
	*/
	@Override
	public java.lang.String getDoanhNghiepChoThue() {
		return _qlvtCapPhepBienHieu.getDoanhNghiepChoThue();
	}

	/**
	* Sets the doanh nghiep cho thue of this q l v t cap phep bien hieu.
	*
	* @param doanhNghiepChoThue the doanh nghiep cho thue of this q l v t cap phep bien hieu
	*/
	@Override
	public void setDoanhNghiepChoThue(java.lang.String doanhNghiepChoThue) {
		_qlvtCapPhepBienHieu.setDoanhNghiepChoThue(doanhNghiepChoThue);
	}

	/**
	* Returns the thoi han thue of this q l v t cap phep bien hieu.
	*
	* @return the thoi han thue of this q l v t cap phep bien hieu
	*/
	@Override
	public java.util.Date getThoiHanThue() {
		return _qlvtCapPhepBienHieu.getThoiHanThue();
	}

	/**
	* Sets the thoi han thue of this q l v t cap phep bien hieu.
	*
	* @param thoiHanThue the thoi han thue of this q l v t cap phep bien hieu
	*/
	@Override
	public void setThoiHanThue(java.util.Date thoiHanThue) {
		_qlvtCapPhepBienHieu.setThoiHanThue(thoiHanThue);
	}

	/**
	* Returns the hop dong sau cung of this q l v t cap phep bien hieu.
	*
	* @return the hop dong sau cung of this q l v t cap phep bien hieu
	*/
	@Override
	public int getHopDongSauCung() {
		return _qlvtCapPhepBienHieu.getHopDongSauCung();
	}

	/**
	* Sets the hop dong sau cung of this q l v t cap phep bien hieu.
	*
	* @param hopDongSauCung the hop dong sau cung of this q l v t cap phep bien hieu
	*/
	@Override
	public void setHopDongSauCung(int hopDongSauCung) {
		_qlvtCapPhepBienHieu.setHopDongSauCung(hopDongSauCung);
	}

	/**
	* Returns the ngay cap lan dau of this q l v t cap phep bien hieu.
	*
	* @return the ngay cap lan dau of this q l v t cap phep bien hieu
	*/
	@Override
	public java.util.Date getNgayCapLanDau() {
		return _qlvtCapPhepBienHieu.getNgayCapLanDau();
	}

	/**
	* Sets the ngay cap lan dau of this q l v t cap phep bien hieu.
	*
	* @param ngayCapLanDau the ngay cap lan dau of this q l v t cap phep bien hieu
	*/
	@Override
	public void setNgayCapLanDau(java.util.Date ngayCapLanDau) {
		_qlvtCapPhepBienHieu.setNgayCapLanDau(ngayCapLanDau);
	}

	/**
	* Returns the lan gia han of this q l v t cap phep bien hieu.
	*
	* @return the lan gia han of this q l v t cap phep bien hieu
	*/
	@Override
	public int getLanGiaHan() {
		return _qlvtCapPhepBienHieu.getLanGiaHan();
	}

	/**
	* Sets the lan gia han of this q l v t cap phep bien hieu.
	*
	* @param lanGiaHan the lan gia han of this q l v t cap phep bien hieu
	*/
	@Override
	public void setLanGiaHan(int lanGiaHan) {
		_qlvtCapPhepBienHieu.setLanGiaHan(lanGiaHan);
	}

	/**
	* Returns the ghi chu of this q l v t cap phep bien hieu.
	*
	* @return the ghi chu of this q l v t cap phep bien hieu
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _qlvtCapPhepBienHieu.getGhiChu();
	}

	/**
	* Sets the ghi chu of this q l v t cap phep bien hieu.
	*
	* @param ghiChu the ghi chu of this q l v t cap phep bien hieu
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_qlvtCapPhepBienHieu.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai of this q l v t cap phep bien hieu.
	*
	* @return the trang thai of this q l v t cap phep bien hieu
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _qlvtCapPhepBienHieu.getTrangThai();
	}

	/**
	* Sets the trang thai of this q l v t cap phep bien hieu.
	*
	* @param trangThai the trang thai of this q l v t cap phep bien hieu
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_qlvtCapPhepBienHieu.setTrangThai(trangThai);
	}

	/**
	* Returns the file ID of this q l v t cap phep bien hieu.
	*
	* @return the file ID of this q l v t cap phep bien hieu
	*/
	@Override
	public int getFileId() {
		return _qlvtCapPhepBienHieu.getFileId();
	}

	/**
	* Sets the file ID of this q l v t cap phep bien hieu.
	*
	* @param fileId the file ID of this q l v t cap phep bien hieu
	*/
	@Override
	public void setFileId(int fileId) {
		_qlvtCapPhepBienHieu.setFileId(fileId);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepBienHieu.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepBienHieu.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepBienHieu.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepBienHieu.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepBienHieu.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepBienHieu.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepBienHieu.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepBienHieu.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepBienHieu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepBienHieu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepBienHieu.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTCapPhepBienHieuWrapper((QLVTCapPhepBienHieu)_qlvtCapPhepBienHieu.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu qlvtCapPhepBienHieu) {
		return _qlvtCapPhepBienHieu.compareTo(qlvtCapPhepBienHieu);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepBienHieu.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu> toCacheModel() {
		return _qlvtCapPhepBienHieu.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu toEscapedModel() {
		return new QLVTCapPhepBienHieuWrapper(_qlvtCapPhepBienHieu.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu toUnescapedModel() {
		return new QLVTCapPhepBienHieuWrapper(_qlvtCapPhepBienHieu.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepBienHieu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepBienHieu.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepBienHieu.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTCapPhepBienHieuWrapper)) {
			return false;
		}

		QLVTCapPhepBienHieuWrapper qlvtCapPhepBienHieuWrapper = (QLVTCapPhepBienHieuWrapper)obj;

		if (Validator.equals(_qlvtCapPhepBienHieu,
					qlvtCapPhepBienHieuWrapper._qlvtCapPhepBienHieu)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTCapPhepBienHieu getWrappedQLVTCapPhepBienHieu() {
		return _qlvtCapPhepBienHieu;
	}

	@Override
	public QLVTCapPhepBienHieu getWrappedModel() {
		return _qlvtCapPhepBienHieu;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepBienHieu.resetOriginalValues();
	}

	private QLVTCapPhepBienHieu _qlvtCapPhepBienHieu;
}