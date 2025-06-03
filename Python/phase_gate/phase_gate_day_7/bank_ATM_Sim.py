balance = 0
multiples = 500
withdrawal = 0
withdrawalFee = 100
newBalance = 0
withdrawAgain = 0

print("SEMICOLON BANK\nYou are welcome.")
print()

menuChoice = int(input("Enter 1 to input your account balance\nEnter 0 to exit: "))
while(menuChoice != 0):
    if(menuChoice == 0):
        print("Thank you for banking with us. Goodbye!")
        break
    elif(menuChoice == 1):
        balance = int(input("Enter your account balance: "))
        if(balance < 100):
            print("Sorry, your account cannot be lower than =N=100.")
        else:
            while True:
                withdrawal = int(input("Enter a withdrawal amount (multiples of =N=500 or =N=1000 only): "))
                if withdrawal % multiples != 0:
                    print("Invalid! Amount must be a multiple of =N=500.")
                elif withdrawal + withdrawalFee > balance:
                    print("Insufficient funds for this transaction.")
                else:
                    newBalance = balance - (withdrawal + withdrawalFee)
                    print("Transaction Successful!")
                    print("Withdrawal Amount: =N=" + str(withdrawal))
                    print("Withdrawal Fee: =N=" + str(withdrawalFee))
                    print("Remaining Balance is: =N=" + str(newBalance))
                    balance = newBalance  # update balance

                withdrawAgain = int(input("Would you like to make another withdrawal? (Press 1 for yes and 2 for no): "))
                if withdrawAgain != 1:
                    break

    else:
        print("Invalid! Enter 1 to input your account balance or 0 to exit!")

    menuChoice = int(input("Enter 1 to input your account balance\nEnter 0 to exit: "))

