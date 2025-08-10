def doplication(numero1, numero2):
    product = 0
    for numero in range(numero2):
        product += numero1
    return product
    # if num1 == 0 or num2 == 0:
    #     return 0
    # elif num1 < 0 and num2 < 0:
    #     return product
    # elif num2 < 0:
    #     num2 = -(-num2)
    #     num1 = -num1
    # elif num1 < 0:
    #     num1 = -(-num1)
    #     num2 = -num2

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
result = doplication(num1, num2)
print(f"{num1} x {num2} = {result}")
