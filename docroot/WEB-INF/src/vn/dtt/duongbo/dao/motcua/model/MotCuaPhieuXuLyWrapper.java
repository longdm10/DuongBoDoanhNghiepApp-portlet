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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MotCuaPhieuXuLy}.
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLy
 * @generated
 */
public class MotCuaPhieuXuLyWrapper implements MotCuaPhieuXuLy,
	ModelWrapper<MotCuaPhieuXuLy> {
	public MotCuaPhieuXuLyWrapper(MotCuaPhieuXuLy motCuaPhieuXuLy) {
		_motCuaPhieuXuLy = motCuaPhieuXuLy;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaPhieuXuLy.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaPhieuXuLy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("soThuTu", getSoThuTu());
		attributes.put("trichYeuNoiDung", getTrichYeuNoiDung());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("phieuXuLyCha", getPhieuXuLyCha());
		attributes.put("trangThaiHienTaiId", getTrangThaiHienTaiId());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("chiemQuyenXuLy", getChiemQuyenXuLy());
		attributes.put("trangThaiKetThuc", getTrangThaiKetThuc());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("fileTaiLieu", getFileTaiLieu());
		attributes.put("nguoiXuLy", getNguoiXuLy());
		attributes.put("nguoiDuocUyQuyen", getNguoiDuocUyQuyen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}

		String trichYeuNoiDung = (String)attributes.get("trichYeuNoiDung");

		if (trichYeuNoiDung != null) {
			setTrichYeuNoiDung(trichYeuNoiDung);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long phieuXuLyCha = (Long)attributes.get("phieuXuLyCha");

		if (phieuXuLyCha != null) {
			setPhieuXuLyCha(phieuXuLyCha);
		}

		Long trangThaiHienTaiId = (Long)attributes.get("trangThaiHienTaiId");

		if (trangThaiHienTaiId != null) {
			setTrangThaiHienTaiId(trangThaiHienTaiId);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		Long chiemQuyenXuLy = (Long)attributes.get("chiemQuyenXuLy");

		if (chiemQuyenXuLy != null) {
			setChiemQuyenXuLy(chiemQuyenXuLy);
		}

		Long trangThaiKetThuc = (Long)attributes.get("trangThaiKetThuc");

		if (trangThaiKetThuc != null) {
			setTrangThaiKetThuc(trangThaiKetThuc);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Long fileTaiLieu = (Long)attributes.get("fileTaiLieu");

		if (fileTaiLieu != null) {
			setFileTaiLieu(fileTaiLieu);
		}

		Long nguoiXuLy = (Long)attributes.get("nguoiXuLy");

		if (nguoiXuLy != null) {
			setNguoiXuLy(nguoiXuLy);
		}

		Long nguoiDuocUyQuyen = (Long)attributes.get("nguoiDuocUyQuyen");

		if (nguoiDuocUyQuyen != null) {
			setNguoiDuocUyQuyen(nguoiDuocUyQuyen);
		}
	}

	/**
	* Returns the primary key of this mot cua phieu xu ly.
	*
	* @return the primary key of this mot cua phieu xu ly
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaPhieuXuLy.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua phieu xu ly.
	*
	* @param primaryKey the primary key of this mot cua phieu xu ly
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaPhieuXuLy.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua phieu xu ly.
	*
	* @return the ID of this mot cua phieu xu ly
	*/
	@Override
	public long getId() {
		return _motCuaPhieuXuLy.getId();
	}

	/**
	* Sets the ID of this mot cua phieu xu ly.
	*
	* @param id the ID of this mot cua phieu xu ly
	*/
	@Override
	public void setId(long id) {
		_motCuaPhieuXuLy.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this mot cua phieu xu ly.
	*
	* @return the ho so thu tuc ID of this mot cua phieu xu ly
	*/
	@Override
	public long getHoSoThuTucId() {
		return _motCuaPhieuXuLy.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this mot cua phieu xu ly.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this mot cua phieu xu ly
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_motCuaPhieuXuLy.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the quy trinh thu tuc ID of this mot cua phieu xu ly.
	*
	* @return the quy trinh thu tuc ID of this mot cua phieu xu ly
	*/
	@Override
	public long getQuyTrinhThuTucId() {
		return _motCuaPhieuXuLy.getQuyTrinhThuTucId();
	}

	/**
	* Sets the quy trinh thu tuc ID of this mot cua phieu xu ly.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID of this mot cua phieu xu ly
	*/
	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_motCuaPhieuXuLy.setQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns the so thu tu of this mot cua phieu xu ly.
	*
	* @return the so thu tu of this mot cua phieu xu ly
	*/
	@Override
	public int getSoThuTu() {
		return _motCuaPhieuXuLy.getSoThuTu();
	}

	/**
	* Sets the so thu tu of this mot cua phieu xu ly.
	*
	* @param soThuTu the so thu tu of this mot cua phieu xu ly
	*/
	@Override
	public void setSoThuTu(int soThuTu) {
		_motCuaPhieuXuLy.setSoThuTu(soThuTu);
	}

	/**
	* Returns the trich yeu noi dung of this mot cua phieu xu ly.
	*
	* @return the trich yeu noi dung of this mot cua phieu xu ly
	*/
	@Override
	public java.lang.String getTrichYeuNoiDung() {
		return _motCuaPhieuXuLy.getTrichYeuNoiDung();
	}

	/**
	* Sets the trich yeu noi dung of this mot cua phieu xu ly.
	*
	* @param trichYeuNoiDung the trich yeu noi dung of this mot cua phieu xu ly
	*/
	@Override
	public void setTrichYeuNoiDung(java.lang.String trichYeuNoiDung) {
		_motCuaPhieuXuLy.setTrichYeuNoiDung(trichYeuNoiDung);
	}

	/**
	* Returns the ghi chu of this mot cua phieu xu ly.
	*
	* @return the ghi chu of this mot cua phieu xu ly
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _motCuaPhieuXuLy.getGhiChu();
	}

	/**
	* Sets the ghi chu of this mot cua phieu xu ly.
	*
	* @param ghiChu the ghi chu of this mot cua phieu xu ly
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_motCuaPhieuXuLy.setGhiChu(ghiChu);
	}

	/**
	* Returns the phieu xu ly cha of this mot cua phieu xu ly.
	*
	* @return the phieu xu ly cha of this mot cua phieu xu ly
	*/
	@Override
	public long getPhieuXuLyCha() {
		return _motCuaPhieuXuLy.getPhieuXuLyCha();
	}

	/**
	* Sets the phieu xu ly cha of this mot cua phieu xu ly.
	*
	* @param phieuXuLyCha the phieu xu ly cha of this mot cua phieu xu ly
	*/
	@Override
	public void setPhieuXuLyCha(long phieuXuLyCha) {
		_motCuaPhieuXuLy.setPhieuXuLyCha(phieuXuLyCha);
	}

	/**
	* Returns the trang thai hien tai ID of this mot cua phieu xu ly.
	*
	* @return the trang thai hien tai ID of this mot cua phieu xu ly
	*/
	@Override
	public long getTrangThaiHienTaiId() {
		return _motCuaPhieuXuLy.getTrangThaiHienTaiId();
	}

	/**
	* Sets the trang thai hien tai ID of this mot cua phieu xu ly.
	*
	* @param trangThaiHienTaiId the trang thai hien tai ID of this mot cua phieu xu ly
	*/
	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_motCuaPhieuXuLy.setTrangThaiHienTaiId(trangThaiHienTaiId);
	}

	/**
	* Returns the phan nhom ho so ID of this mot cua phieu xu ly.
	*
	* @return the phan nhom ho so ID of this mot cua phieu xu ly
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _motCuaPhieuXuLy.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this mot cua phieu xu ly.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this mot cua phieu xu ly
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_motCuaPhieuXuLy.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the chiem quyen xu ly of this mot cua phieu xu ly.
	*
	* @return the chiem quyen xu ly of this mot cua phieu xu ly
	*/
	@Override
	public long getChiemQuyenXuLy() {
		return _motCuaPhieuXuLy.getChiemQuyenXuLy();
	}

	/**
	* Sets the chiem quyen xu ly of this mot cua phieu xu ly.
	*
	* @param chiemQuyenXuLy the chiem quyen xu ly of this mot cua phieu xu ly
	*/
	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_motCuaPhieuXuLy.setChiemQuyenXuLy(chiemQuyenXuLy);
	}

	/**
	* Returns the trang thai ket thuc of this mot cua phieu xu ly.
	*
	* @return the trang thai ket thuc of this mot cua phieu xu ly
	*/
	@Override
	public long getTrangThaiKetThuc() {
		return _motCuaPhieuXuLy.getTrangThaiKetThuc();
	}

	/**
	* Sets the trang thai ket thuc of this mot cua phieu xu ly.
	*
	* @param trangThaiKetThuc the trang thai ket thuc of this mot cua phieu xu ly
	*/
	@Override
	public void setTrangThaiKetThuc(long trangThaiKetThuc) {
		_motCuaPhieuXuLy.setTrangThaiKetThuc(trangThaiKetThuc);
	}

	/**
	* Returns the to chuc quan ly of this mot cua phieu xu ly.
	*
	* @return the to chuc quan ly of this mot cua phieu xu ly
	*/
	@Override
	public long getToChucQuanLy() {
		return _motCuaPhieuXuLy.getToChucQuanLy();
	}

	/**
	* Sets the to chuc quan ly of this mot cua phieu xu ly.
	*
	* @param toChucQuanLy the to chuc quan ly of this mot cua phieu xu ly
	*/
	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_motCuaPhieuXuLy.setToChucQuanLy(toChucQuanLy);
	}

	/**
	* Returns the file tai lieu of this mot cua phieu xu ly.
	*
	* @return the file tai lieu of this mot cua phieu xu ly
	*/
	@Override
	public long getFileTaiLieu() {
		return _motCuaPhieuXuLy.getFileTaiLieu();
	}

	/**
	* Sets the file tai lieu of this mot cua phieu xu ly.
	*
	* @param fileTaiLieu the file tai lieu of this mot cua phieu xu ly
	*/
	@Override
	public void setFileTaiLieu(long fileTaiLieu) {
		_motCuaPhieuXuLy.setFileTaiLieu(fileTaiLieu);
	}

	/**
	* Returns the nguoi xu ly of this mot cua phieu xu ly.
	*
	* @return the nguoi xu ly of this mot cua phieu xu ly
	*/
	@Override
	public long getNguoiXuLy() {
		return _motCuaPhieuXuLy.getNguoiXuLy();
	}

	/**
	* Sets the nguoi xu ly of this mot cua phieu xu ly.
	*
	* @param nguoiXuLy the nguoi xu ly of this mot cua phieu xu ly
	*/
	@Override
	public void setNguoiXuLy(long nguoiXuLy) {
		_motCuaPhieuXuLy.setNguoiXuLy(nguoiXuLy);
	}

	/**
	* Returns the nguoi duoc uy quyen of this mot cua phieu xu ly.
	*
	* @return the nguoi duoc uy quyen of this mot cua phieu xu ly
	*/
	@Override
	public long getNguoiDuocUyQuyen() {
		return _motCuaPhieuXuLy.getNguoiDuocUyQuyen();
	}

	/**
	* Sets the nguoi duoc uy quyen of this mot cua phieu xu ly.
	*
	* @param nguoiDuocUyQuyen the nguoi duoc uy quyen of this mot cua phieu xu ly
	*/
	@Override
	public void setNguoiDuocUyQuyen(long nguoiDuocUyQuyen) {
		_motCuaPhieuXuLy.setNguoiDuocUyQuyen(nguoiDuocUyQuyen);
	}

	@Override
	public boolean isNew() {
		return _motCuaPhieuXuLy.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaPhieuXuLy.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaPhieuXuLy.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaPhieuXuLy.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaPhieuXuLy.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaPhieuXuLy.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaPhieuXuLy.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaPhieuXuLy.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaPhieuXuLy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaPhieuXuLy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaPhieuXuLy.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaPhieuXuLyWrapper((MotCuaPhieuXuLy)_motCuaPhieuXuLy.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy) {
		return _motCuaPhieuXuLy.compareTo(motCuaPhieuXuLy);
	}

	@Override
	public int hashCode() {
		return _motCuaPhieuXuLy.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> toCacheModel() {
		return _motCuaPhieuXuLy.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy toEscapedModel() {
		return new MotCuaPhieuXuLyWrapper(_motCuaPhieuXuLy.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy toUnescapedModel() {
		return new MotCuaPhieuXuLyWrapper(_motCuaPhieuXuLy.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaPhieuXuLy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaPhieuXuLy.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaPhieuXuLy.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaPhieuXuLyWrapper)) {
			return false;
		}

		MotCuaPhieuXuLyWrapper motCuaPhieuXuLyWrapper = (MotCuaPhieuXuLyWrapper)obj;

		if (Validator.equals(_motCuaPhieuXuLy,
					motCuaPhieuXuLyWrapper._motCuaPhieuXuLy)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaPhieuXuLy getWrappedMotCuaPhieuXuLy() {
		return _motCuaPhieuXuLy;
	}

	@Override
	public MotCuaPhieuXuLy getWrappedModel() {
		return _motCuaPhieuXuLy;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaPhieuXuLy.resetOriginalValues();
	}

	private MotCuaPhieuXuLy _motCuaPhieuXuLy;
}