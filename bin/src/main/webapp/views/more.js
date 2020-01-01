var moreModule = angular.module("moreModule", ["secondModule"]);

moreModule.controller("moreController", moreController);

function moreController($scope) {
    $scope.myList =[
        {'name':'foo1','age':20},
        {'name':'foo2','age':30},
        {'name':'foo3','age':40},
        {'name':'foo4','age':50},
        {'name':'foo5','age':60}
    ];
}


var secondModule = angular.module("secondModule",[]);

secondModule.controller("secondController", secondController);
function secondController() {

}
