var calculatorModule = angular.module("calculatorModule", []);

calculatorModule.controller("calculatorController", calculatorController);

function calculatorController() {

    this.resultValue = 0;

    this.ButtonClicked = function (button) {
        this.selectedOperation = button;
    };

    this.computeResult = function() {

        var number1 = parseFloat(this.input1);
        var number2 = parseFloat(this.input2);

        if(this.selectedOperation==="+"){
            this.resultValue = number1 + number2;
        }else if(this.selectedOperation==="-"){
            this.resultValue = number1 - number2;
        }else if(this.selectedOperation==="*"){
            this.resultValue = number1 * number2;
        }else if(this.selectedOperation == "/"){
            if(number2==0){
                this.resultValue = "infinite";
            }
            this.resultValue = number1 / number2;
        }
    };
}
