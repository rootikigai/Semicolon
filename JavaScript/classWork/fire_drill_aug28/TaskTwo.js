let student = {
    name: "John Doe",
    age: 22,
    GPA: 3.8,
    courses: ["Math", "Physics", "Computer Science"],
    address: {
        city: "New York",
        zip: "10001"
    }
};

function updateAge(newAge){
    student.age = newAge;
}

function getDetails(student){
    let name = student.name;
    updateAge(23);
    let GPA = student.GPA;
    return `${name} is ${student.age} years old and has a GPA of ${GPA}`;
}

console.log(getDetails(student));

module.exports = {student, getDetails};