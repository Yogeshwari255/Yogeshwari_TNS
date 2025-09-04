package model;


	public class Customer extends Person {



	    private int customerID;
	    private String name;
	    private String address;
	    private String contact;

	    
	    public Customer(int customerID, String name, String address, String contact) {
	    	super(name, address, contact);
	        this.customerID = customerID;
	        this.name = name;
	        this.address = address;
	        this.contact = contact;
	    }

	   
	    public int getCustomerID() {
	        return customerID;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public String getContact() {
	        return contact;
	    }

	    
	    public void setCustomerID(int customerID) {
	        this.customerID = customerID;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public void setContact(String contact) {
	        this.contact =contact;
	    }

	    @Override
	    public String toString() {
	        return "Customer ID: " + customerID + ", Name: " + name;
	    }
	}



