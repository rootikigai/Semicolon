number = int(input("Enter a non-negative integer: "))

factorial = 1

for i in range(1, number + 1):
    factorial = factorial * i

print(f"The factorial of {number} is {factorial}")

