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
 * This class is a wrapper for {@link TthcNoidungHoSoTmp}.
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSoTmp
 * @generated
 */
public class TthcNoidungHoSoTmpWrapper implements TthcNoidungHoSoTmp,
	ModelWrapper<TthcNoidungHoSoTmp> {
	public TthcNoidungHoSoTmpWrapper(TthcNoidungHoSoTmp tthcNoidungHoSoTmp) {
		_tthcNoidungHoSoTmp = tthcNoidungHoSoTmp;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcNoidungHoSoTmp.class;
	}

	@Override
	public String getModelClassName() {
		return TthcNoidungHoSoTmp.class.getName();
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
	* Returns the primary key of this tthc noidung ho so tmp.
	*
	* @return the primary key of this tthc noidung ho so tmp
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcNoidungHoSoTmp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc noidung ho so tmp.
	*
	* @param primaryKey the primary key of this tthc noidung ho so tmp
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcNoidungHoSoTmp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc noidung ho so tmp.
	*
	* @return the ID of this tthc noidung ho so tmp
	*/
	@Override
	public long getId() {
		return _tthcNoidungHoSoTmp.getId();
	}

	/**
	* Sets the ID of this tthc noidung ho so tmp.
	*
	* @param id the ID of this tthc noidung ho so tmp
	*/
	@Override
	public void setId(long id) {
		_tthcNoidungHoSoTmp.setId(id);
	}

	/**
	* Returns the ma tu sinh of this tthc noidung ho so tmp.
	*
	* @return the ma tu sinh of this tthc noidung ho so tmp
	*/
	@Override
	public java.lang.String getMaTuSinh() {
		return _tthcNoidungHoSoTmp.getMaTuSinh();
	}

	/**
	* Sets the ma tu sinh of this tthc noidung ho so tmp.
	*
	* @param maTuSinh the ma tu sinh of this tthc noidung ho so tmp
	*/
	@Override
	public void setMaTuSinh(java.lang.String maTuSinh) {
		_tthcNoidungHoSoTmp.setMaTuSinh(maTuSinh);
	}

	/**
	* Returns the ho so thu tuc ID of this tthc noidung ho so tmp.
	*
	* @return the ho so thu tuc ID of this tthc noidung ho so tmp
	*/
	@Override
	public long getHoSoThuTucId() {
		return _tthcNoidungHoSoTmp.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this tthc noidung ho so tmp.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this tthc noidung ho so tmp
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_tthcNoidungHoSoTmp.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the thanh phan ho so ID of this tthc noidung ho so tmp.
	*
	* @return the thanh phan ho so ID of this tthc noidung ho so tmp
	*/
	@Override
	public long getThanhPhanHoSoId() {
		return _tthcNoidungHoSoTmp.getThanhPhanHoSoId();
	}

	/**
	* Sets the thanh phan ho so ID of this tthc noidung ho so tmp.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID of this tthc noidung ho so tmp
	*/
	@Override
	public void setThanhPhanHoSoId(long thanhPhanHoSoId) {
		_tthcNoidungHoSoTmp.setThanhPhanHoSoId(thanhPhanHoSoId);
	}

	/**
	* Returns the ten tai lieu of this tthc noidung ho so tmp.
	*
	* @return the ten tai lieu of this tthc noidung ho so tmp
	*/
	@Override
	public java.lang.String getTenTaiLieu() {
		return _tthcNoidungHoSoTmp.getTenTaiLieu();
	}

	/**
	* Sets the ten tai lieu of this tthc noidung ho so tmp.
	*
	* @param tenTaiLieu the ten tai lieu of this tthc noidung ho so tmp
	*/
	@Override
	public void setTenTaiLieu(java.lang.String tenTaiLieu) {
		_tthcNoidungHoSoTmp.setTenTaiLieu(tenTaiLieu);
	}

	/**
	* Returns the tai lieu dinh kem of this tthc noidung ho so tmp.
	*
	* @return the tai lieu dinh kem of this tthc noidung ho so tmp
	*/
	@Override
	public long getTaiLieuDinhKem() {
		return _tthcNoidungHoSoTmp.getTaiLieuDinhKem();
	}

	/**
	* Sets the tai lieu dinh kem of this tthc noidung ho so tmp.
	*
	* @param taiLieuDinhKem the tai lieu dinh kem of this tthc noidung ho so tmp
	*/
	@Override
	public void setTaiLieuDinhKem(long taiLieuDinhKem) {
		_tthcNoidungHoSoTmp.setTaiLieuDinhKem(taiLieuDinhKem);
	}

	/**
	* Returns the noi dung xml of this tthc noidung ho so tmp.
	*
	* @return the noi dung xml of this tthc noidung ho so tmp
	*/
	@Override
	public java.lang.String getNoiDungXml() {
		return _tthcNoidungHoSoTmp.getNoiDungXml();
	}

	/**
	* Sets the noi dung xml of this tthc noidung ho so tmp.
	*
	* @param noiDungXml the noi dung xml of this tthc noidung ho so tmp
	*/
	@Override
	public void setNoiDungXml(java.lang.String noiDungXml) {
		_tthcNoidungHoSoTmp.setNoiDungXml(noiDungXml);
	}

	/**
	* Returns the noi dung html of this tthc noidung ho so tmp.
	*
	* @return the noi dung html of this tthc noidung ho so tmp
	*/
	@Override
	public java.lang.String getNoiDungHtml() {
		return _tthcNoidungHoSoTmp.getNoiDungHtml();
	}

	/**
	* Sets the noi dung html of this tthc noidung ho so tmp.
	*
	* @param noiDungHtml the noi dung html of this tthc noidung ho so tmp
	*/
	@Override
	public void setNoiDungHtml(java.lang.String noiDungHtml) {
		_tthcNoidungHoSoTmp.setNoiDungHtml(noiDungHtml);
	}

	/**
	* Returns the bieu mau ho so ID of this tthc noidung ho so tmp.
	*
	* @return the bieu mau ho so ID of this tthc noidung ho so tmp
	*/
	@Override
	public long getBieuMauHoSoId() {
		return _tthcNoidungHoSoTmp.getBieuMauHoSoId();
	}

	/**
	* Sets the bieu mau ho so ID of this tthc noidung ho so tmp.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID of this tthc noidung ho so tmp
	*/
	@Override
	public void setBieuMauHoSoId(long bieuMauHoSoId) {
		_tthcNoidungHoSoTmp.setBieuMauHoSoId(bieuMauHoSoId);
	}

	/**
	* Returns the ngay gui nhan of this tthc noidung ho so tmp.
	*
	* @return the ngay gui nhan of this tthc noidung ho so tmp
	*/
	@Override
	public java.util.Date getNgayGuiNhan() {
		return _tthcNoidungHoSoTmp.getNgayGuiNhan();
	}

	/**
	* Sets the ngay gui nhan of this tthc noidung ho so tmp.
	*
	* @param ngayGuiNhan the ngay gui nhan of this tthc noidung ho so tmp
	*/
	@Override
	public void setNgayGuiNhan(java.util.Date ngayGuiNhan) {
		_tthcNoidungHoSoTmp.setNgayGuiNhan(ngayGuiNhan);
	}

	/**
	* Returns the loai tai lieu of this tthc noidung ho so tmp.
	*
	* @return the loai tai lieu of this tthc noidung ho so tmp
	*/
	@Override
	public long getLoaiTaiLieu() {
		return _tthcNoidungHoSoTmp.getLoaiTaiLieu();
	}

	/**
	* Sets the loai tai lieu of this tthc noidung ho so tmp.
	*
	* @param loaiTaiLieu the loai tai lieu of this tthc noidung ho so tmp
	*/
	@Override
	public void setLoaiTaiLieu(long loaiTaiLieu) {
		_tthcNoidungHoSoTmp.setLoaiTaiLieu(loaiTaiLieu);
	}

	/**
	* Returns the ngay tao of this tthc noidung ho so tmp.
	*
	* @return the ngay tao of this tthc noidung ho so tmp
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _tthcNoidungHoSoTmp.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tthc noidung ho so tmp.
	*
	* @param ngayTao the ngay tao of this tthc noidung ho so tmp
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_tthcNoidungHoSoTmp.setNgayTao(ngayTao);
	}

	/**
	* Returns the nguoi tao of this tthc noidung ho so tmp.
	*
	* @return the nguoi tao of this tthc noidung ho so tmp
	*/
	@Override
	public long getNguoiTao() {
		return _tthcNoidungHoSoTmp.getNguoiTao();
	}

	/**
	* Sets the nguoi tao of this tthc noidung ho so tmp.
	*
	* @param nguoiTao the nguoi tao of this tthc noidung ho so tmp
	*/
	@Override
	public void setNguoiTao(long nguoiTao) {
		_tthcNoidungHoSoTmp.setNguoiTao(nguoiTao);
	}

	/**
	* Returns the trang thai of this tthc noidung ho so tmp.
	*
	* @return the trang thai of this tthc noidung ho so tmp
	*/
	@Override
	public long getTrangThai() {
		return _tthcNoidungHoSoTmp.getTrangThai();
	}

	/**
	* Sets the trang thai of this tthc noidung ho so tmp.
	*
	* @param trangThai the trang thai of this tthc noidung ho so tmp
	*/
	@Override
	public void setTrangThai(long trangThai) {
		_tthcNoidungHoSoTmp.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _tthcNoidungHoSoTmp.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcNoidungHoSoTmp.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcNoidungHoSoTmp.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcNoidungHoSoTmp.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcNoidungHoSoTmp.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcNoidungHoSoTmp.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcNoidungHoSoTmp.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcNoidungHoSoTmp.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcNoidungHoSoTmp.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcNoidungHoSoTmp.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcNoidungHoSoTmp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcNoidungHoSoTmpWrapper((TthcNoidungHoSoTmp)_tthcNoidungHoSoTmp.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp tthcNoidungHoSoTmp) {
		return _tthcNoidungHoSoTmp.compareTo(tthcNoidungHoSoTmp);
	}

	@Override
	public int hashCode() {
		return _tthcNoidungHoSoTmp.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> toCacheModel() {
		return _tthcNoidungHoSoTmp.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp toEscapedModel() {
		return new TthcNoidungHoSoTmpWrapper(_tthcNoidungHoSoTmp.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp toUnescapedModel() {
		return new TthcNoidungHoSoTmpWrapper(_tthcNoidungHoSoTmp.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcNoidungHoSoTmp.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcNoidungHoSoTmp.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcNoidungHoSoTmp.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcNoidungHoSoTmpWrapper)) {
			return false;
		}

		TthcNoidungHoSoTmpWrapper tthcNoidungHoSoTmpWrapper = (TthcNoidungHoSoTmpWrapper)obj;

		if (Validator.equals(_tthcNoidungHoSoTmp,
					tthcNoidungHoSoTmpWrapper._tthcNoidungHoSoTmp)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcNoidungHoSoTmp getWrappedTthcNoidungHoSoTmp() {
		return _tthcNoidungHoSoTmp;
	}

	@Override
	public TthcNoidungHoSoTmp getWrappedModel() {
		return _tthcNoidungHoSoTmp;
	}

	@Override
	public void resetOriginalValues() {
		_tthcNoidungHoSoTmp.resetOriginalValues();
	}

	private TthcNoidungHoSoTmp _tthcNoidungHoSoTmp;
}