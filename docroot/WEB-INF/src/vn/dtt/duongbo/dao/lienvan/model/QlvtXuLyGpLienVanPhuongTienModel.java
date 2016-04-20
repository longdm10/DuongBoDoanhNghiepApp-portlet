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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the QlvtXuLyGpLienVanPhuongTien service. Represents a row in the &quot;qlvt_xuly_gplienvan_phuongtien&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTien
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl
 * @generated
 */
public interface QlvtXuLyGpLienVanPhuongTienModel extends BaseModel<QlvtXuLyGpLienVanPhuongTien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt xu ly gp lien van phuong tien model instance should use the {@link QlvtXuLyGpLienVanPhuongTien} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the primary key of this qlvt xu ly gp lien van phuong tien
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param primaryKey the primary key of this qlvt xu ly gp lien van phuong tien
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the ID of this qlvt xu ly gp lien van phuong tien
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param id the ID of this qlvt xu ly gp lien van phuong tien
	 */
	public void setId(long id);

	/**
	 * Returns the cap gplv ID of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the cap gplv ID of this qlvt xu ly gp lien van phuong tien
	 */
	public long getCapGplvId();

	/**
	 * Sets the cap gplv ID of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param capGplvId the cap gplv ID of this qlvt xu ly gp lien van phuong tien
	 */
	public void setCapGplvId(long capGplvId);

	/**
	 * Returns the bien so of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the bien so of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getBienSo();

	/**
	 * Sets the bien so of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param bienSo the bien so of this qlvt xu ly gp lien van phuong tien
	 */
	public void setBienSo(String bienSo);

	/**
	 * Returns the trong tai of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the trong tai of this qlvt xu ly gp lien van phuong tien
	 */
	public int getTrongTai();

	/**
	 * Sets the trong tai of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param trongTai the trong tai of this qlvt xu ly gp lien van phuong tien
	 */
	public void setTrongTai(int trongTai);

	/**
	 * Returns the nam sx of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the nam sx of this qlvt xu ly gp lien van phuong tien
	 */
	public int getNamSx();

	/**
	 * Sets the nam sx of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param namSx the nam sx of this qlvt xu ly gp lien van phuong tien
	 */
	public void setNamSx(int namSx);

	/**
	 * Returns the nhan hieu of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the nhan hieu of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getNhanHieu();

	/**
	 * Sets the nhan hieu of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param nhanHieu the nhan hieu of this qlvt xu ly gp lien van phuong tien
	 */
	public void setNhanHieu(String nhanHieu);

	/**
	 * Returns the so khung of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the so khung of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getSoKhung();

	/**
	 * Sets the so khung of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param soKhung the so khung of this qlvt xu ly gp lien van phuong tien
	 */
	public void setSoKhung(String soKhung);

	/**
	 * Returns the so may of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the so may of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getSoMay();

	/**
	 * Sets the so may of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param soMay the so may of this qlvt xu ly gp lien van phuong tien
	 */
	public void setSoMay(String soMay);

	/**
	 * Returns the mau son of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the mau son of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getMauSon();

	/**
	 * Sets the mau son of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param mauSon the mau son of this qlvt xu ly gp lien van phuong tien
	 */
	public void setMauSon(String mauSon);

	/**
	 * Returns the cua khau of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the cua khau of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getCuaKhau();

	/**
	 * Sets the cua khau of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param cuaKhau the cua khau of this qlvt xu ly gp lien van phuong tien
	 */
	public void setCuaKhau(String cuaKhau);

	/**
	 * Returns the ma cua khau of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the ma cua khau of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getMaCuaKhau();

	/**
	 * Sets the ma cua khau of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param maCuaKhau the ma cua khau of this qlvt xu ly gp lien van phuong tien
	 */
	public void setMaCuaKhau(String maCuaKhau);

	/**
	 * Returns the xin cap phep tu ngay of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the xin cap phep tu ngay of this qlvt xu ly gp lien van phuong tien
	 */
	public Date getXinCapPhepTuNgay();

	/**
	 * Sets the xin cap phep tu ngay of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param xinCapPhepTuNgay the xin cap phep tu ngay of this qlvt xu ly gp lien van phuong tien
	 */
	public void setXinCapPhepTuNgay(Date xinCapPhepTuNgay);

	/**
	 * Returns the xin cap phep den ngay of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the xin cap phep den ngay of this qlvt xu ly gp lien van phuong tien
	 */
	public Date getXinCapPhepDenNgay();

	/**
	 * Sets the xin cap phep den ngay of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param xinCapPhepDenNgay the xin cap phep den ngay of this qlvt xu ly gp lien van phuong tien
	 */
	public void setXinCapPhepDenNgay(Date xinCapPhepDenNgay);

	/**
	 * Returns the hinh thuc hoat dong of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the hinh thuc hoat dong of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getHinhThucHoatDong();

	/**
	 * Sets the hinh thuc hoat dong of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param hinhThucHoatDong the hinh thuc hoat dong of this qlvt xu ly gp lien van phuong tien
	 */
	public void setHinhThucHoatDong(String hinhThucHoatDong);

	/**
	 * Returns the so phu hieu of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the so phu hieu of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getSoPhuHieu();

	/**
	 * Sets the so phu hieu of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param soPhuHieu the so phu hieu of this qlvt xu ly gp lien van phuong tien
	 */
	public void setSoPhuHieu(String soPhuHieu);

	/**
	 * Returns the thoi han phu hieu of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the thoi han phu hieu of this qlvt xu ly gp lien van phuong tien
	 */
	public Date getThoiHanPhuHieu();

	/**
	 * Sets the thoi han phu hieu of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param thoiHanPhuHieu the thoi han phu hieu of this qlvt xu ly gp lien van phuong tien
	 */
	public void setThoiHanPhuHieu(Date thoiHanPhuHieu);

	/**
	 * Returns the so ngay xinh gia han of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the so ngay xinh gia han of this qlvt xu ly gp lien van phuong tien
	 */
	public int getSoNgayXinhGiaHan();

	/**
	 * Sets the so ngay xinh gia han of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param soNgayXinhGiaHan the so ngay xinh gia han of this qlvt xu ly gp lien van phuong tien
	 */
	public void setSoNgayXinhGiaHan(int soNgayXinhGiaHan);

	/**
	 * Returns the xin gia han tu ngay of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the xin gia han tu ngay of this qlvt xu ly gp lien van phuong tien
	 */
	public Date getXinGiaHanTuNgay();

	/**
	 * Sets the xin gia han tu ngay of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param xinGiaHanTuNgay the xin gia han tu ngay of this qlvt xu ly gp lien van phuong tien
	 */
	public void setXinGiaHanTuNgay(Date xinGiaHanTuNgay);

	/**
	 * Returns the xin gia han den ngay of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the xin gia han den ngay of this qlvt xu ly gp lien van phuong tien
	 */
	public Date getXinGiaHanDenNgay();

	/**
	 * Sets the xin gia han den ngay of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param xinGiaHanDenNgay the xin gia han den ngay of this qlvt xu ly gp lien van phuong tien
	 */
	public void setXinGiaHanDenNgay(Date xinGiaHanDenNgay);

	/**
	 * Returns the hinh thuc so huu of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the hinh thuc so huu of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getHinhThucSoHuu();

	/**
	 * Sets the hinh thuc so huu of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param hinhThucSoHuu the hinh thuc so huu of this qlvt xu ly gp lien van phuong tien
	 */
	public void setHinhThucSoHuu(String hinhThucSoHuu);

	/**
	 * Returns the doanh nghiep cho thue of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the doanh nghiep cho thue of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getDoanhNghiepChoThue();

	/**
	 * Sets the doanh nghiep cho thue of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param doanhNghiepChoThue the doanh nghiep cho thue of this qlvt xu ly gp lien van phuong tien
	 */
	public void setDoanhNghiepChoThue(String doanhNghiepChoThue);

	/**
	 * Returns the thoi han cho thue of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the thoi han cho thue of this qlvt xu ly gp lien van phuong tien
	 */
	public Date getThoiHanChoThue();

	/**
	 * Sets the thoi han cho thue of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param thoiHanChoThue the thoi han cho thue of this qlvt xu ly gp lien van phuong tien
	 */
	public void setThoiHanChoThue(Date thoiHanChoThue);

	/**
	 * Returns the hop dong sau cung of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the hop dong sau cung of this qlvt xu ly gp lien van phuong tien
	 */
	public long getHopDongSauCung();

	/**
	 * Sets the hop dong sau cung of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param hopDongSauCung the hop dong sau cung of this qlvt xu ly gp lien van phuong tien
	 */
	public void setHopDongSauCung(long hopDongSauCung);

	/**
	 * Returns the thoi gian nhap canh of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the thoi gian nhap canh of this qlvt xu ly gp lien van phuong tien
	 */
	public Date getThoiGianNhapCanh();

	/**
	 * Sets the thoi gian nhap canh of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param thoiGianNhapCanh the thoi gian nhap canh of this qlvt xu ly gp lien van phuong tien
	 */
	public void setThoiGianNhapCanh(Date thoiGianNhapCanh);

	/**
	 * Returns the thoi gian khoi hanh of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the thoi gian khoi hanh of this qlvt xu ly gp lien van phuong tien
	 */
	public Date getThoiGianKhoiHanh();

	/**
	 * Sets the thoi gian khoi hanh of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param thoiGianKhoiHanh the thoi gian khoi hanh of this qlvt xu ly gp lien van phuong tien
	 */
	public void setThoiGianKhoiHanh(Date thoiGianKhoiHanh);

	/**
	 * Returns the loai hinh gia han of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the loai hinh gia han of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getLoaiHinhGiaHan();

	/**
	 * Sets the loai hinh gia han of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param loaiHinhGiaHan the loai hinh gia han of this qlvt xu ly gp lien van phuong tien
	 */
	public void setLoaiHinhGiaHan(String loaiHinhGiaHan);

	/**
	 * Returns the loai giay phep of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the loai giay phep of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getLoaiGiayPhep();

	/**
	 * Sets the loai giay phep of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param loaiGiayPhep the loai giay phep of this qlvt xu ly gp lien van phuong tien
	 */
	public void setLoaiGiayPhep(String loaiGiayPhep);

	/**
	 * Returns the ket qua xu ly of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the ket qua xu ly of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getKetQuaXuLy();

	/**
	 * Sets the ket qua xu ly of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly gp lien van phuong tien
	 */
	public void setKetQuaXuLy(String ketQuaXuLy);

	/**
	 * Returns the ly do khong dat of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the ly do khong dat of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getLyDoKhongDat();

	/**
	 * Sets the ly do khong dat of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param lyDoKhongDat the ly do khong dat of this qlvt xu ly gp lien van phuong tien
	 */
	public void setLyDoKhongDat(String lyDoKhongDat);

	/**
	 * Returns the so cho ngoi of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the so cho ngoi of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getSoChoNgoi();

	/**
	 * Sets the so cho ngoi of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param soChoNgoi the so cho ngoi of this qlvt xu ly gp lien van phuong tien
	 */
	public void setSoChoNgoi(String soChoNgoi);

	/**
	 * Returns the hanh trinh of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the hanh trinh of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getHanhTrinh();

	/**
	 * Sets the hanh trinh of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param hanhTrinh the hanh trinh of this qlvt xu ly gp lien van phuong tien
	 */
	public void setHanhTrinh(String hanhTrinh);

	/**
	 * Returns the phi cap phep of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the phi cap phep of this qlvt xu ly gp lien van phuong tien
	 */
	public int getPhiCapPhep();

	/**
	 * Sets the phi cap phep of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param phiCapPhep the phi cap phep of this qlvt xu ly gp lien van phuong tien
	 */
	public void setPhiCapPhep(int phiCapPhep);

	/**
	 * Returns the so giay phep lien van phuong tien of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the so giay phep lien van phuong tien of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getSoGiayPhepLienVanPhuongTien();

	/**
	 * Sets the so giay phep lien van phuong tien of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param soGiayPhepLienVanPhuongTien the so giay phep lien van phuong tien of this qlvt xu ly gp lien van phuong tien
	 */
	public void setSoGiayPhepLienVanPhuongTien(
		String soGiayPhepLienVanPhuongTien);

	/**
	 * Returns the loai tuyen of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the loai tuyen of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getLoaiTuyen();

	/**
	 * Sets the loai tuyen of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param loaiTuyen the loai tuyen of this qlvt xu ly gp lien van phuong tien
	 */
	public void setLoaiTuyen(String loaiTuyen);

	/**
	 * Returns the loai hang van chuyen of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @return the loai hang van chuyen of this qlvt xu ly gp lien van phuong tien
	 */
	@AutoEscape
	public String getLoaiHangVanChuyen();

	/**
	 * Sets the loai hang van chuyen of this qlvt xu ly gp lien van phuong tien.
	 *
	 * @param loaiHangVanChuyen the loai hang van chuyen of this qlvt xu ly gp lien van phuong tien
	 */
	public void setLoaiHangVanChuyen(String loaiHangVanChuyen);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtXuLyGpLienVanPhuongTien> toCacheModel();

	@Override
	public QlvtXuLyGpLienVanPhuongTien toEscapedModel();

	@Override
	public QlvtXuLyGpLienVanPhuongTien toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}