var clockModule = angular.module("clockModule", []);

clockModule.controller("clockController",clockController);

function clockController($scope) {
    var date = new Date();
    $scope.timeString = date.toLocaleTimeString();
    $scope.getTime = function () {
        var currentDate = new Date();
        $scope.timeString = currentDate.toLocaleTimeString();

        $scope.userName = "";
    }
}

var anotherModule = angular.module("anotherModule",[]);

anotherModule.controller("anotherController",anotherController);

function anotherController($scope) {
    $scope.textboxChange = function () {
        console.log("textbox value changed");
    }
}


var nestedModule = angular.module("nestedController", []);
    nestedModule.controller("controller1", controller1);
    nestedModule.controller("controller2", controller2);

    function controller1() {
        this.testProp = "from controller1";
    }
    function controller2() {
        this.testProp = "from controller2";
    }

