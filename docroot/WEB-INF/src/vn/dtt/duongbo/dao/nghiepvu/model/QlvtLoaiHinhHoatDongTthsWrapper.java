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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtLoaiHinhHoatDongTths}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtLoaiHinhHoatDongTths
 * @generated
 */
public class QlvtLoaiHinhHoatDongTthsWrapper implements QlvtLoaiHinhHoatDongTths,
	ModelWrapper<QlvtLoaiHinhHoatDongTths> {
	public QlvtLoaiHinhHoatDongTthsWrapper(
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths) {
		_qlvtLoaiHinhHoatDongTths = qlvtLoaiHinhHoatDongTths;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtLoaiHinhHoatDongTths.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtLoaiHinhHoatDongTths.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maLoaiHinhHoatDong", getMaLoaiHinhHoatDong());
		attributes.put("thongTinHoSoId", getThongTinHoSoId());
		attributes.put("soLuongPhuongTien", getSoLuongPhuongTien());
		attributes.put("thietBiGiamSatHanhTrinh", getThietBiGiamSatHanhTrinh());
		attributes.put("tuyenTu", getTuyenTu());
		attributes.put("tuyenDen", getTuyenDen());
		attributes.put("soChuyen", getSoChuyen());
		attributes.put("mauSon", getMauSon());
		attributes.put("loaiHinhKinhDoanhCuThe", getLoaiHinhKinhDoanhCuThe());
		attributes.put("danhGia", getDanhGia());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maLoaiHinhHoatDong = (String)attributes.get("maLoaiHinhHoatDong");

		if (maLoaiHinhHoatDong != null) {
			setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
		}

		Long thongTinHoSoId = (Long)attributes.get("thongTinHoSoId");

		if (thongTinHoSoId != null) {
			setThongTinHoSoId(thongTinHoSoId);
		}

		Integer soLuongPhuongTien = (Integer)attributes.get("soLuongPhuongTien");

		if (soLuongPhuongTien != null) {
			setSoLuongPhuongTien(soLuongPhuongTien);
		}

		Integer thietBiGiamSatHanhTrinh = (Integer)attributes.get(
				"thietBiGiamSatHanhTrinh");

		if (thietBiGiamSatHanhTrinh != null) {
			setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
		}

		String tuyenTu = (String)attributes.get("tuyenTu");

		if (tuyenTu != null) {
			setTuyenTu(tuyenTu);
		}

		String tuyenDen = (String)attributes.get("tuyenDen");

		if (tuyenDen != null) {
			setTuyenDen(tuyenDen);
		}

		Long soChuyen = (Long)attributes.get("soChuyen");

		if (soChuyen != null) {
			setSoChuyen(soChuyen);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		String loaiHinhKinhDoanhCuThe = (String)attributes.get(
				"loaiHinhKinhDoanhCuThe");

		if (loaiHinhKinhDoanhCuThe != null) {
			setLoaiHinhKinhDoanhCuThe(loaiHinhKinhDoanhCuThe);
		}

		Integer danhGia = (Integer)attributes.get("danhGia");

		if (danhGia != null) {
			setDanhGia(danhGia);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}
	}

	/**
	* Returns the primary key of this qlvt loai hinh hoat dong tths.
	*
	* @return the primary key of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtLoaiHinhHoatDongTths.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt loai hinh hoat dong tths.
	*
	* @param primaryKey the primary key of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtLoaiHinhHoatDongTths.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt loai hinh hoat dong tths.
	*
	* @return the ID of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public long getId() {
		return _qlvtLoaiHinhHoatDongTths.getId();
	}

	/**
	* Sets the ID of this qlvt loai hinh hoat dong tths.
	*
	* @param id the ID of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setId(long id) {
		_qlvtLoaiHinhHoatDongTths.setId(id);
	}

	/**
	* Returns the ma loai hinh hoat dong of this qlvt loai hinh hoat dong tths.
	*
	* @return the ma loai hinh hoat dong of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public java.lang.String getMaLoaiHinhHoatDong() {
		return _qlvtLoaiHinhHoatDongTths.getMaLoaiHinhHoatDong();
	}

	/**
	* Sets the ma loai hinh hoat dong of this qlvt loai hinh hoat dong tths.
	*
	* @param maLoaiHinhHoatDong the ma loai hinh hoat dong of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setMaLoaiHinhHoatDong(java.lang.String maLoaiHinhHoatDong) {
		_qlvtLoaiHinhHoatDongTths.setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
	}

	/**
	* Returns the thong tin ho so ID of this qlvt loai hinh hoat dong tths.
	*
	* @return the thong tin ho so ID of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public long getThongTinHoSoId() {
		return _qlvtLoaiHinhHoatDongTths.getThongTinHoSoId();
	}

	/**
	* Sets the thong tin ho so ID of this qlvt loai hinh hoat dong tths.
	*
	* @param thongTinHoSoId the thong tin ho so ID of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setThongTinHoSoId(long thongTinHoSoId) {
		_qlvtLoaiHinhHoatDongTths.setThongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Returns the so luong phuong tien of this qlvt loai hinh hoat dong tths.
	*
	* @return the so luong phuong tien of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public int getSoLuongPhuongTien() {
		return _qlvtLoaiHinhHoatDongTths.getSoLuongPhuongTien();
	}

	/**
	* Sets the so luong phuong tien of this qlvt loai hinh hoat dong tths.
	*
	* @param soLuongPhuongTien the so luong phuong tien of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setSoLuongPhuongTien(int soLuongPhuongTien) {
		_qlvtLoaiHinhHoatDongTths.setSoLuongPhuongTien(soLuongPhuongTien);
	}

	/**
	* Returns the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong tths.
	*
	* @return the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public int getThietBiGiamSatHanhTrinh() {
		return _qlvtLoaiHinhHoatDongTths.getThietBiGiamSatHanhTrinh();
	}

	/**
	* Sets the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong tths.
	*
	* @param thietBiGiamSatHanhTrinh the thiet bi giam sat hanh trinh of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setThietBiGiamSatHanhTrinh(int thietBiGiamSatHanhTrinh) {
		_qlvtLoaiHinhHoatDongTths.setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
	}

	/**
	* Returns the tuyen tu of this qlvt loai hinh hoat dong tths.
	*
	* @return the tuyen tu of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public java.lang.String getTuyenTu() {
		return _qlvtLoaiHinhHoatDongTths.getTuyenTu();
	}

	/**
	* Sets the tuyen tu of this qlvt loai hinh hoat dong tths.
	*
	* @param tuyenTu the tuyen tu of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setTuyenTu(java.lang.String tuyenTu) {
		_qlvtLoaiHinhHoatDongTths.setTuyenTu(tuyenTu);
	}

	/**
	* Returns the tuyen den of this qlvt loai hinh hoat dong tths.
	*
	* @return the tuyen den of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public java.lang.String getTuyenDen() {
		return _qlvtLoaiHinhHoatDongTths.getTuyenDen();
	}

	/**
	* Sets the tuyen den of this qlvt loai hinh hoat dong tths.
	*
	* @param tuyenDen the tuyen den of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setTuyenDen(java.lang.String tuyenDen) {
		_qlvtLoaiHinhHoatDongTths.setTuyenDen(tuyenDen);
	}

	/**
	* Returns the so chuyen of this qlvt loai hinh hoat dong tths.
	*
	* @return the so chuyen of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public long getSoChuyen() {
		return _qlvtLoaiHinhHoatDongTths.getSoChuyen();
	}

	/**
	* Sets the so chuyen of this qlvt loai hinh hoat dong tths.
	*
	* @param soChuyen the so chuyen of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setSoChuyen(long soChuyen) {
		_qlvtLoaiHinhHoatDongTths.setSoChuyen(soChuyen);
	}

	/**
	* Returns the mau son of this qlvt loai hinh hoat dong tths.
	*
	* @return the mau son of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtLoaiHinhHoatDongTths.getMauSon();
	}

	/**
	* Sets the mau son of this qlvt loai hinh hoat dong tths.
	*
	* @param mauSon the mau son of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setMauSon(java.lang.String mauSon) {
		_qlvtLoaiHinhHoatDongTths.setMauSon(mauSon);
	}

	/**
	* Returns the loai hinh kinh doanh cu the of this qlvt loai hinh hoat dong tths.
	*
	* @return the loai hinh kinh doanh cu the of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public java.lang.String getLoaiHinhKinhDoanhCuThe() {
		return _qlvtLoaiHinhHoatDongTths.getLoaiHinhKinhDoanhCuThe();
	}

	/**
	* Sets the loai hinh kinh doanh cu the of this qlvt loai hinh hoat dong tths.
	*
	* @param loaiHinhKinhDoanhCuThe the loai hinh kinh doanh cu the of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setLoaiHinhKinhDoanhCuThe(
		java.lang.String loaiHinhKinhDoanhCuThe) {
		_qlvtLoaiHinhHoatDongTths.setLoaiHinhKinhDoanhCuThe(loaiHinhKinhDoanhCuThe);
	}

	/**
	* Returns the danh gia of this qlvt loai hinh hoat dong tths.
	*
	* @return the danh gia of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public int getDanhGia() {
		return _qlvtLoaiHinhHoatDongTths.getDanhGia();
	}

	/**
	* Sets the danh gia of this qlvt loai hinh hoat dong tths.
	*
	* @param danhGia the danh gia of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setDanhGia(int danhGia) {
		_qlvtLoaiHinhHoatDongTths.setDanhGia(danhGia);
	}

	/**
	* Returns the ly do khong dat of this qlvt loai hinh hoat dong tths.
	*
	* @return the ly do khong dat of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtLoaiHinhHoatDongTths.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this qlvt loai hinh hoat dong tths.
	*
	* @param lyDoKhongDat the ly do khong dat of this qlvt loai hinh hoat dong tths
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtLoaiHinhHoatDongTths.setLyDoKhongDat(lyDoKhongDat);
	}

	@Override
	public boolean isNew() {
		return _qlvtLoaiHinhHoatDongTths.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtLoaiHinhHoatDongTths.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtLoaiHinhHoatDongTths.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtLoaiHinhHoatDongTths.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtLoaiHinhHoatDongTths.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtLoaiHinhHoatDongTths.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtLoaiHinhHoatDongTths.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtLoaiHinhHoatDongTths.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtLoaiHinhHoatDongTths.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtLoaiHinhHoatDongTths.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtLoaiHinhHoatDongTths.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtLoaiHinhHoatDongTthsWrapper((QlvtLoaiHinhHoatDongTths)_qlvtLoaiHinhHoatDongTths.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths) {
		return _qlvtLoaiHinhHoatDongTths.compareTo(qlvtLoaiHinhHoatDongTths);
	}

	@Override
	public int hashCode() {
		return _qlvtLoaiHinhHoatDongTths.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> toCacheModel() {
		return _qlvtLoaiHinhHoatDongTths.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths toEscapedModel() {
		return new QlvtLoaiHinhHoatDongTthsWrapper(_qlvtLoaiHinhHoatDongTths.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths toUnescapedModel() {
		return new QlvtLoaiHinhHoatDongTthsWrapper(_qlvtLoaiHinhHoatDongTths.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtLoaiHinhHoatDongTths.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtLoaiHinhHoatDongTths.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtLoaiHinhHoatDongTths.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtLoaiHinhHoatDongTthsWrapper)) {
			return false;
		}

		QlvtLoaiHinhHoatDongTthsWrapper qlvtLoaiHinhHoatDongTthsWrapper = (QlvtLoaiHinhHoatDongTthsWrapper)obj;

		if (Validator.equals(_qlvtLoaiHinhHoatDongTths,
					qlvtLoaiHinhHoatDongTthsWrapper._qlvtLoaiHinhHoatDongTths)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtLoaiHinhHoatDongTths getWrappedQlvtLoaiHinhHoatDongTths() {
		return _qlvtLoaiHinhHoatDongTths;
	}

	@Override
	public QlvtLoaiHinhHoatDongTths getWrappedModel() {
		return _qlvtLoaiHinhHoatDongTths;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtLoaiHinhHoatDongTths.resetOriginalValues();
	}

	private QlvtLoaiHinhHoatDongTths _qlvtLoaiHinhHoatDongTths;
}