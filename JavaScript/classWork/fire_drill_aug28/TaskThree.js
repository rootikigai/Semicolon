let balance;

function deposit(amount) {
    balance += amount;
    return balance;
};

function withdraw(amount) {
    if (amount > balance) {
        return "Insufficient funds";
    }
    balance -= amount;
    return balance;
};

let bankAccount = {
    owner: "Alice",
    openingBalance: 500,
    deposit: deposit(),
    withdraw: withdraw()
}

deposit(200);
console.log(bankAccount.balance);
withdraw(1000);
console.log(bankAccount.balance);

console.log("Final Balance:", bankAccount.balance);