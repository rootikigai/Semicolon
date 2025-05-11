"""
PseudoCode
Initialize variables p, r and n (where they respectively mean Principal, Annual Interest Rate and Loan duration) and collect inputs for them each.
initialize constant variable monR (to store the monthly rate value) and assign value of rate in decimals divided by 12 months.
initialize constant variable monN (to store value for number of months in the number of years entered) and assign value of n multiplied by 12 months
check if rate inputted is 0 to avoid divisible by 0 error else, do the math.
initialize variables num for numerator and denom for denominator and assign values like so:
numerator: Principal value multiplied by monthly rate multiplied by the value of 1 + monthly rate raised to the power of the loan duration in months
denominator: the value of 1 + monthly rate raised to the power of the loan duration in months, all minus 1
outside the else statement, calculate for m: m is equal to num divided by denom
print the value of m
"""

p = float(input("Enter the exact amount to borrow: "))
r = float(input("Enter the annual interest rate: "))
n = int(input("Enter loan duration in Years: "))
monR = (r / 100) / 12
monN = int (n * 12)
num = (p * monR) * ((1 + monR) ** monN)
denom = ((1 + monR) ** monN) - 1
if r == 0:
    m = p / monN
else:
    m = num / denom
print ('Monthly repayment is: ', round(m,2))

