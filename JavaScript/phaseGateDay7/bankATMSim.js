//function bankATMSim(balance, withdrawal):
const prompt = require("prompt-sync")();

let multiples = 500;
let withdrawal;
let withdrawalFee = 100;
let newBalance;
let withdrawAgain;
let welcome = "SEMICOLON BANK\nYou are welcome.";
	console.log(welcome);
let menuChoice = prompt("Enter 1 to input your account balance\nEnter 0 to exit!: ");
while(menuChoice != 0){
  if(menuChoice == 0){
    console.log("Thank you for banking with us. Goodbye!");
    break;
  }
  else if(menuChoice == 1){
    balance = prompt("Enter your account balance: ");
    if(balance < 100){
      console.log("Sorry, your account cannot be lower than =N=100.");
    }
    else{
      while(true){
        withdrawal = prompt("Enter a withdrawal amount (multiples of =N=500 or =N=1000 only): ");
        if(withdrawal % multiples != 0){
          console.log("Invalid!");
        }
        else{
          newBalance = (balance) - (withdrawal + 100);
          console.log("Transaction Successful!");
          console.log("Withdrawal Amount: " + withdrawal);
          console.log("Withdrawal Fee: " + withdrawalFee);
          console.log("Remaining Balance is: " + newBalance);
        break;
        }
      }
      menuChoice = prompt("Would you like to make another withdrawal?(Press 1 for yes and 0 for no): ");
    }
    }
  else{
    prompt("Invalid! Enter 1 to input your account balance or 0 to exit!");
    menuChoice = prompt("Invalid! Enter 1 to input your account balance or 0 to exit!");
  }
}
