#U.S Phone Number
#An email: abc@gmail.com
#Count and return words that starts with uppercase
#Split a sentence into words Ignoring punctuation

import re

word = "The man's number is 123-456-7890"
phoneNumber = re.findall(r"[0-9-]+", word)
print(phoneNumber)

userEmail = 'ifykel360@gmail.com'
correctEmail = re.findall(r"^[\w.-]+@[\w.-]+\.\w+$", userEmail)
print(correctEmail)

word2 = "Alice and Bob are Good Friends"
count = 0
sentence_case_words = re.findall(r"\b[A-Z][a-z]+\b", word2)
for word in sentence_case_words:
    if word in word:
        count += 1
print(sentence_case_words, " ==> Count = ", count)

word3 = "Hello! How are you doing?"
newWord3 = re.findall(r"[\w]+", word3)
print(newWord3)



