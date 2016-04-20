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
 * This class is a wrapper for {@link QLVTXuLyPhuHieuPhuongTien}.
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPhuongTien
 * @generated
 */
public class QLVTXuLyPhuHieuPhuongTienWrapper
	implements QLVTXuLyPhuHieuPhuongTien,
		ModelWrapper<QLVTXuLyPhuHieuPhuongTien> {
	public QLVTXuLyPhuHieuPhuongTienWrapper(
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien) {
		_qlvtXuLyPhuHieuPhuongTien = qlvtXuLyPhuHieuPhuongTien;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyPhuHieuPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyPhuHieuPhuongTien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("capPhuHieuID", getCapPhuHieuID());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("bienSo", getBienSo());
		attributes.put("trongTai", getTrongTai());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("noiSanXuat", getNoiSanXuat());
		attributes.put("namSanXuat", getNamSanXuat());
		attributes.put("maTuyenCoDinh", getMaTuyenCoDinh());
		attributes.put("loaiTuyen", getLoaiTuyen());
		attributes.put("hinhThucSoHuuXe", getHinhThucSoHuuXe());
		attributes.put("linhVucKinhDoanhXeDuLich", getLinhVucKinhDoanhXeDuLich());
		attributes.put("nienHanSuDungGiayDangKiem",
			getNienHanSuDungGiayDangKiem());
		attributes.put("nienHanSuDungND86", getNienHanSuDungND86());
		attributes.put("doanhNghiepSoHuuThue", getDoanhNghiepSoHuuThue());
		attributes.put("thoiHanThue", getThoiHanThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("soPhuHieuDuocCap", getSoPhuHieuDuocCap());
		attributes.put("thoiHanDuocCapPhep", getThoiHanDuocCapPhep());
		attributes.put("loaiPhuHieuXinCap", getLoaiPhuHieuXinCap());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("coGiaTriDen", getCoGiaTriDen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer capPhuHieuID = (Integer)attributes.get("capPhuHieuID");

		if (capPhuHieuID != null) {
			setCapPhuHieuID(capPhuHieuID);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		String bienSo = (String)attributes.get("bienSo");

		if (bienSo != null) {
			setBienSo(bienSo);
		}

		Integer trongTai = (Integer)attributes.get("trongTai");

		if (trongTai != null) {
			setTrongTai(trongTai);
		}

		Integer soChoNgoi = (Integer)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
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

		String loaiTuyen = (String)attributes.get("loaiTuyen");

		if (loaiTuyen != null) {
			setLoaiTuyen(loaiTuyen);
		}

		String hinhThucSoHuuXe = (String)attributes.get("hinhThucSoHuuXe");

		if (hinhThucSoHuuXe != null) {
			setHinhThucSoHuuXe(hinhThucSoHuuXe);
		}

		String linhVucKinhDoanhXeDuLich = (String)attributes.get(
				"linhVucKinhDoanhXeDuLich");

		if (linhVucKinhDoanhXeDuLich != null) {
			setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
		}

		Integer nienHanSuDungGiayDangKiem = (Integer)attributes.get(
				"nienHanSuDungGiayDangKiem");

		if (nienHanSuDungGiayDangKiem != null) {
			setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
		}

		Integer nienHanSuDungND86 = (Integer)attributes.get("nienHanSuDungND86");

		if (nienHanSuDungND86 != null) {
			setNienHanSuDungND86(nienHanSuDungND86);
		}

		String doanhNghiepSoHuuThue = (String)attributes.get(
				"doanhNghiepSoHuuThue");

		if (doanhNghiepSoHuuThue != null) {
			setDoanhNghiepSoHuuThue(doanhNghiepSoHuuThue);
		}

		Date thoiHanThue = (Date)attributes.get("thoiHanThue");

		if (thoiHanThue != null) {
			setThoiHanThue(thoiHanThue);
		}

		Integer hopDongSauCung = (Integer)attributes.get("hopDongSauCung");

		if (hopDongSauCung != null) {
			setHopDongSauCung(hopDongSauCung);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String soPhuHieuDuocCap = (String)attributes.get("soPhuHieuDuocCap");

		if (soPhuHieuDuocCap != null) {
			setSoPhuHieuDuocCap(soPhuHieuDuocCap);
		}

		Date thoiHanDuocCapPhep = (Date)attributes.get("thoiHanDuocCapPhep");

		if (thoiHanDuocCapPhep != null) {
			setThoiHanDuocCapPhep(thoiHanDuocCapPhep);
		}

		String loaiPhuHieuXinCap = (String)attributes.get("loaiPhuHieuXinCap");

		if (loaiPhuHieuXinCap != null) {
			setLoaiPhuHieuXinCap(loaiPhuHieuXinCap);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		Date coGiaTriDen = (Date)attributes.get("coGiaTriDen");

		if (coGiaTriDen != null) {
			setCoGiaTriDen(coGiaTriDen);
		}
	}

	/**
	* Returns the primary key of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the primary key of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtXuLyPhuHieuPhuongTien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t xu ly phu hieu phuong tien.
	*
	* @param primaryKey the primary key of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtXuLyPhuHieuPhuongTien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the ID of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public int getId() {
		return _qlvtXuLyPhuHieuPhuongTien.getId();
	}

	/**
	* Sets the ID of this q l v t xu ly phu hieu phuong tien.
	*
	* @param id the ID of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setId(int id) {
		_qlvtXuLyPhuHieuPhuongTien.setId(id);
	}

	/**
	* Returns the cap phu hieu i d of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the cap phu hieu i d of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public int getCapPhuHieuID() {
		return _qlvtXuLyPhuHieuPhuongTien.getCapPhuHieuID();
	}

	/**
	* Sets the cap phu hieu i d of this q l v t xu ly phu hieu phuong tien.
	*
	* @param capPhuHieuID the cap phu hieu i d of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setCapPhuHieuID(int capPhuHieuID) {
		_qlvtXuLyPhuHieuPhuongTien.setCapPhuHieuID(capPhuHieuID);
	}

	/**
	* Returns the nhan hieu of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the nhan hieu of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtXuLyPhuHieuPhuongTien.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this q l v t xu ly phu hieu phuong tien.
	*
	* @param nhanHieu the nhan hieu of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setNhanHieu(java.lang.String nhanHieu) {
		_qlvtXuLyPhuHieuPhuongTien.setNhanHieu(nhanHieu);
	}

	/**
	* Returns the bien so of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the bien so of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getBienSo() {
		return _qlvtXuLyPhuHieuPhuongTien.getBienSo();
	}

	/**
	* Sets the bien so of this q l v t xu ly phu hieu phuong tien.
	*
	* @param bienSo the bien so of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setBienSo(java.lang.String bienSo) {
		_qlvtXuLyPhuHieuPhuongTien.setBienSo(bienSo);
	}

	/**
	* Returns the trong tai of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the trong tai of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public int getTrongTai() {
		return _qlvtXuLyPhuHieuPhuongTien.getTrongTai();
	}

	/**
	* Sets the trong tai of this q l v t xu ly phu hieu phuong tien.
	*
	* @param trongTai the trong tai of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setTrongTai(int trongTai) {
		_qlvtXuLyPhuHieuPhuongTien.setTrongTai(trongTai);
	}

	/**
	* Returns the so cho ngoi of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the so cho ngoi of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public int getSoChoNgoi() {
		return _qlvtXuLyPhuHieuPhuongTien.getSoChoNgoi();
	}

	/**
	* Sets the so cho ngoi of this q l v t xu ly phu hieu phuong tien.
	*
	* @param soChoNgoi the so cho ngoi of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setSoChoNgoi(int soChoNgoi) {
		_qlvtXuLyPhuHieuPhuongTien.setSoChoNgoi(soChoNgoi);
	}

	/**
	* Returns the noi san xuat of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the noi san xuat of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getNoiSanXuat() {
		return _qlvtXuLyPhuHieuPhuongTien.getNoiSanXuat();
	}

	/**
	* Sets the noi san xuat of this q l v t xu ly phu hieu phuong tien.
	*
	* @param noiSanXuat the noi san xuat of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setNoiSanXuat(java.lang.String noiSanXuat) {
		_qlvtXuLyPhuHieuPhuongTien.setNoiSanXuat(noiSanXuat);
	}

	/**
	* Returns the nam san xuat of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the nam san xuat of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public int getNamSanXuat() {
		return _qlvtXuLyPhuHieuPhuongTien.getNamSanXuat();
	}

	/**
	* Sets the nam san xuat of this q l v t xu ly phu hieu phuong tien.
	*
	* @param namSanXuat the nam san xuat of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setNamSanXuat(int namSanXuat) {
		_qlvtXuLyPhuHieuPhuongTien.setNamSanXuat(namSanXuat);
	}

	/**
	* Returns the ma tuyen co dinh of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the ma tuyen co dinh of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getMaTuyenCoDinh() {
		return _qlvtXuLyPhuHieuPhuongTien.getMaTuyenCoDinh();
	}

	/**
	* Sets the ma tuyen co dinh of this q l v t xu ly phu hieu phuong tien.
	*
	* @param maTuyenCoDinh the ma tuyen co dinh of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setMaTuyenCoDinh(java.lang.String maTuyenCoDinh) {
		_qlvtXuLyPhuHieuPhuongTien.setMaTuyenCoDinh(maTuyenCoDinh);
	}

	/**
	* Returns the loai tuyen of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the loai tuyen of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getLoaiTuyen() {
		return _qlvtXuLyPhuHieuPhuongTien.getLoaiTuyen();
	}

	/**
	* Sets the loai tuyen of this q l v t xu ly phu hieu phuong tien.
	*
	* @param loaiTuyen the loai tuyen of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setLoaiTuyen(java.lang.String loaiTuyen) {
		_qlvtXuLyPhuHieuPhuongTien.setLoaiTuyen(loaiTuyen);
	}

	/**
	* Returns the hinh thuc so huu xe of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the hinh thuc so huu xe of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getHinhThucSoHuuXe() {
		return _qlvtXuLyPhuHieuPhuongTien.getHinhThucSoHuuXe();
	}

	/**
	* Sets the hinh thuc so huu xe of this q l v t xu ly phu hieu phuong tien.
	*
	* @param hinhThucSoHuuXe the hinh thuc so huu xe of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setHinhThucSoHuuXe(java.lang.String hinhThucSoHuuXe) {
		_qlvtXuLyPhuHieuPhuongTien.setHinhThucSoHuuXe(hinhThucSoHuuXe);
	}

	/**
	* Returns the linh vuc kinh doanh xe du lich of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the linh vuc kinh doanh xe du lich of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getLinhVucKinhDoanhXeDuLich() {
		return _qlvtXuLyPhuHieuPhuongTien.getLinhVucKinhDoanhXeDuLich();
	}

	/**
	* Sets the linh vuc kinh doanh xe du lich of this q l v t xu ly phu hieu phuong tien.
	*
	* @param linhVucKinhDoanhXeDuLich the linh vuc kinh doanh xe du lich of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setLinhVucKinhDoanhXeDuLich(
		java.lang.String linhVucKinhDoanhXeDuLich) {
		_qlvtXuLyPhuHieuPhuongTien.setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
	}

	/**
	* Returns the nien han su dung giay dang kiem of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the nien han su dung giay dang kiem of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public int getNienHanSuDungGiayDangKiem() {
		return _qlvtXuLyPhuHieuPhuongTien.getNienHanSuDungGiayDangKiem();
	}

	/**
	* Sets the nien han su dung giay dang kiem of this q l v t xu ly phu hieu phuong tien.
	*
	* @param nienHanSuDungGiayDangKiem the nien han su dung giay dang kiem of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem) {
		_qlvtXuLyPhuHieuPhuongTien.setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
	}

	/**
	* Returns the nien han su dung n d86 of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the nien han su dung n d86 of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public int getNienHanSuDungND86() {
		return _qlvtXuLyPhuHieuPhuongTien.getNienHanSuDungND86();
	}

	/**
	* Sets the nien han su dung n d86 of this q l v t xu ly phu hieu phuong tien.
	*
	* @param nienHanSuDungND86 the nien han su dung n d86 of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setNienHanSuDungND86(int nienHanSuDungND86) {
		_qlvtXuLyPhuHieuPhuongTien.setNienHanSuDungND86(nienHanSuDungND86);
	}

	/**
	* Returns the doanh nghiep so huu thue of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the doanh nghiep so huu thue of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getDoanhNghiepSoHuuThue() {
		return _qlvtXuLyPhuHieuPhuongTien.getDoanhNghiepSoHuuThue();
	}

	/**
	* Sets the doanh nghiep so huu thue of this q l v t xu ly phu hieu phuong tien.
	*
	* @param doanhNghiepSoHuuThue the doanh nghiep so huu thue of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setDoanhNghiepSoHuuThue(java.lang.String doanhNghiepSoHuuThue) {
		_qlvtXuLyPhuHieuPhuongTien.setDoanhNghiepSoHuuThue(doanhNghiepSoHuuThue);
	}

	/**
	* Returns the thoi han thue of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the thoi han thue of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.util.Date getThoiHanThue() {
		return _qlvtXuLyPhuHieuPhuongTien.getThoiHanThue();
	}

	/**
	* Sets the thoi han thue of this q l v t xu ly phu hieu phuong tien.
	*
	* @param thoiHanThue the thoi han thue of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setThoiHanThue(java.util.Date thoiHanThue) {
		_qlvtXuLyPhuHieuPhuongTien.setThoiHanThue(thoiHanThue);
	}

	/**
	* Returns the hop dong sau cung of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the hop dong sau cung of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public int getHopDongSauCung() {
		return _qlvtXuLyPhuHieuPhuongTien.getHopDongSauCung();
	}

	/**
	* Sets the hop dong sau cung of this q l v t xu ly phu hieu phuong tien.
	*
	* @param hopDongSauCung the hop dong sau cung of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setHopDongSauCung(int hopDongSauCung) {
		_qlvtXuLyPhuHieuPhuongTien.setHopDongSauCung(hopDongSauCung);
	}

	/**
	* Returns the ket qua xu ly of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the ket qua xu ly of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtXuLyPhuHieuPhuongTien.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this q l v t xu ly phu hieu phuong tien.
	*
	* @param ketQuaXuLy the ket qua xu ly of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtXuLyPhuHieuPhuongTien.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the so phu hieu duoc cap of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the so phu hieu duoc cap of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getSoPhuHieuDuocCap() {
		return _qlvtXuLyPhuHieuPhuongTien.getSoPhuHieuDuocCap();
	}

	/**
	* Sets the so phu hieu duoc cap of this q l v t xu ly phu hieu phuong tien.
	*
	* @param soPhuHieuDuocCap the so phu hieu duoc cap of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setSoPhuHieuDuocCap(java.lang.String soPhuHieuDuocCap) {
		_qlvtXuLyPhuHieuPhuongTien.setSoPhuHieuDuocCap(soPhuHieuDuocCap);
	}

	/**
	* Returns the thoi han duoc cap phep of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the thoi han duoc cap phep of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.util.Date getThoiHanDuocCapPhep() {
		return _qlvtXuLyPhuHieuPhuongTien.getThoiHanDuocCapPhep();
	}

	/**
	* Sets the thoi han duoc cap phep of this q l v t xu ly phu hieu phuong tien.
	*
	* @param thoiHanDuocCapPhep the thoi han duoc cap phep of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setThoiHanDuocCapPhep(java.util.Date thoiHanDuocCapPhep) {
		_qlvtXuLyPhuHieuPhuongTien.setThoiHanDuocCapPhep(thoiHanDuocCapPhep);
	}

	/**
	* Returns the loai phu hieu xin cap of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the loai phu hieu xin cap of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getLoaiPhuHieuXinCap() {
		return _qlvtXuLyPhuHieuPhuongTien.getLoaiPhuHieuXinCap();
	}

	/**
	* Sets the loai phu hieu xin cap of this q l v t xu ly phu hieu phuong tien.
	*
	* @param loaiPhuHieuXinCap the loai phu hieu xin cap of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setLoaiPhuHieuXinCap(java.lang.String loaiPhuHieuXinCap) {
		_qlvtXuLyPhuHieuPhuongTien.setLoaiPhuHieuXinCap(loaiPhuHieuXinCap);
	}

	/**
	* Returns the ly do khong dat of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the ly do khong dat of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtXuLyPhuHieuPhuongTien.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this q l v t xu ly phu hieu phuong tien.
	*
	* @param lyDoKhongDat the ly do khong dat of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtXuLyPhuHieuPhuongTien.setLyDoKhongDat(lyDoKhongDat);
	}

	/**
	* Returns the co gia tri den of this q l v t xu ly phu hieu phuong tien.
	*
	* @return the co gia tri den of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public java.util.Date getCoGiaTriDen() {
		return _qlvtXuLyPhuHieuPhuongTien.getCoGiaTriDen();
	}

	/**
	* Sets the co gia tri den of this q l v t xu ly phu hieu phuong tien.
	*
	* @param coGiaTriDen the co gia tri den of this q l v t xu ly phu hieu phuong tien
	*/
	@Override
	public void setCoGiaTriDen(java.util.Date coGiaTriDen) {
		_qlvtXuLyPhuHieuPhuongTien.setCoGiaTriDen(coGiaTriDen);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyPhuHieuPhuongTien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyPhuHieuPhuongTien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyPhuHieuPhuongTien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyPhuHieuPhuongTien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyPhuHieuPhuongTien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyPhuHieuPhuongTien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyPhuHieuPhuongTien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyPhuHieuPhuongTien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyPhuHieuPhuongTien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyPhuHieuPhuongTien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyPhuHieuPhuongTien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTXuLyPhuHieuPhuongTienWrapper((QLVTXuLyPhuHieuPhuongTien)_qlvtXuLyPhuHieuPhuongTien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien) {
		return _qlvtXuLyPhuHieuPhuongTien.compareTo(qlvtXuLyPhuHieuPhuongTien);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyPhuHieuPhuongTien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien> toCacheModel() {
		return _qlvtXuLyPhuHieuPhuongTien.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien toEscapedModel() {
		return new QLVTXuLyPhuHieuPhuongTienWrapper(_qlvtXuLyPhuHieuPhuongTien.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien toUnescapedModel() {
		return new QLVTXuLyPhuHieuPhuongTienWrapper(_qlvtXuLyPhuHieuPhuongTien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyPhuHieuPhuongTien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyPhuHieuPhuongTien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyPhuHieuPhuongTien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTXuLyPhuHieuPhuongTienWrapper)) {
			return false;
		}

		QLVTXuLyPhuHieuPhuongTienWrapper qlvtXuLyPhuHieuPhuongTienWrapper = (QLVTXuLyPhuHieuPhuongTienWrapper)obj;

		if (Validator.equals(_qlvtXuLyPhuHieuPhuongTien,
					qlvtXuLyPhuHieuPhuongTienWrapper._qlvtXuLyPhuHieuPhuongTien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTXuLyPhuHieuPhuongTien getWrappedQLVTXuLyPhuHieuPhuongTien() {
		return _qlvtXuLyPhuHieuPhuongTien;
	}

	@Override
	public QLVTXuLyPhuHieuPhuongTien getWrappedModel() {
		return _qlvtXuLyPhuHieuPhuongTien;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyPhuHieuPhuongTien.resetOriginalValues();
	}

	private QLVTXuLyPhuHieuPhuongTien _qlvtXuLyPhuHieuPhuongTien;
}