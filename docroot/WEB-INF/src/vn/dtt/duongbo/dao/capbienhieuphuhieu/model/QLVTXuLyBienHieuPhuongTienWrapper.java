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
 * This class is a wrapper for {@link QLVTXuLyBienHieuPhuongTien}.
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyBienHieuPhuongTien
 * @generated
 */
public class QLVTXuLyBienHieuPhuongTienWrapper
	implements QLVTXuLyBienHieuPhuongTien,
		ModelWrapper<QLVTXuLyBienHieuPhuongTien> {
	public QLVTXuLyBienHieuPhuongTienWrapper(
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien) {
		_qlvtXuLyBienHieuPhuongTien = qlvtXuLyBienHieuPhuongTien;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyBienHieuPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyBienHieuPhuongTien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("capBienHieuID", getCapBienHieuID());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("bienSo", getBienSo());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soMay", getSoMay());
		attributes.put("namSx", getNamSx());
		attributes.put("mauSon", getMauSon());
		attributes.put("trongTai", getTrongTai());
		attributes.put("soChoNgoi", getSoChoNgoi());
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
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("soA", getSoA());
		attributes.put("soB", getSoB());
		attributes.put("coGiaTriDen", getCoGiaTriDen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer capBienHieuID = (Integer)attributes.get("capBienHieuID");

		if (capBienHieuID != null) {
			setCapBienHieuID(capBienHieuID);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		String bienSo = (String)attributes.get("bienSo");

		if (bienSo != null) {
			setBienSo(bienSo);
		}

		String soKhung = (String)attributes.get("soKhung");

		if (soKhung != null) {
			setSoKhung(soKhung);
		}

		String soMay = (String)attributes.get("soMay");

		if (soMay != null) {
			setSoMay(soMay);
		}

		Integer namSx = (Integer)attributes.get("namSx");

		if (namSx != null) {
			setNamSx(namSx);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		Long trongTai = (Long)attributes.get("trongTai");

		if (trongTai != null) {
			setTrongTai(trongTai);
		}

		Integer soChoNgoi = (Integer)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
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

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		String soA = (String)attributes.get("soA");

		if (soA != null) {
			setSoA(soA);
		}

		String soB = (String)attributes.get("soB");

		if (soB != null) {
			setSoB(soB);
		}

		Date coGiaTriDen = (Date)attributes.get("coGiaTriDen");

		if (coGiaTriDen != null) {
			setCoGiaTriDen(coGiaTriDen);
		}
	}

	/**
	* Returns the primary key of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the primary key of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtXuLyBienHieuPhuongTien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t xu ly bien hieu phuong tien.
	*
	* @param primaryKey the primary key of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtXuLyBienHieuPhuongTien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the ID of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public int getId() {
		return _qlvtXuLyBienHieuPhuongTien.getId();
	}

	/**
	* Sets the ID of this q l v t xu ly bien hieu phuong tien.
	*
	* @param id the ID of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setId(int id) {
		_qlvtXuLyBienHieuPhuongTien.setId(id);
	}

	/**
	* Returns the cap bien hieu i d of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the cap bien hieu i d of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public int getCapBienHieuID() {
		return _qlvtXuLyBienHieuPhuongTien.getCapBienHieuID();
	}

	/**
	* Sets the cap bien hieu i d of this q l v t xu ly bien hieu phuong tien.
	*
	* @param capBienHieuID the cap bien hieu i d of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setCapBienHieuID(int capBienHieuID) {
		_qlvtXuLyBienHieuPhuongTien.setCapBienHieuID(capBienHieuID);
	}

	/**
	* Returns the nhan hieu of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the nhan hieu of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtXuLyBienHieuPhuongTien.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this q l v t xu ly bien hieu phuong tien.
	*
	* @param nhanHieu the nhan hieu of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setNhanHieu(java.lang.String nhanHieu) {
		_qlvtXuLyBienHieuPhuongTien.setNhanHieu(nhanHieu);
	}

	/**
	* Returns the bien so of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the bien so of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getBienSo() {
		return _qlvtXuLyBienHieuPhuongTien.getBienSo();
	}

	/**
	* Sets the bien so of this q l v t xu ly bien hieu phuong tien.
	*
	* @param bienSo the bien so of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setBienSo(java.lang.String bienSo) {
		_qlvtXuLyBienHieuPhuongTien.setBienSo(bienSo);
	}

	/**
	* Returns the so khung of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the so khung of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _qlvtXuLyBienHieuPhuongTien.getSoKhung();
	}

	/**
	* Sets the so khung of this q l v t xu ly bien hieu phuong tien.
	*
	* @param soKhung the so khung of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setSoKhung(java.lang.String soKhung) {
		_qlvtXuLyBienHieuPhuongTien.setSoKhung(soKhung);
	}

	/**
	* Returns the so may of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the so may of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getSoMay() {
		return _qlvtXuLyBienHieuPhuongTien.getSoMay();
	}

	/**
	* Sets the so may of this q l v t xu ly bien hieu phuong tien.
	*
	* @param soMay the so may of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setSoMay(java.lang.String soMay) {
		_qlvtXuLyBienHieuPhuongTien.setSoMay(soMay);
	}

	/**
	* Returns the nam sx of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the nam sx of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public int getNamSx() {
		return _qlvtXuLyBienHieuPhuongTien.getNamSx();
	}

	/**
	* Sets the nam sx of this q l v t xu ly bien hieu phuong tien.
	*
	* @param namSx the nam sx of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setNamSx(int namSx) {
		_qlvtXuLyBienHieuPhuongTien.setNamSx(namSx);
	}

	/**
	* Returns the mau son of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the mau son of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtXuLyBienHieuPhuongTien.getMauSon();
	}

	/**
	* Sets the mau son of this q l v t xu ly bien hieu phuong tien.
	*
	* @param mauSon the mau son of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setMauSon(java.lang.String mauSon) {
		_qlvtXuLyBienHieuPhuongTien.setMauSon(mauSon);
	}

	/**
	* Returns the trong tai of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the trong tai of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public long getTrongTai() {
		return _qlvtXuLyBienHieuPhuongTien.getTrongTai();
	}

	/**
	* Sets the trong tai of this q l v t xu ly bien hieu phuong tien.
	*
	* @param trongTai the trong tai of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setTrongTai(long trongTai) {
		_qlvtXuLyBienHieuPhuongTien.setTrongTai(trongTai);
	}

	/**
	* Returns the so cho ngoi of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the so cho ngoi of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public int getSoChoNgoi() {
		return _qlvtXuLyBienHieuPhuongTien.getSoChoNgoi();
	}

	/**
	* Sets the so cho ngoi of this q l v t xu ly bien hieu phuong tien.
	*
	* @param soChoNgoi the so cho ngoi of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setSoChoNgoi(int soChoNgoi) {
		_qlvtXuLyBienHieuPhuongTien.setSoChoNgoi(soChoNgoi);
	}

	/**
	* Returns the hinh thuc so huu xe of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the hinh thuc so huu xe of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getHinhThucSoHuuXe() {
		return _qlvtXuLyBienHieuPhuongTien.getHinhThucSoHuuXe();
	}

	/**
	* Sets the hinh thuc so huu xe of this q l v t xu ly bien hieu phuong tien.
	*
	* @param hinhThucSoHuuXe the hinh thuc so huu xe of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setHinhThucSoHuuXe(java.lang.String hinhThucSoHuuXe) {
		_qlvtXuLyBienHieuPhuongTien.setHinhThucSoHuuXe(hinhThucSoHuuXe);
	}

	/**
	* Returns the linh vuc kinh doanh xe du lich of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the linh vuc kinh doanh xe du lich of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getLinhVucKinhDoanhXeDuLich() {
		return _qlvtXuLyBienHieuPhuongTien.getLinhVucKinhDoanhXeDuLich();
	}

	/**
	* Sets the linh vuc kinh doanh xe du lich of this q l v t xu ly bien hieu phuong tien.
	*
	* @param linhVucKinhDoanhXeDuLich the linh vuc kinh doanh xe du lich of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setLinhVucKinhDoanhXeDuLich(
		java.lang.String linhVucKinhDoanhXeDuLich) {
		_qlvtXuLyBienHieuPhuongTien.setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
	}

	/**
	* Returns the nien han su dung giay dang kiem of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the nien han su dung giay dang kiem of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public int getNienHanSuDungGiayDangKiem() {
		return _qlvtXuLyBienHieuPhuongTien.getNienHanSuDungGiayDangKiem();
	}

	/**
	* Sets the nien han su dung giay dang kiem of this q l v t xu ly bien hieu phuong tien.
	*
	* @param nienHanSuDungGiayDangKiem the nien han su dung giay dang kiem of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem) {
		_qlvtXuLyBienHieuPhuongTien.setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
	}

	/**
	* Returns the nien han su dung n d86 of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the nien han su dung n d86 of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public int getNienHanSuDungND86() {
		return _qlvtXuLyBienHieuPhuongTien.getNienHanSuDungND86();
	}

	/**
	* Sets the nien han su dung n d86 of this q l v t xu ly bien hieu phuong tien.
	*
	* @param nienHanSuDungND86 the nien han su dung n d86 of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setNienHanSuDungND86(int nienHanSuDungND86) {
		_qlvtXuLyBienHieuPhuongTien.setNienHanSuDungND86(nienHanSuDungND86);
	}

	/**
	* Returns the doanh nghiep so huu thue of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the doanh nghiep so huu thue of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getDoanhNghiepSoHuuThue() {
		return _qlvtXuLyBienHieuPhuongTien.getDoanhNghiepSoHuuThue();
	}

	/**
	* Sets the doanh nghiep so huu thue of this q l v t xu ly bien hieu phuong tien.
	*
	* @param doanhNghiepSoHuuThue the doanh nghiep so huu thue of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setDoanhNghiepSoHuuThue(java.lang.String doanhNghiepSoHuuThue) {
		_qlvtXuLyBienHieuPhuongTien.setDoanhNghiepSoHuuThue(doanhNghiepSoHuuThue);
	}

	/**
	* Returns the thoi han thue of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the thoi han thue of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.util.Date getThoiHanThue() {
		return _qlvtXuLyBienHieuPhuongTien.getThoiHanThue();
	}

	/**
	* Sets the thoi han thue of this q l v t xu ly bien hieu phuong tien.
	*
	* @param thoiHanThue the thoi han thue of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setThoiHanThue(java.util.Date thoiHanThue) {
		_qlvtXuLyBienHieuPhuongTien.setThoiHanThue(thoiHanThue);
	}

	/**
	* Returns the hop dong sau cung of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the hop dong sau cung of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public int getHopDongSauCung() {
		return _qlvtXuLyBienHieuPhuongTien.getHopDongSauCung();
	}

	/**
	* Sets the hop dong sau cung of this q l v t xu ly bien hieu phuong tien.
	*
	* @param hopDongSauCung the hop dong sau cung of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setHopDongSauCung(int hopDongSauCung) {
		_qlvtXuLyBienHieuPhuongTien.setHopDongSauCung(hopDongSauCung);
	}

	/**
	* Returns the ket qua xu ly of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the ket qua xu ly of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtXuLyBienHieuPhuongTien.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this q l v t xu ly bien hieu phuong tien.
	*
	* @param ketQuaXuLy the ket qua xu ly of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtXuLyBienHieuPhuongTien.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the so phu hieu duoc cap of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the so phu hieu duoc cap of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getSoPhuHieuDuocCap() {
		return _qlvtXuLyBienHieuPhuongTien.getSoPhuHieuDuocCap();
	}

	/**
	* Sets the so phu hieu duoc cap of this q l v t xu ly bien hieu phuong tien.
	*
	* @param soPhuHieuDuocCap the so phu hieu duoc cap of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setSoPhuHieuDuocCap(java.lang.String soPhuHieuDuocCap) {
		_qlvtXuLyBienHieuPhuongTien.setSoPhuHieuDuocCap(soPhuHieuDuocCap);
	}

	/**
	* Returns the thoi han duoc cap phep of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the thoi han duoc cap phep of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.util.Date getThoiHanDuocCapPhep() {
		return _qlvtXuLyBienHieuPhuongTien.getThoiHanDuocCapPhep();
	}

	/**
	* Sets the thoi han duoc cap phep of this q l v t xu ly bien hieu phuong tien.
	*
	* @param thoiHanDuocCapPhep the thoi han duoc cap phep of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setThoiHanDuocCapPhep(java.util.Date thoiHanDuocCapPhep) {
		_qlvtXuLyBienHieuPhuongTien.setThoiHanDuocCapPhep(thoiHanDuocCapPhep);
	}

	/**
	* Returns the ly do khong dat of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the ly do khong dat of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getLyDoKhongDat() {
		return _qlvtXuLyBienHieuPhuongTien.getLyDoKhongDat();
	}

	/**
	* Sets the ly do khong dat of this q l v t xu ly bien hieu phuong tien.
	*
	* @param lyDoKhongDat the ly do khong dat of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setLyDoKhongDat(java.lang.String lyDoKhongDat) {
		_qlvtXuLyBienHieuPhuongTien.setLyDoKhongDat(lyDoKhongDat);
	}

	/**
	* Returns the so a of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the so a of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getSoA() {
		return _qlvtXuLyBienHieuPhuongTien.getSoA();
	}

	/**
	* Sets the so a of this q l v t xu ly bien hieu phuong tien.
	*
	* @param soA the so a of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setSoA(java.lang.String soA) {
		_qlvtXuLyBienHieuPhuongTien.setSoA(soA);
	}

	/**
	* Returns the so b of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the so b of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.lang.String getSoB() {
		return _qlvtXuLyBienHieuPhuongTien.getSoB();
	}

	/**
	* Sets the so b of this q l v t xu ly bien hieu phuong tien.
	*
	* @param soB the so b of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setSoB(java.lang.String soB) {
		_qlvtXuLyBienHieuPhuongTien.setSoB(soB);
	}

	/**
	* Returns the co gia tri den of this q l v t xu ly bien hieu phuong tien.
	*
	* @return the co gia tri den of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public java.util.Date getCoGiaTriDen() {
		return _qlvtXuLyBienHieuPhuongTien.getCoGiaTriDen();
	}

	/**
	* Sets the co gia tri den of this q l v t xu ly bien hieu phuong tien.
	*
	* @param coGiaTriDen the co gia tri den of this q l v t xu ly bien hieu phuong tien
	*/
	@Override
	public void setCoGiaTriDen(java.util.Date coGiaTriDen) {
		_qlvtXuLyBienHieuPhuongTien.setCoGiaTriDen(coGiaTriDen);
	}

	@Override
	public boolean isNew() {
		return _qlvtXuLyBienHieuPhuongTien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtXuLyBienHieuPhuongTien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtXuLyBienHieuPhuongTien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtXuLyBienHieuPhuongTien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtXuLyBienHieuPhuongTien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtXuLyBienHieuPhuongTien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtXuLyBienHieuPhuongTien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtXuLyBienHieuPhuongTien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtXuLyBienHieuPhuongTien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtXuLyBienHieuPhuongTien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtXuLyBienHieuPhuongTien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTXuLyBienHieuPhuongTienWrapper((QLVTXuLyBienHieuPhuongTien)_qlvtXuLyBienHieuPhuongTien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien) {
		return _qlvtXuLyBienHieuPhuongTien.compareTo(qlvtXuLyBienHieuPhuongTien);
	}

	@Override
	public int hashCode() {
		return _qlvtXuLyBienHieuPhuongTien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien> toCacheModel() {
		return _qlvtXuLyBienHieuPhuongTien.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien toEscapedModel() {
		return new QLVTXuLyBienHieuPhuongTienWrapper(_qlvtXuLyBienHieuPhuongTien.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien toUnescapedModel() {
		return new QLVTXuLyBienHieuPhuongTienWrapper(_qlvtXuLyBienHieuPhuongTien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtXuLyBienHieuPhuongTien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtXuLyBienHieuPhuongTien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtXuLyBienHieuPhuongTien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTXuLyBienHieuPhuongTienWrapper)) {
			return false;
		}

		QLVTXuLyBienHieuPhuongTienWrapper qlvtXuLyBienHieuPhuongTienWrapper = (QLVTXuLyBienHieuPhuongTienWrapper)obj;

		if (Validator.equals(_qlvtXuLyBienHieuPhuongTien,
					qlvtXuLyBienHieuPhuongTienWrapper._qlvtXuLyBienHieuPhuongTien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTXuLyBienHieuPhuongTien getWrappedQLVTXuLyBienHieuPhuongTien() {
		return _qlvtXuLyBienHieuPhuongTien;
	}

	@Override
	public QLVTXuLyBienHieuPhuongTien getWrappedModel() {
		return _qlvtXuLyBienHieuPhuongTien;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtXuLyBienHieuPhuongTien.resetOriginalValues();
	}

	private QLVTXuLyBienHieuPhuongTien _qlvtXuLyBienHieuPhuongTien;
}