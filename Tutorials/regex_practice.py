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



