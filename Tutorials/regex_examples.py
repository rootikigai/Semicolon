#Regex_Examples
import re

word = "The quick brown fox jumps over the lazy dog"
new_word = re.findall(r"[\w']+", word)
print(new_word)

