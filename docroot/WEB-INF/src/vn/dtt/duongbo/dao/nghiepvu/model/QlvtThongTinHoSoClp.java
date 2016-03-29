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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtThongTinHoSoClp extends BaseModelImpl<QlvtThongTinHoSo>
	implements QlvtThongTinHoSo {
	public QlvtThongTinHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinHoSo.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("soCongVanDen", getSoCongVanDen());
		attributes.put("tenDn", getTenDn());
		attributes.put("diaChiDn", getDiaChiDn());
		attributes.put("dienThoaiDn", getDienThoaiDn());
		attributes.put("soFaxDn", getSoFaxDn());
		attributes.put("emailDn", getEmailDn());
		attributes.put("webSiteDn", getWebSiteDn());
		attributes.put("soDkkd", getSoDkkd());
		attributes.put("ngayCapDkkd", getNgayCapDkkd());
		attributes.put("ngayHetHanDkkd", getNgayHetHanDkkd());
		attributes.put("coQuanCapDkkd", getCoQuanCapDkkd());
		attributes.put("daiDienDn", getDaiDienDn());
		attributes.put("coQuanGiaiQuyet", getCoQuanGiaiQuyet());
		attributes.put("diaDiemLamHoSo", getDiaDiemLamHoSo());
		attributes.put("phieuXuLyId", getPhieuXuLyId());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("lyDoCapLai", getLyDoCapLai());
		attributes.put("lanCapGiayDangKyKinhDoanh",
			getLanCapGiayDangKyKinhDoanh());
		attributes.put("soGiayPhepKinhDoanhVanTaiNoiDia",
			getSoGiayPhepKinhDoanhVanTaiNoiDia());
		attributes.put("ngayCapGPKDVTNoiDia", getNgayCapGPKDVTNoiDia());
		attributes.put("NgayGiaHanGPKDVTNoiDia", getNgayGiaHanGPKDVTNoiDia());
		attributes.put("NgayHetHanGPKDVTNoiDia", getNgayHetHanGPKDVTNoiDia());
		attributes.put("lanCapGPKDVTNoiDia", getLanCapGPKDVTNoiDia());
		attributes.put("ngayGiaHanGiayDangKyKinhDoanh",
			getNgayGiaHanGiayDangKyKinhDoanh());
		attributes.put("soGiayPhepKinhDoanhVanTaiQuocTe",
			getSoGiayPhepKinhDoanhVanTaiQuocTe());
		attributes.put("lanCapGPKDVTQuocTe", getLanCapGPKDVTQuocTe());
		attributes.put("ngayCapGPKDVTQuocTe", getNgayCapGPKDVTQuocTe());
		attributes.put("ngayGiaHanGPKDVTQuocTe", getNgayGiaHanGPKDVTQuocTe());
		attributes.put("ngayHetHanGPKDVTQuocTe", getNgayHetHanGPKDVTQuocTe());
		attributes.put("nguoiLienHeTraKetQua", getNguoiLienHeTraKetQua());
		attributes.put("soDienThoaiNguoiLienHe", getSoDienThoaiNguoiLienHe());
		attributes.put("coQuanCapGPKDVTNoiDia", getCoQuanCapGPKDVTNoiDia());
		attributes.put("nguoiNhanKetQua", getNguoiNhanKetQua());
		attributes.put("thongTinTraKetQua", getThongTinTraKetQua());
		attributes.put("ngayTraKetQua", getNgayTraKetQua());
		attributes.put("diaChiNguoiLienHeTraKetQua",
			getDiaChiNguoiLienHeTraKetQua());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String soCongVanDen = (String)attributes.get("soCongVanDen");

		if (soCongVanDen != null) {
			setSoCongVanDen(soCongVanDen);
		}

		String tenDn = (String)attributes.get("tenDn");

		if (tenDn != null) {
			setTenDn(tenDn);
		}

		String diaChiDn = (String)attributes.get("diaChiDn");

		if (diaChiDn != null) {
			setDiaChiDn(diaChiDn);
		}

		String dienThoaiDn = (String)attributes.get("dienThoaiDn");

		if (dienThoaiDn != null) {
			setDienThoaiDn(dienThoaiDn);
		}

		String soFaxDn = (String)attributes.get("soFaxDn");

		if (soFaxDn != null) {
			setSoFaxDn(soFaxDn);
		}

		String emailDn = (String)attributes.get("emailDn");

		if (emailDn != null) {
			setEmailDn(emailDn);
		}

		String webSiteDn = (String)attributes.get("webSiteDn");

		if (webSiteDn != null) {
			setWebSiteDn(webSiteDn);
		}

		String soDkkd = (String)attributes.get("soDkkd");

		if (soDkkd != null) {
			setSoDkkd(soDkkd);
		}

		Date ngayCapDkkd = (Date)attributes.get("ngayCapDkkd");

		if (ngayCapDkkd != null) {
			setNgayCapDkkd(ngayCapDkkd);
		}

		Date ngayHetHanDkkd = (Date)attributes.get("ngayHetHanDkkd");

		if (ngayHetHanDkkd != null) {
			setNgayHetHanDkkd(ngayHetHanDkkd);
		}

		String coQuanCapDkkd = (String)attributes.get("coQuanCapDkkd");

		if (coQuanCapDkkd != null) {
			setCoQuanCapDkkd(coQuanCapDkkd);
		}

		String daiDienDn = (String)attributes.get("daiDienDn");

		if (daiDienDn != null) {
			setDaiDienDn(daiDienDn);
		}

		Long coQuanGiaiQuyet = (Long)attributes.get("coQuanGiaiQuyet");

		if (coQuanGiaiQuyet != null) {
			setCoQuanGiaiQuyet(coQuanGiaiQuyet);
		}

		String diaDiemLamHoSo = (String)attributes.get("diaDiemLamHoSo");

		if (diaDiemLamHoSo != null) {
			setDiaDiemLamHoSo(diaDiemLamHoSo);
		}

		Long phieuXuLyId = (Long)attributes.get("phieuXuLyId");

		if (phieuXuLyId != null) {
			setPhieuXuLyId(phieuXuLyId);
		}

		String maSoHoSo = (String)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		String lyDoCapLai = (String)attributes.get("lyDoCapLai");

		if (lyDoCapLai != null) {
			setLyDoCapLai(lyDoCapLai);
		}

		Integer lanCapGiayDangKyKinhDoanh = (Integer)attributes.get(
				"lanCapGiayDangKyKinhDoanh");

		if (lanCapGiayDangKyKinhDoanh != null) {
			setLanCapGiayDangKyKinhDoanh(lanCapGiayDangKyKinhDoanh);
		}

		String soGiayPhepKinhDoanhVanTaiNoiDia = (String)attributes.get(
				"soGiayPhepKinhDoanhVanTaiNoiDia");

		if (soGiayPhepKinhDoanhVanTaiNoiDia != null) {
			setSoGiayPhepKinhDoanhVanTaiNoiDia(soGiayPhepKinhDoanhVanTaiNoiDia);
		}

		Date ngayCapGPKDVTNoiDia = (Date)attributes.get("ngayCapGPKDVTNoiDia");

		if (ngayCapGPKDVTNoiDia != null) {
			setNgayCapGPKDVTNoiDia(ngayCapGPKDVTNoiDia);
		}

		Date NgayGiaHanGPKDVTNoiDia = (Date)attributes.get(
				"NgayGiaHanGPKDVTNoiDia");

		if (NgayGiaHanGPKDVTNoiDia != null) {
			setNgayGiaHanGPKDVTNoiDia(NgayGiaHanGPKDVTNoiDia);
		}

		Date NgayHetHanGPKDVTNoiDia = (Date)attributes.get(
				"NgayHetHanGPKDVTNoiDia");

		if (NgayHetHanGPKDVTNoiDia != null) {
			setNgayHetHanGPKDVTNoiDia(NgayHetHanGPKDVTNoiDia);
		}

		Integer lanCapGPKDVTNoiDia = (Integer)attributes.get(
				"lanCapGPKDVTNoiDia");

		if (lanCapGPKDVTNoiDia != null) {
			setLanCapGPKDVTNoiDia(lanCapGPKDVTNoiDia);
		}

		Date ngayGiaHanGiayDangKyKinhDoanh = (Date)attributes.get(
				"ngayGiaHanGiayDangKyKinhDoanh");

		if (ngayGiaHanGiayDangKyKinhDoanh != null) {
			setNgayGiaHanGiayDangKyKinhDoanh(ngayGiaHanGiayDangKyKinhDoanh);
		}

		String soGiayPhepKinhDoanhVanTaiQuocTe = (String)attributes.get(
				"soGiayPhepKinhDoanhVanTaiQuocTe");

		if (soGiayPhepKinhDoanhVanTaiQuocTe != null) {
			setSoGiayPhepKinhDoanhVanTaiQuocTe(soGiayPhepKinhDoanhVanTaiQuocTe);
		}

		Integer lanCapGPKDVTQuocTe = (Integer)attributes.get(
				"lanCapGPKDVTQuocTe");

		if (lanCapGPKDVTQuocTe != null) {
			setLanCapGPKDVTQuocTe(lanCapGPKDVTQuocTe);
		}

		Date ngayCapGPKDVTQuocTe = (Date)attributes.get("ngayCapGPKDVTQuocTe");

		if (ngayCapGPKDVTQuocTe != null) {
			setNgayCapGPKDVTQuocTe(ngayCapGPKDVTQuocTe);
		}

		Date ngayGiaHanGPKDVTQuocTe = (Date)attributes.get(
				"ngayGiaHanGPKDVTQuocTe");

		if (ngayGiaHanGPKDVTQuocTe != null) {
			setNgayGiaHanGPKDVTQuocTe(ngayGiaHanGPKDVTQuocTe);
		}

		Date ngayHetHanGPKDVTQuocTe = (Date)attributes.get(
				"ngayHetHanGPKDVTQuocTe");

		if (ngayHetHanGPKDVTQuocTe != null) {
			setNgayHetHanGPKDVTQuocTe(ngayHetHanGPKDVTQuocTe);
		}

		String nguoiLienHeTraKetQua = (String)attributes.get(
				"nguoiLienHeTraKetQua");

		if (nguoiLienHeTraKetQua != null) {
			setNguoiLienHeTraKetQua(nguoiLienHeTraKetQua);
		}

		String soDienThoaiNguoiLienHe = (String)attributes.get(
				"soDienThoaiNguoiLienHe");

		if (soDienThoaiNguoiLienHe != null) {
			setSoDienThoaiNguoiLienHe(soDienThoaiNguoiLienHe);
		}

		String coQuanCapGPKDVTNoiDia = (String)attributes.get(
				"coQuanCapGPKDVTNoiDia");

		if (coQuanCapGPKDVTNoiDia != null) {
			setCoQuanCapGPKDVTNoiDia(coQuanCapGPKDVTNoiDia);
		}

		String nguoiNhanKetQua = (String)attributes.get("nguoiNhanKetQua");

		if (nguoiNhanKetQua != null) {
			setNguoiNhanKetQua(nguoiNhanKetQua);
		}

		String thongTinTraKetQua = (String)attributes.get("thongTinTraKetQua");

		if (thongTinTraKetQua != null) {
			setThongTinTraKetQua(thongTinTraKetQua);
		}

		Date ngayTraKetQua = (Date)attributes.get("ngayTraKetQua");

		if (ngayTraKetQua != null) {
			setNgayTraKetQua(ngayTraKetQua);
		}

		String diaChiNguoiLienHeTraKetQua = (String)attributes.get(
				"diaChiNguoiLienHeTraKetQua");

		if (diaChiNguoiLienHeTraKetQua != null) {
			setDiaChiNguoiLienHeTraKetQua(diaChiNguoiLienHeTraKetQua);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoCongVanDen() {
		return _soCongVanDen;
	}

	@Override
	public void setSoCongVanDen(String soCongVanDen) {
		_soCongVanDen = soCongVanDen;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoCongVanDen", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, soCongVanDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDn() {
		return _tenDn;
	}

	@Override
	public void setTenDn(String tenDn) {
		_tenDn = tenDn;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDn", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, tenDn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiDn() {
		return _diaChiDn;
	}

	@Override
	public void setDiaChiDn(String diaChiDn) {
		_diaChiDn = diaChiDn;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiDn", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, diaChiDn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoaiDn() {
		return _dienThoaiDn;
	}

	@Override
	public void setDienThoaiDn(String dienThoaiDn) {
		_dienThoaiDn = dienThoaiDn;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoaiDn", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, dienThoaiDn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoFaxDn() {
		return _soFaxDn;
	}

	@Override
	public void setSoFaxDn(String soFaxDn) {
		_soFaxDn = soFaxDn;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoFaxDn", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, soFaxDn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmailDn() {
		return _emailDn;
	}

	@Override
	public void setEmailDn(String emailDn) {
		_emailDn = emailDn;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailDn", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, emailDn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWebSiteDn() {
		return _webSiteDn;
	}

	@Override
	public void setWebSiteDn(String webSiteDn) {
		_webSiteDn = webSiteDn;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setWebSiteDn", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, webSiteDn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDkkd() {
		return _soDkkd;
	}

	@Override
	public void setSoDkkd(String soDkkd) {
		_soDkkd = soDkkd;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDkkd", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, soDkkd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapDkkd() {
		return _ngayCapDkkd;
	}

	@Override
	public void setNgayCapDkkd(Date ngayCapDkkd) {
		_ngayCapDkkd = ngayCapDkkd;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapDkkd", Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, ngayCapDkkd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanDkkd() {
		return _ngayHetHanDkkd;
	}

	@Override
	public void setNgayHetHanDkkd(Date ngayHetHanDkkd) {
		_ngayHetHanDkkd = ngayHetHanDkkd;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanDkkd", Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, ngayHetHanDkkd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoQuanCapDkkd() {
		return _coQuanCapDkkd;
	}

	@Override
	public void setCoQuanCapDkkd(String coQuanCapDkkd) {
		_coQuanCapDkkd = coQuanCapDkkd;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapDkkd", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, coQuanCapDkkd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDaiDienDn() {
		return _daiDienDn;
	}

	@Override
	public void setDaiDienDn(String daiDienDn) {
		_daiDienDn = daiDienDn;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setDaiDienDn", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, daiDienDn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCoQuanGiaiQuyet() {
		return _coQuanGiaiQuyet;
	}

	@Override
	public void setCoQuanGiaiQuyet(long coQuanGiaiQuyet) {
		_coQuanGiaiQuyet = coQuanGiaiQuyet;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanGiaiQuyet", long.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, coQuanGiaiQuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaDiemLamHoSo() {
		return _diaDiemLamHoSo;
	}

	@Override
	public void setDiaDiemLamHoSo(String diaDiemLamHoSo) {
		_diaDiemLamHoSo = diaDiemLamHoSo;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaDiemLamHoSo",
						String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, diaDiemLamHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyId() {
		return _phieuXuLyId;
	}

	@Override
	public void setPhieuXuLyId(long phieuXuLyId) {
		_phieuXuLyId = phieuXuLyId;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyId", long.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, phieuXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoHoSo() {
		return _maSoHoSo;
	}

	@Override
	public void setMaSoHoSo(String maSoHoSo) {
		_maSoHoSo = maSoHoSo;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoHoSo", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, maSoHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoCapLai() {
		return _lyDoCapLai;
	}

	@Override
	public void setLyDoCapLai(String lyDoCapLai) {
		_lyDoCapLai = lyDoCapLai;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoCapLai", String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, lyDoCapLai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLanCapGiayDangKyKinhDoanh() {
		return _lanCapGiayDangKyKinhDoanh;
	}

	@Override
	public void setLanCapGiayDangKyKinhDoanh(int lanCapGiayDangKyKinhDoanh) {
		_lanCapGiayDangKyKinhDoanh = lanCapGiayDangKyKinhDoanh;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLanCapGiayDangKyKinhDoanh",
						int.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					lanCapGiayDangKyKinhDoanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGiayPhepKinhDoanhVanTaiNoiDia() {
		return _soGiayPhepKinhDoanhVanTaiNoiDia;
	}

	@Override
	public void setSoGiayPhepKinhDoanhVanTaiNoiDia(
		String soGiayPhepKinhDoanhVanTaiNoiDia) {
		_soGiayPhepKinhDoanhVanTaiNoiDia = soGiayPhepKinhDoanhVanTaiNoiDia;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGiayPhepKinhDoanhVanTaiNoiDia",
						String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					soGiayPhepKinhDoanhVanTaiNoiDia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGPKDVTNoiDia() {
		return _ngayCapGPKDVTNoiDia;
	}

	@Override
	public void setNgayCapGPKDVTNoiDia(Date ngayCapGPKDVTNoiDia) {
		_ngayCapGPKDVTNoiDia = ngayCapGPKDVTNoiDia;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGPKDVTNoiDia",
						Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, ngayCapGPKDVTNoiDia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGiaHanGPKDVTNoiDia() {
		return _NgayGiaHanGPKDVTNoiDia;
	}

	@Override
	public void setNgayGiaHanGPKDVTNoiDia(Date NgayGiaHanGPKDVTNoiDia) {
		_NgayGiaHanGPKDVTNoiDia = NgayGiaHanGPKDVTNoiDia;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGiaHanGPKDVTNoiDia",
						Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					NgayGiaHanGPKDVTNoiDia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanGPKDVTNoiDia() {
		return _NgayHetHanGPKDVTNoiDia;
	}

	@Override
	public void setNgayHetHanGPKDVTNoiDia(Date NgayHetHanGPKDVTNoiDia) {
		_NgayHetHanGPKDVTNoiDia = NgayHetHanGPKDVTNoiDia;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanGPKDVTNoiDia",
						Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					NgayHetHanGPKDVTNoiDia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLanCapGPKDVTNoiDia() {
		return _lanCapGPKDVTNoiDia;
	}

	@Override
	public void setLanCapGPKDVTNoiDia(int lanCapGPKDVTNoiDia) {
		_lanCapGPKDVTNoiDia = lanCapGPKDVTNoiDia;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLanCapGPKDVTNoiDia",
						int.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, lanCapGPKDVTNoiDia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGiaHanGiayDangKyKinhDoanh() {
		return _ngayGiaHanGiayDangKyKinhDoanh;
	}

	@Override
	public void setNgayGiaHanGiayDangKyKinhDoanh(
		Date ngayGiaHanGiayDangKyKinhDoanh) {
		_ngayGiaHanGiayDangKyKinhDoanh = ngayGiaHanGiayDangKyKinhDoanh;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGiaHanGiayDangKyKinhDoanh",
						Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					ngayGiaHanGiayDangKyKinhDoanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGiayPhepKinhDoanhVanTaiQuocTe() {
		return _soGiayPhepKinhDoanhVanTaiQuocTe;
	}

	@Override
	public void setSoGiayPhepKinhDoanhVanTaiQuocTe(
		String soGiayPhepKinhDoanhVanTaiQuocTe) {
		_soGiayPhepKinhDoanhVanTaiQuocTe = soGiayPhepKinhDoanhVanTaiQuocTe;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGiayPhepKinhDoanhVanTaiQuocTe",
						String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					soGiayPhepKinhDoanhVanTaiQuocTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLanCapGPKDVTQuocTe() {
		return _lanCapGPKDVTQuocTe;
	}

	@Override
	public void setLanCapGPKDVTQuocTe(int lanCapGPKDVTQuocTe) {
		_lanCapGPKDVTQuocTe = lanCapGPKDVTQuocTe;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLanCapGPKDVTQuocTe",
						int.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, lanCapGPKDVTQuocTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGPKDVTQuocTe() {
		return _ngayCapGPKDVTQuocTe;
	}

	@Override
	public void setNgayCapGPKDVTQuocTe(Date ngayCapGPKDVTQuocTe) {
		_ngayCapGPKDVTQuocTe = ngayCapGPKDVTQuocTe;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGPKDVTQuocTe",
						Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, ngayCapGPKDVTQuocTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGiaHanGPKDVTQuocTe() {
		return _ngayGiaHanGPKDVTQuocTe;
	}

	@Override
	public void setNgayGiaHanGPKDVTQuocTe(Date ngayGiaHanGPKDVTQuocTe) {
		_ngayGiaHanGPKDVTQuocTe = ngayGiaHanGPKDVTQuocTe;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGiaHanGPKDVTQuocTe",
						Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					ngayGiaHanGPKDVTQuocTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanGPKDVTQuocTe() {
		return _ngayHetHanGPKDVTQuocTe;
	}

	@Override
	public void setNgayHetHanGPKDVTQuocTe(Date ngayHetHanGPKDVTQuocTe) {
		_ngayHetHanGPKDVTQuocTe = ngayHetHanGPKDVTQuocTe;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanGPKDVTQuocTe",
						Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					ngayHetHanGPKDVTQuocTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiLienHeTraKetQua() {
		return _nguoiLienHeTraKetQua;
	}

	@Override
	public void setNguoiLienHeTraKetQua(String nguoiLienHeTraKetQua) {
		_nguoiLienHeTraKetQua = nguoiLienHeTraKetQua;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiLienHeTraKetQua",
						String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, nguoiLienHeTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDienThoaiNguoiLienHe() {
		return _soDienThoaiNguoiLienHe;
	}

	@Override
	public void setSoDienThoaiNguoiLienHe(String soDienThoaiNguoiLienHe) {
		_soDienThoaiNguoiLienHe = soDienThoaiNguoiLienHe;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDienThoaiNguoiLienHe",
						String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					soDienThoaiNguoiLienHe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoQuanCapGPKDVTNoiDia() {
		return _coQuanCapGPKDVTNoiDia;
	}

	@Override
	public void setCoQuanCapGPKDVTNoiDia(String coQuanCapGPKDVTNoiDia) {
		_coQuanCapGPKDVTNoiDia = coQuanCapGPKDVTNoiDia;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapGPKDVTNoiDia",
						String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					coQuanCapGPKDVTNoiDia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiNhanKetQua() {
		return _nguoiNhanKetQua;
	}

	@Override
	public void setNguoiNhanKetQua(String nguoiNhanKetQua) {
		_nguoiNhanKetQua = nguoiNhanKetQua;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiNhanKetQua",
						String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, nguoiNhanKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThongTinTraKetQua() {
		return _thongTinTraKetQua;
	}

	@Override
	public void setThongTinTraKetQua(String thongTinTraKetQua) {
		_thongTinTraKetQua = thongTinTraKetQua;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinTraKetQua",
						String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, thongTinTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTraKetQua() {
		return _ngayTraKetQua;
	}

	@Override
	public void setNgayTraKetQua(Date ngayTraKetQua) {
		_ngayTraKetQua = ngayTraKetQua;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTraKetQua", Date.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel, ngayTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiNguoiLienHeTraKetQua() {
		return _diaChiNguoiLienHeTraKetQua;
	}

	@Override
	public void setDiaChiNguoiLienHeTraKetQua(String diaChiNguoiLienHeTraKetQua) {
		_diaChiNguoiLienHeTraKetQua = diaChiNguoiLienHeTraKetQua;

		if (_qlvtThongTinHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiNguoiLienHeTraKetQua",
						String.class);

				method.invoke(_qlvtThongTinHoSoRemoteModel,
					diaChiNguoiLienHeTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtThongTinHoSoRemoteModel() {
		return _qlvtThongTinHoSoRemoteModel;
	}

	public void setQlvtThongTinHoSoRemoteModel(
		BaseModel<?> qlvtThongTinHoSoRemoteModel) {
		_qlvtThongTinHoSoRemoteModel = qlvtThongTinHoSoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _qlvtThongTinHoSoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_qlvtThongTinHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtThongTinHoSoLocalServiceUtil.addQlvtThongTinHoSo(this);
		}
		else {
			QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(this);
		}
	}

	@Override
	public QlvtThongTinHoSo toEscapedModel() {
		return (QlvtThongTinHoSo)ProxyUtil.newProxyInstance(QlvtThongTinHoSo.class.getClassLoader(),
			new Class[] { QlvtThongTinHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtThongTinHoSoClp clone = new QlvtThongTinHoSoClp();

		clone.setId(getId());
		clone.setSoCongVanDen(getSoCongVanDen());
		clone.setTenDn(getTenDn());
		clone.setDiaChiDn(getDiaChiDn());
		clone.setDienThoaiDn(getDienThoaiDn());
		clone.setSoFaxDn(getSoFaxDn());
		clone.setEmailDn(getEmailDn());
		clone.setWebSiteDn(getWebSiteDn());
		clone.setSoDkkd(getSoDkkd());
		clone.setNgayCapDkkd(getNgayCapDkkd());
		clone.setNgayHetHanDkkd(getNgayHetHanDkkd());
		clone.setCoQuanCapDkkd(getCoQuanCapDkkd());
		clone.setDaiDienDn(getDaiDienDn());
		clone.setCoQuanGiaiQuyet(getCoQuanGiaiQuyet());
		clone.setDiaDiemLamHoSo(getDiaDiemLamHoSo());
		clone.setPhieuXuLyId(getPhieuXuLyId());
		clone.setMaSoHoSo(getMaSoHoSo());
		clone.setLyDoCapLai(getLyDoCapLai());
		clone.setLanCapGiayDangKyKinhDoanh(getLanCapGiayDangKyKinhDoanh());
		clone.setSoGiayPhepKinhDoanhVanTaiNoiDia(getSoGiayPhepKinhDoanhVanTaiNoiDia());
		clone.setNgayCapGPKDVTNoiDia(getNgayCapGPKDVTNoiDia());
		clone.setNgayGiaHanGPKDVTNoiDia(getNgayGiaHanGPKDVTNoiDia());
		clone.setNgayHetHanGPKDVTNoiDia(getNgayHetHanGPKDVTNoiDia());
		clone.setLanCapGPKDVTNoiDia(getLanCapGPKDVTNoiDia());
		clone.setNgayGiaHanGiayDangKyKinhDoanh(getNgayGiaHanGiayDangKyKinhDoanh());
		clone.setSoGiayPhepKinhDoanhVanTaiQuocTe(getSoGiayPhepKinhDoanhVanTaiQuocTe());
		clone.setLanCapGPKDVTQuocTe(getLanCapGPKDVTQuocTe());
		clone.setNgayCapGPKDVTQuocTe(getNgayCapGPKDVTQuocTe());
		clone.setNgayGiaHanGPKDVTQuocTe(getNgayGiaHanGPKDVTQuocTe());
		clone.setNgayHetHanGPKDVTQuocTe(getNgayHetHanGPKDVTQuocTe());
		clone.setNguoiLienHeTraKetQua(getNguoiLienHeTraKetQua());
		clone.setSoDienThoaiNguoiLienHe(getSoDienThoaiNguoiLienHe());
		clone.setCoQuanCapGPKDVTNoiDia(getCoQuanCapGPKDVTNoiDia());
		clone.setNguoiNhanKetQua(getNguoiNhanKetQua());
		clone.setThongTinTraKetQua(getThongTinTraKetQua());
		clone.setNgayTraKetQua(getNgayTraKetQua());
		clone.setDiaChiNguoiLienHeTraKetQua(getDiaChiNguoiLienHeTraKetQua());

		return clone;
	}

	@Override
	public int compareTo(QlvtThongTinHoSo qlvtThongTinHoSo) {
		int value = 0;

		if (getId() < qlvtThongTinHoSo.getId()) {
			value = -1;
		}
		else if (getId() > qlvtThongTinHoSo.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtThongTinHoSoClp)) {
			return false;
		}

		QlvtThongTinHoSoClp qlvtThongTinHoSo = (QlvtThongTinHoSoClp)obj;

		long primaryKey = qlvtThongTinHoSo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(75);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", soCongVanDen=");
		sb.append(getSoCongVanDen());
		sb.append(", tenDn=");
		sb.append(getTenDn());
		sb.append(", diaChiDn=");
		sb.append(getDiaChiDn());
		sb.append(", dienThoaiDn=");
		sb.append(getDienThoaiDn());
		sb.append(", soFaxDn=");
		sb.append(getSoFaxDn());
		sb.append(", emailDn=");
		sb.append(getEmailDn());
		sb.append(", webSiteDn=");
		sb.append(getWebSiteDn());
		sb.append(", soDkkd=");
		sb.append(getSoDkkd());
		sb.append(", ngayCapDkkd=");
		sb.append(getNgayCapDkkd());
		sb.append(", ngayHetHanDkkd=");
		sb.append(getNgayHetHanDkkd());
		sb.append(", coQuanCapDkkd=");
		sb.append(getCoQuanCapDkkd());
		sb.append(", daiDienDn=");
		sb.append(getDaiDienDn());
		sb.append(", coQuanGiaiQuyet=");
		sb.append(getCoQuanGiaiQuyet());
		sb.append(", diaDiemLamHoSo=");
		sb.append(getDiaDiemLamHoSo());
		sb.append(", phieuXuLyId=");
		sb.append(getPhieuXuLyId());
		sb.append(", maSoHoSo=");
		sb.append(getMaSoHoSo());
		sb.append(", lyDoCapLai=");
		sb.append(getLyDoCapLai());
		sb.append(", lanCapGiayDangKyKinhDoanh=");
		sb.append(getLanCapGiayDangKyKinhDoanh());
		sb.append(", soGiayPhepKinhDoanhVanTaiNoiDia=");
		sb.append(getSoGiayPhepKinhDoanhVanTaiNoiDia());
		sb.append(", ngayCapGPKDVTNoiDia=");
		sb.append(getNgayCapGPKDVTNoiDia());
		sb.append(", NgayGiaHanGPKDVTNoiDia=");
		sb.append(getNgayGiaHanGPKDVTNoiDia());
		sb.append(", NgayHetHanGPKDVTNoiDia=");
		sb.append(getNgayHetHanGPKDVTNoiDia());
		sb.append(", lanCapGPKDVTNoiDia=");
		sb.append(getLanCapGPKDVTNoiDia());
		sb.append(", ngayGiaHanGiayDangKyKinhDoanh=");
		sb.append(getNgayGiaHanGiayDangKyKinhDoanh());
		sb.append(", soGiayPhepKinhDoanhVanTaiQuocTe=");
		sb.append(getSoGiayPhepKinhDoanhVanTaiQuocTe());
		sb.append(", lanCapGPKDVTQuocTe=");
		sb.append(getLanCapGPKDVTQuocTe());
		sb.append(", ngayCapGPKDVTQuocTe=");
		sb.append(getNgayCapGPKDVTQuocTe());
		sb.append(", ngayGiaHanGPKDVTQuocTe=");
		sb.append(getNgayGiaHanGPKDVTQuocTe());
		sb.append(", ngayHetHanGPKDVTQuocTe=");
		sb.append(getNgayHetHanGPKDVTQuocTe());
		sb.append(", nguoiLienHeTraKetQua=");
		sb.append(getNguoiLienHeTraKetQua());
		sb.append(", soDienThoaiNguoiLienHe=");
		sb.append(getSoDienThoaiNguoiLienHe());
		sb.append(", coQuanCapGPKDVTNoiDia=");
		sb.append(getCoQuanCapGPKDVTNoiDia());
		sb.append(", nguoiNhanKetQua=");
		sb.append(getNguoiNhanKetQua());
		sb.append(", thongTinTraKetQua=");
		sb.append(getThongTinTraKetQua());
		sb.append(", ngayTraKetQua=");
		sb.append(getNgayTraKetQua());
		sb.append(", diaChiNguoiLienHeTraKetQua=");
		sb.append(getDiaChiNguoiLienHeTraKetQua());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(115);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soCongVanDen</column-name><column-value><![CDATA[");
		sb.append(getSoCongVanDen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenDn</column-name><column-value><![CDATA[");
		sb.append(getTenDn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiDn</column-name><column-value><![CDATA[");
		sb.append(getDiaChiDn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dienThoaiDn</column-name><column-value><![CDATA[");
		sb.append(getDienThoaiDn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soFaxDn</column-name><column-value><![CDATA[");
		sb.append(getSoFaxDn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailDn</column-name><column-value><![CDATA[");
		sb.append(getEmailDn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>webSiteDn</column-name><column-value><![CDATA[");
		sb.append(getWebSiteDn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDkkd</column-name><column-value><![CDATA[");
		sb.append(getSoDkkd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapDkkd</column-name><column-value><![CDATA[");
		sb.append(getNgayCapDkkd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHanDkkd</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanDkkd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapDkkd</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapDkkd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daiDienDn</column-name><column-value><![CDATA[");
		sb.append(getDaiDienDn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanGiaiQuyet</column-name><column-value><![CDATA[");
		sb.append(getCoQuanGiaiQuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaDiemLamHoSo</column-name><column-value><![CDATA[");
		sb.append(getDiaDiemLamHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuXuLyId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaSoHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoCapLai</column-name><column-value><![CDATA[");
		sb.append(getLyDoCapLai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanCapGiayDangKyKinhDoanh</column-name><column-value><![CDATA[");
		sb.append(getLanCapGiayDangKyKinhDoanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGiayPhepKinhDoanhVanTaiNoiDia</column-name><column-value><![CDATA[");
		sb.append(getSoGiayPhepKinhDoanhVanTaiNoiDia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGPKDVTNoiDia</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGPKDVTNoiDia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayGiaHanGPKDVTNoiDia</column-name><column-value><![CDATA[");
		sb.append(getNgayGiaHanGPKDVTNoiDia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayHetHanGPKDVTNoiDia</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanGPKDVTNoiDia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanCapGPKDVTNoiDia</column-name><column-value><![CDATA[");
		sb.append(getLanCapGPKDVTNoiDia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayGiaHanGiayDangKyKinhDoanh</column-name><column-value><![CDATA[");
		sb.append(getNgayGiaHanGiayDangKyKinhDoanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGiayPhepKinhDoanhVanTaiQuocTe</column-name><column-value><![CDATA[");
		sb.append(getSoGiayPhepKinhDoanhVanTaiQuocTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanCapGPKDVTQuocTe</column-name><column-value><![CDATA[");
		sb.append(getLanCapGPKDVTQuocTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGPKDVTQuocTe</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGPKDVTQuocTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayGiaHanGPKDVTQuocTe</column-name><column-value><![CDATA[");
		sb.append(getNgayGiaHanGPKDVTQuocTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHanGPKDVTQuocTe</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanGPKDVTQuocTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiLienHeTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getNguoiLienHeTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDienThoaiNguoiLienHe</column-name><column-value><![CDATA[");
		sb.append(getSoDienThoaiNguoiLienHe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapGPKDVTNoiDia</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapGPKDVTNoiDia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiNhanKetQua</column-name><column-value><![CDATA[");
		sb.append(getNguoiNhanKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getThongTinTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getNgayTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiNguoiLienHeTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getDiaChiNguoiLienHeTraKetQua());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _soCongVanDen;
	private String _tenDn;
	private String _diaChiDn;
	private String _dienThoaiDn;
	private String _soFaxDn;
	private String _emailDn;
	private String _webSiteDn;
	private String _soDkkd;
	private Date _ngayCapDkkd;
	private Date _ngayHetHanDkkd;
	private String _coQuanCapDkkd;
	private String _daiDienDn;
	private long _coQuanGiaiQuyet;
	private String _diaDiemLamHoSo;
	private long _phieuXuLyId;
	private String _maSoHoSo;
	private String _lyDoCapLai;
	private int _lanCapGiayDangKyKinhDoanh;
	private String _soGiayPhepKinhDoanhVanTaiNoiDia;
	private Date _ngayCapGPKDVTNoiDia;
	private Date _NgayGiaHanGPKDVTNoiDia;
	private Date _NgayHetHanGPKDVTNoiDia;
	private int _lanCapGPKDVTNoiDia;
	private Date _ngayGiaHanGiayDangKyKinhDoanh;
	private String _soGiayPhepKinhDoanhVanTaiQuocTe;
	private int _lanCapGPKDVTQuocTe;
	private Date _ngayCapGPKDVTQuocTe;
	private Date _ngayGiaHanGPKDVTQuocTe;
	private Date _ngayHetHanGPKDVTQuocTe;
	private String _nguoiLienHeTraKetQua;
	private String _soDienThoaiNguoiLienHe;
	private String _coQuanCapGPKDVTNoiDia;
	private String _nguoiNhanKetQua;
	private String _thongTinTraKetQua;
	private Date _ngayTraKetQua;
	private String _diaChiNguoiLienHeTraKetQua;
	private BaseModel<?> _qlvtThongTinHoSoRemoteModel;
}