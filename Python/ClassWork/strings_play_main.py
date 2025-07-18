def strings_play(string1 = "", param2 = "ce"):
    mid = len(string1) // 2
    half1 = string1[:mid]
    half2 = string1[mid:]
    new_word = half1 + param2 + half2
    return new_word

print(strings_play("helloo", param2="ce"))