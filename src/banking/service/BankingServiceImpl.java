package banking.service;

import java.util.*;

public class BankingServiceImpl implements BankingService {

 private Map<Integer, String> customers = new HashMap<>();
 private Map<Integer, Double> accounts = new HashMap<>();
 private Map<Integer, List<String>> transactions = new HashMap<>();
 private Map<Integer, List<Integer>> beneficiaries = new HashMap<>();

 private int customerCounter = 2;
 private int accountCounter = 100;

 // Customer 
 @Override
 public void addCustomer(String name, String address) {
     customers.put(customerCounter, name + " | " + address);
     System.out.println(" Customer added: " + name + " (ID: " + customerCounter + ")");
     customerCounter++;
 }

 //  Account
 @Override
 public void createAccount(int customerId, String accountType, double initialDeposit) {
     if (customers.containsKey(customerId)) {
         System.out.println(" Customer not found");
         return;
     }
     accounts.put(accountCounter, initialDeposit);
     transactions.put(accountCounter, new ArrayList<>());
     transactions.get(accountCounter).add("Account created with deposit: " + initialDeposit);

     System.out.println("Type " + accountType + " Account created for Customer " + customerId 
                        + " (Account ID: " + accountCounter + ")");
     accountCounter++;
 }

 //  Transactions 
 
 

 @Override
 public void transfer(int fromAccountId, int toAccountId, double amount) {
     if (!accounts.containsKey(fromAccountId) || !accounts.containsKey(toAccountId)) {
         System.out.println(" One of the accounts not found!");
         return;
     }
     if (accounts.get(fromAccountId) < amount) {
         System.out.println(" Insufficient balance!");
         return;
     }

     accounts.put(fromAccountId, accounts.get(fromAccountId) - amount);
     accounts.put(toAccountId, accounts.get(toAccountId) + amount);

     transactions.get(fromAccountId).add("Transferred " + amount + " to Account " + toAccountId);
     transactions.get(toAccountId).add("Received " + amount + " from Account " + fromAccountId);

     System.out.println(" Transferred " + amount + " from " + fromAccountId + " → " + toAccountId);
 }

 // Beneficiaries
 @Override
 public void addBeneficiary(int customerId, int beneficiaryAccountId) {
     if (!customers.containsKey(customerId)) {
         System.out.println(" Customer not found!");
         return;
     }
     beneficiaries.putIfAbsent(customerId, new ArrayList<>());
     beneficiaries.get(customerId).add(beneficiaryAccountId);
     System.out.println(" Beneficiary (Account " + beneficiaryAccountId + ") added for Customer " + customerId);
 }

 @Override
 public List<Integer> getBeneficiaries(int customerId) {
     return beneficiaries.getOrDefault(customerId, new ArrayList<>());
 }

 // get the info
 @Override
 public double getBalance(int accountId) {
     return accounts.getOrDefault(accountId, 0.0);
 }

 @Override
 public List<String> getTransactionHistory(int accountId) {
     return transactions.getOrDefault(accountId, new ArrayList<>());
 }
}



	
	