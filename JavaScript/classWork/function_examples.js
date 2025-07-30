/*function declaration
function greet(){
	let reply = "hello"
	return reply
};

console.log(greet());
*/
//function expression
/*const greet = function(){
    let reply = "hello"
    return reply
}
console.log(greet()); */
/*
let userName = "Kelvin";
let number = 20;


const greet = function(numberOne, name){
    let concat = numberOne + " " + name
    return concat
}
console.log(greet(number, userName));*/

//Nested Functions

/*Arrow Functions
const signUp =()=>{
    console.log("Registration is successful!")
}
signUp();

//

const print = (num1, num2)=>{
    console.log(num1 + " " + num2)
}
print(2,3);

*/

let arrayOfNums = [2,3,5,6,7]
const printNums = (array) => {
    for(let nums of array){
        console.log(nums)
    };
};
printNums(arrayOfNums)
