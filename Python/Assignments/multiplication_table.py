print("\t", end = "")

for rows in range(1, 13):
	print(rows, end = '\t')
print()
print("\t___________________________________________________________________________________________", end = "")
print()
for row2 in range(1, 13):
    print(f"{row2:<2}","  |", end = '\t')

    for col in range(1, 13):
        print(f"{row2 * col:<3}\t", end = "")

    print()
