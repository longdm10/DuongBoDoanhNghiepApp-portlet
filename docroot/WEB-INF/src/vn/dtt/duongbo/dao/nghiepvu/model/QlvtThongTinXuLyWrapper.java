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

package vn.dtt.duongbo.dao.nghiepvu.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtThongTinXuLy}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinXuLy
 * @generated
 */
public class QlvtThongTinXuLyWrapper implements QlvtThongTinXuLy,
	ModelWrapper<QlvtThongTinXuLy> {
	public QlvtThongTinXuLyWrapper(QlvtThongTinXuLy qlvtThongTinXuLy) {
		_qlvtThongTinXuLy = qlvtThongTinXuLy;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinXuLy.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinXuLy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("thongTinHoSoId", getThongTinHoSoId());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("canBoXuLy", getCanBoXuLy());
		attributes.put("thoiGianXuLy", getThoiGianXuLy());
		attributes.put("yKienCanBoXuLy", getYKienCanBoXuLy());
		attributes.put("lanhDaoDuyet", getLanhDaoDuyet());
		attributes.put("yKienLanhDaoDuyet", getYKienLanhDaoDuyet());
		attributes.put("thoiGianDuyet", getThoiGianDuyet());
		attributes.put("ketQuaDuyet", getKetQuaDuyet());
		attributes.put("lanhDaoPheDuyet", getLanhDaoPheDuyet());
		attributes.put("thoiGianPheDuyet", getThoiGianPheDuyet());
		attributes.put("ketQuaPheDuyet", getKetQuaPheDuyet());
		attributes.put("yKienLanhDaoPheDuyet", getYKienLanhDaoPheDuyet());
		attributes.put("nguoiTraKetQua", getNguoiTraKetQua());
		attributes.put("thoiGianTraKetQua", getThoiGianTraKetQua());
		attributes.put("thoiGianCapPhep", getThoiGianCapPhep());
		attributes.put("ketQuaThamDinhXML", getKetQuaThamDinhXML());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		Long thongTinHoSoId = (Long)attributes.get("thongTinHoSoId");

		if (thongTinHoSoId != null) {
			setThongTinHoSoId(thongTinHoSoId);
		}

		String maSoHoSo = (String)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		Integer canBoXuLy = (Integer)attributes.get("canBoXuLy");

		if (canBoXuLy != null) {
			setCanBoXuLy(canBoXuLy);
		}

		Date thoiGianXuLy = (Date)attributes.get("thoiGianXuLy");

		if (thoiGianXuLy != null) {
			setThoiGianXuLy(thoiGianXuLy);
		}

		String yKienCanBoXuLy = (String)attributes.get("yKienCanBoXuLy");

		if (yKienCanBoXuLy != null) {
			setYKienCanBoXuLy(yKienCanBoXuLy);
		}

		Integer lanhDaoDuyet = (Integer)attributes.get("lanhDaoDuyet");

		if (lanhDaoDuyet != null) {
			setLanhDaoDuyet(lanhDaoDuyet);
		}

		String yKienLanhDaoDuyet = (String)attributes.get("yKienLanhDaoDuyet");

		if (yKienLanhDaoDuyet != null) {
			setYKienLanhDaoDuyet(yKienLanhDaoDuyet);
		}

		Date thoiGianDuyet = (Date)attributes.get("thoiGianDuyet");

		if (thoiGianDuyet != null) {
			setThoiGianDuyet(thoiGianDuyet);
		}

		Integer ketQuaDuyet = (Integer)attributes.get("ketQuaDuyet");

		if (ketQuaDuyet != null) {
			setKetQuaDuyet(ketQuaDuyet);
		}

		Integer lanhDaoPheDuyet = (Integer)attributes.get("lanhDaoPheDuyet");

		if (lanhDaoPheDuyet != null) {
			setLanhDaoPheDuyet(lanhDaoPheDuyet);
		}

		Date thoiGianPheDuyet = (Date)attributes.get("thoiGianPheDuyet");

		if (thoiGianPheDuyet != null) {
			setThoiGianPheDuyet(thoiGianPheDuyet);
		}

		Integer ketQuaPheDuyet = (Integer)attributes.get("ketQuaPheDuyet");

		if (ketQuaPheDuyet != null) {
			setKetQuaPheDuyet(ketQuaPheDuyet);
		}

		String yKienLanhDaoPheDuyet = (String)attributes.get(
				"yKienLanhDaoPheDuyet");

		if (yKienLanhDaoPheDuyet != null) {
			setYKienLanhDaoPheDuyet(yKienLanhDaoPheDuyet);
		}

		Integer nguoiTraKetQua = (Integer)attributes.get("nguoiTraKetQua");

		if (nguoiTraKetQua != null) {
			setNguoiTraKetQua(nguoiTraKetQua);
		}

		Date thoiGianTraKetQua = (Date)attributes.get("thoiGianTraKetQua");

		if (thoiGianTraKetQua != null) {
			setThoiGianTraKetQua(thoiGianTraKetQua);
		}

		Date thoiGianCapPhep = (Date)attributes.get("thoiGianCapPhep");

		if (thoiGianCapPhep != null) {
			setThoiGianCapPhep(thoiGianCapPhep);
		}

		String ketQuaThamDinhXML = (String)attributes.get("ketQuaThamDinhXML");

		if (ketQuaThamDinhXML != null) {
			setKetQuaThamDinhXML(ketQuaThamDinhXML);
		}
	}

	/**
	* Returns the primary key of this qlvt thong tin xu ly.
	*
	* @return the primary key of this qlvt thong tin xu ly
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtThongTinXuLy.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt thong tin xu ly.
	*
	* @param primaryKey the primary key of this qlvt thong tin xu ly
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtThongTinXuLy.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt thong tin xu ly.
	*
	* @return the ID of this qlvt thong tin xu ly
	*/
	@Override
	public long getId() {
		return _qlvtThongTinXuLy.getId();
	}

	/**
	* Sets the ID of this qlvt thong tin xu ly.
	*
	* @param id the ID of this qlvt thong tin xu ly
	*/
	@Override
	public void setId(long id) {
		_qlvtThongTinXuLy.setId(id);
	}

	/**
	* Returns the ket qua xu ly of this qlvt thong tin xu ly.
	*
	* @return the ket qua xu ly of this qlvt thong tin xu ly
	*/
	@Override
	public java.lang.String getKetQuaXuLy() {
		return _qlvtThongTinXuLy.getKetQuaXuLy();
	}

	/**
	* Sets the ket qua xu ly of this qlvt thong tin xu ly.
	*
	* @param ketQuaXuLy the ket qua xu ly of this qlvt thong tin xu ly
	*/
	@Override
	public void setKetQuaXuLy(java.lang.String ketQuaXuLy) {
		_qlvtThongTinXuLy.setKetQuaXuLy(ketQuaXuLy);
	}

	/**
	* Returns the thong tin ho so ID of this qlvt thong tin xu ly.
	*
	* @return the thong tin ho so ID of this qlvt thong tin xu ly
	*/
	@Override
	public long getThongTinHoSoId() {
		return _qlvtThongTinXuLy.getThongTinHoSoId();
	}

	/**
	* Sets the thong tin ho so ID of this qlvt thong tin xu ly.
	*
	* @param thongTinHoSoId the thong tin ho so ID of this qlvt thong tin xu ly
	*/
	@Override
	public void setThongTinHoSoId(long thongTinHoSoId) {
		_qlvtThongTinXuLy.setThongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Returns the ma so ho so of this qlvt thong tin xu ly.
	*
	* @return the ma so ho so of this qlvt thong tin xu ly
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _qlvtThongTinXuLy.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this qlvt thong tin xu ly.
	*
	* @param maSoHoSo the ma so ho so of this qlvt thong tin xu ly
	*/
	@Override
	public void setMaSoHoSo(java.lang.String maSoHoSo) {
		_qlvtThongTinXuLy.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the can bo xu ly of this qlvt thong tin xu ly.
	*
	* @return the can bo xu ly of this qlvt thong tin xu ly
	*/
	@Override
	public int getCanBoXuLy() {
		return _qlvtThongTinXuLy.getCanBoXuLy();
	}

	/**
	* Sets the can bo xu ly of this qlvt thong tin xu ly.
	*
	* @param canBoXuLy the can bo xu ly of this qlvt thong tin xu ly
	*/
	@Override
	public void setCanBoXuLy(int canBoXuLy) {
		_qlvtThongTinXuLy.setCanBoXuLy(canBoXuLy);
	}

	/**
	* Returns the thoi gian xu ly of this qlvt thong tin xu ly.
	*
	* @return the thoi gian xu ly of this qlvt thong tin xu ly
	*/
	@Override
	public java.util.Date getThoiGianXuLy() {
		return _qlvtThongTinXuLy.getThoiGianXuLy();
	}

	/**
	* Sets the thoi gian xu ly of this qlvt thong tin xu ly.
	*
	* @param thoiGianXuLy the thoi gian xu ly of this qlvt thong tin xu ly
	*/
	@Override
	public void setThoiGianXuLy(java.util.Date thoiGianXuLy) {
		_qlvtThongTinXuLy.setThoiGianXuLy(thoiGianXuLy);
	}

	/**
	* Returns the y kien can bo xu ly of this qlvt thong tin xu ly.
	*
	* @return the y kien can bo xu ly of this qlvt thong tin xu ly
	*/
	@Override
	public java.lang.String getYKienCanBoXuLy() {
		return _qlvtThongTinXuLy.getYKienCanBoXuLy();
	}

	/**
	* Sets the y kien can bo xu ly of this qlvt thong tin xu ly.
	*
	* @param yKienCanBoXuLy the y kien can bo xu ly of this qlvt thong tin xu ly
	*/
	@Override
	public void setYKienCanBoXuLy(java.lang.String yKienCanBoXuLy) {
		_qlvtThongTinXuLy.setYKienCanBoXuLy(yKienCanBoXuLy);
	}

	/**
	* Returns the lanh dao duyet of this qlvt thong tin xu ly.
	*
	* @return the lanh dao duyet of this qlvt thong tin xu ly
	*/
	@Override
	public int getLanhDaoDuyet() {
		return _qlvtThongTinXuLy.getLanhDaoDuyet();
	}

	/**
	* Sets the lanh dao duyet of this qlvt thong tin xu ly.
	*
	* @param lanhDaoDuyet the lanh dao duyet of this qlvt thong tin xu ly
	*/
	@Override
	public void setLanhDaoDuyet(int lanhDaoDuyet) {
		_qlvtThongTinXuLy.setLanhDaoDuyet(lanhDaoDuyet);
	}

	/**
	* Returns the y kien lanh dao duyet of this qlvt thong tin xu ly.
	*
	* @return the y kien lanh dao duyet of this qlvt thong tin xu ly
	*/
	@Override
	public java.lang.String getYKienLanhDaoDuyet() {
		return _qlvtThongTinXuLy.getYKienLanhDaoDuyet();
	}

	/**
	* Sets the y kien lanh dao duyet of this qlvt thong tin xu ly.
	*
	* @param yKienLanhDaoDuyet the y kien lanh dao duyet of this qlvt thong tin xu ly
	*/
	@Override
	public void setYKienLanhDaoDuyet(java.lang.String yKienLanhDaoDuyet) {
		_qlvtThongTinXuLy.setYKienLanhDaoDuyet(yKienLanhDaoDuyet);
	}

	/**
	* Returns the thoi gian duyet of this qlvt thong tin xu ly.
	*
	* @return the thoi gian duyet of this qlvt thong tin xu ly
	*/
	@Override
	public java.util.Date getThoiGianDuyet() {
		return _qlvtThongTinXuLy.getThoiGianDuyet();
	}

	/**
	* Sets the thoi gian duyet of this qlvt thong tin xu ly.
	*
	* @param thoiGianDuyet the thoi gian duyet of this qlvt thong tin xu ly
	*/
	@Override
	public void setThoiGianDuyet(java.util.Date thoiGianDuyet) {
		_qlvtThongTinXuLy.setThoiGianDuyet(thoiGianDuyet);
	}

	/**
	* Returns the ket qua duyet of this qlvt thong tin xu ly.
	*
	* @return the ket qua duyet of this qlvt thong tin xu ly
	*/
	@Override
	public int getKetQuaDuyet() {
		return _qlvtThongTinXuLy.getKetQuaDuyet();
	}

	/**
	* Sets the ket qua duyet of this qlvt thong tin xu ly.
	*
	* @param ketQuaDuyet the ket qua duyet of this qlvt thong tin xu ly
	*/
	@Override
	public void setKetQuaDuyet(int ketQuaDuyet) {
		_qlvtThongTinXuLy.setKetQuaDuyet(ketQuaDuyet);
	}

	/**
	* Returns the lanh dao phe duyet of this qlvt thong tin xu ly.
	*
	* @return the lanh dao phe duyet of this qlvt thong tin xu ly
	*/
	@Override
	public int getLanhDaoPheDuyet() {
		return _qlvtThongTinXuLy.getLanhDaoPheDuyet();
	}

	/**
	* Sets the lanh dao phe duyet of this qlvt thong tin xu ly.
	*
	* @param lanhDaoPheDuyet the lanh dao phe duyet of this qlvt thong tin xu ly
	*/
	@Override
	public void setLanhDaoPheDuyet(int lanhDaoPheDuyet) {
		_qlvtThongTinXuLy.setLanhDaoPheDuyet(lanhDaoPheDuyet);
	}

	/**
	* Returns the thoi gian phe duyet of this qlvt thong tin xu ly.
	*
	* @return the thoi gian phe duyet of this qlvt thong tin xu ly
	*/
	@Override
	public java.util.Date getThoiGianPheDuyet() {
		return _qlvtThongTinXuLy.getThoiGianPheDuyet();
	}

	/**
	* Sets the thoi gian phe duyet of this qlvt thong tin xu ly.
	*
	* @param thoiGianPheDuyet the thoi gian phe duyet of this qlvt thong tin xu ly
	*/
	@Override
	public void setThoiGianPheDuyet(java.util.Date thoiGianPheDuyet) {
		_qlvtThongTinXuLy.setThoiGianPheDuyet(thoiGianPheDuyet);
	}

	/**
	* Returns the ket qua phe duyet of this qlvt thong tin xu ly.
	*
	* @return the ket qua phe duyet of this qlvt thong tin xu ly
	*/
	@Override
	public int getKetQuaPheDuyet() {
		return _qlvtThongTinXuLy.getKetQuaPheDuyet();
	}

	/**
	* Sets the ket qua phe duyet of this qlvt thong tin xu ly.
	*
	* @param ketQuaPheDuyet the ket qua phe duyet of this qlvt thong tin xu ly
	*/
	@Override
	public void setKetQuaPheDuyet(int ketQuaPheDuyet) {
		_qlvtThongTinXuLy.setKetQuaPheDuyet(ketQuaPheDuyet);
	}

	/**
	* Returns the y kien lanh dao phe duyet of this qlvt thong tin xu ly.
	*
	* @return the y kien lanh dao phe duyet of this qlvt thong tin xu ly
	*/
	@Override
	public java.lang.String getYKienLanhDaoPheDuyet() {
		return _qlvtThongTinXuLy.getYKienLanhDaoPheDuyet();
	}

	/**
	* Sets the y kien lanh dao phe duyet of this qlvt thong tin xu ly.
	*
	* @param yKienLanhDaoPheDuyet the y kien lanh dao phe duyet of this qlvt thong tin xu ly
	*/
	@Override
	public void setYKienLanhDaoPheDuyet(java.lang.String yKienLanhDaoPheDuyet) {
		_qlvtThongTinXuLy.setYKienLanhDaoPheDuyet(yKienLanhDaoPheDuyet);
	}

	/**
	* Returns the nguoi tra ket qua of this qlvt thong tin xu ly.
	*
	* @return the nguoi tra ket qua of this qlvt thong tin xu ly
	*/
	@Override
	public int getNguoiTraKetQua() {
		return _qlvtThongTinXuLy.getNguoiTraKetQua();
	}

	/**
	* Sets the nguoi tra ket qua of this qlvt thong tin xu ly.
	*
	* @param nguoiTraKetQua the nguoi tra ket qua of this qlvt thong tin xu ly
	*/
	@Override
	public void setNguoiTraKetQua(int nguoiTraKetQua) {
		_qlvtThongTinXuLy.setNguoiTraKetQua(nguoiTraKetQua);
	}

	/**
	* Returns the thoi gian tra ket qua of this qlvt thong tin xu ly.
	*
	* @return the thoi gian tra ket qua of this qlvt thong tin xu ly
	*/
	@Override
	public java.util.Date getThoiGianTraKetQua() {
		return _qlvtThongTinXuLy.getThoiGianTraKetQua();
	}

	/**
	* Sets the thoi gian tra ket qua of this qlvt thong tin xu ly.
	*
	* @param thoiGianTraKetQua the thoi gian tra ket qua of this qlvt thong tin xu ly
	*/
	@Override
	public void setThoiGianTraKetQua(java.util.Date thoiGianTraKetQua) {
		_qlvtThongTinXuLy.setThoiGianTraKetQua(thoiGianTraKetQua);
	}

	/**
	* Returns the thoi gian cap phep of this qlvt thong tin xu ly.
	*
	* @return the thoi gian cap phep of this qlvt thong tin xu ly
	*/
	@Override
	public java.util.Date getThoiGianCapPhep() {
		return _qlvtThongTinXuLy.getThoiGianCapPhep();
	}

	/**
	* Sets the thoi gian cap phep of this qlvt thong tin xu ly.
	*
	* @param thoiGianCapPhep the thoi gian cap phep of this qlvt thong tin xu ly
	*/
	@Override
	public void setThoiGianCapPhep(java.util.Date thoiGianCapPhep) {
		_qlvtThongTinXuLy.setThoiGianCapPhep(thoiGianCapPhep);
	}

	/**
	* Returns the ket qua tham dinh x m l of this qlvt thong tin xu ly.
	*
	* @return the ket qua tham dinh x m l of this qlvt thong tin xu ly
	*/
	@Override
	public java.lang.String getKetQuaThamDinhXML() {
		return _qlvtThongTinXuLy.getKetQuaThamDinhXML();
	}

	/**
	* Sets the ket qua tham dinh x m l of this qlvt thong tin xu ly.
	*
	* @param ketQuaThamDinhXML the ket qua tham dinh x m l of this qlvt thong tin xu ly
	*/
	@Override
	public void setKetQuaThamDinhXML(java.lang.String ketQuaThamDinhXML) {
		_qlvtThongTinXuLy.setKetQuaThamDinhXML(ketQuaThamDinhXML);
	}

	@Override
	public boolean isNew() {
		return _qlvtThongTinXuLy.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtThongTinXuLy.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtThongTinXuLy.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtThongTinXuLy.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtThongTinXuLy.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtThongTinXuLy.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtThongTinXuLy.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtThongTinXuLy.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtThongTinXuLy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtThongTinXuLy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtThongTinXuLy.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtThongTinXuLyWrapper((QlvtThongTinXuLy)_qlvtThongTinXuLy.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy qlvtThongTinXuLy) {
		return _qlvtThongTinXuLy.compareTo(qlvtThongTinXuLy);
	}

	@Override
	public int hashCode() {
		return _qlvtThongTinXuLy.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy> toCacheModel() {
		return _qlvtThongTinXuLy.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy toEscapedModel() {
		return new QlvtThongTinXuLyWrapper(_qlvtThongTinXuLy.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy toUnescapedModel() {
		return new QlvtThongTinXuLyWrapper(_qlvtThongTinXuLy.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtThongTinXuLy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtThongTinXuLy.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtThongTinXuLy.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtThongTinXuLyWrapper)) {
			return false;
		}

		QlvtThongTinXuLyWrapper qlvtThongTinXuLyWrapper = (QlvtThongTinXuLyWrapper)obj;

		if (Validator.equals(_qlvtThongTinXuLy,
					qlvtThongTinXuLyWrapper._qlvtThongTinXuLy)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtThongTinXuLy getWrappedQlvtThongTinXuLy() {
		return _qlvtThongTinXuLy;
	}

	@Override
	public QlvtThongTinXuLy getWrappedModel() {
		return _qlvtThongTinXuLy;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtThongTinXuLy.resetOriginalValues();
	}

	private QlvtThongTinXuLy _qlvtThongTinXuLy;
}