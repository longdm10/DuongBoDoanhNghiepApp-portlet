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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTaiModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the QLVTPhuongTienVanTai service. Represents a row in the &quot;qlvt_phuongtienvantai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTaiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QLVTPhuongTienVanTaiImpl}.
 * </p>
 *
 * @author binhta
 * @see QLVTPhuongTienVanTaiImpl
 * @see vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai
 * @see vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTaiModel
 * @generated
 */
public class QLVTPhuongTienVanTaiModelImpl extends BaseModelImpl<QLVTPhuongTienVanTai>
	implements QLVTPhuongTienVanTaiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a q l v t phuong tien van tai model instance should use the {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai} interface instead.
	 */
	public static final String TABLE_NAME = "qlvt_phuongtienvantai";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.INTEGER },
			{ "BIENSOXE", Types.INTEGER },
			{ "NHANHIEU", Types.VARCHAR },
			{ "TRONGTAI", Types.INTEGER },
			{ "NOISANXUAT", Types.VARCHAR },
			{ "NAMSANXUAT", Types.INTEGER },
			{ "SOCHONGOI", Types.INTEGER },
			{ "HINHTHUCSOHUUXE", Types.VARCHAR },
			{ "NIENHANSUDUNG_GIAYDANGKIEM", Types.INTEGER },
			{ "NIENHANSUDUNG_ND86", Types.INTEGER },
			{ "SOKHUNG", Types.VARCHAR },
			{ "SOMAY", Types.VARCHAR },
			{ "MAUSON", Types.VARCHAR },
			{ "THONGTINXULYVIPHAM", Types.VARCHAR },
			{ "TRANGTHAI", Types.VARCHAR },
			{ "FILEID", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table qlvt_phuongtienvantai (ID INTEGER not null primary key,BIENSOXE INTEGER,NHANHIEU VARCHAR(75) null,TRONGTAI INTEGER,NOISANXUAT VARCHAR(75) null,NAMSANXUAT INTEGER,SOCHONGOI INTEGER,HINHTHUCSOHUUXE VARCHAR(75) null,NIENHANSUDUNG_GIAYDANGKIEM INTEGER,NIENHANSUDUNG_ND86 INTEGER,SOKHUNG VARCHAR(75) null,SOMAY VARCHAR(75) null,MAUSON VARCHAR(75) null,THONGTINXULYVIPHAM VARCHAR(75) null,TRANGTHAI VARCHAR(75) null,FILEID INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table qlvt_phuongtienvantai";
	public static final String ORDER_BY_JPQL = " ORDER BY qlvtPhuongTienVanTai.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY qlvt_phuongtienvantai.ID ASC";
	public static final String DATA_SOURCE = "nghiepvuDataSource";
	public static final String SESSION_FACTORY = "nghiepvuSessionFactory";
	public static final String TX_MANAGER = "nghiepvuTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai"));

	public QLVTPhuongTienVanTaiModelImpl() {
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

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;
	}

	@Override
	public int getBienSoXe() {
		return _bienSoXe;
	}

	@Override
	public void setBienSoXe(int bienSoXe) {
		_bienSoXe = bienSoXe;
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
	public int getTrongTai() {
		return _trongTai;
	}

	@Override
	public void setTrongTai(int trongTai) {
		_trongTai = trongTai;
	}

	@Override
	public String getNoiSanXuat() {
		if (_noiSanXuat == null) {
			return StringPool.BLANK;
		}
		else {
			return _noiSanXuat;
		}
	}

	@Override
	public void setNoiSanXuat(String noiSanXuat) {
		_noiSanXuat = noiSanXuat;
	}

	@Override
	public int getNamSanXuat() {
		return _namSanXuat;
	}

	@Override
	public void setNamSanXuat(int namSanXuat) {
		_namSanXuat = namSanXuat;
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
	public String getThongTinXuLyViPham() {
		if (_thongTinXuLyViPham == null) {
			return StringPool.BLANK;
		}
		else {
			return _thongTinXuLyViPham;
		}
	}

	@Override
	public void setThongTinXuLyViPham(String thongTinXuLyViPham) {
		_thongTinXuLyViPham = thongTinXuLyViPham;
	}

	@Override
	public String getTrangThai() {
		if (_trangThai == null) {
			return StringPool.BLANK;
		}
		else {
			return _trangThai;
		}
	}

	@Override
	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;
	}

	@Override
	public int getFileId() {
		return _fileId;
	}

	@Override
	public void setFileId(int fileId) {
		_fileId = fileId;
	}

	@Override
	public QLVTPhuongTienVanTai toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QLVTPhuongTienVanTai)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QLVTPhuongTienVanTaiImpl qlvtPhuongTienVanTaiImpl = new QLVTPhuongTienVanTaiImpl();

		qlvtPhuongTienVanTaiImpl.setId(getId());
		qlvtPhuongTienVanTaiImpl.setBienSoXe(getBienSoXe());
		qlvtPhuongTienVanTaiImpl.setNhanHieu(getNhanHieu());
		qlvtPhuongTienVanTaiImpl.setTrongTai(getTrongTai());
		qlvtPhuongTienVanTaiImpl.setNoiSanXuat(getNoiSanXuat());
		qlvtPhuongTienVanTaiImpl.setNamSanXuat(getNamSanXuat());
		qlvtPhuongTienVanTaiImpl.setSoChoNgoi(getSoChoNgoi());
		qlvtPhuongTienVanTaiImpl.setHinhThucSoHuuXe(getHinhThucSoHuuXe());
		qlvtPhuongTienVanTaiImpl.setNienHanSuDungGiayDangKiem(getNienHanSuDungGiayDangKiem());
		qlvtPhuongTienVanTaiImpl.setNienHanSuDungND86(getNienHanSuDungND86());
		qlvtPhuongTienVanTaiImpl.setSoKhung(getSoKhung());
		qlvtPhuongTienVanTaiImpl.setSoMay(getSoMay());
		qlvtPhuongTienVanTaiImpl.setMauSon(getMauSon());
		qlvtPhuongTienVanTaiImpl.setThongTinXuLyViPham(getThongTinXuLyViPham());
		qlvtPhuongTienVanTaiImpl.setTrangThai(getTrangThai());
		qlvtPhuongTienVanTaiImpl.setFileId(getFileId());

		qlvtPhuongTienVanTaiImpl.resetOriginalValues();

		return qlvtPhuongTienVanTaiImpl;
	}

	@Override
	public int compareTo(QLVTPhuongTienVanTai qlvtPhuongTienVanTai) {
		int primaryKey = qlvtPhuongTienVanTai.getPrimaryKey();

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

		if (!(obj instanceof QLVTPhuongTienVanTai)) {
			return false;
		}

		QLVTPhuongTienVanTai qlvtPhuongTienVanTai = (QLVTPhuongTienVanTai)obj;

		int primaryKey = qlvtPhuongTienVanTai.getPrimaryKey();

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
	}

	@Override
	public CacheModel<QLVTPhuongTienVanTai> toCacheModel() {
		QLVTPhuongTienVanTaiCacheModel qlvtPhuongTienVanTaiCacheModel = new QLVTPhuongTienVanTaiCacheModel();

		qlvtPhuongTienVanTaiCacheModel.id = getId();

		qlvtPhuongTienVanTaiCacheModel.bienSoXe = getBienSoXe();

		qlvtPhuongTienVanTaiCacheModel.nhanHieu = getNhanHieu();

		String nhanHieu = qlvtPhuongTienVanTaiCacheModel.nhanHieu;

		if ((nhanHieu != null) && (nhanHieu.length() == 0)) {
			qlvtPhuongTienVanTaiCacheModel.nhanHieu = null;
		}

		qlvtPhuongTienVanTaiCacheModel.trongTai = getTrongTai();

		qlvtPhuongTienVanTaiCacheModel.noiSanXuat = getNoiSanXuat();

		String noiSanXuat = qlvtPhuongTienVanTaiCacheModel.noiSanXuat;

		if ((noiSanXuat != null) && (noiSanXuat.length() == 0)) {
			qlvtPhuongTienVanTaiCacheModel.noiSanXuat = null;
		}

		qlvtPhuongTienVanTaiCacheModel.namSanXuat = getNamSanXuat();

		qlvtPhuongTienVanTaiCacheModel.soChoNgoi = getSoChoNgoi();

		qlvtPhuongTienVanTaiCacheModel.hinhThucSoHuuXe = getHinhThucSoHuuXe();

		String hinhThucSoHuuXe = qlvtPhuongTienVanTaiCacheModel.hinhThucSoHuuXe;

		if ((hinhThucSoHuuXe != null) && (hinhThucSoHuuXe.length() == 0)) {
			qlvtPhuongTienVanTaiCacheModel.hinhThucSoHuuXe = null;
		}

		qlvtPhuongTienVanTaiCacheModel.nienHanSuDungGiayDangKiem = getNienHanSuDungGiayDangKiem();

		qlvtPhuongTienVanTaiCacheModel.nienHanSuDungND86 = getNienHanSuDungND86();

		qlvtPhuongTienVanTaiCacheModel.soKhung = getSoKhung();

		String soKhung = qlvtPhuongTienVanTaiCacheModel.soKhung;

		if ((soKhung != null) && (soKhung.length() == 0)) {
			qlvtPhuongTienVanTaiCacheModel.soKhung = null;
		}

		qlvtPhuongTienVanTaiCacheModel.soMay = getSoMay();

		String soMay = qlvtPhuongTienVanTaiCacheModel.soMay;

		if ((soMay != null) && (soMay.length() == 0)) {
			qlvtPhuongTienVanTaiCacheModel.soMay = null;
		}

		qlvtPhuongTienVanTaiCacheModel.mauSon = getMauSon();

		String mauSon = qlvtPhuongTienVanTaiCacheModel.mauSon;

		if ((mauSon != null) && (mauSon.length() == 0)) {
			qlvtPhuongTienVanTaiCacheModel.mauSon = null;
		}

		qlvtPhuongTienVanTaiCacheModel.thongTinXuLyViPham = getThongTinXuLyViPham();

		String thongTinXuLyViPham = qlvtPhuongTienVanTaiCacheModel.thongTinXuLyViPham;

		if ((thongTinXuLyViPham != null) && (thongTinXuLyViPham.length() == 0)) {
			qlvtPhuongTienVanTaiCacheModel.thongTinXuLyViPham = null;
		}

		qlvtPhuongTienVanTaiCacheModel.trangThai = getTrangThai();

		String trangThai = qlvtPhuongTienVanTaiCacheModel.trangThai;

		if ((trangThai != null) && (trangThai.length() == 0)) {
			qlvtPhuongTienVanTaiCacheModel.trangThai = null;
		}

		qlvtPhuongTienVanTaiCacheModel.fileId = getFileId();

		return qlvtPhuongTienVanTaiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", bienSoXe=");
		sb.append(getBienSoXe());
		sb.append(", nhanHieu=");
		sb.append(getNhanHieu());
		sb.append(", trongTai=");
		sb.append(getTrongTai());
		sb.append(", noiSanXuat=");
		sb.append(getNoiSanXuat());
		sb.append(", namSanXuat=");
		sb.append(getNamSanXuat());
		sb.append(", soChoNgoi=");
		sb.append(getSoChoNgoi());
		sb.append(", hinhThucSoHuuXe=");
		sb.append(getHinhThucSoHuuXe());
		sb.append(", nienHanSuDungGiayDangKiem=");
		sb.append(getNienHanSuDungGiayDangKiem());
		sb.append(", nienHanSuDungND86=");
		sb.append(getNienHanSuDungND86());
		sb.append(", soKhung=");
		sb.append(getSoKhung());
		sb.append(", soMay=");
		sb.append(getSoMay());
		sb.append(", mauSon=");
		sb.append(getMauSon());
		sb.append(", thongTinXuLyViPham=");
		sb.append(getThongTinXuLyViPham());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", fileId=");
		sb.append(getFileId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bienSoXe</column-name><column-value><![CDATA[");
		sb.append(getBienSoXe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhanHieu</column-name><column-value><![CDATA[");
		sb.append(getNhanHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trongTai</column-name><column-value><![CDATA[");
		sb.append(getTrongTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNoiSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namSanXuat</column-name><column-value><![CDATA[");
		sb.append(getNamSanXuat());
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
			"<column><column-name>nienHanSuDungGiayDangKiem</column-name><column-value><![CDATA[");
		sb.append(getNienHanSuDungGiayDangKiem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nienHanSuDungND86</column-name><column-value><![CDATA[");
		sb.append(getNienHanSuDungND86());
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
			"<column><column-name>mauSon</column-name><column-value><![CDATA[");
		sb.append(getMauSon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXuLyViPham</column-name><column-value><![CDATA[");
		sb.append(getThongTinXuLyViPham());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileId</column-name><column-value><![CDATA[");
		sb.append(getFileId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QLVTPhuongTienVanTai.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QLVTPhuongTienVanTai.class
		};
	private int _id;
	private int _bienSoXe;
	private String _nhanHieu;
	private int _trongTai;
	private String _noiSanXuat;
	private int _namSanXuat;
	private int _soChoNgoi;
	private String _hinhThucSoHuuXe;
	private int _nienHanSuDungGiayDangKiem;
	private int _nienHanSuDungND86;
	private String _soKhung;
	private String _soMay;
	private String _mauSon;
	private String _thongTinXuLyViPham;
	private String _trangThai;
	private int _fileId;
	private QLVTPhuongTienVanTai _escapedModel;
}