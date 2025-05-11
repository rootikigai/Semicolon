for row in range(11):
    for column in range(1, row, +1):
        print('*', end="")
    print()

print()

for row in range(1, 11):
    for column in range(11, row, -1):
        print('*', end='')
    print()

