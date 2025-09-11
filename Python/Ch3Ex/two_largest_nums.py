"""
largest = int(input("Enter a number: "))
largest2 = int(input("Enter another number: "))
if largest2 > largest:
    largest, largest2 = largest2, largest

for number in range(8):
    number = int(input("Enter another number: "))
    
    if number > largest:
        largest2 = largest
        largest = number
    elif number > largest2:
        largest2 = number

print(f"The two largest numbers are: {largest} and {largest2}")
"""
number = 0
number_count = 0
largest = 0
second_largest = 0
while number_count < 10:
    if number_count == 10:
        break
    else:
        number = int(input("Enter a number: "))
        number_count += 1
        if number > largest:
            largest = number
            if number < largest and number > second_largest:
                number = second_largest
print(f"{largest} is the largest number")
print(second_largest)
