let array = [2,3,4,5,6];

for(let number of array){
	console.log(number)
}

let obj = {
	color: "black",
	age: 18,
	isValid: true
};

for(let key in obj){
	console.log(obj[key])
};

for(let value of array){
	console.log(value)
};

for(let index in array){
	console.log("I am the index of the array ", index)
	console.log("I am the value in the array " + " ", array[index])
};
