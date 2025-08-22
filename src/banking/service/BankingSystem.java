package banking.service;



		import java.util.List;
		import java.util.Scanner;

		public class BankingSystem {
		    public static void main(String[] args) {
		        BankingService bank = new BankingServiceImpl();
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            System.out.println("\n======= Banking System Menu =======");
		            System.out.println("1. Add Customer");
		            System.out.println("2. Create Account");
		            System.out.println("3. Deposit Money");
		            System.out.println("4. Withdraw Money");
		            System.out.println("5. Transfer Money");
		            System.out.println("6. Add Beneficiary");
		            System.out.println("7. View Beneficiaries");
		            System.out.println("8. Check Balance");
		            System.out.println("9. View Transaction History");
		            System.out.println("0. Exit");
		            System.out.print(" Enter your choice: ");
		            int choice = sc.nextInt();

		            switch (choice) {
		                case 1: // Add Customer
		                    System.out.print("Enter Customer Name: ");
		                    sc.nextLine(); // consume newline
		                    String name = sc.nextLine();
		                    System.out.print("Enter Address: ");
		                    String address = sc.nextLine();
		                    bank.addCustomer(name, address);
		                    break;

		                case 2: // Create Account
		                    System.out.print("Enter Customer ID: ");
		                    int custId = sc.nextInt();
		                    System.out.print("Enter Account Type (Savings/Current): ");
		                    sc.nextLine(); // consume newline
		                    String type = sc.nextLine();
		                    System.out.print("Enter Initial Deposit: ");
		                    double deposit = sc.nextDouble();
		                    bank.createAccount(custId, type, deposit);
		                    break;


		                case 3: // Transfer
		                    System.out.print("Enter From Account ID: ");
		                    int from = sc.nextInt();
		                    System.out.print("Enter To Account ID: ");
		                    int to = sc.nextInt();
		                    System.out.print("Enter Amount to Transfer: ");
		                    double amtT = sc.nextDouble();
		                    bank.transfer(from, to, amtT);
		                    break;

		                case 4: // Add Beneficiary
		                    System.out.print("Enter Customer ID: ");
		                    int custB = sc.nextInt();
		                    System.out.print("Enter Beneficiary Account ID: ");
		                    int benAcc = sc.nextInt();
		                    bank.addBeneficiary(custB, benAcc);
		                    break;

		                case 5: // View Beneficiaries
		                    System.out.print("Enter Customer ID: ");
		                    int custV = sc.nextInt();
		                    List<Integer> benList = bank.getBeneficiaries(custV);
		                    System.out.println("Beneficiaries of Customer " + custV + ": " + benList);
		                    break;

		                case 6: // Check Balance
		                    System.out.print("Enter Account ID: ");
		                    int accIdB = sc.nextInt();
		                    System.out.println("Balance: " + bank.getBalance(accIdB));
		                    break;

		                case 7: // View Transaction History
		                    System.out.print("Enter Account ID: ");
		                    int accIdH = sc.nextInt();
		                    List<String> history = bank.getTransactionHistory(accIdH);
		                    System.out.println("Transaction History for Account " + accIdH + ":");
		                    for (String h : history) {
		                        System.out.println(" - " + h);
		                    }
		                    break;

		                case 8:
		                    System.out.println(" Exiting Banking System. Goodbye!");
		                    sc.close();
		                    return;

		                default:
		                    System.out.println(" Invalid choice! Please try again.");
		            }
		        }
		    }
		
	}


