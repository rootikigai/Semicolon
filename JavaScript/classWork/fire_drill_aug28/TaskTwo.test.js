const student = require('./TaskTwo');

test("getDettails should return correct string", () => {
    expect(student.getDetails(student.student)).toBe("John Doe is 23 years old and has a GPA of 3.8");
});