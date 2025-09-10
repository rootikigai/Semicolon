"""
while True:
    number = int(input("Enter an integer between 1 and 10,000: "))
    if number < 1 or number > 10000 or number == 0:
        print("Invalid input, try again!")
    else:
        break
sum_of_digits = 0
newNumber = str(number)
for digit in newNumber:
  sum_of_digits += int(digit)
print(f"The sum of digits is {sum_of_digits}")
"""

def number_extrator_and_sum_function(number):
    divisor = 10000
    while number != 0:
        digit = number // divisor
        print(digit, end='\t')
        number = number % divisor
        divisor //= 10
       
number = int(input("Enter a number that has 5 digits: "))
print(number_extrator_and_sum_function(number))
