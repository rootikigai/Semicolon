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
