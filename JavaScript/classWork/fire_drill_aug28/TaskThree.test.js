const student = require('./TaskTwo');

test("deposit function adds amount to balance", () => {
    expect(bankAccount.deposit(200)).toBe(700);
});

test("withdraw function deducts amount from balance", () => {
    expect(bankAccount.withdraw(100)).toBe(400);
});