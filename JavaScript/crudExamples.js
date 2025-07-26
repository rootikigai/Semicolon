let person = {
	name : "Name is Kelvin",
	age : "Age is " + 18,
	gender : "Gender is Don't ask me",
    password : "12345",
};

console.log(person.name)
console.log(person.age)
console.log(person.gender)//READ!

console.log("");

person.password = "newPassword9876";//UPDATE
person.complexion = "Chocolate-Skinned"//UPDATE

console.log(person.name, person.age, person.gender)//READ TOGETHER. READ!

console.log("");

//delete person.age;//DELETE
//console.log(person);

console.log(Object.keys(person));//RETURNS 1D ARRAY
console.log(Object.entries(person));//RETURNS 2D ARRAY
