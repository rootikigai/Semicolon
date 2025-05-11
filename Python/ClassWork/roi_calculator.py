"""
prompt user for investment amount
prompt user for number of years
prompt user for interest rate
print the roi from year 1 to the given number of years
"""

investment_amount = float(input('Enter investment amount: '))
investment_duration = int(input('Enter the duration of investment: '))
rate = float(input('Enter the annual interest rate: '))
interest_rate = rate / 100

for num in range(0, investment_duration, +1):
    returns = ((1 + interest_rate)**num) * 100
    roi = (investment_amount + returns)
    print(f'Return on Investment after {num+1} year(s) is NGN{roi:,.2f}')
