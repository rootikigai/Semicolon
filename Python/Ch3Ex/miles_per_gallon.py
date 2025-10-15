total_miles = 0
total_gallons = 0

while True:
    gallons = float(input("Enter the gallons used (enter -1 to stop): "))
    
    if gallons == -1:
        break    
    miles = float(input("Enter the miles driven: "))
    
    mpg = miles / gallons
    print(f"The miles per gallon for this tank was {mpg:.6f}")
    
    total_miles += miles
    total_gallons += gallons

if total_gallons > 0:
    overall_mpg = total_miles / total_gallons
    print(f"The overall average miles/gallon was {overall_mpg:.6f}")
else:
    print()

