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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the QlvtPhuongTienDangKyVietTrung service. Represents a row in the &quot;qlvt_phuongtiendangky_vt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungImpl}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietTrung
 * @see vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungImpl
 * @see vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl
 * @generated
 */
public interface QlvtPhuongTienDangKyVietTrungModel extends BaseModel<QlvtPhuongTienDangKyVietTrung> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt phuong tien dang ky viet trung model instance should use the {@link QlvtPhuongTienDangKyVietTrung} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the primary key of this qlvt phuong tien dang ky viet trung
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param primaryKey the primary key of this qlvt phuong tien dang ky viet trung
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the ID of this qlvt phuong tien dang ky viet trung
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param id the ID of this qlvt phuong tien dang ky viet trung
	 */
	public void setId(long id);

	/**
	 * Returns the bien so of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the bien so of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getBienSo();

	/**
	 * Sets the bien so of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param BienSo the bien so of this qlvt phuong tien dang ky viet trung
	 */
	public void setBienSo(String BienSo);

	/**
	 * Returns the nhan hieu of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the nhan hieu of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getNhanHieu();

	/**
	 * Sets the nhan hieu of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param NhanHieu the nhan hieu of this qlvt phuong tien dang ky viet trung
	 */
	public void setNhanHieu(String NhanHieu);

	/**
	 * Returns the ten dang ky so huu of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the ten dang ky so huu of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getTenDangKySoHuu();

	/**
	 * Sets the ten dang ky so huu of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param tenDangKySoHuu the ten dang ky so huu of this qlvt phuong tien dang ky viet trung
	 */
	public void setTenDangKySoHuu(String tenDangKySoHuu);

	/**
	 * Returns the loai xe of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the loai xe of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getLoaiXe();

	/**
	 * Sets the loai xe of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param loaiXe the loai xe of this qlvt phuong tien dang ky viet trung
	 */
	public void setLoaiXe(String loaiXe);

	/**
	 * Returns the trong tai of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the trong tai of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getTrongTai();

	/**
	 * Sets the trong tai of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param TrongTai the trong tai of this qlvt phuong tien dang ky viet trung
	 */
	public void setTrongTai(String TrongTai);

	/**
	 * Returns the nam san xuat of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the nam san xuat of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getNamSanXuat();

	/**
	 * Sets the nam san xuat of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param NamSanXuat the nam san xuat of this qlvt phuong tien dang ky viet trung
	 */
	public void setNamSanXuat(String NamSanXuat);

	/**
	 * Returns the cua khau xuat nhap of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the cua khau xuat nhap of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getCuaKhauXuatNhap();

	/**
	 * Sets the cua khau xuat nhap of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param CuaKhauXuatNhap the cua khau xuat nhap of this qlvt phuong tien dang ky viet trung
	 */
	public void setCuaKhauXuatNhap(String CuaKhauXuatNhap);

	/**
	 * Returns the hinh thuc hoat dong of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the hinh thuc hoat dong of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getHinhThucHoatDong();

	/**
	 * Sets the hinh thuc hoat dong of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param HinhThucHoatDong the hinh thuc hoat dong of this qlvt phuong tien dang ky viet trung
	 */
	public void setHinhThucHoatDong(String HinhThucHoatDong);

	/**
	 * Returns the tuyen hoat dong of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the tuyen hoat dong of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getTuyenHoatDong();

	/**
	 * Sets the tuyen hoat dong of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param TuyenHoatDong the tuyen hoat dong of this qlvt phuong tien dang ky viet trung
	 */
	public void setTuyenHoatDong(String TuyenHoatDong);

	/**
	 * Returns the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet trung
	 */
	public Date getThoiGianXinCapPhepTu();

	/**
	 * Sets the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param ThoiGianXinCapPhepTu the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet trung
	 */
	public void setThoiGianXinCapPhepTu(Date ThoiGianXinCapPhepTu);

	/**
	 * Returns the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet trung
	 */
	public Date getThoiGianXinCapPhepDen();

	/**
	 * Sets the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param ThoiGianXinCapPhepDen the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet trung
	 */
	public void setThoiGianXinCapPhepDen(Date ThoiGianXinCapPhepDen);

	/**
	 * Returns the so khung of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the so khung of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getSoKhung();

	/**
	 * Sets the so khung of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param SoKhung the so khung of this qlvt phuong tien dang ky viet trung
	 */
	public void setSoKhung(String SoKhung);

	/**
	 * Returns the mau son of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the mau son of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getMauSon();

	/**
	 * Sets the mau son of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param MauSon the mau son of this qlvt phuong tien dang ky viet trung
	 */
	public void setMauSon(String MauSon);

	/**
	 * Returns the so may of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the so may of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getSoMay();

	/**
	 * Sets the so may of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param SoMay the so may of this qlvt phuong tien dang ky viet trung
	 */
	public void setSoMay(String SoMay);

	/**
	 * Returns the loai hang van chuyen of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the loai hang van chuyen of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getLoaiHangVanChuyen();

	/**
	 * Sets the loai hang van chuyen of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param LoaiHangVanChuyen the loai hang van chuyen of this qlvt phuong tien dang ky viet trung
	 */
	public void setLoaiHangVanChuyen(String LoaiHangVanChuyen);

	/**
	 * Returns the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet trung
	 */
	public Date getThoiGianDuKienKhoiHanh();

	/**
	 * Sets the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param ThoiGianDuKienKhoiHanh the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet trung
	 */
	public void setThoiGianDuKienKhoiHanh(Date ThoiGianDuKienKhoiHanh);

	/**
	 * Returns the hanh trinh de nghi of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the hanh trinh de nghi of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getHanhTrinhDeNghi();

	/**
	 * Sets the hanh trinh de nghi of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param hanhTrinhDeNghi the hanh trinh de nghi of this qlvt phuong tien dang ky viet trung
	 */
	public void setHanhTrinhDeNghi(String hanhTrinhDeNghi);

	/**
	 * Returns the so giay phep bi mat hong of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the so giay phep bi mat hong of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getSoGiayPhepBiMatHong();

	/**
	 * Sets the so giay phep bi mat hong of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param soGiayPhepBiMatHong the so giay phep bi mat hong of this qlvt phuong tien dang ky viet trung
	 */
	public void setSoGiayPhepBiMatHong(String soGiayPhepBiMatHong);

	/**
	 * Returns the diem dung do dang ky of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the diem dung do dang ky of this qlvt phuong tien dang ky viet trung
	 */
	@AutoEscape
	public String getDiemDungDoDangKy();

	/**
	 * Sets the diem dung do dang ky of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param diemDungDoDangKy the diem dung do dang ky of this qlvt phuong tien dang ky viet trung
	 */
	public void setDiemDungDoDangKy(String diemDungDoDangKy);

	/**
	 * Returns the noi dung ho so ID of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the noi dung ho so ID of this qlvt phuong tien dang ky viet trung
	 */
	public long getNoiDungHoSoId();

	/**
	 * Sets the noi dung ho so ID of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID of this qlvt phuong tien dang ky viet trung
	 */
	public void setNoiDungHoSoId(long NoiDungHoSoId);

	/**
	 * Returns the ho so thu tuc ID of this qlvt phuong tien dang ky viet trung.
	 *
	 * @return the ho so thu tuc ID of this qlvt phuong tien dang ky viet trung
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this qlvt phuong tien dang ky viet trung.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID of this qlvt phuong tien dang ky viet trung
	 */
	public void setHoSoThuTucId(long HoSoThuTucId);

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
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtPhuongTienDangKyVietTrung> toCacheModel();

	@Override
	public QlvtPhuongTienDangKyVietTrung toEscapedModel();

	@Override
	public QlvtPhuongTienDangKyVietTrung toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}