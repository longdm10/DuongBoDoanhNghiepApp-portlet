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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcNoidungHoSo}.
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSo
 * @generated
 */
public class TthcNoidungHoSoWrapper implements TthcNoidungHoSo,
	ModelWrapper<TthcNoidungHoSo> {
	public TthcNoidungHoSoWrapper(TthcNoidungHoSo tthcNoidungHoSo) {
		_tthcNoidungHoSo = tthcNoidungHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcNoidungHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcNoidungHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTuSinh", getMaTuSinh());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("thanhPhanHoSoId", getThanhPhanHoSoId());
		attributes.put("tenTaiLieu", getTenTaiLieu());
		attributes.put("taiLieuDinhKem", getTaiLieuDinhKem());
		attributes.put("noiDungXml", getNoiDungXml());
		attributes.put("noiDungHtml", getNoiDungHtml());
		attributes.put("bieuMauHoSoId", getBieuMauHoSoId());
		attributes.put("ngayGuiNhan", getNgayGuiNhan());
		attributes.put("loaiTaiLieu", getLoaiTaiLieu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTuSinh = (String)attributes.get("maTuSinh");

		if (maTuSinh != null) {
			setMaTuSinh(maTuSinh);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long thanhPhanHoSoId = (Long)attributes.get("thanhPhanHoSoId");

		if (thanhPhanHoSoId != null) {
			setThanhPhanHoSoId(thanhPhanHoSoId);
		}

		String tenTaiLieu = (String)attributes.get("tenTaiLieu");

		if (tenTaiLieu != null) {
			setTenTaiLieu(tenTaiLieu);
		}

		Long taiLieuDinhKem = (Long)attributes.get("taiLieuDinhKem");

		if (taiLieuDinhKem != null) {
			setTaiLieuDinhKem(taiLieuDinhKem);
		}

		String noiDungXml = (String)attributes.get("noiDungXml");

		if (noiDungXml != null) {
			setNoiDungXml(noiDungXml);
		}

		String noiDungHtml = (String)attributes.get("noiDungHtml");

		if (noiDungHtml != null) {
			setNoiDungHtml(noiDungHtml);
		}

		Long bieuMauHoSoId = (Long)attributes.get("bieuMauHoSoId");

		if (bieuMauHoSoId != null) {
			setBieuMauHoSoId(bieuMauHoSoId);
		}

		Date ngayGuiNhan = (Date)attributes.get("ngayGuiNhan");

		if (ngayGuiNhan != null) {
			setNgayGuiNhan(ngayGuiNhan);
		}

		Long loaiTaiLieu = (Long)attributes.get("loaiTaiLieu");

		if (loaiTaiLieu != null) {
			setLoaiTaiLieu(loaiTaiLieu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
		}

		Long trangThai = (Long)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	/**
	* Returns the primary key of this tthc noidung ho so.
	*
	* @return the primary key of this tthc noidung ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcNoidungHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc noidung ho so.
	*
	* @param primaryKey the primary key of this tthc noidung ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcNoidungHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc noidung ho so.
	*
	* @return the ID of this tthc noidung ho so
	*/
	@Override
	public long getId() {
		return _tthcNoidungHoSo.getId();
	}

	/**
	* Sets the ID of this tthc noidung ho so.
	*
	* @param id the ID of this tthc noidung ho so
	*/
	@Override
	public void setId(long id) {
		_tthcNoidungHoSo.setId(id);
	}

	/**
	* Returns the ma tu sinh of this tthc noidung ho so.
	*
	* @return the ma tu sinh of this tthc noidung ho so
	*/
	@Override
	public java.lang.String getMaTuSinh() {
		return _tthcNoidungHoSo.getMaTuSinh();
	}

	/**
	* Sets the ma tu sinh of this tthc noidung ho so.
	*
	* @param maTuSinh the ma tu sinh of this tthc noidung ho so
	*/
	@Override
	public void setMaTuSinh(java.lang.String maTuSinh) {
		_tthcNoidungHoSo.setMaTuSinh(maTuSinh);
	}

	/**
	* Returns the ho so thu tuc ID of this tthc noidung ho so.
	*
	* @return the ho so thu tuc ID of this tthc noidung ho so
	*/
	@Override
	public long getHoSoThuTucId() {
		return _tthcNoidungHoSo.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this tthc noidung ho so.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this tthc noidung ho so
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_tthcNoidungHoSo.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the thanh phan ho so ID of this tthc noidung ho so.
	*
	* @return the thanh phan ho so ID of this tthc noidung ho so
	*/
	@Override
	public long getThanhPhanHoSoId() {
		return _tthcNoidungHoSo.getThanhPhanHoSoId();
	}

	/**
	* Sets the thanh phan ho so ID of this tthc noidung ho so.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID of this tthc noidung ho so
	*/
	@Override
	public void setThanhPhanHoSoId(long thanhPhanHoSoId) {
		_tthcNoidungHoSo.setThanhPhanHoSoId(thanhPhanHoSoId);
	}

	/**
	* Returns the ten tai lieu of this tthc noidung ho so.
	*
	* @return the ten tai lieu of this tthc noidung ho so
	*/
	@Override
	public java.lang.String getTenTaiLieu() {
		return _tthcNoidungHoSo.getTenTaiLieu();
	}

	/**
	* Sets the ten tai lieu of this tthc noidung ho so.
	*
	* @param tenTaiLieu the ten tai lieu of this tthc noidung ho so
	*/
	@Override
	public void setTenTaiLieu(java.lang.String tenTaiLieu) {
		_tthcNoidungHoSo.setTenTaiLieu(tenTaiLieu);
	}

	/**
	* Returns the tai lieu dinh kem of this tthc noidung ho so.
	*
	* @return the tai lieu dinh kem of this tthc noidung ho so
	*/
	@Override
	public long getTaiLieuDinhKem() {
		return _tthcNoidungHoSo.getTaiLieuDinhKem();
	}

	/**
	* Sets the tai lieu dinh kem of this tthc noidung ho so.
	*
	* @param taiLieuDinhKem the tai lieu dinh kem of this tthc noidung ho so
	*/
	@Override
	public void setTaiLieuDinhKem(long taiLieuDinhKem) {
		_tthcNoidungHoSo.setTaiLieuDinhKem(taiLieuDinhKem);
	}

	/**
	* Returns the noi dung xml of this tthc noidung ho so.
	*
	* @return the noi dung xml of this tthc noidung ho so
	*/
	@Override
	public java.lang.String getNoiDungXml() {
		return _tthcNoidungHoSo.getNoiDungXml();
	}

	/**
	* Sets the noi dung xml of this tthc noidung ho so.
	*
	* @param noiDungXml the noi dung xml of this tthc noidung ho so
	*/
	@Override
	public void setNoiDungXml(java.lang.String noiDungXml) {
		_tthcNoidungHoSo.setNoiDungXml(noiDungXml);
	}

	/**
	* Returns the noi dung html of this tthc noidung ho so.
	*
	* @return the noi dung html of this tthc noidung ho so
	*/
	@Override
	public java.lang.String getNoiDungHtml() {
		return _tthcNoidungHoSo.getNoiDungHtml();
	}

	/**
	* Sets the noi dung html of this tthc noidung ho so.
	*
	* @param noiDungHtml the noi dung html of this tthc noidung ho so
	*/
	@Override
	public void setNoiDungHtml(java.lang.String noiDungHtml) {
		_tthcNoidungHoSo.setNoiDungHtml(noiDungHtml);
	}

	/**
	* Returns the bieu mau ho so ID of this tthc noidung ho so.
	*
	* @return the bieu mau ho so ID of this tthc noidung ho so
	*/
	@Override
	public long getBieuMauHoSoId() {
		return _tthcNoidungHoSo.getBieuMauHoSoId();
	}

	/**
	* Sets the bieu mau ho so ID of this tthc noidung ho so.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID of this tthc noidung ho so
	*/
	@Override
	public void setBieuMauHoSoId(long bieuMauHoSoId) {
		_tthcNoidungHoSo.setBieuMauHoSoId(bieuMauHoSoId);
	}

	/**
	* Returns the ngay gui nhan of this tthc noidung ho so.
	*
	* @return the ngay gui nhan of this tthc noidung ho so
	*/
	@Override
	public java.util.Date getNgayGuiNhan() {
		return _tthcNoidungHoSo.getNgayGuiNhan();
	}

	/**
	* Sets the ngay gui nhan of this tthc noidung ho so.
	*
	* @param ngayGuiNhan the ngay gui nhan of this tthc noidung ho so
	*/
	@Override
	public void setNgayGuiNhan(java.util.Date ngayGuiNhan) {
		_tthcNoidungHoSo.setNgayGuiNhan(ngayGuiNhan);
	}

	/**
	* Returns the loai tai lieu of this tthc noidung ho so.
	*
	* @return the loai tai lieu of this tthc noidung ho so
	*/
	@Override
	public long getLoaiTaiLieu() {
		return _tthcNoidungHoSo.getLoaiTaiLieu();
	}

	/**
	* Sets the loai tai lieu of this tthc noidung ho so.
	*
	* @param loaiTaiLieu the loai tai lieu of this tthc noidung ho so
	*/
	@Override
	public void setLoaiTaiLieu(long loaiTaiLieu) {
		_tthcNoidungHoSo.setLoaiTaiLieu(loaiTaiLieu);
	}

	/**
	* Returns the ngay tao of this tthc noidung ho so.
	*
	* @return the ngay tao of this tthc noidung ho so
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _tthcNoidungHoSo.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tthc noidung ho so.
	*
	* @param ngayTao the ngay tao of this tthc noidung ho so
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_tthcNoidungHoSo.setNgayTao(ngayTao);
	}

	/**
	* Returns the nguoi tao of this tthc noidung ho so.
	*
	* @return the nguoi tao of this tthc noidung ho so
	*/
	@Override
	public long getNguoiTao() {
		return _tthcNoidungHoSo.getNguoiTao();
	}

	/**
	* Sets the nguoi tao of this tthc noidung ho so.
	*
	* @param nguoiTao the nguoi tao of this tthc noidung ho so
	*/
	@Override
	public void setNguoiTao(long nguoiTao) {
		_tthcNoidungHoSo.setNguoiTao(nguoiTao);
	}

	/**
	* Returns the trang thai of this tthc noidung ho so.
	*
	* @return the trang thai of this tthc noidung ho so
	*/
	@Override
	public long getTrangThai() {
		return _tthcNoidungHoSo.getTrangThai();
	}

	/**
	* Sets the trang thai of this tthc noidung ho so.
	*
	* @param trangThai the trang thai of this tthc noidung ho so
	*/
	@Override
	public void setTrangThai(long trangThai) {
		_tthcNoidungHoSo.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _tthcNoidungHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcNoidungHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcNoidungHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcNoidungHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcNoidungHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcNoidungHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcNoidungHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcNoidungHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcNoidungHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcNoidungHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcNoidungHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcNoidungHoSoWrapper((TthcNoidungHoSo)_tthcNoidungHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo) {
		return _tthcNoidungHoSo.compareTo(tthcNoidungHoSo);
	}

	@Override
	public int hashCode() {
		return _tthcNoidungHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> toCacheModel() {
		return _tthcNoidungHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo toEscapedModel() {
		return new TthcNoidungHoSoWrapper(_tthcNoidungHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo toUnescapedModel() {
		return new TthcNoidungHoSoWrapper(_tthcNoidungHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcNoidungHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcNoidungHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcNoidungHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcNoidungHoSoWrapper)) {
			return false;
		}

		TthcNoidungHoSoWrapper tthcNoidungHoSoWrapper = (TthcNoidungHoSoWrapper)obj;

		if (Validator.equals(_tthcNoidungHoSo,
					tthcNoidungHoSoWrapper._tthcNoidungHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcNoidungHoSo getWrappedTthcNoidungHoSo() {
		return _tthcNoidungHoSo;
	}

	@Override
	public TthcNoidungHoSo getWrappedModel() {
		return _tthcNoidungHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_tthcNoidungHoSo.resetOriginalValues();
	}

	private TthcNoidungHoSo _tthcNoidungHoSo;
}