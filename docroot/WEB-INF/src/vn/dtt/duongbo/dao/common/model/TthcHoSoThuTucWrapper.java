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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcHoSoThuTuc}.
 * </p>
 *
 * @author win_64
 * @see TthcHoSoThuTuc
 * @generated
 */
public class TthcHoSoThuTucWrapper implements TthcHoSoThuTuc,
	ModelWrapper<TthcHoSoThuTuc> {
	public TthcHoSoThuTucWrapper(TthcHoSoThuTuc tthcHoSoThuTuc) {
		_tthcHoSoThuTuc = tthcHoSoThuTuc;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcHoSoThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return TthcHoSoThuTuc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("maBienNhan", getMaBienNhan());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("loaiChuHoSo", getLoaiChuHoSo());
		attributes.put("maSoChuHoSo", getMaSoChuHoSo());
		attributes.put("tenChuHoSo", getTenChuHoSo());
		attributes.put("diaChiChuHoSo", getDiaChiChuHoSo());
		attributes.put("maDonVi", getMaDonVi());
		attributes.put("nguonGocHoSo", getNguonGocHoSo());
		attributes.put("trichYeuNoiDung", getTrichYeuNoiDung());
		attributes.put("ngayGuiHoSo", getNgayGuiHoSo());
		attributes.put("ngayTiepNhan", getNgayTiepNhan());
		attributes.put("ngayBoSung", getNgayBoSung());
		attributes.put("ngayHenTra", getNgayHenTra());
		attributes.put("ngayTraKetQua", getNgayTraKetQua());
		attributes.put("ngayDongHoSo", getNgayDongHoSo());
		attributes.put("trangThaiHoSo", getTrangThaiHoSo());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("maTinhThanh", getMaTinhThanh());
		attributes.put("maQuanHuyen", getMaQuanHuyen());
		attributes.put("maPhuongXa", getMaPhuongXa());
		attributes.put("thongBaoXuLy", getThongBaoXuLy());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("nguoiLamThuTucId", getNguoiLamThuTucId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maSoHoSo = (String)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		String maBienNhan = (String)attributes.get("maBienNhan");

		if (maBienNhan != null) {
			setMaBienNhan(maBienNhan);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		Long loaiChuHoSo = (Long)attributes.get("loaiChuHoSo");

		if (loaiChuHoSo != null) {
			setLoaiChuHoSo(loaiChuHoSo);
		}

		String maSoChuHoSo = (String)attributes.get("maSoChuHoSo");

		if (maSoChuHoSo != null) {
			setMaSoChuHoSo(maSoChuHoSo);
		}

		String tenChuHoSo = (String)attributes.get("tenChuHoSo");

		if (tenChuHoSo != null) {
			setTenChuHoSo(tenChuHoSo);
		}

		String diaChiChuHoSo = (String)attributes.get("diaChiChuHoSo");

		if (diaChiChuHoSo != null) {
			setDiaChiChuHoSo(diaChiChuHoSo);
		}

		String maDonVi = (String)attributes.get("maDonVi");

		if (maDonVi != null) {
			setMaDonVi(maDonVi);
		}

		String nguonGocHoSo = (String)attributes.get("nguonGocHoSo");

		if (nguonGocHoSo != null) {
			setNguonGocHoSo(nguonGocHoSo);
		}

		String trichYeuNoiDung = (String)attributes.get("trichYeuNoiDung");

		if (trichYeuNoiDung != null) {
			setTrichYeuNoiDung(trichYeuNoiDung);
		}

		Date ngayGuiHoSo = (Date)attributes.get("ngayGuiHoSo");

		if (ngayGuiHoSo != null) {
			setNgayGuiHoSo(ngayGuiHoSo);
		}

		Date ngayTiepNhan = (Date)attributes.get("ngayTiepNhan");

		if (ngayTiepNhan != null) {
			setNgayTiepNhan(ngayTiepNhan);
		}

		Date ngayBoSung = (Date)attributes.get("ngayBoSung");

		if (ngayBoSung != null) {
			setNgayBoSung(ngayBoSung);
		}

		Date ngayHenTra = (Date)attributes.get("ngayHenTra");

		if (ngayHenTra != null) {
			setNgayHenTra(ngayHenTra);
		}

		Date ngayTraKetQua = (Date)attributes.get("ngayTraKetQua");

		if (ngayTraKetQua != null) {
			setNgayTraKetQua(ngayTraKetQua);
		}

		Date ngayDongHoSo = (Date)attributes.get("ngayDongHoSo");

		if (ngayDongHoSo != null) {
			setNgayDongHoSo(ngayDongHoSo);
		}

		String trangThaiHoSo = (String)attributes.get("trangThaiHoSo");

		if (trangThaiHoSo != null) {
			setTrangThaiHoSo(trangThaiHoSo);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		String maTinhThanh = (String)attributes.get("maTinhThanh");

		if (maTinhThanh != null) {
			setMaTinhThanh(maTinhThanh);
		}

		String maQuanHuyen = (String)attributes.get("maQuanHuyen");

		if (maQuanHuyen != null) {
			setMaQuanHuyen(maQuanHuyen);
		}

		String maPhuongXa = (String)attributes.get("maPhuongXa");

		if (maPhuongXa != null) {
			setMaPhuongXa(maPhuongXa);
		}

		String thongBaoXuLy = (String)attributes.get("thongBaoXuLy");

		if (thongBaoXuLy != null) {
			setThongBaoXuLy(thongBaoXuLy);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long nguoiLamThuTucId = (Long)attributes.get("nguoiLamThuTucId");

		if (nguoiLamThuTucId != null) {
			setNguoiLamThuTucId(nguoiLamThuTucId);
		}
	}

	/**
	* Returns the primary key of this tthc ho so thu tuc.
	*
	* @return the primary key of this tthc ho so thu tuc
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcHoSoThuTuc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc ho so thu tuc.
	*
	* @param primaryKey the primary key of this tthc ho so thu tuc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcHoSoThuTuc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc ho so thu tuc.
	*
	* @return the ID of this tthc ho so thu tuc
	*/
	@Override
	public long getId() {
		return _tthcHoSoThuTuc.getId();
	}

	/**
	* Sets the ID of this tthc ho so thu tuc.
	*
	* @param id the ID of this tthc ho so thu tuc
	*/
	@Override
	public void setId(long id) {
		_tthcHoSoThuTuc.setId(id);
	}

	/**
	* Returns the ma so ho so of this tthc ho so thu tuc.
	*
	* @return the ma so ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _tthcHoSoThuTuc.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this tthc ho so thu tuc.
	*
	* @param maSoHoSo the ma so ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setMaSoHoSo(java.lang.String maSoHoSo) {
		_tthcHoSoThuTuc.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the ma bien nhan of this tthc ho so thu tuc.
	*
	* @return the ma bien nhan of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaBienNhan() {
		return _tthcHoSoThuTuc.getMaBienNhan();
	}

	/**
	* Sets the ma bien nhan of this tthc ho so thu tuc.
	*
	* @param maBienNhan the ma bien nhan of this tthc ho so thu tuc
	*/
	@Override
	public void setMaBienNhan(java.lang.String maBienNhan) {
		_tthcHoSoThuTuc.setMaBienNhan(maBienNhan);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this tthc ho so thu tuc.
	*
	* @return the thu tuc hanh chinh ID of this tthc ho so thu tuc
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _tthcHoSoThuTuc.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this tthc ho so thu tuc.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this tthc ho so thu tuc
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_tthcHoSoThuTuc.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the loai chu ho so of this tthc ho so thu tuc.
	*
	* @return the loai chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public long getLoaiChuHoSo() {
		return _tthcHoSoThuTuc.getLoaiChuHoSo();
	}

	/**
	* Sets the loai chu ho so of this tthc ho so thu tuc.
	*
	* @param loaiChuHoSo the loai chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setLoaiChuHoSo(long loaiChuHoSo) {
		_tthcHoSoThuTuc.setLoaiChuHoSo(loaiChuHoSo);
	}

	/**
	* Returns the ma so chu ho so of this tthc ho so thu tuc.
	*
	* @return the ma so chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaSoChuHoSo() {
		return _tthcHoSoThuTuc.getMaSoChuHoSo();
	}

	/**
	* Sets the ma so chu ho so of this tthc ho so thu tuc.
	*
	* @param maSoChuHoSo the ma so chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setMaSoChuHoSo(java.lang.String maSoChuHoSo) {
		_tthcHoSoThuTuc.setMaSoChuHoSo(maSoChuHoSo);
	}

	/**
	* Returns the ten chu ho so of this tthc ho so thu tuc.
	*
	* @return the ten chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getTenChuHoSo() {
		return _tthcHoSoThuTuc.getTenChuHoSo();
	}

	/**
	* Sets the ten chu ho so of this tthc ho so thu tuc.
	*
	* @param tenChuHoSo the ten chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setTenChuHoSo(java.lang.String tenChuHoSo) {
		_tthcHoSoThuTuc.setTenChuHoSo(tenChuHoSo);
	}

	/**
	* Returns the dia chi chu ho so of this tthc ho so thu tuc.
	*
	* @return the dia chi chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getDiaChiChuHoSo() {
		return _tthcHoSoThuTuc.getDiaChiChuHoSo();
	}

	/**
	* Sets the dia chi chu ho so of this tthc ho so thu tuc.
	*
	* @param diaChiChuHoSo the dia chi chu ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setDiaChiChuHoSo(java.lang.String diaChiChuHoSo) {
		_tthcHoSoThuTuc.setDiaChiChuHoSo(diaChiChuHoSo);
	}

	/**
	* Returns the ma don vi of this tthc ho so thu tuc.
	*
	* @return the ma don vi of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaDonVi() {
		return _tthcHoSoThuTuc.getMaDonVi();
	}

	/**
	* Sets the ma don vi of this tthc ho so thu tuc.
	*
	* @param maDonVi the ma don vi of this tthc ho so thu tuc
	*/
	@Override
	public void setMaDonVi(java.lang.String maDonVi) {
		_tthcHoSoThuTuc.setMaDonVi(maDonVi);
	}

	/**
	* Returns the nguon goc ho so of this tthc ho so thu tuc.
	*
	* @return the nguon goc ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getNguonGocHoSo() {
		return _tthcHoSoThuTuc.getNguonGocHoSo();
	}

	/**
	* Sets the nguon goc ho so of this tthc ho so thu tuc.
	*
	* @param nguonGocHoSo the nguon goc ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setNguonGocHoSo(java.lang.String nguonGocHoSo) {
		_tthcHoSoThuTuc.setNguonGocHoSo(nguonGocHoSo);
	}

	/**
	* Returns the trich yeu noi dung of this tthc ho so thu tuc.
	*
	* @return the trich yeu noi dung of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getTrichYeuNoiDung() {
		return _tthcHoSoThuTuc.getTrichYeuNoiDung();
	}

	/**
	* Sets the trich yeu noi dung of this tthc ho so thu tuc.
	*
	* @param trichYeuNoiDung the trich yeu noi dung of this tthc ho so thu tuc
	*/
	@Override
	public void setTrichYeuNoiDung(java.lang.String trichYeuNoiDung) {
		_tthcHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
	}

	/**
	* Returns the ngay gui ho so of this tthc ho so thu tuc.
	*
	* @return the ngay gui ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayGuiHoSo() {
		return _tthcHoSoThuTuc.getNgayGuiHoSo();
	}

	/**
	* Sets the ngay gui ho so of this tthc ho so thu tuc.
	*
	* @param ngayGuiHoSo the ngay gui ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayGuiHoSo(java.util.Date ngayGuiHoSo) {
		_tthcHoSoThuTuc.setNgayGuiHoSo(ngayGuiHoSo);
	}

	/**
	* Returns the ngay tiep nhan of this tthc ho so thu tuc.
	*
	* @return the ngay tiep nhan of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayTiepNhan() {
		return _tthcHoSoThuTuc.getNgayTiepNhan();
	}

	/**
	* Sets the ngay tiep nhan of this tthc ho so thu tuc.
	*
	* @param ngayTiepNhan the ngay tiep nhan of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayTiepNhan(java.util.Date ngayTiepNhan) {
		_tthcHoSoThuTuc.setNgayTiepNhan(ngayTiepNhan);
	}

	/**
	* Returns the ngay bo sung of this tthc ho so thu tuc.
	*
	* @return the ngay bo sung of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayBoSung() {
		return _tthcHoSoThuTuc.getNgayBoSung();
	}

	/**
	* Sets the ngay bo sung of this tthc ho so thu tuc.
	*
	* @param ngayBoSung the ngay bo sung of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayBoSung(java.util.Date ngayBoSung) {
		_tthcHoSoThuTuc.setNgayBoSung(ngayBoSung);
	}

	/**
	* Returns the ngay hen tra of this tthc ho so thu tuc.
	*
	* @return the ngay hen tra of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayHenTra() {
		return _tthcHoSoThuTuc.getNgayHenTra();
	}

	/**
	* Sets the ngay hen tra of this tthc ho so thu tuc.
	*
	* @param ngayHenTra the ngay hen tra of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayHenTra(java.util.Date ngayHenTra) {
		_tthcHoSoThuTuc.setNgayHenTra(ngayHenTra);
	}

	/**
	* Returns the ngay tra ket qua of this tthc ho so thu tuc.
	*
	* @return the ngay tra ket qua of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayTraKetQua() {
		return _tthcHoSoThuTuc.getNgayTraKetQua();
	}

	/**
	* Sets the ngay tra ket qua of this tthc ho so thu tuc.
	*
	* @param ngayTraKetQua the ngay tra ket qua of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayTraKetQua(java.util.Date ngayTraKetQua) {
		_tthcHoSoThuTuc.setNgayTraKetQua(ngayTraKetQua);
	}

	/**
	* Returns the ngay dong ho so of this tthc ho so thu tuc.
	*
	* @return the ngay dong ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayDongHoSo() {
		return _tthcHoSoThuTuc.getNgayDongHoSo();
	}

	/**
	* Sets the ngay dong ho so of this tthc ho so thu tuc.
	*
	* @param ngayDongHoSo the ngay dong ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayDongHoSo(java.util.Date ngayDongHoSo) {
		_tthcHoSoThuTuc.setNgayDongHoSo(ngayDongHoSo);
	}

	/**
	* Returns the trang thai ho so of this tthc ho so thu tuc.
	*
	* @return the trang thai ho so of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getTrangThaiHoSo() {
		return _tthcHoSoThuTuc.getTrangThaiHoSo();
	}

	/**
	* Sets the trang thai ho so of this tthc ho so thu tuc.
	*
	* @param trangThaiHoSo the trang thai ho so of this tthc ho so thu tuc
	*/
	@Override
	public void setTrangThaiHoSo(java.lang.String trangThaiHoSo) {
		_tthcHoSoThuTuc.setTrangThaiHoSo(trangThaiHoSo);
	}

	/**
	* Returns the phan nhom ho so ID of this tthc ho so thu tuc.
	*
	* @return the phan nhom ho so ID of this tthc ho so thu tuc
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _tthcHoSoThuTuc.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this tthc ho so thu tuc.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this tthc ho so thu tuc
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_tthcHoSoThuTuc.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the ma tinh thanh of this tthc ho so thu tuc.
	*
	* @return the ma tinh thanh of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaTinhThanh() {
		return _tthcHoSoThuTuc.getMaTinhThanh();
	}

	/**
	* Sets the ma tinh thanh of this tthc ho so thu tuc.
	*
	* @param maTinhThanh the ma tinh thanh of this tthc ho so thu tuc
	*/
	@Override
	public void setMaTinhThanh(java.lang.String maTinhThanh) {
		_tthcHoSoThuTuc.setMaTinhThanh(maTinhThanh);
	}

	/**
	* Returns the ma quan huyen of this tthc ho so thu tuc.
	*
	* @return the ma quan huyen of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaQuanHuyen() {
		return _tthcHoSoThuTuc.getMaQuanHuyen();
	}

	/**
	* Sets the ma quan huyen of this tthc ho so thu tuc.
	*
	* @param maQuanHuyen the ma quan huyen of this tthc ho so thu tuc
	*/
	@Override
	public void setMaQuanHuyen(java.lang.String maQuanHuyen) {
		_tthcHoSoThuTuc.setMaQuanHuyen(maQuanHuyen);
	}

	/**
	* Returns the ma phuong xa of this tthc ho so thu tuc.
	*
	* @return the ma phuong xa of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getMaPhuongXa() {
		return _tthcHoSoThuTuc.getMaPhuongXa();
	}

	/**
	* Sets the ma phuong xa of this tthc ho so thu tuc.
	*
	* @param maPhuongXa the ma phuong xa of this tthc ho so thu tuc
	*/
	@Override
	public void setMaPhuongXa(java.lang.String maPhuongXa) {
		_tthcHoSoThuTuc.setMaPhuongXa(maPhuongXa);
	}

	/**
	* Returns the thong bao xu ly of this tthc ho so thu tuc.
	*
	* @return the thong bao xu ly of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getThongBaoXuLy() {
		return _tthcHoSoThuTuc.getThongBaoXuLy();
	}

	/**
	* Sets the thong bao xu ly of this tthc ho so thu tuc.
	*
	* @param thongBaoXuLy the thong bao xu ly of this tthc ho so thu tuc
	*/
	@Override
	public void setThongBaoXuLy(java.lang.String thongBaoXuLy) {
		_tthcHoSoThuTuc.setThongBaoXuLy(thongBaoXuLy);
	}

	/**
	* Returns the to chuc quan ly of this tthc ho so thu tuc.
	*
	* @return the to chuc quan ly of this tthc ho so thu tuc
	*/
	@Override
	public long getToChucQuanLy() {
		return _tthcHoSoThuTuc.getToChucQuanLy();
	}

	/**
	* Sets the to chuc quan ly of this tthc ho so thu tuc.
	*
	* @param toChucQuanLy the to chuc quan ly of this tthc ho so thu tuc
	*/
	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_tthcHoSoThuTuc.setToChucQuanLy(toChucQuanLy);
	}

	/**
	* Returns the ngay tao of this tthc ho so thu tuc.
	*
	* @return the ngay tao of this tthc ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _tthcHoSoThuTuc.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tthc ho so thu tuc.
	*
	* @param ngayTao the ngay tao of this tthc ho so thu tuc
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_tthcHoSoThuTuc.setNgayTao(ngayTao);
	}

	/**
	* Returns the nguoi tao of this tthc ho so thu tuc.
	*
	* @return the nguoi tao of this tthc ho so thu tuc
	*/
	@Override
	public long getNguoiTao() {
		return _tthcHoSoThuTuc.getNguoiTao();
	}

	/**
	* Sets the nguoi tao of this tthc ho so thu tuc.
	*
	* @param nguoiTao the nguoi tao of this tthc ho so thu tuc
	*/
	@Override
	public void setNguoiTao(long nguoiTao) {
		_tthcHoSoThuTuc.setNguoiTao(nguoiTao);
	}

	/**
	* Returns the ghi chu of this tthc ho so thu tuc.
	*
	* @return the ghi chu of this tthc ho so thu tuc
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _tthcHoSoThuTuc.getGhiChu();
	}

	/**
	* Sets the ghi chu of this tthc ho so thu tuc.
	*
	* @param ghiChu the ghi chu of this tthc ho so thu tuc
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_tthcHoSoThuTuc.setGhiChu(ghiChu);
	}

	/**
	* Returns the nguoi lam thu tuc ID of this tthc ho so thu tuc.
	*
	* @return the nguoi lam thu tuc ID of this tthc ho so thu tuc
	*/
	@Override
	public long getNguoiLamThuTucId() {
		return _tthcHoSoThuTuc.getNguoiLamThuTucId();
	}

	/**
	* Sets the nguoi lam thu tuc ID of this tthc ho so thu tuc.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID of this tthc ho so thu tuc
	*/
	@Override
	public void setNguoiLamThuTucId(long nguoiLamThuTucId) {
		_tthcHoSoThuTuc.setNguoiLamThuTucId(nguoiLamThuTucId);
	}

	@Override
	public boolean isNew() {
		return _tthcHoSoThuTuc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcHoSoThuTuc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcHoSoThuTuc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcHoSoThuTuc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcHoSoThuTuc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcHoSoThuTuc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcHoSoThuTuc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcHoSoThuTuc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcHoSoThuTuc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcHoSoThuTuc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcHoSoThuTuc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcHoSoThuTucWrapper((TthcHoSoThuTuc)_tthcHoSoThuTuc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc) {
		return _tthcHoSoThuTuc.compareTo(tthcHoSoThuTuc);
	}

	@Override
	public int hashCode() {
		return _tthcHoSoThuTuc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> toCacheModel() {
		return _tthcHoSoThuTuc.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc toEscapedModel() {
		return new TthcHoSoThuTucWrapper(_tthcHoSoThuTuc.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc toUnescapedModel() {
		return new TthcHoSoThuTucWrapper(_tthcHoSoThuTuc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcHoSoThuTuc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcHoSoThuTuc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcHoSoThuTuc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcHoSoThuTucWrapper)) {
			return false;
		}

		TthcHoSoThuTucWrapper tthcHoSoThuTucWrapper = (TthcHoSoThuTucWrapper)obj;

		if (Validator.equals(_tthcHoSoThuTuc,
					tthcHoSoThuTucWrapper._tthcHoSoThuTuc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcHoSoThuTuc getWrappedTthcHoSoThuTuc() {
		return _tthcHoSoThuTuc;
	}

	@Override
	public TthcHoSoThuTuc getWrappedModel() {
		return _tthcHoSoThuTuc;
	}

	@Override
	public void resetOriginalValues() {
		_tthcHoSoThuTuc.resetOriginalValues();
	}

	private TthcHoSoThuTuc _tthcHoSoThuTuc;
}