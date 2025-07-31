number = int(input("Enter a number that has 5 digits: "))

divisor = 10000 
while number != 0:
    digit = number // divisor
    print(digit, end='\t')
    number = number % divisor
    divisor //= 10









