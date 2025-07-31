largest = -987654322
largest2 = -987654321
if largest2 > largest:
    largest, largest2 = largest2, largest

for number in range(5):
    number = int(input("Enter another number: "))
    
    if number > largest:
        largest2 = largest
        largest = number
    elif number > largest2:
        largest2 = number

print(f"The second largest number is: {largest2}")
