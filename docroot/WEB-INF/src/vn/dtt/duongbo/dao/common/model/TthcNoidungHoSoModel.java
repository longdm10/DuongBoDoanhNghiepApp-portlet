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
 * The base model interface for the TthcNoidungHoSo service. Represents a row in the &quot;tthc_noidunghoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSo
 * @see vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoImpl
 * @see vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl
 * @generated
 */
public interface TthcNoidungHoSoModel extends BaseModel<TthcNoidungHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tthc noidung ho so model instance should use the {@link TthcNoidungHoSo} interface instead.
	 */

	/**
	 * Returns the primary key of this tthc noidung ho so.
	 *
	 * @return the primary key of this tthc noidung ho so
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tthc noidung ho so.
	 *
	 * @param primaryKey the primary key of this tthc noidung ho so
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tthc noidung ho so.
	 *
	 * @return the ID of this tthc noidung ho so
	 */
	public long getId();

	/**
	 * Sets the ID of this tthc noidung ho so.
	 *
	 * @param id the ID of this tthc noidung ho so
	 */
	public void setId(long id);

	/**
	 * Returns the ma tu sinh of this tthc noidung ho so.
	 *
	 * @return the ma tu sinh of this tthc noidung ho so
	 */
	@AutoEscape
	public String getMaTuSinh();

	/**
	 * Sets the ma tu sinh of this tthc noidung ho so.
	 *
	 * @param maTuSinh the ma tu sinh of this tthc noidung ho so
	 */
	public void setMaTuSinh(String maTuSinh);

	/**
	 * Returns the ho so thu tuc ID of this tthc noidung ho so.
	 *
	 * @return the ho so thu tuc ID of this tthc noidung ho so
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this tthc noidung ho so.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID of this tthc noidung ho so
	 */
	public void setHoSoThuTucId(long hoSoThuTucId);

	/**
	 * Returns the thanh phan ho so ID of this tthc noidung ho so.
	 *
	 * @return the thanh phan ho so ID of this tthc noidung ho so
	 */
	public long getThanhPhanHoSoId();

	/**
	 * Sets the thanh phan ho so ID of this tthc noidung ho so.
	 *
	 * @param thanhPhanHoSoId the thanh phan ho so ID of this tthc noidung ho so
	 */
	public void setThanhPhanHoSoId(long thanhPhanHoSoId);

	/**
	 * Returns the ten tai lieu of this tthc noidung ho so.
	 *
	 * @return the ten tai lieu of this tthc noidung ho so
	 */
	@AutoEscape
	public String getTenTaiLieu();

	/**
	 * Sets the ten tai lieu of this tthc noidung ho so.
	 *
	 * @param tenTaiLieu the ten tai lieu of this tthc noidung ho so
	 */
	public void setTenTaiLieu(String tenTaiLieu);

	/**
	 * Returns the tai lieu dinh kem of this tthc noidung ho so.
	 *
	 * @return the tai lieu dinh kem of this tthc noidung ho so
	 */
	public long getTaiLieuDinhKem();

	/**
	 * Sets the tai lieu dinh kem of this tthc noidung ho so.
	 *
	 * @param taiLieuDinhKem the tai lieu dinh kem of this tthc noidung ho so
	 */
	public void setTaiLieuDinhKem(long taiLieuDinhKem);

	/**
	 * Returns the noi dung xml of this tthc noidung ho so.
	 *
	 * @return the noi dung xml of this tthc noidung ho so
	 */
	@AutoEscape
	public String getNoiDungXml();

	/**
	 * Sets the noi dung xml of this tthc noidung ho so.
	 *
	 * @param noiDungXml the noi dung xml of this tthc noidung ho so
	 */
	public void setNoiDungXml(String noiDungXml);

	/**
	 * Returns the noi dung html of this tthc noidung ho so.
	 *
	 * @return the noi dung html of this tthc noidung ho so
	 */
	@AutoEscape
	public String getNoiDungHtml();

	/**
	 * Sets the noi dung html of this tthc noidung ho so.
	 *
	 * @param noiDungHtml the noi dung html of this tthc noidung ho so
	 */
	public void setNoiDungHtml(String noiDungHtml);

	/**
	 * Returns the bieu mau ho so ID of this tthc noidung ho so.
	 *
	 * @return the bieu mau ho so ID of this tthc noidung ho so
	 */
	public long getBieuMauHoSoId();

	/**
	 * Sets the bieu mau ho so ID of this tthc noidung ho so.
	 *
	 * @param bieuMauHoSoId the bieu mau ho so ID of this tthc noidung ho so
	 */
	public void setBieuMauHoSoId(long bieuMauHoSoId);

	/**
	 * Returns the ngay gui nhan of this tthc noidung ho so.
	 *
	 * @return the ngay gui nhan of this tthc noidung ho so
	 */
	public Date getNgayGuiNhan();

	/**
	 * Sets the ngay gui nhan of this tthc noidung ho so.
	 *
	 * @param ngayGuiNhan the ngay gui nhan of this tthc noidung ho so
	 */
	public void setNgayGuiNhan(Date ngayGuiNhan);

	/**
	 * Returns the loai tai lieu of this tthc noidung ho so.
	 *
	 * @return the loai tai lieu of this tthc noidung ho so
	 */
	public long getLoaiTaiLieu();

	/**
	 * Sets the loai tai lieu of this tthc noidung ho so.
	 *
	 * @param loaiTaiLieu the loai tai lieu of this tthc noidung ho so
	 */
	public void setLoaiTaiLieu(long loaiTaiLieu);

	/**
	 * Returns the ngay tao of this tthc noidung ho so.
	 *
	 * @return the ngay tao of this tthc noidung ho so
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this tthc noidung ho so.
	 *
	 * @param ngayTao the ngay tao of this tthc noidung ho so
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the nguoi tao of this tthc noidung ho so.
	 *
	 * @return the nguoi tao of this tthc noidung ho so
	 */
	public long getNguoiTao();

	/**
	 * Sets the nguoi tao of this tthc noidung ho so.
	 *
	 * @param nguoiTao the nguoi tao of this tthc noidung ho so
	 */
	public void setNguoiTao(long nguoiTao);

	/**
	 * Returns the trang thai of this tthc noidung ho so.
	 *
	 * @return the trang thai of this tthc noidung ho so
	 */
	public long getTrangThai();

	/**
	 * Sets the trang thai of this tthc noidung ho so.
	 *
	 * @param trangThai the trang thai of this tthc noidung ho so
	 */
	public void setTrangThai(long trangThai);

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
	public int compareTo(TthcNoidungHoSo tthcNoidungHoSo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TthcNoidungHoSo> toCacheModel();

	@Override
	public TthcNoidungHoSo toEscapedModel();

	@Override
	public TthcNoidungHoSo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}