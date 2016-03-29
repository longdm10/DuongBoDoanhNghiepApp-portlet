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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the QlvtThongTinHoSoGiayPhepVanTai service. Represents a row in the &quot;ngbiepvu_thongtinhoso_qlvt_giayphepvantai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoGiayPhepVanTai
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiModelImpl
 * @generated
 */
public interface QlvtThongTinHoSoGiayPhepVanTaiModel extends BaseModel<QlvtThongTinHoSoGiayPhepVanTai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt thong tin ho so giay phep van tai model instance should use the {@link QlvtThongTinHoSoGiayPhepVanTai} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt thong tin ho so giay phep van tai.
	 *
	 * @return the primary key of this qlvt thong tin ho so giay phep van tai
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt thong tin ho so giay phep van tai.
	 *
	 * @param primaryKey the primary key of this qlvt thong tin ho so giay phep van tai
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt thong tin ho so giay phep van tai.
	 *
	 * @return the ID of this qlvt thong tin ho so giay phep van tai
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt thong tin ho so giay phep van tai.
	 *
	 * @param id the ID of this qlvt thong tin ho so giay phep van tai
	 */
	public void setId(long id);

	/**
	 * Returns the thongtinhoso ID of this qlvt thong tin ho so giay phep van tai.
	 *
	 * @return the thongtinhoso ID of this qlvt thong tin ho so giay phep van tai
	 */
	public long getThongtinhosoId();

	/**
	 * Sets the thongtinhoso ID of this qlvt thong tin ho so giay phep van tai.
	 *
	 * @param thongtinhosoId the thongtinhoso ID of this qlvt thong tin ho so giay phep van tai
	 */
	public void setThongtinhosoId(long thongtinhosoId);

	/**
	 * Returns the capphep gpkdvt ID of this qlvt thong tin ho so giay phep van tai.
	 *
	 * @return the capphep gpkdvt ID of this qlvt thong tin ho so giay phep van tai
	 */
	public long getCapphepGpkdvtId();

	/**
	 * Sets the capphep gpkdvt ID of this qlvt thong tin ho so giay phep van tai.
	 *
	 * @param capphepGpkdvtId the capphep gpkdvt ID of this qlvt thong tin ho so giay phep van tai
	 */
	public void setCapphepGpkdvtId(long capphepGpkdvtId);

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
		QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtThongTinHoSoGiayPhepVanTai> toCacheModel();

	@Override
	public QlvtThongTinHoSoGiayPhepVanTai toEscapedModel();

	@Override
	public QlvtThongTinHoSoGiayPhepVanTai toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}