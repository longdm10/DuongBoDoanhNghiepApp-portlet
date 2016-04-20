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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QlvtCapPhepPhuongTienVanTai}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtCapPhepPhuongTienVanTai
 * @generated
 */
public class QlvtCapPhepPhuongTienVanTaiWrapper
	implements QlvtCapPhepPhuongTienVanTai,
		ModelWrapper<QlvtCapPhepPhuongTienVanTai> {
	public QlvtCapPhepPhuongTienVanTaiWrapper(
		QlvtCapPhepPhuongTienVanTai qlvtCapPhepPhuongTienVanTai) {
		_qlvtCapPhepPhuongTienVanTai = qlvtCapPhepPhuongTienVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtCapPhepPhuongTienVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtCapPhepPhuongTienVanTai.class.getName();
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
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String bienSoXe = (String)attributes.get("bienSoXe");

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

		Long fileId = (Long)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}
	}

	/**
	* Returns the primary key of this qlvt cap phep phuong tien van tai.
	*
	* @return the primary key of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public long getPrimaryKey() {
		return _qlvtCapPhepPhuongTienVanTai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qlvt cap phep phuong tien van tai.
	*
	* @param primaryKey the primary key of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_qlvtCapPhepPhuongTienVanTai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this qlvt cap phep phuong tien van tai.
	*
	* @return the ID of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public long getId() {
		return _qlvtCapPhepPhuongTienVanTai.getId();
	}

	/**
	* Sets the ID of this qlvt cap phep phuong tien van tai.
	*
	* @param id the ID of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setId(long id) {
		_qlvtCapPhepPhuongTienVanTai.setId(id);
	}

	/**
	* Returns the bien so xe of this qlvt cap phep phuong tien van tai.
	*
	* @return the bien so xe of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public java.lang.String getBienSoXe() {
		return _qlvtCapPhepPhuongTienVanTai.getBienSoXe();
	}

	/**
	* Sets the bien so xe of this qlvt cap phep phuong tien van tai.
	*
	* @param bienSoXe the bien so xe of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setBienSoXe(java.lang.String bienSoXe) {
		_qlvtCapPhepPhuongTienVanTai.setBienSoXe(bienSoXe);
	}

	/**
	* Returns the nhan hieu of this qlvt cap phep phuong tien van tai.
	*
	* @return the nhan hieu of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _qlvtCapPhepPhuongTienVanTai.getNhanHieu();
	}

	/**
	* Sets the nhan hieu of this qlvt cap phep phuong tien van tai.
	*
	* @param nhanHieu the nhan hieu of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setNhanHieu(java.lang.String nhanHieu) {
		_qlvtCapPhepPhuongTienVanTai.setNhanHieu(nhanHieu);
	}

	/**
	* Returns the trong tai of this qlvt cap phep phuong tien van tai.
	*
	* @return the trong tai of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public int getTrongTai() {
		return _qlvtCapPhepPhuongTienVanTai.getTrongTai();
	}

	/**
	* Sets the trong tai of this qlvt cap phep phuong tien van tai.
	*
	* @param trongTai the trong tai of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setTrongTai(int trongTai) {
		_qlvtCapPhepPhuongTienVanTai.setTrongTai(trongTai);
	}

	/**
	* Returns the noi san xuat of this qlvt cap phep phuong tien van tai.
	*
	* @return the noi san xuat of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public java.lang.String getNoiSanXuat() {
		return _qlvtCapPhepPhuongTienVanTai.getNoiSanXuat();
	}

	/**
	* Sets the noi san xuat of this qlvt cap phep phuong tien van tai.
	*
	* @param noiSanXuat the noi san xuat of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setNoiSanXuat(java.lang.String noiSanXuat) {
		_qlvtCapPhepPhuongTienVanTai.setNoiSanXuat(noiSanXuat);
	}

	/**
	* Returns the nam san xuat of this qlvt cap phep phuong tien van tai.
	*
	* @return the nam san xuat of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public int getNamSanXuat() {
		return _qlvtCapPhepPhuongTienVanTai.getNamSanXuat();
	}

	/**
	* Sets the nam san xuat of this qlvt cap phep phuong tien van tai.
	*
	* @param namSanXuat the nam san xuat of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setNamSanXuat(int namSanXuat) {
		_qlvtCapPhepPhuongTienVanTai.setNamSanXuat(namSanXuat);
	}

	/**
	* Returns the so cho ngoi of this qlvt cap phep phuong tien van tai.
	*
	* @return the so cho ngoi of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public int getSoChoNgoi() {
		return _qlvtCapPhepPhuongTienVanTai.getSoChoNgoi();
	}

	/**
	* Sets the so cho ngoi of this qlvt cap phep phuong tien van tai.
	*
	* @param soChoNgoi the so cho ngoi of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setSoChoNgoi(int soChoNgoi) {
		_qlvtCapPhepPhuongTienVanTai.setSoChoNgoi(soChoNgoi);
	}

	/**
	* Returns the hinh thuc so huu xe of this qlvt cap phep phuong tien van tai.
	*
	* @return the hinh thuc so huu xe of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public java.lang.String getHinhThucSoHuuXe() {
		return _qlvtCapPhepPhuongTienVanTai.getHinhThucSoHuuXe();
	}

	/**
	* Sets the hinh thuc so huu xe of this qlvt cap phep phuong tien van tai.
	*
	* @param hinhThucSoHuuXe the hinh thuc so huu xe of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setHinhThucSoHuuXe(java.lang.String hinhThucSoHuuXe) {
		_qlvtCapPhepPhuongTienVanTai.setHinhThucSoHuuXe(hinhThucSoHuuXe);
	}

	/**
	* Returns the nien han su dung giay dang kiem of this qlvt cap phep phuong tien van tai.
	*
	* @return the nien han su dung giay dang kiem of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public int getNienHanSuDungGiayDangKiem() {
		return _qlvtCapPhepPhuongTienVanTai.getNienHanSuDungGiayDangKiem();
	}

	/**
	* Sets the nien han su dung giay dang kiem of this qlvt cap phep phuong tien van tai.
	*
	* @param nienHanSuDungGiayDangKiem the nien han su dung giay dang kiem of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem) {
		_qlvtCapPhepPhuongTienVanTai.setNienHanSuDungGiayDangKiem(nienHanSuDungGiayDangKiem);
	}

	/**
	* Returns the nien han su dung n d86 of this qlvt cap phep phuong tien van tai.
	*
	* @return the nien han su dung n d86 of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public int getNienHanSuDungND86() {
		return _qlvtCapPhepPhuongTienVanTai.getNienHanSuDungND86();
	}

	/**
	* Sets the nien han su dung n d86 of this qlvt cap phep phuong tien van tai.
	*
	* @param nienHanSuDungND86 the nien han su dung n d86 of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setNienHanSuDungND86(int nienHanSuDungND86) {
		_qlvtCapPhepPhuongTienVanTai.setNienHanSuDungND86(nienHanSuDungND86);
	}

	/**
	* Returns the so khung of this qlvt cap phep phuong tien van tai.
	*
	* @return the so khung of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _qlvtCapPhepPhuongTienVanTai.getSoKhung();
	}

	/**
	* Sets the so khung of this qlvt cap phep phuong tien van tai.
	*
	* @param soKhung the so khung of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setSoKhung(java.lang.String soKhung) {
		_qlvtCapPhepPhuongTienVanTai.setSoKhung(soKhung);
	}

	/**
	* Returns the so may of this qlvt cap phep phuong tien van tai.
	*
	* @return the so may of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public java.lang.String getSoMay() {
		return _qlvtCapPhepPhuongTienVanTai.getSoMay();
	}

	/**
	* Sets the so may of this qlvt cap phep phuong tien van tai.
	*
	* @param soMay the so may of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setSoMay(java.lang.String soMay) {
		_qlvtCapPhepPhuongTienVanTai.setSoMay(soMay);
	}

	/**
	* Returns the mau son of this qlvt cap phep phuong tien van tai.
	*
	* @return the mau son of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public java.lang.String getMauSon() {
		return _qlvtCapPhepPhuongTienVanTai.getMauSon();
	}

	/**
	* Sets the mau son of this qlvt cap phep phuong tien van tai.
	*
	* @param mauSon the mau son of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setMauSon(java.lang.String mauSon) {
		_qlvtCapPhepPhuongTienVanTai.setMauSon(mauSon);
	}

	/**
	* Returns the thong tin xu ly vi pham of this qlvt cap phep phuong tien van tai.
	*
	* @return the thong tin xu ly vi pham of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public java.lang.String getThongTinXuLyViPham() {
		return _qlvtCapPhepPhuongTienVanTai.getThongTinXuLyViPham();
	}

	/**
	* Sets the thong tin xu ly vi pham of this qlvt cap phep phuong tien van tai.
	*
	* @param thongTinXuLyViPham the thong tin xu ly vi pham of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setThongTinXuLyViPham(java.lang.String thongTinXuLyViPham) {
		_qlvtCapPhepPhuongTienVanTai.setThongTinXuLyViPham(thongTinXuLyViPham);
	}

	/**
	* Returns the trang thai of this qlvt cap phep phuong tien van tai.
	*
	* @return the trang thai of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _qlvtCapPhepPhuongTienVanTai.getTrangThai();
	}

	/**
	* Sets the trang thai of this qlvt cap phep phuong tien van tai.
	*
	* @param trangThai the trang thai of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_qlvtCapPhepPhuongTienVanTai.setTrangThai(trangThai);
	}

	/**
	* Returns the file ID of this qlvt cap phep phuong tien van tai.
	*
	* @return the file ID of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public long getFileId() {
		return _qlvtCapPhepPhuongTienVanTai.getFileId();
	}

	/**
	* Sets the file ID of this qlvt cap phep phuong tien van tai.
	*
	* @param fileId the file ID of this qlvt cap phep phuong tien van tai
	*/
	@Override
	public void setFileId(long fileId) {
		_qlvtCapPhepPhuongTienVanTai.setFileId(fileId);
	}

	@Override
	public boolean isNew() {
		return _qlvtCapPhepPhuongTienVanTai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qlvtCapPhepPhuongTienVanTai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qlvtCapPhepPhuongTienVanTai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qlvtCapPhepPhuongTienVanTai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qlvtCapPhepPhuongTienVanTai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qlvtCapPhepPhuongTienVanTai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qlvtCapPhepPhuongTienVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qlvtCapPhepPhuongTienVanTai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qlvtCapPhepPhuongTienVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qlvtCapPhepPhuongTienVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qlvtCapPhepPhuongTienVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QlvtCapPhepPhuongTienVanTaiWrapper((QlvtCapPhepPhuongTienVanTai)_qlvtCapPhepPhuongTienVanTai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepPhuongTienVanTai qlvtCapPhepPhuongTienVanTai) {
		return _qlvtCapPhepPhuongTienVanTai.compareTo(qlvtCapPhepPhuongTienVanTai);
	}

	@Override
	public int hashCode() {
		return _qlvtCapPhepPhuongTienVanTai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepPhuongTienVanTai> toCacheModel() {
		return _qlvtCapPhepPhuongTienVanTai.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepPhuongTienVanTai toEscapedModel() {
		return new QlvtCapPhepPhuongTienVanTaiWrapper(_qlvtCapPhepPhuongTienVanTai.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepPhuongTienVanTai toUnescapedModel() {
		return new QlvtCapPhepPhuongTienVanTaiWrapper(_qlvtCapPhepPhuongTienVanTai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qlvtCapPhepPhuongTienVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qlvtCapPhepPhuongTienVanTai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qlvtCapPhepPhuongTienVanTai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtCapPhepPhuongTienVanTaiWrapper)) {
			return false;
		}

		QlvtCapPhepPhuongTienVanTaiWrapper qlvtCapPhepPhuongTienVanTaiWrapper = (QlvtCapPhepPhuongTienVanTaiWrapper)obj;

		if (Validator.equals(_qlvtCapPhepPhuongTienVanTai,
					qlvtCapPhepPhuongTienVanTaiWrapper._qlvtCapPhepPhuongTienVanTai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QlvtCapPhepPhuongTienVanTai getWrappedQlvtCapPhepPhuongTienVanTai() {
		return _qlvtCapPhepPhuongTienVanTai;
	}

	@Override
	public QlvtCapPhepPhuongTienVanTai getWrappedModel() {
		return _qlvtCapPhepPhuongTienVanTai;
	}

	@Override
	public void resetOriginalValues() {
		_qlvtCapPhepPhuongTienVanTai.resetOriginalValues();
	}

	private QlvtCapPhepPhuongTienVanTai _qlvtCapPhepPhuongTienVanTai;
}