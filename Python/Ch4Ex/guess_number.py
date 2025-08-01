import random 
def guess_the_number():
	number_to_guess = random.randrange(1, 1000)
	print(number_to_guess)
	print("Guess a number between 1 and 1000: ")
	
	guess = None
	while guess != number_to_guess:
		guess = int(input("Enter your guess: "))

		if guess > 1000:
			print("Invalid numbers")
			print("Number must be between 1 and 1000:  ")
			continue;

		if guess < number_to_guess:
			print("Too low. Try again: ")
		elif guess > number_to_guess:
			print("Too high. Try again: ")
		else: 
			print("Congratulations. Your guess is correct")
	while True:
		play_again = int(input("Enter 1 to continue or 0 to stop: "))
		if play_again == 1:
			guess_the_number()
			
		elif play_again == 0:
			print("Thanks for playing.")
			break			
		else:
			print("Invalid input. Please enter 1 or 0: ")
			continue
guess_the_number()


		

			