import random

programRun = 0
numOfTrials = 0
countCorrect = 0
countWrong = 0
wrong = 0
ans = 0
while(programRun != 10):
    num1 = random.randint(0, 100)
    num2 = random.randint(0, 100)
    if(programRun > 9):
        break
    else:
        if(num1 < num2):
            temp = num1
            num1 = num2
            num2 = temp
        
        result = num1 - num2
        print("What is ", num1 , " - " , num2 , "?: ")
        ans = int(input())
        if(ans == result):
            print(f"{ans} is correct.")
            countCorrect = countCorrect + 1
        elif(ans != result):
            for wrong in range(0, 1, +1):
                print("Wrong. One trial left!")
                ans = int(input())
                if(ans == result):
                    print(f"{ans} is correct.")
                    countCorrect = countCorrect + 1
                else:
                    countWrong = countWrong + 1

            countWrong = countWrong + 1
        
    print(f"{countCorrect} correct score!");
    print(f"{countWrong} wrong score!")
    programRun = programRun + 1

