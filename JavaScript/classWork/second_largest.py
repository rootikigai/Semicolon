largest = -987654322
largest2 = -987654321
if largest2 > largest:
    largest = largest2

for number in range(6, 13):
    if number > largest:
        largest2 = largest
        largest = number
    elif number > largest2:
        largest2 = number

print(f"The second largest number is: {largest2}")
