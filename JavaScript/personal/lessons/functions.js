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

