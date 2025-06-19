import random
from operator import index


def ten_random_nums():
    list_of_numbers = []
    for i in range(10):
        nums = random.randint(1, 50)
        list_of_numbers.append(nums)
    return list_of_numbers

#print(ten_random_nums())

def length_of_a_list(list_of_numbers):
    counter = 0
    for i in list_of_numbers:
        counter += 1
    return counter

#print(length_of_a_list([1,2,3,4,5,6,7,8,9]))

def sum_elems_at_even_positions(list_of_numbers):
    sum_of_numbers = 0
    counter = 0
    for i in list_of_numbers:
        if counter % 2 == 0:
            sum_of_numbers += i
        counter += 1
    return sum_of_numbers

#print(sum_elems_at_even_positions([1, 2, 3, 4, 5, 6, 7, 8, 9]))

def sum_elems_at_odd_positions(list_of_numbers):
    sum_of_numbers = 0
    counter = 0
    for i in list_of_numbers:
        if counter % 2 == 1:
            sum_of_numbers += i
        counter += 1
    return sum_of_numbers

#print(sum_elems_at_odd_positions([1, 2, 3, 4, 5, 6, 7, 8, 9]))

def multiply_elems_at_every_third_positions(list_of_numbers):
    multiply_numbers = 1
    counter = 1
    for i in list_of_numbers:
        if counter % 3 == 0:
            multiply_numbers *= i
        counter += 1
    return multiply_numbers

#print(multiply_elems_at_every_third_positions([1, 2, 3, 4, 5, 6, 7, 8, 9]))

def average_of_elems(list_of_numbers):
    for i in list_of_numbers:
        average = sum_elems_at_even_positions(list_of_numbers) / length_of_a_list(list_of_numbers)
    return average

#print(average_of_elems([1, 2, 3, 4, 5, 6, 7, 8, 9]))