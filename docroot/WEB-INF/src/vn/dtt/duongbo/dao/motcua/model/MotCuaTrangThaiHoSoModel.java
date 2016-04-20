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

/**
 * The base model interface for the MotCuaTrangThaiHoSo service. Represents a row in the &quot;motcua_trangthaihoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see MotCuaTrangThaiHoSo
 * @see vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoImpl
 * @see vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl
 * @generated
 */
public interface MotCuaTrangThaiHoSoModel extends BaseModel<MotCuaTrangThaiHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mot cua trang thai ho so model instance should use the {@link MotCuaTrangThaiHoSo} interface instead.
	 */

	/**
	 * Returns the primary key of this mot cua trang thai ho so.
	 *
	 * @return the primary key of this mot cua trang thai ho so
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mot cua trang thai ho so.
	 *
	 * @param primaryKey the primary key of this mot cua trang thai ho so
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this mot cua trang thai ho so.
	 *
	 * @return the ID of this mot cua trang thai ho so
	 */
	public long getId();

	/**
	 * Sets the ID of this mot cua trang thai ho so.
	 *
	 * @param id the ID of this mot cua trang thai ho so
	 */
	public void setId(long id);

	/**
	 * Returns the quy trinh thu tuc ID of this mot cua trang thai ho so.
	 *
	 * @return the quy trinh thu tuc ID of this mot cua trang thai ho so
	 */
	public long getQuyTrinhThuTucId();

	/**
	 * Sets the quy trinh thu tuc ID of this mot cua trang thai ho so.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID of this mot cua trang thai ho so
	 */
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId);

	/**
	 * Returns the ma trang thai of this mot cua trang thai ho so.
	 *
	 * @return the ma trang thai of this mot cua trang thai ho so
	 */
	@AutoEscape
	public String getMaTrangThai();

	/**
	 * Sets the ma trang thai of this mot cua trang thai ho so.
	 *
	 * @param maTrangThai the ma trang thai of this mot cua trang thai ho so
	 */
	public void setMaTrangThai(String maTrangThai);

	/**
	 * Returns the ten trang thai of this mot cua trang thai ho so.
	 *
	 * @return the ten trang thai of this mot cua trang thai ho so
	 */
	@AutoEscape
	public String getTenTrangThai();

	/**
	 * Sets the ten trang thai of this mot cua trang thai ho so.
	 *
	 * @param tenTrangThai the ten trang thai of this mot cua trang thai ho so
	 */
	public void setTenTrangThai(String tenTrangThai);

	/**
	 * Returns the ten tieng anh of this mot cua trang thai ho so.
	 *
	 * @return the ten tieng anh of this mot cua trang thai ho so
	 */
	@AutoEscape
	public String getTenTiengAnh();

	/**
	 * Sets the ten tieng anh of this mot cua trang thai ho so.
	 *
	 * @param tenTiengAnh the ten tieng anh of this mot cua trang thai ho so
	 */
	public void setTenTiengAnh(String tenTiengAnh);

	/**
	 * Returns the so thu tu of this mot cua trang thai ho so.
	 *
	 * @return the so thu tu of this mot cua trang thai ho so
	 */
	public int getSoThuTu();

	/**
	 * Sets the so thu tu of this mot cua trang thai ho so.
	 *
	 * @param soThuTu the so thu tu of this mot cua trang thai ho so
	 */
	public void setSoThuTu(int soThuTu);

	/**
	 * Returns the trang thai ket thuc of this mot cua trang thai ho so.
	 *
	 * @return the trang thai ket thuc of this mot cua trang thai ho so
	 */
	public int getTrangThaiKetThuc();

	/**
	 * Sets the trang thai ket thuc of this mot cua trang thai ho so.
	 *
	 * @param trangThaiKetThuc the trang thai ket thuc of this mot cua trang thai ho so
	 */
	public void setTrangThaiKetThuc(int trangThaiKetThuc);

	/**
	 * Returns the mo ta trang thai of this mot cua trang thai ho so.
	 *
	 * @return the mo ta trang thai of this mot cua trang thai ho so
	 */
	@AutoEscape
	public String getMoTaTrangThai();

	/**
	 * Sets the mo ta trang thai of this mot cua trang thai ho so.
	 *
	 * @param moTaTrangThai the mo ta trang thai of this mot cua trang thai ho so
	 */
	public void setMoTaTrangThai(String moTaTrangThai);

	/**
	 * Returns the vai tro xu ly1 of this mot cua trang thai ho so.
	 *
	 * @return the vai tro xu ly1 of this mot cua trang thai ho so
	 */
	public long getVaiTroXuLy1();

	/**
	 * Sets the vai tro xu ly1 of this mot cua trang thai ho so.
	 *
	 * @param vaiTroXuLy1 the vai tro xu ly1 of this mot cua trang thai ho so
	 */
	public void setVaiTroXuLy1(long vaiTroXuLy1);

	/**
	 * Returns the vai tro xu ly2 of this mot cua trang thai ho so.
	 *
	 * @return the vai tro xu ly2 of this mot cua trang thai ho so
	 */
	public long getVaiTroXuLy2();

	/**
	 * Sets the vai tro xu ly2 of this mot cua trang thai ho so.
	 *
	 * @param vaiTroXuLy2 the vai tro xu ly2 of this mot cua trang thai ho so
	 */
	public void setVaiTroXuLy2(long vaiTroXuLy2);

	/**
	 * Returns the vai tro xu ly3 of this mot cua trang thai ho so.
	 *
	 * @return the vai tro xu ly3 of this mot cua trang thai ho so
	 */
	public long getVaiTroXuLy3();

	/**
	 * Sets the vai tro xu ly3 of this mot cua trang thai ho so.
	 *
	 * @param vaiTroXuLy3 the vai tro xu ly3 of this mot cua trang thai ho so
	 */
	public void setVaiTroXuLy3(long vaiTroXuLy3);

	/**
	 * Returns the form xu ly of this mot cua trang thai ho so.
	 *
	 * @return the form xu ly of this mot cua trang thai ho so
	 */
	@AutoEscape
	public String getFormXuLy();

	/**
	 * Sets the form xu ly of this mot cua trang thai ho so.
	 *
	 * @param formXuLy the form xu ly of this mot cua trang thai ho so
	 */
	public void setFormXuLy(String formXuLy);

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
	public int compareTo(MotCuaTrangThaiHoSo motCuaTrangThaiHoSo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MotCuaTrangThaiHoSo> toCacheModel();

	@Override
	public MotCuaTrangThaiHoSo toEscapedModel();

	@Override
	public MotCuaTrangThaiHoSo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}