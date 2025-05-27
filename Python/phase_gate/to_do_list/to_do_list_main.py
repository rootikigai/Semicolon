from to_do_list_functions import add_task
print("""
To-Do List Manager
""")
while True:
    print("""
MENU:
1. Add a task
2. View task
3. Mark task as completed
4. Delete task
Press '0' to exit
""")
    menu = input("Enter your choice: ")
    if menu == "0":
        print("App Closed")
        break
    match menu:
        case "1":
            while True:
                add_a_task = input("""Enter the task (To go back to menu, enter "0"): 
""")
                if add_a_task == "0":
                    break
                match add_a_task:
                    print("No task added")

        case "2":
            while True:

        case "3":

        case "4":

        case _:
            print("Invalid choice. Try again!")
