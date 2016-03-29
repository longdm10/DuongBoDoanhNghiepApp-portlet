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

/**
 * The base model interface for the QlvtCapPhepPhuongTienVanTai service. Represents a row in the &quot;qlvt_phuongtienvantai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepPhuongTienVanTaiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepPhuongTienVanTaiImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepPhuongTienVanTai
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepPhuongTienVanTaiImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepPhuongTienVanTaiModelImpl
 * @generated
 */
public interface QlvtCapPhepPhuongTienVanTaiModel extends BaseModel<QlvtCapPhepPhuongTienVanTai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt cap phep phuong tien van tai model instance should use the {@link QlvtCapPhepPhuongTienVanTai} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the primary key of this qlvt cap phep phuong tien van tai
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt cap phep phuong tien van tai.
	 *
	 * @param primaryKey the primary key of this qlvt cap phep phuong tien van tai
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the ID of this qlvt cap phep phuong tien van tai
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt cap phep phuong tien van tai.
	 *
	 * @param id the ID of this qlvt cap phep phuong tien van tai
	 */
	public void setId(long id);

	/**
	 * Returns the bien so xe of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the bien so xe of this qlvt cap phep phuong tien van tai
	 */
	@AutoEscape
	public String getBienSoXe();

	/**
	 * Sets the bien so xe of this qlvt cap phep phuong tien van tai.
	 *
	 * @param bienSoXe the bien so xe of this qlvt cap phep phuong tien van tai
	 */
	public void setBienSoXe(String bienSoXe);

	/**
	 * Returns the nhan hieu of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the nhan hieu of this qlvt cap phep phuong tien van tai
	 */
	@AutoEscape
	public String getNhanHieu();

	/**
	 * Sets the nhan hieu of this qlvt cap phep phuong tien van tai.
	 *
	 * @param nhanHieu the nhan hieu of this qlvt cap phep phuong tien van tai
	 */
	public void setNhanHieu(String nhanHieu);

	/**
	 * Returns the trong tai of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the trong tai of this qlvt cap phep phuong tien van tai
	 */
	public int getTrongTai();

	/**
	 * Sets the trong tai of this qlvt cap phep phuong tien van tai.
	 *
	 * @param trongTai the trong tai of this qlvt cap phep phuong tien van tai
	 */
	public void setTrongTai(int trongTai);

	/**
	 * Returns the noi san xuat of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the noi san xuat of this qlvt cap phep phuong tien van tai
	 */
	@AutoEscape
	public String getNoiSanXuat();

	/**
	 * Sets the noi san xuat of this qlvt cap phep phuong tien van tai.
	 *
	 * @param noiSanXuat the noi san xuat of this qlvt cap phep phuong tien van tai
	 */
	public void setNoiSanXuat(String noiSanXuat);

	/**
	 * Returns the nam san xuat of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the nam san xuat of this qlvt cap phep phuong tien van tai
	 */
	public int getNamSanXuat();

	/**
	 * Sets the nam san xuat of this qlvt cap phep phuong tien van tai.
	 *
	 * @param namSanXuat the nam san xuat of this qlvt cap phep phuong tien van tai
	 */
	public void setNamSanXuat(int namSanXuat);

	/**
	 * Returns the so cho ngoi of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the so cho ngoi of this qlvt cap phep phuong tien van tai
	 */
	public int getSoChoNgoi();

	/**
	 * Sets the so cho ngoi of this qlvt cap phep phuong tien van tai.
	 *
	 * @param soChoNgoi the so cho ngoi of this qlvt cap phep phuong tien van tai
	 */
	public void setSoChoNgoi(int soChoNgoi);

	/**
	 * Returns the hinh thuc so huu xe of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the hinh thuc so huu xe of this qlvt cap phep phuong tien van tai
	 */
	@AutoEscape
	public String getHinhThucSoHuuXe();

	/**
	 * Sets the hinh thuc so huu xe of this qlvt cap phep phuong tien van tai.
	 *
	 * @param hinhThucSoHuuXe the hinh thuc so huu xe of this qlvt cap phep phuong tien van tai
	 */
	public void setHinhThucSoHuuXe(String hinhThucSoHuuXe);

	/**
	 * Returns the nien han su dung giay dang kiem of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the nien han su dung giay dang kiem of this qlvt cap phep phuong tien van tai
	 */
	public int getNienHanSuDungGiayDangKiem();

	/**
	 * Sets the nien han su dung giay dang kiem of this qlvt cap phep phuong tien van tai.
	 *
	 * @param nienHanSuDungGiayDangKiem the nien han su dung giay dang kiem of this qlvt cap phep phuong tien van tai
	 */
	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem);

	/**
	 * Returns the nien han su dung n d86 of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the nien han su dung n d86 of this qlvt cap phep phuong tien van tai
	 */
	public int getNienHanSuDungND86();

	/**
	 * Sets the nien han su dung n d86 of this qlvt cap phep phuong tien van tai.
	 *
	 * @param nienHanSuDungND86 the nien han su dung n d86 of this qlvt cap phep phuong tien van tai
	 */
	public void setNienHanSuDungND86(int nienHanSuDungND86);

	/**
	 * Returns the so khung of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the so khung of this qlvt cap phep phuong tien van tai
	 */
	@AutoEscape
	public String getSoKhung();

	/**
	 * Sets the so khung of this qlvt cap phep phuong tien van tai.
	 *
	 * @param soKhung the so khung of this qlvt cap phep phuong tien van tai
	 */
	public void setSoKhung(String soKhung);

	/**
	 * Returns the so may of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the so may of this qlvt cap phep phuong tien van tai
	 */
	@AutoEscape
	public String getSoMay();

	/**
	 * Sets the so may of this qlvt cap phep phuong tien van tai.
	 *
	 * @param soMay the so may of this qlvt cap phep phuong tien van tai
	 */
	public void setSoMay(String soMay);

	/**
	 * Returns the mau son of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the mau son of this qlvt cap phep phuong tien van tai
	 */
	@AutoEscape
	public String getMauSon();

	/**
	 * Sets the mau son of this qlvt cap phep phuong tien van tai.
	 *
	 * @param mauSon the mau son of this qlvt cap phep phuong tien van tai
	 */
	public void setMauSon(String mauSon);

	/**
	 * Returns the thong tin xu ly vi pham of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the thong tin xu ly vi pham of this qlvt cap phep phuong tien van tai
	 */
	@AutoEscape
	public String getThongTinXuLyViPham();

	/**
	 * Sets the thong tin xu ly vi pham of this qlvt cap phep phuong tien van tai.
	 *
	 * @param thongTinXuLyViPham the thong tin xu ly vi pham of this qlvt cap phep phuong tien van tai
	 */
	public void setThongTinXuLyViPham(String thongTinXuLyViPham);

	/**
	 * Returns the trang thai of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the trang thai of this qlvt cap phep phuong tien van tai
	 */
	@AutoEscape
	public String getTrangThai();

	/**
	 * Sets the trang thai of this qlvt cap phep phuong tien van tai.
	 *
	 * @param trangThai the trang thai of this qlvt cap phep phuong tien van tai
	 */
	public void setTrangThai(String trangThai);

	/**
	 * Returns the file ID of this qlvt cap phep phuong tien van tai.
	 *
	 * @return the file ID of this qlvt cap phep phuong tien van tai
	 */
	public long getFileId();

	/**
	 * Sets the file ID of this qlvt cap phep phuong tien van tai.
	 *
	 * @param fileId the file ID of this qlvt cap phep phuong tien van tai
	 */
	public void setFileId(long fileId);

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
		QlvtCapPhepPhuongTienVanTai qlvtCapPhepPhuongTienVanTai);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtCapPhepPhuongTienVanTai> toCacheModel();

	@Override
	public QlvtCapPhepPhuongTienVanTai toEscapedModel();

	@Override
	public QlvtCapPhepPhuongTienVanTai toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}