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

package vn.dtt.duongbo.dao.noidia.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtXuLyGpkdvtBangOto}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtBangOto
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoWrapper implements QlvtXuLyGpkdvtBangOto,
	ModelWrapper<QlvtXuLyGpkdvtBangOto> {
	public QlvtXuLyGpkdvtBangOtoWrapper(
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) {
		_qlvtXuLyGpkdvtBangOto = qlvtXuLyGpkdvtBangOto;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtBangOto.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtBangOto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("loaiHinhCap", getLoaiHinhCap());
		attributes.put("soGpkdVanTaiBangOto", getSoGpkdVanTaiBangOto());
		attributes.put("ngayCapGpkdVanTaiBangOto", getNgayCapGpkdVanTaiBangOto());
		attributes.put("coQuanCapGpkdVanTaiBangOto",
			getCoQuanCapGpkdVanTaiBangOto());
		attributes.put("ngayHetHanGpkdVanTaiBangOto",
			getNgayHetHanGpkdVanTaiBangOto());
		attributes.put("nguoiTrucTiepDieuHanh", getNguoiTrucTiepDieuHanh());
		attributes.put("soCmtNguoiDieuHanh", getSoCmtNguoiDieuHanh());
		attributes.put("ngayCapNguoiDieuHanh", getNgayCapNguoiDieuHanh());
		attributes.put("noiCapNguoiDieuHanh", getNoiCapNguoiDieuHanh());
		attributes.put("bangCapNguoiDieuHanh", getBangCapNguoiDieuHanh());
		attributes.put("thoiGianBatDauDieuHanh", getThoiGianBatDauDieuHanh());
		attributes.put("thoiGianKetThucDieuHanh", getThoiGianKetThucDieuHanh());
		attributes.put("soGiayPhepNguoiDieuHanh", getSoGiayPhepNguoiDieuHanh());
		attributes.put("lanCapNguoiDieuHanh", getLanCapNguoiDieuHanh());
		attributes.put("ngayCapCcDieuHanh", getNgayCapCcDieuHanh());
		attributes.put("ngayHetHanCcDieuHanh", getNgayHetHanCcDieuHanh());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("ketQuaXuLyNguoiDieuHanh", getKetQuaXuLyNguoiDieuHanh());
		attributes.put("lyDoKhongDatNguoiDieuHanh",
			getLyDoKhongDatNguoiDieuHanh());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String loaiHinhCap = (String)attributes.get("loaiHinhCap");

		if (loaiHinhCap != null) {
			setLoaiHinhCap(loaiHinhCap);
		}

		String soGpkdVanTaiBangOto = (String)attributes.get(
				"soGpkdVanTaiBangOto");

		if (soGpkdVanTaiBangOto != null) {
			setSoGpkdVanTaiBangOto(soGpkdVanTaiBangOto);
		}

		Date ngayCapGpkdVanTaiBangOto = (Date)attributes.get(
				"ngayCapGpkdVanTaiBangOto");

		if (ngayCapGpkdVanTaiBangOto != null) {
			setNgayCapGpkdVanTaiBangOto(ngayCapGpkdVanTaiBangOto);
		}

		String coQuanCapGpkdVanTaiBangOto = (String)attributes.get(
				"coQuanCapGpkdVanTaiBangOto");

		if (coQuanCapGpkdVanTaiBangOto != null) {
			setCoQuanCapGpkdVanTaiBangOto(coQuanCapGpkdVanTaiBangOto);
		}

		Date ngayHetHanGpkdVanTaiBangOto = (Date)attributes.get(
				"ngayHetHanGpkdVanTaiBangOto");

		if (ngayHetHanGpkdVanTaiBangOto != null) {
			setNgayHetHanGpkdVanTaiBangOto(ngayHetHanGpkdVanTaiBangOto);
		}

		String nguoiTrucTiepDieuHanh = (String)attributes.get(
				"nguoiTrucTiepDieuHanh");

		if (nguoiTrucTiepDieuHanh != null) {
			setNguoiTrucTiepDieuHanh(nguoiTrucTiepDieuHanh);
		}

		String soCmtNguoiDieuHanh = (String)attributes.get("soCmtNguoiDieuHanh");

		if (soCmtNguoiDieuHanh != null) {
			setSoCmtNguoiDieuHanh(soCmtNguoiDieuHanh);
		}

		Date ngayCapNguoiDieuHanh = (Date)attributes.get("ngayCapNguoiDieuHanh");

		if (ngayCapNguoiDieuHanh != null) {
			setNgayCapNguoiDieuHanh(ngayCapNguoiDieuHanh);
		}

		String noiCapNguoiDieuHanh = (String)attributes.get(
				"noiCapNguoiDieuHanh");

		if (noiCapNguoiDieuHanh != null) {
			setNoiCapNguoiDieuHanh(noiCapNguoiDieuHanh);
		}

		String bangCapNguoiDieuHanh = (String)attributes.get(
				"bangCapNguoiDieuHanh");

		if (bangCapNguoiDieuHanh != null) {
			setBangCapNguoiDieuHanh(bangCapNguoiDieuHanh);
		}

		Date thoiGianBatDauDieuHanh = (Date)attributes.get(
				"thoiGianBatDauDieuHanh");

		if (thoiGianBatDauDieuHanh != null) {
			setThoiGianBatDauDieuHanh(thoiGianBatDauDieuHanh);
		}

		Date thoiGianKetThucDieuHanh = (Date)attributes.get(
				"thoiGianKetThucDieuHanh");

		if (thoiGianKetThucDieuHanh != null) {
			setThoiGianKetThucDieuHanh(thoiGianKetThucDieuHanh);
		}

		String soGiayPhepNguoiDieuHanh = (String)attributes.get(
				"soGiayPhepNguoiDieuHanh");

		if (soGiayPhepNguoiDieuHanh != null) {
			setSoGiayPhepNguoiDieuHanh(soGiayPhepNguoiDieuHanh);
		}

		Integer lanCapNguoiDieuHanh = (Integer)attributes.get(
				"lanCapNguoiDieuHanh");

		if (lanCapNguoiDieuHanh != null) {
			setLanCapNguoiDieuHanh(lanCapNguoiDieuHanh);
		}

		Date ngayCapCcDieuHanh = (Date)attributes.get("ngayCapCcDieuHanh");

		if (ngayCapCcDieuHanh != null) {
			setNgayCapCcDieuHanh(ngayCapCcDieuHanh);
		}

		Date ngayHetHanCcDieuHanh = (Date)attributes.get("ngayHetHanCcDieuHanh");

		if (ngayHetHanCcDieuHanh != null) {
			setNgayHetHanCcDieuHanh(ngayHetHanCcDieuHanh);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		String ketQuaXuLyNguoiDieuHanh = (String)attributes.get(
				"ketQuaXuLyNguoiDieuHanh");

		if (ketQuaXuLyNguoiDieuHanh != null) {
			setKetQuaXuLyNguoiDieuHanh(ketQuaXuLyNguoiDieuHanh);
		}

		String lyDoKhongDatNguoiDieuHanh = (String)attributes.get(
				"lyDoKhongDatNguoiDieuHanh");

		if (lyDoKhongDatNguoiDieuHanh != null) {
			setLyDoKhongDatNguoiDieuHanh(lyDoKhongDatNguoiDieuHanh);
		}
	}

	/**
	* Returns the primary key of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the primary key of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtXuLyGpkdvtBangOto.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt xu ly gpkdvt bang oto.
	*
	* @param primaryKey the primary key of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtXuLyGpkdvtBangOto.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ID of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public long getId() {
		return _qlvtXuLyGpkdvtBangOto.getId();
	}

	/**
	* Sets the ID of this qlvt xu ly gpkdvt bang oto.
	*
	* @param id the ID of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setId(long id) {
		_qlvtXuLyGpkdvtBangOto.setId(id);
	}

	/**
	* Returns the thong tin xu ly ID of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the thong tin xu ly ID of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public int getThongTinXuLyId() {
		return _qlvtXuLyGpkdvtBangOto.getThongTinXuLyId();
	}

	/**
	* Sets the thong tin xu ly ID of this qlvt xu ly gpkdvt bang oto.
	*
	* @param thongTinXuLyId the thong tin xu ly ID of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setThongTinXuLyId(int thongTinXuLyId) {
		_qlvtXuLyGpkdvtBangOto.setThongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the loai hinh cap of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the loai hinh cap of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getLoaiHinhCap() {
		return _qlvtXuLyGpkdvtBangOto.getLoaiHinhCap();
	}

	/**
	* Sets the loai hinh cap of this qlvt xu ly gpkdvt bang oto.
	*
	* @param loaiHinhCap the loai hinh cap of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setLoaiHinhCap(java.lang.String loaiHinhCap) {
		_qlvtXuLyGpkdvtBangOto.setLoaiHinhCap(loaiHinhCap);
	}

	/**
	* Returns the so gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the so gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getSoGpkdVanTaiBangOto() {
		return _qlvtXuLyGpkdvtBangOto.getSoGpkdVanTaiBangOto();
	}

	/**
	* Sets the so gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto.
	*
	* @param soGpkdVanTaiBangOto the so gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setSoGpkdVanTaiBangOto(java.lang.String soGpkdVanTaiBangOto) {
		_qlvtXuLyGpkdvtBangOto.setSoGpkdVanTaiBangOto(soGpkdVanTaiBangOto);
	}

	/**
	* Returns the ngay cap gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ngay cap gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.util.Date getNgayCapGpkdVanTaiBangOto() {
		return _qlvtXuLyGpkdvtBangOto.getNgayCapGpkdVanTaiBangOto();
	}

	/**
	* Sets the ngay cap gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto.
	*
	* @param ngayCapGpkdVanTaiBangOto the ngay cap gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setNgayCapGpkdVanTaiBangOto(
		java.util.Date ngayCapGpkdVanTaiBangOto) {
		_qlvtXuLyGpkdvtBangOto.setNgayCapGpkdVanTaiBangOto(ngayCapGpkdVanTaiBangOto);
	}

	/**
	* Returns the co quan cap gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the co quan cap gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getCoQuanCapGpkdVanTaiBangOto() {
		return _qlvtXuLyGpkdvtBangOto.getCoQuanCapGpkdVanTaiBangOto();
	}

	/**
	* Sets the co quan cap gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto.
	*
	* @param coQuanCapGpkdVanTaiBangOto the co quan cap gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setCoQuanCapGpkdVanTaiBangOto(
		java.lang.String coQuanCapGpkdVanTaiBangOto) {
		_qlvtXuLyGpkdvtBangOto.setCoQuanCapGpkdVanTaiBangOto(coQuanCapGpkdVanTaiBangOto);
	}

	/**
	* Returns the ngay het han gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ngay het han gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.util.Date getNgayHetHanGpkdVanTaiBangOto() {
		return _qlvtXuLyGpkdvtBangOto.getNgayHetHanGpkdVanTaiBangOto();
	}

	/**
	* Sets the ngay het han gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto.
	*
	* @param ngayHetHanGpkdVanTaiBangOto the ngay het han gpkd van tai bang oto of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setNgayHetHanGpkdVanTaiBangOto(
		java.util.Date ngayHetHanGpkdVanTaiBangOto) {
		_qlvtXuLyGpkdvtBangOto.setNgayHetHanGpkdVanTaiBangOto(ngayHetHanGpkdVanTaiBangOto);
	}

	/**
	* Returns the nguoi truc tiep dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the nguoi truc tiep dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getNguoiTrucTiepDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getNguoiTrucTiepDieuHanh();
	}

	/**
	* Sets the nguoi truc tiep dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param nguoiTrucTiepDieuHanh the nguoi truc tiep dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setNguoiTrucTiepDieuHanh(java.lang.String nguoiTrucTiepDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setNguoiTrucTiepDieuHanh(nguoiTrucTiepDieuHanh);
	}

	/**
	* Returns the so cmt nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the so cmt nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getSoCmtNguoiDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getSoCmtNguoiDieuHanh();
	}

	/**
	* Sets the so cmt nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param soCmtNguoiDieuHanh the so cmt nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setSoCmtNguoiDieuHanh(java.lang.String soCmtNguoiDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setSoCmtNguoiDieuHanh(soCmtNguoiDieuHanh);
	}

	/**
	* Returns the ngay cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ngay cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.util.Date getNgayCapNguoiDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getNgayCapNguoiDieuHanh();
	}

	/**
	* Sets the ngay cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param ngayCapNguoiDieuHanh the ngay cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setNgayCapNguoiDieuHanh(java.util.Date ngayCapNguoiDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setNgayCapNguoiDieuHanh(ngayCapNguoiDieuHanh);
	}

	/**
	* Returns the noi cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the noi cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getNoiCapNguoiDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getNoiCapNguoiDieuHanh();
	}

	/**
	* Sets the noi cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param noiCapNguoiDieuHanh the noi cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setNoiCapNguoiDieuHanh(java.lang.String noiCapNguoiDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setNoiCapNguoiDieuHanh(noiCapNguoiDieuHanh);
	}

	/**
	* Returns the bang cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the bang cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getBangCapNguoiDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getBangCapNguoiDieuHanh();
	}

	/**
	* Sets the bang cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param bangCapNguoiDieuHanh the bang cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setBangCapNguoiDieuHanh(java.lang.String bangCapNguoiDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setBangCapNguoiDieuHanh(bangCapNguoiDieuHanh);
	}

	/**
	* Returns the thoi gian bat dau dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the thoi gian bat dau dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.util.Date getThoiGianBatDauDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getThoiGianBatDauDieuHanh();
	}

	/**
	* Sets the thoi gian bat dau dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param thoiGianBatDauDieuHanh the thoi gian bat dau dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setThoiGianBatDauDieuHanh(java.util.Date thoiGianBatDauDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setThoiGianBatDauDieuHanh(thoiGianBatDauDieuHanh);
	}

	/**
	* Returns the thoi gian ket thuc dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the thoi gian ket thuc dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.util.Date getThoiGianKetThucDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getThoiGianKetThucDieuHanh();
	}

	/**
	* Sets the thoi gian ket thuc dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param thoiGianKetThucDieuHanh the thoi gian ket thuc dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setThoiGianKetThucDieuHanh(
		java.util.Date thoiGianKetThucDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setThoiGianKetThucDieuHanh(thoiGianKetThucDieuHanh);
	}

	/**
	* Returns the so giay phep nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the so giay phep nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getSoGiayPhepNguoiDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getSoGiayPhepNguoiDieuHanh();
	}

	/**
	* Sets the so giay phep nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param soGiayPhepNguoiDieuHanh the so giay phep nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setSoGiayPhepNguoiDieuHanh(
		java.lang.String soGiayPhepNguoiDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setSoGiayPhepNguoiDieuHanh(soGiayPhepNguoiDieuHanh);
	}

	/**
	* Returns the lan cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the lan cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public int getLanCapNguoiDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getLanCapNguoiDieuHanh();
	}

	/**
	* Sets the lan cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param lanCapNguoiDieuHanh the lan cap nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setLanCapNguoiDieuHanh(int lanCapNguoiDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setLanCapNguoiDieuHanh(lanCapNguoiDieuHanh);
	}

	/**
	* Returns the ngay cap cc dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ngay cap cc dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.util.Date getNgayCapCcDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getNgayCapCcDieuHanh();
	}

	/**
	* Sets the ngay cap cc dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param ngayCapCcDieuHanh the ngay cap cc dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setNgayCapCcDieuHanh(java.util.Date ngayCapCcDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setNgayCapCcDieuHanh(ngayCapCcDieuHanh);
	}

	/**
	* Returns the ngay het han cc dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ngay het han cc dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.util.Date getNgayHetHanCcDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getNgayHetHanCcDieuHanh();
	}

	/**
	* Sets the ngay het han cc dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param ngayHetHanCcDieuHanh the ngay het han cc dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setNgayHetHanCcDieuHanh(java.util.Date ngayHetHanCcDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setNgayHetHanCcDieuHanh(ngayHetHanCcDieuHanh);
	}

	/**
	* Returns the ket qua xu ly of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ket qua xu ly of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtXuLyGpkdvtBangOto.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this qlvt xu ly gpkdvt bang oto.
	*
	* @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtXuLyGpkdvtBangOto.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the ly do khong dat of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ly do khong dat of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtXuLyGpkdvtBangOto.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this qlvt xu ly gpkdvt bang oto.
	*
	* @param lyDoKhongDat the ly do khong dat of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtXuLyGpkdvtBangOto.setLyDoKhongDat(lyDoKhongDat);
	}

	/**
	* Returns the ket qua xu ly nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ket qua xu ly nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getKetQuaXuLyNguoiDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getKetQuaXuLyNguoiDieuHanh();
	}

	/**
	* Sets the ket qua xu ly nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param ketQuaXuLyNguoiDieuHanh the ket qua xu ly nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setKetQuaXuLyNguoiDieuHanh(
		java.lang.String ketQuaXuLyNguoiDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setKetQuaXuLyNguoiDieuHanh(ketQuaXuLyNguoiDieuHanh);
	}

	/**
	* Returns the ly do khong dat nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @return the ly do khong dat nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public java.lang.String getLyDoKhongDatNguoiDieuHanh() {
		return _qlvtXuLyGpkdvtBangOto.getLyDoKhongDatNguoiDieuHanh();
	}

	/**
	* Sets the ly do khong dat nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto.
	*
	* @param lyDoKhongDatNguoiDieuHanh the ly do khong dat nguoi dieu hanh of this qlvt xu ly gpkdvt bang oto
	*/
	@Override
	public void setLyDoKhongDatNguoiDieuHanh(
		java.lang.String lyDoKhongDatNguoiDieuHanh) {
		_qlvtXuLyGpkdvtBangOto.setLyDoKhongDatNguoiDieuHanh(lyDoKhongDatNguoiDieuHanh);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyGpkdvtBangOto.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyGpkdvtBangOto.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyGpkdvtBangOto.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyGpkdvtBangOto.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyGpkdvtBangOto.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyGpkdvtBangOto.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyGpkdvtBangOto.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyGpkdvtBangOto.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyGpkdvtBangOto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyGpkdvtBangOto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyGpkdvtBangOto.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtXuLyGpkdvtBangOtoWrapper((QlvtXuLyGpkdvtBangOto)_qlvtXuLyGpkdvtBangOto.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) {
		return _qlvtXuLyGpkdvtBangOto.compareTo(qlvtXuLyGpkdvtBangOto);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyGpkdvtBangOto.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto> toCacheModel() {
		return _qlvtXuLyGpkdvtBangOto.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto toEscapedModel() {
		return new QlvtXuLyGpkdvtBangOtoWrapper(_qlvtXuLyGpkdvtBangOto.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto toUnescapedModel() {
		return new QlvtXuLyGpkdvtBangOtoWrapper(_qlvtXuLyGpkdvtBangOto.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyGpkdvtBangOto.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyGpkdvtBangOto.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyGpkdvtBangOto.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtXuLyGpkdvtBangOtoWrapper)) {
			return false;
		}

		QlvtXuLyGpkdvtBangOtoWrapper qlvtXuLyGpkdvtBangOtoWrapper = (QlvtXuLyGpkdvtBangOtoWrapper)obj;

		if (Validator.equals(_qlvtXuLyGpkdvtBangOto,
					qlvtXuLyGpkdvtBangOtoWrapper._qlvtXuLyGpkdvtBangOto)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtXuLyGpkdvtBangOto getWrappedQlvtXuLyGpkdvtBangOto() {
		return _qlvtXuLyGpkdvtBangOto;
	}

	@Override
	public QlvtXuLyGpkdvtBangOto getWrappedModel() {
		return _qlvtXuLyGpkdvtBangOto;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyGpkdvtBangOto.resetOriginalValues();
	}

	private QlvtXuLyGpkdvtBangOto _qlvtXuLyGpkdvtBangOto;
}