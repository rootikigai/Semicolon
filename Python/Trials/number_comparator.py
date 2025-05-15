#print("Enter 2 numbers to be compared with each other. The results are:"0" = Numbers are equal, "1" = First number is higher than the second, "-1" = Second number is higher than the first")
#print()
num1 = int(input("Enter a number: "))
num2 = int(input("Enter another number: "))

if num1 == num2:
	print("0")
elif num1 > num2:
	print("1")
else:
	print("-1")
