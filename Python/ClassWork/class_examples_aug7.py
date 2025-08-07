# Principles of POOP: Inheritance Example
class Human:
    def __init__(self, name, dob):
        self.name = name
        self.dob = dob

    def __str__(self):
        return f'Name of Employee {self.name}\nDate of Birth: {self.dob}'

class Employee(Human):
    def __init__(self, name, dob, employee_id):
        super().__init__(name, dob)
        self.employee_id = employee_id

    def __str__(self):
        return f'{super().__str__()}\nEmployee ID: {self.employee_id}'

h1 = Human('Khalid', '1990-01-01')
e1 = Employee("Kelvin", "1990-01-01", "001")
print(h1, e1)
