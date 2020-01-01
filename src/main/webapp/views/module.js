var moduleModule = angular.module("moduleModule", ["mymoduleModule",'ngTagsInput']);

moduleModule.controller("externalController", externalController);

function externalController($scope) {
    $scope.tags = [
        {text: "Test1"},
        {text: "Test2"},
        {text: "Test3"}
    ];
}




