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
 * The base model interface for the QlvtCapPhepGplvPhuongTienVanTai service. Represents a row in the &quot;qlvt_capphep_gplienvan_phuongtien_qlvt_phuongtienvantai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTienVanTai
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiImpl
 * @see vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiModelImpl
 * @generated
 */
public interface QlvtCapPhepGplvPhuongTienVanTaiModel extends BaseModel<QlvtCapPhepGplvPhuongTienVanTai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a qlvt cap phep gplv phuong tien van tai model instance should use the {@link QlvtCapPhepGplvPhuongTienVanTai} interface instead.
	 */

	/**
	 * Returns the primary key of this qlvt cap phep gplv phuong tien van tai.
	 *
	 * @return the primary key of this qlvt cap phep gplv phuong tien van tai
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this qlvt cap phep gplv phuong tien van tai.
	 *
	 * @param primaryKey the primary key of this qlvt cap phep gplv phuong tien van tai
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this qlvt cap phep gplv phuong tien van tai.
	 *
	 * @return the ID of this qlvt cap phep gplv phuong tien van tai
	 */
	public long getId();

	/**
	 * Sets the ID of this qlvt cap phep gplv phuong tien van tai.
	 *
	 * @param id the ID of this qlvt cap phep gplv phuong tien van tai
	 */
	public void setId(long id);

	/**
	 * Returns the capphep gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai.
	 *
	 * @return the capphep gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai
	 */
	public long getCapphepGplienvanPhuongtienId();

	/**
	 * Sets the capphep gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai.
	 *
	 * @param capphepGplienvanPhuongtienId the capphep gplienvan phuongtien ID of this qlvt cap phep gplv phuong tien van tai
	 */
	public void setCapphepGplienvanPhuongtienId(
		long capphepGplienvanPhuongtienId);

	/**
	 * Returns the capphep phuongtienvantai ID of this qlvt cap phep gplv phuong tien van tai.
	 *
	 * @return the capphep phuongtienvantai ID of this qlvt cap phep gplv phuong tien van tai
	 */
	public long getCapphepPhuongtienvantaiId();

	/**
	 * Sets the capphep phuongtienvantai ID of this qlvt cap phep gplv phuong tien van tai.
	 *
	 * @param capphepPhuongtienvantaiId the capphep phuongtienvantai ID of this qlvt cap phep gplv phuong tien van tai
	 */
	public void setCapphepPhuongtienvantaiId(long capphepPhuongtienvantaiId);

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
		QlvtCapPhepGplvPhuongTienVanTai qlvtCapPhepGplvPhuongTienVanTai);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QlvtCapPhepGplvPhuongTienVanTai> toCacheModel();

	@Override
	public QlvtCapPhepGplvPhuongTienVanTai toEscapedModel();

	@Override
	public QlvtCapPhepGplvPhuongTienVanTai toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}