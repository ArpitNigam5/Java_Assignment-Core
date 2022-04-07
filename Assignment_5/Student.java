 
import java.io.Serializable;

public class Student implements Serializable {
    public String FirstName;
    public String DateOfBirth;
    public Address address;

    Student(String Name, String DOB, String city, String state, String country, int pincode){
        this.FirstName = Name;
        this.DateOfBirth = DOB;

        address = new Address(city,state,country,pincode);
    }
}