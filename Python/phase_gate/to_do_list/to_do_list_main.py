tasks = []
while True:
    print("""
MENU:
1. Add a task
2. View all tasks
3. Mark a task as completed
4. Delete a task
Press '0' to exit
""")
    menu = input("Select: ")
    if menu == "0":
        print("App Closed!")
        break
