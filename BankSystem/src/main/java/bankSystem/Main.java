package bankSystem;

import bankSystem.service.BankService;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        BankService bank = new BankService();
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. View Account");
            System.out.println("6. View Transactions");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            try 
            {
                switch (choice) 
                {
                    case 1:
                    {
                        System.out.print("Account ID: ");
                        String id = scanner.nextLine();

                        System.out.print("Holder Name: ");
                        String name = scanner.nextLine();

                        bank.createAccount(id, name);
                        System.out.println("Account created successfully.");
                    }
                    break;

                    case 2: 
                    {
                        System.out.print("Account ID: ");
                        String id = scanner.nextLine();

                        System.out.print("Amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        bank.deposit(id, amount);
                        System.out.println("Deposit successful.");
                    }
                    break;

                    case 3: 
                    {
                        System.out.print("Account ID: ");
                        String id = scanner.nextLine();

                        System.out.print("Amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        bank.withdraw(id, amount);
                        System.out.println("Withdrawal successful.");
                    }
                    break;

                    case 4:
                    {
                        System.out.print("From Account ID: ");
                        String from = scanner.nextLine();

                        System.out.print("To Account ID: ");
                        String to = scanner.nextLine();

                        System.out.print("Amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        bank.transfer(from, to, amount);
                        System.out.println("Transfer successful.");
                    }
                    break;

                    case 5:
                    {
                        System.out.print("Account ID: ");
                        String id = scanner.nextLine();

                        System.out.println(bank.getAccount(id));
                    }
                    break;

                    case 6:
                    {
                        System.out.print("Account ID: ");
                        String id = scanner.nextLine();

                        bank.getAccount(id)
                                .getTransactions()
                                .forEach(System.out::println);
                    }
                    break;

                    case 7:
                    {
                        System.out.println("Exiting system. Goodbye!");
                        scanner.close();
                        return;
                        
                    }

                    default: 
                    	System.out.println("Invalid option. Try again.");
                }

            } 
            catch (Exception e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
            
        }
        
    }
}
