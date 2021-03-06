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
 * The base model interface for the QlvtXuLyKTTQuocTeDiemDungNghi service. Represents a row in the &quot;qlvt_xuly_ktt_quocte_diemdungnghi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiImpl}.
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeDiemDungNghi
 * @see vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiImpl
 * @see vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl
 * @generated
 */
public interface QlvtXuLyKTTQuocTeDiemDungNghiModel extends BaseModel<QlvtXuLyKTTQuocTeDiemDungNghi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt xu ly k t t quoc te diem dung nghi model instance should use the {@link QlvtXuLyKTTQuocTeDiemDungNghi} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @return the primary key of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @param primaryKey the primary key of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @return the ID of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @param id the ID of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public void setId(long id);

	/**
	 * Returns the ktt quoc te ID of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @return the ktt quoc te ID of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public int getKttQuocTeId();

	/**
	 * Sets the ktt quoc te ID of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @param kttQuocTeId the ktt quoc te ID of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public void setKttQuocTeId(int kttQuocTeId);

	/**
	 * Returns the loai luot of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @return the loai luot of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	@AutoEscape
	public String getLoaiLuot();

	/**
	 * Sets the loai luot of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @param loaiLuot the loai luot of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public void setLoaiLuot(String loaiLuot);

	/**
	 * Returns the so thu tu luot of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @return the so thu tu luot of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public int getSoThuTuLuot();

	/**
	 * Sets the so thu tu luot of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @param soThuTuLuot the so thu tu luot of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public void setSoThuTuLuot(int soThuTuLuot);

	/**
	 * Returns the ma ben of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @return the ma ben of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	@AutoEscape
	public String getMaBen();

	/**
	 * Sets the ma ben of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @param maBen the ma ben of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public void setMaBen(String maBen);

	/**
	 * Returns the so gio dung nghi of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @return the so gio dung nghi of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public int getSoGioDungNghi();

	/**
	 * Sets the so gio dung nghi of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @param soGioDungNghi the so gio dung nghi of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public void setSoGioDungNghi(int soGioDungNghi);

	/**
	 * Returns the so phut dung nghi of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @return the so phut dung nghi of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public int getSoPhutDungNghi();

	/**
	 * Sets the so phut dung nghi of this qlvt xu ly k t t quoc te diem dung nghi.
	 *
	 * @param soPhutDungNghi the so phut dung nghi of this qlvt xu ly k t t quoc te diem dung nghi
	 */
	public void setSoPhutDungNghi(int soPhutDungNghi);

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
		QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtXuLyKTTQuocTeDiemDungNghi> toCacheModel();

	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi toEscapedModel();

	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghi toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}