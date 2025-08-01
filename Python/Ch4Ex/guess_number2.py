import random 
def guess_the_number():
	number_to_guess = random.randrange(1, 1000)
	print(number_to_guess)
	print("Guess a number between 1 and 1000: ")
	print(f"You have 10 attempt")

	guess = None
	for attempt in range(1, 11):
		print("Either you know the secret or you got lucky!.")
		guess = int(input(f"Enter your guess{attempt}: "))

		if guess > 1000:
			print("Invalid numbers")
			print("Number must be between 1 and 1000:  ")
			continue;

		if guess < number_to_guess:
			print("Too low. Try again: ")
		elif guess > number_to_guess:
			print("Too high. Try again: ")
		elif guess == number_to_guess: 
			print("Wow. Congratulations!. Computer is proud of you")
			break
		if attempt == 10:	
			print("You should be able to do better!")
	
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


		

			