investment = float(input("Enter investment amount: "))
interest_rate = (float(input("Enter interest rate: "))) / 100

for year in range(0, 31):
    investment += investment * interest_rate
    print(f"Year {year}: ${investment:,.2f}")

