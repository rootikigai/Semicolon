console.log("===Value Operator===\nTo perform operations:\nPress '+' to ADD\nPress '-' to SUBTRACT\nPress '*' to MULTIPLY\nPress '/' to DIVIDE\n")

const prompt = require("prompt-sync")();
let left_operand = Number(prompt("Enter first number: "));
let right_operand = Number(prompt("Enter second number: "));
let operator = prompt("Enter operator number representation: ");

/*
let left_operand = 20;
let right_operand = 5;
let operator = 4;
*/
let ans;
switch(operator){
    case "+":
        ans = left_operand + right_operand;
        console.log("Operands added is: " + ans)
    break
    case "-":
        ans = left_operand - right_operand;
        console.log("Operands subtracted is: " + ans)
    break
    case "*":
        ans = left_operand * right_operand;
        console.log("Operands multiplied is: " + ans)
    break
    case "/":
        ans = left_operand / right_operand;
        console.log("Operands divided is: " + ans)
    break
    default:
        console.log("NaN")
}
