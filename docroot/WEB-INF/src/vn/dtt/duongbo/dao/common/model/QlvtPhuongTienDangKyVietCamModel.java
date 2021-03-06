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
 * The base model interface for the QlvtPhuongTienDangKyVietCam service. Represents a row in the &quot;qlvt_phuongtiendangky_vc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamImpl}.
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietCam
 * @see vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamImpl
 * @see vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl
 * @generated
 */
public interface QlvtPhuongTienDangKyVietCamModel extends BaseModel<QlvtPhuongTienDangKyVietCam> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt phuong tien dang ky viet cam model instance should use the {@link QlvtPhuongTienDangKyVietCam} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the primary key of this qlvt phuong tien dang ky viet cam
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param primaryKey the primary key of this qlvt phuong tien dang ky viet cam
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the ID of this qlvt phuong tien dang ky viet cam
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param id the ID of this qlvt phuong tien dang ky viet cam
	 */
	public void setId(long id);

	/**
	 * Returns the bien so of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the bien so of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getBienSo();

	/**
	 * Sets the bien so of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param BienSo the bien so of this qlvt phuong tien dang ky viet cam
	 */
	public void setBienSo(String BienSo);

	/**
	 * Returns the ten dang ky so huu of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the ten dang ky so huu of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getTenDangKySoHuu();

	/**
	 * Sets the ten dang ky so huu of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param TenDangKySoHuu the ten dang ky so huu of this qlvt phuong tien dang ky viet cam
	 */
	public void setTenDangKySoHuu(String TenDangKySoHuu);

	/**
	 * Returns the nhan hieu of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the nhan hieu of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getNhanHieu();

	/**
	 * Sets the nhan hieu of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param NhanHieu the nhan hieu of this qlvt phuong tien dang ky viet cam
	 */
	public void setNhanHieu(String NhanHieu);

	/**
	 * Returns the trong tai of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the trong tai of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getTrongTai();

	/**
	 * Sets the trong tai of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param TrongTai the trong tai of this qlvt phuong tien dang ky viet cam
	 */
	public void setTrongTai(String TrongTai);

	/**
	 * Returns the nam san xuat of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the nam san xuat of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getNamSanXuat();

	/**
	 * Sets the nam san xuat of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param NamSanXuat the nam san xuat of this qlvt phuong tien dang ky viet cam
	 */
	public void setNamSanXuat(String NamSanXuat);

	/**
	 * Returns the cua khau xuat nhap of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the cua khau xuat nhap of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getCuaKhauXuatNhap();

	/**
	 * Sets the cua khau xuat nhap of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param CuaKhauXuatNhap the cua khau xuat nhap of this qlvt phuong tien dang ky viet cam
	 */
	public void setCuaKhauXuatNhap(String CuaKhauXuatNhap);

	/**
	 * Returns the hinh thuc hoat dong of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the hinh thuc hoat dong of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getHinhThucHoatDong();

	/**
	 * Sets the hinh thuc hoat dong of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param HinhThucHoatDong the hinh thuc hoat dong of this qlvt phuong tien dang ky viet cam
	 */
	public void setHinhThucHoatDong(String HinhThucHoatDong);

	/**
	 * Returns the loai hinh hoat dong of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the loai hinh hoat dong of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getLoaiHinhHoatDong();

	/**
	 * Sets the loai hinh hoat dong of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param LoaiHinhHoatDong the loai hinh hoat dong of this qlvt phuong tien dang ky viet cam
	 */
	public void setLoaiHinhHoatDong(String LoaiHinhHoatDong);

	/**
	 * Returns the tuyen hoat dong of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the tuyen hoat dong of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getTuyenHoatDong();

	/**
	 * Sets the tuyen hoat dong of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param TuyenHoatDong the tuyen hoat dong of this qlvt phuong tien dang ky viet cam
	 */
	public void setTuyenHoatDong(String TuyenHoatDong);

	/**
	 * Returns the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet cam
	 */
	public Date getThoiGianXinCapPhepTu();

	/**
	 * Sets the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param ThoiGianXinCapPhepTu the thoi gian xin cap phep tu of this qlvt phuong tien dang ky viet cam
	 */
	public void setThoiGianXinCapPhepTu(Date ThoiGianXinCapPhepTu);

	/**
	 * Returns the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet cam
	 */
	public Date getThoiGianXinCapPhepDen();

	/**
	 * Sets the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param ThoiGianXinCapPhepDen the thoi gian xin cap phep den of this qlvt phuong tien dang ky viet cam
	 */
	public void setThoiGianXinCapPhepDen(Date ThoiGianXinCapPhepDen);

	/**
	 * Returns the so khung of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the so khung of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getSoKhung();

	/**
	 * Sets the so khung of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param SoKhung the so khung of this qlvt phuong tien dang ky viet cam
	 */
	public void setSoKhung(String SoKhung);

	/**
	 * Returns the mau son of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the mau son of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getMauSon();

	/**
	 * Sets the mau son of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param MauSon the mau son of this qlvt phuong tien dang ky viet cam
	 */
	public void setMauSon(String MauSon);

	/**
	 * Returns the so may of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the so may of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getSoMay();

	/**
	 * Sets the so may of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param SoMay the so may of this qlvt phuong tien dang ky viet cam
	 */
	public void setSoMay(String SoMay);

	/**
	 * Returns the loai hang van chuyen of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the loai hang van chuyen of this qlvt phuong tien dang ky viet cam
	 */
	@AutoEscape
	public String getLoaiHangVanChuyen();

	/**
	 * Sets the loai hang van chuyen of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param LoaiHangVanChuyen the loai hang van chuyen of this qlvt phuong tien dang ky viet cam
	 */
	public void setLoaiHangVanChuyen(String LoaiHangVanChuyen);

	/**
	 * Returns the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet cam
	 */
	public Date getThoiGianDuKienKhoiHanh();

	/**
	 * Sets the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param ThoiGianDuKienKhoiHanh the thoi gian du kien khoi hanh of this qlvt phuong tien dang ky viet cam
	 */
	public void setThoiGianDuKienKhoiHanh(Date ThoiGianDuKienKhoiHanh);

	/**
	 * Returns the noi dung ho so ID of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the noi dung ho so ID of this qlvt phuong tien dang ky viet cam
	 */
	public long getNoiDungHoSoId();

	/**
	 * Sets the noi dung ho so ID of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID of this qlvt phuong tien dang ky viet cam
	 */
	public void setNoiDungHoSoId(long NoiDungHoSoId);

	/**
	 * Returns the ho so thu tuc ID of this qlvt phuong tien dang ky viet cam.
	 *
	 * @return the ho so thu tuc ID of this qlvt phuong tien dang ky viet cam
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this qlvt phuong tien dang ky viet cam.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID of this qlvt phuong tien dang ky viet cam
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
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtPhuongTienDangKyVietCam> toCacheModel();

	@Override
	public QlvtPhuongTienDangKyVietCam toEscapedModel();

	@Override
	public QlvtPhuongTienDangKyVietCam toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}