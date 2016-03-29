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
 * This class is a wrapper for {@link QlvtXuLyGpLienVan}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVan
 * @generated
 */
public class QlvtXuLyGpLienVanWrapper implements QlvtXuLyGpLienVan,
	ModelWrapper<QlvtXuLyGpLienVan> {
	public QlvtXuLyGpLienVanWrapper(QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		_qlvtXuLyGpLienVan = qlvtXuLyGpLienVan;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpLienVan.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpLienVan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("loaiCapPhep", getLoaiCapPhep());
		attributes.put("soGpvt", getSoGpvt());
		attributes.put("ngayCapGpvt", getNgayCapGpvt());
		attributes.put("soCongVanChapThuanTcd", getSoCongVanChapThuanTcd());
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
		attributes.put("loaiGiayPhepLienVan", getLoaiGiayPhepLienVan());
		attributes.put("soGiayPhepLienVan", getSoGiayPhepLienVan());
		attributes.put("ngayCapGiayPhepLienVan", getNgayCapGiayPhepLienVan());
		attributes.put("ngayHetHanGiayPhepLienVan",
			getNgayHetHanGiayPhepLienVan());
		attributes.put("coQuanCapPhepLienVan", getCoQuanCapPhepLienVan());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("ngayCapGiayPhepLienVan_LanDau",
			getNgayCapGiayPhepLienVan_LanDau());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thongTinXuLyId = (Long)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String loaiCapPhep = (String)attributes.get("loaiCapPhep");

		if (loaiCapPhep != null) {
			setLoaiCapPhep(loaiCapPhep);
		}

		String soGpvt = (String)attributes.get("soGpvt");

		if (soGpvt != null) {
			setSoGpvt(soGpvt);
		}

		Date ngayCapGpvt = (Date)attributes.get("ngayCapGpvt");

		if (ngayCapGpvt != null) {
			setNgayCapGpvt(ngayCapGpvt);
		}

		String soCongVanChapThuanTcd = (String)attributes.get(
				"soCongVanChapThuanTcd");

		if (soCongVanChapThuanTcd != null) {
			setSoCongVanChapThuanTcd(soCongVanChapThuanTcd);
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

		String loaiGiayPhepLienVan = (String)attributes.get(
				"loaiGiayPhepLienVan");

		if (loaiGiayPhepLienVan != null) {
			setLoaiGiayPhepLienVan(loaiGiayPhepLienVan);
		}

		String soGiayPhepLienVan = (String)attributes.get("soGiayPhepLienVan");

		if (soGiayPhepLienVan != null) {
			setSoGiayPhepLienVan(soGiayPhepLienVan);
		}

		Date ngayCapGiayPhepLienVan = (Date)attributes.get(
				"ngayCapGiayPhepLienVan");

		if (ngayCapGiayPhepLienVan != null) {
			setNgayCapGiayPhepLienVan(ngayCapGiayPhepLienVan);
		}

		Date ngayHetHanGiayPhepLienVan = (Date)attributes.get(
				"ngayHetHanGiayPhepLienVan");

		if (ngayHetHanGiayPhepLienVan != null) {
			setNgayHetHanGiayPhepLienVan(ngayHetHanGiayPhepLienVan);
		}

		String coQuanCapPhepLienVan = (String)attributes.get(
				"coQuanCapPhepLienVan");

		if (coQuanCapPhepLienVan != null) {
			setCoQuanCapPhepLienVan(coQuanCapPhepLienVan);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		Date ngayCapGiayPhepLienVan_LanDau = (Date)attributes.get(
				"ngayCapGiayPhepLienVan_LanDau");

		if (ngayCapGiayPhepLienVan_LanDau != null) {
			setNgayCapGiayPhepLienVan_LanDau(ngayCapGiayPhepLienVan_LanDau);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly gp lien van.
	*
	* @return the primary key of this qlvt xu ly gp lien van
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpLienVan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gp lien van.
	*
	* @param primaryKey the primary key of this qlvt xu ly gp lien van
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpLienVan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gp lien van.
	*
	* @return the ID of this qlvt xu ly gp lien van
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpLienVan.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gp lien van.
	*
	* @param id the ID of this qlvt xu ly gp lien van
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpLienVan.setId(id);
	}

	/**
	* Returns the thong tin xu ly ID of this qlvt xu ly gp lien van.
	*
	* @return the thong tin xu ly ID of this qlvt xu ly gp lien van
	*/
	@Override
	public long getThongTinXuLyId() {
		return _qlvtXuLyGpLienVan.getThongTinXuLyId();
	}

	/**
	* Sets the thong tin xu ly ID of this qlvt xu ly gp lien van.
	*
	* @param thongTinXuLyId the thong tin xu ly ID of this qlvt xu ly gp lien van
	*/
	@Override
	public void setThongTinXuLyId(long thongTinXuLyId) {
		_qlvtXuLyGpLienVan.setThongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the loai cap phep of this qlvt xu ly gp lien van.
	*
	* @return the loai cap phep of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getLoaiCapPhep() {
		return _qlvtXuLyGpLienVan.getLoaiCapPhep();
	}

	/**
	* Sets the loai cap phep of this qlvt xu ly gp lien van.
	*
	* @param loaiCapPhep the loai cap phep of this qlvt xu ly gp lien van
	*/
	@Override
	public void setLoaiCapPhep(java.lang.String loaiCapPhep) {
		_qlvtXuLyGpLienVan.setLoaiCapPhep(loaiCapPhep);
	}

	/**
	* Returns the so gpvt of this qlvt xu ly gp lien van.
	*
	* @return the so gpvt of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getSoGpvt() {
		return _qlvtXuLyGpLienVan.getSoGpvt();
	}

	/**
	* Sets the so gpvt of this qlvt xu ly gp lien van.
	*
	* @param soGpvt the so gpvt of this qlvt xu ly gp lien van
	*/
	@Override
	public void setSoGpvt(java.lang.String soGpvt) {
		_qlvtXuLyGpLienVan.setSoGpvt(soGpvt);
	}

	/**
	* Returns the ngay cap gpvt of this qlvt xu ly gp lien van.
	*
	* @return the ngay cap gpvt of this qlvt xu ly gp lien van
	*/
	@Override
	public java.util.Date getNgayCapGpvt() {
		return _qlvtXuLyGpLienVan.getNgayCapGpvt();
	}

	/**
	* Sets the ngay cap gpvt of this qlvt xu ly gp lien van.
	*
	* @param ngayCapGpvt the ngay cap gpvt of this qlvt xu ly gp lien van
	*/
	@Override
	public void setNgayCapGpvt(java.util.Date ngayCapGpvt) {
		_qlvtXuLyGpLienVan.setNgayCapGpvt(ngayCapGpvt);
	}

	/**
	* Returns the so cong van chap thuan tcd of this qlvt xu ly gp lien van.
	*
	* @return the so cong van chap thuan tcd of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getSoCongVanChapThuanTcd() {
		return _qlvtXuLyGpLienVan.getSoCongVanChapThuanTcd();
	}

	/**
	* Sets the so cong van chap thuan tcd of this qlvt xu ly gp lien van.
	*
	* @param soCongVanChapThuanTcd the so cong van chap thuan tcd of this qlvt xu ly gp lien van
	*/
	@Override
	public void setSoCongVanChapThuanTcd(java.lang.String soCongVanChapThuanTcd) {
		_qlvtXuLyGpLienVan.setSoCongVanChapThuanTcd(soCongVanChapThuanTcd);
	}

	/**
	* Returns the ngay cong van chap thuan t c d of this qlvt xu ly gp lien van.
	*
	* @return the ngay cong van chap thuan t c d of this qlvt xu ly gp lien van
	*/
	@Override
	public java.util.Date getNgayCongVanChapThuanTCD() {
		return _qlvtXuLyGpLienVan.getNgayCongVanChapThuanTCD();
	}

	/**
	* Sets the ngay cong van chap thuan t c d of this qlvt xu ly gp lien van.
	*
	* @param ngayCongVanChapThuanTCD the ngay cong van chap thuan t c d of this qlvt xu ly gp lien van
	*/
	@Override
	public void setNgayCongVanChapThuanTCD(
		java.util.Date ngayCongVanChapThuanTCD) {
		_qlvtXuLyGpLienVan.setNgayCongVanChapThuanTCD(ngayCongVanChapThuanTCD);
	}

	/**
	* Returns the tuyen tu of this qlvt xu ly gp lien van.
	*
	* @return the tuyen tu of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getTuyenTu() {
		return _qlvtXuLyGpLienVan.getTuyenTu();
	}

	/**
	* Sets the tuyen tu of this qlvt xu ly gp lien van.
	*
	* @param tuyenTu the tuyen tu of this qlvt xu ly gp lien van
	*/
	@Override
	public void setTuyenTu(java.lang.String tuyenTu) {
		_qlvtXuLyGpLienVan.setTuyenTu(tuyenTu);
	}

	/**
	* Returns the tuyen di of this qlvt xu ly gp lien van.
	*
	* @return the tuyen di of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getTuyenDi() {
		return _qlvtXuLyGpLienVan.getTuyenDi();
	}

	/**
	* Sets the tuyen di of this qlvt xu ly gp lien van.
	*
	* @param tuyenDi the tuyen di of this qlvt xu ly gp lien van
	*/
	@Override
	public void setTuyenDi(java.lang.String tuyenDi) {
		_qlvtXuLyGpLienVan.setTuyenDi(tuyenDi);
	}

	/**
	* Returns the cu ly of this qlvt xu ly gp lien van.
	*
	* @return the cu ly of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getCuLy() {
		return _qlvtXuLyGpLienVan.getCuLy();
	}

	/**
	* Sets the cu ly of this qlvt xu ly gp lien van.
	*
	* @param cuLy the cu ly of this qlvt xu ly gp lien van
	*/
	@Override
	public void setCuLy(java.lang.String cuLy) {
		_qlvtXuLyGpLienVan.setCuLy(cuLy);
	}

	/**
	* Returns the ma ben di of this qlvt xu ly gp lien van.
	*
	* @return the ma ben di of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getMaBenDi() {
		return _qlvtXuLyGpLienVan.getMaBenDi();
	}

	/**
	* Sets the ma ben di of this qlvt xu ly gp lien van.
	*
	* @param maBenDi the ma ben di of this qlvt xu ly gp lien van
	*/
	@Override
	public void setMaBenDi(java.lang.String maBenDi) {
		_qlvtXuLyGpLienVan.setMaBenDi(maBenDi);
	}

	/**
	* Returns the ma ben den of this qlvt xu ly gp lien van.
	*
	* @return the ma ben den of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getMaBenDen() {
		return _qlvtXuLyGpLienVan.getMaBenDen();
	}

	/**
	* Sets the ma ben den of this qlvt xu ly gp lien van.
	*
	* @param maBenDen the ma ben den of this qlvt xu ly gp lien van
	*/
	@Override
	public void setMaBenDen(java.lang.String maBenDen) {
		_qlvtXuLyGpLienVan.setMaBenDen(maBenDen);
	}

	/**
	* Returns the ma tinh di of this qlvt xu ly gp lien van.
	*
	* @return the ma tinh di of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getMaTinhDi() {
		return _qlvtXuLyGpLienVan.getMaTinhDi();
	}

	/**
	* Sets the ma tinh di of this qlvt xu ly gp lien van.
	*
	* @param maTinhDi the ma tinh di of this qlvt xu ly gp lien van
	*/
	@Override
	public void setMaTinhDi(java.lang.String maTinhDi) {
		_qlvtXuLyGpLienVan.setMaTinhDi(maTinhDi);
	}

	/**
	* Returns the ma tinh den of this qlvt xu ly gp lien van.
	*
	* @return the ma tinh den of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getMaTinhDen() {
		return _qlvtXuLyGpLienVan.getMaTinhDen();
	}

	/**
	* Sets the ma tinh den of this qlvt xu ly gp lien van.
	*
	* @param maTinhDen the ma tinh den of this qlvt xu ly gp lien van
	*/
	@Override
	public void setMaTinhDen(java.lang.String maTinhDen) {
		_qlvtXuLyGpLienVan.setMaTinhDen(maTinhDen);
	}

	/**
	* Returns the hanh trinh of this qlvt xu ly gp lien van.
	*
	* @return the hanh trinh of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getHanhTrinh() {
		return _qlvtXuLyGpLienVan.getHanhTrinh();
	}

	/**
	* Sets the hanh trinh of this qlvt xu ly gp lien van.
	*
	* @param hanhTrinh the hanh trinh of this qlvt xu ly gp lien van
	*/
	@Override
	public void setHanhTrinh(java.lang.String hanhTrinh) {
		_qlvtXuLyGpLienVan.setHanhTrinh(hanhTrinh);
	}

	/**
	* Returns the muc phi of this qlvt xu ly gp lien van.
	*
	* @return the muc phi of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getMucPhi() {
		return _qlvtXuLyGpLienVan.getMucPhi();
	}

	/**
	* Sets the muc phi of this qlvt xu ly gp lien van.
	*
	* @param mucPhi the muc phi of this qlvt xu ly gp lien van
	*/
	@Override
	public void setMucPhi(java.lang.String mucPhi) {
		_qlvtXuLyGpLienVan.setMucPhi(mucPhi);
	}

	/**
	* Returns the muc dich chuyen di of this qlvt xu ly gp lien van.
	*
	* @return the muc dich chuyen di of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getMucDichChuyenDi() {
		return _qlvtXuLyGpLienVan.getMucDichChuyenDi();
	}

	/**
	* Sets the muc dich chuyen di of this qlvt xu ly gp lien van.
	*
	* @param mucDichChuyenDi the muc dich chuyen di of this qlvt xu ly gp lien van
	*/
	@Override
	public void setMucDichChuyenDi(java.lang.String mucDichChuyenDi) {
		_qlvtXuLyGpLienVan.setMucDichChuyenDi(mucDichChuyenDi);
	}

	/**
	* Returns the loai giay phep lien van of this qlvt xu ly gp lien van.
	*
	* @return the loai giay phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getLoaiGiayPhepLienVan() {
		return _qlvtXuLyGpLienVan.getLoaiGiayPhepLienVan();
	}

	/**
	* Sets the loai giay phep lien van of this qlvt xu ly gp lien van.
	*
	* @param loaiGiayPhepLienVan the loai giay phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public void setLoaiGiayPhepLienVan(java.lang.String loaiGiayPhepLienVan) {
		_qlvtXuLyGpLienVan.setLoaiGiayPhepLienVan(loaiGiayPhepLienVan);
	}

	/**
	* Returns the so giay phep lien van of this qlvt xu ly gp lien van.
	*
	* @return the so giay phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getSoGiayPhepLienVan() {
		return _qlvtXuLyGpLienVan.getSoGiayPhepLienVan();
	}

	/**
	* Sets the so giay phep lien van of this qlvt xu ly gp lien van.
	*
	* @param soGiayPhepLienVan the so giay phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public void setSoGiayPhepLienVan(java.lang.String soGiayPhepLienVan) {
		_qlvtXuLyGpLienVan.setSoGiayPhepLienVan(soGiayPhepLienVan);
	}

	/**
	* Returns the ngay cap giay phep lien van of this qlvt xu ly gp lien van.
	*
	* @return the ngay cap giay phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public java.util.Date getNgayCapGiayPhepLienVan() {
		return _qlvtXuLyGpLienVan.getNgayCapGiayPhepLienVan();
	}

	/**
	* Sets the ngay cap giay phep lien van of this qlvt xu ly gp lien van.
	*
	* @param ngayCapGiayPhepLienVan the ngay cap giay phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public void setNgayCapGiayPhepLienVan(java.util.Date ngayCapGiayPhepLienVan) {
		_qlvtXuLyGpLienVan.setNgayCapGiayPhepLienVan(ngayCapGiayPhepLienVan);
	}

	/**
	* Returns the ngay het han giay phep lien van of this qlvt xu ly gp lien van.
	*
	* @return the ngay het han giay phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public java.util.Date getNgayHetHanGiayPhepLienVan() {
		return _qlvtXuLyGpLienVan.getNgayHetHanGiayPhepLienVan();
	}

	/**
	* Sets the ngay het han giay phep lien van of this qlvt xu ly gp lien van.
	*
	* @param ngayHetHanGiayPhepLienVan the ngay het han giay phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public void setNgayHetHanGiayPhepLienVan(
		java.util.Date ngayHetHanGiayPhepLienVan) {
		_qlvtXuLyGpLienVan.setNgayHetHanGiayPhepLienVan(ngayHetHanGiayPhepLienVan);
	}

	/**
	* Returns the co quan cap phep lien van of this qlvt xu ly gp lien van.
	*
	* @return the co quan cap phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getCoQuanCapPhepLienVan() {
		return _qlvtXuLyGpLienVan.getCoQuanCapPhepLienVan();
	}

	/**
	* Sets the co quan cap phep lien van of this qlvt xu ly gp lien van.
	*
	* @param coQuanCapPhepLienVan the co quan cap phep lien van of this qlvt xu ly gp lien van
	*/
	@Override
	public void setCoQuanCapPhepLienVan(java.lang.String coQuanCapPhepLienVan) {
		_qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(coQuanCapPhepLienVan);
	}

	/**
	* Returns the ket qua xu ly of this qlvt xu ly gp lien van.
	*
	* @return the ket qua xu ly of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtXuLyGpLienVan.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this qlvt xu ly gp lien van.
	*
	* @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly gp lien van
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtXuLyGpLienVan.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the ly do khong dat of this qlvt xu ly gp lien van.
	*
	* @return the ly do khong dat of this qlvt xu ly gp lien van
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtXuLyGpLienVan.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this qlvt xu ly gp lien van.
	*
	* @param lyDoKhongDat the ly do khong dat of this qlvt xu ly gp lien van
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtXuLyGpLienVan.setLyDoKhongDat(lyDoKhongDat);
	}

	/**
	* Returns the ngay cap giay phep lien van_ lan dau of this qlvt xu ly gp lien van.
	*
	* @return the ngay cap giay phep lien van_ lan dau of this qlvt xu ly gp lien van
	*/
	@Override
	public java.util.Date getNgayCapGiayPhepLienVan_LanDau() {
		return _qlvtXuLyGpLienVan.getNgayCapGiayPhepLienVan_LanDau();
	}

	/**
	* Sets the ngay cap giay phep lien van_ lan dau of this qlvt xu ly gp lien van.
	*
	* @param ngayCapGiayPhepLienVan_LanDau the ngay cap giay phep lien van_ lan dau of this qlvt xu ly gp lien van
	*/
	@Override
	public void setNgayCapGiayPhepLienVan_LanDau(
		java.util.Date ngayCapGiayPhepLienVan_LanDau) {
		_qlvtXuLyGpLienVan.setNgayCapGiayPhepLienVan_LanDau(ngayCapGiayPhepLienVan_LanDau);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpLienVan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpLienVan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpLienVan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpLienVan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpLienVan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpLienVan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpLienVan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpLienVan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpLienVan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpLienVan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpLienVan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpLienVanWrapper((QlvtXuLyGpLienVan)_qlvtXuLyGpLienVan.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		return _qlvtXuLyGpLienVan.compareTo(qlvtXuLyGpLienVan);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpLienVan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan> toCacheModel() {
		return _qlvtXuLyGpLienVan.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan toEscapedModel() {
		return new QlvtXuLyGpLienVanWrapper(_qlvtXuLyGpLienVan.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan toUnescapedModel() {
		return new QlvtXuLyGpLienVanWrapper(_qlvtXuLyGpLienVan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpLienVan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpLienVan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpLienVan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpLienVanWrapper)) {
			return false;
		}

		QlvtXuLyGpLienVanWrapper qlvtXuLyGpLienVanWrapper = (QlvtXuLyGpLienVanWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpLienVan,
					qlvtXuLyGpLienVanWrapper._qlvtXuLyGpLienVan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpLienVan getWrappedQlvtXuLyGpLienVan() {
		return _qlvtXuLyGpLienVan;
	}

	@Override
	public QlvtXuLyGpLienVan getWrappedModel() {
		return _qlvtXuLyGpLienVan;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpLienVan.resetOriginalValues();
	}

	private QlvtXuLyGpLienVan _qlvtXuLyGpLienVan;
}