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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.common.service.ClpSerializer;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcHoSoThuTucClp extends BaseModelImpl<TthcHoSoThuTuc>
	implements TthcHoSoThuTuc {
	public TthcHoSoThuTucClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcHoSoThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return TthcHoSoThuTuc.class.getName();
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
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("maBienNhan", getMaBienNhan());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("loaiChuHoSo", getLoaiChuHoSo());
		attributes.put("maSoChuHoSo", getMaSoChuHoSo());
		attributes.put("tenChuHoSo", getTenChuHoSo());
		attributes.put("diaChiChuHoSo", getDiaChiChuHoSo());
		attributes.put("maDonVi", getMaDonVi());
		attributes.put("nguonGocHoSo", getNguonGocHoSo());
		attributes.put("trichYeuNoiDung", getTrichYeuNoiDung());
		attributes.put("ngayGuiHoSo", getNgayGuiHoSo());
		attributes.put("ngayTiepNhan", getNgayTiepNhan());
		attributes.put("ngayBoSung", getNgayBoSung());
		attributes.put("ngayHenTra", getNgayHenTra());
		attributes.put("ngayTraKetQua", getNgayTraKetQua());
		attributes.put("ngayDongHoSo", getNgayDongHoSo());
		attributes.put("trangThaiHoSo", getTrangThaiHoSo());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("maTinhThanh", getMaTinhThanh());
		attributes.put("maQuanHuyen", getMaQuanHuyen());
		attributes.put("maPhuongXa", getMaPhuongXa());
		attributes.put("thongBaoXuLy", getThongBaoXuLy());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("nguoiLamThuTucId", getNguoiLamThuTucId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maSoHoSo = (String)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		String maBienNhan = (String)attributes.get("maBienNhan");

		if (maBienNhan != null) {
			setMaBienNhan(maBienNhan);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		Long loaiChuHoSo = (Long)attributes.get("loaiChuHoSo");

		if (loaiChuHoSo != null) {
			setLoaiChuHoSo(loaiChuHoSo);
		}

		String maSoChuHoSo = (String)attributes.get("maSoChuHoSo");

		if (maSoChuHoSo != null) {
			setMaSoChuHoSo(maSoChuHoSo);
		}

		String tenChuHoSo = (String)attributes.get("tenChuHoSo");

		if (tenChuHoSo != null) {
			setTenChuHoSo(tenChuHoSo);
		}

		String diaChiChuHoSo = (String)attributes.get("diaChiChuHoSo");

		if (diaChiChuHoSo != null) {
			setDiaChiChuHoSo(diaChiChuHoSo);
		}

		String maDonVi = (String)attributes.get("maDonVi");

		if (maDonVi != null) {
			setMaDonVi(maDonVi);
		}

		String nguonGocHoSo = (String)attributes.get("nguonGocHoSo");

		if (nguonGocHoSo != null) {
			setNguonGocHoSo(nguonGocHoSo);
		}

		String trichYeuNoiDung = (String)attributes.get("trichYeuNoiDung");

		if (trichYeuNoiDung != null) {
			setTrichYeuNoiDung(trichYeuNoiDung);
		}

		Date ngayGuiHoSo = (Date)attributes.get("ngayGuiHoSo");

		if (ngayGuiHoSo != null) {
			setNgayGuiHoSo(ngayGuiHoSo);
		}

		Date ngayTiepNhan = (Date)attributes.get("ngayTiepNhan");

		if (ngayTiepNhan != null) {
			setNgayTiepNhan(ngayTiepNhan);
		}

		Date ngayBoSung = (Date)attributes.get("ngayBoSung");

		if (ngayBoSung != null) {
			setNgayBoSung(ngayBoSung);
		}

		Date ngayHenTra = (Date)attributes.get("ngayHenTra");

		if (ngayHenTra != null) {
			setNgayHenTra(ngayHenTra);
		}

		Date ngayTraKetQua = (Date)attributes.get("ngayTraKetQua");

		if (ngayTraKetQua != null) {
			setNgayTraKetQua(ngayTraKetQua);
		}

		Date ngayDongHoSo = (Date)attributes.get("ngayDongHoSo");

		if (ngayDongHoSo != null) {
			setNgayDongHoSo(ngayDongHoSo);
		}

		String trangThaiHoSo = (String)attributes.get("trangThaiHoSo");

		if (trangThaiHoSo != null) {
			setTrangThaiHoSo(trangThaiHoSo);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		String maTinhThanh = (String)attributes.get("maTinhThanh");

		if (maTinhThanh != null) {
			setMaTinhThanh(maTinhThanh);
		}

		String maQuanHuyen = (String)attributes.get("maQuanHuyen");

		if (maQuanHuyen != null) {
			setMaQuanHuyen(maQuanHuyen);
		}

		String maPhuongXa = (String)attributes.get("maPhuongXa");

		if (maPhuongXa != null) {
			setMaPhuongXa(maPhuongXa);
		}

		String thongBaoXuLy = (String)attributes.get("thongBaoXuLy");

		if (thongBaoXuLy != null) {
			setThongBaoXuLy(thongBaoXuLy);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long nguoiLamThuTucId = (Long)attributes.get("nguoiLamThuTucId");

		if (nguoiLamThuTucId != null) {
			setNguoiLamThuTucId(nguoiLamThuTucId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, id);
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

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, maSoHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaBienNhan() {
		return _maBienNhan;
	}

	@Override
	public void setMaBienNhan(String maBienNhan) {
		_maBienNhan = maBienNhan;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBienNhan", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, maBienNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, thuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiChuHoSo() {
		return _loaiChuHoSo;
	}

	@Override
	public void setLoaiChuHoSo(long loaiChuHoSo) {
		_loaiChuHoSo = loaiChuHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiChuHoSo", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, loaiChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoChuHoSo() {
		return _maSoChuHoSo;
	}

	@Override
	public void setMaSoChuHoSo(String maSoChuHoSo) {
		_maSoChuHoSo = maSoChuHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoChuHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, maSoChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenChuHoSo() {
		return _tenChuHoSo;
	}

	@Override
	public void setTenChuHoSo(String tenChuHoSo) {
		_tenChuHoSo = tenChuHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, tenChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiChuHoSo() {
		return _diaChiChuHoSo;
	}

	@Override
	public void setDiaChiChuHoSo(String diaChiChuHoSo) {
		_diaChiChuHoSo = diaChiChuHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiChuHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, diaChiChuHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaDonVi() {
		return _maDonVi;
	}

	@Override
	public void setMaDonVi(String maDonVi) {
		_maDonVi = maDonVi;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaDonVi", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, maDonVi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguonGocHoSo() {
		return _nguonGocHoSo;
	}

	@Override
	public void setNguonGocHoSo(String nguonGocHoSo) {
		_nguonGocHoSo = nguonGocHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNguonGocHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, nguonGocHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrichYeuNoiDung() {
		return _trichYeuNoiDung;
	}

	@Override
	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTrichYeuNoiDung",
						String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, trichYeuNoiDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGuiHoSo() {
		return _ngayGuiHoSo;
	}

	@Override
	public void setNgayGuiHoSo(Date ngayGuiHoSo) {
		_ngayGuiHoSo = ngayGuiHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGuiHoSo", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ngayGuiHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTiepNhan() {
		return _ngayTiepNhan;
	}

	@Override
	public void setNgayTiepNhan(Date ngayTiepNhan) {
		_ngayTiepNhan = ngayTiepNhan;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTiepNhan", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ngayTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayBoSung() {
		return _ngayBoSung;
	}

	@Override
	public void setNgayBoSung(Date ngayBoSung) {
		_ngayBoSung = ngayBoSung;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayBoSung", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ngayBoSung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHenTra() {
		return _ngayHenTra;
	}

	@Override
	public void setNgayHenTra(Date ngayHenTra) {
		_ngayHenTra = ngayHenTra;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHenTra", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ngayHenTra);
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

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTraKetQua", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ngayTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDongHoSo() {
		return _ngayDongHoSo;
	}

	@Override
	public void setNgayDongHoSo(Date ngayDongHoSo) {
		_ngayDongHoSo = ngayDongHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDongHoSo", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ngayDongHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThaiHoSo() {
		return _trangThaiHoSo;
	}

	@Override
	public void setTrangThaiHoSo(String trangThaiHoSo) {
		_trangThaiHoSo = trangThaiHoSo;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiHoSo", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, trangThaiHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setPhanNhomHoSoId", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, phanNhomHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTinhThanh() {
		return _maTinhThanh;
	}

	@Override
	public void setMaTinhThanh(String maTinhThanh) {
		_maTinhThanh = maTinhThanh;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinhThanh", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, maTinhThanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaQuanHuyen() {
		return _maQuanHuyen;
	}

	@Override
	public void setMaQuanHuyen(String maQuanHuyen) {
		_maQuanHuyen = maQuanHuyen;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaQuanHuyen", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, maQuanHuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaPhuongXa() {
		return _maPhuongXa;
	}

	@Override
	public void setMaPhuongXa(String maPhuongXa) {
		_maPhuongXa = maPhuongXa;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaPhuongXa", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, maPhuongXa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThongBaoXuLy() {
		return _thongBaoXuLy;
	}

	@Override
	public void setThongBaoXuLy(String thongBaoXuLy) {
		_thongBaoXuLy = thongBaoXuLy;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setThongBaoXuLy", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, thongBaoXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucQuanLy", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, toChucQuanLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTao() {
		return _ngayTao;
	}

	@Override
	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ngayTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiTao() {
		return _nguoiTao;
	}

	@Override
	public void setNguoiTao(long nguoiTao) {
		_nguoiTao = nguoiTao;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTao", long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, nguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhiChu() {
		return _ghiChu;
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiLamThuTucId() {
		return _nguoiLamThuTucId;
	}

	@Override
	public void setNguoiLamThuTucId(long nguoiLamThuTucId) {
		_nguoiLamThuTucId = nguoiLamThuTucId;

		if (_tthcHoSoThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcHoSoThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiLamThuTucId",
						long.class);

				method.invoke(_tthcHoSoThuTucRemoteModel, nguoiLamThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcHoSoThuTucRemoteModel() {
		return _tthcHoSoThuTucRemoteModel;
	}

	public void setTthcHoSoThuTucRemoteModel(
		BaseModel<?> tthcHoSoThuTucRemoteModel) {
		_tthcHoSoThuTucRemoteModel = tthcHoSoThuTucRemoteModel;
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

		Class<?> remoteModelClass = _tthcHoSoThuTucRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcHoSoThuTucRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcHoSoThuTucLocalServiceUtil.addTthcHoSoThuTuc(this);
		}
		else {
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(this);
		}
	}

	@Override
	public TthcHoSoThuTuc toEscapedModel() {
		return (TthcHoSoThuTuc)ProxyUtil.newProxyInstance(TthcHoSoThuTuc.class.getClassLoader(),
			new Class[] { TthcHoSoThuTuc.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcHoSoThuTucClp clone = new TthcHoSoThuTucClp();

		clone.setId(getId());
		clone.setMaSoHoSo(getMaSoHoSo());
		clone.setMaBienNhan(getMaBienNhan());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setLoaiChuHoSo(getLoaiChuHoSo());
		clone.setMaSoChuHoSo(getMaSoChuHoSo());
		clone.setTenChuHoSo(getTenChuHoSo());
		clone.setDiaChiChuHoSo(getDiaChiChuHoSo());
		clone.setMaDonVi(getMaDonVi());
		clone.setNguonGocHoSo(getNguonGocHoSo());
		clone.setTrichYeuNoiDung(getTrichYeuNoiDung());
		clone.setNgayGuiHoSo(getNgayGuiHoSo());
		clone.setNgayTiepNhan(getNgayTiepNhan());
		clone.setNgayBoSung(getNgayBoSung());
		clone.setNgayHenTra(getNgayHenTra());
		clone.setNgayTraKetQua(getNgayTraKetQua());
		clone.setNgayDongHoSo(getNgayDongHoSo());
		clone.setTrangThaiHoSo(getTrangThaiHoSo());
		clone.setPhanNhomHoSoId(getPhanNhomHoSoId());
		clone.setMaTinhThanh(getMaTinhThanh());
		clone.setMaQuanHuyen(getMaQuanHuyen());
		clone.setMaPhuongXa(getMaPhuongXa());
		clone.setThongBaoXuLy(getThongBaoXuLy());
		clone.setToChucQuanLy(getToChucQuanLy());
		clone.setNgayTao(getNgayTao());
		clone.setNguoiTao(getNguoiTao());
		clone.setGhiChu(getGhiChu());
		clone.setNguoiLamThuTucId(getNguoiLamThuTucId());

		return clone;
	}

	@Override
	public int compareTo(TthcHoSoThuTuc tthcHoSoThuTuc) {
		int value = 0;

		if (getId() < tthcHoSoThuTuc.getId()) {
			value = -1;
		}
		else if (getId() > tthcHoSoThuTuc.getId()) {
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

		if (!(obj instanceof TthcHoSoThuTucClp)) {
			return false;
		}

		TthcHoSoThuTucClp tthcHoSoThuTuc = (TthcHoSoThuTucClp)obj;

		long primaryKey = tthcHoSoThuTuc.getPrimaryKey();

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
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maSoHoSo=");
		sb.append(getMaSoHoSo());
		sb.append(", maBienNhan=");
		sb.append(getMaBienNhan());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", loaiChuHoSo=");
		sb.append(getLoaiChuHoSo());
		sb.append(", maSoChuHoSo=");
		sb.append(getMaSoChuHoSo());
		sb.append(", tenChuHoSo=");
		sb.append(getTenChuHoSo());
		sb.append(", diaChiChuHoSo=");
		sb.append(getDiaChiChuHoSo());
		sb.append(", maDonVi=");
		sb.append(getMaDonVi());
		sb.append(", nguonGocHoSo=");
		sb.append(getNguonGocHoSo());
		sb.append(", trichYeuNoiDung=");
		sb.append(getTrichYeuNoiDung());
		sb.append(", ngayGuiHoSo=");
		sb.append(getNgayGuiHoSo());
		sb.append(", ngayTiepNhan=");
		sb.append(getNgayTiepNhan());
		sb.append(", ngayBoSung=");
		sb.append(getNgayBoSung());
		sb.append(", ngayHenTra=");
		sb.append(getNgayHenTra());
		sb.append(", ngayTraKetQua=");
		sb.append(getNgayTraKetQua());
		sb.append(", ngayDongHoSo=");
		sb.append(getNgayDongHoSo());
		sb.append(", trangThaiHoSo=");
		sb.append(getTrangThaiHoSo());
		sb.append(", phanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append(", maTinhThanh=");
		sb.append(getMaTinhThanh());
		sb.append(", maQuanHuyen=");
		sb.append(getMaQuanHuyen());
		sb.append(", maPhuongXa=");
		sb.append(getMaPhuongXa());
		sb.append(", thongBaoXuLy=");
		sb.append(getThongBaoXuLy());
		sb.append(", toChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", nguoiLamThuTucId=");
		sb.append(getNguoiLamThuTucId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaSoHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maBienNhan</column-name><column-value><![CDATA[");
		sb.append(getMaBienNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getLoaiChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaSoChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getTenChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiChuHoSo</column-name><column-value><![CDATA[");
		sb.append(getDiaChiChuHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maDonVi</column-name><column-value><![CDATA[");
		sb.append(getMaDonVi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguonGocHoSo</column-name><column-value><![CDATA[");
		sb.append(getNguonGocHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trichYeuNoiDung</column-name><column-value><![CDATA[");
		sb.append(getTrichYeuNoiDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayGuiHoSo</column-name><column-value><![CDATA[");
		sb.append(getNgayGuiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTiepNhan</column-name><column-value><![CDATA[");
		sb.append(getNgayTiepNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayBoSung</column-name><column-value><![CDATA[");
		sb.append(getNgayBoSung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHenTra</column-name><column-value><![CDATA[");
		sb.append(getNgayHenTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getNgayTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDongHoSo</column-name><column-value><![CDATA[");
		sb.append(getNgayDongHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiHoSo</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTinhThanh</column-name><column-value><![CDATA[");
		sb.append(getMaTinhThanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maQuanHuyen</column-name><column-value><![CDATA[");
		sb.append(getMaQuanHuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maPhuongXa</column-name><column-value><![CDATA[");
		sb.append(getMaPhuongXa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongBaoXuLy</column-name><column-value><![CDATA[");
		sb.append(getThongBaoXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiLamThuTucId</column-name><column-value><![CDATA[");
		sb.append(getNguoiLamThuTucId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private long _loaiChuHoSo;
	private String _maSoChuHoSo;
	private String _tenChuHoSo;
	private String _diaChiChuHoSo;
	private String _maDonVi;
	private String _nguonGocHoSo;
	private String _trichYeuNoiDung;
	private Date _ngayGuiHoSo;
	private Date _ngayTiepNhan;
	private Date _ngayBoSung;
	private Date _ngayHenTra;
	private Date _ngayTraKetQua;
	private Date _ngayDongHoSo;
	private String _trangThaiHoSo;
	private long _phanNhomHoSoId;
	private String _maTinhThanh;
	private String _maQuanHuyen;
	private String _maPhuongXa;
	private String _thongBaoXuLy;
	private long _toChucQuanLy;
	private Date _ngayTao;
	private long _nguoiTao;
	private String _ghiChu;
	private long _nguoiLamThuTucId;
	private BaseModel<?> _tthcHoSoThuTucRemoteModel;
}