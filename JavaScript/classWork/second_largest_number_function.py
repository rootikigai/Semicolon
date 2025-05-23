def second_largest(numbers):
    largest = -987654322
    largest2 = -987654321
    if largest2 > largest:
        largest, largest2 = largest2, largest

    for number in range(3, 5):    
        if number > largest:
            largest2 = largest
            largest = number
        elif number > largest2:
            largest2 = number

    return largest2

#print(second_largest([1,2]))
