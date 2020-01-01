var todoModule = angular.module("todoModule", []);

todoModule.controller("todoController", todoController);

function todoController($scope) {
    $scope.editMode = false;

    $scope.todos = [
        {val:"Learn Angular 1"},
        {val:"Try out exercises"},
        {val:"Visit Java brains site"}
    ];


    $scope.addNewTodo = function () {
        $scope.todos.push({val:$scope.newTodo});
        $scope.todos
        $scope.newTodo = "";
    }

    $scope.triggerEditMode = function () {
        $scope.editMode = !$scope.editMode;
    }
    
    $scope.deleteTodo = function (index) {
        $scope.todos.splice(index, 1);
    }
}
