print("""
----------
MAIN MENU
----------
""")
while True:
    print("""
1. Phone Book               7. Call Divert
2. Messages                 8. Games
3. Chat                     9. Calculator
4. Call Register            10. Reminders
5. Tones                    11. Clock
6. Settings                 12. Profiles

            13. SIM Services
To quit, press 0.
""")
    user_choice = input("Select a Menu with the corresponding number: ")
    if user_choice == 0:
        print("Exiting Menu...")
        break
