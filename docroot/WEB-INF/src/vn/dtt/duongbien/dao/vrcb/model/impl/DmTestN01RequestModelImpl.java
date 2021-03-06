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

package vn.dtt.duongbien.dao.vrcb.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request;
import vn.dtt.duongbien.dao.vrcb.model.DmTestN01RequestModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmTestN01Request service. Represents a row in the &quot;dm_test_n01_request&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.DmTestN01RequestModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmTestN01RequestImpl}.
 * </p>
 *
 * @author longdm
 * @see DmTestN01RequestImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request
 * @see vn.dtt.duongbien.dao.vrcb.model.DmTestN01RequestModel
 * @generated
 */
public class DmTestN01RequestModelImpl extends BaseModelImpl<DmTestN01Request>
	implements DmTestN01RequestModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm test n01 request model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request} interface instead.
	 */
	public static final String TABLE_NAME = "dm_test_n01_request";
	public static final Object[][] TABLE_COLUMNS = {
			{ "requestid", Types.INTEGER },
			{ "enterprisecode", Types.VARCHAR },
			{ "ten_du_an", Types.VARCHAR },
			{ "su_can_thiet_dau_tu", Types.VARCHAR },
			{ "vi_tri", Types.VARCHAR },
			{ "loai_tau_bien_gioi_han_vao_cang", Types.VARCHAR },
			{ "so_luong_cau_cang", Types.VARCHAR },
			{ "tong_dien_tich_xay_dung_du_kien", Types.VARCHAR },
			{ "tai_lieu_lien_quan", Types.VARCHAR },
			{ "modifieddate", Types.TIMESTAMP },
			{ "modifiedUser", Types.VARCHAR },
			{ "isAuthorized", Types.INTEGER },
			{ "authorizeddate", Types.TIMESTAMP },
			{ "authorizeduser", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table dm_test_n01_request (requestid INTEGER not null primary key,enterprisecode VARCHAR(75) null,ten_du_an VARCHAR(75) null,su_can_thiet_dau_tu VARCHAR(75) null,vi_tri VARCHAR(75) null,loai_tau_bien_gioi_han_vao_cang VARCHAR(75) null,so_luong_cau_cang VARCHAR(75) null,tong_dien_tich_xay_dung_du_kien VARCHAR(75) null,tai_lieu_lien_quan VARCHAR(75) null,modifieddate DATE null,modifiedUser VARCHAR(75) null,isAuthorized INTEGER,authorizeddate DATE null,authorizeduser VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table dm_test_n01_request";
	public static final String ORDER_BY_JPQL = " ORDER BY dmTestN01Request.requestID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY dm_test_n01_request.requestid ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request"));

	public DmTestN01RequestModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _requestID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setRequestID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _requestID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DmTestN01Request.class;
	}

	@Override
	public String getModelClassName() {
		return DmTestN01Request.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("requestID", getRequestID());
		attributes.put("enterpriseCode", getEnterpriseCode());
		attributes.put("tenDuAn", getTenDuAn());
		attributes.put("suCanThietDauTu", getSuCanThietDauTu());
		attributes.put("viTri", getViTri());
		attributes.put("loaiTauBienGioiHanVaoCang",
			getLoaiTauBienGioiHanVaoCang());
		attributes.put("soLuongCauCang", getSoLuongCauCang());
		attributes.put("tongDienTichXayDungDuKien",
			getTongDienTichXayDungDuKien());
		attributes.put("taiLieulienQuan", getTaiLieulienQuan());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedUser", getModifiedUser());
		attributes.put("isAuthorized", getIsAuthorized());
		attributes.put("authorizedDate", getAuthorizedDate());
		attributes.put("authorizedUser", getAuthorizedUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer requestID = (Integer)attributes.get("requestID");

		if (requestID != null) {
			setRequestID(requestID);
		}

		String enterpriseCode = (String)attributes.get("enterpriseCode");

		if (enterpriseCode != null) {
			setEnterpriseCode(enterpriseCode);
		}

		String tenDuAn = (String)attributes.get("tenDuAn");

		if (tenDuAn != null) {
			setTenDuAn(tenDuAn);
		}

		String suCanThietDauTu = (String)attributes.get("suCanThietDauTu");

		if (suCanThietDauTu != null) {
			setSuCanThietDauTu(suCanThietDauTu);
		}

		String viTri = (String)attributes.get("viTri");

		if (viTri != null) {
			setViTri(viTri);
		}

		String loaiTauBienGioiHanVaoCang = (String)attributes.get(
				"loaiTauBienGioiHanVaoCang");

		if (loaiTauBienGioiHanVaoCang != null) {
			setLoaiTauBienGioiHanVaoCang(loaiTauBienGioiHanVaoCang);
		}

		String soLuongCauCang = (String)attributes.get("soLuongCauCang");

		if (soLuongCauCang != null) {
			setSoLuongCauCang(soLuongCauCang);
		}

		String tongDienTichXayDungDuKien = (String)attributes.get(
				"tongDienTichXayDungDuKien");

		if (tongDienTichXayDungDuKien != null) {
			setTongDienTichXayDungDuKien(tongDienTichXayDungDuKien);
		}

		String taiLieulienQuan = (String)attributes.get("taiLieulienQuan");

		if (taiLieulienQuan != null) {
			setTaiLieulienQuan(taiLieulienQuan);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String modifiedUser = (String)attributes.get("modifiedUser");

		if (modifiedUser != null) {
			setModifiedUser(modifiedUser);
		}

		Integer isAuthorized = (Integer)attributes.get("isAuthorized");

		if (isAuthorized != null) {
			setIsAuthorized(isAuthorized);
		}

		Date authorizedDate = (Date)attributes.get("authorizedDate");

		if (authorizedDate != null) {
			setAuthorizedDate(authorizedDate);
		}

		String authorizedUser = (String)attributes.get("authorizedUser");

		if (authorizedUser != null) {
			setAuthorizedUser(authorizedUser);
		}
	}

	@Override
	public int getRequestID() {
		return _requestID;
	}

	@Override
	public void setRequestID(int requestID) {
		_requestID = requestID;
	}

	@Override
	public String getEnterpriseCode() {
		if (_enterpriseCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _enterpriseCode;
		}
	}

	@Override
	public void setEnterpriseCode(String enterpriseCode) {
		_enterpriseCode = enterpriseCode;
	}

	@Override
	public String getTenDuAn() {
		if (_tenDuAn == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenDuAn;
		}
	}

	@Override
	public void setTenDuAn(String tenDuAn) {
		_tenDuAn = tenDuAn;
	}

	@Override
	public String getSuCanThietDauTu() {
		if (_suCanThietDauTu == null) {
			return StringPool.BLANK;
		}
		else {
			return _suCanThietDauTu;
		}
	}

	@Override
	public void setSuCanThietDauTu(String suCanThietDauTu) {
		_suCanThietDauTu = suCanThietDauTu;
	}

	@Override
	public String getViTri() {
		if (_viTri == null) {
			return StringPool.BLANK;
		}
		else {
			return _viTri;
		}
	}

	@Override
	public void setViTri(String viTri) {
		_viTri = viTri;
	}

	@Override
	public String getLoaiTauBienGioiHanVaoCang() {
		if (_loaiTauBienGioiHanVaoCang == null) {
			return StringPool.BLANK;
		}
		else {
			return _loaiTauBienGioiHanVaoCang;
		}
	}

	@Override
	public void setLoaiTauBienGioiHanVaoCang(String loaiTauBienGioiHanVaoCang) {
		_loaiTauBienGioiHanVaoCang = loaiTauBienGioiHanVaoCang;
	}

	@Override
	public String getSoLuongCauCang() {
		if (_soLuongCauCang == null) {
			return StringPool.BLANK;
		}
		else {
			return _soLuongCauCang;
		}
	}

	@Override
	public void setSoLuongCauCang(String soLuongCauCang) {
		_soLuongCauCang = soLuongCauCang;
	}

	@Override
	public String getTongDienTichXayDungDuKien() {
		if (_tongDienTichXayDungDuKien == null) {
			return StringPool.BLANK;
		}
		else {
			return _tongDienTichXayDungDuKien;
		}
	}

	@Override
	public void setTongDienTichXayDungDuKien(String tongDienTichXayDungDuKien) {
		_tongDienTichXayDungDuKien = tongDienTichXayDungDuKien;
	}

	@Override
	public String getTaiLieulienQuan() {
		if (_taiLieulienQuan == null) {
			return StringPool.BLANK;
		}
		else {
			return _taiLieulienQuan;
		}
	}

	@Override
	public void setTaiLieulienQuan(String taiLieulienQuan) {
		_taiLieulienQuan = taiLieulienQuan;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getModifiedUser() {
		if (_modifiedUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _modifiedUser;
		}
	}

	@Override
	public void setModifiedUser(String modifiedUser) {
		_modifiedUser = modifiedUser;
	}

	@Override
	public int getIsAuthorized() {
		return _isAuthorized;
	}

	@Override
	public void setIsAuthorized(int isAuthorized) {
		_isAuthorized = isAuthorized;
	}

	@Override
	public Date getAuthorizedDate() {
		return _authorizedDate;
	}

	@Override
	public void setAuthorizedDate(Date authorizedDate) {
		_authorizedDate = authorizedDate;
	}

	@Override
	public String getAuthorizedUser() {
		if (_authorizedUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _authorizedUser;
		}
	}

	@Override
	public void setAuthorizedUser(String authorizedUser) {
		_authorizedUser = authorizedUser;
	}

	@Override
	public DmTestN01Request toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmTestN01Request)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmTestN01RequestImpl dmTestN01RequestImpl = new DmTestN01RequestImpl();

		dmTestN01RequestImpl.setRequestID(getRequestID());
		dmTestN01RequestImpl.setEnterpriseCode(getEnterpriseCode());
		dmTestN01RequestImpl.setTenDuAn(getTenDuAn());
		dmTestN01RequestImpl.setSuCanThietDauTu(getSuCanThietDauTu());
		dmTestN01RequestImpl.setViTri(getViTri());
		dmTestN01RequestImpl.setLoaiTauBienGioiHanVaoCang(getLoaiTauBienGioiHanVaoCang());
		dmTestN01RequestImpl.setSoLuongCauCang(getSoLuongCauCang());
		dmTestN01RequestImpl.setTongDienTichXayDungDuKien(getTongDienTichXayDungDuKien());
		dmTestN01RequestImpl.setTaiLieulienQuan(getTaiLieulienQuan());
		dmTestN01RequestImpl.setModifiedDate(getModifiedDate());
		dmTestN01RequestImpl.setModifiedUser(getModifiedUser());
		dmTestN01RequestImpl.setIsAuthorized(getIsAuthorized());
		dmTestN01RequestImpl.setAuthorizedDate(getAuthorizedDate());
		dmTestN01RequestImpl.setAuthorizedUser(getAuthorizedUser());

		dmTestN01RequestImpl.resetOriginalValues();

		return dmTestN01RequestImpl;
	}

	@Override
	public int compareTo(DmTestN01Request dmTestN01Request) {
		int value = 0;

		if (getRequestID() < dmTestN01Request.getRequestID()) {
			value = -1;
		}
		else if (getRequestID() > dmTestN01Request.getRequestID()) {
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

		if (!(obj instanceof DmTestN01Request)) {
			return false;
		}

		DmTestN01Request dmTestN01Request = (DmTestN01Request)obj;

		int primaryKey = dmTestN01Request.getPrimaryKey();

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
	public CacheModel<DmTestN01Request> toCacheModel() {
		DmTestN01RequestCacheModel dmTestN01RequestCacheModel = new DmTestN01RequestCacheModel();

		dmTestN01RequestCacheModel.requestID = getRequestID();

		dmTestN01RequestCacheModel.enterpriseCode = getEnterpriseCode();

		String enterpriseCode = dmTestN01RequestCacheModel.enterpriseCode;

		if ((enterpriseCode != null) && (enterpriseCode.length() == 0)) {
			dmTestN01RequestCacheModel.enterpriseCode = null;
		}

		dmTestN01RequestCacheModel.tenDuAn = getTenDuAn();

		String tenDuAn = dmTestN01RequestCacheModel.tenDuAn;

		if ((tenDuAn != null) && (tenDuAn.length() == 0)) {
			dmTestN01RequestCacheModel.tenDuAn = null;
		}

		dmTestN01RequestCacheModel.suCanThietDauTu = getSuCanThietDauTu();

		String suCanThietDauTu = dmTestN01RequestCacheModel.suCanThietDauTu;

		if ((suCanThietDauTu != null) && (suCanThietDauTu.length() == 0)) {
			dmTestN01RequestCacheModel.suCanThietDauTu = null;
		}

		dmTestN01RequestCacheModel.viTri = getViTri();

		String viTri = dmTestN01RequestCacheModel.viTri;

		if ((viTri != null) && (viTri.length() == 0)) {
			dmTestN01RequestCacheModel.viTri = null;
		}

		dmTestN01RequestCacheModel.loaiTauBienGioiHanVaoCang = getLoaiTauBienGioiHanVaoCang();

		String loaiTauBienGioiHanVaoCang = dmTestN01RequestCacheModel.loaiTauBienGioiHanVaoCang;

		if ((loaiTauBienGioiHanVaoCang != null) &&
				(loaiTauBienGioiHanVaoCang.length() == 0)) {
			dmTestN01RequestCacheModel.loaiTauBienGioiHanVaoCang = null;
		}

		dmTestN01RequestCacheModel.soLuongCauCang = getSoLuongCauCang();

		String soLuongCauCang = dmTestN01RequestCacheModel.soLuongCauCang;

		if ((soLuongCauCang != null) && (soLuongCauCang.length() == 0)) {
			dmTestN01RequestCacheModel.soLuongCauCang = null;
		}

		dmTestN01RequestCacheModel.tongDienTichXayDungDuKien = getTongDienTichXayDungDuKien();

		String tongDienTichXayDungDuKien = dmTestN01RequestCacheModel.tongDienTichXayDungDuKien;

		if ((tongDienTichXayDungDuKien != null) &&
				(tongDienTichXayDungDuKien.length() == 0)) {
			dmTestN01RequestCacheModel.tongDienTichXayDungDuKien = null;
		}

		dmTestN01RequestCacheModel.taiLieulienQuan = getTaiLieulienQuan();

		String taiLieulienQuan = dmTestN01RequestCacheModel.taiLieulienQuan;

		if ((taiLieulienQuan != null) && (taiLieulienQuan.length() == 0)) {
			dmTestN01RequestCacheModel.taiLieulienQuan = null;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmTestN01RequestCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmTestN01RequestCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dmTestN01RequestCacheModel.modifiedUser = getModifiedUser();

		String modifiedUser = dmTestN01RequestCacheModel.modifiedUser;

		if ((modifiedUser != null) && (modifiedUser.length() == 0)) {
			dmTestN01RequestCacheModel.modifiedUser = null;
		}

		dmTestN01RequestCacheModel.isAuthorized = getIsAuthorized();

		Date authorizedDate = getAuthorizedDate();

		if (authorizedDate != null) {
			dmTestN01RequestCacheModel.authorizedDate = authorizedDate.getTime();
		}
		else {
			dmTestN01RequestCacheModel.authorizedDate = Long.MIN_VALUE;
		}

		dmTestN01RequestCacheModel.authorizedUser = getAuthorizedUser();

		String authorizedUser = dmTestN01RequestCacheModel.authorizedUser;

		if ((authorizedUser != null) && (authorizedUser.length() == 0)) {
			dmTestN01RequestCacheModel.authorizedUser = null;
		}

		return dmTestN01RequestCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{requestID=");
		sb.append(getRequestID());
		sb.append(", enterpriseCode=");
		sb.append(getEnterpriseCode());
		sb.append(", tenDuAn=");
		sb.append(getTenDuAn());
		sb.append(", suCanThietDauTu=");
		sb.append(getSuCanThietDauTu());
		sb.append(", viTri=");
		sb.append(getViTri());
		sb.append(", loaiTauBienGioiHanVaoCang=");
		sb.append(getLoaiTauBienGioiHanVaoCang());
		sb.append(", soLuongCauCang=");
		sb.append(getSoLuongCauCang());
		sb.append(", tongDienTichXayDungDuKien=");
		sb.append(getTongDienTichXayDungDuKien());
		sb.append(", taiLieulienQuan=");
		sb.append(getTaiLieulienQuan());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modifiedUser=");
		sb.append(getModifiedUser());
		sb.append(", isAuthorized=");
		sb.append(getIsAuthorized());
		sb.append(", authorizedDate=");
		sb.append(getAuthorizedDate());
		sb.append(", authorizedUser=");
		sb.append(getAuthorizedUser());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>requestID</column-name><column-value><![CDATA[");
		sb.append(getRequestID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseCode</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenDuAn</column-name><column-value><![CDATA[");
		sb.append(getTenDuAn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>suCanThietDauTu</column-name><column-value><![CDATA[");
		sb.append(getSuCanThietDauTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viTri</column-name><column-value><![CDATA[");
		sb.append(getViTri());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiTauBienGioiHanVaoCang</column-name><column-value><![CDATA[");
		sb.append(getLoaiTauBienGioiHanVaoCang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongCauCang</column-name><column-value><![CDATA[");
		sb.append(getSoLuongCauCang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongDienTichXayDungDuKien</column-name><column-value><![CDATA[");
		sb.append(getTongDienTichXayDungDuKien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiLieulienQuan</column-name><column-value><![CDATA[");
		sb.append(getTaiLieulienQuan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isAuthorized</column-name><column-value><![CDATA[");
		sb.append(getIsAuthorized());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>authorizedDate</column-name><column-value><![CDATA[");
		sb.append(getAuthorizedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>authorizedUser</column-name><column-value><![CDATA[");
		sb.append(getAuthorizedUser());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DmTestN01Request.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmTestN01Request.class
		};
	private int _requestID;
	private String _enterpriseCode;
	private String _tenDuAn;
	private String _suCanThietDauTu;
	private String _viTri;
	private String _loaiTauBienGioiHanVaoCang;
	private String _soLuongCauCang;
	private String _tongDienTichXayDungDuKien;
	private String _taiLieulienQuan;
	private Date _modifiedDate;
	private String _modifiedUser;
	private int _isAuthorized;
	private Date _authorizedDate;
	private String _authorizedUser;
	private DmTestN01Request _escapedModel;
}