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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtThongTinHoSo}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSo
 * @generated
 */
public class QlvtThongTinHoSoWrapper implements QlvtThongTinHoSo,
	ModelWrapper<QlvtThongTinHoSo> {
	public QlvtThongTinHoSoWrapper(QlvtThongTinHoSo qlvtThongTinHoSo) {
		_qlvtThongTinHoSo = qlvtThongTinHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("soCongVanDen", getSoCongVanDen());
		attributes.put("tenDn", getTenDn());
		attributes.put("diaChiDn", getDiaChiDn());
		attributes.put("dienThoaiDn", getDienThoaiDn());
		attributes.put("soFaxDn", getSoFaxDn());
		attributes.put("emailDn", getEmailDn());
		attributes.put("webSiteDn", getWebSiteDn());
		attributes.put("soDkkd", getSoDkkd());
		attributes.put("ngayCapDkkd", getNgayCapDkkd());
		attributes.put("ngayHetHanDkkd", getNgayHetHanDkkd());
		attributes.put("coQuanCapDkkd", getCoQuanCapDkkd());
		attributes.put("daiDienDn", getDaiDienDn());
		attributes.put("coQuanGiaiQuyet", getCoQuanGiaiQuyet());
		attributes.put("diaDiemLamHoSo", getDiaDiemLamHoSo());
		attributes.put("phieuXuLyId", getPhieuXuLyId());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("lyDoCapLai", getLyDoCapLai());
		attributes.put("lanCapGiayDangKyKinhDoanh",
			getLanCapGiayDangKyKinhDoanh());
		attributes.put("soGiayPhepKinhDoanhVanTaiNoiDia",
			getSoGiayPhepKinhDoanhVanTaiNoiDia());
		attributes.put("ngayCapGPKDVTNoiDia", getNgayCapGPKDVTNoiDia());
		attributes.put("NgayGiaHanGPKDVTNoiDia", getNgayGiaHanGPKDVTNoiDia());
		attributes.put("NgayHetHanGPKDVTNoiDia", getNgayHetHanGPKDVTNoiDia());
		attributes.put("lanCapGPKDVTNoiDia", getLanCapGPKDVTNoiDia());
		attributes.put("ngayGiaHanGiayDangKyKinhDoanh",
			getNgayGiaHanGiayDangKyKinhDoanh());
		attributes.put("soGiayPhepKinhDoanhVanTaiQuocTe",
			getSoGiayPhepKinhDoanhVanTaiQuocTe());
		attributes.put("lanCapGPKDVTQuocTe", getLanCapGPKDVTQuocTe());
		attributes.put("ngayCapGPKDVTQuocTe", getNgayCapGPKDVTQuocTe());
		attributes.put("ngayGiaHanGPKDVTQuocTe", getNgayGiaHanGPKDVTQuocTe());
		attributes.put("ngayHetHanGPKDVTQuocTe", getNgayHetHanGPKDVTQuocTe());
		attributes.put("nguoiLienHeTraKetQua", getNguoiLienHeTraKetQua());
		attributes.put("soDienThoaiNguoiLienHe", getSoDienThoaiNguoiLienHe());
		attributes.put("coQuanCapGPKDVTNoiDia", getCoQuanCapGPKDVTNoiDia());
		attributes.put("nguoiNhanKetQua", getNguoiNhanKetQua());
		attributes.put("thongTinTraKetQua", getThongTinTraKetQua());
		attributes.put("ngayTraKetQua", getNgayTraKetQua());
		attributes.put("diaChiNguoiLienHeTraKetQua",
			getDiaChiNguoiLienHeTraKetQua());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String soCongVanDen = (String)attributes.get("soCongVanDen");

		if (soCongVanDen != null) {
			setSoCongVanDen(soCongVanDen);
		}

		String tenDn = (String)attributes.get("tenDn");

		if (tenDn != null) {
			setTenDn(tenDn);
		}

		String diaChiDn = (String)attributes.get("diaChiDn");

		if (diaChiDn != null) {
			setDiaChiDn(diaChiDn);
		}

		String dienThoaiDn = (String)attributes.get("dienThoaiDn");

		if (dienThoaiDn != null) {
			setDienThoaiDn(dienThoaiDn);
		}

		String soFaxDn = (String)attributes.get("soFaxDn");

		if (soFaxDn != null) {
			setSoFaxDn(soFaxDn);
		}

		String emailDn = (String)attributes.get("emailDn");

		if (emailDn != null) {
			setEmailDn(emailDn);
		}

		String webSiteDn = (String)attributes.get("webSiteDn");

		if (webSiteDn != null) {
			setWebSiteDn(webSiteDn);
		}

		String soDkkd = (String)attributes.get("soDkkd");

		if (soDkkd != null) {
			setSoDkkd(soDkkd);
		}

		Date ngayCapDkkd = (Date)attributes.get("ngayCapDkkd");

		if (ngayCapDkkd != null) {
			setNgayCapDkkd(ngayCapDkkd);
		}

		Date ngayHetHanDkkd = (Date)attributes.get("ngayHetHanDkkd");

		if (ngayHetHanDkkd != null) {
			setNgayHetHanDkkd(ngayHetHanDkkd);
		}

		String coQuanCapDkkd = (String)attributes.get("coQuanCapDkkd");

		if (coQuanCapDkkd != null) {
			setCoQuanCapDkkd(coQuanCapDkkd);
		}

		String daiDienDn = (String)attributes.get("daiDienDn");

		if (daiDienDn != null) {
			setDaiDienDn(daiDienDn);
		}

		Long coQuanGiaiQuyet = (Long)attributes.get("coQuanGiaiQuyet");

		if (coQuanGiaiQuyet != null) {
			setCoQuanGiaiQuyet(coQuanGiaiQuyet);
		}

		String diaDiemLamHoSo = (String)attributes.get("diaDiemLamHoSo");

		if (diaDiemLamHoSo != null) {
			setDiaDiemLamHoSo(diaDiemLamHoSo);
		}

		Long phieuXuLyId = (Long)attributes.get("phieuXuLyId");

		if (phieuXuLyId != null) {
			setPhieuXuLyId(phieuXuLyId);
		}

		String maSoHoSo = (String)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		String lyDoCapLai = (String)attributes.get("lyDoCapLai");

		if (lyDoCapLai != null) {
			setLyDoCapLai(lyDoCapLai);
		}

		Integer lanCapGiayDangKyKinhDoanh = (Integer)attributes.get(
				"lanCapGiayDangKyKinhDoanh");

		if (lanCapGiayDangKyKinhDoanh != null) {
			setLanCapGiayDangKyKinhDoanh(lanCapGiayDangKyKinhDoanh);
		}

		String soGiayPhepKinhDoanhVanTaiNoiDia = (String)attributes.get(
				"soGiayPhepKinhDoanhVanTaiNoiDia");

		if (soGiayPhepKinhDoanhVanTaiNoiDia != null) {
			setSoGiayPhepKinhDoanhVanTaiNoiDia(soGiayPhepKinhDoanhVanTaiNoiDia);
		}

		Date ngayCapGPKDVTNoiDia = (Date)attributes.get("ngayCapGPKDVTNoiDia");

		if (ngayCapGPKDVTNoiDia != null) {
			setNgayCapGPKDVTNoiDia(ngayCapGPKDVTNoiDia);
		}

		Date NgayGiaHanGPKDVTNoiDia = (Date)attributes.get(
				"NgayGiaHanGPKDVTNoiDia");

		if (NgayGiaHanGPKDVTNoiDia != null) {
			setNgayGiaHanGPKDVTNoiDia(NgayGiaHanGPKDVTNoiDia);
		}

		Date NgayHetHanGPKDVTNoiDia = (Date)attributes.get(
				"NgayHetHanGPKDVTNoiDia");

		if (NgayHetHanGPKDVTNoiDia != null) {
			setNgayHetHanGPKDVTNoiDia(NgayHetHanGPKDVTNoiDia);
		}

		Integer lanCapGPKDVTNoiDia = (Integer)attributes.get(
				"lanCapGPKDVTNoiDia");

		if (lanCapGPKDVTNoiDia != null) {
			setLanCapGPKDVTNoiDia(lanCapGPKDVTNoiDia);
		}

		Date ngayGiaHanGiayDangKyKinhDoanh = (Date)attributes.get(
				"ngayGiaHanGiayDangKyKinhDoanh");

		if (ngayGiaHanGiayDangKyKinhDoanh != null) {
			setNgayGiaHanGiayDangKyKinhDoanh(ngayGiaHanGiayDangKyKinhDoanh);
		}

		String soGiayPhepKinhDoanhVanTaiQuocTe = (String)attributes.get(
				"soGiayPhepKinhDoanhVanTaiQuocTe");

		if (soGiayPhepKinhDoanhVanTaiQuocTe != null) {
			setSoGiayPhepKinhDoanhVanTaiQuocTe(soGiayPhepKinhDoanhVanTaiQuocTe);
		}

		Integer lanCapGPKDVTQuocTe = (Integer)attributes.get(
				"lanCapGPKDVTQuocTe");

		if (lanCapGPKDVTQuocTe != null) {
			setLanCapGPKDVTQuocTe(lanCapGPKDVTQuocTe);
		}

		Date ngayCapGPKDVTQuocTe = (Date)attributes.get("ngayCapGPKDVTQuocTe");

		if (ngayCapGPKDVTQuocTe != null) {
			setNgayCapGPKDVTQuocTe(ngayCapGPKDVTQuocTe);
		}

		Date ngayGiaHanGPKDVTQuocTe = (Date)attributes.get(
				"ngayGiaHanGPKDVTQuocTe");

		if (ngayGiaHanGPKDVTQuocTe != null) {
			setNgayGiaHanGPKDVTQuocTe(ngayGiaHanGPKDVTQuocTe);
		}

		Date ngayHetHanGPKDVTQuocTe = (Date)attributes.get(
				"ngayHetHanGPKDVTQuocTe");

		if (ngayHetHanGPKDVTQuocTe != null) {
			setNgayHetHanGPKDVTQuocTe(ngayHetHanGPKDVTQuocTe);
		}

		String nguoiLienHeTraKetQua = (String)attributes.get(
				"nguoiLienHeTraKetQua");

		if (nguoiLienHeTraKetQua != null) {
			setNguoiLienHeTraKetQua(nguoiLienHeTraKetQua);
		}

		String soDienThoaiNguoiLienHe = (String)attributes.get(
				"soDienThoaiNguoiLienHe");

		if (soDienThoaiNguoiLienHe != null) {
			setSoDienThoaiNguoiLienHe(soDienThoaiNguoiLienHe);
		}

		String coQuanCapGPKDVTNoiDia = (String)attributes.get(
				"coQuanCapGPKDVTNoiDia");

		if (coQuanCapGPKDVTNoiDia != null) {
			setCoQuanCapGPKDVTNoiDia(coQuanCapGPKDVTNoiDia);
		}

		String nguoiNhanKetQua = (String)attributes.get("nguoiNhanKetQua");

		if (nguoiNhanKetQua != null) {
			setNguoiNhanKetQua(nguoiNhanKetQua);
		}

		String thongTinTraKetQua = (String)attributes.get("thongTinTraKetQua");

		if (thongTinTraKetQua != null) {
			setThongTinTraKetQua(thongTinTraKetQua);
		}

		Date ngayTraKetQua = (Date)attributes.get("ngayTraKetQua");

		if (ngayTraKetQua != null) {
			setNgayTraKetQua(ngayTraKetQua);
		}

		String diaChiNguoiLienHeTraKetQua = (String)attributes.get(
				"diaChiNguoiLienHeTraKetQua");

		if (diaChiNguoiLienHeTraKetQua != null) {
			setDiaChiNguoiLienHeTraKetQua(diaChiNguoiLienHeTraKetQua);
		}
	}

	/**
	* Returns the primary key of this qlvt thong tin ho so.
	*
	* @return the primary key of this qlvt thong tin ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtThongTinHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt thong tin ho so.
	*
	* @param primaryKey the primary key of this qlvt thong tin ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtThongTinHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt thong tin ho so.
	*
	* @return the ID of this qlvt thong tin ho so
	*/
	@Override
	public long getId() {
		return _qlvtThongTinHoSo.getId();
	}

	/**
	* Sets the ID of this qlvt thong tin ho so.
	*
	* @param id the ID of this qlvt thong tin ho so
	*/
	@Override
	public void setId(long id) {
		_qlvtThongTinHoSo.setId(id);
	}

	/**
	* Returns the so cong van den of this qlvt thong tin ho so.
	*
	* @return the so cong van den of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getSoCongVanDen() {
		return _qlvtThongTinHoSo.getSoCongVanDen();
	}

	/**
	* Sets the so cong van den of this qlvt thong tin ho so.
	*
	* @param soCongVanDen the so cong van den of this qlvt thong tin ho so
	*/
	@Override
	public void setSoCongVanDen(java.lang.String soCongVanDen) {
		_qlvtThongTinHoSo.setSoCongVanDen(soCongVanDen);
	}

	/**
	* Returns the ten dn of this qlvt thong tin ho so.
	*
	* @return the ten dn of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getTenDn() {
		return _qlvtThongTinHoSo.getTenDn();
	}

	/**
	* Sets the ten dn of this qlvt thong tin ho so.
	*
	* @param tenDn the ten dn of this qlvt thong tin ho so
	*/
	@Override
	public void setTenDn(java.lang.String tenDn) {
		_qlvtThongTinHoSo.setTenDn(tenDn);
	}

	/**
	* Returns the dia chi dn of this qlvt thong tin ho so.
	*
	* @return the dia chi dn of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getDiaChiDn() {
		return _qlvtThongTinHoSo.getDiaChiDn();
	}

	/**
	* Sets the dia chi dn of this qlvt thong tin ho so.
	*
	* @param diaChiDn the dia chi dn of this qlvt thong tin ho so
	*/
	@Override
	public void setDiaChiDn(java.lang.String diaChiDn) {
		_qlvtThongTinHoSo.setDiaChiDn(diaChiDn);
	}

	/**
	* Returns the dien thoai dn of this qlvt thong tin ho so.
	*
	* @return the dien thoai dn of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getDienThoaiDn() {
		return _qlvtThongTinHoSo.getDienThoaiDn();
	}

	/**
	* Sets the dien thoai dn of this qlvt thong tin ho so.
	*
	* @param dienThoaiDn the dien thoai dn of this qlvt thong tin ho so
	*/
	@Override
	public void setDienThoaiDn(java.lang.String dienThoaiDn) {
		_qlvtThongTinHoSo.setDienThoaiDn(dienThoaiDn);
	}

	/**
	* Returns the so fax dn of this qlvt thong tin ho so.
	*
	* @return the so fax dn of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getSoFaxDn() {
		return _qlvtThongTinHoSo.getSoFaxDn();
	}

	/**
	* Sets the so fax dn of this qlvt thong tin ho so.
	*
	* @param soFaxDn the so fax dn of this qlvt thong tin ho so
	*/
	@Override
	public void setSoFaxDn(java.lang.String soFaxDn) {
		_qlvtThongTinHoSo.setSoFaxDn(soFaxDn);
	}

	/**
	* Returns the email dn of this qlvt thong tin ho so.
	*
	* @return the email dn of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getEmailDn() {
		return _qlvtThongTinHoSo.getEmailDn();
	}

	/**
	* Sets the email dn of this qlvt thong tin ho so.
	*
	* @param emailDn the email dn of this qlvt thong tin ho so
	*/
	@Override
	public void setEmailDn(java.lang.String emailDn) {
		_qlvtThongTinHoSo.setEmailDn(emailDn);
	}

	/**
	* Returns the web site dn of this qlvt thong tin ho so.
	*
	* @return the web site dn of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getWebSiteDn() {
		return _qlvtThongTinHoSo.getWebSiteDn();
	}

	/**
	* Sets the web site dn of this qlvt thong tin ho so.
	*
	* @param webSiteDn the web site dn of this qlvt thong tin ho so
	*/
	@Override
	public void setWebSiteDn(java.lang.String webSiteDn) {
		_qlvtThongTinHoSo.setWebSiteDn(webSiteDn);
	}

	/**
	* Returns the so dkkd of this qlvt thong tin ho so.
	*
	* @return the so dkkd of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getSoDkkd() {
		return _qlvtThongTinHoSo.getSoDkkd();
	}

	/**
	* Sets the so dkkd of this qlvt thong tin ho so.
	*
	* @param soDkkd the so dkkd of this qlvt thong tin ho so
	*/
	@Override
	public void setSoDkkd(java.lang.String soDkkd) {
		_qlvtThongTinHoSo.setSoDkkd(soDkkd);
	}

	/**
	* Returns the ngay cap dkkd of this qlvt thong tin ho so.
	*
	* @return the ngay cap dkkd of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayCapDkkd() {
		return _qlvtThongTinHoSo.getNgayCapDkkd();
	}

	/**
	* Sets the ngay cap dkkd of this qlvt thong tin ho so.
	*
	* @param ngayCapDkkd the ngay cap dkkd of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayCapDkkd(java.util.Date ngayCapDkkd) {
		_qlvtThongTinHoSo.setNgayCapDkkd(ngayCapDkkd);
	}

	/**
	* Returns the ngay het han dkkd of this qlvt thong tin ho so.
	*
	* @return the ngay het han dkkd of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayHetHanDkkd() {
		return _qlvtThongTinHoSo.getNgayHetHanDkkd();
	}

	/**
	* Sets the ngay het han dkkd of this qlvt thong tin ho so.
	*
	* @param ngayHetHanDkkd the ngay het han dkkd of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayHetHanDkkd(java.util.Date ngayHetHanDkkd) {
		_qlvtThongTinHoSo.setNgayHetHanDkkd(ngayHetHanDkkd);
	}

	/**
	* Returns the co quan cap dkkd of this qlvt thong tin ho so.
	*
	* @return the co quan cap dkkd of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getCoQuanCapDkkd() {
		return _qlvtThongTinHoSo.getCoQuanCapDkkd();
	}

	/**
	* Sets the co quan cap dkkd of this qlvt thong tin ho so.
	*
	* @param coQuanCapDkkd the co quan cap dkkd of this qlvt thong tin ho so
	*/
	@Override
	public void setCoQuanCapDkkd(java.lang.String coQuanCapDkkd) {
		_qlvtThongTinHoSo.setCoQuanCapDkkd(coQuanCapDkkd);
	}

	/**
	* Returns the dai dien dn of this qlvt thong tin ho so.
	*
	* @return the dai dien dn of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getDaiDienDn() {
		return _qlvtThongTinHoSo.getDaiDienDn();
	}

	/**
	* Sets the dai dien dn of this qlvt thong tin ho so.
	*
	* @param daiDienDn the dai dien dn of this qlvt thong tin ho so
	*/
	@Override
	public void setDaiDienDn(java.lang.String daiDienDn) {
		_qlvtThongTinHoSo.setDaiDienDn(daiDienDn);
	}

	/**
	* Returns the co quan giai quyet of this qlvt thong tin ho so.
	*
	* @return the co quan giai quyet of this qlvt thong tin ho so
	*/
	@Override
	public long getCoQuanGiaiQuyet() {
		return _qlvtThongTinHoSo.getCoQuanGiaiQuyet();
	}

	/**
	* Sets the co quan giai quyet of this qlvt thong tin ho so.
	*
	* @param coQuanGiaiQuyet the co quan giai quyet of this qlvt thong tin ho so
	*/
	@Override
	public void setCoQuanGiaiQuyet(long coQuanGiaiQuyet) {
		_qlvtThongTinHoSo.setCoQuanGiaiQuyet(coQuanGiaiQuyet);
	}

	/**
	* Returns the dia diem lam ho so of this qlvt thong tin ho so.
	*
	* @return the dia diem lam ho so of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getDiaDiemLamHoSo() {
		return _qlvtThongTinHoSo.getDiaDiemLamHoSo();
	}

	/**
	* Sets the dia diem lam ho so of this qlvt thong tin ho so.
	*
	* @param diaDiemLamHoSo the dia diem lam ho so of this qlvt thong tin ho so
	*/
	@Override
	public void setDiaDiemLamHoSo(java.lang.String diaDiemLamHoSo) {
		_qlvtThongTinHoSo.setDiaDiemLamHoSo(diaDiemLamHoSo);
	}

	/**
	* Returns the phieu xu ly ID of this qlvt thong tin ho so.
	*
	* @return the phieu xu ly ID of this qlvt thong tin ho so
	*/
	@Override
	public long getPhieuXuLyId() {
		return _qlvtThongTinHoSo.getPhieuXuLyId();
	}

	/**
	* Sets the phieu xu ly ID of this qlvt thong tin ho so.
	*
	* @param phieuXuLyId the phieu xu ly ID of this qlvt thong tin ho so
	*/
	@Override
	public void setPhieuXuLyId(long phieuXuLyId) {
		_qlvtThongTinHoSo.setPhieuXuLyId(phieuXuLyId);
	}

	/**
	* Returns the ma so ho so of this qlvt thong tin ho so.
	*
	* @return the ma so ho so of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _qlvtThongTinHoSo.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this qlvt thong tin ho so.
	*
	* @param maSoHoSo the ma so ho so of this qlvt thong tin ho so
	*/
	@Override
	public void setMaSoHoSo(java.lang.String maSoHoSo) {
		_qlvtThongTinHoSo.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the ly do cap lai of this qlvt thong tin ho so.
	*
	* @return the ly do cap lai of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getLyDoCapLai() {
		return _qlvtThongTinHoSo.getLyDoCapLai();
	}

	/**
	* Sets the ly do cap lai of this qlvt thong tin ho so.
	*
	* @param lyDoCapLai the ly do cap lai of this qlvt thong tin ho so
	*/
	@Override
	public void setLyDoCapLai(java.lang.String lyDoCapLai) {
		_qlvtThongTinHoSo.setLyDoCapLai(lyDoCapLai);
	}

	/**
	* Returns the lan cap giay dang ky kinh doanh of this qlvt thong tin ho so.
	*
	* @return the lan cap giay dang ky kinh doanh of this qlvt thong tin ho so
	*/
	@Override
	public int getLanCapGiayDangKyKinhDoanh() {
		return _qlvtThongTinHoSo.getLanCapGiayDangKyKinhDoanh();
	}

	/**
	* Sets the lan cap giay dang ky kinh doanh of this qlvt thong tin ho so.
	*
	* @param lanCapGiayDangKyKinhDoanh the lan cap giay dang ky kinh doanh of this qlvt thong tin ho so
	*/
	@Override
	public void setLanCapGiayDangKyKinhDoanh(int lanCapGiayDangKyKinhDoanh) {
		_qlvtThongTinHoSo.setLanCapGiayDangKyKinhDoanh(lanCapGiayDangKyKinhDoanh);
	}

	/**
	* Returns the so giay phep kinh doanh van tai noi dia of this qlvt thong tin ho so.
	*
	* @return the so giay phep kinh doanh van tai noi dia of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getSoGiayPhepKinhDoanhVanTaiNoiDia() {
		return _qlvtThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiNoiDia();
	}

	/**
	* Sets the so giay phep kinh doanh van tai noi dia of this qlvt thong tin ho so.
	*
	* @param soGiayPhepKinhDoanhVanTaiNoiDia the so giay phep kinh doanh van tai noi dia of this qlvt thong tin ho so
	*/
	@Override
	public void setSoGiayPhepKinhDoanhVanTaiNoiDia(
		java.lang.String soGiayPhepKinhDoanhVanTaiNoiDia) {
		_qlvtThongTinHoSo.setSoGiayPhepKinhDoanhVanTaiNoiDia(soGiayPhepKinhDoanhVanTaiNoiDia);
	}

	/**
	* Returns the ngay cap g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @return the ngay cap g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayCapGPKDVTNoiDia() {
		return _qlvtThongTinHoSo.getNgayCapGPKDVTNoiDia();
	}

	/**
	* Sets the ngay cap g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @param ngayCapGPKDVTNoiDia the ngay cap g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayCapGPKDVTNoiDia(java.util.Date ngayCapGPKDVTNoiDia) {
		_qlvtThongTinHoSo.setNgayCapGPKDVTNoiDia(ngayCapGPKDVTNoiDia);
	}

	/**
	* Returns the ngay gia han g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @return the ngay gia han g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayGiaHanGPKDVTNoiDia() {
		return _qlvtThongTinHoSo.getNgayGiaHanGPKDVTNoiDia();
	}

	/**
	* Sets the ngay gia han g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @param NgayGiaHanGPKDVTNoiDia the ngay gia han g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayGiaHanGPKDVTNoiDia(java.util.Date NgayGiaHanGPKDVTNoiDia) {
		_qlvtThongTinHoSo.setNgayGiaHanGPKDVTNoiDia(NgayGiaHanGPKDVTNoiDia);
	}

	/**
	* Returns the ngay het han g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @return the ngay het han g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayHetHanGPKDVTNoiDia() {
		return _qlvtThongTinHoSo.getNgayHetHanGPKDVTNoiDia();
	}

	/**
	* Sets the ngay het han g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @param NgayHetHanGPKDVTNoiDia the ngay het han g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayHetHanGPKDVTNoiDia(java.util.Date NgayHetHanGPKDVTNoiDia) {
		_qlvtThongTinHoSo.setNgayHetHanGPKDVTNoiDia(NgayHetHanGPKDVTNoiDia);
	}

	/**
	* Returns the lan cap g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @return the lan cap g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public int getLanCapGPKDVTNoiDia() {
		return _qlvtThongTinHoSo.getLanCapGPKDVTNoiDia();
	}

	/**
	* Sets the lan cap g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @param lanCapGPKDVTNoiDia the lan cap g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public void setLanCapGPKDVTNoiDia(int lanCapGPKDVTNoiDia) {
		_qlvtThongTinHoSo.setLanCapGPKDVTNoiDia(lanCapGPKDVTNoiDia);
	}

	/**
	* Returns the ngay gia han giay dang ky kinh doanh of this qlvt thong tin ho so.
	*
	* @return the ngay gia han giay dang ky kinh doanh of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayGiaHanGiayDangKyKinhDoanh() {
		return _qlvtThongTinHoSo.getNgayGiaHanGiayDangKyKinhDoanh();
	}

	/**
	* Sets the ngay gia han giay dang ky kinh doanh of this qlvt thong tin ho so.
	*
	* @param ngayGiaHanGiayDangKyKinhDoanh the ngay gia han giay dang ky kinh doanh of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayGiaHanGiayDangKyKinhDoanh(
		java.util.Date ngayGiaHanGiayDangKyKinhDoanh) {
		_qlvtThongTinHoSo.setNgayGiaHanGiayDangKyKinhDoanh(ngayGiaHanGiayDangKyKinhDoanh);
	}

	/**
	* Returns the so giay phep kinh doanh van tai quoc te of this qlvt thong tin ho so.
	*
	* @return the so giay phep kinh doanh van tai quoc te of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getSoGiayPhepKinhDoanhVanTaiQuocTe() {
		return _qlvtThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiQuocTe();
	}

	/**
	* Sets the so giay phep kinh doanh van tai quoc te of this qlvt thong tin ho so.
	*
	* @param soGiayPhepKinhDoanhVanTaiQuocTe the so giay phep kinh doanh van tai quoc te of this qlvt thong tin ho so
	*/
	@Override
	public void setSoGiayPhepKinhDoanhVanTaiQuocTe(
		java.lang.String soGiayPhepKinhDoanhVanTaiQuocTe) {
		_qlvtThongTinHoSo.setSoGiayPhepKinhDoanhVanTaiQuocTe(soGiayPhepKinhDoanhVanTaiQuocTe);
	}

	/**
	* Returns the lan cap g p k d v t quoc te of this qlvt thong tin ho so.
	*
	* @return the lan cap g p k d v t quoc te of this qlvt thong tin ho so
	*/
	@Override
	public int getLanCapGPKDVTQuocTe() {
		return _qlvtThongTinHoSo.getLanCapGPKDVTQuocTe();
	}

	/**
	* Sets the lan cap g p k d v t quoc te of this qlvt thong tin ho so.
	*
	* @param lanCapGPKDVTQuocTe the lan cap g p k d v t quoc te of this qlvt thong tin ho so
	*/
	@Override
	public void setLanCapGPKDVTQuocTe(int lanCapGPKDVTQuocTe) {
		_qlvtThongTinHoSo.setLanCapGPKDVTQuocTe(lanCapGPKDVTQuocTe);
	}

	/**
	* Returns the ngay cap g p k d v t quoc te of this qlvt thong tin ho so.
	*
	* @return the ngay cap g p k d v t quoc te of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayCapGPKDVTQuocTe() {
		return _qlvtThongTinHoSo.getNgayCapGPKDVTQuocTe();
	}

	/**
	* Sets the ngay cap g p k d v t quoc te of this qlvt thong tin ho so.
	*
	* @param ngayCapGPKDVTQuocTe the ngay cap g p k d v t quoc te of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayCapGPKDVTQuocTe(java.util.Date ngayCapGPKDVTQuocTe) {
		_qlvtThongTinHoSo.setNgayCapGPKDVTQuocTe(ngayCapGPKDVTQuocTe);
	}

	/**
	* Returns the ngay gia han g p k d v t quoc te of this qlvt thong tin ho so.
	*
	* @return the ngay gia han g p k d v t quoc te of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayGiaHanGPKDVTQuocTe() {
		return _qlvtThongTinHoSo.getNgayGiaHanGPKDVTQuocTe();
	}

	/**
	* Sets the ngay gia han g p k d v t quoc te of this qlvt thong tin ho so.
	*
	* @param ngayGiaHanGPKDVTQuocTe the ngay gia han g p k d v t quoc te of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayGiaHanGPKDVTQuocTe(java.util.Date ngayGiaHanGPKDVTQuocTe) {
		_qlvtThongTinHoSo.setNgayGiaHanGPKDVTQuocTe(ngayGiaHanGPKDVTQuocTe);
	}

	/**
	* Returns the ngay het han g p k d v t quoc te of this qlvt thong tin ho so.
	*
	* @return the ngay het han g p k d v t quoc te of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayHetHanGPKDVTQuocTe() {
		return _qlvtThongTinHoSo.getNgayHetHanGPKDVTQuocTe();
	}

	/**
	* Sets the ngay het han g p k d v t quoc te of this qlvt thong tin ho so.
	*
	* @param ngayHetHanGPKDVTQuocTe the ngay het han g p k d v t quoc te of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayHetHanGPKDVTQuocTe(java.util.Date ngayHetHanGPKDVTQuocTe) {
		_qlvtThongTinHoSo.setNgayHetHanGPKDVTQuocTe(ngayHetHanGPKDVTQuocTe);
	}

	/**
	* Returns the nguoi lien he tra ket qua of this qlvt thong tin ho so.
	*
	* @return the nguoi lien he tra ket qua of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getNguoiLienHeTraKetQua() {
		return _qlvtThongTinHoSo.getNguoiLienHeTraKetQua();
	}

	/**
	* Sets the nguoi lien he tra ket qua of this qlvt thong tin ho so.
	*
	* @param nguoiLienHeTraKetQua the nguoi lien he tra ket qua of this qlvt thong tin ho so
	*/
	@Override
	public void setNguoiLienHeTraKetQua(java.lang.String nguoiLienHeTraKetQua) {
		_qlvtThongTinHoSo.setNguoiLienHeTraKetQua(nguoiLienHeTraKetQua);
	}

	/**
	* Returns the so dien thoai nguoi lien he of this qlvt thong tin ho so.
	*
	* @return the so dien thoai nguoi lien he of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getSoDienThoaiNguoiLienHe() {
		return _qlvtThongTinHoSo.getSoDienThoaiNguoiLienHe();
	}

	/**
	* Sets the so dien thoai nguoi lien he of this qlvt thong tin ho so.
	*
	* @param soDienThoaiNguoiLienHe the so dien thoai nguoi lien he of this qlvt thong tin ho so
	*/
	@Override
	public void setSoDienThoaiNguoiLienHe(
		java.lang.String soDienThoaiNguoiLienHe) {
		_qlvtThongTinHoSo.setSoDienThoaiNguoiLienHe(soDienThoaiNguoiLienHe);
	}

	/**
	* Returns the co quan cap g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @return the co quan cap g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getCoQuanCapGPKDVTNoiDia() {
		return _qlvtThongTinHoSo.getCoQuanCapGPKDVTNoiDia();
	}

	/**
	* Sets the co quan cap g p k d v t noi dia of this qlvt thong tin ho so.
	*
	* @param coQuanCapGPKDVTNoiDia the co quan cap g p k d v t noi dia of this qlvt thong tin ho so
	*/
	@Override
	public void setCoQuanCapGPKDVTNoiDia(java.lang.String coQuanCapGPKDVTNoiDia) {
		_qlvtThongTinHoSo.setCoQuanCapGPKDVTNoiDia(coQuanCapGPKDVTNoiDia);
	}

	/**
	* Returns the nguoi nhan ket qua of this qlvt thong tin ho so.
	*
	* @return the nguoi nhan ket qua of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getNguoiNhanKetQua() {
		return _qlvtThongTinHoSo.getNguoiNhanKetQua();
	}

	/**
	* Sets the nguoi nhan ket qua of this qlvt thong tin ho so.
	*
	* @param nguoiNhanKetQua the nguoi nhan ket qua of this qlvt thong tin ho so
	*/
	@Override
	public void setNguoiNhanKetQua(java.lang.String nguoiNhanKetQua) {
		_qlvtThongTinHoSo.setNguoiNhanKetQua(nguoiNhanKetQua);
	}

	/**
	* Returns the thong tin tra ket qua of this qlvt thong tin ho so.
	*
	* @return the thong tin tra ket qua of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getThongTinTraKetQua() {
		return _qlvtThongTinHoSo.getThongTinTraKetQua();
	}

	/**
	* Sets the thong tin tra ket qua of this qlvt thong tin ho so.
	*
	* @param thongTinTraKetQua the thong tin tra ket qua of this qlvt thong tin ho so
	*/
	@Override
	public void setThongTinTraKetQua(java.lang.String thongTinTraKetQua) {
		_qlvtThongTinHoSo.setThongTinTraKetQua(thongTinTraKetQua);
	}

	/**
	* Returns the ngay tra ket qua of this qlvt thong tin ho so.
	*
	* @return the ngay tra ket qua of this qlvt thong tin ho so
	*/
	@Override
	public java.util.Date getNgayTraKetQua() {
		return _qlvtThongTinHoSo.getNgayTraKetQua();
	}

	/**
	* Sets the ngay tra ket qua of this qlvt thong tin ho so.
	*
	* @param ngayTraKetQua the ngay tra ket qua of this qlvt thong tin ho so
	*/
	@Override
	public void setNgayTraKetQua(java.util.Date ngayTraKetQua) {
		_qlvtThongTinHoSo.setNgayTraKetQua(ngayTraKetQua);
	}

	/**
	* Returns the dia chi nguoi lien he tra ket qua of this qlvt thong tin ho so.
	*
	* @return the dia chi nguoi lien he tra ket qua of this qlvt thong tin ho so
	*/
	@Override
	public java.lang.String getDiaChiNguoiLienHeTraKetQua() {
		return _qlvtThongTinHoSo.getDiaChiNguoiLienHeTraKetQua();
	}

	/**
	* Sets the dia chi nguoi lien he tra ket qua of this qlvt thong tin ho so.
	*
	* @param diaChiNguoiLienHeTraKetQua the dia chi nguoi lien he tra ket qua of this qlvt thong tin ho so
	*/
	@Override
	public void setDiaChiNguoiLienHeTraKetQua(
		java.lang.String diaChiNguoiLienHeTraKetQua) {
		_qlvtThongTinHoSo.setDiaChiNguoiLienHeTraKetQua(diaChiNguoiLienHeTraKetQua);
	}

	@Override
	public boolean isNew() {
		return _qlvtThongTinHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtThongTinHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtThongTinHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtThongTinHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtThongTinHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtThongTinHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtThongTinHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtThongTinHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtThongTinHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtThongTinHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtThongTinHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtThongTinHoSoWrapper((QlvtThongTinHoSo)_qlvtThongTinHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo qlvtThongTinHoSo) {
		return _qlvtThongTinHoSo.compareTo(qlvtThongTinHoSo);
	}

	@Override
	public int hashCode() {
		return _qlvtThongTinHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo> toCacheModel() {
		return _qlvtThongTinHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo toEscapedModel() {
		return new QlvtThongTinHoSoWrapper(_qlvtThongTinHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo toUnescapedModel() {
		return new QlvtThongTinHoSoWrapper(_qlvtThongTinHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtThongTinHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtThongTinHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtThongTinHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtThongTinHoSoWrapper)) {
			return false;
		}

		QlvtThongTinHoSoWrapper qlvtThongTinHoSoWrapper = (QlvtThongTinHoSoWrapper)obj;

		if (Validator.equals(_qlvtThongTinHoSo,
					qlvtThongTinHoSoWrapper._qlvtThongTinHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtThongTinHoSo getWrappedQlvtThongTinHoSo() {
		return _qlvtThongTinHoSo;
	}

	@Override
	public QlvtThongTinHoSo getWrappedModel() {
		return _qlvtThongTinHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtThongTinHoSo.resetOriginalValues();
	}

	private QlvtThongTinHoSo _qlvtThongTinHoSo;
}