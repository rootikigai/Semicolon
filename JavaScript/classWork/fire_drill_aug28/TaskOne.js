let student = {
    name: "John Doe",
    age: 22,
    courses: ["Math", "Physics", "Computer Science"],
    address: {
        city: "New York",
        zip: "10001"
    }
};

console.log("The Student's Name is:", student.name);
console.log("The Second Course is:", student.courses[1]);
console.log("The Zipcode is:", student.address.zip);

module.exports = student;