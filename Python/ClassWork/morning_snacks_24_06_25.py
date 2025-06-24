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

def remove_element(things, to_be_removed):
    things = list(things)
    things.remove(to_be_removed)
    return things

print(remove_element(["red", "yellow", "blue", "green", "black"], "blue"))

print('----------------------------')

def each_word_length(words):
    words = list(words)
    length = []
    word_length = 0
    for word in words:
        word_length = len(word)
        length.append(word_length)
    return length

print(each_word_length(["red", "yellow", "blue", "green", "black"]))
print('------------------------------')

def sort_even_numbers(my_numbers):
    even_numbers = []
    for number in my_numbers:
        if number % 2 == 0:
            even_numbers.append(number)
    return even_numbers


digits = sort_even_numbers([4, 7, 8, 9, 2, 10, 23, 44])
print(digits)

print('------------------------------------------')

def add_lists(list1, list2):
    list1 = [1, 2, 3]
    list2 = [4, 5, 6]
    return list1 + list2

print(add_lists([1, 2, 3], [4, 5, 6]))
print('-------------------------------------------')

def three_chars(anything):
    length_of_three = []
    for word in anything:
        if len(word) == 3:
            length_of_three.append(word)
    return length_of_three


new_things = three_chars(["lamb", "kit", "yam", "kings", "dogs", "man"])
print(new_things)