import java.time.LocalDate;

public class Person{

private String firstName;
private String lastName;
private LocalDate dob;
private Address address;

public Person (String firstName, String lastNme, LocalDate dob){
this.firstName=firstName;
this.lastName=lastNme;
this.dob=dob;
}
public String getFirstName(){
    return firstName;
}
public void setFirstName(String firstName){
    this.firstName=firstName;
}
public String getLastName(){
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public LocalDate getDob() {
    return dob;
}
public void setDob(LocalDate dob) {
    this.dob = dob;
}
public Address getAddress() {
    return address;
}
public void setAddress(Address address) {
    this.address = address;
}
public void sayHello(){
    System.out.println("Hello");

}
public static void main(String[] args) {
    
}
}