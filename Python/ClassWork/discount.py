purchaseAmount = float(input('Enter Purchase: '))
if purchaseAmount >= 1000 and purchaseAmount < 10000:
    discountA = purchaseAmount * 0.05
    newPurchaseAmount = purchaseAmount - discountA
    print(f'Your new purchase amount is {newPurchaseAmount:,.2f}')
elif purchaseAmount >= 10000 and purchaseAmount < 50000:
    discountB = purchaseAmount * 0.10
    newPurchaseAmount = purchaseAmount - discountB
    print(f'Your new purchase amount is {newPurchaseAmount:,.2f}')
elif purchaseAmount >= 50000:
    discountC = purchaseAmount * 0.20
    newPurchaseAmount = purchaseAmount - discountC
    print(f'Your new purchase amount is {newPurchaseAmount:,.2f}')
if purchaseAmount <= 999:
    print('You have no discount')
