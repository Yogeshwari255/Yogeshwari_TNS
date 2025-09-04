package model;

	public class Beneficiary  extends Person{
		
		
	    private int beneficiaryID;
	    private int customerID;
	    private String name;
	    private String accountNumber;
	    private String bankDetails;

	   
	    public Beneficiary(int beneficiaryID, int customerID, String name, String address,String contact, String accountNumber, String bankDetails) {
	    	super(name,address,contact);
	        this.beneficiaryID = beneficiaryID;
	        this.customerID = customerID;
	        this.name = name;
	        this.accountNumber = accountNumber;
	        this.bankDetails = bankDetails;
	    }

	    
	    public int getBeneficiaryID() { 
	    	return beneficiaryID; 
	    	}
	    public int getCustomerID() { 
	    	return customerID; 
	    	
	    }
	    public String getName() { 
	    	return name; }
	    public String getAccountNumber() { 
	    	return accountNumber; 
	    	
	    }
	    public String getBankDetails() { 
	    	return bankDetails;
	    	}

	    
	    public void setBeneficiaryID(int beneficiaryID) {
	    	this.beneficiaryID = beneficiaryID; 
	    	}
	    public void setCustomerID(int customerID) { 
	    	this.customerID = customerID; 
	    	}
	    public void setName(String name) { this.name = name; 
	    }
	    public void setAccountNumber(String accountNumber) {
	    	
	    	
	    	this.accountNumber = accountNumber;
	    	}
	    public void setBankDetails(String bankDetails) { this.bankDetails = bankDetails; }

	    @Override
	    public String toString() {
	        return "Beneficiary ID: " + beneficiaryID + ", Name: " + name +
	               ", Account No: " + accountNumber + ", Bank: " + bankDetails;
	    }
	}






