binary = int(input("Enter a binary number (0s and 1s): "))

decimal = 0
power = 0

while binary > 0:
    digit = binary % 10
    decimal += digit * (2 ** power)
    binary = binary // 10
    power += 1

print("Decimal equivalent is:", decimal)

