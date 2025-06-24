def get_third_elem(numbers):
    return print(numbers[2])

get_third_elem([5, 3, 22, 6, 70, 42])
print('---------------------------')


def change_second_index(things, changer):
    things = list(things)
    things[2] = changer
    return things

print(change_second_index(["red", "yellow", "blue", "green", "black"], "white"))

print('----------------------------')
