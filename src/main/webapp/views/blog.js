var blogModule = angular.module("blogModule", []);

blogModule.controller("blogController", blogController);

function blogController($scope,$http) {
    $scope.getDataFromServer = function () {
        $http({
            method : 'GET',
            url : 'http://localhost:8080/api/blogs'
        }).then(function(data) {
            console.log(data);
            
            $scope.blog = data;
        },function errorCallback(response) {
            
            }
        );
    };

}