angular.module("main", ["ngRoute"])
    .config(["$routeProvider", function ($routeProvider) {
        $routeProvider.when("/", {
            templateUrl: "fragments/display.html",
            controller: "displayController"
        })
            .when("/home", {
                templateUrl: "fragments/display.html",
                controller: "displayController"
            })
            .when("/add", {
                templateUrl: "fragments/add.html",
                controller: "addController"
            })
            .when("/update", {
                templateUrl: "fragments/update.html",
                controller: "updateController"
            })
    }])

    .controller("displayController", function ($http, $scope) {
        $scope.students = [];
        $http.get('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students')
            .then(function (response) {
                $scope.students = [];
                for (var i = 0; i < response.data.length; i++) {
                    $scope.students.push(response.data[i]);
                }
            })
    })

    .controller("addController", function ($http, $scope) {
        $scope.addData = function () {
            $scope.student = {};
            console.log('add');
            $scope.student.rollno = $scope.rollno;
            $scope.student.name = $scope.name;
            $scope.student.age = $scope.age;
            $scope.student.email = $scope.email;
            $scope.student.date = $scope.dob;
            $scope.student.isMale = $scope.gender;
            $http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students", $scope.student)
                .then(function (response) {
                    alert("Data added successfully!");
                })
        }
    })

    .filter("gender", function () {
        return function (gender) {
            if (gender)
                return "M"
            else
                return "F"
        }
    })
    .controller("deleteController", function ($scope, $http) {
        $scope.delete = function (student) {
            console.log(student.id);
            $http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + student.id)
                .then(function (response) {
                    alert("Record Deleted")
                    location.reload()
                })
        }
    })

    .controller("updateController", ["$scope", "$http", "$rootScope", "$location", function ($scope, $http, o, $location) {
        $scope.update = function (student) {
            console.log(student.id);
            o.updateTarget = student
            $location.path("/update")
        }
        $scope.updateStudent = function () {
            $http.put("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + o.updateTarget.id, o.updateTarget)
                .then(function (response) {
                    alert("Record Updated")
                    location.reload()
                })
        }
    }])