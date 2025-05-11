import java.util.Scanner;

public class DirectoryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Main Directory:");
        System.out.println("1. Documents");
        System.out.println("2. Downloads");
        System.out.println("3. Pictures");
        System.out.print("Select a folder (1-3): ");
        int mainChoice = scanner.nextInt();

        switch (mainChoice) {
            case 1:
                System.out.println("\nDocuments Folder:");
                System.out.println("1. Work");
                System.out.println("2. Personal");
                System.out.print("Select a subfolder: ");
                int documentsChoice = scanner.nextInt();

                switch (documentsChoice) {
                    case 1:
                        System.out.println("\nWork Subfolder:");
                        System.out.println("1. Reports.docx");
                        System.out.println("2. Budget.xlsx");
                        System.out.print("Select a file to open: ");
                        int workChoice = scanner.nextInt();

                        switch (workChoice) {
                            case 1:
                                System.out.println("Opening Reports.docx...");
                                break;
                            case 2:
                                System.out.println("Opening Budget.xlsx...");
                                break;
                            default:
                                System.out.println("Invalid file choice!");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("\nPersonal Subfolder:");
                        System.out.println("1. Resume.docx");
                        System.out.println("2. Diary.txt");
                        System.out.print("Select a file to open: ");
                        int personalChoice = scanner.nextInt();

                        switch (personalChoice) {
                            case 1:
                                System.out.println("Opening Resume.docx...");
                                break;
                            case 2:
                                System.out.println("Opening Diary.txt...");
                                break;
                            default:
                                System.out.println("Invalid file choice!");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Invalid Documents subfolder choice!");
                        break;
                }
                break;

            case 2:
                System.out.println("\nDownloads Folder:");
                System.out.println("1. Software");
                System.out.println("2. Music");
                System.out.print("Select a subfolder: ");
                int downloadsChoice = scanner.nextInt();

                switch (downloadsChoice) {
                    case 1:
                        System.out.println("\nSoftware Subfolder:");
                        System.out.println("1. setup.exe");
                        System.out.println("2. installer.msi");
                        System.out.print("Select a file to open: ");
                        int softwareChoice = scanner.nextInt();

                        switch (softwareChoice) {
                            case 1:
                                System.out.println("Opening setup.exe...");
                                break;
                            case 2:
                                System.out.println("Opening installer.msi...");
                                break;
                            default:
                                System.out.println("Invalid file choice!");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("\nMusic Subfolder:");
                        System.out.println("1. Song1.mp3");
                        System.out.println("2. Song2.mp3");
                        System.out.print("Select a file to open: ");
                        int musicChoice = scanner.nextInt();

                        switch (musicChoice) {
                            case 1:
                                System.out.println("Playing Song1.mp3...");
                                break;
                            case 2:
                                System.out.println("Playing Song2.mp3...");
                                break;
                            default:
                                System.out.println("Invalid file choice!");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Invalid Downloads subfolder choice!");
                        break;
                }
                break;

            case 3:
                System.out.println("\nPictures Folder:");
                System.out.println("1. Vacation");
                System.out.println("2. Family");
                System.out.print("Select a subfolder: ");
                int picturesChoice = scanner.nextInt();

                switch (picturesChoice) {
                    case 1:
                        System.out.println("\nVacation Subfolder:");
                        System.out.println("1. Beach.png");
                        System.out.println("2. Mountains.jpg");
                        System.out.print("Select a file to open: ");
                        int vacationChoice = scanner.nextInt();

                        switch (vacationChoice) {
                            case 1:
                                System.out.println("Opening Beach.png...");
                                break;
                            case 2:
                                System.out.println("Opening Mountains.jpg...");
                                break;
                            default:
                                System.out.println("Invalid file choice!");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("\nFamily Subfolder:");
                        System.out.println("1. FamilyPhoto1.jpg");
                        System.out.println("2. FamilyPhoto2.jpg");
                        System.out.print("Select a file to open: ");
                        int familyChoice = scanner.nextInt();

                        switch (familyChoice) {
                            case 1:
                                System.out.println("Opening FamilyPhoto1.jpg...");
                                break;
                            case 2:
                                System.out.println("Opening FamilyPhoto2.jpg...");
                                break;
                            default:
                                System.out.println("Invalid file choice!");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Invalid Pictures subfolder choice!");
                        break;
                }
                break;

            default:
                System.out.println("Invalid Main Directory choice!");
                break;
        }

        scanner.close();
    }
}

