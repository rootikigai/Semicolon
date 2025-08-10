approx = 0
terms = 0

# Loop to calculate each term of the series
for i in range(1, 100000, 2):  # Loop over odd numbers
    if terms % 2 == 0:  # If the term number is even, subtract
        approx += 4 / i
    else:  # If the term number is odd, add
        approx -= 4 / i
    
    terms += 1
    
    # Check if the approx has reached the desired precision
    if approx >= 3.14159:
        break

# Display the result
print(f"Approximated value of π after {terms} terms: {approx:.5f}")

