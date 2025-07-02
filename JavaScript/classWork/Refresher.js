function largestWordInSentence(sentence) {
    let currentSentence = sentence.split(' ');
    let largestWord = '';
    for (let word of currentSentence) {
        if (word.length > largestWord.length) {
            largestWord = word;
        }
    }
    return (`Largest word is ${largestWord}`);
}

console.log(largestWordInSentence("Ade is going to Semicolon"))

function smallestNumberWhoseDigitsMultiplyToGivenProduct(number) {

    let digits = [];

    for(let i = 9; i >= 2; i--){
        while(number % i === 0){
            digits.push(i);
            number = number / i;
        }
    }
    digits.sort();

    let result = "";
    for(let i = 0; i < digits.length; i++){
        result = result + digits[i];
    }

    return Number(result);
}

console.log(smallestNumberWhoseDigitsMultiplyToGivenProduct(36));

function armstrongNumber(number){
    let sum = 0;
    let oldNumber = number;
    while(number > 0){
        let digit = number % 10;
        sum += digit ** 3;
        number = Math.floor(number / 10);
    }
    if(sum === oldNumber){
        return `${oldNumber} is an Armstrong number`;
    }
    else{
        return `${oldNumber} is not an Armstrong number`;
    }
}

console.log(armstrongNumber(153));
