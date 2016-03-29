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
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcThuTucHanhChinhClp extends BaseModelImpl<TthcThuTucHanhChinh>
	implements TthcThuTucHanhChinh {
	public TthcThuTucHanhChinhClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcThuTucHanhChinh.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThuTucHanhChinh.class.getName();
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
		attributes.put("maThuTuc", getMaThuTuc());
		attributes.put("tenThuTuc", getTenThuTuc());
		attributes.put("trinhTuThucHien", getTrinhTuThucHien());
		attributes.put("cachThucThucHien", getCachThucThucHien());
		attributes.put("thanhPhanHoSo", getThanhPhanHoSo());
		attributes.put("dieuKienThucHien", getDieuKienThucHien());
		attributes.put("thoiHanGiaiQuyet", getThoiHanGiaiQuyet());
		attributes.put("doiTuongThucHien", getDoiTuongThucHien());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("canCuPhapLy", getCanCuPhapLy());
		attributes.put("lePhi", getLePhi());
		attributes.put("coQuanQltt", getCoQuanQltt());
		attributes.put("linhVucThuTuc", getLinhVucThuTuc());
		attributes.put("ngayCoHieuLuc", getNgayCoHieuLuc());
		attributes.put("ngayHetHieuLuc", getNgayHetHieuLuc());
		attributes.put("huongDanThucHien", getHuongDanThucHien());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maThuTuc = (String)attributes.get("maThuTuc");

		if (maThuTuc != null) {
			setMaThuTuc(maThuTuc);
		}

		String tenThuTuc = (String)attributes.get("tenThuTuc");

		if (tenThuTuc != null) {
			setTenThuTuc(tenThuTuc);
		}

		String trinhTuThucHien = (String)attributes.get("trinhTuThucHien");

		if (trinhTuThucHien != null) {
			setTrinhTuThucHien(trinhTuThucHien);
		}

		String cachThucThucHien = (String)attributes.get("cachThucThucHien");

		if (cachThucThucHien != null) {
			setCachThucThucHien(cachThucThucHien);
		}

		String thanhPhanHoSo = (String)attributes.get("thanhPhanHoSo");

		if (thanhPhanHoSo != null) {
			setThanhPhanHoSo(thanhPhanHoSo);
		}

		String dieuKienThucHien = (String)attributes.get("dieuKienThucHien");

		if (dieuKienThucHien != null) {
			setDieuKienThucHien(dieuKienThucHien);
		}

		String thoiHanGiaiQuyet = (String)attributes.get("thoiHanGiaiQuyet");

		if (thoiHanGiaiQuyet != null) {
			setThoiHanGiaiQuyet(thoiHanGiaiQuyet);
		}

		String doiTuongThucHien = (String)attributes.get("doiTuongThucHien");

		if (doiTuongThucHien != null) {
			setDoiTuongThucHien(doiTuongThucHien);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		String canCuPhapLy = (String)attributes.get("canCuPhapLy");

		if (canCuPhapLy != null) {
			setCanCuPhapLy(canCuPhapLy);
		}

		String lePhi = (String)attributes.get("lePhi");

		if (lePhi != null) {
			setLePhi(lePhi);
		}

		String coQuanQltt = (String)attributes.get("coQuanQltt");

		if (coQuanQltt != null) {
			setCoQuanQltt(coQuanQltt);
		}

		String linhVucThuTuc = (String)attributes.get("linhVucThuTuc");

		if (linhVucThuTuc != null) {
			setLinhVucThuTuc(linhVucThuTuc);
		}

		Date ngayCoHieuLuc = (Date)attributes.get("ngayCoHieuLuc");

		if (ngayCoHieuLuc != null) {
			setNgayCoHieuLuc(ngayCoHieuLuc);
		}

		Date ngayHetHieuLuc = (Date)attributes.get("ngayHetHieuLuc");

		if (ngayHetHieuLuc != null) {
			setNgayHetHieuLuc(ngayHetHieuLuc);
		}

		String huongDanThucHien = (String)attributes.get("huongDanThucHien");

		if (huongDanThucHien != null) {
			setHuongDanThucHien(huongDanThucHien);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaThuTuc() {
		return _maThuTuc;
	}

	@Override
	public void setMaThuTuc(String maThuTuc) {
		_maThuTuc = maThuTuc;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaThuTuc", String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, maThuTuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenThuTuc() {
		return _tenThuTuc;
	}

	@Override
	public void setTenThuTuc(String tenThuTuc) {
		_tenThuTuc = tenThuTuc;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTenThuTuc", String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, tenThuTuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrinhTuThucHien() {
		return _trinhTuThucHien;
	}

	@Override
	public void setTrinhTuThucHien(String trinhTuThucHien) {
		_trinhTuThucHien = trinhTuThucHien;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTrinhTuThucHien",
						String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, trinhTuThucHien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCachThucThucHien() {
		return _cachThucThucHien;
	}

	@Override
	public void setCachThucThucHien(String cachThucThucHien) {
		_cachThucThucHien = cachThucThucHien;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCachThucThucHien",
						String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, cachThucThucHien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThanhPhanHoSo() {
		return _thanhPhanHoSo;
	}

	@Override
	public void setThanhPhanHoSo(String thanhPhanHoSo) {
		_thanhPhanHoSo = thanhPhanHoSo;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhPhanHoSo", String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, thanhPhanHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDieuKienThucHien() {
		return _dieuKienThucHien;
	}

	@Override
	public void setDieuKienThucHien(String dieuKienThucHien) {
		_dieuKienThucHien = dieuKienThucHien;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDieuKienThucHien",
						String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, dieuKienThucHien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThoiHanGiaiQuyet() {
		return _thoiHanGiaiQuyet;
	}

	@Override
	public void setThoiHanGiaiQuyet(String thoiHanGiaiQuyet) {
		_thoiHanGiaiQuyet = thoiHanGiaiQuyet;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiHanGiaiQuyet",
						String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, thoiHanGiaiQuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDoiTuongThucHien() {
		return _doiTuongThucHien;
	}

	@Override
	public void setDoiTuongThucHien(String doiTuongThucHien) {
		_doiTuongThucHien = doiTuongThucHien;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDoiTuongThucHien",
						String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, doiTuongThucHien);
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

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, ketQuaXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCanCuPhapLy() {
		return _canCuPhapLy;
	}

	@Override
	public void setCanCuPhapLy(String canCuPhapLy) {
		_canCuPhapLy = canCuPhapLy;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCanCuPhapLy", String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, canCuPhapLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLePhi() {
		return _lePhi;
	}

	@Override
	public void setLePhi(String lePhi) {
		_lePhi = lePhi;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLePhi", String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, lePhi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCoQuanQltt() {
		return _coQuanQltt;
	}

	@Override
	public void setCoQuanQltt(String coQuanQltt) {
		_coQuanQltt = coQuanQltt;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCoQuanQltt", String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, coQuanQltt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLinhVucThuTuc() {
		return _linhVucThuTuc;
	}

	@Override
	public void setLinhVucThuTuc(String linhVucThuTuc) {
		_linhVucThuTuc = linhVucThuTuc;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLinhVucThuTuc", String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, linhVucThuTuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCoHieuLuc() {
		return _ngayCoHieuLuc;
	}

	@Override
	public void setNgayCoHieuLuc(Date ngayCoHieuLuc) {
		_ngayCoHieuLuc = ngayCoHieuLuc;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCoHieuLuc", Date.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, ngayCoHieuLuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHieuLuc() {
		return _ngayHetHieuLuc;
	}

	@Override
	public void setNgayHetHieuLuc(Date ngayHetHieuLuc) {
		_ngayHetHieuLuc = ngayHetHieuLuc;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHieuLuc", Date.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, ngayHetHieuLuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHuongDanThucHien() {
		return _huongDanThucHien;
	}

	@Override
	public void setHuongDanThucHien(String huongDanThucHien) {
		_huongDanThucHien = huongDanThucHien;

		if (_tthcThuTucHanhChinhRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThuTucHanhChinhRemoteModel.getClass();

				Method method = clazz.getMethod("setHuongDanThucHien",
						String.class);

				method.invoke(_tthcThuTucHanhChinhRemoteModel, huongDanThucHien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcThuTucHanhChinhRemoteModel() {
		return _tthcThuTucHanhChinhRemoteModel;
	}

	public void setTthcThuTucHanhChinhRemoteModel(
		BaseModel<?> tthcThuTucHanhChinhRemoteModel) {
		_tthcThuTucHanhChinhRemoteModel = tthcThuTucHanhChinhRemoteModel;
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

		Class<?> remoteModelClass = _tthcThuTucHanhChinhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcThuTucHanhChinhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcThuTucHanhChinhLocalServiceUtil.addTthcThuTucHanhChinh(this);
		}
		else {
			TthcThuTucHanhChinhLocalServiceUtil.updateTthcThuTucHanhChinh(this);
		}
	}

	@Override
	public TthcThuTucHanhChinh toEscapedModel() {
		return (TthcThuTucHanhChinh)ProxyUtil.newProxyInstance(TthcThuTucHanhChinh.class.getClassLoader(),
			new Class[] { TthcThuTucHanhChinh.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcThuTucHanhChinhClp clone = new TthcThuTucHanhChinhClp();

		clone.setId(getId());
		clone.setMaThuTuc(getMaThuTuc());
		clone.setTenThuTuc(getTenThuTuc());
		clone.setTrinhTuThucHien(getTrinhTuThucHien());
		clone.setCachThucThucHien(getCachThucThucHien());
		clone.setThanhPhanHoSo(getThanhPhanHoSo());
		clone.setDieuKienThucHien(getDieuKienThucHien());
		clone.setThoiHanGiaiQuyet(getThoiHanGiaiQuyet());
		clone.setDoiTuongThucHien(getDoiTuongThucHien());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setCanCuPhapLy(getCanCuPhapLy());
		clone.setLePhi(getLePhi());
		clone.setCoQuanQltt(getCoQuanQltt());
		clone.setLinhVucThuTuc(getLinhVucThuTuc());
		clone.setNgayCoHieuLuc(getNgayCoHieuLuc());
		clone.setNgayHetHieuLuc(getNgayHetHieuLuc());
		clone.setHuongDanThucHien(getHuongDanThucHien());

		return clone;
	}

	@Override
	public int compareTo(TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		int value = 0;

		if (getId() < tthcThuTucHanhChinh.getId()) {
			value = -1;
		}
		else if (getId() > tthcThuTucHanhChinh.getId()) {
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

		if (!(obj instanceof TthcThuTucHanhChinhClp)) {
			return false;
		}

		TthcThuTucHanhChinhClp tthcThuTucHanhChinh = (TthcThuTucHanhChinhClp)obj;

		long primaryKey = tthcThuTucHanhChinh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maThuTuc=");
		sb.append(getMaThuTuc());
		sb.append(", tenThuTuc=");
		sb.append(getTenThuTuc());
		sb.append(", trinhTuThucHien=");
		sb.append(getTrinhTuThucHien());
		sb.append(", cachThucThucHien=");
		sb.append(getCachThucThucHien());
		sb.append(", thanhPhanHoSo=");
		sb.append(getThanhPhanHoSo());
		sb.append(", dieuKienThucHien=");
		sb.append(getDieuKienThucHien());
		sb.append(", thoiHanGiaiQuyet=");
		sb.append(getThoiHanGiaiQuyet());
		sb.append(", doiTuongThucHien=");
		sb.append(getDoiTuongThucHien());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", canCuPhapLy=");
		sb.append(getCanCuPhapLy());
		sb.append(", lePhi=");
		sb.append(getLePhi());
		sb.append(", coQuanQltt=");
		sb.append(getCoQuanQltt());
		sb.append(", linhVucThuTuc=");
		sb.append(getLinhVucThuTuc());
		sb.append(", ngayCoHieuLuc=");
		sb.append(getNgayCoHieuLuc());
		sb.append(", ngayHetHieuLuc=");
		sb.append(getNgayHetHieuLuc());
		sb.append(", huongDanThucHien=");
		sb.append(getHuongDanThucHien());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maThuTuc</column-name><column-value><![CDATA[");
		sb.append(getMaThuTuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenThuTuc</column-name><column-value><![CDATA[");
		sb.append(getTenThuTuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trinhTuThucHien</column-name><column-value><![CDATA[");
		sb.append(getTrinhTuThucHien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cachThucThucHien</column-name><column-value><![CDATA[");
		sb.append(getCachThucThucHien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoSo</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dieuKienThucHien</column-name><column-value><![CDATA[");
		sb.append(getDieuKienThucHien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiHanGiaiQuyet</column-name><column-value><![CDATA[");
		sb.append(getThoiHanGiaiQuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doiTuongThucHien</column-name><column-value><![CDATA[");
		sb.append(getDoiTuongThucHien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLy</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>canCuPhapLy</column-name><column-value><![CDATA[");
		sb.append(getCanCuPhapLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lePhi</column-name><column-value><![CDATA[");
		sb.append(getLePhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanQltt</column-name><column-value><![CDATA[");
		sb.append(getCoQuanQltt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>linhVucThuTuc</column-name><column-value><![CDATA[");
		sb.append(getLinhVucThuTuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCoHieuLuc</column-name><column-value><![CDATA[");
		sb.append(getNgayCoHieuLuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHieuLuc</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHieuLuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>huongDanThucHien</column-name><column-value><![CDATA[");
		sb.append(getHuongDanThucHien());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maThuTuc;
	private String _tenThuTuc;
	private String _trinhTuThucHien;
	private String _cachThucThucHien;
	private String _thanhPhanHoSo;
	private String _dieuKienThucHien;
	private String _thoiHanGiaiQuyet;
	private String _doiTuongThucHien;
	private String _ketQuaXuLy;
	private String _canCuPhapLy;
	private String _lePhi;
	private String _coQuanQltt;
	private String _linhVucThuTuc;
	private Date _ngayCoHieuLuc;
	private Date _ngayHetHieuLuc;
	private String _huongDanThucHien;
	private BaseModel<?> _tthcThuTucHanhChinhRemoteModel;
}