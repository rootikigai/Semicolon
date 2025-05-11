password = input('Enter password: ')
counter = 0
for count in password:
    counter += 1
if counter < 8:
    print('Very Weak')
elif counter == 8:
    print('Weak')
elif counter >= 8 and counter <= 16:
    print('Strong')
else: print('Very Strong')
