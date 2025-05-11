#Initialize
passes = 0
fails = 0
counter = 10

#Process
result = int(input('Enter result (1=pass, 2=fail): '))

while (True):
    if result == 1:
        passes = passes + 1
        counter = counter - 1
        result = int(input('Enter result (1=pass, 2=fail): '))
        if counter < 1:
            print('Total failure(s) = ', fails)

    elif result == 2:
        fails = fails + 1
        counter = counter - 1
        result = int(input('Enter result (1=pass, 2=fail): '))
        if counter < 1:
            print('Total failure(s) = ', fails)

if result != 1 or result != 2:
    print('Wrong input')

if counter == 0:
    print('Total failure(s) = ', fails)
#Loop Back
