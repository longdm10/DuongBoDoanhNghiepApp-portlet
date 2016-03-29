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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtCapPhepGpLienVan}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGpLienVan
 * @generated
 */
public class QlvtCapPhepGpLienVanWrapper implements QlvtCapPhepGpLienVan,
	ModelWrapper<QlvtCapPhepGpLienVan> {
	public QlvtCapPhepGpLienVanWrapper(
		QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan) {
		_qlvtCapPhepGpLienVan = qlvtCapPhepGpLienVan;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepGpLienVan.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepGpLienVan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("gpkdvtVietLaoId", getGpkdvtVietLaoId());
		attributes.put("loaiCapPhep", getLoaiCapPhep());
		attributes.put("loaiGiayPhepLienVan", getLoaiGiayPhepLienVan());
		attributes.put("soGiayPhepLienVan", getSoGiayPhepLienVan());
		attributes.put("ngayCapGplv", getNgayCapGplv());
		attributes.put("ngayHetHanGplv", getNgayHetHanGplv());
		attributes.put("coQuanCpLienVan", getCoQuanCpLienVan());
		attributes.put("soCongVanChapThuanTCD", getSoCongVanChapThuanTCD());
		attributes.put("ngayCongVanChapThuanTCD", getNgayCongVanChapThuanTCD());
		attributes.put("tuyenTu", getTuyenTu());
		attributes.put("tuyenDi", getTuyenDi());
		attributes.put("cuLy", getCuLy());
		attributes.put("maBenDi", getMaBenDi());
		attributes.put("maBenDen", getMaBenDen());
		attributes.put("maTinhDi", getMaTinhDi());
		attributes.put("maTinhDen", getMaTinhDen());
		attributes.put("hanhTrinh", getHanhTrinh());
		attributes.put("mucPhi", getMucPhi());
		attributes.put("mucDichChuyenDi", getMucDichChuyenDi());
		attributes.put("fileId", getFileId());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long gpkdvtVietLaoId = (Long)attributes.get("gpkdvtVietLaoId");

		if (gpkdvtVietLaoId != null) {
			setGpkdvtVietLaoId(gpkdvtVietLaoId);
		}

		String loaiCapPhep = (String)attributes.get("loaiCapPhep");

		if (loaiCapPhep != null) {
			setLoaiCapPhep(loaiCapPhep);
		}

		String loaiGiayPhepLienVan = (String)attributes.get(
				"loaiGiayPhepLienVan");

		if (loaiGiayPhepLienVan != null) {
			setLoaiGiayPhepLienVan(loaiGiayPhepLienVan);
		}

		String soGiayPhepLienVan = (String)attributes.get("soGiayPhepLienVan");

		if (soGiayPhepLienVan != null) {
			setSoGiayPhepLienVan(soGiayPhepLienVan);
		}

		Date ngayCapGplv = (Date)attributes.get("ngayCapGplv");

		if (ngayCapGplv != null) {
			setNgayCapGplv(ngayCapGplv);
		}

		Date ngayHetHanGplv = (Date)attributes.get("ngayHetHanGplv");

		if (ngayHetHanGplv != null) {
			setNgayHetHanGplv(ngayHetHanGplv);
		}

		String coQuanCpLienVan = (String)attributes.get("coQuanCpLienVan");

		if (coQuanCpLienVan != null) {
			setCoQuanCpLienVan(coQuanCpLienVan);
		}

		String soCongVanChapThuanTCD = (String)attributes.get(
				"soCongVanChapThuanTCD");

		if (soCongVanChapThuanTCD != null) {
			setSoCongVanChapThuanTCD(soCongVanChapThuanTCD);
		}

		Date ngayCongVanChapThuanTCD = (Date)attributes.get(
				"ngayCongVanChapThuanTCD");

		if (ngayCongVanChapThuanTCD != null) {
			setNgayCongVanChapThuanTCD(ngayCongVanChapThuanTCD);
		}

		String tuyenTu = (String)attributes.get("tuyenTu");

		if (tuyenTu != null) {
			setTuyenTu(tuyenTu);
		}

		String tuyenDi = (String)attributes.get("tuyenDi");

		if (tuyenDi != null) {
			setTuyenDi(tuyenDi);
		}

		String cuLy = (String)attributes.get("cuLy");

		if (cuLy != null) {
			setCuLy(cuLy);
		}

		String maBenDi = (String)attributes.get("maBenDi");

		if (maBenDi != null) {
			setMaBenDi(maBenDi);
		}

		String maBenDen = (String)attributes.get("maBenDen");

		if (maBenDen != null) {
			setMaBenDen(maBenDen);
		}

		String maTinhDi = (String)attributes.get("maTinhDi");

		if (maTinhDi != null) {
			setMaTinhDi(maTinhDi);
		}

		String maTinhDen = (String)attributes.get("maTinhDen");

		if (maTinhDen != null) {
			setMaTinhDen(maTinhDen);
		}

		String hanhTrinh = (String)attributes.get("hanhTrinh");

		if (hanhTrinh != null) {
			setHanhTrinh(hanhTrinh);
		}

		String mucPhi = (String)attributes.get("mucPhi");

		if (mucPhi != null) {
			setMucPhi(mucPhi);
		}

		String mucDichChuyenDi = (String)attributes.get("mucDichChuyenDi");

		if (mucDichChuyenDi != null) {
			setMucDichChuyenDi(mucDichChuyenDi);
		}

		Long fileId = (Long)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	/**
	* Returns the primary key of this qlvt cap phep gp lien van.
	*
	* @return the primary key of this qlvt cap phep gp lien van
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtCapPhepGpLienVan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt cap phep gp lien van.
	*
	* @param primaryKey the primary key of this qlvt cap phep gp lien van
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtCapPhepGpLienVan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt cap phep gp lien van.
	*
	* @return the ID of this qlvt cap phep gp lien van
	*/
	@Override
	public long getId() {
		return _qlvtCapPhepGpLienVan.getId();
	}

	/**
	* Sets the ID of this qlvt cap phep gp lien van.
	*
	* @param id the ID of this qlvt cap phep gp lien van
	*/
	@Override
	public void setId(long id) {
		_qlvtCapPhepGpLienVan.setId(id);
	}

	/**
	* Returns the gpkdvt viet lao ID of this qlvt cap phep gp lien van.
	*
	* @return the gpkdvt viet lao ID of this qlvt cap phep gp lien van
	*/
	@Override
	public long getGpkdvtVietLaoId() {
		return _qlvtCapPhepGpLienVan.getGpkdvtVietLaoId();
	}

	/**
	* Sets the gpkdvt viet lao ID of this qlvt cap phep gp lien van.
	*
	* @param gpkdvtVietLaoId the gpkdvt viet lao ID of this qlvt cap phep gp lien van
	*/
	@Override
	public void setGpkdvtVietLaoId(long gpkdvtVietLaoId) {
		_qlvtCapPhepGpLienVan.setGpkdvtVietLaoId(gpkdvtVietLaoId);
	}

	/**
	* Returns the loai cap phep of this qlvt cap phep gp lien van.
	*
	* @return the loai cap phep of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getLoaiCapPhep() {
		return _qlvtCapPhepGpLienVan.getLoaiCapPhep();
	}

	/**
	* Sets the loai cap phep of this qlvt cap phep gp lien van.
	*
	* @param loaiCapPhep the loai cap phep of this qlvt cap phep gp lien van
	*/
	@Override
	public void setLoaiCapPhep(java.lang.String loaiCapPhep) {
		_qlvtCapPhepGpLienVan.setLoaiCapPhep(loaiCapPhep);
	}

	/**
	* Returns the loai giay phep lien van of this qlvt cap phep gp lien van.
	*
	* @return the loai giay phep lien van of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getLoaiGiayPhepLienVan() {
		return _qlvtCapPhepGpLienVan.getLoaiGiayPhepLienVan();
	}

	/**
	* Sets the loai giay phep lien van of this qlvt cap phep gp lien van.
	*
	* @param loaiGiayPhepLienVan the loai giay phep lien van of this qlvt cap phep gp lien van
	*/
	@Override
	public void setLoaiGiayPhepLienVan(java.lang.String loaiGiayPhepLienVan) {
		_qlvtCapPhepGpLienVan.setLoaiGiayPhepLienVan(loaiGiayPhepLienVan);
	}

	/**
	* Returns the so giay phep lien van of this qlvt cap phep gp lien van.
	*
	* @return the so giay phep lien van of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getSoGiayPhepLienVan() {
		return _qlvtCapPhepGpLienVan.getSoGiayPhepLienVan();
	}

	/**
	* Sets the so giay phep lien van of this qlvt cap phep gp lien van.
	*
	* @param soGiayPhepLienVan the so giay phep lien van of this qlvt cap phep gp lien van
	*/
	@Override
	public void setSoGiayPhepLienVan(java.lang.String soGiayPhepLienVan) {
		_qlvtCapPhepGpLienVan.setSoGiayPhepLienVan(soGiayPhepLienVan);
	}

	/**
	* Returns the ngay cap gplv of this qlvt cap phep gp lien van.
	*
	* @return the ngay cap gplv of this qlvt cap phep gp lien van
	*/
	@Override
	public java.util.Date getNgayCapGplv() {
		return _qlvtCapPhepGpLienVan.getNgayCapGplv();
	}

	/**
	* Sets the ngay cap gplv of this qlvt cap phep gp lien van.
	*
	* @param ngayCapGplv the ngay cap gplv of this qlvt cap phep gp lien van
	*/
	@Override
	public void setNgayCapGplv(java.util.Date ngayCapGplv) {
		_qlvtCapPhepGpLienVan.setNgayCapGplv(ngayCapGplv);
	}

	/**
	* Returns the ngay het han gplv of this qlvt cap phep gp lien van.
	*
	* @return the ngay het han gplv of this qlvt cap phep gp lien van
	*/
	@Override
	public java.util.Date getNgayHetHanGplv() {
		return _qlvtCapPhepGpLienVan.getNgayHetHanGplv();
	}

	/**
	* Sets the ngay het han gplv of this qlvt cap phep gp lien van.
	*
	* @param ngayHetHanGplv the ngay het han gplv of this qlvt cap phep gp lien van
	*/
	@Override
	public void setNgayHetHanGplv(java.util.Date ngayHetHanGplv) {
		_qlvtCapPhepGpLienVan.setNgayHetHanGplv(ngayHetHanGplv);
	}

	/**
	* Returns the co quan cp lien van of this qlvt cap phep gp lien van.
	*
	* @return the co quan cp lien van of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getCoQuanCpLienVan() {
		return _qlvtCapPhepGpLienVan.getCoQuanCpLienVan();
	}

	/**
	* Sets the co quan cp lien van of this qlvt cap phep gp lien van.
	*
	* @param coQuanCpLienVan the co quan cp lien van of this qlvt cap phep gp lien van
	*/
	@Override
	public void setCoQuanCpLienVan(java.lang.String coQuanCpLienVan) {
		_qlvtCapPhepGpLienVan.setCoQuanCpLienVan(coQuanCpLienVan);
	}

	/**
	* Returns the so cong van chap thuan t c d of this qlvt cap phep gp lien van.
	*
	* @return the so cong van chap thuan t c d of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getSoCongVanChapThuanTCD() {
		return _qlvtCapPhepGpLienVan.getSoCongVanChapThuanTCD();
	}

	/**
	* Sets the so cong van chap thuan t c d of this qlvt cap phep gp lien van.
	*
	* @param soCongVanChapThuanTCD the so cong van chap thuan t c d of this qlvt cap phep gp lien van
	*/
	@Override
	public void setSoCongVanChapThuanTCD(java.lang.String soCongVanChapThuanTCD) {
		_qlvtCapPhepGpLienVan.setSoCongVanChapThuanTCD(soCongVanChapThuanTCD);
	}

	/**
	* Returns the ngay cong van chap thuan t c d of this qlvt cap phep gp lien van.
	*
	* @return the ngay cong van chap thuan t c d of this qlvt cap phep gp lien van
	*/
	@Override
	public java.util.Date getNgayCongVanChapThuanTCD() {
		return _qlvtCapPhepGpLienVan.getNgayCongVanChapThuanTCD();
	}

	/**
	* Sets the ngay cong van chap thuan t c d of this qlvt cap phep gp lien van.
	*
	* @param ngayCongVanChapThuanTCD the ngay cong van chap thuan t c d of this qlvt cap phep gp lien van
	*/
	@Override
	public void setNgayCongVanChapThuanTCD(
		java.util.Date ngayCongVanChapThuanTCD) {
		_qlvtCapPhepGpLienVan.setNgayCongVanChapThuanTCD(ngayCongVanChapThuanTCD);
	}

	/**
	* Returns the tuyen tu of this qlvt cap phep gp lien van.
	*
	* @return the tuyen tu of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getTuyenTu() {
		return _qlvtCapPhepGpLienVan.getTuyenTu();
	}

	/**
	* Sets the tuyen tu of this qlvt cap phep gp lien van.
	*
	* @param tuyenTu the tuyen tu of this qlvt cap phep gp lien van
	*/
	@Override
	public void setTuyenTu(java.lang.String tuyenTu) {
		_qlvtCapPhepGpLienVan.setTuyenTu(tuyenTu);
	}

	/**
	* Returns the tuyen di of this qlvt cap phep gp lien van.
	*
	* @return the tuyen di of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getTuyenDi() {
		return _qlvtCapPhepGpLienVan.getTuyenDi();
	}

	/**
	* Sets the tuyen di of this qlvt cap phep gp lien van.
	*
	* @param tuyenDi the tuyen di of this qlvt cap phep gp lien van
	*/
	@Override
	public void setTuyenDi(java.lang.String tuyenDi) {
		_qlvtCapPhepGpLienVan.setTuyenDi(tuyenDi);
	}

	/**
	* Returns the cu ly of this qlvt cap phep gp lien van.
	*
	* @return the cu ly of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getCuLy() {
		return _qlvtCapPhepGpLienVan.getCuLy();
	}

	/**
	* Sets the cu ly of this qlvt cap phep gp lien van.
	*
	* @param cuLy the cu ly of this qlvt cap phep gp lien van
	*/
	@Override
	public void setCuLy(java.lang.String cuLy) {
		_qlvtCapPhepGpLienVan.setCuLy(cuLy);
	}

	/**
	* Returns the ma ben di of this qlvt cap phep gp lien van.
	*
	* @return the ma ben di of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getMaBenDi() {
		return _qlvtCapPhepGpLienVan.getMaBenDi();
	}

	/**
	* Sets the ma ben di of this qlvt cap phep gp lien van.
	*
	* @param maBenDi the ma ben di of this qlvt cap phep gp lien van
	*/
	@Override
	public void setMaBenDi(java.lang.String maBenDi) {
		_qlvtCapPhepGpLienVan.setMaBenDi(maBenDi);
	}

	/**
	* Returns the ma ben den of this qlvt cap phep gp lien van.
	*
	* @return the ma ben den of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getMaBenDen() {
		return _qlvtCapPhepGpLienVan.getMaBenDen();
	}

	/**
	* Sets the ma ben den of this qlvt cap phep gp lien van.
	*
	* @param maBenDen the ma ben den of this qlvt cap phep gp lien van
	*/
	@Override
	public void setMaBenDen(java.lang.String maBenDen) {
		_qlvtCapPhepGpLienVan.setMaBenDen(maBenDen);
	}

	/**
	* Returns the ma tinh di of this qlvt cap phep gp lien van.
	*
	* @return the ma tinh di of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getMaTinhDi() {
		return _qlvtCapPhepGpLienVan.getMaTinhDi();
	}

	/**
	* Sets the ma tinh di of this qlvt cap phep gp lien van.
	*
	* @param maTinhDi the ma tinh di of this qlvt cap phep gp lien van
	*/
	@Override
	public void setMaTinhDi(java.lang.String maTinhDi) {
		_qlvtCapPhepGpLienVan.setMaTinhDi(maTinhDi);
	}

	/**
	* Returns the ma tinh den of this qlvt cap phep gp lien van.
	*
	* @return the ma tinh den of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getMaTinhDen() {
		return _qlvtCapPhepGpLienVan.getMaTinhDen();
	}

	/**
	* Sets the ma tinh den of this qlvt cap phep gp lien van.
	*
	* @param maTinhDen the ma tinh den of this qlvt cap phep gp lien van
	*/
	@Override
	public void setMaTinhDen(java.lang.String maTinhDen) {
		_qlvtCapPhepGpLienVan.setMaTinhDen(maTinhDen);
	}

	/**
	* Returns the hanh trinh of this qlvt cap phep gp lien van.
	*
	* @return the hanh trinh of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getHanhTrinh() {
		return _qlvtCapPhepGpLienVan.getHanhTrinh();
	}

	/**
	* Sets the hanh trinh of this qlvt cap phep gp lien van.
	*
	* @param hanhTrinh the hanh trinh of this qlvt cap phep gp lien van
	*/
	@Override
	public void setHanhTrinh(java.lang.String hanhTrinh) {
		_qlvtCapPhepGpLienVan.setHanhTrinh(hanhTrinh);
	}

	/**
	* Returns the muc phi of this qlvt cap phep gp lien van.
	*
	* @return the muc phi of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getMucPhi() {
		return _qlvtCapPhepGpLienVan.getMucPhi();
	}

	/**
	* Sets the muc phi of this qlvt cap phep gp lien van.
	*
	* @param mucPhi the muc phi of this qlvt cap phep gp lien van
	*/
	@Override
	public void setMucPhi(java.lang.String mucPhi) {
		_qlvtCapPhepGpLienVan.setMucPhi(mucPhi);
	}

	/**
	* Returns the muc dich chuyen di of this qlvt cap phep gp lien van.
	*
	* @return the muc dich chuyen di of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getMucDichChuyenDi() {
		return _qlvtCapPhepGpLienVan.getMucDichChuyenDi();
	}

	/**
	* Sets the muc dich chuyen di of this qlvt cap phep gp lien van.
	*
	* @param mucDichChuyenDi the muc dich chuyen di of this qlvt cap phep gp lien van
	*/
	@Override
	public void setMucDichChuyenDi(java.lang.String mucDichChuyenDi) {
		_qlvtCapPhepGpLienVan.setMucDichChuyenDi(mucDichChuyenDi);
	}

	/**
	* Returns the file ID of this qlvt cap phep gp lien van.
	*
	* @return the file ID of this qlvt cap phep gp lien van
	*/
	@Override
	public long getFileId() {
		return _qlvtCapPhepGpLienVan.getFileId();
	}

	/**
	* Sets the file ID of this qlvt cap phep gp lien van.
	*
	* @param fileId the file ID of this qlvt cap phep gp lien van
	*/
	@Override
	public void setFileId(long fileId) {
		_qlvtCapPhepGpLienVan.setFileId(fileId);
	}

	/**
	* Returns the trang thai of this qlvt cap phep gp lien van.
	*
	* @return the trang thai of this qlvt cap phep gp lien van
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _qlvtCapPhepGpLienVan.getTrangThai();
	}

	/**
	* Sets the trang thai of this qlvt cap phep gp lien van.
	*
	* @param trangThai the trang thai of this qlvt cap phep gp lien van
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_qlvtCapPhepGpLienVan.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepGpLienVan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepGpLienVan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepGpLienVan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepGpLienVan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepGpLienVan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepGpLienVan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepGpLienVan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepGpLienVan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepGpLienVan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepGpLienVan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepGpLienVan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtCapPhepGpLienVanWrapper((QlvtCapPhepGpLienVan)_qlvtCapPhepGpLienVan.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan qlvtCapPhepGpLienVan) {
		return _qlvtCapPhepGpLienVan.compareTo(qlvtCapPhepGpLienVan);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepGpLienVan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan> toCacheModel() {
		return _qlvtCapPhepGpLienVan.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan toEscapedModel() {
		return new QlvtCapPhepGpLienVanWrapper(_qlvtCapPhepGpLienVan.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan toUnescapedModel() {
		return new QlvtCapPhepGpLienVanWrapper(_qlvtCapPhepGpLienVan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepGpLienVan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepGpLienVan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepGpLienVan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtCapPhepGpLienVanWrapper)) {
			return false;
		}

		QlvtCapPhepGpLienVanWrapper qlvtCapPhepGpLienVanWrapper = (QlvtCapPhepGpLienVanWrapper)obj;

		if (Validator.equals(_qlvtCapPhepGpLienVan,
					qlvtCapPhepGpLienVanWrapper._qlvtCapPhepGpLienVan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtCapPhepGpLienVan getWrappedQlvtCapPhepGpLienVan() {
		return _qlvtCapPhepGpLienVan;
	}

	@Override
	public QlvtCapPhepGpLienVan getWrappedModel() {
		return _qlvtCapPhepGpLienVan;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepGpLienVan.resetOriginalValues();
	}

	private QlvtCapPhepGpLienVan _qlvtCapPhepGpLienVan;
}