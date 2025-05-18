print()
print("""
**********
NOKIA 3310
**********
""")
while True:
    print("""
----------
MAIN MENU
----------
1. Phone Book               7. Call Divert
2. Messages                 8. Games
3. Chat                     9. Calculator
4. Call Register            10. Reminders
5. Tones                    11. Clock
6. Settings                 12. Profiles

            13. SIM Services
To quit, press 0.
""")
    main_menu = input("Select a Main Menu Choice with the corresponding number: ")
    if main_menu == "0":
        print("Exiting Menu...")
        break

    match main_menu:
        case "1":
            while True:
                print("""
---------------
PHONE BOOK MENU
---------------
1. Search               6. Assign Tone
2. Service Nos.         7. Send B'Card
3. Add Name             8. Options
4. Erase                9. Speed Dials
5. Edit                 10. Voice Tags

Press 0 to go back to MAIN MENU
""")
                phone_book_menu = input("Select a Phone Book Menu choice with the corresponding number: ")
                if phone_book_menu == "0":
                    break
                match phone_book_menu:
                    case "1":
                        print("Search")
                    case "2":
                        print("Service Nos.")
                    case "3":
                        print("Add Name")
                    case "4":
                        print("Erase")
                    case "5":
                        print("Edit")
                    case "6":
                        print("Assign Tone")
                    case "7":
                        print("Send B'Card")
                    case "8":
                        while True:
                            print("""
-------
OPTIONS
-------
1. Type of View         2. Memory Status

Press 0 to go back to PHONE BOOK MENU
""")
                            phone_book_options = input("Select a Phone Book Menu choice with the corresponding number: ")
                            if phone_book_options == "0":
                                break
                            match phone_book_options:
                                case "1":
                                    print("Type of View")
                                case "2":
                                    print("Memory Status")
                                case _:
                                    print("Invalid choice...*Bombastic side eye*. Try again!")
                    case "9":
                        print("Speed Dials")
                    case "10":
                        print("Voice Tags")
                    case _:
                        print("Invalid choice...*I fit deck you o!*. Try again!")

