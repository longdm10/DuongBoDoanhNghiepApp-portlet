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

package vn.dtt.duongbo.dao.thanhtoan.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcXacNhanThanhToanClp extends BaseModelImpl<TthcXacNhanThanhToan>
	implements TthcXacNhanThanhToan {
	public TthcXacNhanThanhToanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcXacNhanThanhToan.class;
	}

	@Override
	public String getModelClassName() {
		return TthcXacNhanThanhToan.class.getName();
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
		attributes.put("maTuSinh", getMaTuSinh());
		attributes.put("soTien", getSoTien());
		attributes.put("hinhThucThanhToan", getHinhThucThanhToan());
		attributes.put("thongTinXacNhan", getThongTinXacNhan());
		attributes.put("taiLieuDinhKem", getTaiLieuDinhKem());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("ngayXacNhan", getNgayXacNhan());
		attributes.put("nguoiXacNhan", getNguoiXacNhan());
		attributes.put("toChucQuanLy", getToChucQuanLy());
		attributes.put("trangThaiXacNhan", getTrangThaiXacNhan());
		attributes.put("yKienXuLy", getYKienXuLy());
		attributes.put("loaiPhi", getLoaiPhi());
		attributes.put("tenDoanhNghiep", getTenDoanhNghiep());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTuSinh = (String)attributes.get("maTuSinh");

		if (maTuSinh != null) {
			setMaTuSinh(maTuSinh);
		}

		Long soTien = (Long)attributes.get("soTien");

		if (soTien != null) {
			setSoTien(soTien);
		}

		Long hinhThucThanhToan = (Long)attributes.get("hinhThucThanhToan");

		if (hinhThucThanhToan != null) {
			setHinhThucThanhToan(hinhThucThanhToan);
		}

		String thongTinXacNhan = (String)attributes.get("thongTinXacNhan");

		if (thongTinXacNhan != null) {
			setThongTinXacNhan(thongTinXacNhan);
		}

		Long taiLieuDinhKem = (Long)attributes.get("taiLieuDinhKem");

		if (taiLieuDinhKem != null) {
			setTaiLieuDinhKem(taiLieuDinhKem);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
		}

		Date ngayXacNhan = (Date)attributes.get("ngayXacNhan");

		if (ngayXacNhan != null) {
			setNgayXacNhan(ngayXacNhan);
		}

		Long nguoiXacNhan = (Long)attributes.get("nguoiXacNhan");

		if (nguoiXacNhan != null) {
			setNguoiXacNhan(nguoiXacNhan);
		}

		Long toChucQuanLy = (Long)attributes.get("toChucQuanLy");

		if (toChucQuanLy != null) {
			setToChucQuanLy(toChucQuanLy);
		}

		Integer trangThaiXacNhan = (Integer)attributes.get("trangThaiXacNhan");

		if (trangThaiXacNhan != null) {
			setTrangThaiXacNhan(trangThaiXacNhan);
		}

		String yKienXuLy = (String)attributes.get("yKienXuLy");

		if (yKienXuLy != null) {
			setYKienXuLy(yKienXuLy);
		}

		String loaiPhi = (String)attributes.get("loaiPhi");

		if (loaiPhi != null) {
			setLoaiPhi(loaiPhi);
		}

		String tenDoanhNghiep = (String)attributes.get("tenDoanhNghiep");

		if (tenDoanhNghiep != null) {
			setTenDoanhNghiep(tenDoanhNghiep);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTuSinh() {
		return _maTuSinh;
	}

	@Override
	public void setMaTuSinh(String maTuSinh) {
		_maTuSinh = maTuSinh;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTuSinh", String.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, maTuSinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoTien() {
		return _soTien;
	}

	@Override
	public void setSoTien(long soTien) {
		_soTien = soTien;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoTien", long.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, soTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHinhThucThanhToan() {
		return _hinhThucThanhToan;
	}

	@Override
	public void setHinhThucThanhToan(long hinhThucThanhToan) {
		_hinhThucThanhToan = hinhThucThanhToan;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucThanhToan",
						long.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel,
					hinhThucThanhToan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThongTinXacNhan() {
		return _thongTinXacNhan;
	}

	@Override
	public void setThongTinXacNhan(String thongTinXacNhan) {
		_thongTinXacNhan = thongTinXacNhan;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinXacNhan",
						String.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, thongTinXacNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTaiLieuDinhKem() {
		return _taiLieuDinhKem;
	}

	@Override
	public void setTaiLieuDinhKem(long taiLieuDinhKem) {
		_taiLieuDinhKem = taiLieuDinhKem;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiLieuDinhKem", long.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, taiLieuDinhKem);
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

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, ngayTao);
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

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTao", long.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, nguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayXacNhan() {
		return _ngayXacNhan;
	}

	@Override
	public void setNgayXacNhan(Date ngayXacNhan) {
		_ngayXacNhan = ngayXacNhan;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayXacNhan", Date.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, ngayXacNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiXacNhan() {
		return _nguoiXacNhan;
	}

	@Override
	public void setNguoiXacNhan(long nguoiXacNhan) {
		_nguoiXacNhan = nguoiXacNhan;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiXacNhan", long.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, nguoiXacNhan);
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

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucQuanLy", long.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, toChucQuanLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrangThaiXacNhan() {
		return _trangThaiXacNhan;
	}

	@Override
	public void setTrangThaiXacNhan(int trangThaiXacNhan) {
		_trangThaiXacNhan = trangThaiXacNhan;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiXacNhan", int.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, trangThaiXacNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKienXuLy() {
		return _yKienXuLy;
	}

	@Override
	public void setYKienXuLy(String yKienXuLy) {
		_yKienXuLy = yKienXuLy;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setYKienXuLy", String.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, yKienXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiPhi() {
		return _loaiPhi;
	}

	@Override
	public void setLoaiPhi(String loaiPhi) {
		_loaiPhi = loaiPhi;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiPhi", String.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, loaiPhi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDoanhNghiep() {
		return _tenDoanhNghiep;
	}

	@Override
	public void setTenDoanhNghiep(String tenDoanhNghiep) {
		_tenDoanhNghiep = tenDoanhNghiep;

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDoanhNghiep",
						String.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, tenDoanhNghiep);
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

		if (_tthcXacNhanThanhToanRemoteModel != null) {
			try {
				Class<?> clazz = _tthcXacNhanThanhToanRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_tthcXacNhanThanhToanRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcXacNhanThanhToanRemoteModel() {
		return _tthcXacNhanThanhToanRemoteModel;
	}

	public void setTthcXacNhanThanhToanRemoteModel(
		BaseModel<?> tthcXacNhanThanhToanRemoteModel) {
		_tthcXacNhanThanhToanRemoteModel = tthcXacNhanThanhToanRemoteModel;
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

		Class<?> remoteModelClass = _tthcXacNhanThanhToanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcXacNhanThanhToanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcXacNhanThanhToanLocalServiceUtil.addTthcXacNhanThanhToan(this);
		}
		else {
			TthcXacNhanThanhToanLocalServiceUtil.updateTthcXacNhanThanhToan(this);
		}
	}

	@Override
	public TthcXacNhanThanhToan toEscapedModel() {
		return (TthcXacNhanThanhToan)ProxyUtil.newProxyInstance(TthcXacNhanThanhToan.class.getClassLoader(),
			new Class[] { TthcXacNhanThanhToan.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcXacNhanThanhToanClp clone = new TthcXacNhanThanhToanClp();

		clone.setId(getId());
		clone.setMaTuSinh(getMaTuSinh());
		clone.setSoTien(getSoTien());
		clone.setHinhThucThanhToan(getHinhThucThanhToan());
		clone.setThongTinXacNhan(getThongTinXacNhan());
		clone.setTaiLieuDinhKem(getTaiLieuDinhKem());
		clone.setNgayTao(getNgayTao());
		clone.setNguoiTao(getNguoiTao());
		clone.setNgayXacNhan(getNgayXacNhan());
		clone.setNguoiXacNhan(getNguoiXacNhan());
		clone.setToChucQuanLy(getToChucQuanLy());
		clone.setTrangThaiXacNhan(getTrangThaiXacNhan());
		clone.setYKienXuLy(getYKienXuLy());
		clone.setLoaiPhi(getLoaiPhi());
		clone.setTenDoanhNghiep(getTenDoanhNghiep());
		clone.setGhiChu(getGhiChu());

		return clone;
	}

	@Override
	public int compareTo(TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		int value = 0;

		if (getId() < tthcXacNhanThanhToan.getId()) {
			value = -1;
		}
		else if (getId() > tthcXacNhanThanhToan.getId()) {
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

		if (!(obj instanceof TthcXacNhanThanhToanClp)) {
			return false;
		}

		TthcXacNhanThanhToanClp tthcXacNhanThanhToan = (TthcXacNhanThanhToanClp)obj;

		long primaryKey = tthcXacNhanThanhToan.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maTuSinh=");
		sb.append(getMaTuSinh());
		sb.append(", soTien=");
		sb.append(getSoTien());
		sb.append(", hinhThucThanhToan=");
		sb.append(getHinhThucThanhToan());
		sb.append(", thongTinXacNhan=");
		sb.append(getThongTinXacNhan());
		sb.append(", taiLieuDinhKem=");
		sb.append(getTaiLieuDinhKem());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", ngayXacNhan=");
		sb.append(getNgayXacNhan());
		sb.append(", nguoiXacNhan=");
		sb.append(getNguoiXacNhan());
		sb.append(", toChucQuanLy=");
		sb.append(getToChucQuanLy());
		sb.append(", trangThaiXacNhan=");
		sb.append(getTrangThaiXacNhan());
		sb.append(", yKienXuLy=");
		sb.append(getYKienXuLy());
		sb.append(", loaiPhi=");
		sb.append(getLoaiPhi());
		sb.append(", tenDoanhNghiep=");
		sb.append(getTenDoanhNghiep());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuSinh</column-name><column-value><![CDATA[");
		sb.append(getMaTuSinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTien</column-name><column-value><![CDATA[");
		sb.append(getSoTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hinhThucThanhToan</column-name><column-value><![CDATA[");
		sb.append(getHinhThucThanhToan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinXacNhan</column-name><column-value><![CDATA[");
		sb.append(getThongTinXacNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiLieuDinhKem</column-name><column-value><![CDATA[");
		sb.append(getTaiLieuDinhKem());
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
			"<column><column-name>ngayXacNhan</column-name><column-value><![CDATA[");
		sb.append(getNgayXacNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiXacNhan</column-name><column-value><![CDATA[");
		sb.append(getNguoiXacNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucQuanLy</column-name><column-value><![CDATA[");
		sb.append(getToChucQuanLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiXacNhan</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiXacNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yKienXuLy</column-name><column-value><![CDATA[");
		sb.append(getYKienXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiPhi</column-name><column-value><![CDATA[");
		sb.append(getLoaiPhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenDoanhNghiep</column-name><column-value><![CDATA[");
		sb.append(getTenDoanhNghiep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maTuSinh;
	private long _soTien;
	private long _hinhThucThanhToan;
	private String _thongTinXacNhan;
	private long _taiLieuDinhKem;
	private Date _ngayTao;
	private long _nguoiTao;
	private Date _ngayXacNhan;
	private long _nguoiXacNhan;
	private long _toChucQuanLy;
	private int _trangThaiXacNhan;
	private String _yKienXuLy;
	private String _loaiPhi;
	private String _tenDoanhNghiep;
	private String _ghiChu;
	private BaseModel<?> _tthcXacNhanThanhToanRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.class;
}