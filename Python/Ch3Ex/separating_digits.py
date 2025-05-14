number = int(input("Enter a number that has 5 digits: "))

while number > 0:
    digit = number % 10  # Get the last digit
    print(digit, end=' ')  # Print the digit
    number = number // 10  # Remove the last digit

