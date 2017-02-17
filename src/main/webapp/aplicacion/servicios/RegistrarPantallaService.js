var app = angular.module('AppModule');

app.service('$registrarPantallaService', $registrarPantallaService);

function $registrarPantallaService () {
	 
	var ip = "172.16.82.38";
	
	 this.cargarVistas = function(vistas){
		 
	    	if(vistas.length == 0){
	    	$.ajax({
	    		method:'GET',
	    		url: "http://"+ip+":8080/api/abmpantallas/getAll",
	    		success: function(result){
	    				angular.forEach(result, function(value, key) {
	    						vistas.push(value);
	    				});
	    				return vistas;
	    		}});
	    	}
	    };
  }
