package banking.service;


	

		import java.util.List;

		public interface BankingService {
		    
		    void addCustomer(String name, String address);
		    void createAccount(int customerId, String accountType, double initialDeposit);
		    void transfer(int fromAccountId, int toAccountId, double amount);
		    void addBeneficiary(int customerId, int beneficiaryAccountId);
		    //list the beneficiaries
		    List<Integer> getBeneficiaries(int customerId);

            // get the balance and transaction 
		    double getBalance(int accountId);
		    List<String> getTransactionHistory(int accountId);
		}
	


