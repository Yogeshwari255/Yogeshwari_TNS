package model;


	public class Person {
		
	    protected String name;
	    protected String address;
	    protected String contact;

	    public Person(String name, String address, String contact) {
	        this.name = name;
	        this.address = address;
	        this.contact = contact;
	    }

	    public String getName() {
	    	return name; 
	    	}
	    public void setName(String name) { 
	    	this.name = name; 
	    	}

	    public String getAddress() {
	    	return address; }
	    public void setAddress(String address) {
	    	this.address = address;
	    	}

	    public String getContact() {
	    	return contact; 
	    	}
	    public void setContact(String contact) { 
	    	this.contact = contact; 
	    	}

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Address: " + address + ", Contact: " + contact;
	    }
	}






