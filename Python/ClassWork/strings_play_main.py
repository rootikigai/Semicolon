def strings_play(string1 = "", param2 = "ce"):
    if len(string1) % 2 != 0:
        string1 = string1 + param2
        return string1
    else:
        mid = len(string1) // 2
        half1 = string1[:mid]
        half2 = string1[mid:]
        new_word = half1 + param2 + half2
        return new_word

print(strings_play("joy", param2="ce"))