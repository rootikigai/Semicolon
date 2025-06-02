let num1 = Math.floor(Math.random() * 100);
let num2 = Math.floor(Math.random() * 100);
let numOfTrials = 0;
let countCorrect = 0;
let countWrong = 0;
let wrong = 0;
let ans = 0;
    if(num1 < num2){
        let temp = num1;
        num1 = num2;
        num2 = temp;
    }
    let result = num1 - num2;
for(let trials = 0; trials <= 9; trials++){
    const prompt = require("prompt-sync")();
    let ans = prompt("What is " + num1 + " - " + num2 + "?: ");
        if(ans == result){
            console.log(ans + " is correct.");
            countCorrect = countCorrect + 1;
        }
        else if(ans != result){
            for(wrong = 0; wrong < 1; wrong++){
                console.log("Wrong. One trial left!");
                const prompt = require("prompt-sync")();
                let ans = prompt("What is " + num1 + " - " + num2 + "?:");
            }
            countWrong = countWrong + 1;
        }
    console.log(countCorrect + " correct score!");
    console.log(countWrong + " wrong score!");
}
