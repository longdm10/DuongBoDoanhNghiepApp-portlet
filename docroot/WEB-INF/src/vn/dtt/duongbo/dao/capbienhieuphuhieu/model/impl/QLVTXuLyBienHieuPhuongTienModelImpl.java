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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTienModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the QLVTXuLyBienHieuPhuongTien service. Represents a row in the &quot;qlvt_xuly_bienhieu_phuongtien&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTienModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QLVTXuLyBienHieuPhuongTienImpl}.
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyBienHieuPhuongTienImpl
 * @see vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien
 * @see vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTienModel
 * @generated
 */
public class QLVTXuLyBienHieuPhuongTienModelImpl extends BaseModelImpl<QLVTXuLyBienHieuPhuongTien>
	implements QLVTXuLyBienHieuPhuongTienModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a q l v t xu ly bien hieu phuong tien model instance should use the {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien} interface instead.
	 */
	public static final String TABLE_NAME = "qlvt_xuly_bienhieu_phuongtien";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.INTEGER },
			{ "CAPBIENHIEU_ID", Types.INTEGER },
			{ "NHANHIEU", Types.VARCHAR },
			{ "BIENSO", Types.VARCHAR },
			{ "SOKHUNG", Types.VARCHAR },
			{ "SOMAY", Types.VARCHAR },
			{ "NAMSX", Types.INTEGER },
			{ "MAUSON", Types.VARCHAR },
			{ "TRONGTAI", Types.BIGINT },
			{ "SOCHONGOI", Types.INTEGER },
			{ "HINHTHUCSOHUUXE", Types.VARCHAR },
			{ "LINHVUCKINHDOANH_XEDULICH", Types.VARCHAR },
			{ "NIENHANSUDUNG_GIAYDANGKIEM", Types.INTEGER },
			{ "NIENHANSUDUNG_ND86", Types.INTEGER },
			{ "DOANHNGHIEPSOHUU_THUE", Types.VARCHAR },
			{ "THOIHANTHUE", Types.TIMESTAMP },
			{ "HOPDONGSAUCUNG", Types.INTEGER },
			{ "KETQUAXULY", Types.VARCHAR },
			{ "SOPHUHIEUDUOCCAP", Types.VARCHAR },
			{ "THOIHANDUOCCAPPHEP", Types.TIMESTAMP },
			{ "LYDOKHONGDAT", Types.VARCHAR },
			{ "soA", Types.VARCHAR },
			{ "soB", Types.VARCHAR },
			{ "coGiaTriDen", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table qlvt_xuly_bienhieu_phuongtien (ID INTEGER not null primary key,CAPBIENHIEU_ID INTEGER,NHANHIEU VARCHAR(75) null,BIENSO VARCHAR(75) null,SOKHUNG VARCHAR(75) null,SOMAY VARCHAR(75) null,NAMSX INTEGER,MAUSON VARCHAR(75) null,TRONGTAI LONG,SOCHONGOI INTEGER,HINHTHUCSOHUUXE VARCHAR(75) null,LINHVUCKINHDOANH_XEDULICH VARCHAR(75) null,NIENHANSUDUNG_GIAYDANGKIEM INTEGER,NIENHANSUDUNG_ND86 INTEGER,DOANHNGHIEPSOHUU_THUE VARCHAR(75) null,THOIHANTHUE DATE null,HOPDONGSAUCUNG INTEGER,KETQUAXULY VARCHAR(75) null,SOPHUHIEUDUOCCAP VARCHAR(75) null,THOIHANDUOCCAPPHEP DATE null,LYDOKHONGDAT VARCHAR(75) null,soA VARCHAR(75) null,soB VARCHAR(75) null,coGiaTriDen DATE null)";
	public static final String TABLE_SQL_DROP = "drop table qlvt_xuly_bienhieu_phuongtien";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtXuLyBienHieuPhuongTien.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY qlvt_xuly_bienhieu_phuongtien.ID ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien"),
			true);
	public static long CAPBIENHIEUID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien"));

	public QLVTXuLyBienHieuPhuongTienModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QLVTXuLyBienHieuPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return QLVTXuLyBienHieuPhuongTien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("capBienHieuID", getCapBienHieuID());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("bienSo", getBienSo());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soMay", getSoMay());
		attributes.put("namSx", getNamSx());
		attributes.put("mauSon", getMauSon());
		attributes.put("trongTai", getTrongTai());
		attributes.put("soChoNgoi", getSoChoNgoi());
		attributes.put("hinhThucSoHuuXe", getHinhThucSoHuuXe());
		attributes.put("linhVucKinhDoanhXeDuLich", getLinhVucKinhDoanhXeDuLich());
		attributes.put("nienHanSuDungGiayDangKiem",
			getNienHanSuDungGiayDangKiem());
		attributes.put("nienHanSuDungND86", getNienHanSuDungND86());
		attributes.put("doanhNghiepSoHuuThue", getDoanhNghiepSoHuuThue());
		attributes.put("thoiHanThue", getThoiHanThue());
		attributes.put("hopDongSauCung", getHopDongSauCung());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("soPhuHieuDuocCap", getSoPhuHieuDuocCap());
		attributes.put("thoiHanDuocCapPhep", getThoiHanDuocCapPhep());
		attributes.put("lyDoKhongDat", getLyDoKhongDat());
		attributes.put("soA", getSoA());
		attributes.put("soB", getSoB());
		attributes.put("coGiaTriDen", getCoGiaTriDen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer capBienHieuID = (Integer)attributes.get("capBienHieuID");

		if (capBienHieuID != null) {
			setCapBienHieuID(capBienHieuID);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		String bienSo = (String)attributes.get("bienSo");

		if (bienSo != null) {
			setBienSo(bienSo);
		}

		String soKhung = (String)attributes.get("soKhung");

		if (soKhung != null) {
			setSoKhung(soKhung);
		}

		String soMay = (String)attributes.get("soMay");

		if (soMay != null) {
			setSoMay(soMay);
		}

		Integer namSx = (Integer)attributes.get("namSx");

		if (namSx != null) {
			setNamSx(namSx);
		}

		String mauSon = (String)attributes.get("mauSon");

		if (mauSon != null) {
			setMauSon(mauSon);
		}

		Long trongTai = (Long)attributes.get("trongTai");

		if (trongTai != null) {
			setTrongTai(trongTai);
		}

		Integer soChoNgoi = (Integer)attributes.get("soChoNgoi");

		if (soChoNgoi != null) {
			setSoChoNgoi(soChoNgoi);
		}

		String hinhThucSoHuuXe = (String)attributes.get("hinhThucSoHuuXe");

		if (hinhThucSoHuuXe != null) {
			setHinhThucSoHuuXe(hinhThucSoHuuXe);
		}

		String linhVucKinhDoanhXeDuLich = (String)attributes.get(
				"linhVucKinhDoanhXeDuLich");

		if (linhVucKinhDoanhXeDuLich != null) {
			setLinhVucKinhDoanhXeDuLich(linhVucKinhDoanhXeDuLich);
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

		String doanhNghiepSoHuuThue = (String)attributes.get(
				"doanhNghiepSoHuuThue");

		if (doanhNghiepSoHuuThue != null) {
			setDoanhNghiepSoHuuThue(doanhNghiepSoHuuThue);
		}

		Date thoiHanThue = (Date)attributes.get("thoiHanThue");

		if (thoiHanThue != null) {
			setThoiHanThue(thoiHanThue);
		}

		Integer hopDongSauCung = (Integer)attributes.get("hopDongSauCung");

		if (hopDongSauCung != null) {
			setHopDongSauCung(hopDongSauCung);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String soPhuHieuDuocCap = (String)attributes.get("soPhuHieuDuocCap");

		if (soPhuHieuDuocCap != null) {
			setSoPhuHieuDuocCap(soPhuHieuDuocCap);
		}

		Date thoiHanDuocCapPhep = (Date)attributes.get("thoiHanDuocCapPhep");

		if (thoiHanDuocCapPhep != null) {
			setThoiHanDuocCapPhep(thoiHanDuocCapPhep);
		}

		String lyDoKhongDat = (String)attributes.get("lyDoKhongDat");

		if (lyDoKhongDat != null) {
			setLyDoKhongDat(lyDoKhongDat);
		}

		String soA = (String)attributes.get("soA");

		if (soA != null) {
			setSoA(soA);
		}

		String soB = (String)attributes.get("soB");

		if (soB != null) {
			setSoB(soB);
		}

		Date coGiaTriDen = (Date)attributes.get("coGiaTriDen");

		if (coGiaTriDen != null) {
			setCoGiaTriDen(coGiaTriDen);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;
	}

	@Override
	public int getCapBienHieuID() {
		return _capBienHieuID;
	}

	@Override
	public void setCapBienHieuID(int capBienHieuID) {
		_columnBitmask |= CAPBIENHIEUID_COLUMN_BITMASK;

		if (!_setOriginalCapBienHieuID) {
			_setOriginalCapBienHieuID = true;

			_originalCapBienHieuID = _capBienHieuID;
		}

		_capBienHieuID = capBienHieuID;
	}

	public int getOriginalCapBienHieuID() {
		return _originalCapBienHieuID;
	}

	@Override
	public String getNhanHieu() {
		if (_nhanHieu == null) {
			return StringPool.BLANK;
		}
		else {
			return _nhanHieu;
		}
	}

	@Override
	public void setNhanHieu(String nhanHieu) {
		_nhanHieu = nhanHieu;
	}

	@Override
	public String getBienSo() {
		if (_bienSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _bienSo;
		}
	}

	@Override
	public void setBienSo(String bienSo) {
		_bienSo = bienSo;
	}

	@Override
	public String getSoKhung() {
		if (_soKhung == null) {
			return StringPool.BLANK;
		}
		else {
			return _soKhung;
		}
	}

	@Override
	public void setSoKhung(String soKhung) {
		_soKhung = soKhung;
	}

	@Override
	public String getSoMay() {
		if (_soMay == null) {
			return StringPool.BLANK;
		}
		else {
			return _soMay;
		}
	}

	@Override
	public void setSoMay(String soMay) {
		_soMay = soMay;
	}

	@Override
	public int getNamSx() {
		return _namSx;
	}

	@Override
	public void setNamSx(int namSx) {
		_namSx = namSx;
	}

	@Override
	public String getMauSon() {
		if (_mauSon == null) {
			return StringPool.BLANK;
		}
		else {
			return _mauSon;
		}
	}

	@Override
	public void setMauSon(String mauSon) {
		_mauSon = mauSon;
	}

	@Override
	public long getTrongTai() {
		return _trongTai;
	}

	@Override
	public void setTrongTai(long trongTai) {
		_trongTai = trongTai;
	}

	@Override
	public int getSoChoNgoi() {
		return _soChoNgoi;
	}

	@Override
	public void setSoChoNgoi(int soChoNgoi) {
		_soChoNgoi = soChoNgoi;
	}

	@Override
	public String getHinhThucSoHuuXe() {
		if (_hinhThucSoHuuXe == null) {
			return StringPool.BLANK;
		}
		else {
			return _hinhThucSoHuuXe;
		}
	}

	@Override
	public void setHinhThucSoHuuXe(String hinhThucSoHuuXe) {
		_hinhThucSoHuuXe = hinhThucSoHuuXe;
	}

	@Override
	public String getLinhVucKinhDoanhXeDuLich() {
		if (_linhVucKinhDoanhXeDuLich == null) {
			return StringPool.BLANK;
		}
		else {
			return _linhVucKinhDoanhXeDuLich;
		}
	}

	@Override
	public void setLinhVucKinhDoanhXeDuLich(String linhVucKinhDoanhXeDuLich) {
		_linhVucKinhDoanhXeDuLich = linhVucKinhDoanhXeDuLich;
	}

	@Override
	public int getNienHanSuDungGiayDangKiem() {
		return _nienHanSuDungGiayDangKiem;
	}

	@Override
	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem) {
		_nienHanSuDungGiayDangKiem = nienHanSuDungGiayDangKiem;
	}

	@Override
	public int getNienHanSuDungND86() {
		return _nienHanSuDungND86;
	}

	@Override
	public void setNienHanSuDungND86(int nienHanSuDungND86) {
		_nienHanSuDungND86 = nienHanSuDungND86;
	}

	@Override
	public String getDoanhNghiepSoHuuThue() {
		if (_doanhNghiepSoHuuThue == null) {
			return StringPool.BLANK;
		}
		else {
			return _doanhNghiepSoHuuThue;
		}
	}

	@Override
	public void setDoanhNghiepSoHuuThue(String doanhNghiepSoHuuThue) {
		_doanhNghiepSoHuuThue = doanhNghiepSoHuuThue;
	}

	@Override
	public Date getThoiHanThue() {
		return _thoiHanThue;
	}

	@Override
	public void setThoiHanThue(Date thoiHanThue) {
		_thoiHanThue = thoiHanThue;
	}

	@Override
	public int getHopDongSauCung() {
		return _hopDongSauCung;
	}

	@Override
	public void setHopDongSauCung(int hopDongSauCung) {
		_hopDongSauCung = hopDongSauCung;
	}

	@Override
	public String getKetQuaXuLy() {
		if (_ketQuaXuLy == null) {
			return StringPool.BLANK;
		}
		else {
			return _ketQuaXuLy;
		}
	}

	@Override
	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;
	}

	@Override
	public String getSoPhuHieuDuocCap() {
		if (_soPhuHieuDuocCap == null) {
			return StringPool.BLANK;
		}
		else {
			return _soPhuHieuDuocCap;
		}
	}

	@Override
	public void setSoPhuHieuDuocCap(String soPhuHieuDuocCap) {
		_soPhuHieuDuocCap = soPhuHieuDuocCap;
	}

	@Override
	public Date getThoiHanDuocCapPhep() {
		return _thoiHanDuocCapPhep;
	}

	@Override
	public void setThoiHanDuocCapPhep(Date thoiHanDuocCapPhep) {
		_thoiHanDuocCapPhep = thoiHanDuocCapPhep;
	}

	@Override
	public String getLyDoKhongDat() {
		if (_lyDoKhongDat == null) {
			return StringPool.BLANK;
		}
		else {
			return _lyDoKhongDat;
		}
	}

	@Override
	public void setLyDoKhongDat(String lyDoKhongDat) {
		_lyDoKhongDat = lyDoKhongDat;
	}

	@Override
	public String getSoA() {
		if (_soA == null) {
			return StringPool.BLANK;
		}
		else {
			return _soA;
		}
	}

	@Override
	public void setSoA(String soA) {
		_soA = soA;
	}

	@Override
	public String getSoB() {
		if (_soB == null) {
			return StringPool.BLANK;
		}
		else {
			return _soB;
		}
	}

	@Override
	public void setSoB(String soB) {
		_soB = soB;
	}

	@Override
	public Date getCoGiaTriDen() {
		return _coGiaTriDen;
	}

	@Override
	public void setCoGiaTriDen(Date coGiaTriDen) {
		_coGiaTriDen = coGiaTriDen;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public QLVTXuLyBienHieuPhuongTien toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QLVTXuLyBienHieuPhuongTien)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QLVTXuLyBienHieuPhuongTienImpl qlvtXuLyBienHieuPhuongTienImpl = new QLVTXuLyBienHieuPhuongTienImpl();

		qlvtXuLyBienHieuPhuongTienImpl.setId(getId());
		qlvtXuLyBienHieuPhuongTienImpl.setCapBienHieuID(getCapBienHieuID());
		qlvtXuLyBienHieuPhuongTienImpl.setNhanHieu(getNhanHieu());
		qlvtXuLyBienHieuPhuongTienImpl.setBienSo(getBienSo());
		qlvtXuLyBienHieuPhuongTienImpl.setSoKhung(getSoKhung());
		qlvtXuLyBienHieuPhuongTienImpl.setSoMay(getSoMay());
		qlvtXuLyBienHieuPhuongTienImpl.setNamSx(getNamSx());
		qlvtXuLyBienHieuPhuongTienImpl.setMauSon(getMauSon());
		qlvtXuLyBienHieuPhuongTienImpl.setTrongTai(getTrongTai());
		qlvtXuLyBienHieuPhuongTienImpl.setSoChoNgoi(getSoChoNgoi());
		qlvtXuLyBienHieuPhuongTienImpl.setHinhThucSoHuuXe(getHinhThucSoHuuXe());
		qlvtXuLyBienHieuPhuongTienImpl.setLinhVucKinhDoanhXeDuLich(getLinhVucKinhDoanhXeDuLich());
		qlvtXuLyBienHieuPhuongTienImpl.setNienHanSuDungGiayDangKiem(getNienHanSuDungGiayDangKiem());
		qlvtXuLyBienHieuPhuongTienImpl.setNienHanSuDungND86(getNienHanSuDungND86());
		qlvtXuLyBienHieuPhuongTienImpl.setDoanhNghiepSoHuuThue(getDoanhNghiepSoHuuThue());
		qlvtXuLyBienHieuPhuongTienImpl.setThoiHanThue(getThoiHanThue());
		qlvtXuLyBienHieuPhuongTienImpl.setHopDongSauCung(getHopDongSauCung());
		qlvtXuLyBienHieuPhuongTienImpl.setKetQuaXuLy(getKetQuaXuLy());
		qlvtXuLyBienHieuPhuongTienImpl.setSoPhuHieuDuocCap(getSoPhuHieuDuocCap());
		qlvtXuLyBienHieuPhuongTienImpl.setThoiHanDuocCapPhep(getThoiHanDuocCapPhep());
		qlvtXuLyBienHieuPhuongTienImpl.setLyDoKhongDat(getLyDoKhongDat());
		qlvtXuLyBienHieuPhuongTienImpl.setSoA(getSoA());
		qlvtXuLyBienHieuPhuongTienImpl.setSoB(getSoB());
		qlvtXuLyBienHieuPhuongTienImpl.setCoGiaTriDen(getCoGiaTriDen());

		qlvtXuLyBienHieuPhuongTienImpl.resetOriginalValues();

		return qlvtXuLyBienHieuPhuongTienImpl;
	}

	@Override
	public int compareTo(QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien) {
		int primaryKey = qlvtXuLyBienHieuPhuongTien.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QLVTXuLyBienHieuPhuongTien)) {
			return false;
		}

		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien = (QLVTXuLyBienHieuPhuongTien)obj;

		int primaryKey = qlvtXuLyBienHieuPhuongTien.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		QLVTXuLyBienHieuPhuongTienModelImpl qlvtXuLyBienHieuPhuongTienModelImpl = this;

		qlvtXuLyBienHieuPhuongTienModelImpl._originalCapBienHieuID = qlvtXuLyBienHieuPhuongTienModelImpl._capBienHieuID;

		qlvtXuLyBienHieuPhuongTienModelImpl._setOriginalCapBienHieuID = false;

		qlvtXuLyBienHieuPhuongTienModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QLVTXuLyBienHieuPhuongTien> toCacheModel() {
		QLVTXuLyBienHieuPhuongTienCacheModel qlvtXuLyBienHieuPhuongTienCacheModel =
			new QLVTXuLyBienHieuPhuongTienCacheModel();

		qlvtXuLyBienHieuPhuongTienCacheModel.id = getId();

		qlvtXuLyBienHieuPhuongTienCacheModel.capBienHieuID = getCapBienHieuID();

		qlvtXuLyBienHieuPhuongTienCacheModel.nhanHieu = getNhanHieu();

		String nhanHieu = qlvtXuLyBienHieuPhuongTienCacheModel.nhanHieu;

		if ((nhanHieu != null) && (nhanHieu.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.nhanHieu = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.bienSo = getBienSo();

		String bienSo = qlvtXuLyBienHieuPhuongTienCacheModel.bienSo;

		if ((bienSo != null) && (bienSo.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.bienSo = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.soKhung = getSoKhung();

		String soKhung = qlvtXuLyBienHieuPhuongTienCacheModel.soKhung;

		if ((soKhung != null) && (soKhung.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.soKhung = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.soMay = getSoMay();

		String soMay = qlvtXuLyBienHieuPhuongTienCacheModel.soMay;

		if ((soMay != null) && (soMay.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.soMay = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.namSx = getNamSx();

		qlvtXuLyBienHieuPhuongTienCacheModel.mauSon = getMauSon();

		String mauSon = qlvtXuLyBienHieuPhuongTienCacheModel.mauSon;

		if ((mauSon != null) && (mauSon.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.mauSon = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.trongTai = getTrongTai();

		qlvtXuLyBienHieuPhuongTienCacheModel.soChoNgoi = getSoChoNgoi();

		qlvtXuLyBienHieuPhuongTienCacheModel.hinhThucSoHuuXe = getHinhThucSoHuuXe();

		String hinhThucSoHuuXe = qlvtXuLyBienHieuPhuongTienCacheModel.hinhThucSoHuuXe;

		if ((hinhThucSoHuuXe != null) && (hinhThucSoHuuXe.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.hinhThucSoHuuXe = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.linhVucKinhDoanhXeDuLich = getLinhVucKinhDoanhXeDuLich();

		String linhVucKinhDoanhXeDuLich = qlvtXuLyBienHieuPhuongTienCacheModel.linhVucKinhDoanhXeDuLich;

		if ((linhVucKinhDoanhXeDuLich != null) &&
				(linhVucKinhDoanhXeDuLich.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.linhVucKinhDoanhXeDuLich = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.nienHanSuDungGiayDangKiem = getNienHanSuDungGiayDangKiem();

		qlvtXuLyBienHieuPhuongTienCacheModel.nienHanSuDungND86 = getNienHanSuDungND86();

		qlvtXuLyBienHieuPhuongTienCacheModel.doanhNghiepSoHuuThue = getDoanhNghiepSoHuuThue();

		String doanhNghiepSoHuuThue = qlvtXuLyBienHieuPhuongTienCacheModel.doanhNghiepSoHuuThue;

		if ((doanhNghiepSoHuuThue != null) &&
				(doanhNghiepSoHuuThue.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.doanhNghiepSoHuuThue = null;
		}

		Date thoiHanThue = getThoiHanThue();

		if (thoiHanThue != null) {
			qlvtXuLyBienHieuPhuongTienCacheModel.thoiHanThue = thoiHanThue.getTime();
		}
		else {
			qlvtXuLyBienHieuPhuongTienCacheModel.thoiHanThue = Long.MIN_VALUE;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.hopDongSauCung = getHopDongSauCung();

		qlvtXuLyBienHieuPhuongTienCacheModel.ketQuaXuLy = getKetQuaXuLy();

		String ketQuaXuLy = qlvtXuLyBienHieuPhuongTienCacheModel.ketQuaXuLy;

		if ((ketQuaXuLy != null) && (ketQuaXuLy.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.ketQuaXuLy = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.soPhuHieuDuocCap = getSoPhuHieuDuocCap();

		String soPhuHieuDuocCap = qlvtXuLyBienHieuPhuongTienCacheModel.soPhuHieuDuocCap;

		if ((soPhuHieuDuocCap != null) && (soPhuHieuDuocCap.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.soPhuHieuDuocCap = null;
		}

		Date thoiHanDuocCapPhep = getThoiHanDuocCapPhep();

		if (thoiHanDuocCapPhep != null) {
			qlvtXuLyBienHieuPhuongTienCacheModel.thoiHanDuocCapPhep = thoiHanDuocCapPhep.getTime();
		}
		else {
			qlvtXuLyBienHieuPhuongTienCacheModel.thoiHanDuocCapPhep = Long.MIN_VALUE;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.lyDoKhongDat = getLyDoKhongDat();

		String lyDoKhongDat = qlvtXuLyBienHieuPhuongTienCacheModel.lyDoKhongDat;

		if ((lyDoKhongDat != null) && (lyDoKhongDat.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.lyDoKhongDat = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.soA = getSoA();

		String soA = qlvtXuLyBienHieuPhuongTienCacheModel.soA;

		if ((soA != null) && (soA.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.soA = null;
		}

		qlvtXuLyBienHieuPhuongTienCacheModel.soB = getSoB();

		String soB = qlvtXuLyBienHieuPhuongTienCacheModel.soB;

		if ((soB != null) && (soB.length() == 0)) {
			qlvtXuLyBienHieuPhuongTienCacheModel.soB = null;
		}

		Date coGiaTriDen = getCoGiaTriDen();

		if (coGiaTriDen != null) {
			qlvtXuLyBienHieuPhuongTienCacheModel.coGiaTriDen = coGiaTriDen.getTime();
		}
		else {
			qlvtXuLyBienHieuPhuongTienCacheModel.coGiaTriDen = Long.MIN_VALUE;
		}

		return qlvtXuLyBienHieuPhuongTienCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", capBienHieuID=");
		sb.append(getCapBienHieuID());
		sb.append(", nhanHieu=");
		sb.append(getNhanHieu());
		sb.append(", bienSo=");
		sb.append(getBienSo());
		sb.append(", soKhung=");
		sb.append(getSoKhung());
		sb.append(", soMay=");
		sb.append(getSoMay());
		sb.append(", namSx=");
		sb.append(getNamSx());
		sb.append(", mauSon=");
		sb.append(getMauSon());
		sb.append(", trongTai=");
		sb.append(getTrongTai());
		sb.append(", soChoNgoi=");
		sb.append(getSoChoNgoi());
		sb.append(", hinhThucSoHuuXe=");
		sb.append(getHinhThucSoHuuXe());
		sb.append(", linhVucKinhDoanhXeDuLich=");
		sb.append(getLinhVucKinhDoanhXeDuLich());
		sb.append(", nienHanSuDungGiayDangKiem=");
		sb.append(getNienHanSuDungGiayDangKiem());
		sb.append(", nienHanSuDungND86=");
		sb.append(getNienHanSuDungND86());
		sb.append(", doanhNghiepSoHuuThue=");
		sb.append(getDoanhNghiepSoHuuThue());
		sb.append(", thoiHanThue=");
		sb.append(getThoiHanThue());
		sb.append(", hopDongSauCung=");
		sb.append(getHopDongSauCung());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", soPhuHieuDuocCap=");
		sb.append(getSoPhuHieuDuocCap());
		sb.append(", thoiHanDuocCapPhep=");
		sb.append(getThoiHanDuocCapPhep());
		sb.append(", lyDoKhongDat=");
		sb.append(getLyDoKhongDat());
		sb.append(", soA=");
		sb.append(getSoA());
		sb.append(", soB=");
		sb.append(getSoB());
		sb.append(", coGiaTriDen=");
		sb.append(getCoGiaTriDen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capBienHieuID</column-name><column-value><![CDATA[");
		sb.append(getCapBienHieuID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhanHieu</column-name><column-value><![CDATA[");
		sb.append(getNhanHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bienSo</column-name><column-value><![CDATA[");
		sb.append(getBienSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soKhung</column-name><column-value><![CDATA[");
		sb.append(getSoKhung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soMay</column-name><column-value><![CDATA[");
		sb.append(getSoMay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namSx</column-name><column-value><![CDATA[");
		sb.append(getNamSx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauSon</column-name><column-value><![CDATA[");
		sb.append(getMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trongTai</column-name><column-value><![CDATA[");
		sb.append(getTrongTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soChoNgoi</column-name><column-value><![CDATA[");
		sb.append(getSoChoNgoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hinhThucSoHuuXe</column-name><column-value><![CDATA[");
		sb.append(getHinhThucSoHuuXe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>linhVucKinhDoanhXeDuLich</column-name><column-value><![CDATA[");
		sb.append(getLinhVucKinhDoanhXeDuLich());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nienHanSuDungGiayDangKiem</column-name><column-value><![CDATA[");
		sb.append(getNienHanSuDungGiayDangKiem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nienHanSuDungND86</column-name><column-value><![CDATA[");
		sb.append(getNienHanSuDungND86());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doanhNghiepSoHuuThue</column-name><column-value><![CDATA[");
		sb.append(getDoanhNghiepSoHuuThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanThue</column-name><column-value><![CDATA[");
		sb.append(getThoiHanThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hopDongSauCung</column-name><column-value><![CDATA[");
		sb.append(getHopDongSauCung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLy</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soPhuHieuDuocCap</column-name><column-value><![CDATA[");
		sb.append(getSoPhuHieuDuocCap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanDuocCapPhep</column-name><column-value><![CDATA[");
		sb.append(getThoiHanDuocCapPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDat</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soA</column-name><column-value><![CDATA[");
		sb.append(getSoA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soB</column-name><column-value><![CDATA[");
		sb.append(getSoB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coGiaTriDen</column-name><column-value><![CDATA[");
		sb.append(getCoGiaTriDen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QLVTXuLyBienHieuPhuongTien.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QLVTXuLyBienHieuPhuongTien.class
		};
	private int _id;
	private int _capBienHieuID;
	private int _originalCapBienHieuID;
	private boolean _setOriginalCapBienHieuID;
	private String _nhanHieu;
	private String _bienSo;
	private String _soKhung;
	private String _soMay;
	private int _namSx;
	private String _mauSon;
	private long _trongTai;
	private int _soChoNgoi;
	private String _hinhThucSoHuuXe;
	private String _linhVucKinhDoanhXeDuLich;
	private int _nienHanSuDungGiayDangKiem;
	private int _nienHanSuDungND86;
	private String _doanhNghiepSoHuuThue;
	private Date _thoiHanThue;
	private int _hopDongSauCung;
	private String _ketQuaXuLy;
	private String _soPhuHieuDuocCap;
	private Date _thoiHanDuocCapPhep;
	private String _lyDoKhongDat;
	private String _soA;
	private String _soB;
	private Date _coGiaTriDen;
	private long _columnBitmask;
	private QLVTXuLyBienHieuPhuongTien _escapedModel;
}