
import java.io.Serializable;

public class Address implements Serializable{
    public String city;
    public String state;
    public String country;
    public Integer pincode;

    public Address(String city, String state, String country, int pincode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
    
    
}