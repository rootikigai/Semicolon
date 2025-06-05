const prompt = require("prompt-sync")();
let number;
const questions = [{}, {Question1 : "What is 10 + 10? (a)5 (b)20 (c)10 (d)0"}, {Question2 : "Capital of Nigeria? (a)Bayelsa (b)Lagos (c)Calabar (d)Abuja"}, {Question3 : "Is Africa a country? (a) Yes (b)No (c)All of the above (d)None of the above"}];
const answers = [{answer1 : 'b'}, {answer2 : 'd'}, {answer3 : 'b'}];

function chooseQuestion(){
    questionNumber = prompt("Choose your question number(I did just 3 questions for now. I can do 10 but I spent too much time): ");
    for(let index in questions){
        if(questionNumber == index){
        console.log(questions[index])
        }
    }
}

console.log();

function chooseAnswer(){
    answerChar = prompt("Choose your answer: ").ignoreCase;
    for(let index in answers){
        if(answerChar == index){
        console.log(answers[index])
        }
    }
}
//PLEASE PERMIT MY MAIN HERE SIR!
let programRun = 0;
let numOfTrials = 0;
let countCorrect = 0;
let countWrong = 0;
let wrong = 0;
let userQuestion = 0;
let userAnswer = 0;
while(programRun != 3){
    let comp = Math.floor(Math.random(questions));
    if(programRun > 2){
        break;
    }

    userQuestion = chooseQuestion()
    userAnswer = chooseAnswer()
            if(userAnswer == answerChar){
                console.log("Correct.");
                countCorrect = countCorrect + 1;
            }
            else if(userQuestion != result){
                for(wrong = 0; wrong < 1; wrong++){
                    console.log("Wrong. One trial left!");
                    const prompt = require("prompt-sync")();
                    let ans = prompt("What is " + num1 + " - " + num2 + "?:");
                }
                countWrong = countWrong + 1;
            }
        console.log(countCorrect + " correct score!");
        console.log(countWrong + " wrong score!");
        programRun = programRun + 1;
}

