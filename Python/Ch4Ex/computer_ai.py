import random

def generate_question():
    num1 = random.randrange(1, 9)
    num2 = random.randrange(1, 9)
    return (num1, num2)

def multiplication_quiz():
    num1, num2 = generate_question()
    correct_answer = num1 * num2

    while True:
        user_answer = int(input(f"How much is {num1} times {num2}? "))
        if user_answer == correct_answer:
            print("Very good!")
            return  
        else:
            print("No. Please try again.")

multiplication_quiz()