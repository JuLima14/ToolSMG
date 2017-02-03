

var AbmPantallaModule =  angular.module('AbmPantallaModule');

AbmPantallaModule.controller('AbmPantallaController', ['$scope','$http',AbmPantallaController]);


function AbmPantallaController($scope,$http) {

    $scope.vistas = [];

    //new View(0,'html',"aplicacion/modules/abm-pantallas/views/html/viewHtml.html")
    //new View(1,'controller',"aplicacion/modules/abm-pantallas/views/controller/viewController.html")
    //new View(2,'vista',"aplicacion/modules/abm-pantallas/views/vista/viewVista.html")

    $scope.nombreCarpeta;
    $scope.nombreHtml;
    $scope.nombre;
    $scope.posicion;


$scope.guardar = function(){



var view = new View(0,$scope.nombre,"aplicacion/modules/"+$scope.nombreCarpeta+"/views"+"/"+$scope.nombreHtml+".html");

  $http({

    method:'POST',
    url:'http://localhost:8080/api/abmpantallas/registrar',
    data: view
    //headers: {'Content-Type': 'application/json'}
    //contentType: "application/json"
    })
    .then(function successCallback(response){


        });
  };
};
