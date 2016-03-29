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

package vn.dtt.duongbo.dao.thanhtoan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcXacNhanThanhToan}.
 * </p>
 *
 * @author win_64
 * @see TthcXacNhanThanhToan
 * @generated
 */
public class TthcXacNhanThanhToanWrapper implements TthcXacNhanThanhToan,
	ModelWrapper<TthcXacNhanThanhToan> {
	public TthcXacNhanThanhToanWrapper(
		TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		_tthcXacNhanThanhToan = tthcXacNhanThanhToan;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcXacNhanThanhToan.class;
	}

	@Override
	public String getModelClassName() {
		return TthcXacNhanThanhToan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTuSinh", getMaTuSinh());
		attributes.put("soTien", getSoTien());
		attributes.put("hinhThucThanhToan", getHinhThucThanhToan());
		attributes.put("thongTinXacNhan", getThongTinXacNhan());
		attributes.put("taiLieuDinhKem", getTaiLieuDinhKem());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("ngayXacNhan", getNgayXacNhan());
		attributes.put("nguoiXacNhan", getNguoiXacNhan());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("trangThaiXacNhan", getTrangThaiXacNhan());
		attributes.put("yKienXuLy", getYKienXuLy());
		attributes.put("loaiPhi", getLoaiPhi());
		attributes.put("tenDoanhNghiep", getTenDoanhNghiep());
		attributes.put("ghiChu", getGhiChu());

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

		Long soTien = (Long)attributes.get("soTien");

		if (soTien != null) {
			setSoTien(soTien);
		}

		Long hinhThucThanhToan = (Long)attributes.get("hinhThucThanhToan");

		if (hinhThucThanhToan != null) {
			setHinhThucThanhToan(hinhThucThanhToan);
		}

		String thongTinXacNhan = (String)attributes.get("thongTinXacNhan");

		if (thongTinXacNhan != null) {
			setThongTinXacNhan(thongTinXacNhan);
		}

		Long taiLieuDinhKem = (Long)attributes.get("taiLieuDinhKem");

		if (taiLieuDinhKem != null) {
			setTaiLieuDinhKem(taiLieuDinhKem);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
		}

		Date ngayXacNhan = (Date)attributes.get("ngayXacNhan");

		if (ngayXacNhan != null) {
			setNgayXacNhan(ngayXacNhan);
		}

		Long nguoiXacNhan = (Long)attributes.get("nguoiXacNhan");

		if (nguoiXacNhan != null) {
			setNguoiXacNhan(nguoiXacNhan);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Integer trangThaiXacNhan = (Integer)attributes.get("trangThaiXacNhan");

		if (trangThaiXacNhan != null) {
			setTrangThaiXacNhan(trangThaiXacNhan);
		}

		String yKienXuLy = (String)attributes.get("yKienXuLy");

		if (yKienXuLy != null) {
			setYKienXuLy(yKienXuLy);
		}

		String loaiPhi = (String)attributes.get("loaiPhi");

		if (loaiPhi != null) {
			setLoaiPhi(loaiPhi);
		}

		String tenDoanhNghiep = (String)attributes.get("tenDoanhNghiep");

		if (tenDoanhNghiep != null) {
			setTenDoanhNghiep(tenDoanhNghiep);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	/**
	* Returns the primary key of this tthc xac nhan thanh toan.
	*
	* @return the primary key of this tthc xac nhan thanh toan
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcXacNhanThanhToan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc xac nhan thanh toan.
	*
	* @param primaryKey the primary key of this tthc xac nhan thanh toan
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcXacNhanThanhToan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc xac nhan thanh toan.
	*
	* @return the ID of this tthc xac nhan thanh toan
	*/
	@Override
	public long getId() {
		return _tthcXacNhanThanhToan.getId();
	}

	/**
	* Sets the ID of this tthc xac nhan thanh toan.
	*
	* @param id the ID of this tthc xac nhan thanh toan
	*/
	@Override
	public void setId(long id) {
		_tthcXacNhanThanhToan.setId(id);
	}

	/**
	* Returns the ma tu sinh of this tthc xac nhan thanh toan.
	*
	* @return the ma tu sinh of this tthc xac nhan thanh toan
	*/
	@Override
	public java.lang.String getMaTuSinh() {
		return _tthcXacNhanThanhToan.getMaTuSinh();
	}

	/**
	* Sets the ma tu sinh of this tthc xac nhan thanh toan.
	*
	* @param maTuSinh the ma tu sinh of this tthc xac nhan thanh toan
	*/
	@Override
	public void setMaTuSinh(java.lang.String maTuSinh) {
		_tthcXacNhanThanhToan.setMaTuSinh(maTuSinh);
	}

	/**
	* Returns the so tien of this tthc xac nhan thanh toan.
	*
	* @return the so tien of this tthc xac nhan thanh toan
	*/
	@Override
	public long getSoTien() {
		return _tthcXacNhanThanhToan.getSoTien();
	}

	/**
	* Sets the so tien of this tthc xac nhan thanh toan.
	*
	* @param soTien the so tien of this tthc xac nhan thanh toan
	*/
	@Override
	public void setSoTien(long soTien) {
		_tthcXacNhanThanhToan.setSoTien(soTien);
	}

	/**
	* Returns the hinh thuc thanh toan of this tthc xac nhan thanh toan.
	*
	* @return the hinh thuc thanh toan of this tthc xac nhan thanh toan
	*/
	@Override
	public long getHinhThucThanhToan() {
		return _tthcXacNhanThanhToan.getHinhThucThanhToan();
	}

	/**
	* Sets the hinh thuc thanh toan of this tthc xac nhan thanh toan.
	*
	* @param hinhThucThanhToan the hinh thuc thanh toan of this tthc xac nhan thanh toan
	*/
	@Override
	public void setHinhThucThanhToan(long hinhThucThanhToan) {
		_tthcXacNhanThanhToan.setHinhThucThanhToan(hinhThucThanhToan);
	}

	/**
	* Returns the thong tin xac nhan of this tthc xac nhan thanh toan.
	*
	* @return the thong tin xac nhan of this tthc xac nhan thanh toan
	*/
	@Override
	public java.lang.String getThongTinXacNhan() {
		return _tthcXacNhanThanhToan.getThongTinXacNhan();
	}

	/**
	* Sets the thong tin xac nhan of this tthc xac nhan thanh toan.
	*
	* @param thongTinXacNhan the thong tin xac nhan of this tthc xac nhan thanh toan
	*/
	@Override
	public void setThongTinXacNhan(java.lang.String thongTinXacNhan) {
		_tthcXacNhanThanhToan.setThongTinXacNhan(thongTinXacNhan);
	}

	/**
	* Returns the tai lieu dinh kem of this tthc xac nhan thanh toan.
	*
	* @return the tai lieu dinh kem of this tthc xac nhan thanh toan
	*/
	@Override
	public long getTaiLieuDinhKem() {
		return _tthcXacNhanThanhToan.getTaiLieuDinhKem();
	}

	/**
	* Sets the tai lieu dinh kem of this tthc xac nhan thanh toan.
	*
	* @param taiLieuDinhKem the tai lieu dinh kem of this tthc xac nhan thanh toan
	*/
	@Override
	public void setTaiLieuDinhKem(long taiLieuDinhKem) {
		_tthcXacNhanThanhToan.setTaiLieuDinhKem(taiLieuDinhKem);
	}

	/**
	* Returns the ngay tao of this tthc xac nhan thanh toan.
	*
	* @return the ngay tao of this tthc xac nhan thanh toan
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _tthcXacNhanThanhToan.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tthc xac nhan thanh toan.
	*
	* @param ngayTao the ngay tao of this tthc xac nhan thanh toan
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_tthcXacNhanThanhToan.setNgayTao(ngayTao);
	}

	/**
	* Returns the nguoi tao of this tthc xac nhan thanh toan.
	*
	* @return the nguoi tao of this tthc xac nhan thanh toan
	*/
	@Override
	public long getNguoiTao() {
		return _tthcXacNhanThanhToan.getNguoiTao();
	}

	/**
	* Sets the nguoi tao of this tthc xac nhan thanh toan.
	*
	* @param nguoiTao the nguoi tao of this tthc xac nhan thanh toan
	*/
	@Override
	public void setNguoiTao(long nguoiTao) {
		_tthcXacNhanThanhToan.setNguoiTao(nguoiTao);
	}

	/**
	* Returns the ngay xac nhan of this tthc xac nhan thanh toan.
	*
	* @return the ngay xac nhan of this tthc xac nhan thanh toan
	*/
	@Override
	public java.util.Date getNgayXacNhan() {
		return _tthcXacNhanThanhToan.getNgayXacNhan();
	}

	/**
	* Sets the ngay xac nhan of this tthc xac nhan thanh toan.
	*
	* @param ngayXacNhan the ngay xac nhan of this tthc xac nhan thanh toan
	*/
	@Override
	public void setNgayXacNhan(java.util.Date ngayXacNhan) {
		_tthcXacNhanThanhToan.setNgayXacNhan(ngayXacNhan);
	}

	/**
	* Returns the nguoi xac nhan of this tthc xac nhan thanh toan.
	*
	* @return the nguoi xac nhan of this tthc xac nhan thanh toan
	*/
	@Override
	public long getNguoiXacNhan() {
		return _tthcXacNhanThanhToan.getNguoiXacNhan();
	}

	/**
	* Sets the nguoi xac nhan of this tthc xac nhan thanh toan.
	*
	* @param nguoiXacNhan the nguoi xac nhan of this tthc xac nhan thanh toan
	*/
	@Override
	public void setNguoiXacNhan(long nguoiXacNhan) {
		_tthcXacNhanThanhToan.setNguoiXacNhan(nguoiXacNhan);
	}

	/**
	* Returns the to chuc quan ly of this tthc xac nhan thanh toan.
	*
	* @return the to chuc quan ly of this tthc xac nhan thanh toan
	*/
	@Override
	public long getToChucQuanLy() {
		return _tthcXacNhanThanhToan.getToChucQuanLy();
	}

	/**
	* Sets the to chuc quan ly of this tthc xac nhan thanh toan.
	*
	* @param toChucQuanLy the to chuc quan ly of this tthc xac nhan thanh toan
	*/
	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_tthcXacNhanThanhToan.setToChucQuanLy(toChucQuanLy);
	}

	/**
	* Returns the trang thai xac nhan of this tthc xac nhan thanh toan.
	*
	* @return the trang thai xac nhan of this tthc xac nhan thanh toan
	*/
	@Override
	public int getTrangThaiXacNhan() {
		return _tthcXacNhanThanhToan.getTrangThaiXacNhan();
	}

	/**
	* Sets the trang thai xac nhan of this tthc xac nhan thanh toan.
	*
	* @param trangThaiXacNhan the trang thai xac nhan of this tthc xac nhan thanh toan
	*/
	@Override
	public void setTrangThaiXacNhan(int trangThaiXacNhan) {
		_tthcXacNhanThanhToan.setTrangThaiXacNhan(trangThaiXacNhan);
	}

	/**
	* Returns the y kien xu ly of this tthc xac nhan thanh toan.
	*
	* @return the y kien xu ly of this tthc xac nhan thanh toan
	*/
	@Override
	public java.lang.String getYKienXuLy() {
		return _tthcXacNhanThanhToan.getYKienXuLy();
	}

	/**
	* Sets the y kien xu ly of this tthc xac nhan thanh toan.
	*
	* @param yKienXuLy the y kien xu ly of this tthc xac nhan thanh toan
	*/
	@Override
	public void setYKienXuLy(java.lang.String yKienXuLy) {
		_tthcXacNhanThanhToan.setYKienXuLy(yKienXuLy);
	}

	/**
	* Returns the loai phi of this tthc xac nhan thanh toan.
	*
	* @return the loai phi of this tthc xac nhan thanh toan
	*/
	@Override
	public java.lang.String getLoaiPhi() {
		return _tthcXacNhanThanhToan.getLoaiPhi();
	}

	/**
	* Sets the loai phi of this tthc xac nhan thanh toan.
	*
	* @param loaiPhi the loai phi of this tthc xac nhan thanh toan
	*/
	@Override
	public void setLoaiPhi(java.lang.String loaiPhi) {
		_tthcXacNhanThanhToan.setLoaiPhi(loaiPhi);
	}

	/**
	* Returns the ten doanh nghiep of this tthc xac nhan thanh toan.
	*
	* @return the ten doanh nghiep of this tthc xac nhan thanh toan
	*/
	@Override
	public java.lang.String getTenDoanhNghiep() {
		return _tthcXacNhanThanhToan.getTenDoanhNghiep();
	}

	/**
	* Sets the ten doanh nghiep of this tthc xac nhan thanh toan.
	*
	* @param tenDoanhNghiep the ten doanh nghiep of this tthc xac nhan thanh toan
	*/
	@Override
	public void setTenDoanhNghiep(java.lang.String tenDoanhNghiep) {
		_tthcXacNhanThanhToan.setTenDoanhNghiep(tenDoanhNghiep);
	}

	/**
	* Returns the ghi chu of this tthc xac nhan thanh toan.
	*
	* @return the ghi chu of this tthc xac nhan thanh toan
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _tthcXacNhanThanhToan.getGhiChu();
	}

	/**
	* Sets the ghi chu of this tthc xac nhan thanh toan.
	*
	* @param ghiChu the ghi chu of this tthc xac nhan thanh toan
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_tthcXacNhanThanhToan.setGhiChu(ghiChu);
	}

	@Override
	public boolean isNew() {
		return _tthcXacNhanThanhToan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcXacNhanThanhToan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcXacNhanThanhToan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcXacNhanThanhToan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcXacNhanThanhToan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcXacNhanThanhToan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcXacNhanThanhToan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcXacNhanThanhToan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcXacNhanThanhToan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcXacNhanThanhToan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcXacNhanThanhToan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcXacNhanThanhToanWrapper((TthcXacNhanThanhToan)_tthcXacNhanThanhToan.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		return _tthcXacNhanThanhToan.compareTo(tthcXacNhanThanhToan);
	}

	@Override
	public int hashCode() {
		return _tthcXacNhanThanhToan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> toCacheModel() {
		return _tthcXacNhanThanhToan.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan toEscapedModel() {
		return new TthcXacNhanThanhToanWrapper(_tthcXacNhanThanhToan.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan toUnescapedModel() {
		return new TthcXacNhanThanhToanWrapper(_tthcXacNhanThanhToan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcXacNhanThanhToan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcXacNhanThanhToan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcXacNhanThanhToan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcXacNhanThanhToanWrapper)) {
			return false;
		}

		TthcXacNhanThanhToanWrapper tthcXacNhanThanhToanWrapper = (TthcXacNhanThanhToanWrapper)obj;

		if (Validator.equals(_tthcXacNhanThanhToan,
					tthcXacNhanThanhToanWrapper._tthcXacNhanThanhToan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcXacNhanThanhToan getWrappedTthcXacNhanThanhToan() {
		return _tthcXacNhanThanhToan;
	}

	@Override
	public TthcXacNhanThanhToan getWrappedModel() {
		return _tthcXacNhanThanhToan;
	}

	@Override
	public void resetOriginalValues() {
		_tthcXacNhanThanhToan.resetOriginalValues();
	}

	private TthcXacNhanThanhToan _tthcXacNhanThanhToan;
}