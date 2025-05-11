r = 7 / 100
n = 10
n2 = 20
n3 = 30
p = int(input("Enter the principal amount: "))
a = round((p*(1 + r)**n), 2)
a2 = round((p*(1 + r)**n2), 2)
a3 = round((p*(1 + r)**n3), 2)
print("The value after 10 years is: $", a)
print("The value after 20 years is: $", a2)
print("The value after 30 years is: $", a3)
