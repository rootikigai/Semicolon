values = [9, 11, 22, 34, 17, 22, 34, 22, 40]

mean = sum(values) / len(values)

values.sort()
middle = len(values) // 2
median = values[middle]

max_count = 0
mode = None

for number in values:
    count = values.count(number)
    if count > max_count:
        max_count = count
        mode = number

print("Mean:", mean)
print("Median:", median)
print("Mode:", mode)

