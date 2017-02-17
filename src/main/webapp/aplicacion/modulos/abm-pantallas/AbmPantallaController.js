

var AbmPantallaModule =  angular.module('AbmPantallaModule');

AbmPantallaModule.controller('AbmPantallaController', ['$scope','$http',AbmPantallaController]);


function AbmPantallaController($scope,$http) {

    $scope.vistas = [];

    //new View(0,'html',"aplicacion/modules/abm-pantallas/views/html/viewHtml.html")
    //new View(1,'controller',"aplicacion/modules/abm-pantallas/views/controller/viewController.html")
    //new View(2,'vista',"aplicacion/modules/abm-pantallas/views/vista/viewVista.html")

    $scope.nombreCarpeta;
    $scope.nombre;
    $scope.posicion;
    $scope.nombreArchivo;

$scope.guardar = function(){

	var pantalla = new Pantalla(0,$scope.nombre,"aplicacion/modulos/"+$scope.nombreCarpeta+"/views"+"/"+$scope.nombreArchivo+".html");
	$scope.vistas.push(pantalla);

  $http({
    method:'POST',
    url:'http://localhost:8080/api/abmpantallas/registrar',
    data: pantalla,
    contentType: "application/json"
    })
    .then(function successCallback(response){


        });
  };
  
  $scope.eliminar = function(indice) {
      var pantallas_actualizado = [];
      for (var i = 0; i < $scope.vistas.length; i++) {
          if (i != indice) {
        	  pantallas_actualizado.push($scope.vistas[i]);
          }
      }
      $scope.vistas = pantallas_actualizado;
  };
  
};
