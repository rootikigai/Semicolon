import java.util.Scanner;

public class NokiaMenu {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//MAIN MENU
		String displayMenu = """

\t\t___Menu___
1 => Phone Book\t\t\t7 => Call Divert
2 => Message\t\t\t8 => Games
3 => Chat\t\t\t9 => Calculator
4 => Call Register\t\t10=> Reminders
5 => Tones\t\t\t11=> Clock
6 => Settings\t\t\t12=> Profiles
\t\t13=> SIM Services

Select Menu (Enter corresponding number): """;
    System.out.print(displayMenu);
    int mainMenu = input.nextInt();

      switch(mainMenu){
        case 1://PHONE BOOK MENU
		      String displayPhoneBook = """

\t\t___Phone Book___
1 => Search\t\t6 => Assign Tone
2 => Service Nos.\t7 => Send B'Card
3 => Add Name\t\t8 => Options
4 => Erase\t\t9 => Speed Dials
5 => Edit\t\t10=> Voice Tags

Select Menu (Enter corresponding number): """;
          System.out.print(displayPhoneBook);
          int phoneBookMenu = input.nextInt();

            switch(phoneBookMenu){
              case 1:
                System.out.println("Search");
                break;
              case 2:
                System.out.println("Service Nos.");
                break;
              case 3:
                System.out.println("Add Name");
                break;
              case 4:
                System.out.println("Erase");
                break;
              case 5:
                System.out.println("Edit");
                break;
              case 6:
                System.out.println("Assign Tone");
                break;
              case 7:
                System.out.println("Send B'Card");
                break;
              case 8://PHONEBOOK OPTIONS MENU
		            String displayPhoneBookOptions = """

\t\t___Options___
1 => Type of View
2 => Memory Status

Select Menu (Enter corresponding number): """;
                System.out.print(displayPhoneBookOptions);
                int phoneBookOptions = input.nextInt();

                  switch(phoneBookOptions){
                    case 1:
                      System.out.println("Type of View");
                      break;
                    case 2:
                      System.out.println("Memory Status");
                      break;
                    default:
                      System.out.println("Invalid selection");
                      break;
                  }//END OF SWITCH
                break;//BREAK FOR PHONEBOOK OPTIONS MENU
              case 9:
                System.out.println("Speed Dials");
                break;
              case 10:
                System.out.println("Voice Tags");
                break;
              default:
                System.out.println("Invalid selection");
                break;
            }//END OF SWITCH
          break;//BREAK FOR PHONEBOOK MENU

        case 2://MESSAGES MENU
          String displayMessagesMenu = """

\t\t___Messages___
1 => Write Messages\t\t6 => Smileys
2 => Inbox\t\t\t7 => Message Settings
3 => Outbox\t\t\t8 => Info Service
4 => Picture Messages\t\t9 => Voice Mailbox Number
5 => Templates\t\t\t10=> Service Command Editor

Select Menu (Enter corresponding number): """;
          System.out.print(displayMessagesMenu);
          int messagesMenu = input.nextInt();

            switch(messagesMenu){
              case 1:
                System.out.println("Write Messages");
                 break;
              case 2:
                System.out.println("Inbox");
                break;
              case 3:
                System.out.println("Outbox");
                break;
              case 4:
                System.out.println("Picture Messages");
                break;
              case 5:
                System.out.println("Templates");
                break;
              case 6:
                System.out.println("Smileys");
                break;
              case 7:
                String displayMessageSettingsMenu = """

\t\t___Message Settings___
1 => Set 1
2 => Common

Select Menu (Enter corresponding number): """;
                System.out.print(displayMessageSettingsMenu);
                int messageSettingsMenu = input.nextInt();

                  switch(messageSettingsMenu){
                    case 1://SET 1 MENU
                      String displaySet1Menu = """

\t\t___Set 1___
1 => Message Centre Number
2 => Messages Sent As
3 => Message Validity

Select Menu (Enter corresponding number): """;
                      System.out.print(displaySet1Menu);
                      int set1Menu = input.nextInt();

                        switch(set1Menu){
                          case 1:
                            System.out.println("Message Centre Number");
                            break;
                          case 2:
                            System.out.println("Messages Sent As");
                            break;
                          case 3:
                            System.out.println("Message Validity");
                            break;
                          default:
                            System.out.println("Invalid selection");
                            break;
                        }
                      break;//END OF SET 1 MENU

                    case 2://COMMON MENU
                      String displayCommonMenu = """

\t\t___Common Menu___
1 => Delivery Reports
2 => Reply Via Same Centre
3 => Character Support

Select Menu (Enter corresponding number): """;
                      System.out.print(displayCommonMenu);
                      int commonMenu = input.nextInt();

                        switch(commonMenu){
                          case 1:
                            System.out.println("Delivery Reports");
                            break;
                          case 2:
                            System.out.println("Reply Via Same Centre");
                            break;
                          case 3:
                            System.out.println("Character Support");
                            break;
                          default:
                            System.out.println("Invalid selection");
                            break;
                        }//END OF MESSAGES COMMON MENU
                      break;
                    default:
                      System.out.println("Invalid selection");
                      break;
                    }//END OF MESSAGE SETTINGS MENU
                break;

              case 8:
                System.out.println("Info Service");
                break;
              case 9:
                System.out.println("Voice Mailbox Number");
                break;
              case 10:
                System.out.println("Service Command Editor");
                break;
              default:
                System.out.println("Invalid selection");
                break;
            }//END OF MESSAGES MENU
          break;//BREAK FOR MESSAGES MENU

        case 3://CHAT MENU
          System.out.println("Chat");
          break;

        case 4:// CALL REGISTER MENU
          String displayCallRegisterMenu = """

\t\t___Call Register___
1 => Missed Calls\t\t5 => Erase Recent Call Lists
2 => Received Calls\t\t\t6 => Show Call Costs
3 => Dialled Numbers\t\t\t7 => Call Cost Settings
4 => Picture Messages\t\t8 => Prepaid Credit

Select Menu (Enter corresponding number): """;
          System.out.print(displayCallRegisterMenu);
          int callRegisterMenu = input.nextInt();

            switch(callRegisterMenu){
              case 1:
                System.out.println("Missed Calls");
                break;
              case 2:
                System.out.println("Received Calls");
                break;
              case 3:
                System.out.println("Dialled Numbers");
                break;
              case 4:
                System.out.println("Erase Recent Call Lists");
                break;
              case 5://SHOW CALL DURATION MENU
                String displayShowCallDurationMenu = """

\t\t___Show Call Duration___
1 => Last Call Duration\t\t5 => Clear Timers
2 => All Calls' Duration
3 => Received Calls' Duration
4 => Dialled Calls' Duration

Select Menu (Enter corresponding number): """;
                System.out.print(displayShowCallDurationMenu);
                int showCallDurationMenu = input.nextInt();

                  switch(showCallDurationMenu){
                    case 1:
                      System.out.println("Last Call Duration");
                      break;
                    case 2:
                      System.out.println("All Calls' Duration");
                      break;
                    case 3:
                      System.out.println("Received Calls' Duration");
                      break;
                    case 4:
                      System.out.println("Dialled Calls' Duration");
                      break;
                    case 5:
                      System.out.println("Clear Timers");
                      break;
                    default:
                      System.out.println("Invalid selection");
                      break;
                  }// END OF SHOW CALL DURATION MENU
                break;//BREAK FOR SHOW CALL DURATION MENU

              case 6:
                System.out.println("Show Call Costs");
                break;
              case 7:
                System.out.println("Call Cost Settings");
                break;
              case 8:
                System.out.println("Prepaid Credit");
                break;
              default:
                System.out.println("Invalid selection");
                break;
            }//END OF CALL REGISTER MENU
          break;

        case 5:// TONES MENU
		      String displayTonesMenu = """

\t\t___Tones___
1 => Ringing Tone\t\t\t6 => Keypad Tones
2 => Ringing Volume\t\t\t7 => Warning and Game Tones
3 => Incoming Call Alert\t\t\t8 => Vibrating Alert
4 => Composer\t\t9 => Screen Saver
5 => Message Alert Tone

Select Menu (Enter corresponding number): """;
          System.out.print(displayTonesMenu);
          int tonesMenu = input.nextInt();

            switch(tonesMenu){
              case 1:
                System.out.println("Ringing Tone");
                break;
              case 2:
                System.out.println("Ringing Volume");
                break;
              case 3:
                System.out.println("Incoming Call Alert");
                break;
              case 4:
                System.out.println("Composer");
                break;
              case 5:
                System.out.println("Message Alert Tone");
                break;
              case 6:
                System.out.println("Keypad Tones");
                break;
              case 7:
                System.out.println("Warning and Game Tones");
                break;
              case 8:
                System.out.println("Vibrating Alert");
                break;
              case 9:
                System.out.println("Screen Saver");
                break;
              default:
                System.out.println("Invalid selection");
                break;
            }// END OF TONES MENU
          break;

        case 6:// SETTINGS MENU
          String displaySettingsMenu = """

\t\t___Settings___
1 => Call Settings
2 => Phones Settings
3 => Security Settings
4 => Restore Factory Settings

Select Menu (Enter corresponding number): """;
          System.out.println(displaySettingsMenu);
          int settingsMenu = input.nextInt();

            switch(settingsMenu){
              case 1:
                String displayCallSettingsMenu = """

\t\t___Call Settings___
1 => Automatic Redial\t\t\t4 => Own Number Sending
2 => Speed Dialling\t\t\t5 => Phone Line In Use
3 => Call Waiting Options\t\t\t6 => Automatic Answer

Select Menu (Enter corresponding number): """;
                System.out.println(displayCallSettingsMenu);
                int callSettingsMenu = input.nextInt();

                  switch(callSettingsMenu){
                    case 1:
                      System.out.println("Automatic Redial");
                      break;
                    case 2:
                      System.out.println("Speed Dialling");
                      break;
                    case 3:
                      System.out.println("Call Waiting Options");
                      break;
                    case 4:
                      System.out.println("Own Number Sending");
                      break;
                    case 5:
                      System.out.println("Phone Line In Use");
                      break;
                    case 6:
                      System.out.println("Automatic Answer");
                      break;
                  }//END OF CALL SETTINGS MENU
                break;

              case 2:
                String displayPhoneSettingsMenu = """

\t\t___Phone Settings___
1 => Language\t\t\t\t4 => Network Selection
2 => Cell Info Display\t\t\t5 => Lights
3 => Welcome Note\t\t\t6 => Confirm SIM Service Actions

Select Menu (Enter corresponding number): """;
                System.out.println(displayPhoneSettingsMenu);
                int phoneSettingsMenu = input.nextInt();

                  switch(phoneSettingsMenu){
                    case 1:
                      System.out.println("Language");
                      break;
                    case 2:
                      System.out.println("Cell Info Display");
                      break;
                    case 3:
                      System.out.println("Welcome Note");
                      break;
                    case 4:
                      System.out.println("Network Selection");
                      break;
                    case 5:
                      System.out.println("Lights");
                      break;
                    case 6:
                      System.out.println("Confirm SIM Service Actions");
                      break;
                    default:
                      System.out.println("Invalid selection");
                      break;
                  }// END OF PHONE SETTINGS MENU
                break;

              case 3:
                String displaySecuritySettingsMenu = """

\t\t___Security Settings___
1 => PIN Code Request\t\t\t4 => Closed User Group
2 => Call Barring Service\t\t\t5 => Phone Security
3 => Fixed Dialling\t\t\t6 => Change Access Codes

Select Menu (Enter corresponding number): """;
                System.out.println(displaySecuritySettingsMenu);
                int securitySettingsMenu = input.nextInt();

                  switch(securitySettingsMenu){
                    case 1:
                      System.out.println("PIN Code Request");
                      break;
                    case 2:
                      System.out.println("Call Barring Service");
                      break;
                    case 3:
                      System.out.println("Fixed Dialling");
                      break;
                    case 4:
                      System.out.println("Closed User Group");
                      break;
                    case 5:
                      System.out.println("Phone Security");
                      break;
                    case 6:
                      System.out.println("Change Access Codes");
                      break;
                    default:
                      System.out.println("Invalid selection");
                      break;
                  }// END OF SECURITY SETTINGS MENU
                break;

              case 4:
                System.out.println("Restore Factory Settings");
                break;
              default:
                System.out.println("Invalid selection");
            }// END OF SETTINGS MENU
          break;

        case 7:// CALL DIVERT
          break;
        case 8:// GAMES
          System.out.println("Games");
          break;
        case 9:// CALCULATOR
          System.out.println("Calculator");
          break;
        case 10:// REMINDERS
          System.out.println("Reminders");
          break;
        case 11:// CLOCK
          String displayClockMenu = """

\t\t___Clock___
1 => Alarm Clock\t\t\t4 => Stopwatch
2 => Clock Settings\t\t\t5 => Countdown Timer
3 => Date Setting\t\t\t6 => Auto Update of Date and Time

Select Menu (Enter corresponding number): """;
          System.out.println(displayClockMenu);
          int clockMenu = input.nextInt();

            switch(clockMenu){
              case 1:
                System.out.println("Alarm Clock");
                break;
              case 2:
                System.out.println("Clock Settings");
                break;
              case 3:
                System.out.println("Date Settings");
                break;
              case 4:
                System.out.println("Stopwatch");
                break;
              case 5:
                System.out.println("Countdown Timer");
                break;
              case 6:
                System.out.println("Auto Update of Date and Time");
                break;
              default:
                System.out.println("Invalid selection");
                break;
            }// END OF CLOCK MENU
          break;

        case 12:// PROFILES
          System.out.println("Profiles");
          break;
        case 13:// SIM SERVICES
          System.out.println("SIM Services");
          break;
        default:
          System.out.println("Invalid selection");
          break;
    }//END OF MAIN MENU
  }
}
