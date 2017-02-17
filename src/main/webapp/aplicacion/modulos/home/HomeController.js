
var app = angular.module('HomeModule');

app.controller('HomeController',['$scope', '$timeout', '$mdSidenav', '$log','$filter','$http','$registrarPantallaService',HomeController])
.config(function($mdThemingProvider) {
    // Configure a dark theme with primary foreground yellow
    $mdThemingProvider.theme('docs-dark', 'default')
      .primaryPalette('blue')
      .dark();

  });

  function HomeController($scope, $timeout, $mdSidenav, $log,$filter, $templateRequest, $sce, $compile,$http,$registrarPantallaService){
    $scope.toggleLeft = buildDelayedToggler('left');

    $scope.abmPantalla ={};
    $scope.vistas = [];
    $scope.vistaSeleccionada;
   
    var ip = "localhost";
//    $scope.vistas.push(new Pantalla(0,"ABM Casos","aplicacion/modulos/abm-casos/views/viewAbmCasos.html"));
//    $scope.vistas.push(new Pantalla(1,"ABM Incidentes","aplicacion/modulos/abm-incidentes/views/viewABMIncidentes.html"));
//    $scope.vistas.push(new Pantalla(2,"ABM Pantallas","aplicacion/modulos/abm-pantallas/views/viewABMPantallas.html"));

    
    $scope.goAbmPantalla = function(){
    	$scope.vistaSeleccionada = $scope.abmPantalla;
    };
    
    $scope.go = function(id){
        $scope.vistaSeleccionada = $scope.vistas[id-1];
    };
    
    $scope.cargarVistas = function(){
    	var vistasObtenidas = $registrarPantallaService.cargarVistas($scope.vistas);
    	
    	angular.forEach(vistasObtenidas, function(value, key) {
			if(value.id == 3){
				$scope.abmPantalla = value;
			}else{
				$scope.vistas.push(value);
			}
		});
    }
//    $scope.cargarVistas = function(){
//    	if($scope.vistas.length == 0){
//    	$.ajax({
//    		method:'GET',
//    		url: "http://"+ip+":8080/api/abmpantallas/getAll",
//    		success: function(result){
//    				angular.forEach(result, function(value, key) {
//    					if(value.id == 3){
//    						$scope.abmPantalla = value;
//    					}else{
//    						$scope.vistas.push(value);
//    					}
//    				});
//    		}});
//    	}
//    };
    
    
    function debounce(func, wait, context) {
      var timer;

      return function debounced() {
        var context = $scope,
            args = Array.prototype.slice.call(arguments);
        $timeout.cancel(timer);
        timer = $timeout(function() {
          timer = undefined;
          func.apply(context, args);
        }, wait || 10);
      };
    }

    /**
     * Build handler to open/close a SideNav; when animation finishes
     * report completion in console
     */
    function buildDelayedToggler(navID) {
      return debounce(function() {
        
        $mdSidenav(navID)
          .toggle()
          .then(function () {
            $log.debug("toggle " + navID + " is done");
          });
      }, 200);
    }
        

        $scope.close = function() {
          // Component lookup should always be available since we are not using `ng-if`
          $mdSidenav('left').close()
            .then(function () {
              $log.debug("close LEFT is done");
            });

        };


  };

