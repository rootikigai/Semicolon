// function getEvenNumbers(array) {
//   return array.filter(num => num % 2 === 0);
// }

// const createCounter = function() {
//   count = 0;
//   return {
//     getCount:() => {
//       return count
//     },
//     increment:() => {
//       count++
//     },
//     decrement:() => {
//       count--;
//     }
//   };
// };

// module.exports = {getEvenNumbers, createCounter};


const Person = {
  name: 'Kelvin Ifeanyi',
  age: 33,
  discipline: 'Software Engineer',
  school: 'Semicolon Africa',
  greet: function() {
    return `Hello, my name is ${this.name}, I am ${this.age} years old and I am currently studying to become a ${this.discipline} at ${this.school}.`;
  }
};

console.log(Person.greet());


/*
function add(x,y) {
  return x + y;
}
function multiply(a, b) {
  return a * b;
}
function callbackFunction(callback, value1, value2) {
  return callback(value1 + value2);
}

console.log(callbackFunction(callback, value1, value2));
// Incorrect but will revert to it.
*/
