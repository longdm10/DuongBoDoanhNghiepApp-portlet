function viewDetail(url,strBtn,widthSize) {
	var output = strBtn.replace(/firstReplace/g, '<').replace(/lastReplace/g, '>').replace(/midReplace/g, '/').replace(/charReplace/g, '"');    

	var _title = output;
	AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated',function(A){
		  
	    var login_popup= Liferay.Util.Window.getWindow(
	                {
	                    dialog: {
	                        centered: true,
	                        constrain2view: true,
	                          modal: true,
	                        resizable: false,
	                        width: $(window).width() * widthSize
	                    }
	                }).plug(A.Plugin.DialogIframe,
	                     {
	                     autoLoad: true,
	                     uri: url
	                     }).render();
	             login_popup.show();
	                     login_popup.titleNode.html(_title);
	                    
	 
	 });
}

function loadMyPage(url) {
	$('#contentMyPage').load(url);
}
function loadMyPageDv2(url) {
	$('#dv2').load(url);
}
function loadMyPageDv3(url) {
	$('#dv3').load(url);
}
function loadMyPageAndIdBtn(url) {
	$('#contentMyPage').load(url);
	$('#idBtn').hide();
}
function showHiddenDiv1(type) {
	if(type == 1){
		$('#divDat0').css("display", "block");
		$('#divKoDat0').css("display", "none");
	}else {
		$('#divDat0').css("display", "none");
		$('#divKoDat0').css("display", "block");
	}
	
}
function showHiddenDiv2(type) {
	if(type == 1){
		$('#divDat10').css("display", "block");
		$('#divKoDat10').css("display", "none");
	}else {
		$('#divDat10').css("display", "none");
		$('#divKoDat10').css("display", "block");
	}
	
}
function showHiddenDiv(type) {
	if(type == 1){
		$('#divDat').css("display", "block");
		$('#divKoDat').css("display", "none");
	}else {
		$('#divDat').css("display", "none");
		$('#divKoDat').css("display", "block");
	}
	
}

/**----Validate----*/
function isNormalInteger(str) {
	return /^\+?(0|[1-9]\d*)$/.test(str);
}

function canBoListPopUp(){
	func_canBoListPopUp();
}
function func_canBoListPopUp() {
	$('#canBo_dialog').modal('show');
}
function func_close_dialog_canbo() {
	$('#canBo_dialog').dialog('close');
}
