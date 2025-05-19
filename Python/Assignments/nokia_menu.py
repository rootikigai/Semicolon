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

        case "3":
            print("CHAT")
        case "4":
            while True:
                print("""
-------------
CALL REGISTER
-------------
1. Missed Calls              5. Show Call Duration
2. Received Calls            6. Show Call Costs
3. Dialled Numbers           7. Call Cost Settings
4. Erase Recent Call Lists   8. Prepaid Credit

Press 0 to go back to MAIN MENU
""")
                call_register = input("Select a Call Register Menu choice with the corresponding number: ")
                if call_register == "0":
                    break
                match call_register:
                    case "1":
                        print("Missed Calls")
                    case "2":
                        print("Received Calls")
                    case "3":
                        print("Dialled Numbers")
                    case "4":
                        print("Erase Recent Call List")
                    case "5":
                        while True:
                            print("""
------------------
SHOW CALL DURATION
------------------
1. Last Call Duration               4. Dialled Calls' Duration
2. All Calls' Duration              5. Clear Timers
3. Received Calls' Duration

Press 0 to go back to CALL REGISTER MENU
""")
                            show_call_duration = input("Select a Show Call Duration Menu choice with the corresponding number: ")
                            if show_call_duration == "0":
                                break
                            match show_call_duration:
                                case "1":
                                    print("Last Call Duration")
                                case "2":
                                    print("All Call's Duration")
                                case "3":
                                    print("Received Calls' Duration")
                                case "4":
                                    print("Dialled Calls' Duration")
                                case "5":
                                    print("Clear Timers")
                                case _:
                                    print("Invalid choice. Try again!")

                    case "6":
                        while True:
                            print("""
---------------
SHOW CALL COSTS
---------------
1. Last Call Cost
2. All Calls' Costs
3. Clear Counters

Press 0 to go back to CALL REGISTER MENU
""")
                            show_call_costs = input("Select a Show Call Costs Menu choice with the corresponding number:")
                            if show_call_costs == "0":
                                break
                            match show_call_costs:
                                case "1":
                                    print("Last Call Cost")
                                case "2":
                                    print("All Calls' Costs")
                                case "3":
                                    print("Clear Counters")
                                case _:
                                    print("Invalid choice. Try again!")

                    case "7":
                        while True:
                            print("""
------------------
CALL COST SETTINGS
------------------
1. Call Cost Limit
2. Show Costs In

Press 0 to go back to CALL REGISTER MENU
""")
                            call_cost_settings = input("Select a Show Call Costs Menu choice with the corresponding number:")
                            if call_cost_settings == "0":
                                break
                            match call_cost_settings:
                                case "1":
                                    print("Call Cost Limit")
                                case "2":
                                    print("Show Costs In")
                                case _:
                                    print("Invalid choice. Try again!")

                    case "8":
                        print("Prepaid Credit")

        case "5":
            while True:
                print("""
-----
TONES
-----
1. Ringing Tone              5. Message Alert Tone
2. Ringing Volume            6. Keypad Tones
3. Incoming Call Alert       7. Warning and Game Tones
4. Composer                  8. Vibrating Alert
                9. Screen Saver

Press 0 to go back to MAIN MENU
""")
                tones = input("Select a Tones Menu choice with the corresponding number:")
                if tones == "0":
                    break
                match tones:
                    case "1":
                        print("Ringing Tone")
                    case "2":
                        print("Ringing Volume")
                    case "3":
                        print("Incoming Call Alert")
                    case "4":
                        print("Composer")
                    case "5":
                        print("Message Alert Tone")
                    case "6":
                        print("Keypad Tones")
                    case "7":
                        print("Warning and Game Tones")
                    case "8":
                        print("Vibrating Alert")
                    case "9":
                        print("Screen Saver")
                    case _:
                        print("Invalid choice. Try again!")

        case "6":
            while True:
                print("""
--------
SETTINGS
--------
1. Call Settings        3. Security Settings
2. Phone Settings       4. Restore Factory Settings

Press 0 to go back to MAIN MENU
""")
                settings = input("Select a Settings Menu choice with the corresponding number:")
                if settings == "0":
                    break
                match settings:
                    case "1":
                        while True:
                            print("""
-------------
CALL SETTINGS
-------------
1. Automatic Redial             4. Own Number Sending
2. Speed Dialling               5. Phone Line in Use
3. Call Waiting Options         6. Automatic Answer

Press 0 to go back to SETTINGS MENU
""")
                            call_settings = input("Select a Call Settings Menu choice with the corresponding number:")
                            if call_settings == "0":
                                break
                            match call_settings:
                                case "1":
                                    print("Automatic Redial")
                                case "2":
                                    print("Speed Dialling")
                                case "3":
                                    print("Call Waiting Options")
                                case "4":
                                    print("Own Number Sending")
                                case "5":
                                    print("Phone Line In Use")
                                case "6":
                                    print("Automatic Answer")
                                case _:
                                    print("Invalid choice. Try again!")


                    case "2":
                        while True:
                            print("""
--------------
PHONE SETTINGS
--------------
1. Language                     4. Network Selection
2. Cell Info Display            5. Lights
3. Welcome Note                 6. Confirm SIM Service Actions

Press 0 to go back to SETTINGS MENU
""")
                            phone_settings = input("Select a Phone Settings Menu choice with the corresponding number:")
                            if phone_settings == "0":
                                break
                            match phone_settings:
                                case "1":
                                    print("Language")
                                case "2":
                                    print("Cell Info Display")
                                case "3":
                                    print("Welcome Note")
                                case "4":
                                    print("Network Selection")
                                case "5":
                                    print("Lights")
                                case "6":
                                    print("Confirm SIM Service Actions")
                                case _:
                                    print("Invalid choice. Try again!")

                    case "3":
                        while True:
                            print("""
-----------------
SECURITY SETTINGS
-----------------
1. PIN Code Request                     4. Closed User Group
2. Call Barring Service                 5. Phone Security
3. Fixed Dialling                       6. Change Access Codes

Press 0 to go back to SETTINGS MENU
""")
                            security_settings = input("Select a Security Settings Menu choice with the corresponding number:")
                            if security_settings == "0":
                                break
                            match security_settings:
                                case "1":
                                    print("PIN Code Request")
                                case "2":
                                    print("Call Barring Service")
                                case "3":
                                    print("Fixed Dialling")
                                case "4":
                                    print("Closed User Group Default")
                                case "5":
                                    print("Phone Security")
                                case "6":
                                    print("Change Access Codes")
                                case _:
                                    print("Invalid choice. Try again!")

                    case "4":
                        print("Restore Factory Settings")
                    case _:
                        print("Invalid choice. Try again!")

        case "7":
            print("CALL DIVERT")
        case "8":
            print("GAMES")#Abeg, build one snake xenzia game for here join lol!
        case "9":
            print("CALCULATOR")#Build calculator join!
        case "10":
            print("REMINDERS")
        case "11":
            while True:
                print()

        case "12":
            print("PROFILES")
        case "13":
            print("SIM Services")
        case _:
            print("Invalid choice. Try again!")
