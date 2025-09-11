def create_account(name):
    return{"name": name, "balance": 0.00}

#print(create_account("Kelvin Ikigai"))

def deposit_funds(account, amount):
    account["balance"] += amount

account = create_account("Ying Yang")
deposit_funds(account, account["balance"])
#print(f"Your new account is created and deposit has been made into your account, {account}")
