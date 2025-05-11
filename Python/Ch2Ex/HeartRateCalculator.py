age = int(input("Enter age in years: "))
max_heart_rate = 220 - age
lower_target = 0.5 * max_heart_rate
upper_target = 0.85 * max_heart_rate

if age > 0:
    print("Your target heart rate range is from", lower_target, "to", upper_target, "beats per minute.")
else:
    print("Please enter a valid age")
