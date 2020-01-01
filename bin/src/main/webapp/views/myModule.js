var mymoduleModule = angular.module("mymoduleModule", []);

mymoduleModule.controller("mymoduleController", mymoduleController);

function mymoduleController($scope) {
    $scope.helloMessage = "I'm from the main module";
}
