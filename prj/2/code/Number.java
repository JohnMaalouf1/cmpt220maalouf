package AddressBook;

class Number
{
  private String firstName;
  private String lastName;
  private long number;

  // Overloaded constructor
  public Number( String fName, String lName, long num )
  {
    firstName = fName;
    lastName = lName;
    number = num;
  }

  // methods
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return lastName;
  }

  public long getNumber()
  {
    return number;
  }

  public String export(){
    return getFirstName() + "\n" + getLastName() + "\n" + getNumber();
  }

  public String toString()
  {
    return "<html>"+"First Name: "+getFirstName()+"<br>"+"Last Name: "+getLastName()+"<br>"+"Number: "+getNumber()+"<html>";
  }
}
