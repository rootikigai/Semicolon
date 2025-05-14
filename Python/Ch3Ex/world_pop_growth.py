population = 8000000000
growth_rate = 0.0103

for year in range(1, 101):
    increase = population * growth_rate
    population += increase
    print(f"Year {year}: Population = {int(population)}, Increase = {int(increase)}")

