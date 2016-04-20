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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MotCuaDienBienHoSo service. Represents a row in the &quot;motcua_dienbienhoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see MotCuaDienBienHoSo
 * @see vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoImpl
 * @see vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl
 * @generated
 */
public interface MotCuaDienBienHoSoModel extends BaseModel<MotCuaDienBienHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mot cua dien bien ho so model instance should use the {@link MotCuaDienBienHoSo} interface instead.
	 */

	/**
	 * Returns the primary key of this mot cua dien bien ho so.
	 *
	 * @return the primary key of this mot cua dien bien ho so
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mot cua dien bien ho so.
	 *
	 * @param primaryKey the primary key of this mot cua dien bien ho so
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this mot cua dien bien ho so.
	 *
	 * @return the ID of this mot cua dien bien ho so
	 */
	public long getId();

	/**
	 * Sets the ID of this mot cua dien bien ho so.
	 *
	 * @param id the ID of this mot cua dien bien ho so
	 */
	public void setId(long id);

	/**
	 * Returns the ho so thu tuc ID of this mot cua dien bien ho so.
	 *
	 * @return the ho so thu tuc ID of this mot cua dien bien ho so
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this mot cua dien bien ho so.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID of this mot cua dien bien ho so
	 */
	public void setHoSoThuTucId(long hoSoThuTucId);

	/**
	 * Returns the phieu xu ly ID of this mot cua dien bien ho so.
	 *
	 * @return the phieu xu ly ID of this mot cua dien bien ho so
	 */
	public long getPhieuXuLyId();

	/**
	 * Sets the phieu xu ly ID of this mot cua dien bien ho so.
	 *
	 * @param phieuXuLyId the phieu xu ly ID of this mot cua dien bien ho so
	 */
	public void setPhieuXuLyId(long phieuXuLyId);

	/**
	 * Returns the so ngay qua han of this mot cua dien bien ho so.
	 *
	 * @return the so ngay qua han of this mot cua dien bien ho so
	 */
	public int getSoNgayQuaHan();

	/**
	 * Sets the so ngay qua han of this mot cua dien bien ho so.
	 *
	 * @param soNgayQuaHan the so ngay qua han of this mot cua dien bien ho so
	 */
	public void setSoNgayQuaHan(int soNgayQuaHan);

	/**
	 * Returns the trang thai truoc ID of this mot cua dien bien ho so.
	 *
	 * @return the trang thai truoc ID of this mot cua dien bien ho so
	 */
	public long getTrangThaiTruocId();

	/**
	 * Sets the trang thai truoc ID of this mot cua dien bien ho so.
	 *
	 * @param trangThaiTruocId the trang thai truoc ID of this mot cua dien bien ho so
	 */
	public void setTrangThaiTruocId(long trangThaiTruocId);

	/**
	 * Returns the trang thai sau ID of this mot cua dien bien ho so.
	 *
	 * @return the trang thai sau ID of this mot cua dien bien ho so
	 */
	public long getTrangThaiSauId();

	/**
	 * Sets the trang thai sau ID of this mot cua dien bien ho so.
	 *
	 * @param trangThaiSauId the trang thai sau ID of this mot cua dien bien ho so
	 */
	public void setTrangThaiSauId(long trangThaiSauId);

	/**
	 * Returns the ngay xu ly of this mot cua dien bien ho so.
	 *
	 * @return the ngay xu ly of this mot cua dien bien ho so
	 */
	public Date getNgayXuLy();

	/**
	 * Sets the ngay xu ly of this mot cua dien bien ho so.
	 *
	 * @param ngayXuLy the ngay xu ly of this mot cua dien bien ho so
	 */
	public void setNgayXuLy(Date ngayXuLy);

	/**
	 * Returns the nguoi xu ly of this mot cua dien bien ho so.
	 *
	 * @return the nguoi xu ly of this mot cua dien bien ho so
	 */
	public long getNguoiXuLy();

	/**
	 * Sets the nguoi xu ly of this mot cua dien bien ho so.
	 *
	 * @param nguoiXuLy the nguoi xu ly of this mot cua dien bien ho so
	 */
	public void setNguoiXuLy(long nguoiXuLy);

	/**
	 * Returns the hanh dong xu ly of this mot cua dien bien ho so.
	 *
	 * @return the hanh dong xu ly of this mot cua dien bien ho so
	 */
	@AutoEscape
	public String getHanhDongXuLy();

	/**
	 * Sets the hanh dong xu ly of this mot cua dien bien ho so.
	 *
	 * @param hanhDongXuLy the hanh dong xu ly of this mot cua dien bien ho so
	 */
	public void setHanhDongXuLy(String hanhDongXuLy);

	/**
	 * Returns the ghi chu of this mot cua dien bien ho so.
	 *
	 * @return the ghi chu of this mot cua dien bien ho so
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this mot cua dien bien ho so.
	 *
	 * @param ghiChu the ghi chu of this mot cua dien bien ho so
	 */
	public void setGhiChu(String ghiChu);

	/**
	 * Returns the tai lieu dinh kem of this mot cua dien bien ho so.
	 *
	 * @return the tai lieu dinh kem of this mot cua dien bien ho so
	 */
	public long getTaiLieuDinhKem();

	/**
	 * Sets the tai lieu dinh kem of this mot cua dien bien ho so.
	 *
	 * @param taiLieuDinhKem the tai lieu dinh kem of this mot cua dien bien ho so
	 */
	public void setTaiLieuDinhKem(long taiLieuDinhKem);

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
	public int compareTo(MotCuaDienBienHoSo motCuaDienBienHoSo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MotCuaDienBienHoSo> toCacheModel();

	@Override
	public MotCuaDienBienHoSo toEscapedModel();

	@Override
	public MotCuaDienBienHoSo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}