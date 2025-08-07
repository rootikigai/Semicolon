# Principles of POOP: Inheritance Example
class Human:
    def __init__(self, name, dob):
        self.name = name
        self.dob = dob

    def __str__(self):
        return f'Name of Employee {self.name}\nDate of Birth: {self.dob}'

