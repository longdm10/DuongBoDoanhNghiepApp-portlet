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

import java.util.Date;

/**
 * The base model interface for the QlvtXuLyGpkdvtQuocTe service. Represents a row in the &quot;qlvt_xuly_gpkdvt_quocte&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeImpl}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTe
 * @see vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeImpl
 * @see vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeModelImpl
 * @generated
 */
public interface QlvtXuLyGpkdvtQuocTeModel extends BaseModel<QlvtXuLyGpkdvtQuocTe> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt xu ly gpkdvt quoc te model instance should use the {@link QlvtXuLyGpkdvtQuocTe} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the primary key of this qlvt xu ly gpkdvt quoc te
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param primaryKey the primary key of this qlvt xu ly gpkdvt quoc te
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the ID of this qlvt xu ly gpkdvt quoc te
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param id the ID of this qlvt xu ly gpkdvt quoc te
	 */
	public void setId(long id);

	/**
	 * Returns the thong tin xu ly ID of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the thong tin xu ly ID of this qlvt xu ly gpkdvt quoc te
	 */
	public int getThongTinXuLyId();

	/**
	 * Sets the thong tin xu ly ID of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID of this qlvt xu ly gpkdvt quoc te
	 */
	public void setThongTinXuLyId(int thongTinXuLyId);

	/**
	 * Returns the loai cap phep of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the loai cap phep of this qlvt xu ly gpkdvt quoc te
	 */
	@AutoEscape
	public String getLoaiCapPhep();

	/**
	 * Sets the loai cap phep of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param loaiCapPhep the loai cap phep of this qlvt xu ly gpkdvt quoc te
	 */
	public void setLoaiCapPhep(String loaiCapPhep);

	/**
	 * Returns the so giap phep van tai of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the so giap phep van tai of this qlvt xu ly gpkdvt quoc te
	 */
	@AutoEscape
	public String getSoGiapPhepVanTai();

	/**
	 * Sets the so giap phep van tai of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param soGiapPhepVanTai the so giap phep van tai of this qlvt xu ly gpkdvt quoc te
	 */
	public void setSoGiapPhepVanTai(String soGiapPhepVanTai);

	/**
	 * Returns the ngay cap giay phep van tai of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the ngay cap giay phep van tai of this qlvt xu ly gpkdvt quoc te
	 */
	public Date getNgayCapGiayPhepVanTai();

	/**
	 * Sets the ngay cap giay phep van tai of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param ngayCapGiayPhepVanTai the ngay cap giay phep van tai of this qlvt xu ly gpkdvt quoc te
	 */
	public void setNgayCapGiayPhepVanTai(Date ngayCapGiayPhepVanTai);

	/**
	 * Returns the co quan cap giay phep van tai ID of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the co quan cap giay phep van tai ID of this qlvt xu ly gpkdvt quoc te
	 */
	@AutoEscape
	public String getCoQuanCapGiayPhepVanTaiId();

	/**
	 * Sets the co quan cap giay phep van tai ID of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param coQuanCapGiayPhepVanTaiId the co quan cap giay phep van tai ID of this qlvt xu ly gpkdvt quoc te
	 */
	public void setCoQuanCapGiayPhepVanTaiId(String coQuanCapGiayPhepVanTaiId);

	/**
	 * Returns the ngay het han giay phep van tai of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the ngay het han giay phep van tai of this qlvt xu ly gpkdvt quoc te
	 */
	public Date getNgayHetHanGiayPhepVanTai();

	/**
	 * Sets the ngay het han giay phep van tai of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param ngayHetHanGiayPhepVanTai the ngay het han giay phep van tai of this qlvt xu ly gpkdvt quoc te
	 */
	public void setNgayHetHanGiayPhepVanTai(Date ngayHetHanGiayPhepVanTai);

	/**
	 * Returns the muc phi of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the muc phi of this qlvt xu ly gpkdvt quoc te
	 */
	@AutoEscape
	public String getMucPhi();

	/**
	 * Sets the muc phi of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param mucPhi the muc phi of this qlvt xu ly gpkdvt quoc te
	 */
	public void setMucPhi(String mucPhi);

	/**
	 * Returns the ket qua xu ly of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the ket qua xu ly of this qlvt xu ly gpkdvt quoc te
	 */
	@AutoEscape
	public String getKetQuaXuLy();

	/**
	 * Sets the ket qua xu ly of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param ketQuaXuLy the ket qua xu ly of this qlvt xu ly gpkdvt quoc te
	 */
	public void setKetQuaXuLy(String ketQuaXuLy);

	/**
	 * Returns the ly do khong dat of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @return the ly do khong dat of this qlvt xu ly gpkdvt quoc te
	 */
	@AutoEscape
	public String getLyDoKhongDat();

	/**
	 * Sets the ly do khong dat of this qlvt xu ly gpkdvt quoc te.
	 *
	 * @param lyDoKhongDat the ly do khong dat of this qlvt xu ly gpkdvt quoc te
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
	public int compareTo(QlvtXuLyGpkdvtQuocTe qlvtXuLyGpkdvtQuocTe);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtXuLyGpkdvtQuocTe> toCacheModel();

	@Override
	public QlvtXuLyGpkdvtQuocTe toEscapedModel();

	@Override
	public QlvtXuLyGpkdvtQuocTe toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}