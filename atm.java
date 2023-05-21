import java.util.Scanner;

public class atm {
    static int deposit = 0;

    static void atm() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Afzal's ATM");
        System.out.println("We assume you are a new user. Please register your AtM number and PIN code.");

        System.out.print("Register 5-digit ATM number: ");
        int atmNumber = scan.nextInt();

        System.out.print("Register 3-digit PIN code: ");
        int pinCode = scan.nextInt();

        System.out.print("Amont to be deposited: ");
        deposit = scan.nextInt();

        System.out.println("Validation: ");

        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter your 5-digit ATM number: ");
            int atm = scan.nextInt();

            System.out.print("Enter your 3-digit PIN code: ");
            int pin = scan.nextInt();

            if (atm == atmNumber && pin == pinCode) {
                System.out.println("Congratulations! You have successfully logged in.");
                performTransactions(scan);
                return;
            } else {
                attempts++;
                System.out.println("Invalid ATM number or PIN. Please try again. Remaining attempts: " + (3 - attempts));
            }
        }

        terminateAccount();
    }

    static void performTransactions(Scanner scan) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect account type:");
            System.out.println("1. SAVING\n2. CURRENT\n3. DEFAULT");
            int accountType = scan.nextInt();

            if (accountType > 0 && accountType < 4) {
                System.out.println("\nWhat would you like to do?");
                System.out.println("1. Balance Enquiry\n2. Fund Transfer\n3. Cash Withdrawal\n4. Exit");
                int option = scan.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Your account balance is: " + deposit);
                        break;
                    case 2:
                        System.out.print("Enter the amount to transfer: ");
                        int transferAmount = scan.nextInt();
                        fundTransfer(transferAmount);
                        break;
                    case 3:
                        System.out.print("Enter the amount to withdraw: ");
                        int withdrawAmount = scan.nextInt();
                        cashWithdrawal(withdrawAmount);
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

                if (!exit) {
                    System.out.print("Do you want to perform another transaction? (yes/no): ");
                    String choice = scan.next();
                    if (choice.equalsIgnoreCase("no")) {
                        exit = true;
                    }
                }
            } else {
                System.out.println("Invalid account type. Please try again.");
            }
        }
    }

    static void fundTransfer(int amount) {
        if (deposit >= amount) {
            deposit -= amount;
            System.out.println("Fund transfer successful. Remaining balance: " + deposit);
        } else {
            System.out.println("Insufficient balance for fund transfer.");
        }
    }

    static void cashWithdrawal(int amount) {
        if (deposit >= amount) {
            deposit -= amount;
            System.out.println("Cash withdrawal successful. Remaining balance: " + deposit);
        } else {
            System.out.println("Insufficient balance for cash withdrawal.");
        }
    }

    static void terminateAccount() {
        System.out.println("Afzal's ATM\nWe are sorry, your account has been terminated.");
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String exitOption = "";

        while (!exitOption.equalsIgnoreCase("exit")) {
            
            atm();

            System.out.print("Enter 'exit' to exit or any other input to continue: ");
            exitOption = scan.next();
        }
    }
}
