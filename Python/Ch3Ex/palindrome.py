number = int(input("Enter a five-digit integer: "))

original_num = number

reversed_num = 0
while number > 0:
    digit = number % 10 
    reversed_num = reversed_num * 10 + digit 
    number = number // 10

if original_num == reversed_num:
    print(f"{original_num} is a palindrome.")
else:
    print(f"{original_num} is not a palindrome.")

