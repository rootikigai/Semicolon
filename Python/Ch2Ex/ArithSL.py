num1 = int(input('Enter first integer: '))
num2 = int(input('Enter first integer: '))
num3 = int(input('Enter first integer: '))

sum = num1 + num2 + num3
average = sum / 3
product = num1 * num2 * num3

largest = num1

if num2 > num1:
	largest = num2

if num3 > num2:
	largest = num3

smallest = num1

if num2 < num1:
	smallest = num2

if num3 < num2:
	smallest = num3

print('Sum is: ', sum)
print('Average is: ', average)
print('Product is: ', product)
print('Smallest number is:', smallest)
print('Largest number is:', largest)
