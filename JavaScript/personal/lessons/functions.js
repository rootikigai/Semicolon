function getEvenNumbers(array) {
  return array.filter(num => num % 2 === 0);
}

const createCounter = function() {
  count = 0;
  return {
    getCount:() => {
      return count
    },
    increment:() => {
      count++
    },
    decrement:() => {
      count--;
    }
  };
};

module.exports = {getEvenNumbers, createCounter};




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
