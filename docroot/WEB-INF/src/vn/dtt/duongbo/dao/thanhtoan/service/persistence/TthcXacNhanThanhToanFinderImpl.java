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

package vn.dtt.duongbo.dao.thanhtoan.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanImpl;
import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.utils.format.DateUtils;
import vn.dtt.duongbo.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * The persistence interface for the mot cua dien bien ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcXacNhanThanhToanPersistenceImpl
 * @see TthcXacNhanThanhToanUtil
 * @generated
 */
public class TthcXacNhanThanhToanFinderImpl  extends BasePersistenceImpl<TthcXacNhanThanhToan> implements TthcXacNhanThanhToanFinder {
	
	private Log log = LogFactoryUtil.getLog(TthcXacNhanThanhToanFinderImpl.class);
	
	public List<TthcXacNhanThanhToan> findTthcXacNhanThanhToan(String maGiaoDich,String loaiGiaoDich,String hinhThucThanhToan,long toChucQuanLy, String trangThai , String trangThaiSearch, Date tuNgay, Date denNGay, String tenDoanhNGhiep, int year, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT * FROM tthc_xacnhanthanhtoan WHERE TOCHUCQUANLY = " + toChucQuanLy + " and TRANGTHAI in (" + ((trangThaiSearch != null && trangThaiSearch.trim().length() > 0) ? trangThaiSearch : trangThai) + ")");
			if (tenDoanhNGhiep != null && tenDoanhNGhiep.trim().length() > 0) {
				query.append(" and tendoanhnghiep like '%").append(tenDoanhNGhiep.trim()).append("%'");
			}
			if(maGiaoDich!=null && maGiaoDich.trim().length() >0){
				query.append(" and matusinh like '%").append(maGiaoDich.trim()).append("%'");
			}
//			
//			if(loaiGiaoDich!=null && loaiGiaoDich.trim().length()>0){
//				query.append(" and loaiphi like '%").append(loaiGiaoDich.trim()).append("%'");
//			}
			if(hinhThucThanhToan!=null && hinhThucThanhToan.trim().length()>0){
				query.append(" and hinhthucthanhtoan like '%").append(hinhThucThanhToan.trim()).append("%'");
			}
/*			
			if (tuNgay != null && denNGay != null) {
				query.append(" and ngaytao between '").append(FormatData.parseDateToTring(DateUtils.addTime(tuNgay, 0, 0, 0))).append("' and '").append(FormatData.parseDateToTring(DateUtils.addTime(denNGay, 23, 59, 59))).append("'");
			}
*/
			if (trangThai.contains(String.valueOf(Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN))) {
				if (Validator.isNotNull(tuNgay)) {
					query.append(" AND ngaytao >=  '").append(vn.dtt.duongbo.utils.format.FormatData.parseDateToTring(tuNgay)).append("'");
				}
				
				if (Validator.isNotNull(denNGay)) {
					query.append(" AND ngaytao <=  '").append(FormatData.parseDateToTring(denNGay)).append("'");
				}
			} else {
				if (Validator.isNotNull(tuNgay)) {
					query.append(" AND ngayxacnhan >=  '").append(FormatData.parseDateToTring(tuNgay)).append("'");
				}
				
				if (Validator.isNotNull(denNGay)) {
					query.append(" AND ngayxacnhan <=  '").append(FormatData.parseDateToTring(denNGay)).append("'");
				}
			}
			
			if (year > 0) {
				query.append(" and DATE_FORMAT(ngaytao,'%Y') = ").append(year);
			}
			query.append(" order by ngaytao desc ");
			
			log.info("=========findTthcXacNhanThanhToan========" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TthcXacNhanThanhToan",TthcXacNhanThanhToanImpl.class);

			return (List<TthcXacNhanThanhToan>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<TthcXacNhanThanhToan>();
	}

	public int countTthcXacNhanThanhToan(String maGiaoDich,String loaiGiaoDich,String hinhThucThanhToan,long toChucQuanLy, String trangThai, String trangThaiSearch, Date tuNgay, Date denNGay, String tenDoanhNGhiep, int year) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT count(*) as total FROM tthc_xacnhanthanhtoan WHERE TOCHUCQUANLY = " + toChucQuanLy + " and TRANGTHAI in (" + ((trangThaiSearch != null && trangThaiSearch.trim().length() > 0) ? trangThaiSearch : trangThai) + ")");
			if (tenDoanhNGhiep != null && tenDoanhNGhiep.trim().length() > 0) {
				query.append(" and tendoanhnghiep like '%").append(tenDoanhNGhiep.trim()).append("%'");
			}
			if(maGiaoDich!=null && maGiaoDich.trim().length() >0){
				query.append(" and matusinh like '%").append(maGiaoDich.trim()).append("%'");
			}
//			if(loaiGiaoDich!=null && loaiGiaoDich.trim().length()>0){
//				query.append(" and loaiphi like '%").append(loaiGiaoDich.trim()).append("%'");
//			}
			if(hinhThucThanhToan!=null && hinhThucThanhToan.trim().length()>0){
				query.append(" and hinhthucthanhtoan like '%").append(hinhThucThanhToan.trim()).append("%'");
			}
			/*
			if (tuNgay != null && denNGay != null) {
				query.append(" and ngaytao between '").append(FormatData.parseDateToTring(DateUtils.addTime(tuNgay, 0, 0, 0))).append("' and '").append(FormatData.parseDateToTring(DateUtils.addTime(denNGay, 23, 59, 59))).append("' ");
			}
			*/
			if (trangThai.contains(String.valueOf(Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN))) {
				if (Validator.isNotNull(tuNgay)) {
					query.append(" AND ngaytao >=  '").append(FormatData.parseDateToTring(tuNgay)).append("'");
				}
				
				if (Validator.isNotNull(denNGay)) {
					query.append(" AND ngaytao <=  '").append(FormatData.parseDateToTring(denNGay)).append("'");
				}
			} else {
				if (Validator.isNotNull(tuNgay)) {
					query.append(" AND ngayxacnhan >=  '").append(FormatData.parseDateToTring(tuNgay)).append("'");
				}
				
				if (Validator.isNotNull(denNGay)) {
					query.append(" AND ngayxacnhan <=  '").append(FormatData.parseDateToTring(denNGay)).append("'");
				}
			}
			if (year > 0) {
				query.append(" and DATE_FORMAT(ngaytao,'%Y') = ").append(year);
			}
			
			log.info("=========countTthcXacNhanThanhToan========" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { 
					return count.intValue(); 
				}
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	

	public List<TthcXacNhanThanhToan> findByTrangThaiXacNhanAndToChucQuanLy(long toChucQuanLy, String trangThai, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT * FROM tthc_xacnhanthanhtoan WHERE TOCHUCQUANLY = " + toChucQuanLy + " and TRANGTHAI in (" + trangThai + ")");
			String sql = query.toString();
			
			log.debug("=========findByTrangThaiXacNhanAndToChucQuanLy========" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TthcXacNhanThanhToan",TthcXacNhanThanhToanImpl.class);

			return (List<TthcXacNhanThanhToan>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<TthcXacNhanThanhToan>();
	}
	
	public TthcXacNhanThanhToan findByMaTuSinh(String maTuSinh) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT * FROM tthc_xacnhanthanhtoan WHERE matusinh = ? ");
			String sql = query.toString();
			
			log.debug("=========findByMaTuSinh========" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TthcXacNhanThanhToan",TthcXacNhanThanhToanImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(maTuSinh.trim());

			return (TthcXacNhanThanhToan)q.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public int countByTrangThaiXacNhanAndToChucQuanLy(long toChucQuanLy, String trangThai) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT count(*) as total FROM tthc_xacnhanthanhtoan WHERE TOCHUCQUANLY = " + toChucQuanLy + " and TRANGTHAI in (" + trangThai + ")");
			String sql = query.toString();
			log.debug("=========countByTrangThaiXacNhanAndToChucQuanLy========" + sql);
		
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { 
					return count.intValue(); 
				}
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public int sumTienByTrangThaiXacNhanAndToChucQuanLy(int hinhthucthanhtoan, String loaiPhi, int trangThai, long tochucquanly, Date ngayGiaoDichTu, Date ngayGiaoDichDen) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT sum(sotien)  as total FROM tthc_xacnhanthanhtoan where tochucquanly = " + tochucquanly + " and hinhthucthanhtoan = " + hinhthucthanhtoan + " and loaiphi = '" + loaiPhi.trim() + "' and trangthai = " + trangThai);
			if (ngayGiaoDichDen != null && ngayGiaoDichTu != null) {
				query.append(" and ngaytao >= '").append(FormatData.parseDateToTring(DateUtils.addTime(ngayGiaoDichTu, 0,0,0))).append("' and ngaytao <= '").append(FormatData.parseDateToTring(DateUtils.addTime(ngayGiaoDichDen, 23,59,59))).append("'");
			}
			log.debug("=========sumTienByTrangThaiXacNhanAndToChucQuanLy========" + query.toString());
			log.debug("=========sumTienByTrangThaiXacNhanAndToChucQuanLy========");
		
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { 
					return count.intValue(); 
				}
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public int countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(int hinhthucthanhtoan, String loaiPhi, int trangThai, long tochucquanly, Date ngayGiaoDichTu, Date ngayGiaoDichDen) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*)  as total FROM tthc_xacnhanthanhtoan where tochucquanly = " + tochucquanly + " and hinhthucthanhtoan = " + hinhthucthanhtoan + " and loaiphi = '" + loaiPhi.trim() + "' and trangthai = " + trangThai);
			if (ngayGiaoDichDen != null && ngayGiaoDichTu != null) {
				query.append(" and ngaytao >= '").append(FormatData.parseDateToTring(DateUtils.addTime(ngayGiaoDichTu, 0,0,0))).append("' and ngaytao <= '").append(FormatData.parseDateToTring(DateUtils.addTime(ngayGiaoDichDen, 23,59,59))).append("'");
			}
			log.debug("=========countSoHoSoByTrangThaiXacNhanAndToChucQuanLy========" + query.toString());
		
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { 
					return count.intValue(); 
				}
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
}