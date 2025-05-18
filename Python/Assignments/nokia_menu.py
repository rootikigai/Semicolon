print()
print("""
**********
NOKIA 3310
**********
""")
while True:
    print("""
---------
MAIN MENU
---------
1. Phone Book               7. Call Divert
2. Messages                 8. Games
3. Chat                     9. Calculator
4. Call Register            10. Reminders
5. Tones                    11. Clock
6. Settings                 12. Profiles

            13. SIM Services
Press 0 to QUIT
""")
    main_menu = input("Select a Main Menu Choice with the corresponding number: ")
    if main_menu == "0":
        print("Exiting Menu...")
        break
    match main_menu:
        case "1":
            while True:
                print("""
----------
PHONE BOOK
----------
1. Search               6. Assign Tone
2. Service Nos.         7. Send B'Card
3. Add Name             8. Options
4. Erase                9. Speed Dials
5. Edit                 10. Voice Tags

Press 0 to go back to MAIN MENU
""")
                phone_book = input("Select a Phone Book Menu choice with the corresponding number: ")
                if phone_book == "0":
                    break
                match phone_book:
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
                            phone_book_options = input("Select a Phone Book Options Menu choice with the corresponding number: ")
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
                        print("Invalid choice. Try again!")

        case "2":
            while True:
                print("""
--------
MESSAGES
--------
1. Write Messages           6. Smileys
2. Inbox                    7. Message Settings
3. Outbox                   8. Info Service
4. Picture Messages         9. Voice Mailbox Number
5. Templates                10. Service Command Editor

Press 0 to go back to MAIN MENU
""")
                messages = input("Select a Messages Menu choice with the corresponding number: ")
                if messages == "0":
                    break
                match messages:
                    case "1":
                        print("Write Messages")
                    case "2":
                        print("Inbox")
                    case "3":
                        print("Outbox")
                    case "4":
                        print("Picture Messages")
                    case "5":
                        print("Templates")
                    case "6":
                        print("Smileys")
                    case "7":
                        while True:
                            print("""
----------------
MESSAGE SETTINGS
----------------
1. Set 1         2. Common

Press 0 to go back to MESSAGES MENU
""")
                            message_settings = input("Select a Message Settings Menu choice with the corresponding number: ")
                            if message_settings == "0":
                                break
                            match message_settings:
                                case "1":
                                    while True:
                                        print("""
-----
SET 1
-----
1. Message Centre Number
2. Message Sent As
3. Message Validity

Press 0 to go back to MESSAGE SETTINGS MENU
""")
                                        set1 = input("Select a Set 1 Menu choice with the corresponding number: ")
                                        if set1 == "0":
                                            break
                                        match set1:
                                            case "1":
                                                print("Message Centre Number")
                                            case "2":
                                                print("Messages Sent As")
                                            case "3":
                                                print("Message Validity")
                                            case _:
                                                print("Invalid choice. Try again!")
                                case "2":
                                    while True:
                                        print("""
------
COMMON
------
1. Delivery Reports
2. Reply via Same Centre
3. Character Support

Press 0 to go back to MESSAGE SETTINGS MENU
""")
                                        common = input("Select a Set 1 Menu choice with the corresponding number: ")
                                        if common == "0":
                                            break
                                        match common:
                                            case "1":
                                                print("Delivery Reports")
                                            case "2":
                                                print("Reply via Same Centre")
                                            case "3":
                                                print("Character Support")
                                            case _:
                                                print("Invalid choice. Try again!")

                    case "8":
                        print("Info Service")
                    case "9":
                        print("Voice Mailbox Number")
                    case "10":
                        print("Service Command Editor")
                    case _:
                        print("Invalid choice. Try again!")
