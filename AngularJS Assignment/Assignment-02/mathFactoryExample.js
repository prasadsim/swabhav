angular.module('myMod', [])
    .factory('mathFactory', function () {
        var factoryObj = {}
        factoryObj.square = function (n) {
            return n * n;
        }
        factoryObj.cube = function (n) {
            return n * n * n;
        }
        return factoryObj;
    })
    .controller('squareController', function ($rootScope, $scope, mathFactory) {
        $rootScope.getSquare = function () {
            $scope.square = mathFactory.square($scope.inputNumber);
        }
    })
    .controller('cubeController', function ($rootScope, $scope, mathFactory) {
        $rootScope.getCube = function () {
            $scope.cube = mathFactory.cube($scope.inputNumber);
        }
    })
