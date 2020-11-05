angular.module('myMod', [])
    .controller('myCtrl', function ($rootScope, $scope, $location) {
        $scope.data = 'controller a says hello'
        $scope.homeVar = true;
        $scope.aboutVar = true;
        $scope.careerVar = true;


        $rootScope.$on('$locationChangeStart', function (event, next, current) {
            console.log($location.url() + " is fired");
            if ($location.url() == "/home") {
                $scope.homeVar = false;
                $scope.aboutVar = true;
                $scope.careerVar = true;
            } else if ($location.url() == "/career") {
                $scope.homeVar = true;
                $scope.careerVar = false;
                $scope.aboutVar = true;
            } else if ($location.url() == "/about") {
                $scope.homeVar = true;
                $scope.careerVar = true;
                $scope.aboutVar = false;
            } else if ($location.url() == "/") {
                $scope.homeVar = true;
                $scope.careerVar = true;
                $scope.aboutVar = true;
            }
        })
    })