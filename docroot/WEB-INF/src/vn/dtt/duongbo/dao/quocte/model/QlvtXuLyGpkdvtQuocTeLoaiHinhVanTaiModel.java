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

package vn.dtt.duongbo.dao.quocte.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai service. Represents a row in the &quot;qlvt_xuly_gpkdvt_quocte_loaihinhvantai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
 * @see vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl
 * @see vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiModelImpl
 * @generated
 */
public interface QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiModel extends BaseModel<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt xu ly gpkdvt quoc te loai hinh van tai model instance should use the {@link QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param primaryKey the primary key of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param id the ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setId(long id);

	/**
	 * Returns the thong tin cap gpkd van tai ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the thong tin cap gpkd van tai ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public int getThongTinCapGpkdVanTaiId();

	/**
	 * Sets the thong tin cap gpkd van tai ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param thongTinCapGpkdVanTaiId the thong tin cap gpkd van tai ID of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setThongTinCapGpkdVanTaiId(int thongTinCapGpkdVanTaiId);

	/**
	 * Returns the ma loai hinh hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the ma loai hinh hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	@AutoEscape
	public String getMaLoaiHinhHoatDong();

	/**
	 * Sets the ma loai hinh hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param maLoaiHinhHoatDong the ma loai hinh hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong);

	/**
	 * Returns the so luong phuong tien of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the so luong phuong tien of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public int getSoLuongPhuongTien();

	/**
	 * Sets the so luong phuong tien of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param soLuongPhuongTien the so luong phuong tien of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setSoLuongPhuongTien(int soLuongPhuongTien);

	/**
	 * Returns the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public long getThietBiGiamSatHanhTrinh();

	/**
	 * Sets the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param thietBiGiamSatHanhTrinh the thiet bi giam sat hanh trinh of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setThietBiGiamSatHanhTrinh(long thietBiGiamSatHanhTrinh);

	/**
	 * Returns the pham vi hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the pham vi hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	@AutoEscape
	public String getPhamViHoatDong();

	/**
	 * Sets the pham vi hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param phamViHoatDong the pham vi hoat dong of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setPhamViHoatDong(String phamViHoatDong);

	/**
	 * Returns the so chuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the so chuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public int getSoChuyen();

	/**
	 * Sets the so chuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param soChuyen the so chuyen of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setSoChuyen(int soChuyen);

	/**
	 * Returns the mau son of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the mau son of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	@AutoEscape
	public String getMauSon();

	/**
	 * Sets the mau son of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param mauSon the mau son of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setMauSon(String mauSon);

	/**
	 * Returns the ket qua xu ly of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the ket qua xu ly of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	@AutoEscape
	public String getKetQuaXuLy();

	/**
	 * Sets the ket qua xu ly of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setKetQuaXuLy(String ketQuaXuLy);

	/**
	 * Returns the ly do khong dat of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @return the ly do khong dat of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	@AutoEscape
	public String getLyDoKhongDat();

	/**
	 * Sets the ly do khong dat of this qlvt xu ly gpkdvt quoc te loai hinh van tai.
	 *
	 * @param lyDoKhongDat the ly do khong dat of this qlvt xu ly gpkdvt quoc te loai hinh van tai
	 */
	public void setLyDoKhongDat(String lyDoKhongDat);

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
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai> toCacheModel();

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai toEscapedModel();

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}