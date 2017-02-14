
var AbmCasosModule =  angular.module('AbmCasosModule');

AbmCasosModule.controller('AbmCasosController', ['$scope','$http',AbmCasosController]);

AbmCasosModule.directive('dinamico',['$compile',AbmCasosDirective]);

function AbmCasosDirective($compile) {
    return {
        restrict: 'A',
        replace: true,
        link: function (scope, element, attrs) {
            scope.$watch(attrs.dinamico, function(html) {
                element[0].innerHTML = html;
                $compile(element.contents())(scope);
            });
        }
    };
};

function AbmCasosController($scope,$http) {

    $scope.vistaSeleccionada = {};
    $scope.vistas = [];

    $scope.vistas.push(new Pantalla(0,'Caso',"aplicacion/modulos/abm-casos/views/casos/viewCaso.html"));
    $scope.vistas.push(new Pantalla(1,'Solucion',"aplicacion/modulos/abm-casos/views/solucion/viewSolucion.html"));
    $scope.vistas.push(new Pantalla(2,'Vinculados',"aplicacion/modulos/abm-casos/views/vinculados/viewVinculados.html"));
    
    $scope.vistaSeleccionada = $scope.vistas[0];
    
    $scope.go = function(id){
    	$scope.vistaSeleccionada = $scope.vistas[id];
    };
    
    $scope.caso = new Caso(-1,"","","",new Date(),"","",0,"","","","","","",0,0,0,new Date());

    $scope.aplicaciones;
    $scope.modulos;
    $scope.tipos;
    $scope.clasificaciones;
    $scope.vinculos;
    
    $scope.busquedaCasos;
    $scope.soportes;
    $scope.asignados;
    
    $scope.estados = ('1 - Recibido ;2 - En proceso ;3 - En pausa ;4 - Fix en otro INC ;5 - Envio Pre ;6 - Envio Pro ;7 - Re Abierto ;8 - Cerrado ;9 - Derivado ;10 - Requiere OK SMG ;11 - Verifica y Cierra ;12 - Portal No autorizado ;13 - En sector QA - STK')
    .split(';').map(function(estado){
        return {estado: estado};
      });
    $scope.prioridades =('1-Critical ;2-High; 3-Medium; 4-Low')
    .split(';').map(function(prioridad){
        return {prioridad: prioridad};
    });
    
    
};
