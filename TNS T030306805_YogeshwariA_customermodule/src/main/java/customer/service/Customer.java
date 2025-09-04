package customer.service;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id") 
    private Integer CustomerId;
    private String name;
    private String email;
    private String phoneNumber;



    public Integer getId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    // Generate constructors
    public Customer() {
        super();
    }

    public Customer(String name, String email, String phoneNumber, int CustomerId) {
    	super();
    	this.CustomerId = CustomerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    

    // Generate toString()
    @Override
    public String toString() {
        return "Customer [CustomerId=" + CustomerId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }
}
