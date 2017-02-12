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
    
    $scope.codigo;
    $scope.aplicacion;
    $scope.aplicaciones;
    $scope.modulo;
    $scope.modulos;
    $scope.reportadoPor;
    
    $scope.fecha;
    $scope.tipo;
    $scope.tipos;
    $scope.clasificacion;
    $scope.clasificaciones;
    $scope.vinculo;
    $scope.vinculos;
    
    $scope.busquedaCasos;
    $scope.descripcion;
    $scope.soporte;
    $scope.soportes;
    $scope.asignado;
    $scope.asignados;
    $scope.implementacion;
    $scope.estado;
    $scope.estados;
    $scope.prioridad;
    $scope.prioridades;
    $scope.estimado;
    
    $scope.imputadoHoras;
    $scope.estimadoHoras;
    
    $scope.fechaCierre;
    
};
