function charOccurence(str) {
  const characterCount = {};
  for (const char of str) {
    if (characterCount[char]) {
      characterCount[char]++;
    } else {
      characterCount[char] = 1;
    }
  }
  return characterCount;
}
const result = charOccurence("Femi goes to school");
console.log(result);