def number_of_occurrence(word):
    occurrence = {}
    for char in word:
        if char in occurrence:
            occurrence[char] += 1
        else:
            occurrence[char] = 1
    return occurrence


print(number_of_occurrence('Mississippi'))


