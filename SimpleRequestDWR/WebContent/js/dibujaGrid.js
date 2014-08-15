
var myControls;
var colNameParams;
var colModelParam;
var myControls3Caseteras;
var colNameParams3Caseteras;
var colModelParam3Caseteras;
var myControls2Caseteras;
var colNameParams2Caseteras;
var colModelParam2Caseteras;

var myControlsHis;
var colNameParamsHis; 
var colModelParamHis;
var myControlsHis3;
var colNameParamsHis3;
var colModelParamHis3;

var myControlsHis2;
var colNameParamsHis2;
var colModelParamHis2;

jQuery(document).ready(function(){

	myControls = new Array('id','firstname','lastname','email','password','act');
	colNameParams = ['ID','First Name','Last Name','E-mail','Pasword','Actions'];
	colModelParam = [
	         	   	   	{name:myControls[0],index:myControls[0],width: 50,sortable:true,align:'center',editable:false},
	         	   	   	{name:myControls[1],index:myControls[1],width: 85,sortable:true,align:'center',editable:true},
	        			{name:myControls[2],index:myControls[2],width: 60,sortable:true,align:'center',editable:true},
	        			{name:myControls[3],index:myControls[3],width: 20,sortable:true,align:'center',editable:true},
	        			{name:myControls[4],index:myControls[4],width: 25,sortable:true,align:'center',editable:true},
	        			{name:myControls[5],index:myControls[5],width: 75,sortable:true,align:'center',editable:false}
	        			
	        			];
	
//	dibujaGrid("gridUsuarios", myControls, colNameParams, colModelParam, "Usuarios",600,155,new Array());

	
	
});
  