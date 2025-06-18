phasegate.js

write a function to validate an ATM card number and identifies the card issuer. the function should take an array representing the card number as input and returns an object, e.g. {valid: true, issuer: "Visa"} if the card number is valid, or {valid: false, reason: "Invalid length"} if invalid. a valid card number must satisfy the following conditions:

	it must contain exactly 16 digits for Visa, Mastercard and Discover, or 15 digits for American Express.
	it must start with a 4 for Visa, 5 for Mastercard, 6 for Discover or 3 for American Express.
	it must not have any other character besides digits.
