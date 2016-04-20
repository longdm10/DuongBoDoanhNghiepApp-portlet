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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTucModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TthcHoSoThuTuc service. Represents a row in the &quot;tthc_hosothutuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.common.model.TthcHoSoThuTucModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TthcHoSoThuTucImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcHoSoThuTucImpl
 * @see vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc
 * @see vn.dtt.duongbo.dao.common.model.TthcHoSoThuTucModel
 * @generated
 */
public class TthcHoSoThuTucModelImpl extends BaseModelImpl<TthcHoSoThuTuc>
	implements TthcHoSoThuTucModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tthc ho so thu tuc model instance should use the {@link vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc} interface instead.
	 */
	public static final String TABLE_NAME = "tthc_hosothutuc";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "masohoso", Types.VARCHAR },
			{ "mabiennhan", Types.VARCHAR },
			{ "thutuchanhchinhid", Types.BIGINT },
			{ "loaichuhoso", Types.BIGINT },
			{ "masochuhoso", Types.VARCHAR },
			{ "tenchuhoso", Types.VARCHAR },
			{ "diachichuhoso", Types.VARCHAR },
			{ "madonvi", Types.VARCHAR },
			{ "nguongochoso", Types.VARCHAR },
			{ "trichyeunoidung", Types.VARCHAR },
			{ "ngayguihoso", Types.TIMESTAMP },
			{ "ngaytiepnhan", Types.TIMESTAMP },
			{ "ngaybosung", Types.TIMESTAMP },
			{ "ngayhentra", Types.TIMESTAMP },
			{ "ngaytraketqua", Types.TIMESTAMP },
			{ "ngaydonghoso", Types.TIMESTAMP },
			{ "trangthaihoso", Types.VARCHAR },
			{ "phannhomhosoid", Types.BIGINT },
			{ "matinhthanh", Types.VARCHAR },
			{ "maquanhuyen", Types.VARCHAR },
			{ "maphuongxa", Types.VARCHAR },
			{ "thongbaoxuly", Types.VARCHAR },
			{ "tochucquanly", Types.BIGINT },
			{ "ngaytao", Types.TIMESTAMP },
			{ "nguoitao", Types.BIGINT },
			{ "ghichu", Types.VARCHAR },
			{ "nguoiLamThuTucid", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tthc_hosothutuc (id LONG not null primary key,masohoso VARCHAR(75) null,mabiennhan VARCHAR(75) null,thutuchanhchinhid LONG,loaichuhoso LONG,masochuhoso VARCHAR(75) null,tenchuhoso VARCHAR(75) null,diachichuhoso VARCHAR(75) null,madonvi VARCHAR(75) null,nguongochoso VARCHAR(75) null,trichyeunoidung VARCHAR(75) null,ngayguihoso DATE null,ngaytiepnhan DATE null,ngaybosung DATE null,ngayhentra DATE null,ngaytraketqua DATE null,ngaydonghoso DATE null,trangthaihoso VARCHAR(75) null,phannhomhosoid LONG,matinhthanh VARCHAR(75) null,maquanhuyen VARCHAR(75) null,maphuongxa VARCHAR(75) null,thongbaoxuly VARCHAR(75) null,tochucquanly LONG,ngaytao DATE null,nguoitao LONG,ghichu VARCHAR(75) null,nguoiLamThuTucid LONG)";
	public static final String TABLE_SQL_DROP = "drop table tthc_hosothutuc";
	public static final String ORDER_BY_JPQL = " ORDER BY tthcHoSoThuTuc.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tthc_hosothutuc.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"),
			true);
	public static long MASOHOSO_COLUMN_BITMASK = 1L;
	public static long NGUOILAMTHUTUCID_COLUMN_BITMASK = 2L;
	public static long NGUOITAO_COLUMN_BITMASK = 4L;
	public static long THUTUCHANHCHINHID_COLUMN_BITMASK = 8L;
	public static long ID_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"));

	public TthcHoSoThuTucModelImpl() {
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
	public Class<?> getModelClass() {
		return TthcHoSoThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return TthcHoSoThuTuc.class.getName();
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
		_columnBitmask = -1L;

		_id = id;
	}

	@Override
	public String getMaSoHoSo() {
		if (_maSoHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _maSoHoSo;
		}
	}

	@Override
	public void setMaSoHoSo(String maSoHoSo) {
		_columnBitmask |= MASOHOSO_COLUMN_BITMASK;

		if (_originalMaSoHoSo == null) {
			_originalMaSoHoSo = _maSoHoSo;
		}

		_maSoHoSo = maSoHoSo;
	}

	public String getOriginalMaSoHoSo() {
		return GetterUtil.getString(_originalMaSoHoSo);
	}

	@Override
	public String getMaBienNhan() {
		if (_maBienNhan == null) {
			return StringPool.BLANK;
		}
		else {
			return _maBienNhan;
		}
	}

	@Override
	public void setMaBienNhan(String maBienNhan) {
		_maBienNhan = maBienNhan;
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_columnBitmask |= THUTUCHANHCHINHID_COLUMN_BITMASK;

		if (!_setOriginalThuTucHanhChinhId) {
			_setOriginalThuTucHanhChinhId = true;

			_originalThuTucHanhChinhId = _thuTucHanhChinhId;
		}

		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public long getOriginalThuTucHanhChinhId() {
		return _originalThuTucHanhChinhId;
	}

	@Override
	public long getLoaiChuHoSo() {
		return _loaiChuHoSo;
	}

	@Override
	public void setLoaiChuHoSo(long loaiChuHoSo) {
		_loaiChuHoSo = loaiChuHoSo;
	}

	@Override
	public String getMaSoChuHoSo() {
		if (_maSoChuHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _maSoChuHoSo;
		}
	}

	@Override
	public void setMaSoChuHoSo(String maSoChuHoSo) {
		_maSoChuHoSo = maSoChuHoSo;
	}

	@Override
	public String getTenChuHoSo() {
		if (_tenChuHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenChuHoSo;
		}
	}

	@Override
	public void setTenChuHoSo(String tenChuHoSo) {
		_tenChuHoSo = tenChuHoSo;
	}

	@Override
	public String getDiaChiChuHoSo() {
		if (_diaChiChuHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _diaChiChuHoSo;
		}
	}

	@Override
	public void setDiaChiChuHoSo(String diaChiChuHoSo) {
		_diaChiChuHoSo = diaChiChuHoSo;
	}

	@Override
	public String getMaDonVi() {
		if (_maDonVi == null) {
			return StringPool.BLANK;
		}
		else {
			return _maDonVi;
		}
	}

	@Override
	public void setMaDonVi(String maDonVi) {
		_maDonVi = maDonVi;
	}

	@Override
	public String getNguonGocHoSo() {
		if (_nguonGocHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _nguonGocHoSo;
		}
	}

	@Override
	public void setNguonGocHoSo(String nguonGocHoSo) {
		_nguonGocHoSo = nguonGocHoSo;
	}

	@Override
	public String getTrichYeuNoiDung() {
		if (_trichYeuNoiDung == null) {
			return StringPool.BLANK;
		}
		else {
			return _trichYeuNoiDung;
		}
	}

	@Override
	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;
	}

	@Override
	public Date getNgayGuiHoSo() {
		return _ngayGuiHoSo;
	}

	@Override
	public void setNgayGuiHoSo(Date ngayGuiHoSo) {
		_ngayGuiHoSo = ngayGuiHoSo;
	}

	@Override
	public Date getNgayTiepNhan() {
		return _ngayTiepNhan;
	}

	@Override
	public void setNgayTiepNhan(Date ngayTiepNhan) {
		_ngayTiepNhan = ngayTiepNhan;
	}

	@Override
	public Date getNgayBoSung() {
		return _ngayBoSung;
	}

	@Override
	public void setNgayBoSung(Date ngayBoSung) {
		_ngayBoSung = ngayBoSung;
	}

	@Override
	public Date getNgayHenTra() {
		return _ngayHenTra;
	}

	@Override
	public void setNgayHenTra(Date ngayHenTra) {
		_ngayHenTra = ngayHenTra;
	}

	@Override
	public Date getNgayTraKetQua() {
		return _ngayTraKetQua;
	}

	@Override
	public void setNgayTraKetQua(Date ngayTraKetQua) {
		_ngayTraKetQua = ngayTraKetQua;
	}

	@Override
	public Date getNgayDongHoSo() {
		return _ngayDongHoSo;
	}

	@Override
	public void setNgayDongHoSo(Date ngayDongHoSo) {
		_ngayDongHoSo = ngayDongHoSo;
	}

	@Override
	public String getTrangThaiHoSo() {
		if (_trangThaiHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _trangThaiHoSo;
		}
	}

	@Override
	public void setTrangThaiHoSo(String trangThaiHoSo) {
		_trangThaiHoSo = trangThaiHoSo;
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	@Override
	public String getMaTinhThanh() {
		if (_maTinhThanh == null) {
			return StringPool.BLANK;
		}
		else {
			return _maTinhThanh;
		}
	}

	@Override
	public void setMaTinhThanh(String maTinhThanh) {
		_maTinhThanh = maTinhThanh;
	}

	@Override
	public String getMaQuanHuyen() {
		if (_maQuanHuyen == null) {
			return StringPool.BLANK;
		}
		else {
			return _maQuanHuyen;
		}
	}

	@Override
	public void setMaQuanHuyen(String maQuanHuyen) {
		_maQuanHuyen = maQuanHuyen;
	}

	@Override
	public String getMaPhuongXa() {
		if (_maPhuongXa == null) {
			return StringPool.BLANK;
		}
		else {
			return _maPhuongXa;
		}
	}

	@Override
	public void setMaPhuongXa(String maPhuongXa) {
		_maPhuongXa = maPhuongXa;
	}

	@Override
	public String getThongBaoXuLy() {
		if (_thongBaoXuLy == null) {
			return StringPool.BLANK;
		}
		else {
			return _thongBaoXuLy;
		}
	}

	@Override
	public void setThongBaoXuLy(String thongBaoXuLy) {
		_thongBaoXuLy = thongBaoXuLy;
	}

	@Override
	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	@Override
	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;
	}

	@Override
	public Date getNgayTao() {
		return _ngayTao;
	}

	@Override
	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	@Override
	public long getNguoiTao() {
		return _nguoiTao;
	}

	@Override
	public void setNguoiTao(long nguoiTao) {
		_columnBitmask |= NGUOITAO_COLUMN_BITMASK;

		if (!_setOriginalNguoiTao) {
			_setOriginalNguoiTao = true;

			_originalNguoiTao = _nguoiTao;
		}

		_nguoiTao = nguoiTao;
	}

	public long getOriginalNguoiTao() {
		return _originalNguoiTao;
	}

	@Override
	public String getGhiChu() {
		if (_ghiChu == null) {
			return StringPool.BLANK;
		}
		else {
			return _ghiChu;
		}
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	@Override
	public long getNguoiLamThuTucId() {
		return _nguoiLamThuTucId;
	}

	@Override
	public void setNguoiLamThuTucId(long nguoiLamThuTucId) {
		_columnBitmask |= NGUOILAMTHUTUCID_COLUMN_BITMASK;

		if (!_setOriginalNguoiLamThuTucId) {
			_setOriginalNguoiLamThuTucId = true;

			_originalNguoiLamThuTucId = _nguoiLamThuTucId;
		}

		_nguoiLamThuTucId = nguoiLamThuTucId;
	}

	public long getOriginalNguoiLamThuTucId() {
		return _originalNguoiLamThuTucId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TthcHoSoThuTuc.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TthcHoSoThuTuc toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TthcHoSoThuTuc)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TthcHoSoThuTucImpl tthcHoSoThuTucImpl = new TthcHoSoThuTucImpl();

		tthcHoSoThuTucImpl.setId(getId());
		tthcHoSoThuTucImpl.setMaSoHoSo(getMaSoHoSo());
		tthcHoSoThuTucImpl.setMaBienNhan(getMaBienNhan());
		tthcHoSoThuTucImpl.setThuTucHanhChinhId(getThuTucHanhChinhId());
		tthcHoSoThuTucImpl.setLoaiChuHoSo(getLoaiChuHoSo());
		tthcHoSoThuTucImpl.setMaSoChuHoSo(getMaSoChuHoSo());
		tthcHoSoThuTucImpl.setTenChuHoSo(getTenChuHoSo());
		tthcHoSoThuTucImpl.setDiaChiChuHoSo(getDiaChiChuHoSo());
		tthcHoSoThuTucImpl.setMaDonVi(getMaDonVi());
		tthcHoSoThuTucImpl.setNguonGocHoSo(getNguonGocHoSo());
		tthcHoSoThuTucImpl.setTrichYeuNoiDung(getTrichYeuNoiDung());
		tthcHoSoThuTucImpl.setNgayGuiHoSo(getNgayGuiHoSo());
		tthcHoSoThuTucImpl.setNgayTiepNhan(getNgayTiepNhan());
		tthcHoSoThuTucImpl.setNgayBoSung(getNgayBoSung());
		tthcHoSoThuTucImpl.setNgayHenTra(getNgayHenTra());
		tthcHoSoThuTucImpl.setNgayTraKetQua(getNgayTraKetQua());
		tthcHoSoThuTucImpl.setNgayDongHoSo(getNgayDongHoSo());
		tthcHoSoThuTucImpl.setTrangThaiHoSo(getTrangThaiHoSo());
		tthcHoSoThuTucImpl.setPhanNhomHoSoId(getPhanNhomHoSoId());
		tthcHoSoThuTucImpl.setMaTinhThanh(getMaTinhThanh());
		tthcHoSoThuTucImpl.setMaQuanHuyen(getMaQuanHuyen());
		tthcHoSoThuTucImpl.setMaPhuongXa(getMaPhuongXa());
		tthcHoSoThuTucImpl.setThongBaoXuLy(getThongBaoXuLy());
		tthcHoSoThuTucImpl.setToChucQuanLy(getToChucQuanLy());
		tthcHoSoThuTucImpl.setNgayTao(getNgayTao());
		tthcHoSoThuTucImpl.setNguoiTao(getNguoiTao());
		tthcHoSoThuTucImpl.setGhiChu(getGhiChu());
		tthcHoSoThuTucImpl.setNguoiLamThuTucId(getNguoiLamThuTucId());

		tthcHoSoThuTucImpl.resetOriginalValues();

		return tthcHoSoThuTucImpl;
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

		if (!(obj instanceof TthcHoSoThuTuc)) {
			return false;
		}

		TthcHoSoThuTuc tthcHoSoThuTuc = (TthcHoSoThuTuc)obj;

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
	public void resetOriginalValues() {
		TthcHoSoThuTucModelImpl tthcHoSoThuTucModelImpl = this;

		tthcHoSoThuTucModelImpl._originalMaSoHoSo = tthcHoSoThuTucModelImpl._maSoHoSo;

		tthcHoSoThuTucModelImpl._originalThuTucHanhChinhId = tthcHoSoThuTucModelImpl._thuTucHanhChinhId;

		tthcHoSoThuTucModelImpl._setOriginalThuTucHanhChinhId = false;

		tthcHoSoThuTucModelImpl._originalNguoiTao = tthcHoSoThuTucModelImpl._nguoiTao;

		tthcHoSoThuTucModelImpl._setOriginalNguoiTao = false;

		tthcHoSoThuTucModelImpl._originalNguoiLamThuTucId = tthcHoSoThuTucModelImpl._nguoiLamThuTucId;

		tthcHoSoThuTucModelImpl._setOriginalNguoiLamThuTucId = false;

		tthcHoSoThuTucModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TthcHoSoThuTuc> toCacheModel() {
		TthcHoSoThuTucCacheModel tthcHoSoThuTucCacheModel = new TthcHoSoThuTucCacheModel();

		tthcHoSoThuTucCacheModel.id = getId();

		tthcHoSoThuTucCacheModel.maSoHoSo = getMaSoHoSo();

		String maSoHoSo = tthcHoSoThuTucCacheModel.maSoHoSo;

		if ((maSoHoSo != null) && (maSoHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.maSoHoSo = null;
		}

		tthcHoSoThuTucCacheModel.maBienNhan = getMaBienNhan();

		String maBienNhan = tthcHoSoThuTucCacheModel.maBienNhan;

		if ((maBienNhan != null) && (maBienNhan.length() == 0)) {
			tthcHoSoThuTucCacheModel.maBienNhan = null;
		}

		tthcHoSoThuTucCacheModel.thuTucHanhChinhId = getThuTucHanhChinhId();

		tthcHoSoThuTucCacheModel.loaiChuHoSo = getLoaiChuHoSo();

		tthcHoSoThuTucCacheModel.maSoChuHoSo = getMaSoChuHoSo();

		String maSoChuHoSo = tthcHoSoThuTucCacheModel.maSoChuHoSo;

		if ((maSoChuHoSo != null) && (maSoChuHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.maSoChuHoSo = null;
		}

		tthcHoSoThuTucCacheModel.tenChuHoSo = getTenChuHoSo();

		String tenChuHoSo = tthcHoSoThuTucCacheModel.tenChuHoSo;

		if ((tenChuHoSo != null) && (tenChuHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.tenChuHoSo = null;
		}

		tthcHoSoThuTucCacheModel.diaChiChuHoSo = getDiaChiChuHoSo();

		String diaChiChuHoSo = tthcHoSoThuTucCacheModel.diaChiChuHoSo;

		if ((diaChiChuHoSo != null) && (diaChiChuHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.diaChiChuHoSo = null;
		}

		tthcHoSoThuTucCacheModel.maDonVi = getMaDonVi();

		String maDonVi = tthcHoSoThuTucCacheModel.maDonVi;

		if ((maDonVi != null) && (maDonVi.length() == 0)) {
			tthcHoSoThuTucCacheModel.maDonVi = null;
		}

		tthcHoSoThuTucCacheModel.nguonGocHoSo = getNguonGocHoSo();

		String nguonGocHoSo = tthcHoSoThuTucCacheModel.nguonGocHoSo;

		if ((nguonGocHoSo != null) && (nguonGocHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.nguonGocHoSo = null;
		}

		tthcHoSoThuTucCacheModel.trichYeuNoiDung = getTrichYeuNoiDung();

		String trichYeuNoiDung = tthcHoSoThuTucCacheModel.trichYeuNoiDung;

		if ((trichYeuNoiDung != null) && (trichYeuNoiDung.length() == 0)) {
			tthcHoSoThuTucCacheModel.trichYeuNoiDung = null;
		}

		Date ngayGuiHoSo = getNgayGuiHoSo();

		if (ngayGuiHoSo != null) {
			tthcHoSoThuTucCacheModel.ngayGuiHoSo = ngayGuiHoSo.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.ngayGuiHoSo = Long.MIN_VALUE;
		}

		Date ngayTiepNhan = getNgayTiepNhan();

		if (ngayTiepNhan != null) {
			tthcHoSoThuTucCacheModel.ngayTiepNhan = ngayTiepNhan.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.ngayTiepNhan = Long.MIN_VALUE;
		}

		Date ngayBoSung = getNgayBoSung();

		if (ngayBoSung != null) {
			tthcHoSoThuTucCacheModel.ngayBoSung = ngayBoSung.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.ngayBoSung = Long.MIN_VALUE;
		}

		Date ngayHenTra = getNgayHenTra();

		if (ngayHenTra != null) {
			tthcHoSoThuTucCacheModel.ngayHenTra = ngayHenTra.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.ngayHenTra = Long.MIN_VALUE;
		}

		Date ngayTraKetQua = getNgayTraKetQua();

		if (ngayTraKetQua != null) {
			tthcHoSoThuTucCacheModel.ngayTraKetQua = ngayTraKetQua.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.ngayTraKetQua = Long.MIN_VALUE;
		}

		Date ngayDongHoSo = getNgayDongHoSo();

		if (ngayDongHoSo != null) {
			tthcHoSoThuTucCacheModel.ngayDongHoSo = ngayDongHoSo.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.ngayDongHoSo = Long.MIN_VALUE;
		}

		tthcHoSoThuTucCacheModel.trangThaiHoSo = getTrangThaiHoSo();

		String trangThaiHoSo = tthcHoSoThuTucCacheModel.trangThaiHoSo;

		if ((trangThaiHoSo != null) && (trangThaiHoSo.length() == 0)) {
			tthcHoSoThuTucCacheModel.trangThaiHoSo = null;
		}

		tthcHoSoThuTucCacheModel.phanNhomHoSoId = getPhanNhomHoSoId();

		tthcHoSoThuTucCacheModel.maTinhThanh = getMaTinhThanh();

		String maTinhThanh = tthcHoSoThuTucCacheModel.maTinhThanh;

		if ((maTinhThanh != null) && (maTinhThanh.length() == 0)) {
			tthcHoSoThuTucCacheModel.maTinhThanh = null;
		}

		tthcHoSoThuTucCacheModel.maQuanHuyen = getMaQuanHuyen();

		String maQuanHuyen = tthcHoSoThuTucCacheModel.maQuanHuyen;

		if ((maQuanHuyen != null) && (maQuanHuyen.length() == 0)) {
			tthcHoSoThuTucCacheModel.maQuanHuyen = null;
		}

		tthcHoSoThuTucCacheModel.maPhuongXa = getMaPhuongXa();

		String maPhuongXa = tthcHoSoThuTucCacheModel.maPhuongXa;

		if ((maPhuongXa != null) && (maPhuongXa.length() == 0)) {
			tthcHoSoThuTucCacheModel.maPhuongXa = null;
		}

		tthcHoSoThuTucCacheModel.thongBaoXuLy = getThongBaoXuLy();

		String thongBaoXuLy = tthcHoSoThuTucCacheModel.thongBaoXuLy;

		if ((thongBaoXuLy != null) && (thongBaoXuLy.length() == 0)) {
			tthcHoSoThuTucCacheModel.thongBaoXuLy = null;
		}

		tthcHoSoThuTucCacheModel.toChucQuanLy = getToChucQuanLy();

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			tthcHoSoThuTucCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			tthcHoSoThuTucCacheModel.ngayTao = Long.MIN_VALUE;
		}

		tthcHoSoThuTucCacheModel.nguoiTao = getNguoiTao();

		tthcHoSoThuTucCacheModel.ghiChu = getGhiChu();

		String ghiChu = tthcHoSoThuTucCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			tthcHoSoThuTucCacheModel.ghiChu = null;
		}

		tthcHoSoThuTucCacheModel.nguoiLamThuTucId = getNguoiLamThuTucId();

		return tthcHoSoThuTucCacheModel;
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

	private static ClassLoader _classLoader = TthcHoSoThuTuc.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TthcHoSoThuTuc.class
		};
	private long _id;
	private String _maSoHoSo;
	private String _originalMaSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private long _originalThuTucHanhChinhId;
	private boolean _setOriginalThuTucHanhChinhId;
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
	private long _originalNguoiTao;
	private boolean _setOriginalNguoiTao;
	private String _ghiChu;
	private long _nguoiLamThuTucId;
	private long _originalNguoiLamThuTucId;
	private boolean _setOriginalNguoiLamThuTucId;
	private long _columnBitmask;
	private TthcHoSoThuTuc _escapedModel;
}