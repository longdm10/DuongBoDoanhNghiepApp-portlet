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

package vn.dtt.duongbo.dao.noidia.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.noidia.service.ClpSerializer;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NoiPham
 */
public class QlvtXuLyGpkdvtBangOtoClp extends BaseModelImpl<QlvtXuLyGpkdvtBangOto>
	implements QlvtXuLyGpkdvtBangOto {
	public QlvtXuLyGpkdvtBangOtoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtXuLyGpkdvtBangOto.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtXuLyGpkdvtBangOto.class.getName();
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
		attributes.put("thongTinXuLyId", getThongTinXuLyId());
		attributes.put("loaiHinhCap", getLoaiHinhCap());
		attributes.put("soGpkdVanTaiBangOto", getSoGpkdVanTaiBangOto());
		attributes.put("ngayCapGpkdVanTaiBangOto", getNgayCapGpkdVanTaiBangOto());
		attributes.put("coQuanCapGpkdVanTaiBangOto",
			getCoQuanCapGpkdVanTaiBangOto());
		attributes.put("ngayHetHanGpkdVanTaiBangOto",
			getNgayHetHanGpkdVanTaiBangOto());
		attributes.put("nguoiTrucTiepDieuHanh", getNguoiTrucTiepDieuHanh());
		attributes.put("soCmtNguoiDieuHanh", getSoCmtNguoiDieuHanh());
		attributes.put("ngayCapNguoiDieuHanh", getNgayCapNguoiDieuHanh());
		attributes.put("noiCapNguoiDieuHanh", getNoiCapNguoiDieuHanh());
		attributes.put("bangCapNguoiDieuHanh", getBangCapNguoiDieuHanh());
		attributes.put("thoiGianBatDauDieuHanh", getThoiGianBatDauDieuHanh());
		attributes.put("thoiGianKetThucDieuHanh", getThoiGianKetThucDieuHanh());
		attributes.put("soGiayPhepNguoiDieuHanh", getSoGiayPhepNguoiDieuHanh());
		attributes.put("lanCapNguoiDieuHanh", getLanCapNguoiDieuHanh());
		attributes.put("ngayCapCcDieuHanh", getNgayCapCcDieuHanh());
		attributes.put("ngayHetHanCcDieuHanh", getNgayHetHanCcDieuHanh());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("ketQuaXuLyNguoiDieuHanh", getKetQuaXuLyNguoiDieuHanh());
		attributes.put("lyDoKhongDatNguoiDieuHanh",
			getLyDoKhongDatNguoiDieuHanh());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinXuLyId = (Integer)attributes.get("thongTinXuLyId");

		if (thongTinXuLyId != null) {
			setThongTinXuLyId(thongTinXuLyId);
		}

		String loaiHinhCap = (String)attributes.get("loaiHinhCap");

		if (loaiHinhCap != null) {
			setLoaiHinhCap(loaiHinhCap);
		}

		String soGpkdVanTaiBangOto = (String)attributes.get(
				"soGpkdVanTaiBangOto");

		if (soGpkdVanTaiBangOto != null) {
			setSoGpkdVanTaiBangOto(soGpkdVanTaiBangOto);
		}

		Date ngayCapGpkdVanTaiBangOto = (Date)attributes.get(
				"ngayCapGpkdVanTaiBangOto");

		if (ngayCapGpkdVanTaiBangOto != null) {
			setNgayCapGpkdVanTaiBangOto(ngayCapGpkdVanTaiBangOto);
		}

		String coQuanCapGpkdVanTaiBangOto = (String)attributes.get(
				"coQuanCapGpkdVanTaiBangOto");

		if (coQuanCapGpkdVanTaiBangOto != null) {
			setCoQuanCapGpkdVanTaiBangOto(coQuanCapGpkdVanTaiBangOto);
		}

		Date ngayHetHanGpkdVanTaiBangOto = (Date)attributes.get(
				"ngayHetHanGpkdVanTaiBangOto");

		if (ngayHetHanGpkdVanTaiBangOto != null) {
			setNgayHetHanGpkdVanTaiBangOto(ngayHetHanGpkdVanTaiBangOto);
		}

		String nguoiTrucTiepDieuHanh = (String)attributes.get(
				"nguoiTrucTiepDieuHanh");

		if (nguoiTrucTiepDieuHanh != null) {
			setNguoiTrucTiepDieuHanh(nguoiTrucTiepDieuHanh);
		}

		String soCmtNguoiDieuHanh = (String)attributes.get("soCmtNguoiDieuHanh");

		if (soCmtNguoiDieuHanh != null) {
			setSoCmtNguoiDieuHanh(soCmtNguoiDieuHanh);
		}

		Date ngayCapNguoiDieuHanh = (Date)attributes.get("ngayCapNguoiDieuHanh");

		if (ngayCapNguoiDieuHanh != null) {
			setNgayCapNguoiDieuHanh(ngayCapNguoiDieuHanh);
		}

		String noiCapNguoiDieuHanh = (String)attributes.get(
				"noiCapNguoiDieuHanh");

		if (noiCapNguoiDieuHanh != null) {
			setNoiCapNguoiDieuHanh(noiCapNguoiDieuHanh);
		}

		String bangCapNguoiDieuHanh = (String)attributes.get(
				"bangCapNguoiDieuHanh");

		if (bangCapNguoiDieuHanh != null) {
			setBangCapNguoiDieuHanh(bangCapNguoiDieuHanh);
		}

		Date thoiGianBatDauDieuHanh = (Date)attributes.get(
				"thoiGianBatDauDieuHanh");

		if (thoiGianBatDauDieuHanh != null) {
			setThoiGianBatDauDieuHanh(thoiGianBatDauDieuHanh);
		}

		Date thoiGianKetThucDieuHanh = (Date)attributes.get(
				"thoiGianKetThucDieuHanh");

		if (thoiGianKetThucDieuHanh != null) {
			setThoiGianKetThucDieuHanh(thoiGianKetThucDieuHanh);
		}

		String soGiayPhepNguoiDieuHanh = (String)attributes.get(
				"soGiayPhepNguoiDieuHanh");

		if (soGiayPhepNguoiDieuHanh != null) {
			setSoGiayPhepNguoiDieuHanh(soGiayPhepNguoiDieuHanh);
		}

		Integer lanCapNguoiDieuHanh = (Integer)attributes.get(
				"lanCapNguoiDieuHanh");

		if (lanCapNguoiDieuHanh != null) {
			setLanCapNguoiDieuHanh(lanCapNguoiDieuHanh);
		}

		Date ngayCapCcDieuHanh = (Date)attributes.get("ngayCapCcDieuHanh");

		if (ngayCapCcDieuHanh != null) {
			setNgayCapCcDieuHanh(ngayCapCcDieuHanh);
		}

		Date ngayHetHanCcDieuHanh = (Date)attributes.get("ngayHetHanCcDieuHanh");

		if (ngayHetHanCcDieuHanh != null) {
			setNgayHetHanCcDieuHanh(ngayHetHanCcDieuHanh);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		String ketQuaXuLyNguoiDieuHanh = (String)attributes.get(
				"ketQuaXuLyNguoiDieuHanh");

		if (ketQuaXuLyNguoiDieuHanh != null) {
			setKetQuaXuLyNguoiDieuHanh(ketQuaXuLyNguoiDieuHanh);
		}

		String lyDoKhongDatNguoiDieuHanh = (String)attributes.get(
				"lyDoKhongDatNguoiDieuHanh");

		if (lyDoKhongDatNguoiDieuHanh != null) {
			setLyDoKhongDatNguoiDieuHanh(lyDoKhongDatNguoiDieuHanh);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThongTinXuLyId() {
		return _thongTinXuLyId;
	}

	@Override
	public void setThongTinXuLyId(int thongTinXuLyId) {
		_thongTinXuLyId = thongTinXuLyId;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXuLyId", int.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel, thongTinXuLyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiHinhCap() {
		return _loaiHinhCap;
	}

	@Override
	public void setLoaiHinhCap(String loaiHinhCap) {
		_loaiHinhCap = loaiHinhCap;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhCap", String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel, loaiHinhCap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGpkdVanTaiBangOto() {
		return _soGpkdVanTaiBangOto;
	}

	@Override
	public void setSoGpkdVanTaiBangOto(String soGpkdVanTaiBangOto) {
		_soGpkdVanTaiBangOto = soGpkdVanTaiBangOto;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGpkdVanTaiBangOto",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					soGpkdVanTaiBangOto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapGpkdVanTaiBangOto() {
		return _ngayCapGpkdVanTaiBangOto;
	}

	@Override
	public void setNgayCapGpkdVanTaiBangOto(Date ngayCapGpkdVanTaiBangOto) {
		_ngayCapGpkdVanTaiBangOto = ngayCapGpkdVanTaiBangOto;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGpkdVanTaiBangOto",
						Date.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					ngayCapGpkdVanTaiBangOto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoQuanCapGpkdVanTaiBangOto() {
		return _coQuanCapGpkdVanTaiBangOto;
	}

	@Override
	public void setCoQuanCapGpkdVanTaiBangOto(String coQuanCapGpkdVanTaiBangOto) {
		_coQuanCapGpkdVanTaiBangOto = coQuanCapGpkdVanTaiBangOto;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanCapGpkdVanTaiBangOto",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					coQuanCapGpkdVanTaiBangOto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanGpkdVanTaiBangOto() {
		return _ngayHetHanGpkdVanTaiBangOto;
	}

	@Override
	public void setNgayHetHanGpkdVanTaiBangOto(Date ngayHetHanGpkdVanTaiBangOto) {
		_ngayHetHanGpkdVanTaiBangOto = ngayHetHanGpkdVanTaiBangOto;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanGpkdVanTaiBangOto",
						Date.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					ngayHetHanGpkdVanTaiBangOto);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiTrucTiepDieuHanh() {
		return _nguoiTrucTiepDieuHanh;
	}

	@Override
	public void setNguoiTrucTiepDieuHanh(String nguoiTrucTiepDieuHanh) {
		_nguoiTrucTiepDieuHanh = nguoiTrucTiepDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTrucTiepDieuHanh",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					nguoiTrucTiepDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoCmtNguoiDieuHanh() {
		return _soCmtNguoiDieuHanh;
	}

	@Override
	public void setSoCmtNguoiDieuHanh(String soCmtNguoiDieuHanh) {
		_soCmtNguoiDieuHanh = soCmtNguoiDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoCmtNguoiDieuHanh",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					soCmtNguoiDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapNguoiDieuHanh() {
		return _ngayCapNguoiDieuHanh;
	}

	@Override
	public void setNgayCapNguoiDieuHanh(Date ngayCapNguoiDieuHanh) {
		_ngayCapNguoiDieuHanh = ngayCapNguoiDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapNguoiDieuHanh",
						Date.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					ngayCapNguoiDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiCapNguoiDieuHanh() {
		return _noiCapNguoiDieuHanh;
	}

	@Override
	public void setNoiCapNguoiDieuHanh(String noiCapNguoiDieuHanh) {
		_noiCapNguoiDieuHanh = noiCapNguoiDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiCapNguoiDieuHanh",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					noiCapNguoiDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBangCapNguoiDieuHanh() {
		return _bangCapNguoiDieuHanh;
	}

	@Override
	public void setBangCapNguoiDieuHanh(String bangCapNguoiDieuHanh) {
		_bangCapNguoiDieuHanh = bangCapNguoiDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setBangCapNguoiDieuHanh",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					bangCapNguoiDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianBatDauDieuHanh() {
		return _thoiGianBatDauDieuHanh;
	}

	@Override
	public void setThoiGianBatDauDieuHanh(Date thoiGianBatDauDieuHanh) {
		_thoiGianBatDauDieuHanh = thoiGianBatDauDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianBatDauDieuHanh",
						Date.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					thoiGianBatDauDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianKetThucDieuHanh() {
		return _thoiGianKetThucDieuHanh;
	}

	@Override
	public void setThoiGianKetThucDieuHanh(Date thoiGianKetThucDieuHanh) {
		_thoiGianKetThucDieuHanh = thoiGianKetThucDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianKetThucDieuHanh",
						Date.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					thoiGianKetThucDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoGiayPhepNguoiDieuHanh() {
		return _soGiayPhepNguoiDieuHanh;
	}

	@Override
	public void setSoGiayPhepNguoiDieuHanh(String soGiayPhepNguoiDieuHanh) {
		_soGiayPhepNguoiDieuHanh = soGiayPhepNguoiDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGiayPhepNguoiDieuHanh",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					soGiayPhepNguoiDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLanCapNguoiDieuHanh() {
		return _lanCapNguoiDieuHanh;
	}

	@Override
	public void setLanCapNguoiDieuHanh(int lanCapNguoiDieuHanh) {
		_lanCapNguoiDieuHanh = lanCapNguoiDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setLanCapNguoiDieuHanh",
						int.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					lanCapNguoiDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapCcDieuHanh() {
		return _ngayCapCcDieuHanh;
	}

	@Override
	public void setNgayCapCcDieuHanh(Date ngayCapCcDieuHanh) {
		_ngayCapCcDieuHanh = ngayCapCcDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapCcDieuHanh",
						Date.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					ngayCapCcDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanCcDieuHanh() {
		return _ngayHetHanCcDieuHanh;
	}

	@Override
	public void setNgayHetHanCcDieuHanh(Date ngayHetHanCcDieuHanh) {
		_ngayHetHanCcDieuHanh = ngayHetHanCcDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanCcDieuHanh",
						Date.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					ngayHetHanCcDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	@Override
	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel, ketQuaXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoKhongDat() {
		return _lyDoKhongDat;
	}

	@Override
	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDat", String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel, lyDoKhongDat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKetQuaXuLyNguoiDieuHanh() {
		return _ketQuaXuLyNguoiDieuHanh;
	}

	@Override
	public void setKetQuaXuLyNguoiDieuHanh(String ketQuaXuLyNguoiDieuHanh) {
		_ketQuaXuLyNguoiDieuHanh = ketQuaXuLyNguoiDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLyNguoiDieuHanh",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					ketQuaXuLyNguoiDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoKhongDatNguoiDieuHanh() {
		return _lyDoKhongDatNguoiDieuHanh;
	}

	@Override
	public void setLyDoKhongDatNguoiDieuHanh(String lyDoKhongDatNguoiDieuHanh) {
		_lyDoKhongDatNguoiDieuHanh = lyDoKhongDatNguoiDieuHanh;

		if (_qlvtXuLyGpkdvtBangOtoRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDatNguoiDieuHanh",
						String.class);

				method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
					lyDoKhongDatNguoiDieuHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtXuLyGpkdvtBangOtoRemoteModel() {
		return _qlvtXuLyGpkdvtBangOtoRemoteModel;
	}

	public void setQlvtXuLyGpkdvtBangOtoRemoteModel(
		BaseModel<?> qlvtXuLyGpkdvtBangOtoRemoteModel) {
		_qlvtXuLyGpkdvtBangOtoRemoteModel = qlvtXuLyGpkdvtBangOtoRemoteModel;
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

		Class<?> remoteModelClass = _qlvtXuLyGpkdvtBangOtoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qlvtXuLyGpkdvtBangOtoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtXuLyGpkdvtBangOtoLocalServiceUtil.addQlvtXuLyGpkdvtBangOto(this);
		}
		else {
			QlvtXuLyGpkdvtBangOtoLocalServiceUtil.updateQlvtXuLyGpkdvtBangOto(this);
		}
	}

	@Override
	public QlvtXuLyGpkdvtBangOto toEscapedModel() {
		return (QlvtXuLyGpkdvtBangOto)ProxyUtil.newProxyInstance(QlvtXuLyGpkdvtBangOto.class.getClassLoader(),
			new Class[] { QlvtXuLyGpkdvtBangOto.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtXuLyGpkdvtBangOtoClp clone = new QlvtXuLyGpkdvtBangOtoClp();

		clone.setId(getId());
		clone.setThongTinXuLyId(getThongTinXuLyId());
		clone.setLoaiHinhCap(getLoaiHinhCap());
		clone.setSoGpkdVanTaiBangOto(getSoGpkdVanTaiBangOto());
		clone.setNgayCapGpkdVanTaiBangOto(getNgayCapGpkdVanTaiBangOto());
		clone.setCoQuanCapGpkdVanTaiBangOto(getCoQuanCapGpkdVanTaiBangOto());
		clone.setNgayHetHanGpkdVanTaiBangOto(getNgayHetHanGpkdVanTaiBangOto());
		clone.setNguoiTrucTiepDieuHanh(getNguoiTrucTiepDieuHanh());
		clone.setSoCmtNguoiDieuHanh(getSoCmtNguoiDieuHanh());
		clone.setNgayCapNguoiDieuHanh(getNgayCapNguoiDieuHanh());
		clone.setNoiCapNguoiDieuHanh(getNoiCapNguoiDieuHanh());
		clone.setBangCapNguoiDieuHanh(getBangCapNguoiDieuHanh());
		clone.setThoiGianBatDauDieuHanh(getThoiGianBatDauDieuHanh());
		clone.setThoiGianKetThucDieuHanh(getThoiGianKetThucDieuHanh());
		clone.setSoGiayPhepNguoiDieuHanh(getSoGiayPhepNguoiDieuHanh());
		clone.setLanCapNguoiDieuHanh(getLanCapNguoiDieuHanh());
		clone.setNgayCapCcDieuHanh(getNgayCapCcDieuHanh());
		clone.setNgayHetHanCcDieuHanh(getNgayHetHanCcDieuHanh());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setLyDoKhongDat(getLyDoKhongDat());
		clone.setKetQuaXuLyNguoiDieuHanh(getKetQuaXuLyNguoiDieuHanh());
		clone.setLyDoKhongDatNguoiDieuHanh(getLyDoKhongDatNguoiDieuHanh());

		return clone;
	}

	@Override
	public int compareTo(QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) {
		int value = 0;

		if (getId() < qlvtXuLyGpkdvtBangOto.getId()) {
			value = -1;
		}
		else if (getId() > qlvtXuLyGpkdvtBangOto.getId()) {
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

		if (!(obj instanceof QlvtXuLyGpkdvtBangOtoClp)) {
			return false;
		}

		QlvtXuLyGpkdvtBangOtoClp qlvtXuLyGpkdvtBangOto = (QlvtXuLyGpkdvtBangOtoClp)obj;

		long primaryKey = qlvtXuLyGpkdvtBangOto.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongTinXuLyId=");
		sb.append(getThongTinXuLyId());
		sb.append(", loaiHinhCap=");
		sb.append(getLoaiHinhCap());
		sb.append(", soGpkdVanTaiBangOto=");
		sb.append(getSoGpkdVanTaiBangOto());
		sb.append(", ngayCapGpkdVanTaiBangOto=");
		sb.append(getNgayCapGpkdVanTaiBangOto());
		sb.append(", coQuanCapGpkdVanTaiBangOto=");
		sb.append(getCoQuanCapGpkdVanTaiBangOto());
		sb.append(", ngayHetHanGpkdVanTaiBangOto=");
		sb.append(getNgayHetHanGpkdVanTaiBangOto());
		sb.append(", nguoiTrucTiepDieuHanh=");
		sb.append(getNguoiTrucTiepDieuHanh());
		sb.append(", soCmtNguoiDieuHanh=");
		sb.append(getSoCmtNguoiDieuHanh());
		sb.append(", ngayCapNguoiDieuHanh=");
		sb.append(getNgayCapNguoiDieuHanh());
		sb.append(", noiCapNguoiDieuHanh=");
		sb.append(getNoiCapNguoiDieuHanh());
		sb.append(", bangCapNguoiDieuHanh=");
		sb.append(getBangCapNguoiDieuHanh());
		sb.append(", thoiGianBatDauDieuHanh=");
		sb.append(getThoiGianBatDauDieuHanh());
		sb.append(", thoiGianKetThucDieuHanh=");
		sb.append(getThoiGianKetThucDieuHanh());
		sb.append(", soGiayPhepNguoiDieuHanh=");
		sb.append(getSoGiayPhepNguoiDieuHanh());
		sb.append(", lanCapNguoiDieuHanh=");
		sb.append(getLanCapNguoiDieuHanh());
		sb.append(", ngayCapCcDieuHanh=");
		sb.append(getNgayCapCcDieuHanh());
		sb.append(", ngayHetHanCcDieuHanh=");
		sb.append(getNgayHetHanCcDieuHanh());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append(", ketQuaXuLyNguoiDieuHanh=");
		sb.append(getKetQuaXuLyNguoiDieuHanh());
		sb.append(", lyDoKhongDatNguoiDieuHanh=");
		sb.append(getLyDoKhongDatNguoiDieuHanh());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXuLyId</column-name><column-value><![CDATA[");
		sb.append(getThongTinXuLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiHinhCap</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhCap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGpkdVanTaiBangOto</column-name><column-value><![CDATA[");
		sb.append(getSoGpkdVanTaiBangOto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapGpkdVanTaiBangOto</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGpkdVanTaiBangOto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanCapGpkdVanTaiBangOto</column-name><column-value><![CDATA[");
		sb.append(getCoQuanCapGpkdVanTaiBangOto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHanGpkdVanTaiBangOto</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanGpkdVanTaiBangOto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTrucTiepDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getNguoiTrucTiepDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soCmtNguoiDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getSoCmtNguoiDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapNguoiDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getNgayCapNguoiDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiCapNguoiDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getNoiCapNguoiDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bangCapNguoiDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getBangCapNguoiDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianBatDauDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getThoiGianBatDauDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianKetThucDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getThoiGianKetThucDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGiayPhepNguoiDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getSoGiayPhepNguoiDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanCapNguoiDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getLanCapNguoiDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapCcDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getNgayCapCcDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHanCcDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanCcDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLy</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLyNguoiDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLyNguoiDieuHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDatNguoiDieuHanh</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDatNguoiDieuHanh());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _thongTinXuLyId;
	private String _loaiHinhCap;
	private String _soGpkdVanTaiBangOto;
	private Date _ngayCapGpkdVanTaiBangOto;
	private String _coQuanCapGpkdVanTaiBangOto;
	private Date _ngayHetHanGpkdVanTaiBangOto;
	private String _nguoiTrucTiepDieuHanh;
	private String _soCmtNguoiDieuHanh;
	private Date _ngayCapNguoiDieuHanh;
	private String _noiCapNguoiDieuHanh;
	private String _bangCapNguoiDieuHanh;
	private Date _thoiGianBatDauDieuHanh;
	private Date _thoiGianKetThucDieuHanh;
	private String _soGiayPhepNguoiDieuHanh;
	private int _lanCapNguoiDieuHanh;
	private Date _ngayCapCcDieuHanh;
	private Date _ngayHetHanCcDieuHanh;
	private String _ketQuaXuLy;
	private String _lyDoKhongDat;
	private String _ketQuaXuLyNguoiDieuHanh;
	private String _lyDoKhongDatNguoiDieuHanh;
	private BaseModel<?> _qlvtXuLyGpkdvtBangOtoRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.noidia.service.ClpSerializer.class;
}