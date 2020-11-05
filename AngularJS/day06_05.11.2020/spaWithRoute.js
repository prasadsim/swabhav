var app = angular.module("modA", ["ngRoute"])
app.config(["$routeProvider", function ($routeProvider) {
    $routeProvider.when("/",
        {
            templateUrl: "fragmet/home.html",
            controller: "homeController"
        })
        .when("/home",
            {
                templateUrl: "fragmet/home.html",
                controller: "homeController"
            })
        .when("/career",
            {
                templateUrl: "fragmet/career.html",
                controller: "careerController"
            })
        .when("/about",
            {
                templateUrl: "fragmet/about.html",
                controller: "aboutController"
            })
}])
app.controller("homeController", ["$scope", function ($scope) {
    console.log("Home");
    $scope.data = "Inside Home"
}])

app.controller("careerController", ["$scope", function ($scope) {
    console.log("career");
    $scope.data = "Inside Career"
}])

app.controller("aboutController", ["$scope", function ($scope) {
    console.log('about');
    $scope.data = "Inside About"
}])