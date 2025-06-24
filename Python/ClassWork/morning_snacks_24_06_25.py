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
