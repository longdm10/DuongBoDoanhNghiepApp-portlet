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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QLVTPhuongTienVanTai}.
 * </p>
 *
 * @author binhta
 * @see QLVTPhuongTienVanTai
 * @generated
 */
public class QLVTPhuongTienVanTaiWrapper implements QLVTPhuongTienVanTai,
	ModelWrapper<QLVTPhuongTienVanTai> {
	public QLVTPhuongTienVanTaiWrapper(
		QLVTPhuongTienVanTai qlvtPhuongTienVanTai) {
		_qlvtPhuongTienVanTai = qlvtPhuongTienVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTPhuongTienVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTPhuongTienVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("bienSoXe", getBienSoXe());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("trongTai", getTrongTai());
		attributes.put("noiSanXuat", getNoiSanXuat());
		attributes.put("namSanXuat", getNamSanXuat());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("hinhThucSoHuuXe", getHinhThucSoHuuXe());
		attributes.put("nienHanSuDungGiayDangKiem",
			getNienHanSuDungGiayDangKiem());
		attributes.put("nienHanSuDungND86", getNienHanSuDungND86());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soMay", getSoMay());
		attributes.put("mauSon", getMauSon());
		attributes.put("thongTinXuLyViPham", getThongTinXuLyViPham());
		attributes.put("trangThai", getTrangThai());
		attributes.put("fileId", getFileId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer bienSoXe = (Integer)attributes.get("bienSoXe");

		if (bienSoXe != null) {
			setBienSoXe(bienSoXe);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		Integer trongTai = (Integer)attributes.get("trongTai");

		if (trongTai != null) {
			setTrongTai(trongTai);
		}

		String noiSanXuat = (String)attributes.get("noiSanXuat");

		if (noiSanXuat != null) {
			setNoiSanXuat(noiSanXuat);
		}

		Integer namSanXuat = (Integer)attributes.get("namSanXuat");

		if (namSanXuat != null) {
			setNamSanXuat(namSanXuat);
		}

		Integer soChoNgoi = (Integer)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
		}

		String hinhThucSoHuuXe = (String)attributes.get("hinhThucSoHuuXe");

		if (hinhThucSoHuuXe != null) {
			setHinhThucSoHuuXe(hinhThucSoHuuXe);
		}

		Integer nienHanSuDungGiayDangKiem = (Integer)attributes.get(
				"nienHanSuDungGiayDangKiem");

		if (nienHanSuDungGiayDangKiem != null) {
			setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
		}

		Integer nienHanSuDungND86 = (Integer)attributes.get("nienHanSuDungND86");

		if (nienHanSuDungND86 != null) {
			setNienHanSuDungND86(nienHanSuDungND86);
		}

		String soKhung = (String)attributes.get("soKhung");

		if (soKhung != null) {
			setSoKhung(soKhung);
		}

		String soMay = (String)attributes.get("soMay");

		if (soMay != null) {
			setSoMay(soMay);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		String thongTinXuLyViPham = (String)attributes.get("thongTinXuLyViPham");

		if (thongTinXuLyViPham != null) {
			setThongTinXuLyViPham(thongTinXuLyViPham);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer fileId = (Integer)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}
	}

	/**
	* Returns the primary key of this q l v t phuong tien van tai.
	*
	* @return the primary key of this q l v t phuong tien van tai
	*/
	@Override
	public int getPrimaryKey() {
		return _qlvtPhuongTienVanTai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q l v t phuong tien van tai.
	*
	* @param primaryKey the primary key of this q l v t phuong tien van tai
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qlvtPhuongTienVanTai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this q l v t phuong tien van tai.
	*
	* @return the ID of this q l v t phuong tien van tai
	*/
	@Override
	public int getId() {
		return _qlvtPhuongTienVanTai.getId();
	}

	/**
	* Sets the ID of this q l v t phuong tien van tai.
	*
	* @param id the ID of this q l v t phuong tien van tai
	*/
	@Override
	public void setId(int id) {
		_qlvtPhuongTienVanTai.setId(id);
	}

	/**
	* Returns the bien so xe of this q l v t phuong tien van tai.
	*
	* @return the bien so xe of this q l v t phuong tien van tai
	*/
	@Override
	public int getBienSoXe() {
		return _qlvtPhuongTienVanTai.getBienSoXe();
	}

	/**
	* Sets the bien so xe of this q l v t phuong tien van tai.
	*
	* @param bienSoXe the bien so xe of this q l v t phuong tien van tai
	*/
	@Override
	public void setBienSoXe(int bienSoXe) {
		_qlvtPhuongTienVanTai.setBienSoXe(bienSoXe);
	}

	/**
	* Returns the nhan hieu of this q l v t phuong tien van tai.
	*
	* @return the nhan hieu of this q l v t phuong tien van tai
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtPhuongTienVanTai.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this q l v t phuong tien van tai.
	*
	* @param nhanHieu the nhan hieu of this q l v t phuong tien van tai
	*/
	@Override
	public void setNhanHieu(java.lang.String nhanHieu) {
		_qlvtPhuongTienVanTai.setNhanHieu(nhanHieu);
	}

	/**
	* Returns the trong tai of this q l v t phuong tien van tai.
	*
	* @return the trong tai of this q l v t phuong tien van tai
	*/
	@Override
	public int getTrongTai() {
		return _qlvtPhuongTienVanTai.getTrongTai();
	}

	/**
	* Sets the trong tai of this q l v t phuong tien van tai.
	*
	* @param trongTai the trong tai of this q l v t phuong tien van tai
	*/
	@Override
	public void setTrongTai(int trongTai) {
		_qlvtPhuongTienVanTai.setTrongTai(trongTai);
	}

	/**
	* Returns the noi san xuat of this q l v t phuong tien van tai.
	*
	* @return the noi san xuat of this q l v t phuong tien van tai
	*/
	@Override
	public java.lang.String getNoiSanXuat() {
		return _qlvtPhuongTienVanTai.getNoiSanXuat();
	}

	/**
	* Sets the noi san xuat of this q l v t phuong tien van tai.
	*
	* @param noiSanXuat the noi san xuat of this q l v t phuong tien van tai
	*/
	@Override
	public void setNoiSanXuat(java.lang.String noiSanXuat) {
		_qlvtPhuongTienVanTai.setNoiSanXuat(noiSanXuat);
	}

	/**
	* Returns the nam san xuat of this q l v t phuong tien van tai.
	*
	* @return the nam san xuat of this q l v t phuong tien van tai
	*/
	@Override
	public int getNamSanXuat() {
		return _qlvtPhuongTienVanTai.getNamSanXuat();
	}

	/**
	* Sets the nam san xuat of this q l v t phuong tien van tai.
	*
	* @param namSanXuat the nam san xuat of this q l v t phuong tien van tai
	*/
	@Override
	public void setNamSanXuat(int namSanXuat) {
		_qlvtPhuongTienVanTai.setNamSanXuat(namSanXuat);
	}

	/**
	* Returns the so cho ngoi of this q l v t phuong tien van tai.
	*
	* @return the so cho ngoi of this q l v t phuong tien van tai
	*/
	@Override
	public int getSoChoNgoi() {
		return _qlvtPhuongTienVanTai.getSoChoNgoi();
	}

	/**
	* Sets the so cho ngoi of this q l v t phuong tien van tai.
	*
	* @param soChoNgoi the so cho ngoi of this q l v t phuong tien van tai
	*/
	@Override
	public void setSoChoNgoi(int soChoNgoi) {
		_qlvtPhuongTienVanTai.setSoChoNgoi(soChoNgoi);
	}

	/**
	* Returns the hinh thuc so huu xe of this q l v t phuong tien van tai.
	*
	* @return the hinh thuc so huu xe of this q l v t phuong tien van tai
	*/
	@Override
	public java.lang.String getHinhThucSoHuuXe() {
		return _qlvtPhuongTienVanTai.getHinhThucSoHuuXe();
	}

	/**
	* Sets the hinh thuc so huu xe of this q l v t phuong tien van tai.
	*
	* @param hinhThucSoHuuXe the hinh thuc so huu xe of this q l v t phuong tien van tai
	*/
	@Override
	public void setHinhThucSoHuuXe(java.lang.String hinhThucSoHuuXe) {
		_qlvtPhuongTienVanTai.setHinhThucSoHuuXe(hinhThucSoHuuXe);
	}

	/**
	* Returns the nien han su dung giay dang kiem of this q l v t phuong tien van tai.
	*
	* @return the nien han su dung giay dang kiem of this q l v t phuong tien van tai
	*/
	@Override
	public int getNienHanSuDungGiayDangKiem() {
		return _qlvtPhuongTienVanTai.getNienHanSuDungGiayDangKiem();
	}

	/**
	* Sets the nien han su dung giay dang kiem of this q l v t phuong tien van tai.
	*
	* @param nienHanSuDungGiayDangKiem the nien han su dung giay dang kiem of this q l v t phuong tien van tai
	*/
	@Override
	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem) {
		_qlvtPhuongTienVanTai.setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
	}

	/**
	* Returns the nien han su dung n d86 of this q l v t phuong tien van tai.
	*
	* @return the nien han su dung n d86 of this q l v t phuong tien van tai
	*/
	@Override
	public int getNienHanSuDungND86() {
		return _qlvtPhuongTienVanTai.getNienHanSuDungND86();
	}

	/**
	* Sets the nien han su dung n d86 of this q l v t phuong tien van tai.
	*
	* @param nienHanSuDungND86 the nien han su dung n d86 of this q l v t phuong tien van tai
	*/
	@Override
	public void setNienHanSuDungND86(int nienHanSuDungND86) {
		_qlvtPhuongTienVanTai.setNienHanSuDungND86(nienHanSuDungND86);
	}

	/**
	* Returns the so khung of this q l v t phuong tien van tai.
	*
	* @return the so khung of this q l v t phuong tien van tai
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _qlvtPhuongTienVanTai.getSoKhung();
	}

	/**
	* Sets the so khung of this q l v t phuong tien van tai.
	*
	* @param soKhung the so khung of this q l v t phuong tien van tai
	*/
	@Override
	public void setSoKhung(java.lang.String soKhung) {
		_qlvtPhuongTienVanTai.setSoKhung(soKhung);
	}

	/**
	* Returns the so may of this q l v t phuong tien van tai.
	*
	* @return the so may of this q l v t phuong tien van tai
	*/
	@Override
	public java.lang.String getSoMay() {
		return _qlvtPhuongTienVanTai.getSoMay();
	}

	/**
	* Sets the so may of this q l v t phuong tien van tai.
	*
	* @param soMay the so may of this q l v t phuong tien van tai
	*/
	@Override
	public void setSoMay(java.lang.String soMay) {
		_qlvtPhuongTienVanTai.setSoMay(soMay);
	}

	/**
	* Returns the mau son of this q l v t phuong tien van tai.
	*
	* @return the mau son of this q l v t phuong tien van tai
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtPhuongTienVanTai.getMauSon();
	}

	/**
	* Sets the mau son of this q l v t phuong tien van tai.
	*
	* @param mauSon the mau son of this q l v t phuong tien van tai
	*/
	@Override
	public void setMauSon(java.lang.String mauSon) {
		_qlvtPhuongTienVanTai.setMauSon(mauSon);
	}

	/**
	* Returns the thong tin xu ly vi pham of this q l v t phuong tien van tai.
	*
	* @return the thong tin xu ly vi pham of this q l v t phuong tien van tai
	*/
	@Override
	public java.lang.String getThongTinXuLyViPham() {
		return _qlvtPhuongTienVanTai.getThongTinXuLyViPham();
	}

	/**
	* Sets the thong tin xu ly vi pham of this q l v t phuong tien van tai.
	*
	* @param thongTinXuLyViPham the thong tin xu ly vi pham of this q l v t phuong tien van tai
	*/
	@Override
	public void setThongTinXuLyViPham(java.lang.String thongTinXuLyViPham) {
		_qlvtPhuongTienVanTai.setThongTinXuLyViPham(thongTinXuLyViPham);
	}

	/**
	* Returns the trang thai of this q l v t phuong tien van tai.
	*
	* @return the trang thai of this q l v t phuong tien van tai
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _qlvtPhuongTienVanTai.getTrangThai();
	}

	/**
	* Sets the trang thai of this q l v t phuong tien van tai.
	*
	* @param trangThai the trang thai of this q l v t phuong tien van tai
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_qlvtPhuongTienVanTai.setTrangThai(trangThai);
	}

	/**
	* Returns the file ID of this q l v t phuong tien van tai.
	*
	* @return the file ID of this q l v t phuong tien van tai
	*/
	@Override
	public int getFileId() {
		return _qlvtPhuongTienVanTai.getFileId();
	}

	/**
	* Sets the file ID of this q l v t phuong tien van tai.
	*
	* @param fileId the file ID of this q l v t phuong tien van tai
	*/
	@Override
	public void setFileId(int fileId) {
		_qlvtPhuongTienVanTai.setFileId(fileId);
	}

	@Override
	public boolean isNew() {
		return _qlvtPhuongTienVanTai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtPhuongTienVanTai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtPhuongTienVanTai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtPhuongTienVanTai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtPhuongTienVanTai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtPhuongTienVanTai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtPhuongTienVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtPhuongTienVanTai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtPhuongTienVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtPhuongTienVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtPhuongTienVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QLVTPhuongTienVanTaiWrapper((QLVTPhuongTienVanTai)_qlvtPhuongTienVanTai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai qlvtPhuongTienVanTai) {
		return _qlvtPhuongTienVanTai.compareTo(qlvtPhuongTienVanTai);
	}

	@Override
	public int hashCode() {
		return _qlvtPhuongTienVanTai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai> toCacheModel() {
		return _qlvtPhuongTienVanTai.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai toEscapedModel() {
		return new QLVTPhuongTienVanTaiWrapper(_qlvtPhuongTienVanTai.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai toUnescapedModel() {
		return new QLVTPhuongTienVanTaiWrapper(_qlvtPhuongTienVanTai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtPhuongTienVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtPhuongTienVanTai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtPhuongTienVanTai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTPhuongTienVanTaiWrapper)) {
			return false;
		}

		QLVTPhuongTienVanTaiWrapper qlvtPhuongTienVanTaiWrapper = (QLVTPhuongTienVanTaiWrapper)obj;

		if (Validator.equals(_qlvtPhuongTienVanTai,
					qlvtPhuongTienVanTaiWrapper._qlvtPhuongTienVanTai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QLVTPhuongTienVanTai getWrappedQLVTPhuongTienVanTai() {
		return _qlvtPhuongTienVanTai;
	}

	@Override
	public QLVTPhuongTienVanTai getWrappedModel() {
		return _qlvtPhuongTienVanTai;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtPhuongTienVanTai.resetOriginalValues();
	}

	private QLVTPhuongTienVanTai _qlvtPhuongTienVanTai;
}