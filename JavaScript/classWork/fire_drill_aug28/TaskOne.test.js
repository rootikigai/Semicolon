const student = require('./TaskOne');

test("student's name should be John Doe", () => {
    expect(student.name).toBe("John Doe");
});

test("student's second course should be Physics", () => {
    expect(student.courses[1]).toBe("Physics");
});

test("student's zipcode should be 10001", () => {
    expect(student.address.zip).toBe("10001");
});