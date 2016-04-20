/*--------------------*/

function QlvtLoaiHinhHoatDong() {
	this.id = '';
	
	this.noiDungHoSoId = '';
	this.hoSoThuTucId = '';
	
	this.maLoaiHinhHoatDong = '';
	this.textLoaiHinhHoatDong = '';
	
	this.maMauSon = '';
	this.textMauSon = '';
	
	this.maPhamViHoatDong = '';
	this.textPhamViHoatDong = '';
	
	this.soLuongPhuongTien = '';
	this.thietBiGiamSatHanhTrinh = '';
	
	//thu tu so voi danh sach
	this.stt = '';
	
}


function TblLoaiHinhHoatDong() {
	
	this.loaiHinhHoatDong;
	
	this.addRow = _addRow; // them moi 1 row vao table
	this.deleteRow = _deleteRow; //
	this.updateRow = _updateRow;
	this.updateLstLoaiHinhHoatDong = _updateLstLoaiHinhHoatDong;
	this.getLoaiHinhHoatDongByIndex = _getLoaiHinhHoatDongByIndex;
	this.setLstLoaiHinhHoatDong = _setLstLoaiHinhHoatDong;
	this.setValueRowCount = _setValueRowCount;
	this.addLstLoaiHinhHoatDong = _addLstLoaiHinhHoatDong;
	this.getSizeLstLoaiHinhHoatDong = _getSizeLstLoaiHinhHoatDong;
	this.getLstLoaiHinhHoatDong = _getLstLoaiHinhHoatDong;
	
	var setRowCount = 0;
	
	var lstLoaiHinhHoatDong = new Array();
	
	function _addRow(loaiHinhHoatDong) {
		console.log('_addRow', loaiHinhHoatDong);
		
		this.loaiHinhHoatDong = new QlvtLoaiHinhHoatDong();
		this.loaiHinhHoatDong = loaiHinhHoatDong;
		
		console.log('this _ loai hinh hoat dong', this.loaiHinhHoatDong);
		
		$('#tblLoaiHinhHoatDong tr:last').after(createRow(this.loaiHinhHoatDong, setRowCount));
		
		lstLoaiHinhHoatDong.push(this.loaiHinhHoatDong);
		console.info('_addRow _ lstLoaiHinhHoatDong', lstLoaiHinhHoatDong.length);
		
		_incrementRow();
		console.log('setRowCount', setRowCount);
	}
	
	function createRow(loaiHinhHoatDong, index) {
		
		var textRow = '<tr class="trTbl'+ index +'">';
		textRow = textRow + '<td>';
		textRow = textRow + '<input type="hidden" id="indexRow" name="indexRow" value="' + index +'">';
		textRow = textRow + '<input type="hidden" id="objectLoaiHinhHoatDong' + index + '" class="objectLoaiHinhHoatDong" name="objectLoaiHinhHoatDong" value="' + creatTextObjLoaiHinhHoatDong(loaiHinhHoatDong) +'">';
		textRow = textRow + '</td>';
		textRow = textRow + '</tr>';
		
		return textRow;
	}
	
	function creatTextObjLoaiHinhHoatDong(loaiHinhHoatDong) {
		var textValue = '';
		
		if (loaiHinhHoatDong.id === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.id + ";";
		}
		
		if (loaiHinhHoatDong.noiDungHoSoId === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.noiDungHoSoId + ";";
		}
		
		if (loaiHinhHoatDong.hoSoThuTucId === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.hoSoThuTucId + ";";
		}
		
		if (loaiHinhHoatDong.maLoaiHinhHoatDong === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.maLoaiHinhHoatDong + ";";
		}
		
		if (loaiHinhHoatDong.textLoaiHinhHoatDong === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.textLoaiHinhHoatDong + ";";
		}
		
		
		if (loaiHinhHoatDong.maMauSon === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.maMauSon + ";";
		}
		
		if (loaiHinhHoatDong.textMauSon === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.textMauSon + ";";
		}
		
		if (loaiHinhHoatDong.maPhamViHoatDong === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.maPhamViHoatDong + ";";
		}
		
		
		if (loaiHinhHoatDong.textPhamViHoatDong === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.textPhamViHoatDong + ";";
		}
		
		
		if (loaiHinhHoatDong.soLuongPhuongTien === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.soLuongPhuongTien + ";";
		}
		
		
		if (loaiHinhHoatDong.thietBiGiamSatHanhTrinh === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + loaiHinhHoatDong.thietBiGiamSatHanhTrinh + ";";
		}
		
		return textValue;
	}
	
	function _deleteRow(sttLoaiHinh) {
		var status = confirm('Bạn có muốn bỏ chọn loại hình kinh doanh ?');
		
		if (status === true) {
			/**
			ArrayName.splice(indexValueOfArray,1);
			1 removes 1 item starting at indexValueOfArray.
			*/
		
			//
			console.log('_deleteRow sttLoaiHinh--', sttLoaiHinh);
			
			var indexArray = null;
			
			lstLoaiHinhHoatDong.forEach(function(item, i) {
				if (item.stt == sttLoaiHinh) {
					//class <tr>, remove khoi giao dien
					$('.trTbl' + i).remove();
					indexArray = i;
				}
			});
			
			lstLoaiHinhHoatDong.splice(parseInt(indexArray), 1);
			console.info('_deleteRow _ lstLoaiHinhHoatDong---', lstLoaiHinhHoatDong.length);
			
			_subtractRow();
			
			//create lại các dòng từ index đã xóa
			//lstLoaiHinhHoatDong.forEach(function(item, i) {
			//	if (i >= indexRow) {
			//		//class <tr>, remove khoi giao dien
			//		$('#tblLoaiHinhHoatDong tr:last').after(createRow(item, i));
			//	}
			//});
			
		}
	}
	
	//update noi dung
	function _updateRow(indexRow) {
		var intIndexRow = parseInt(indexRow);
		lstLoaiHinhHoatDong.forEach(function(item, i) {
			if (intIndexRow === i) {
				pushDataPopup(intIndexRow, lstLoaiHinhHoatDong[intIndexRow]);
				return false;
			}
		});
		
	}
	
	//here
	function _updateLstLoaiHinhHoatDong(loaiHinhHoatDong) {
		console.log('_updateLstLoaiHinhHoatDong---', loaiHinhHoatDong);
		
		
		lstLoaiHinhHoatDong.forEach(function(item, i) {
			if (loaiHinhHoatDong.stt === item.stt) {
				_updateContentRow(i, loaiHinhHoatDong);
				return false;
			}
		});
	}
	
	//TODO minhnd upadate xem lai
	function _updateContentRow(indexRow, loaiHinhHoatDong) {
		$('#objectLoaiHinhHoatDong'+ indexRow).val(creatTextObjLoaiHinhHoatDong(loaiHinhHoatDong));
	}
	
	function _getLoaiHinhHoatDongByIndex(indexRow) {
		var intIndexRow = parseInt(indexRow);
		console.log('intIndexRow', intIndexRow);
		
		var loaiHinhHoatDong;
		lstLoaiHinhHoatDong.forEach(function(item, i) {
			if (intIndexRow === i) {
				loaiHinhHoatDong = item;
				return false;
			}
		});
		return loaiHinhHoatDong;
	}
	
	function _incrementRow() {  // Private method
		++setRowCount;
	}
	
	function _subtractRow() {
		--setRowCount;
	}
	
	function _setValueRowCount(count) {
		setRowCount = count;
	}
	
	function _getSizeLstLoaiHinhHoatDong() {
		return lstLoaiHinhHoatDong.length;
	}
	
	function _setLstLoaiHinhHoatDong(initListLoaiHinhHoatDong) {
		lstLoaiHinhHoatDong = initListLoaiHinhHoatDong;
	}
	
	function _addLstLoaiHinhHoatDong(loaiHinhHoatDong) {
		lstLoaiHinhHoatDong.push(loaiHinhHoatDong);
		_incrementRow();
	}
	
	function _getLstLoaiHinhHoatDong() {
		return lstLoaiHinhHoatDong;
	}
	
}

/**-------------------THUC HIEN function POPUP----------------------*/

function clearDataPopup() {
	//$('#nhanHieu').prop('selectedIndex', 0);/** reset value selected */
	//$('#soKhung').val('');
}

function pushDataPopup(rowIndex, loaiPhuongTien) {
	
	$('#phamVihd').val(loaiPhuongTien.maPhamViHoatDong);
	$('#soLgPhuongTien').val(loaiPhuongTien.soLuongPhuongTien);
	$('#giamSatHanhTrinh').val(loaiPhuongTien.thietBiGiamSatHanhTrinh);
	$('#mauSon').val(loaiPhuongTien.maMauSon);
	
}

function openPopup(idPopup) {
	$('#' + idPopup).modal('show');
}

function closePopup(idPopup) {
	$('#' + idPopup).modal('hide');
}

function validatorPopup(loaiHinhHoatDong) {
	
	console.log('validatorPopup', loaiHinhHoatDong);
	
	var maLoaiHinhHoatDong = $('#MA_LOAIHINH_KINHDOANH').val();
	console.log('maLoaiHinhHoatDong', maLoaiHinhHoatDong);
	
	if (loaiHinhHoatDong.soLuongPhuongTien === '') { alert("Số lượng phương tiện không được để trống !"); return false; }
	if (!isNormalInteger(loaiHinhHoatDong.soLuongPhuongTien)) { alert("Số lượng phương tiện phải là số !"); return false; }
	
	
	return true;
}



function pullDataPopup() {
	console.log('------pullDataPopup-----');
	
	var loaiHinhHoatDong = new QlvtLoaiHinhHoatDong();
	
	var phamVihd = $('#phamVihd').val();
	if (!(typeof phamVihd === "undefined")) {
		loaiHinhHoatDong.maPhamViHoatDong = phamVihd;
		loaiHinhHoatDong.textPhamViHoatDong = $("#phamVihd option[value='" + loaiHinhHoatDong.maPhamViHoatDong + "']").text();
	}
	
	var soLgPhuongTien = $('#soLgPhuongTien').val();
	if (!(typeof soLgPhuongTien === "undefined")) {
		loaiHinhHoatDong.soLuongPhuongTien = soLgPhuongTien;
	}
	
	var giamSatHanhTrinh = $('#giamSatHanhTrinh').val();
	if (!(typeof giamSatHanhTrinh === "undefined")) {
		loaiHinhHoatDong.thietBiGiamSatHanhTrinh = giamSatHanhTrinh;
	}
	
	var mauSon = $('#mauSon').val();
	if (!(typeof mauSon === "undefined")) {
		loaiHinhHoatDong.maMauSon = mauSon;
		loaiHinhHoatDong.textMauSon = $("#mauSon option[value='" + loaiHinhHoatDong.maMauSon + "']").text();
	}
	
	var sttLoaiHinh = $('#STT_LOAI_HINH').val();
	console.log('--STT_LOAI_HINH--', sttLoaiHinh);
	if (!(typeof sttLoaiHinh === "undefined")) {
		loaiHinhHoatDong.stt = sttLoaiHinh;
	}
	
	var maLoaiHinhHoatDong = $('#MA_LOAIHINH_KINHDOANH').val();
	console.log('--MA_LOAIHINH_KINHDOANH--', maLoaiHinhHoatDong);
	if (!(typeof maLoaiHinhHoatDong === "undefined")) {
		loaiHinhHoatDong.maLoaiHinhHoatDong = maLoaiHinhHoatDong;
	}
	
	return loaiHinhHoatDong;
}

/**-------------------THUC HIEN BUSINESS----------------------*/

var tblLoaiHinhHoatDong = new TblLoaiHinhHoatDong();

function businessCheckBox() {
	
}


//Lưu và giữ popup (add & edit)
function btnClickLuuLoaiHinhHoatDong() {
	
	var loaiHinhHoatDong = pullDataPopup();
	
	console.log('btnClickLuuLoaiHinhHoatDong', loaiHinhHoatDong);
	
	if (true === validatorPopup(loaiHinhHoatDong)) {
		
		var lstLoaiHinhHoatDong = tblLoaiHinhHoatDong.getLstLoaiHinhHoatDong();
		var exist = false;
		
		lstLoaiHinhHoatDong.forEach(function(item, i) {
			if (item.stt === loaiHinhHoatDong.stt) {
				exist = true;
			}
		});
		
		
		//them moi
		if (exist === false) {
			tblLoaiHinhHoatDong.addRow(loaiHinhHoatDong);
		} else {
			//sua
			updateLoaiHinhHoatDong(loaiHinhHoatDong);
		}
		
		//checked checkbox
		var maKinhDoanh = $('#MA_LOAIHINH_KINHDOANH').val();
		$("#loaiHinhKdvt_" + maKinhDoanh).prop('checked', true);
		
		$("#dataLoaiHinhKdvt_" + maKinhDoanh).prop('checked', true);
		
		
		//show hidden
		$("#bochon_" + maKinhDoanh).prop('hidden', false);
	}
}

function updateLoaiHinhHoatDong(loaiHinhHoatDong) {
	
	var loaiHinhHoatDongUpdate = null;
	var lstLoaiHinhHoatDong = tblLoaiHinhHoatDong.getLstLoaiHinhHoatDong();
	
	lstLoaiHinhHoatDong.forEach(function(item, i) {
		if (item.stt === loaiHinhHoatDong.stt) {
			loaiHinhHoatDongUpdate = item;
		}
	})
	
	var phamVihd = $('#phamVihd').val();
	if (!(typeof phamVihd === "undefined")) {
		loaiHinhHoatDongUpdate.maPhamViHoatDong = phamVihd;
		loaiHinhHoatDongUpdate.textPhamViHoatDong = $("#phamVihd option[value='" + loaiHinhHoatDongUpdate.maPhamViHoatDong + "']").text();
	}
	
	var soLgPhuongTien = $('#soLgPhuongTien').val();
	if (!(typeof soLgPhuongTien === "undefined")) {
		loaiHinhHoatDongUpdate.soLuongPhuongTien = soLgPhuongTien;
	}
	
	var giamSatHanhTrinh = $('#giamSatHanhTrinh').val();
	if (!(typeof giamSatHanhTrinh === "undefined")) {
		loaiHinhHoatDongUpdate.thietBiGiamSatHanhTrinh = giamSatHanhTrinh;
	}
	
	var mauSon = $('#mauSon').val();
	if (!(typeof mauSon === "undefined")) {
		loaiHinhHoatDongUpdate.maMauSon = mauSon;
		loaiHinhHoatDongUpdate.textMauSon = $("#mauSon option[value='" + loaiHinhHoatDongUpdate.maMauSon + "']").text();
	}
	
	var sttLoaiHinh = $('#STT_LOAI_HINH').val();
	console.log('--STT_LOAI_HINH--', sttLoaiHinh);
	if (!(typeof sttLoaiHinh === "undefined")) {
		loaiHinhHoatDongUpdate.stt = sttLoaiHinh;
	}
	
	
	//update
	tblLoaiHinhHoatDong.updateLstLoaiHinhHoatDong(loaiHinhHoatDongUpdate);
	
}

///ban vao row, check da nham loai hinh kinh doan chua
function checkExistLoaiHinhHoatDong(sttLoaiHinh) {
	console.log('--checkExistLoaiHinhHoatDong--', sttLoaiHinh);
	
	var lstLoaiHinhHoatDong = tblLoaiHinhHoatDong.getLstLoaiHinhHoatDong();
	lstLoaiHinhHoatDong.forEach(function(item, i) {
		console.log('item 300', item);
		if (item.stt === sttLoaiHinh) {
			console.log('item 302', item, 'sttLoaiHinh', sttLoaiHinh);
			pushDataPopup(i, item)
		}
	});
}


function btnClickSuaLoaiHinhHoatDong() {
	
	var index = $('#indexPopup').val();
	var phuongTienUpdate = tblPhuongTienDangKi.getPhuongTienByIndex(index);
	
	var bienSo = $('#bienSoXe').val();
	if (!(typeof bienSo === "undefined")) {
		phuongTienUpdate.bienSo = bienSo;
	}
	
	var trongTaiGhe = $('#trongTaiGhe').val();
	if (!(typeof trongTaiGhe === "undefined")) {
		phuongTienUpdate.trongTai = trongTaiGhe;
	}
	
	var trongTai = $('#trongTai').val();
	if (!(typeof trongTai === "undefined")) {
		phuongTienUpdate.trongTai = trongTai;
	}
	
	var soGiayPhepMatHong = $('#soGiayPhepMatHong').val();
	if (!(typeof soGiayPhepMatHong === "undefined")) {
		phuongTienUpdate.soGiayPhepMatHong = soGiayPhepMatHong;
	}
	
	var hanhTrinhDeNghi = $('#hanhTrinhDeNghi').val();
	if (!(typeof hanhTrinhDeNghi === "undefined")) {
		phuongTienUpdate.hanhTrinhDeNghi = hanhTrinhDeNghi;
	}
	
	var thoiGianDuKienKhoiHanh = $('#thoiGianDuKienKhoiHanh').val();
	if (!(typeof thoiGianDuKienKhoiHanh === "undefined")) {
		phuongTienUpdate.thoiGianDuKienKhoiHanh = thoiGianDuKienKhoiHanh;
	}
	
	var loaiHangVanChuyen = $('#loaiHangVanChuyen').val();
	if (!(typeof loaiHangVanChuyen === "undefined")) {
		phuongTienUpdate.loaiHangVanChuyen = loaiHangVanChuyen;
	}
	
	var namSanXuat = $('#namSanXuat').val();
	if (!(typeof namSanXuat === "undefined")) {
		phuongTienUpdate.namSanXuat = namSanXuat;
	}
	
	var nuocSanXuat = $('#nuocSanXuat').val();
	if (!(typeof nuocSanXuat === "undefined")) {
		phuongTienUpdate.nuocSanXuat = nuocSanXuat;
	}
	
	var nhanHieu = $('select#nhanHieu').val();
	if (!(typeof nhanHieu === "undefined")) {
		phuongTienUpdate.nhanHieu = nhanHieu;
		phuongTienUpdate.textNhanHieu = $("#nhanHieu option[value='" + phuongTienUpdate.nhanHieu + "']").text();
	}
	
	var soKhung = $('#soKhung').val();
	if (!(typeof soKhung === "undefined")) {
		phuongTienUpdate.soKhung = soKhung;
	}
	
	var soMay = $('#soMay').val();
	if (!(typeof soMay === "undefined")) {
		phuongTienUpdate.soMay = soMay;
	}
	
	var mauSon = $('#mauSon').val();
	if (!(typeof mauSon === "undefined")) {
		phuongTienUpdate.mauSon = mauSon;
	}
	
	var soChoNgoi = $('#soChoNgoi').val();
	if (!(typeof soChoNgoi === "undefined")) {
		phuongTienUpdate.soChoNgoi = soChoNgoi;
	}
	
	var thoiGianXinCapPhepTu = $('#thoiGianCapFrom').val();
	if (!(typeof thoiGianXinCapPhepTu === "undefined")) {
		phuongTienUpdate.thoiGianXinCapPhepTu = thoiGianXinCapPhepTu;
	}
	
	var thoiGianXinCapPhepDen = $('#thoiGianCapTo').val();
	if (!(typeof thoiGianXinCapPhepDen === "undefined")) {
		phuongTienUpdate.thoiGianXinCapPhepDen = thoiGianXinCapPhepDen;
	}
	
	
	var hinhThucHoatDong = $('select#hinhThucHoatDong').val();
	if (!(typeof hinhThucHoatDong === "undefined")) {
		phuongTienUpdate.hinhThucHoatDong = hinhThucHoatDong;
		phuongTienUpdate.textHinhThucHoatDong = $("#hinhThucHoatDong option[value='" + phuongTienUpdate.hinhThucHoatDong + "']").text();
	}
	
	var tuyenHoatDong = $('select#tuyenHoatDong').val();
	if (!(typeof tuyenHoatDong === "undefined")) {
		phuongTienUpdate.tuyenHoatDong = tuyenHoatDong;
		phuongTienUpdate.textTuyenHoatDong = $("#tuyenHoatDong option[value='" + phuongTienUpdate.tuyenHoatDong + "']").text();
	}
	
	var tuyenHoatDong1 = $('select#tuyenHoatDong1').val();
	if (!(typeof tuyenHoatDong1 === "undefined")) {
		phuongTienUpdate.tuyenHoatDong1 = tuyenHoatDong1;
		phuongTienUpdate.textTuyenHoatDong1 = $("#tuyenHoatDong1 option[value='" + phuongTienUpdate.tuyenHoatDong1 + "']").text();
	}
	
	var tuyenHoatDong2 = $('select#tuyenHoatDong2').val();
	if (!(typeof tuyenHoatDong2 === "undefined")) {
		phuongTienUpdate.tuyenHoatDong2 = tuyenHoatDong2;
		phuongTienUpdate.textTuyenHoatDong2 = $("#tuyenHoatDong2 option[value='" + phuongTienUpdate.tuyenHoatDong2 + "']").text();
	}
	
	var loaiHinhHoatDong = $('select#loaiHinhHoatDong').val();
	if (!(typeof loaiHinhHoatDong === "undefined")) {
		phuongTienUpdate.loaiHinhHoatDong = loaiHinhHoatDong;
		phuongTienUpdate.textLoaiHinhHoatDong = $("#loaiHinhHoatDong option[value='" + phuongTienUpdate.loaiHinhHoatDong + "']").text();
	}
	
	
	var cuaKhauXuatNhap = $('select#cuaKhauXuatNhap').val();
	if (!(typeof cuaKhauXuatNhap === "undefined")) {
		phuongTienUpdate.cuaKhauXuatNhap = cuaKhauXuatNhap;
		phuongTienUpdate.textCuaKhauXuatNhap = $("#cuaKhauXuatNhap option[value='" + phuongTienUpdate.cuaKhauXuatNhap + "']").text();
	}
	
	console.log('btnSuaPhuongTien', phuongTienUpdate);
	
	var dsDiemDung = "";
	var textDiemDung = "";
	var selĐiemung = $('select#select_diem_dung_right_id').val();
	if (!(typeof selĐiemung === "undefined")) {
		$("#select_diem_dung_right_id option").each(function() {
			dsDiemDung = dsDiemDung + "#" + this.value;
			textDiemDung = textDiemDung + ", " + this.text;
		});
		
		if (dsDiemDung.length > 1)
		{
			dsDiemDung = dsDiemDung.substring(1);
			textDiemDung = textDiemDung.substring(1);
		}
		phuongTienUpdate.diemDungDoDangKy = dsDiemDung;
		phuongTienUpdate.textDiemDungDoDangKy = textDiemDung;
	}
	
	if (true === validatorPopup(phuongTienUpdate)) {
		tblPhuongTienDangKi.updateLstPhuongTien(index, phuongTienUpdate);
		closePopup('modalPhuongTien');
	}
}



$(document).ready(function() {
	console.log("ready! document");
	
	$('.objectLoaiHinhHoatDong').each(function(i, obj) {//loop through each input[class=objectLoaiHinhHoatDong]
		
		var sProperties = obj.value.split(";");
		
		var loaiHinh = new QlvtLoaiHinhHoatDong();
		loaiHinh.id = sProperties[0];
		
		loaiHinh.noiDungHoSoId = sProperties[1];
		loaiHinh.hoSoThuTucId = sProperties[2];
		
		loaiHinh.maLoaiHinhHoatDong = sProperties[3];
		//loaiHinh.textLoaiHinhHoatDong = sProperties[4];
		
		loaiHinh.maMauSon = sProperties[5];
		//loaiHinh.textMauSon = sProperties[6];
		
		loaiHinh.maPhamViHoatDong = sProperties[7];
		//loaiHinh.textPhamViHoatDong = sProperties[8];
		
		loaiHinh.soLuongPhuongTien = sProperties[9];
		loaiHinh.thietBiGiamSatHanhTrinh = sProperties[10];
		
		loaiHinh.stt = sProperties[11];
		
		tblLoaiHinhHoatDong.addLstLoaiHinhHoatDong(loaiHinh);
		
	});
});

function iconSuaPhuongTien(indexRow) {
	//console.log('iconSuaPhuongTien - indexRow: ' + indexRow);
	//$('#btnLuuPhuongTien').attr('style', 'display: none');
	//$('#btnThemPhuongTien').attr('style', 'display: none');
	//$('#btnSuaPhuongTien').attr('style', 'display: inline-flex');
	
	//tblPhuongTienDangKi.updateRow(indexRow);
	//openPopup('modalPhuongTien');
}

function iconXoaLoaiHinhHoatDong(sttLoaiHinhHoatDong, maLoaiHinhHoatDong) {
	//tblLoaiHinhHoatDong.deleteRow(indexRow);
	
	tblLoaiHinhHoatDong.deleteRow(sttLoaiHinhHoatDong);
	
	//uncheck
	$("#loaiHinhKdvt_" + maLoaiHinhHoatDong).prop('checked', false);
	
	$("#dataLoaiHinhKdvt_" + maLoaiHinhHoatDong).prop('checked', false);
	
	//hidden
	$("#bochon_" + maLoaiHinhHoatDong).prop('hidden', true);
	
	var maLoaiHinhHoatDongCurrent = $('#MA_LOAIHINH_KINHDOANH').val();
	
	if (maLoaiHinhHoatDongCurrent === maLoaiHinhHoatDong) {
		$('#phamVihd').prop('selectedIndex', 0);/** reset value selected */
		$('#soLgPhuongTien').val('');
		$('#giamSatHanhTrinh').prop('selectedIndex', 0);/** reset value selected */
		$('#mauSon').prop('selectedIndex', 0);/** reset value selected */
	}
	
}
