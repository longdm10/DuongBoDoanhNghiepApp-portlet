package vn.dtt.duongbo.ipay;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.util.PortalUtil;
import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanImpl;
import vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil;
import vn.dtt.duongbo.utils.format.ConvertUtil;

/**
 * Servlet implementation class DemoServlet
 */
public class DuongBoServlet extends HttpServlet {

	private static Log log = LogFactoryUtil.getLog(DuongBoServlet.class);
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DuongBoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			xuLyYeuCauKeyPay(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			xuLyYeuCauKeyPay(request, response);
		} catch (Exception e) {
//			e.printStackTrace();
		} 

		// String color = request.getParameter("color");
		// PrintWriter out = response.getWriter();
		// out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n"
		// + "Hello World" + "</font> \n" + "</body> \n" + "</html>");
	}

	private void xuLyYeuCauKeyPay(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
//		// reading the user input
//		log.info("--------------Vao YTeServlet------------------");
//		
//		long userId = PortalUtil.getUserId(request);
//		long doanhNghiepId = 0;
//		DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
//		doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
//        
//		String merchantTransId = request.getParameter("merchant_trans_id");
//		String merchantCode = request.getParameter("merchant_code");
//		String responseCode = request.getParameter("response_code");
//		String transId = request.getParameter("trans_id");
//		String goodCode = request.getParameter("good_code");
//		String netCost = request.getParameter("net_cost");
//		String shipFee = request.getParameter("ship_fee");
//		String bankCode = request.getParameter("bank_code");
//		String currencyCode = request.getParameter("currency_code");
//		String trans_id = request.getParameter("trans_id");
//        String xmlDescription = request.getParameter("xml_description");
//
//		log.info(
//				"==>IPN KeyPay>>>>>>>>> good_code= " + goodCode
//						+ "==net_cost:" + netCost + "====response_code===="
//						+ responseCode);
//		boolean notYetPay = true;
//		
////		if(merchantTransId != null && merchantTransId.trim().length() >0)
//		
//		TthcXacNhanThanhToan xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.findByMaTuSinh(goodCode.trim());
//        if (xacNhanThanhToan != null) {
//        	notYetPay = false;	// Hoso da duoc thanh toan
//        }
//		
//		ThanhToanKeyPay thanhToanKeyPayReq = ThanhToanKeyPayLocalServiceUtil.findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(goodCode, merchantCode, merchantTransId, Constants.KEYPAY_REQUEST);
//		if(notYetPay){
//			if (responseCode != null && responseCode.trim().equalsIgnoreCase("00")) {
//				try{
//					String thongTinHoSo = thanhToanKeyPayReq.getThongTinHoSo();
//					
//					if(thongTinHoSo.contains("_")){
//					   	String hoSoThuTucId= thongTinHoSo.substring(thongTinHoSo.lastIndexOf("_") + 1, thongTinHoSo.length());
//			        		
//		        		xacNhanThanhToan = new TthcXacNhanThanhToanImpl();
//		    			xacNhanThanhToan.setHinhThucThanhToan(Constants.THANH_TOAN_KEYPAY);
//		    			xacNhanThanhToan.setSoTien(Long.parseLong(netCost));
//		    			xacNhanThanhToan.setThongTinXacNhan(responseCode);
//		    			xacNhanThanhToan.setMaTuSinh(goodCode);
//		    			xacNhanThanhToan.setNgayTao(new Date());
//		    			xacNhanThanhToan.setNguoiTao(PortalUtil.getUserId(request));
//		    			xacNhanThanhToan.setLoaiPhi(Constants.PHI_THAM_DINH_CODE);
//		    			KeyPayUtils.xacNhanThanhToanHoSo(hoSoThuTucId, xacNhanThanhToan);
//		                log.info("=======IPN_Digital_Receive.jsp========Thanh toan phi online cho ho so HoSoTTHCCong co ID:::" + hoSoThuTucId);
//					}else{
//						xacNhanThanhToan = new TthcXacNhanThanhToanImpl();
//						xacNhanThanhToan.setHinhThucThanhToan(Constants.THANH_TOAN_KEYPAY);
//						xacNhanThanhToan.setSoTien(Long.parseLong(netCost));
//						xacNhanThanhToan.setThongTinXacNhan(responseCode);
//						xacNhanThanhToan.setMaTuSinh(goodCode);
//						xacNhanThanhToan.setNgayTao(new Date());
//						xacNhanThanhToan.setNguoiTao(PortalUtil.getUserId(request));
//						xacNhanThanhToan.setLoaiPhi(Constants.PHI_THAM_DINH_CODE);
////						xacNhanThanhToan.setId(CounterLocalServiceUtil.increment(TthcXacNhanThanhToan.class.getName()));
////						xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.addTthcXacNhanThanhToan(xacNhanThanhToan);
//						
//						KeyPayUtils.xacNhanThanhToanHoSo(thongTinHoSo, xacNhanThanhToan);
//						log.info("=======IPN_Digital_Receive.jsp========Thanh toan phi online cho ho so HoSoTTHCCong co ID:::" + thongTinHoSo);
//					}
//				   	
//				}catch(Exception e){
//		            e.printStackTrace();
//		        }
//		        
//			}
//		}
//		KeyPayUtils.addThanhToanKeyPay(doanhNghiepId, merchantTransId, ConvertUtil.convertToLong(trans_id), merchantCode, bankCode, Long.parseLong(shipFee), currencyCode, xmlDescription, ConvertUtil.convertToLong(netCost), goodCode, responseCode, thanhToanKeyPayReq.getThongTinHoSo(), Constants.KEYPAY_RESPONSE, Constants.KEYPAY_IPN_RECEIVER);
	}
}
