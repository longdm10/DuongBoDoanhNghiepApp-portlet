
function QlvtPhuongTienDangKy() {
	this.id = '';
	this.bienSo = '';
	
	this.nhanHieu = '';
	this.textNhanHieu = '';
	
	this.trongTai = '';
	this.namSanXuat = '';
	
	this.hinhThucHoatDong = '';
	this.textHinhThucHoatDong = '';
	
	this.cuaKhauXuatNhap = '';
	this.textCuaKhauXuatNhap = '';
	
	this.loaiHinhHoatDong = '';
	this.textLoaiHinhHoatDong = '';
	
	this.tuyenHoatDong1 = '';
	this.textTuyenHoatDong1 = '';
	
	this.tuyenHoatDong2 = '';
	this.textTuyenHoatDong2 = '';
	
	
	
	this.loaiHangVanChuyen = '';
	this.thoiGianDuKienKhoiHanh = '';
	this.noiDungHoSoId = '';
	this.hoSoThuTucId = '';
	this.diemDungDoDangKy = '';
	this.textDiemDungDoDangKy = '';
	this.hanhTrinhDeNghi = '';
	this.soGiayPhepMatHong = '';
	this.nuocSanXuat = '';
	
	
	//BienHieu
	this.soKhung = '';
	this.mauSon = '';
	this.soMay = '';
	this.soChoNgoi='';
}


function TblPhuongTienDangKi() {
	
	this.phuongTien;
	
	this.addRow = _addRow; // them moi 1 row vao table
	this.deleteRow = _deleteRow; //
	this.updateRow = _updateRow;
	this.updateLstPhuongTien = _updateLstPhuongTien;
	this.getPhuongTienByIndex = _getPhuongTienByIndex;
	this.setLstPhuongTien = _setLstPhuongTien;
	this.setValueRowCount = _setValueRowCount;
	this.addLstPhuongTien = _addLstPhuongTien;
	this.getSizeLstPhuongTien = _getSizeLstPhuongTien;
	this.getLstPhuongTien = _getLstPhuongTien;
	
	var setRowCount = 0;
	
	var lstPhuongTien = new Array();
	
	function _addRow(phuongTien) {
		console.log('_addRow', phuongTien);
		
		this.phuongTien = new QlvtPhuongTienDangKy();
		this.phuongTien = phuongTien;
		
		console.log('this _ phuong tien', this.phuongTien);
		
		var loaiLVTT = $('#loaiLVTT').val();
		if ('DB_QLVT_TN' === loaiLVTT) {
			var loaiTTHC = $('#loaiTTHC').val();
			if ('PH_3' === loaiTTHC || 'PH_1' === loaiTTHC ||'PH_2' == loaiTTHC ||'PH_4' === loaiTTHC) {
				$('#tblPhuongTienDangKi tr:last').after(createRowVTTrongNuoc(this.phuongTien, setRowCount));
			} else if ('BH_1' === loaiTTHC||'BH_2'=== loaiTTHC) {
				$('#tblPhuongTienDangKi tr:last').after(createRowBienHieu(this.phuongTien, setRowCount));
			}
			
		}
		
		lstPhuongTien.push(this.phuongTien);
		console.info('_addRow _ lstPhuongTien', lstPhuongTien.length);
		
		_incrementRow();
		console.log('setRowCount', setRowCount);
	}
	
	
	function createRowVTTrongNuoc(phuongTien, index) {
		
		
		var textRow = '<tr class="trTbl'+ index +'">';
		var loaiHinhHoatDong = document.getElementById("loaiHinhHoatDong");
		var giaTri = loaiHinhHoatDong.options[loaiHinhHoatDong.selectedIndex].value;
		
		textRow = textRow + '<td class="text-center"><span id="spanStt' + index + '">' + (index + 1) +'</span></td>';
		textRow = textRow + '<td class="text-center"><span id="spanNhanHieu'+ index + '">' + phuongTien.textNhanHieu + '</span></td>';
		textRow = textRow + '<td><span id="spanBienSoXe'+ index + '">' + phuongTien.bienSo + '</span></td>';
		
		
		textRow = textRow + '<td><span id="spanTrongTai'+ index + '">' + phuongTien.trongTai + '</span></td>';
		textRow = textRow + '<td><span id="spanNuocSanXuat'+ index + '">' + phuongTien.nuocSanXuat + '</span></td>';
		textRow = textRow + '<td><span id="spanNamSanXuat'+ index + '">' + phuongTien.namSanXuat + '</span></td>';
		if (giaTri == 'DM_LHHD_HKTCD') {
			textRow = textRow + '<td><span id="spanLoaiHinhHd'+ index + '">' + phuongTien.textLoaiHinhHoatDong + '</span><br><span id="spanTuyenHd1'+ index + '">' + phuongTien.textTuyenHoatDong1 + '</span><br><span id="spanTuyenHd2'+ index + '">' + phuongTien.textTuyenHoatDong2 + '</span></td>';
		}else{
			textRow = textRow + '<td><span id="spanLoaiHinhHd'+ index + '">' + phuongTien.textLoaiHinhHoatDong + '</span></td>';
		}
		textRow = textRow + '<input type="hidden" id="indexRow" name="indexRow" value="' + index +'">';
		textRow = textRow + '<input type="hidden" id="objectPhuongTien' + index + '" class="objectPhuongTien" name="objectPhuongTien" value="' + creatTextObjPhuongTien(phuongTien) +'">';
		
		textRow = textRow + '<td class="decoy"></td>';
		textRow = textRow + '<td class="text-center colFixedPos">';
			textRow = textRow + '<a onclick="iconSuaPhuongTien(' + (index) + ')" title="Sửa" style="margin-right:5px"><i class="fa3 fa fa-pencil-square-o"></i></a>';
			textRow = textRow + '<a onclick="iconXoaPhuongTien(' + (index) + ')" title="Xóa"><i class="fa3 fa fa-trash-o"></i></a>';
		textRow = textRow + '</td>';
		textRow = textRow + '</tr>';
		return textRow;
		
	}	
	
	
	function createRowBienHieu(phuongTien, index) {
		
		
		var textRow = '<tr class="trTbl'+ index +'">';
		
		
		textRow = textRow + '<td class="text-center"><span id="spanStt' + index + '">' + (index + 1) +'</span></td>';
		textRow = textRow + '<td class="text-center"><span id="spanNhanHieu'+ index + '">' + phuongTien.textNhanHieu + '</span></td>';
		textRow = textRow + '<td><span id="spanBienSoXe'+ index + '">' + phuongTien.bienSo + '</span></td>';
		textRow = textRow + '<td><span id="spanSoKhung'+ index + '">' + phuongTien.soKhung + '</span></td>';
		textRow = textRow + '<td><span id="spanSoMay'+ index + '">' + phuongTien.soMay + '</span></td>';
		textRow = textRow + '<td><span id="spanNamSanXuat'+ index + '">' + phuongTien.namSanXuat + '</span></td>';
		textRow = textRow + '<td><span id="spanMauSon'+ index + '">' + phuongTien.mauSon + '</span></td>';
		textRow = textRow + '<td><span id="spanSoChoNgoi'+ index + '">' + phuongTien.soChoNgoi + '</span></td>';
		textRow = textRow + '<input type="hidden" id="indexRow" name="indexRow" value="' + index +'">';
		textRow = textRow + '<input type="hidden" id="objectPhuongTien' + index + '" class="objectPhuongTien" name="objectPhuongTien" value="' + creatTextObjPhuongTien(phuongTien) +'">';
		textRow = textRow + '<td class="decoy"></td>';
		textRow = textRow + '<td class="text-center colFixedPos">';
			textRow = textRow + '<a onclick="iconSuaPhuongTien(' + (index) + ')" title="Sửa" style="margin-right:5px"><i class="fa3 fa fa-pencil-square-o"></i></a>';
			textRow = textRow + '<a onclick="iconXoaPhuongTien(' + (index) + ')" title="Xóa"><i class="fa3 fa fa-trash-o"></i></a>';
		textRow = textRow + '</td>';
		textRow = textRow + '</tr>';
		

		return textRow;
		
	}	
	
	
	
	function creatTextObjPhuongTien(phuongTien) {
		var textValue = '';
		
		if (phuongTien.id === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.id + ";";
		}
		
		if (phuongTien.nhanHieu === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.nhanHieu + ";";
		}
		
		
		if (phuongTien.bienSo === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.bienSo + ";";
		}
		
		
		if (phuongTien.trongTai === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.trongTai + ";";
		}

		if (phuongTien.nuocSanXuat === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.nuocSanXuat + ";";
		}
		if (phuongTien.namSanXuat === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.namSanXuat + ";";
		}
		if (phuongTien.loaiHinhHoatDong === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.loaiHinhHoatDong + ";";
		}
		
		if (phuongTien.tuyenHoatDong1 === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.tuyenHoatDong1 + ";";
		}
		
		if (phuongTien.tuyenHoatDong2 === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.tuyenHoatDong2 + ";";
		}
		
		if (phuongTien.noiDungHoSoId === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.noiDungHoSoId + ";";
		}
		
		if (phuongTien.hoSoThuTucId === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.hoSoThuTucId + ";";
		}
		
		if (phuongTien.soKhung === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.soKhung + ";";
		}
		
		if (phuongTien.soMay === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.soMay + ";";
		}
		
		if (phuongTien.mauSon === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.mauSon + ";";
		}
		
		if (phuongTien.soChoNgoi === '') {
			textValue = textValue + 'NULL' + ";";
		} else {
			textValue = textValue + phuongTien.soChoNgoi + ";";
		}
		
		
		return textValue;
	}
	
	function _deleteRow(indexRow) {
		var status = confirm('Bạn có muốn xóa phương tiện ?');
		
		if (status === true) {
			/**
			ArrayName.splice(indexValueOfArray,1);
			1 removes 1 item starting at indexValueOfArray.
			*/
			
			//remove tất cả các dòng trở về sau
			var indexRow = parseInt(indexRow);
			console.log('_deleteRow indexRow', indexRow);
			
			lstPhuongTien.forEach(function(item, i) {
				if (i >= indexRow) {
					//class <tr>, remove khoi giao dien
					$('.trTbl' + i).remove();
				}
			});
			
			lstPhuongTien.splice(parseInt(indexRow), 1);
			console.info('_deleteRow _ lstPhuongTien', lstPhuongTien.length);
			
			_subtractRow();
			
			//create lại các dòng từ index đã xóa
			lstPhuongTien.forEach(function(item, i) {
				if (i >= indexRow) {
					//class <tr>, remove khoi giao dien
					$('#tblPhuongTienDangKi tr:last').after(createRow(item, i));
				}
			});
			
		}
	}
	
	function _updateRow(indexRow) {
		var intIndexRow = parseInt(indexRow);
		lstPhuongTien.forEach(function(item, i) {
			if (intIndexRow === i) {
				pushDataPopup(intIndexRow, lstPhuongTien[intIndexRow]);
				return false;
			}
		});
		
	}
	
	function _updateLstPhuongTien(indexRow, phuongTien) {
		console.log('_updateLstPhuongTien_indexRow', indexRow);
		console.log('_updateLstPhuongTien_phuongtien', phuongTien);
		
		var intIndexRow = parseInt(indexRow);
		
		lstPhuongTien.forEach(function(item, i) {
			if (intIndexRow === i) {
				
				item.bienSo = phuongTien.bienSo;
				item.textBienSo = phuongTien.textBienSo;
				item.trongTai = phuongTien.trongTai;
				item.namSanXuat = phuongTien.namSanXuat;
				item.nuocSanXuat = phuongTien.nuocSanXuat;
				
				item.nhanHieu = phuongTien.nhanHieu;
				item.textNhanHieu = phuongTien.textNhanHieu;
				
				item.soKhung = phuongTien.soKhung;
				item.soMay = phuongTien.soMay;
				item.mauSon = phuongTien.mauSon;
				item.loaiHangVanChuyen = phuongTien.loaiHangVanChuyen;
				item.thoiGianDuKienKhoiHanh = phuongTien.thoiGianDuKienKhoiHanh;
				item.thoiGianXinCapPhepTu = phuongTien.thoiGianXinCapPhepTu;
				item.thoiGianXinCapPhepDen = phuongTien.thoiGianXinCapPhepDen;
				
				item.hinhThucHoatDong = phuongTien.hinhThucHoatDong;
				item.textHinhThucHoatDong = phuongTien.textHinhThucHoatDong;
				
				item.tuyenHoatDong1 = phuongTien.tuyenHoatDong1;
				item.tuyenHoatDong2 = phuongTien.tuyenHoatDong2;
				
				item.textTuyenHoatDong1 = phuongTien.textTuyenHoatDong1;
				item.textTuyenHoatDong2 = phuongTien.textTuyenHoatDong2;
				
				item.diemDungDoDangKy = phuongTien.diemDungDoDangKy;
				item.hanhTrinhDeNghi = phuongTien.hanhTrinhDeNghi;
				item.soGiayPhepMatHong = phuongTien.soGiayPhepMatHong;
				
				item.textDiemDungDoDangKy = phuongTien.textDiemDungDoDangKy;
				
				item.cuaKhauXuatNhap = phuongTien.cuaKhauXuatNhap;
				item.textCuaKhauXuatNhap = phuongTien.textCuaKhauXuatNhap;
				
				_updateContentRow(indexRow, phuongTien);
				
				return false;
			}
		});
	}
	
	//TODO minhnd upadate xem lai
	function _updateContentRow(indexRow, phuongTien) {
		$('#spanBienSoXe' + indexRow).text(phuongTien.bienSo);
		$('#spanTrongTai' + indexRow).text(phuongTien.trongTai);
		$('#spanNamSanXuat' + indexRow).text(phuongTien.namSanXuat);
		$('#spanNuocSanXuat' + indexRow).text(phuongTien.nuocSanXuat);
		
		//$('#spanNhanHieu' + indexRow).text(phuongTien.nhanHieu);
		$('#spanNhanHieu' + indexRow).text(phuongTien.textNhanHieu);
		
		$('#spanSoKhung' + indexRow).text(phuongTien.soKhung);
		$('#spanSoMay' + indexRow).text(phuongTien.soMay);
		$('#spanMauSon' + indexRow).text(phuongTien.mauSon);
		$('#spanSoChoNgoi' + indexRow).text(phuongTien.soChoNgoi);
		$('#spanThoiGianDeNghi' + indexRow).text(phuongTien.thoiGianXinCapPhepTu + ' - ' + phuongTien.thoiGianXinCapPhepDen);
		$('#spanThoiGianKhoiHanhDuKien' + indexRow).text(phuongTien.thoiGianDuKienKhoiHanh);
		$('#spanLoaiHangVanChuyen' + indexRow).text(phuongTien.loaiHangVanChuyen);
		
		//$('#spanHinhThucHd' + indexRow).text(phuongTien.hinhThucHoatDong);
		$('#spanHinhThucHd' + indexRow).text(phuongTien.textHinhThucHoatDong);
		
		$('#spanLoaiHinhHd' + indexRow).text(phuongTien.textLoaiHinhHoatDong);
		
		//$('#spanHinhThucHd' + indexRow).text(phuongTien.hinhThucHoatDong);
		$('#spanTuyenHd' + indexRow).text(phuongTien.textTuyenHoatDong1);
		$('#spanTuyenHd' + indexRow).text(phuongTien.textTuyenHoatDong2);
		
		
		$('#spanDiemDungNghi' + indexRow).text(phuongTien.textDiemDungDoDangKy);
		$('#spanHanhTrinhDeNghi' + indexRow).text(phuongTien.hanhTrinhDeNghi);
		$('#spanSoGiayPhepMatHong' + indexRow).text(phuongTien.soGiayPhepMatHong);
		
		//$('#spanCuaKhau' + indexRow).text(phuongTien.cuaKhauXuatNhap);()
		$('#spanCuaKhau' + indexRow).text(phuongTien.textCuaKhauXuatNhap);
		
		$('#objectPhuongTien'+ indexRow).val(creatTextObjPhuongTien(phuongTien));
	}
	
	function _getPhuongTienByIndex(indexRow) {
		var intIndexRow = parseInt(indexRow);
		console.log('intIndexRow', intIndexRow);
		
		var phuongTien;
		lstPhuongTien.forEach(function(item, i) {
			if (intIndexRow === i) {
				phuongTien = item;
				return false;
			}
		});
		return phuongTien;
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
	
	function _getSizeLstPhuongTien() {
		return lstPhuongTien.length;
	}
	
	function _setLstPhuongTien(initListPhuongTien) {
		lstPhuongTien = initListPhuongTien;
	}
	
	function _addLstPhuongTien(phuongTien) {
		lstPhuongTien.push(phuongTien);
		_incrementRow();
	}
	
	function _getLstPhuongTien() {
		return lstPhuongTien;
	}
}

/**-------------------THUC HIEN function POPUP----------------------*/

function clearDataPopup() {
	
	$('#bienSoXe').val('');
	$('#trongTaiGhe').val('');
	$('#namSanXuat').val('');
	$('#nuocSanXuat').val('');
	
	$('#tuyenHoatDong1').prop('selectedIndex', 0);/** reset value selected */
	$('#tuyenHoatDong2').prop('selectedIndex', 0);/** reset value selected */
	$('#loaiHinhHoatDong').prop('selectedIndex', 0);/** reset value selected */
	$('#nhanHieu').prop('selectedIndex', 0);/** reset value selected */
	
	$('#soKhung').val('');
	$('#soMay').val('');
	$('#mauSon').val('');
	$('#thoiGianCapFrom').val('');
	$('#thoiGianCapTo').val('');
	$('#loaiHangVanChuyen').val('');
	$('#thoiGianDuKienKhoiHanh').val('');
	
	$('#thoiGianDuKienKhoiHanh').val('');
	
	$('#diemDungDoDangKy').val('');
	$('#hanhTrinhDeNghi').val('');
	$('#soGiayPhepMatHong').val('');
	
	$('#hinhThucHoatDong').prop('selectedIndex', 0);
	$('#cuaKhauXuatNhap').prop('selectedIndex', 0);
	$('#tuyenHoatDong').prop('selectedIndex', 0);
	$('#soChoNgoi').val('');
	
	copyOptions('select_diem_dung_left_original_id','select_diem_dung_left_id');
	copyOptions('','select_diem_dung_right_id');
}

function pushDataPopup(rowIndex, phuongTien) {
	$('#indexPopup').val(rowIndex);
	
	$('#bienSo').val(phuongTien.bienSo);
	$('#trongTaiGhe').val(phuongTien.trongTai);
	$('#trongTai').val(phuongTien.trongTai);
	
	$('#namSanXuat').val(phuongTien.namSanXuat);
	$('#nuocSanXuat').val(phuongTien.nuocSanXuat);
	$('#loaiHangVanChuyen').val(phuongTien.loaiHangVanChuyen);
	
	$('#nhanHieu').val(phuongTien.nhanHieu);
	
	$('#soKhung').val(phuongTien.soKhung);
	$('#soMay').val(phuongTien.soMay);
	$('#mauSon').val(phuongTien.mauSon);
	$('#soChoNgoi').prop('selectedIndex', 0);
	
	$('#thoiGianCapFrom').val(phuongTien.thoiGianXinCapPhepTu);
	$('#thoiGianCapTo').val(phuongTien.thoiGianXinCapPhepDen);
	$('#thoiGianDuKienKhoiHanh').val(phuongTien.thoiGianDuKienKhoiHanh);
	$('#hanhTrinhDeNghi').val(phuongTien.hanhTrinhDeNghi);
	$('#soGiayPhepMatHong').val(phuongTien.soGiayPhepMatHong);
	
	$('#hinhThucHoatDong').val(phuongTien.hinhThucHoatDong);
	$('#cuaKhauXuatNhap').val(phuongTien.cuaKhauXuatNhap);
	$('#tuyenHoatDong').val(phuongTien.tuyenHoatDong);
	
	
	$('#tuyenHoatDong1').val(phuongTien.tuyenHoatDong1);
	$('#tuyenHoatDong2').val(phuongTien.tuyenHoatDong2);
	$('#loaiHinhHoatDong').val(phuongTien.loaiHinhHoatDong);
	
	
	
	
	
	var dsDiemDungDangKy = "";
	if(phuongTien.diemDungDoDangKy.indexOf("#") > -1){
		dsDiemDungDangKy = phuongTien.diemDungDoDangKy.split("#");
	} else {
		dsDiemDungDangKy = phuongTien.diemDungDoDangKy.split(",");
	}
	copyOptionsFromList(dsDiemDungDangKy, 'select_diem_dung_left_original_id', 'select_diem_dung_left_id', 'select_diem_dung_right_id');
}

function openPopup(idPopup) {
	$('#' + idPopup).modal('show');
}

function closePopup(idPopup) {
	$('#' + idPopup).modal('hide');
}


function isSpclChar(input){
	   var iChars = "!@#$%^&*()+=-[]\\\';,./{}|\":<>?";
	   if(input.indexOf(iChars) != -1) {
	     alert ("Không được nhập ký tự đặc biệt!");
	     return false;
	   }
	   return true;
	}
function isSpclChar123(input){
	   var iChars = "!@#$%^&*()+=[]\\\';,/{}|\":<>?";
	   if(input.indexOf(iChars) != -1) {
	     alert ("Không được nhập ký tự đặc biệt!");
	     return false;
	   }
	   return true;
	}

function validatorPopup(phuongTien) {
	
	console.log('validatorPopup', phuongTien);
	
	var loaiTTHC = $('#loaiTTHC').val();
	
	
	
	if ('BH_1' === loaiTTHC || 'BH_2' === loaiTTHC) {
		
		if (phuongTien.bienSo === '') { alert('Biển số không được để trống'); return false; }
		isSpclChar123(phuongTien.bienSo);
		
		if (phuongTien.soKhung === '') { alert('Số khung không được để trống'); return false; }
		isSpclChar123(phuongTiensoMay.soKhung);
		if (phuongTien.soMay === '') { alert('Số máy không được để trống'); return false; }
		isSpclChar123(phuongTiensoMay.soMay);
		
		if (phuongTien.namSanXuat === '') { alert('Năm sản xuất không được để trống'); return false; }
		if (!isNormalInteger(phuongTien.namSanXuat)) { alert('Năm sản xuất phải là số'); return false; }
		
		
		if (phuongTien.mauSon === '') { alert('Màu Sơn không được để trống'); return false; }
		isSpclChar(phuongTien.mauSon);
		if (phuongTien.soChoNgoi === '') { alert('Số chỗ ngồi không được để trống'); return false; }
		if (!isNormalInteger(phuongTien.soChoNgoi)) { alert('Số chỗ ngồi phải là số'); return false; }
	
	} else if ('PH_1' === loaiTTHC || 'PH_2' === loaiTTHC || 'PH_3' === loaiTTHC) {
		if (phuongTien.bienSo === '') { alert('Biển số không được để trống'); return false; }
		isSpclChar123(phuongTien.bienSo);
		if (phuongTien.trongTai === '') { alert('Sức chứa không được để trống'); return false; }
		isSpclChar(phuongTien.trongTai);
		if (phuongTien.namSanXuat === '') { alert('Năm sản xuất không được để trống'); return false; }
		if (!isNormalInteger(phuongTien.namSanXuat)) { alert('Năm sản xuất phải là số'); return false; }
		if (phuongTien.nuocSanXuat === '') { alert('Nước sản xuất không được để trống'); return false; }
		isSpclChar(phuongTien.nuocSanXuat);
		
	} else {
//		if (phuongTien.bienSo === '') {}
//		if (phuongTien.trongTai === '') {}
//		if (phuongTien.namSanXuat === '') {}
//		if (phuongTien.nuocSanXuat === '') {}
//		if (phuongTien.soKhung === '') {}
//		if (phuongTien.soMay === '') {}
//		if (phuongTien.mauSon === '') {}
//		if (phuongTien.soChoNgoi === '') {}
//		if (phuongTien.thoiGianXinCapPhepTu === '') {}
//		if (phuongTien.thoiGianXinCapPhepTu === '') {}
	}
	return true;
}

function validateUniqueBienSo(phuongTien) {
	var lstPhuongTien = tblPhuongTienDangKi.getLstPhuongTien();
	if (tblPhuongTienDangKi.getSizeLstPhuongTien() === 0) {
		return true;
	} else {
		var check = true;
		lstPhuongTien.forEach(function(item, i) {
			if (item.bienSo === phuongTien.bienSo) {
				check = false;
				return false;
			}
		});
		return check;
	}
}

function pullDataPopup() {
	console.log('------pullDataPopup-----');
	
	var phuongTien = new QlvtPhuongTienDangKy();
	
	var bienSo = $('#bienSoXe').val();
	if (!(typeof bienSo === "undefined")) {
		phuongTien.bienSo = bienSo;
	}
	
	var hanhTrinhDeNghi = $('#hanhTrinhDeNghi').val();
	if (!(typeof hanhTrinhDeNghi === "undefined")) {
		phuongTien.hanhTrinhDeNghi = hanhTrinhDeNghi;
	}
	
	var loaiHangVanChuyen = $('#loaiHangVanChuyen').val();
	if (!(typeof loaiHangVanChuyen === "undefined")) {
		phuongTien.loaiHangVanChuyen = loaiHangVanChuyen;
	}
	
	var soGiayPhepMatHong = $('#soGiayPhepMatHong').val();
	if (!(typeof soGiayPhepMatHong === "undefined")) {
		phuongTien.soGiayPhepMatHong = soGiayPhepMatHong;
	}
	
	var trongTaiGhe = $('#trongTaiGhe').val();
	if (!(typeof trongTaiGhe === "undefined")) {
		phuongTien.trongTai = trongTaiGhe;
	}
	
	var trongTai = $('#trongTai').val();
	if (!(typeof trongTai === "undefined")) {
		phuongTien.trongTai = trongTai;
	}
	
	var namSanXuat = $('#namSanXuat').val();
	if (!(typeof namSanXuat === "undefined")) {
		phuongTien.namSanXuat = namSanXuat;
	}
	
	var nuocSanXuat = $('#nuocSanXuat').val();
	if (!(typeof nuocSanXuat === "undefined")) {
		phuongTien.nuocSanXuat = nuocSanXuat;
	}
	
	var nhanHieu = $('select#nhanHieu').val();
	if (!(typeof nhanHieu === "undefined")) {
		phuongTien.nhanHieu = nhanHieu;
		phuongTien.textNhanHieu = $("#nhanHieu option[value='" + phuongTien.nhanHieu + "']").text();
	}
	
	var soKhung = $('#soKhung').val();
	if (!(typeof soKhung === "undefined")) {
		phuongTien.soKhung = soKhung;
	}
	
	var soMay = $('#soMay').val();
	if (!(typeof soMay === "undefined")) {
		phuongTien.soMay = soMay;
	}
	
	var mauSon = $('#mauSon').val();
	if (!(typeof mauSon === "undefined")) {
		phuongTien.mauSon = mauSon;
	}
	
	var soChoNgoi = $('#soChoNgoi').val();
	if (!(typeof soChoNgoi === "undefined")) {
		phuongTien.soChoNgoi = soChoNgoi;
	}
	
	var thoiGianDuKienKhoiHanh = $('#thoiGianDuKienKhoiHanh').val();
	if (!(typeof thoiGianDuKienKhoiHanh === "undefined")) {
		phuongTien.thoiGianDuKienKhoiHanh = thoiGianDuKienKhoiHanh;
	}
	
	var thoiGianXinCapPhepTu = $('#thoiGianCapFrom').val();
	if (!(typeof thoiGianXinCapPhepTu === "undefined")) {
		phuongTien.thoiGianXinCapPhepTu = thoiGianXinCapPhepTu;
	}
	
	var thoiGianXinCapPhepDen = $('#thoiGianCapTo').val();
	if (!(typeof thoiGianXinCapPhepDen === "undefined")) {
		phuongTien.thoiGianXinCapPhepDen = thoiGianXinCapPhepDen;
	}
	
	
	var hinhThucHoatDong = $('select#hinhThucHoatDong').val();
	if (!(typeof hinhThucHoatDong === "undefined")) {
		phuongTien.hinhThucHoatDong = hinhThucHoatDong;
		phuongTien.textHinhThucHoatDong = $("#hinhThucHoatDong option[value='" + phuongTien.hinhThucHoatDong + "']").text();
	}
	
	var tuyenHoatDong = $('select#tuyenHoatDong').val();
	if (!(typeof tuyenHoatDong === "undefined")) {
		phuongTien.tuyenHoatDong = tuyenHoatDong;
		phuongTien.textTuyenHoatDong = $("#tuyenHoatDong option[value='" + phuongTien.tuyenHoatDong + "']").text();
	}
	

	var tuyenHoatDong1 = $('select#tuyenHoatDong1').val();
	if (!(typeof tuyenHoatDong1 === "undefined")) {
		phuongTien.tuyenHoatDong1 = tuyenHoatDong1;
		phuongTien.textTuyenHoatDong1 = $("#tuyenHoatDong1 option[value='" + phuongTien.tuyenHoatDong1 + "']").text();
	}
	
	var tuyenHoatDong2 = $('select#tuyenHoatDong2').val();
	if (!(typeof tuyenHoatDong2 === "undefined")) {
		phuongTien.tuyenHoatDong2 = tuyenHoatDong2;
		phuongTien.textTuyenHoatDong2 = $("#tuyenHoatDong2 option[value='" + phuongTien.tuyenHoatDong2 + "']").text();
	}
	
	var loaiHinhHoatDong = $('select#loaiHinhHoatDong').val();
	if (!(typeof loaiHinhHoatDong === "undefined")) {
		phuongTien.loaiHinhHoatDong = loaiHinhHoatDong;
		phuongTien.textLoaiHinhHoatDong = $("#loaiHinhHoatDong option[value='" + phuongTien.loaiHinhHoatDong + "']").text();
	}
	
	
	var dsDiemDung = "";
	var textDiemDung = "";
	var selDiemDung = $('select#select_diem_dung_right_id').val();
	if (!(typeof selDiemDung === "undefined")) {
		$("#select_diem_dung_right_id option").each(function() {
			dsDiemDung = dsDiemDung + "#" + this.value;
			textDiemDung = textDiemDung + "," + this.text;
		});
		
		if (dsDiemDung.length > 1)
		{
			dsDiemDung = dsDiemDung.substring(1);
		}
		phuongTien.diemDungDoDangKy = dsDiemDung;
		phuongTien.textDiemDungDoDangKy = textDiemDung;
	}
	
	var cuaKhauXuatNhap = $('select#cuaKhauXuatNhap').val();
	if (!(typeof cuaKhauXuatNhap === "undefined")) {
		phuongTien.cuaKhauXuatNhap = cuaKhauXuatNhap;
		phuongTien.textCuaKhauXuatNhap = $("#cuaKhauXuatNhap option[value='" + phuongTien.cuaKhauXuatNhap + "']").text();
	}
	
	return phuongTien;
}

/**-------------------THUC HIEN BUSINESS----------------------*/

var tblPhuongTienDangKi = new TblPhuongTienDangKi();


//Lưu và giữ popup
function btnClickLuuPhuongTien() {
	
	var phuongTien = pullDataPopup();
	
	console.log('btnClickLuuPhuongTien', phuongTien);
	
	if (validateUniqueBienSo(phuongTien) === false) {alert("Biển kiểm soát xe đã có. Hay nhập biển số khác !"); return false;}
	
	if (true === validatorPopup(phuongTien)) {
		$('#btnLuuPhuongTien').attr('style', 'display: inline-flex');
		$('#btnThemPhuongTien').attr('style', 'display: inline-flex');
		$('#btnSuaPhuongTien').attr('style', 'display: none');
		tblPhuongTienDangKi.addRow(phuongTien);
		clearDataPopup();
	}
}

//Thêm và đóng popup
function btnClickThemPhuongTien() {
	
	var phuongTien = pullDataPopup();
	
	console.log('btnClickThemPhuongTien_Phuong Tien', phuongTien);
	
	if (validateUniqueBienSo(phuongTien) === false) {alert("Biển kiểm soát xe đã có. Hay nhập biển số khác !"); return false;}
	
	if (true === validatorPopup(phuongTien)) {
		tblPhuongTienDangKi.addRow(phuongTien);
		closePopup('modalPhuongTien');
		initButton();
	}
}

function btnClickSuaPhuongTien() {
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
	
	$('.objectPhuongTien').each(function(i, obj) {//loop through each input[class=objectPhuongTien]
		
		var sProperties = obj.value.split(";");
		
		var quanly = new QlvtPhuongTienDangKy();
		quanly.id = sProperties[0];
		
		quanly.nhanHieu = sProperties[1];
		quanly.textNhanHieu = '';
		
		quanly.bienSo = sProperties[2];
		
		quanly.trongTai = sProperties[3];
		quanly.nuocSanXuat = sProperties[4];
		quanly.namSanXuat = sProperties[5];
		
		quanly.loaiHinhHoatDong = sProperties[6];
		quanly.textLoaiHinhHoatDong = '';
		
		quanly.tuyenHoatDong1 = sProperties[7];
		quanly.textTuyenHoatDong1 = '';
		
		quanly.tuyenHoatDong2 = sProperties[8];
		quanly.textTuyenHoatDong2 = '';
		
		quanly.noiDungHoSoId = sProperties[9];
		quanly.hoSoThuTucId = sProperties[10];
		
		
		quanly.soKhung = sProperties[11];
		quanly.soMay= sProperties[12];
		quanly.mauSon = sProperties[13];
		quanly.soChoNgoi = sProperties[14];
		
		tblPhuongTienDangKi.addLstPhuongTien(quanly);
	});
	
	
});

function iconSuaPhuongTien(indexRow) {
	console.log('iconSuaPhuongTien - indexRow: ' + indexRow);
	$('#btnLuuPhuongTien').attr('style', 'display: none');
	$('#btnThemPhuongTien').attr('style', 'display: none');
	$('#btnSuaPhuongTien').attr('style', 'display: inline-flex');
	
	tblPhuongTienDangKi.updateRow(indexRow);
	openPopup('modalPhuongTien');
}

function iconXoaPhuongTien(indexRow) {
	tblPhuongTienDangKi.deleteRow(indexRow);
}

function copyOptions(fromId,toId){
	$("#"+toId+" option").each(function() {
		$(this).remove();
	});
	if(fromId.trim().length > 0){
		$("#"+fromId+" option").each(function() {
			$('#'+toId).append($('<option>', { 
		        value: this.value,
		        text : this.text 
		    }));
		});
	}
}

function copyOptionsFromList(arrayStr,fromOriginalId, fromId,toId){
	$("#"+fromId+" option").each(function() {
		$(this).remove();
	});
	
	$("#"+toId+" option").each(function() {
		$(this).remove();
	});
	
	$("#"+fromOriginalId+" option").each(function() {
		if(arrayStr.indexOf(this.value) > -1){
			$('#'+toId).append($('<option>', { 
		        value: this.value,
		        text : this.text 
		    }));
		} else{
			$('#'+fromId).append($('<option>', { 
		        value: this.value,
		        text : this.text 
		    }));
		}
	});
}

function initButton() {
	$('#btnLuuPhuongTien').attr('style', 'display: inline-flex');
	$('#btnThemPhuongTien').attr('style', 'display: inline-flex');
	$('#btnSuaPhuongTien').attr('style', 'display: none');
}

