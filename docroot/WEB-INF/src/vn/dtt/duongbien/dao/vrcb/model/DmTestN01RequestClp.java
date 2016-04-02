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

package vn.dtt.duongbien.dao.vrcb.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbien.dao.vrcb.service.ClpSerializer;
import vn.dtt.duongbien.dao.vrcb.service.DmTestN01RequestLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmTestN01RequestClp extends BaseModelImpl<DmTestN01Request>
	implements DmTestN01Request {
	public DmTestN01RequestClp() {
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

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestID", int.class);

				method.invoke(_dmTestN01RequestRemoteModel, requestID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnterpriseCode() {
		return _enterpriseCode;
	}

	@Override
	public void setEnterpriseCode(String enterpriseCode) {
		_enterpriseCode = enterpriseCode;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setEnterpriseCode",
						String.class);

				method.invoke(_dmTestN01RequestRemoteModel, enterpriseCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDuAn() {
		return _tenDuAn;
	}

	@Override
	public void setTenDuAn(String tenDuAn) {
		_tenDuAn = tenDuAn;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDuAn", String.class);

				method.invoke(_dmTestN01RequestRemoteModel, tenDuAn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSuCanThietDauTu() {
		return _suCanThietDauTu;
	}

	@Override
	public void setSuCanThietDauTu(String suCanThietDauTu) {
		_suCanThietDauTu = suCanThietDauTu;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setSuCanThietDauTu",
						String.class);

				method.invoke(_dmTestN01RequestRemoteModel, suCanThietDauTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getViTri() {
		return _viTri;
	}

	@Override
	public void setViTri(String viTri) {
		_viTri = viTri;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setViTri", String.class);

				method.invoke(_dmTestN01RequestRemoteModel, viTri);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiTauBienGioiHanVaoCang() {
		return _loaiTauBienGioiHanVaoCang;
	}

	@Override
	public void setLoaiTauBienGioiHanVaoCang(String loaiTauBienGioiHanVaoCang) {
		_loaiTauBienGioiHanVaoCang = loaiTauBienGioiHanVaoCang;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiTauBienGioiHanVaoCang",
						String.class);

				method.invoke(_dmTestN01RequestRemoteModel,
					loaiTauBienGioiHanVaoCang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoLuongCauCang() {
		return _soLuongCauCang;
	}

	@Override
	public void setSoLuongCauCang(String soLuongCauCang) {
		_soLuongCauCang = soLuongCauCang;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongCauCang",
						String.class);

				method.invoke(_dmTestN01RequestRemoteModel, soLuongCauCang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTongDienTichXayDungDuKien() {
		return _tongDienTichXayDungDuKien;
	}

	@Override
	public void setTongDienTichXayDungDuKien(String tongDienTichXayDungDuKien) {
		_tongDienTichXayDungDuKien = tongDienTichXayDungDuKien;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setTongDienTichXayDungDuKien",
						String.class);

				method.invoke(_dmTestN01RequestRemoteModel,
					tongDienTichXayDungDuKien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTaiLieulienQuan() {
		return _taiLieulienQuan;
	}

	@Override
	public void setTaiLieulienQuan(String taiLieulienQuan) {
		_taiLieulienQuan = taiLieulienQuan;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiLieulienQuan",
						String.class);

				method.invoke(_dmTestN01RequestRemoteModel, taiLieulienQuan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmTestN01RequestRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedUser() {
		return _modifiedUser;
	}

	@Override
	public void setModifiedUser(String modifiedUser) {
		_modifiedUser = modifiedUser;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedUser", String.class);

				method.invoke(_dmTestN01RequestRemoteModel, modifiedUser);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsAuthorized() {
		return _isAuthorized;
	}

	@Override
	public void setIsAuthorized(int isAuthorized) {
		_isAuthorized = isAuthorized;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setIsAuthorized", int.class);

				method.invoke(_dmTestN01RequestRemoteModel, isAuthorized);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAuthorizedDate() {
		return _authorizedDate;
	}

	@Override
	public void setAuthorizedDate(Date authorizedDate) {
		_authorizedDate = authorizedDate;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAuthorizedDate", Date.class);

				method.invoke(_dmTestN01RequestRemoteModel, authorizedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAuthorizedUser() {
		return _authorizedUser;
	}

	@Override
	public void setAuthorizedUser(String authorizedUser) {
		_authorizedUser = authorizedUser;

		if (_dmTestN01RequestRemoteModel != null) {
			try {
				Class<?> clazz = _dmTestN01RequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAuthorizedUser",
						String.class);

				method.invoke(_dmTestN01RequestRemoteModel, authorizedUser);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmTestN01RequestRemoteModel() {
		return _dmTestN01RequestRemoteModel;
	}

	public void setDmTestN01RequestRemoteModel(
		BaseModel<?> dmTestN01RequestRemoteModel) {
		_dmTestN01RequestRemoteModel = dmTestN01RequestRemoteModel;
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

		Class<?> remoteModelClass = _dmTestN01RequestRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmTestN01RequestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmTestN01RequestLocalServiceUtil.addDmTestN01Request(this);
		}
		else {
			DmTestN01RequestLocalServiceUtil.updateDmTestN01Request(this);
		}
	}

	@Override
	public DmTestN01Request toEscapedModel() {
		return (DmTestN01Request)ProxyUtil.newProxyInstance(DmTestN01Request.class.getClassLoader(),
			new Class[] { DmTestN01Request.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmTestN01RequestClp clone = new DmTestN01RequestClp();

		clone.setRequestID(getRequestID());
		clone.setEnterpriseCode(getEnterpriseCode());
		clone.setTenDuAn(getTenDuAn());
		clone.setSuCanThietDauTu(getSuCanThietDauTu());
		clone.setViTri(getViTri());
		clone.setLoaiTauBienGioiHanVaoCang(getLoaiTauBienGioiHanVaoCang());
		clone.setSoLuongCauCang(getSoLuongCauCang());
		clone.setTongDienTichXayDungDuKien(getTongDienTichXayDungDuKien());
		clone.setTaiLieulienQuan(getTaiLieulienQuan());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedUser(getModifiedUser());
		clone.setIsAuthorized(getIsAuthorized());
		clone.setAuthorizedDate(getAuthorizedDate());
		clone.setAuthorizedUser(getAuthorizedUser());

		return clone;
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

		if (!(obj instanceof DmTestN01RequestClp)) {
			return false;
		}

		DmTestN01RequestClp dmTestN01Request = (DmTestN01RequestClp)obj;

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
	private BaseModel<?> _dmTestN01RequestRemoteModel;
}