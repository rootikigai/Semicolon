a = float(input("Enter the first number:"))
b = float(input("Enter the second number:"))
c = float(input("Enter the third number:"))

if a == b or b == c or a == c:
    print("Please enter three different numbers")
if a <= b and b <= c:
    print("Numbers in ascending order:",a,b,c)
if a <= c and c <= b:
    print("Numbers in ascending order:",a,c,b)
if b <= a and a <= c:
    print("Numbers in ascending order:",b,a,c)
if b <= c and c <= a:
    print("Numbers in ascending order:",b,c,a)
if c <= a and a <= b:
    print("Numbers in ascending order:",c,a,b)
if c <= b and b <= a:
    print("Numbers in ascending order:",c,b,a)
