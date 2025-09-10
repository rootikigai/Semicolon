def categorize_numbers(*numbers,divisible_by=""):
    number = 0
    counter = []
    while number != 0:
        if number == 0:
            break
        else:
            if number % divisible_by == 0:
                counter = counter.append(number)
            else:
                print("Not divisible by 5")

    return counter

print(categorize_numbers([1,2,3,4,5,6,7,8,9,10], 5))

