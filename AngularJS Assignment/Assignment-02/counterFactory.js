angular.module('myMod', [])
    .factory('counterFactory', function () {
        var factoryObj = {};
        factoryObj.counter = 0;
        factoryObj.increment = function () {
            return factoryObj.counter++;
        }
        factoryObj.decrement = function () {
            return factoryObj.counter--;
        }
        return factoryObj;
    })

    .controller('incrementController', function ($rootScope, $scope,counterFactory) {
        $rootScope.increment = function () {
            console.log(counterFactory.counter)
            $rootScope.counterResult = counterFactory.increment();
        }
    })
    .controller('decrementController', function ($scope,$rootScope, counterFactory) {
        $rootScope.decrement = function () {
            $rootScope.counterResult = counterFactory.decrement();
        }
    })