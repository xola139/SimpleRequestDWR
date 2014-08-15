

function cargaIniciales() {
	
			//Carga informacion desde DWR consultando a socket
			cargaSoloInformacion.obtenerCargaInicialInformation('cargaInicialConteos', {
				callback : getCargaInicialInformacionCallBack
			});
		
		
			cargaSoloInformacionDAO.getListaUsuarios( {
				callback : getCargaCallBack
			});
		


}



function getCargaInicialInformacionCallBack(data) {
	//console.log(data);
	
	$("#returnS").append(data);
}


function getCargaCallBack(data) {
//	console.log(data);
	$("#returnD").append(data);
	
}



function dibujaGrid(idTabla, myControls, colNamesParam, colModelParam,
		captionTitle, Width, Height, datos) {

	jQuery("#" + idTabla).jqGrid({
		datatype : "json",
		data : datos,
		scroll : true,
		loadtext : 'Cargando...',
		gridview:true,
		colNames : colNamesParam,
		colModel : colModelParam,
		width : Width,
		height : Height,
		viewrecords : true,
		rowNum : 1000
	});

}